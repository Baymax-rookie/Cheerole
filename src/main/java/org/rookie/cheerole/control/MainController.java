package org.rookie.cheerole.control;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.rookie.cheerole.config.Enums;
import org.rookie.cheerole.entity.College;
import org.rookie.cheerole.entity.User;
import org.rookie.cheerole.exception.AutoException;
import org.rookie.cheerole.service.ListService;
import org.rookie.cheerole.service.RegisterService;
import org.rookie.cheerole.service.VerifyService;
import org.rookie.cheerole.service.VoteService;
import org.rookie.cheerole.utils.ResultUtil;
import org.rookie.cheerole.utils.TestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author 12589
 */
@RestController
public class MainController {
    /**
     * 不知道为什么规范格式一定要这样
     */
    private final VoteService voteService;
    private final RegisterService registerService;
    private final VerifyService verifyService;
    private final ListService listService;
    @Autowired
    public MainController(VoteService voteService, RegisterService registerService, VerifyService verifyService, ListService listService) {
        this.voteService = voteService;
        this.registerService = registerService;
        this.verifyService = verifyService;
        this.listService = listService;
    }

    @RequestMapping(value = "hello" ,method = RequestMethod.GET)
    public String test1(){
        return "nihao";
    }

    @RequestMapping(value = "collegeList",method = RequestMethod.GET,produces = "application/json")
    public JSONArray college(){
        ArrayList<College>list=listService.getCollege();
        return (JSONArray) JSON.toJSON(list);
    }

    @RequestMapping(value = "login",produces = "application/json")
    public JSONObject check(String id,String name){
        boolean is=verifyService.verifyUser(id,name);
        if (is){
            ResultUtil.succeed("登入成功");
        }else {
            ResultUtil.failed(Enums.LOGIN_ERROR);
        }
        return null;
    }

    @RequestMapping(value = "vote",method = RequestMethod.GET,produces = "application/json")
    public JSONObject vote(String collegeName,String username) throws AutoException {
        boolean is=voteService.voteFor(collegeName,username);
        if (is){
            return ResultUtil.succeed(Enums.OK);
        }else {
            return ResultUtil.failed();
        }
    }

    @RequestMapping(value = "registe",method = RequestMethod.GET,produces = "application/json")
    public JSONObject isAdd(String id,String name,String password){
        User user=new User(id,name,password);
        boolean is=registerService.addUser(id,name,password);
        if (is){
            return ResultUtil.added(user);
        }else {
            return ResultUtil.lost(user);
        }
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String signature=request.getParameter("signature");
        String timestamp=request.getParameter("timestamp");
        String nonce=request.getParameter("nonce");
        String echostr=request.getParameter("echostr");
        PrintWriter out=response.getWriter();
        if (TestUtil.checkTest(signature,timestamp,nonce)){
            out.print(echostr);
            out.flush();
            out.close();
        }else {
            System.out.println("接入失败");
        }
    }
}
