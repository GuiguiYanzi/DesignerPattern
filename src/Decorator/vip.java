package Decorator;

import model.UserInfo;

public class vip extends update {
    public vip(UserInfo userInfo) {
        super(userInfo);
        System.out.println("通过答题变成vip用户");
    }
    //返回一个整数作为新的等级
    public int setLevel(UserInfo userInfo){
        int newIndex=userInfo.getMyIndex()+1;
        return newIndex;
    }
}
