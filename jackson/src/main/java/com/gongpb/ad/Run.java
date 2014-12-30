package com.gongpb.ad;


import java.util.ArrayList;
import java.util.List;

import com.gongpb.ad.thread.MultiThreadManager;
import com.gongpb.ad.vo.AdVo;
import com.gongpb.ad.vo.JsVo;
import com.gongpb.jackson.util.JacksonMapper;

public class Run {
	public static AdVo adVo = null;
	public static List<AdVo> adVoList = new ArrayList<AdVo>();
	public static void main(String[] args) {
		String adJson = "{\"P\":7,\"SKIP\":1,\"VAL\":[{\"RS\":\"http://k.youku.com/player/getFlvPath/sid/141922653113011309333_00/st/flv/fileid/03000201005484534306C9003E880304A6A5F0-8804-5470-CA36-2221CAE73332?K=ac47b3f6b802f6b9261e13cb&hd=0&myp=0&ts=352&ypp=0&ctype=10&ev=1&token=9198&oip=2130706433&ep=5SCpIaV9KdcVaevBVbPY1oEZUIJtKqb5fYtG%2FBqhymilz27ii3cFQOXiPidqP0elWgkKPwJ1fU5rqOBuDf01ztijQ%2B%2FGxwDBrRTRRnkrckYZHrBlik1mjwFO6lMfD2piTywq308R7MOC9U%3D\",\"VQT\":\"flv\",\"VID\":\"210943878\",\"RST\":\"video\",\"AT\":70,\"SU\":[],\"SUS\":[{\"U\":\"http://val.atm.youku.com/show?v=137006183&pp=7&ct=d&cs=1003&ca=557067&ie=525254&uid=1234567&ck=1417766995429x9J&al=30&bl=1&s=&td=&st=1&vl=1200.0&ap=2&sid=1&cr=0&tvb=0&pr=37&oidtype=65276%7C0&dq=flv%7Cflv&uri=-1&dc=392466&ext=&pc=0&dspid=0&hyid=&ps=0&ca0=557067&mb=1&os=0&dt=1&aw=a&avs=&vc=0&idfa=&ouid=&mac=&im=&aid=&guid=\",\"SDK\":\"0\"},{\"U\":\"http://yktd.m.cn.miaozhen.com/x.gif?k=2001670&p=6rC9m&rt=2&ns=211.157.171.226&ni=[M_IESID]&v=[M_LOC]&o=\",\"SDK\":\"0\"}],\"SUE\":[{\"U\":\"http://val.atm.youku.com/over?v=137006183&pp=7&ct=d&cs=1003&ca=557067&ie=525254&uid=1234567&ck=1417766995429x9J&al=30&bl=1&s=&td=&st=1&vl=1200.0&ap=2&sid=1&cr=0&tvb=0&pr=37&oidtype=65276%7C0&dq=flv%7Cflv&uri=-1&dc=392466&ext=&pc=0&dspid=0&hyid=&ps=0&ca0=557067&mb=1&os=0&dt=1&aw=a&avs=&vc=0&idfa=&ouid=&mac=&im=&aid=&guid=\",\"SDK\":\"0\"}],\"CU\":\"http://val.atm.youku.com/click?v=137006183&pp=7&ct=d&cs=1003&ca=557067&ie=525254&uid=1234567&ck=1417766995429x9J&al=30&bl=1&s=&td=&st=1&vl=1200.0&ap=2&sid=1&cr=0&tvb=0&pr=37&oidtype=65276%7C0&dq=flv%7Cflv&uri=-1&dc=392466&ext=&pc=0&dspid=0&hyid=&ps=0&ca0=557067&mb=1&os=0&dt=1&aw=a&avs=&vc=0&idfa=&ouid=&mac=&im=&aid=&guid=&u=http://yktd.m.cn.miaozhen.com/r.gifinterrogation_esckequal_esc2001670and_escpequal_esc6rC9mand_escrtequal_esc2and_escnsequal_esc[M_ADIP]and_escniequal_esc[M_IESID]and_escvequal_esc[M_LOC]and_escoequal_eschttp://sale.jd.com/act/z4htnKg2dWkG.html&md5=bd76325ab5298472d515298b03b7d00f\",\"CUF\":1,\"AL\":30,\"SDKID\":0,\"BRS\":\"\"}]}";
//		adVo = getAdVoData();
		adVo = JacksonMapper.convertJson2Object(adJson, AdVo.class);
		adVoList.add(adVo);
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		
		
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		
		
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		adVoList.add(JacksonMapper.convertJson2Object(adJson, AdVo.class));
		
		MultiThreadManager mutiltThread = new MultiThreadManager();
		mutiltThread.start(1, 10000);
	}
	
	private static AdVo getAdVoData(){
		adVo = new AdVo();
		adVo.setP(1);
		adVo.setPs(2);
		adVo.setSkip(3);
		List<JsVo> jsList = new ArrayList<JsVo>();
		JsVo jsVo = new JsVo();
		jsVo.setAl(100);
		jsVo.setAt(1);
		jsVo.setCu("http://www.youku.com");
		jsVo.setJs("http://www.youku.com");
		jsVo.setRs("http://www.youku.com");
		jsVo.setRst("http://www.youku.com");
		
		JsVo jsVo2 = new JsVo();
		jsVo2.setAl(100);
		jsVo2.setAt(1);
		jsVo2.setCu("http://www.youku.com");
		jsVo2.setJs("http://www.youku.com");
		jsVo2.setRs("http://www.youku.com");
		jsVo2.setRst("http://www.youku.com");
		
		jsList.add(jsVo);
		jsList.add(jsVo2);
		adVo.setJs(jsList);
		return adVo;
	}
}