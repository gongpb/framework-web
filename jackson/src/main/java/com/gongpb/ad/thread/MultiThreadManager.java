package com.gongpb.ad.thread;

import java.util.concurrent.CyclicBarrier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 启动用多个线程，测试thrift性能
 * @author gongpb
 */
public class MultiThreadManager {
	private static Logger logger = LoggerFactory.getLogger(MultiThreadManager.class);
	private Long start;
	private Long end;
	
	private class MultiThread {
		private int threadNum;
		private int requestNum;
		private CyclicBarrier barrier;
		public MultiThread(int threadNum, int requestNum){
			this.threadNum  = threadNum;
			this.requestNum = requestNum; 
		}
		
		public void startThread() {
			barrier = new CyclicBarrier(threadNum, new Runnable() {
				public void run() {
					end = System.currentTimeMillis();
					System.out.println("共耗时："+(end-start) +" ms");
				}
			});
			
			for (int i = 0; i < threadNum; i++) {
				Thread thread = new Thread(new ThreadService(barrier, requestNum, i));
				thread.setName("thread----"+i);
				thread.start();
			}
		}
	}
	/**
	 * @param threadNum线程数
	 * @param requestNum 每个线程请求数量
	 */
	public void start(int threadNum, int requestNum) {
		start = System.currentTimeMillis();
		System.out.println("server is running...");
		new MultiThread(threadNum, requestNum).startThread();
	}

}