package com.gongpb.ad.vo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonFilter;
//@JsonFilter("AdVoFilter")
public class AdVo {
	@JsonProperty("SKIP")
	private int skip;
	@JsonProperty("N")
	private String n;
	@JsonProperty("T")
	private String t;
	@JsonProperty("M")
	private String m;
	@JsonProperty("P")
	private int p;
	@JsonProperty("JS")
	private List<JsVo> js = new ArrayList<JsVo>();
	@JsonProperty("VAL")
	private List<ValVo> val = new ArrayList<ValVo>();
	@JsonProperty("HTML")
	private List<HtmlVo> html = new ArrayList<HtmlVo>();
	@JsonProperty("SEED")
	private List<SeedVo> seed = new ArrayList<SeedVo>();
	@JsonProperty("ATS")
	private List ats;
	@JsonProperty("PS")
	private int ps; 
	@JsonProperty("RALL")
	private String rall;


	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public List<JsVo> getJs() {
		return js;
	}
	public void setJs(List<JsVo> js) {
		this.js = js;
	}
	public List<ValVo> getVal() {
		return val;
	}
	public void setVal(List<ValVo> val) {
		this.val = val;
	}
	public List<HtmlVo> getHtml() {
		return html;
	}
	public void setHtml(List<HtmlVo> html) {
		this.html = html;
	}
	public List<SeedVo> getSeed() {
		return seed;
	}
	public void setSeed(List<SeedVo> seed) {
		this.seed = seed;
	}
	public List getAts() {
		return ats;
	}
	public void setAts(List ats) {
		this.ats = ats;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getRall() {
		return rall;
	}
	public void setRall(String rall) {
		this.rall = rall;
	}
}
