package com.gongpb.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class JsVo {
	private String rs;
	private String rst;
	private int at;
	private List<SuVo> su = new ArrayList<SuVo>();
	private List<SusVo> sus = new ArrayList<SusVo>();
	private List<SueVo> sue = new ArrayList<SueVo>();
	private List<CumVo> cum = new ArrayList<CumVo>();
	private String cu;
	private int al;
	private String js;
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public String getRst() {
		return rst;
	}
	public void setRst(String rst) {
		this.rst = rst;
	}
	public int getAt() {
		return at;
	}
	public void setAt(int at) {
		this.at = at;
	}
	public List<SuVo> getSu() {
		return su;
	}
	public void setSu(List<SuVo> su) {
		this.su = su;
	}
	public List<SusVo> getSus() {
		return sus;
	}
	public void setSus(List<SusVo> sus) {
		this.sus = sus;
	}
	public List<SueVo> getSue() {
		return sue;
	}
	public void setSue(List<SueVo> sue) {
		this.sue = sue;
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
	public int getAl() {
		return al;
	}
	public void setAl(int al) {
		this.al = al;
	}
	public String getJs() {
		return js;
	}
	public void setJs(String js) {
		this.js = js;
	}
	
}
