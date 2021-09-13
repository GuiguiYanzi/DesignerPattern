package facadePattern;

import model.UserInfo;
import model.VideoInfo;

import java.util.List;

public class SubSystemF {
    public SubSystemF(List<VideoInfo>list, List<UserInfo>ulist,List<String>clist) {
        System.out.println("---------------------------------------------------------------------------");
        int length=list.size();
        for(int i=0;i<length;i++)
        {
            System.out.println("视频信息:id:    "+list.get(i).getVideoId()+"权限等级index:"+list.get(i).getIndex()+"视频名称:"+list.get(i).getVideoName()
                    +"视频作者:"+list.get(i).getAuthor());
        }

        System.out.println("---------------------------------------------------------------------------");
        int ulength=ulist.size();
        for(int i=0;i<ulength;i++)
        {
            System.out.println("用户信息id:     "+ulist.get(i).getUserId()+"用户昵称:"+ulist.get(i).getUserName()+"用户电话:"+ulist.get(i).getPhone()
                    +"用户权限"+ulist.get(i).getMyIndex());
        }
        System.out.println("---------------------------------------------------------------------------");
        int clength=clist.size();
        for (int i = 0; i <clength ; i++) {
            System.out.println(clist.get(i));
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
