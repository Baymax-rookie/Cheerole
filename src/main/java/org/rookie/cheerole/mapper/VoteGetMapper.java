package org.rookie.cheerole.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author 12589
 */
@Mapper
@Repository
public interface VoteGetMapper {
    /**
     * 查找是否增加票数
    * @param collegeName college name
     * @return true or false
    */
    @Insert("insert into college() set vote=vote+1 where name=#{collegeName}")
    boolean isAdded(String collegeName);
    /**
     * 查找是否减少票数
     * @param name User name
     * @return User name
     * */
    @Insert("insert into student set vote=vote-1 where stuName={name}")
    boolean isDecreased(String name);
}
