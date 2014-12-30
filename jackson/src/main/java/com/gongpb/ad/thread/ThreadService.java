package com.gongpb.ad.thread;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.gongpb.ad.Run;
import com.gongpb.ad.fastjson.FastJsonUtil;
import com.gongpb.ad.vo.AdVo;

public class ThreadService implements Runnable {
	private static Logger logger = LoggerFactory.getLogger(ThreadService.class);
	private int requestNum = 0;
	private CyclicBarrier barrier;
	private int threadId;

	public ThreadService(CyclicBarrier barrier, int requestNum, int threadId) {
		this.requestNum = requestNum;
		this.barrier = barrier;
		this.threadId = threadId;
	}
	
	@Override
	public void run() {
		try {
			AdVo adVo = Run.adVo;
			List<AdVo> adVoList = Run.adVoList;
			for(int i=0; i<requestNum; i++){
				String json = "";
				//--------fastjson-----------
				json = JSON.toJSONString(adVoList, FastJsonUtil.features);
				
				//--------jsonlib-----------
//				json = JSONSerializer.toJSON(adVoList).toString();
				
				//--------jackson-----------
//				try {
//					json = JacksonMapperUtil.mapper.writeValueAsString(adVoList);
////	//			mapper.writeValueAsString(adVo);
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				
				//--------gson-----------
//				json = GsonUtil.gsonStrategy.toJson(adVoList);
				
//				System.out.println(json);
				
//				FileWriter writer;
//		        try {
//		            writer = new FileWriter("D:\\1.txt");
//		            writer.write(json);
//		            writer.flush();
//		            writer.close();
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }

				
			}
			
//			System.out.println("threadID:" + threadId);
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
