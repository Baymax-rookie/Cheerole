# Cheerole
## 接口 ##
 ### 登录接口 ###  
   + 接口地址：http://localhost:8080/login
   + 请求方式：GET
   + 参数
   
| username | 用户名 |
| -------- | ------ |
| password | 密码   |
  

   + 成功  
   ```json
   {
      "msg":"成功",
      "code":100,
      "data":"登入成功"
   }
   
   ```
   + 失败
   ```json
   {
      "msg":"登陆错误",
      "code":201,
      "data":"LOGIN_ERROR"
   }
   
   ```
   
### 学院介绍 ###
+ 接口地址：http://localhost:8080/collegeList
+ 请求方式：POST
+ 参数    无参
+ 返回数据
```json
    [
    {
        "intro": "发色种类与学院人数相差无几",
        "name": "传媒学院",
        "vote": 0
    },
    {
        "intro": "I am fine,and you?",
        "name": "外国语学院",
        "vote": 0
    },
    { 
        "intro": "人少但是问题不大",
        "name": "理学院",
        "vote": 0
    },
    {
        "intro": "计算机，小喇叭，吵你吵地笑哈哈",
        "name": "计算机学院",
        "vote": 0
    },
    {
        "intro": "人美歌甜，虽然是男生",
        "name": "软件工程学院",
        "vote": 0
    }
    ]
    
```
###投票接口
+ 接口地址：http://localhost:8080/vote
+ 请求方式：GET
+ 参数

| collegeName | 学院名 |
| ----------- | ----- |
| username    | 用户名 |
    
+ 成功
```json
{
   "msg":"成功",
   "code":100,
   "data":"OK"
}
```
+ 失败
```json
{
   "msg":"投票失败",
   "code":"ERROR",
   "data":"OK"
}

```
   ##### 后面不写了，加盐算法有问题，首先是不太会，然后又很懒，然后数据库那边漏洞百出，在postman里面测试，数据库改了却返回不了json,bug找了很久找不到放弃了。。   
       
       
       
       
    
   
   
   
   
