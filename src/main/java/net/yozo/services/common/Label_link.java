package net.yozo.services.common;import net.yozo.core.dao.QueryModel;import java.io.Serializable;/** * 属性产品中间类 * @author Administrator * */public class Label_link extends QueryModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private int lId;	private int tId;	private String value;//此值用于该属性为参数的情况	public void clear() {		super.clear();		id = null;		lId = 0;		tId = 0;		value = null;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public int getlId() {		return lId;	}	public void setlId(int lId) {		this.lId = lId;	}	public int gettId() {		return tId;	}	public void settId(int tId) {		this.tId = tId;	}	public String getValue() {		return value;	}	public void setValue(String value) {		this.value = value;	}}