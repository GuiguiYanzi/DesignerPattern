package model;

public class UserInfo {
    int userId;
    String userName;
    int MyIndex;        //用户等级
    String phone;

    public UserInfo(int userId, String userName, String phone,int myIndex) {
        this.userId = userId;
        this.userName = userName;
        this.phone=phone;
        MyIndex = myIndex;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getMyIndex() {
        return MyIndex;
    }

    public String getPhone() {
        return phone;
    }
    public void setMyIndex(int index){
        MyIndex=index;
    }
}
