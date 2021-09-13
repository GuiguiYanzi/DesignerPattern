package register;

public class website extends process {      //网站后台接受请求，当手机号为11位数时，方可递交到下一级

    @Override
    public void giveRequest(UserRequest userRequest) {
        int phoneSize=userRequest.getPhone().length();
        //手机号在6-11位即为合法手机号
        if(phoneSize>11||phoneSize<6)
        {
            System.out.println("手机号非法，用户注册失败！");
        }
        else
        {
            if(this.myProcess!=null)                    //若合法则递交到下一层进行审批处理
                this.myProcess.giveRequest(userRequest);
        }
    }
}
