package org.rookie.cheerole.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 12589
 */
@Mapper
@Repository
public interface GetStudent {
    /**
    * 用来查找是否存在该名学生
    * @param name User name
     * @return User
    * */
    @Select("select stuName from student where stuName=(#{name})")
    public boolean isSelected(String name);
    /**
     * 用来查找是否存在该名学生
     * @param id User id
     * @return User
     * */
    @Select("select stuId from student where stuId=(#{id})")
    public boolean isSelected02(@Param("id")String id);
}
