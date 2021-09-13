package register;

public class server extends process {    //服务器类，判断用户id是否已经被注册,成功则设置结果值，通过另一个函数进行返回
    String result;
    @Override
    public void giveRequest(UserRequest userRequest) {
        //判断id是否被使用
        int id=userRequest.getUserId();
        boolean used=false;                     //id是否已经使用的标识符
        int[] usedId={1000,1001,1002,1003,1100,1200};
        for(int num:usedId)
        {
            if(num==id)
                used=true;
        }
        if(used) {result="失败"; System.out.println("用户id重复，注册失败");}
        //判断用户的注册权限，若不为0则需要设置为0，直接放到链表中进行操作，一律设置为0
        else
        {
            System.out.println("用户注册成功！正在注册生成");
            result="用户注册成功";
        }
    }

    public String getResult() {
        return result;
    }
}
