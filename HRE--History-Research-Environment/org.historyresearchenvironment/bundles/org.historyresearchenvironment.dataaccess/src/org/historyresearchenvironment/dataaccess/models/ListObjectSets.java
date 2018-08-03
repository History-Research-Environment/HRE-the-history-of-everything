package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the LIST_OBJECT_SETS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class ListObjectSets extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "LIST_OBJECT_SET_PID, " + "IS_SYSTEM, " + "INPUT_TYPE_KEY, " + "INPUT_SUB_TYPE_KEY, " + "REMINDER_KEY, "
			+ "DISPLAY_ORDER, " + "IS_DEFAULT, " + "SHOW FROM PUBLIC.LIST_OBJECT_SETS WHERE LIST_OBJECT_SET_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "LIST_OBJECT_SET_PID, " + "IS_SYSTEM, " + "INPUT_TYPE_KEY, " + "INPUT_SUB_TYPE_KEY, " + "REMINDER_KEY, "
			+ "DISPLAY_ORDER, " + "IS_DEFAULT, " + "SHOW FROM PUBLIC.LIST_OBJECT_SETS";

	private static final String INSERT = "INSERT INTO PUBLIC.LIST_OBJECT_SETS( " + "RECORD_NUM, " + "SET_KEY, "
			+ "COMMIT_PID, " + "LIST_OBJECT_SET_PID, " + "IS_SYSTEM, " + "INPUT_TYPE_KEY, " + "INPUT_SUB_TYPE_KEY, "
			+ "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, " + "SHOW) VALUES (?, " + "?, " + "?, " + "?, "
			+ "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?)";

	private static final String UPDATE = "UPDATE PUBLIC.LIST_OBJECT_SETSSET " + "RECORD_NUM = ?, " + "SET_KEY = ?, "
			+ "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "INPUT_TYPE_KEY = ?, " + "INPUT_SUB_TYPE_KEY = ?, "
			+ "REMINDER_KEY = ?, " + "DISPLAY_ORDER = ?, " + "IS_DEFAULT = ?, "
			+ "SHOW = ? WHERE LIST_OBJECT_SET_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.LIST_OBJECT_SETS WHERE LIST_OBJECT_SET_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.LIST_OBJECT_SETS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetKey;
	private int CommitPid;
	private int ListObjectSetPid;
	private boolean IsSystem;
	private short InputTypeKey;
	private short InputSubTypeKey;
	private short ReminderKey;
	private short DisplayOrder;
	private boolean IsDefault;
	private boolean Show;
	private ListObjectSets model;

	public ListObjectSets() throws SQLException {
	}

	public ListObjectSets(int ListObjectSetPid) throws SQLException {
		super();
		this.ListObjectSetPid = ListObjectSetPid;
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
			model = new ListObjectSets();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setListObjectSetPid(rs.getInt("LIST_OBJECT_SET_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setInputTypeKey(rs.getShort("INPUT_TYPE_KEY"));
			model.setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
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
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setListObjectSetPid(rs.getInt("LIST_OBJECT_SET_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setInputTypeKey(rs.getShort("INPUT_TYPE_KEY"));
			model.setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
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

	public short getInputSubTypeKey() {
		return this.InputSubTypeKey;
	}

	public short getInputTypeKey() {
		return this.InputTypeKey;
	}

	public boolean getIsDefault() {
		return this.IsDefault;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public int getListObjectSetPid() {
		return this.ListObjectSetPid;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public short getReminderKey() {
		return this.ReminderKey;
	}

	public short getSetKey() {
		return this.SetKey;
	}

	public boolean getShow() {
		return this.Show;
	}

	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		((ListObjectSets) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((ListObjectSets) model).setSetKey(rs.getShort("SET_KEY"));
		((ListObjectSets) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((ListObjectSets) model).setListObjectSetPid(rs.getInt("LIST_OBJECT_SET_PID"));
		((ListObjectSets) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((ListObjectSets) model).setInputTypeKey(rs.getShort("INPUT_TYPE_KEY"));
		((ListObjectSets) model).setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
		((ListObjectSets) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((ListObjectSets) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((ListObjectSets) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((ListObjectSets) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((ListObjectSets) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((ListObjectSets) model).setSetKey(rs.getShort("SET_KEY"));
		((ListObjectSets) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((ListObjectSets) model).setListObjectSetPid(rs.getInt("LIST_OBJECT_SET_PID"));
		((ListObjectSets) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((ListObjectSets) model).setInputTypeKey(rs.getShort("INPUT_TYPE_KEY"));
		((ListObjectSets) model).setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
		((ListObjectSets) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((ListObjectSets) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((ListObjectSets) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((ListObjectSets) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setDisplayOrder(short DisplayOrder) {
		this.DisplayOrder = DisplayOrder;
	}

	public void setInputSubTypeKey(short InputSubTypeKey) {
		this.InputSubTypeKey = InputSubTypeKey;
	}

	public void setInputTypeKey(short InputTypeKey) {
		this.InputTypeKey = InputTypeKey;
	}

	public void setIsDefault(boolean IsDefault) {
		this.IsDefault = IsDefault;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setListObjectSetPid(int ListObjectSetPid) {
		this.ListObjectSetPid = ListObjectSetPid;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setReminderKey(short ReminderKey) {
		this.ReminderKey = ReminderKey;
	}

	public void setSetKey(short SetKey) {
		this.SetKey = SetKey;
	}

	public void setShow(boolean Show) {
		this.Show = Show;
	}

}
