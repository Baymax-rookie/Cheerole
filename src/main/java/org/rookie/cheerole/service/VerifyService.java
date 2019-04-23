package org.rookie.cheerole.service;

import org.rookie.cheerole.mapper.UserMapper;
import org.rookie.cheerole.utils.MD5Util;
import org.springframework.stereotype.Service;

/**
 * @author 12589
 */
@Service
public class VerifyService {
    private UserMapper userMapper;
    public VerifyService(UserMapper userMapper){
        this.userMapper=userMapper;
    }
    public boolean verifyUser(String id,String password){
        String pwd=userMapper.isSelected(id);
        boolean bool=MD5Util.verify(password,pwd);
        return bool;
    }
}
