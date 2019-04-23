package org.rookie.cheerole.service;

import org.rookie.cheerole.mapper.GetStudent;
import org.rookie.cheerole.mapper.UserMapper;
import org.rookie.cheerole.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 12589
 */
@Service
public class RegisterService {
    private UserMapper userMapper;
    private GetStudent getStudent;
    @Autowired
    public RegisterService(UserMapper userMapper, GetStudent getStudent){
        this.userMapper = userMapper;
        this.getStudent=getStudent;
    }

    public boolean addUser(String id,String name,String password){
        if (getStudent.isSelected(name)||getStudent.isSelected02(id)){
            String salt=MD5Util.md5Hex(password);
            userMapper.isAddUser(name,id,salt,100);
            return true;
        }
        return  false;
    }
}
