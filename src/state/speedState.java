package state;

import static java.lang.Thread.sleep;

public class speedState extends VideoState{
    @Override
    public void play() {

    }

    @Override
    public void speed(double speeds) {
        System.out.println("视频以"+speeds+"倍速进行播放");
        double newSpeed=1000/speeds;
        int i=1;
        while (true){
            try {
                System.out.print("*");
                sleep((long)newSpeed);
                i++;
                if(i>20)
                {
                    System.out.println("视频播放完毕,共耗时:"+(20/speeds)+"秒");
                    return;
                }
            }catch (Exception e)
            {
                System.out.println(e.getClass().getName()+":"+e.getMessage());
            }
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
