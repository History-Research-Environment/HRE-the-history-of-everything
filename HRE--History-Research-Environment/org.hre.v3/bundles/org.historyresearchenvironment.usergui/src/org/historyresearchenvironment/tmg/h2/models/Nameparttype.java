package org.historyresearchenvironment.tmg.h2.models;

/**
 * The persistent class for the NAMEPARTTYPE database table.
 *
 * INSERT INTO NAMEPARTTYPE (ID, VALUE, SYSTEM, TYPE, SHORTVALUE, TT, DSID,
 * TEMPLATE ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, )
 */
public class Nameparttype {

	private int id;

	private int dsid;

	private String shortvalue;

	private String system;

	private String template;

	private String tt;

	private int type;

	private String xvalue;

	public Nameparttype() {
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getId() {
		return this.id;
	}

	public String getShortvalue() {
		return this.shortvalue;
	}

	public String getSystem() {
		return this.system;
	}

	public String getTemplate() {
		return this.template;
	}

	public String getTt() {
		return this.tt;
	}

	public int getType() {
		return this.type;
	}

	public String getXvalue() {
		return this.xvalue;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setShortvalue(String shortvalue) {
		this.shortvalue = shortvalue;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setXvalue(String xvalue) {
		this.xvalue = xvalue;
	}

}