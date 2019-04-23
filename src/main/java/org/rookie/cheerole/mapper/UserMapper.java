package org.rookie.cheerole.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



/**
 * @author 12589
 */
@Mapper
public interface UserMapper {
    @Select("select password from user where id=#{id}")
    public String isSelected(String id);
    @Insert("Insert into user(id,name,password,vote) values (id=#{id},name=#{name},password=#{password},vote=#{vote})")
    public boolean isAddUser(@Param("name")String name,@Param("id")String id,@Param("password")String password,@Param("vote")int vote);

}
