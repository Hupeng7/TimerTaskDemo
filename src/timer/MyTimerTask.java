package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private String name;

    public MyTimerTask(String inputName) {
        name = inputName;
    }

    @Override
    public void run() {
        //打印当前name的内容
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-HH-dd hh:mm:sss");
        String timeString = simpleDateFormat.format(date.getTime());
        System.out.println("Current format time is:" + timeString);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
