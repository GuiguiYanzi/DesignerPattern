package state;

public class stopState extends VideoState{
    @Override
    public void play() {

    }

    @Override
    public void speed(double speed) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {
        System.out.println("视频停止播放...");
        return;
    }
}
