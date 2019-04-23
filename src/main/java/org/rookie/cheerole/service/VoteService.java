package org.rookie.cheerole.service;

import org.rookie.cheerole.config.Enums;
import org.rookie.cheerole.entity.College;
import org.rookie.cheerole.entity.User;
import org.rookie.cheerole.exception.AutoException;
import org.rookie.cheerole.mapper.VoteGetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 12589
 */
@Service
public class VoteService {
    private VoteGetMapper voteGetMapper;
    @Autowired
   public VoteService(VoteGetMapper voteGetMapper){
        this.voteGetMapper=voteGetMapper;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean voteFor(String collegeName, String username) throws AutoException {
        Boolean a=voteGetMapper.isAdded(collegeName);
        Boolean b=voteGetMapper.isDecreased(username);
        if (a.equals(false)&&b.equals(false)){
            throw  new AutoException(Enums.OK);
        }
        return true;
    }
}
