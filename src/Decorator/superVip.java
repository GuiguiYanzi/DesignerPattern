package Decorator;

import model.UserInfo;

public class superVip extends update {
    public superVip(UserInfo userInfo) {
        super(userInfo);
        System.out.println("通过充值成为超级vip会员");
    }
    public int setLevel(UserInfo userInfo){
        int newIndex=userInfo.getMyIndex()+2;
        return newIndex;
    }
}
