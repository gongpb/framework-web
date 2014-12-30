package com.gongpb.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class HtmlVo {
	private String rs;
	private String tx;
	private int at;
	private int pid;
	private List<SusVo> sus = new ArrayList<SusVo>();
	private List<CumVo> cum = new ArrayList<CumVo>();
	private String cu;
	private int cuf;
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public String getTx() {
		return tx;
	}
	public void setTx(String tx) {
		this.tx = tx;
	}
	public int getAt() {
		return at;
	}
	public void setAt(int at) {
		this.at = at;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<SusVo> getSus() {
		return sus;
	}
	public void setSus(List<SusVo> sus) {
		this.sus = sus;
	}
	public List<CumVo> getCum() {
		return cum;
	}
	public void setCum(List<CumVo> cum) {
		this.cum = cum;
	}
	public String getCu() {
		return cu;
	}
	public void setCu(String cu) {
		this.cu = cu;
	}
	public int getCuf() {
		return cuf;
	}
	public void setCuf(int cuf) {
		this.cuf = cuf;
	}

}
