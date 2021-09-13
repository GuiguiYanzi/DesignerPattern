package register;

public class UserRequest {  //用户请求类,一开始并不需要用到UserInfo类封装信息，当请求审批完成后将用户信息注册到链表中即可（最终处理类中）
    int userId;
    String userName;
    String phone;
    int myIndex;

    public UserRequest(int userId, String userName, String phone, int myIndex) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.myIndex = myIndex;
    }
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public int getMyIndex() {
        return myIndex;
    }
}
