package org.rookie.cheerole.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.rookie.cheerole.config.Enums;
import org.rookie.cheerole.entity.User;
import sun.plugin.javascript.navig.JSObjectFactory;

/**
 * @author 12589
 */
public class ResultUtil {
    private static JSONObject json;

    public static JSONObject added(User user){
        return (JSONObject) JSON.toJSON(user);
    }

    public static JSONObject succeed(Object ob){
        json.put("code", Enums.OK.getCode());
        json.put("msg",Enums.OK.getMsg());
        json.put("data",ob);
        return json;
    }

    public static  JSONObject failed(Object ob){
        json.put("code",Enums.LOGIN_ERROR.getCode());
        json.put("msg",Enums.LOGIN_ERROR.getMsg());
        json.put("data",ob);
        return json;
    }
    public static JSONObject lost(Object ob){
        json.put("code",Enums.REGISTE_ERROR.getCode());
        json.put("msg",Enums.REGISTE_ERROR.getMsg());
        json.put("data",ob);
        return json;
    }
    public static JSONObject failed(){
        json.put("code",null);
        json.put("msg",null);
        return json;
    }

}
