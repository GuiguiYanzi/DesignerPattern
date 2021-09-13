package Decorator;

import model.UserInfo;

/**
 * 抽象装饰类：升级
 * 用户等级分为普通用户、vip用户和超级vip用户，用户注册时等级默认为0
 * 用户可以通过答题来升级为vip用户，或者通过充值成为超级vip用户
 * 不同等级的用户可以看不同等级的视频
 */
public class update {
    public UserInfo userInfo;
    public update(UserInfo userInfo){
        this.userInfo=userInfo;
    }
}
