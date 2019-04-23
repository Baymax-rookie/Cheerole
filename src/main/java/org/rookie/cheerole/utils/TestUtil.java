package org.rookie.cheerole.utils;


import org.apache.ibatis.reflection.ArrayUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @author 12589
 */
public class TestUtil {
    public static Boolean checkTest(String signature,String timestamp,String nonce) {
        StringBuilder sb = new StringBuilder();
        String[] arry = null;
        String token = "weixin";
        if (timestamp == null) {
            arry = new String[]{token, nonce};
        } else {
            arry = new String[]{token, timestamp, nonce};
        }
        Arrays.sort(arry);
        for (int i = 0; i < arry.length; i++) {
            sb.append(i);
        }
        String mysig = sha1(sb.toString());
        return mysig!=null&&mysig.equals(signature.toUpperCase());
    }

    private static String sha1(String src){
        try {
            MessageDigest md=MessageDigest.getInstance("sha1");
            byte[] digest=md.digest(src.getBytes());

            String s=ArrayUtil.toString(digest);

            return s;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
