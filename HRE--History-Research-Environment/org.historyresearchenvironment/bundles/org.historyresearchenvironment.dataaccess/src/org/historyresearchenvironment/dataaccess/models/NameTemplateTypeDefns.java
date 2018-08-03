package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the NAME_TEMPLATE_TYPE_DEFNS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class NameTemplateTypeDefns extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_PID, " + "COMMIT_PID, "
			+ "NAME_TEMPLATE_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "ENTITY_TYPE_KEY, " + "ENTITY_SUB_TYPE_KEY, "
			+ "SORTING_ONLY, " + "IS_MANDATORY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW FROM PUBLIC.NAME_TEMPLATE_TYPE_DEFNS WHERE NAME_TEMPLATE_TYPE_DEFN_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_PID, " + "COMMIT_PID, "
			+ "NAME_TEMPLATE_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "ENTITY_TYPE_KEY, " + "ENTITY_SUB_TYPE_KEY, "
			+ "SORTING_ONLY, " + "IS_MANDATORY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW FROM PUBLIC.NAME_TEMPLATE_TYPE_DEFNS";

	private static final String INSERT = "INSERT INTO PUBLIC.NAME_TEMPLATE_TYPE_DEFNS( " + "RECORD_NUM, " + "SET_PID, "
			+ "COMMIT_PID, " + "NAME_TEMPLATE_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "ENTITY_TYPE_KEY, "
			+ "ENTITY_SUB_TYPE_KEY, " + "SORTING_ONLY, " + "IS_MANDATORY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, "
			+ "IS_DEFAULT, " + "SHOW) VALUES (?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, "
			+ "?, " + "?, " + "?, " + "?)";

	private static final String UPDATE = "UPDATE PUBLIC.NAME_TEMPLATE_TYPE_DEFNSSET " + "RECORD_NUM = ?, "
			+ "SET_PID = ?, " + "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "ENTITY_TYPE_KEY = ?, "
			+ "ENTITY_SUB_TYPE_KEY = ?, " + "SORTING_ONLY = ?, " + "IS_MANDATORY = ?, " + "REMINDER_KEY = ?, "
			+ "DISPLAY_ORDER = ?, " + "IS_DEFAULT = ?, " + "SHOW = ? WHERE NAME_TEMPLATE_TYPE_DEFN_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.NAME_TEMPLATE_TYPE_DEFNS WHERE NAME_TEMPLATE_TYPE_DEFN_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.NAME_TEMPLATE_TYPE_DEFNS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetPid;
	private int CommitPid;
	private int NameTemplateTypeDefnPid;
	private boolean IsSystem;
	private short EntityTypeKey;
	private short EntitySubTypeKey;
	private boolean SortingOnly;
	private boolean IsMandatory;
	private short ReminderKey;
	private short DisplayOrder;
	private boolean IsDefault;
	private boolean Show;
	private NameTemplateTypeDefns model;

	public NameTemplateTypeDefns() throws SQLException {
	}

	public NameTemplateTypeDefns(int NameTemplateTypeDefnPid) throws SQLException {
		super();
		this.NameTemplateTypeDefnPid = NameTemplateTypeDefnPid;
	}

	@Override
	public void delete() throws SQLException {
		ps = conn.prepareStatement(DELETEALL);
		ps.executeUpdate();
	}

	@Override
	public void delete(int key) throws SQLException {
		ps = conn.prepareStatement(DELETE);
		ps.setInt(1, key);
		ps.executeUpdate();
	}

	@Override
	public List<AbstractHreDataModel> get() throws SQLException {
		ps = conn.prepareStatement(SELECTALL);
		rs = ps.executeQuery();
		modelList = new ArrayList<AbstractHreDataModel>();
		while (rs.next()) {
			model = new NameTemplateTypeDefns();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetPid(rs.getShort("SET_PID"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setNameTemplateTypeDefnPid(rs.getInt("NAME_TEMPLATE_TYPE_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
			model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
			model.setSortingOnly(rs.getBoolean("SORTING_ONLY"));
			model.setIsMandatory(rs.getBoolean("IS_MANDATORY"));
			model.setReminderKey(rs.getShort("REMINDER_KEY"));
			model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
			model.setIsDefault(rs.getBoolean("IS_DEFAULT"));
			model.setShow(rs.getBoolean("SHOW"));
			modelList.add(model);
		}
		return modelList;
	}

	@Override
	public AbstractHreDataModel get(int key) throws SQLException {
		ps = conn.prepareStatement(SELECT);
		ps.setInt(1, key);
		rs = ps.executeQuery();
		if (rs.next()) {
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetPid(rs.getShort("SET_PID"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setNameTemplateTypeDefnPid(rs.getInt("NAME_TEMPLATE_TYPE_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
			model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
			model.setSortingOnly(rs.getBoolean("SORTING_ONLY"));
			model.setIsMandatory(rs.getBoolean("IS_MANDATORY"));
			model.setReminderKey(rs.getShort("REMINDER_KEY"));
			model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
			model.setIsDefault(rs.getBoolean("IS_DEFAULT"));
			model.setShow(rs.getBoolean("SHOW"));
		}
		return this;
	}

	public int getCommitPid() {
		return this.CommitPid;
	}

	public short getDisplayOrder() {
		return this.DisplayOrder;
	}

	public short getEntitySubTypeKey() {
		return this.EntitySubTypeKey;
	}

	public short getEntityTypeKey() {
		return this.EntityTypeKey;
	}

	public boolean getIsDefault() {
		return this.IsDefault;
	}

	public boolean getIsMandatory() {
		return this.IsMandatory;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public int getNameTemplateTypeDefnPid() {
		return this.NameTemplateTypeDefnPid;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public short getReminderKey() {
		return this.ReminderKey;
	}

	public short getSetPid() {
		return this.SetPid;
	}

	public boolean getShow() {
		return this.Show;
	}

	public boolean getSortingOnly() {
		return this.SortingOnly;
	}

	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		((NameTemplateTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((NameTemplateTypeDefns) model).setSetPid(rs.getShort("SET_PID"));
		((NameTemplateTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((NameTemplateTypeDefns) model).setNameTemplateTypeDefnPid(rs.getInt("NAME_TEMPLATE_TYPE_DEFN_PID"));
		((NameTemplateTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((NameTemplateTypeDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
		((NameTemplateTypeDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
		((NameTemplateTypeDefns) model).setSortingOnly(rs.getBoolean("SORTING_ONLY"));
		((NameTemplateTypeDefns) model).setIsMandatory(rs.getBoolean("IS_MANDATORY"));
		((NameTemplateTypeDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((NameTemplateTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((NameTemplateTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((NameTemplateTypeDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((NameTemplateTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((NameTemplateTypeDefns) model).setSetPid(rs.getShort("SET_PID"));
		((NameTemplateTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((NameTemplateTypeDefns) model).setNameTemplateTypeDefnPid(rs.getInt("NAME_TEMPLATE_TYPE_DEFN_PID"));
		((NameTemplateTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((NameTemplateTypeDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
		((NameTemplateTypeDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
		((NameTemplateTypeDefns) model).setSortingOnly(rs.getBoolean("SORTING_ONLY"));
		((NameTemplateTypeDefns) model).setIsMandatory(rs.getBoolean("IS_MANDATORY"));
		((NameTemplateTypeDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((NameTemplateTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((NameTemplateTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((NameTemplateTypeDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setDisplayOrder(short DisplayOrder) {
		this.DisplayOrder = DisplayOrder;
	}

	public void setEntitySubTypeKey(short EntitySubTypeKey) {
		this.EntitySubTypeKey = EntitySubTypeKey;
	}

	public void setEntityTypeKey(short EntityTypeKey) {
		this.EntityTypeKey = EntityTypeKey;
	}

	public void setIsDefault(boolean IsDefault) {
		this.IsDefault = IsDefault;
	}

	public void setIsMandatory(boolean IsMandatory) {
		this.IsMandatory = IsMandatory;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setNameTemplateTypeDefnPid(int NameTemplateTypeDefnPid) {
		this.NameTemplateTypeDefnPid = NameTemplateTypeDefnPid;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setReminderKey(short ReminderKey) {
		this.ReminderKey = ReminderKey;
	}

	public void setSetPid(short SetPid) {
		this.SetPid = SetPid;
	}

	public void setShow(boolean Show) {
		this.Show = Show;
	}

	public void setSortingOnly(boolean SortingOnly) {
		this.SortingOnly = SortingOnly;
	}

}
