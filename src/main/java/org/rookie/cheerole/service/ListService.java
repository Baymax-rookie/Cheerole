package org.rookie.cheerole.service;

import org.rookie.cheerole.entity.College;
import org.rookie.cheerole.mapper.GetCollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author 12589
 */
@Service
public class ListService {
     private GetCollegeMapper getCollegeMapper;
    @Autowired
    public ListService(GetCollegeMapper getCollegeMapper){
        this.getCollegeMapper=getCollegeMapper;
    }
    public ArrayList<College>getCollege(){
      ArrayList<College>colleges =new ArrayList<>();
     colleges=getCollegeMapper.getAllCollege();
      return colleges;
    }
}
