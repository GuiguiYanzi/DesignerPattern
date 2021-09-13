package register;

public abstract class process {      //抽象处理类
    public process myProcess;
    public void setMyProcess(process myProcess){
        this.myProcess=myProcess;
    }
    public abstract void giveRequest(UserRequest userRequest);
}
