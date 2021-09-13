package register;

public class approver extends process {

    @Override
    public void giveRequest(UserRequest userRequest) {
        String name=userRequest.getUserName();  //用户昵称
        byte[] buff=name.getBytes();
        int length=buff.length;
        if(length<=0||length>=16)
        {
            System.out.println("用户注册失败,因为请保证您输入的字符字节大小在1-16之间");
        }
        else if(name.contains("敏感词汇"))
        {
            System.out.println("注册失败，您的名字包含敏感词汇");
        }
        else
        {           //昵称符合，递交最终级服务器判断
            if(this.myProcess!=null)
            this.myProcess.giveRequest(userRequest);
        }
    }
}
