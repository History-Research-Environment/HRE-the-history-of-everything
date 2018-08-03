package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the NAMED_MEMO_TYPE_DEFNS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class NamedMemoTypeDefns extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "NAMED_MEMO_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "PARENT_TAG_TYPE_KEY, " + "PARENT_TAG_TYPE_PID, "
			+ "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW FROM PUBLIC.NAMED_MEMO_TYPE_DEFNS WHERE NAMED_MEMO_TYPE_DEFN_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "NAMED_MEMO_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "PARENT_TAG_TYPE_KEY, " + "PARENT_TAG_TYPE_PID, "
			+ "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, " + "SHOW FROM PUBLIC.NAMED_MEMO_TYPE_DEFNS";

	private static final String INSERT = "INSERT INTO PUBLIC.NAMED_MEMO_TYPE_DEFNS( " + "RECORD_NUM, " + "SET_KEY, "
			+ "COMMIT_PID, " + "NAMED_MEMO_TYPE_DEFN_PID, " + "IS_SYSTEM, " + "PARENT_TAG_TYPE_KEY, "
			+ "PARENT_TAG_TYPE_PID, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, " + "SHOW) VALUES (?, "
			+ "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?)";

	private static final String UPDATE = "UPDATE PUBLIC.NAMED_MEMO_TYPE_DEFNSSET " + "RECORD_NUM = ?, "
			+ "SET_KEY = ?, " + "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "PARENT_TAG_TYPE_KEY = ?, "
			+ "PARENT_TAG_TYPE_PID = ?, " + "REMINDER_KEY = ?, " + "DISPLAY_ORDER = ?, " + "IS_DEFAULT = ?, "
			+ "SHOW = ? WHERE NAMED_MEMO_TYPE_DEFN_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.NAMED_MEMO_TYPE_DEFNS WHERE NAMED_MEMO_TYPE_DEFN_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.NAMED_MEMO_TYPE_DEFNS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetKey;
	private int CommitPid;
	private int NamedMemoTypeDefnPid;
	private boolean IsSystem;
	private short ParentTagTypeKey;
	private short ParentTagTypePid;
	private int ReminderKey;
	private short DisplayOrder;
	private boolean IsDefault;
	private boolean Show;
	private NamedMemoTypeDefns model;

	public NamedMemoTypeDefns() throws SQLException {
	}

	public NamedMemoTypeDefns(int NamedMemoTypeDefnPid) throws SQLException {
		super();
		this.NamedMemoTypeDefnPid = NamedMemoTypeDefnPid;
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
			model = new NamedMemoTypeDefns();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setNamedMemoTypeDefnPid(rs.getInt("NAMED_MEMO_TYPE_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setParentTagTypeKey(rs.getShort("PARENT_TAG_TYPE_KEY"));
			model.setParentTagTypePid(rs.getShort("PARENT_TAG_TYPE_PID"));
			model.setReminderKey(rs.getInt("REMINDER_KEY"));
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
			model.setNamedMemoTypeDefnPid(rs.getInt("NAMED_MEMO_TYPE_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setParentTagTypeKey(rs.getShort("PARENT_TAG_TYPE_KEY"));
			model.setParentTagTypePid(rs.getShort("PARENT_TAG_TYPE_PID"));
			model.setReminderKey(rs.getInt("REMINDER_KEY"));
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

	public boolean getIsDefault() {
		return this.IsDefault;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public int getNamedMemoTypeDefnPid() {
		return this.NamedMemoTypeDefnPid;
	}

	public short getParentTagTypeKey() {
		return this.ParentTagTypeKey;
	}

	public short getParentTagTypePid() {
		return this.ParentTagTypePid;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public int getReminderKey() {
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
		((NamedMemoTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((NamedMemoTypeDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((NamedMemoTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((NamedMemoTypeDefns) model).setNamedMemoTypeDefnPid(rs.getInt("NAMED_MEMO_TYPE_DEFN_PID"));
		((NamedMemoTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((NamedMemoTypeDefns) model).setParentTagTypeKey(rs.getShort("PARENT_TAG_TYPE_KEY"));
		((NamedMemoTypeDefns) model).setParentTagTypePid(rs.getShort("PARENT_TAG_TYPE_PID"));
		((NamedMemoTypeDefns) model).setReminderKey(rs.getInt("REMINDER_KEY"));
		((NamedMemoTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((NamedMemoTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((NamedMemoTypeDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((NamedMemoTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((NamedMemoTypeDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((NamedMemoTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((NamedMemoTypeDefns) model).setNamedMemoTypeDefnPid(rs.getInt("NAMED_MEMO_TYPE_DEFN_PID"));
		((NamedMemoTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((NamedMemoTypeDefns) model).setParentTagTypeKey(rs.getShort("PARENT_TAG_TYPE_KEY"));
		((NamedMemoTypeDefns) model).setParentTagTypePid(rs.getShort("PARENT_TAG_TYPE_PID"));
		((NamedMemoTypeDefns) model).setReminderKey(rs.getInt("REMINDER_KEY"));
		((NamedMemoTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((NamedMemoTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((NamedMemoTypeDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setDisplayOrder(short DisplayOrder) {
		this.DisplayOrder = DisplayOrder;
	}

	public void setIsDefault(boolean IsDefault) {
		this.IsDefault = IsDefault;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setNamedMemoTypeDefnPid(int NamedMemoTypeDefnPid) {
		this.NamedMemoTypeDefnPid = NamedMemoTypeDefnPid;
	}

	public void setParentTagTypeKey(short ParentTagTypeKey) {
		this.ParentTagTypeKey = ParentTagTypeKey;
	}

	public void setParentTagTypePid(short ParentTagTypePid) {
		this.ParentTagTypePid = ParentTagTypePid;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setReminderKey(int ReminderKey) {
		this.ReminderKey = ReminderKey;
	}

	public void setSetKey(short SetKey) {
		this.SetKey = SetKey;
	}

	public void setShow(boolean Show) {
		this.Show = Show;
	}

}
