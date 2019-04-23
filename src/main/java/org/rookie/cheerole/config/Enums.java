package org.rookie.cheerole.config;

import lombok.Data;

/**
 * @author 12589
 */
/**
*我要这注解有何用，从来没有成功给我成功设置好getter和setter过
*/
public enum Enums {
    /*
    *比较泛化地归到一类，反正是依葫芦画瓢
    * */
    OK(100,"成功"),
    LOGIN_ERROR(201,"登陆错误"),
    REGISTE_ERROR(202,"注册错误"),
    VOTE_ERROR(203,"投票错误");

    private int code;
    private String msg;
    Enums(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
