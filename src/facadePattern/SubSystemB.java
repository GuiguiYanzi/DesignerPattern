package facadePattern;

import model.UserInfo;
import register.*;

import java.util.List;
import java.util.Scanner;

public class SubSystemB {
    Scanner scanner=new Scanner(System.in);
    public SubSystemB(List<UserInfo> ulist) {
        System.out.println("注册开始，请输入您的用户id,用户名，手机号，用户权限(0)");
        System.out.println("tips:用户id不能重复，用户名需是16个以下英文字母或者8个以下中文字符，电话号码在6-11位，权限无论如何默认为0");
        System.out.println("已使用的id为1000，1001，1002，1003，1100，1200");
        int userId=scanner.nextInt();
        String userName=scanner.next();
        String phone=scanner.next();
        int myIndex=scanner.nextInt();

        System.out.println("-----------------------------------------------------------");
        //多态实现
        process objWebsite,objApprover,objServer;
        objWebsite=new website();
        objApprover=new approver();
        objServer=new server();
        //设置职责链
        objWebsite.setMyProcess(objApprover);
        objApprover.setMyProcess(objServer);
        //处理请求
        UserRequest request=new UserRequest(userId,userName,phone,myIndex);
        objWebsite.giveRequest(request);
        System.out.println("------------------------------------------------------------");
        try {
            server newserver=(server)objServer; //向下转型，得到结果
            if(newserver.getResult().equals("用户注册成功"))
            {
                UserInfo userInfo=new UserInfo(request.getUserId(),request.getUserName(),request.getPhone(),0);
                ulist.add(userInfo);
            }
        }catch (Exception e)
        {
            System.out.println("注册失败");
        }
    }
}
