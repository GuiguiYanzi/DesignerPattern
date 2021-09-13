package reprint;

import model.VideoInfo;

//具体原型类，拷贝视频对象作为转载视频
public class cloneVideo implements Cloneable {
    VideoInfo videoInfo;
    //浅克隆拷贝对象
    public void setInfo(VideoInfo videoInfo){
        this.videoInfo=videoInfo;
    }

    public VideoInfo clone()throws CloneNotSupportedException{
        try {
            cloneVideo clonevideo=(cloneVideo)super.clone();
            return videoInfo;
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
