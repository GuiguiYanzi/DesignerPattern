package state;

import static java.lang.Thread.sleep;

public class playState extends VideoState{
    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
        int i=1;    //计数器，不能永远在循环中，假设所有视频时长为20s
        while (true){
            try {
                System.out.print("*");
                sleep(1000L);
                i++;
                if(i>20)
                {
                    System.out.println("视频播放完毕!共耗时："+(i-1)+"秒");
                    return;
                }
            }catch (Exception e)
            {
                System.out.println(e.getClass().getName()+":"+e.getMessage());
            }
        }
    }
    //下面的都是空方法
    @Override
    public void speed(double speed) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
