package org.rookie.cheerole.exception;

import org.rookie.cheerole.config.Enums;
import org.slf4j.LoggerFactory;

/**
 * @author 12589
 */
public class AutoException extends  Exception {
    private int code;

    public AutoException(Enums enums){
        super(enums.getMsg());
        this.code=enums.getCode();
    }

    public AutoException(Enums enums,Class<?> clazz){
        super(enums.getMsg());
        this.code=enums.getCode();
        LoggerFactory.getLogger(clazz).error(enums.getMsg());
    }

    public AutoException(Enums enums,Class<?> clazz,Exception e){
        super(enums.getMsg());
        this.code=enums.getCode();
        LoggerFactory.getLogger(clazz).error(e.getMessage());
    }

    public AutoException(Enums enums,Class<?> clazz,String msg){
        super(enums.getMsg());
        this.code=enums.getCode();
        LoggerFactory.getLogger(clazz).error(msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
