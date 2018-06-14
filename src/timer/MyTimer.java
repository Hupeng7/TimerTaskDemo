package timer;

import java.util.Timer;

public class MyTimer {
	public static void main(String[] args) {
		//1.创建一个timer实例
		Timer timer = new Timer();
		
		//2.创建一个MyTimerTask实例
		MyTimerTask myTimerTask = new MyTimerTask("NO.1");
		
		//3.通过timer定时定频率调用myTimerTask的业务逻辑
		//即第一次执行是在当前时间的两秒后 之后每隔一秒钟执行一次
		timer.schedule(myTimerTask, 2000L, 2000L);
	}

}
