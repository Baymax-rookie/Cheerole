package org.rookie.cheerole.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.rookie.cheerole.entity.College;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author 12589
 */
@Mapper
@Repository
public interface GetCollegeMapper {
    @Select("select name,vote,intro from college")
    public ArrayList<College> getAllCollege();
}
