package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the SUBSTN_FILTER_DEFNS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class SubstnFilterDefns extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "SUBSTN_FILTER_DEFN_PID, " + "IS_SYSTEM, " + "IS_ACTION, " + "IS_JOIN, " + "IS_SORT, "
			+ "SCRIPT_GROUP_KEY, " + "SCRIPT_KEY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, "
			+ "SHOW FROM PUBLIC.SUBSTN_FILTER_DEFNS WHERE SUBSTN_FILTER_DEFN_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "SUBSTN_FILTER_DEFN_PID, " + "IS_SYSTEM, " + "IS_ACTION, " + "IS_JOIN, " + "IS_SORT, "
			+ "SCRIPT_GROUP_KEY, " + "SCRIPT_KEY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, "
			+ "SHOW FROM PUBLIC.SUBSTN_FILTER_DEFNS";

	private static final String INSERT = "INSERT INTO PUBLIC.SUBSTN_FILTER_DEFNS( " + "RECORD_NUM, " + "SET_KEY, "
			+ "COMMIT_PID, " + "SUBSTN_FILTER_DEFN_PID, " + "IS_SYSTEM, " + "IS_ACTION, " + "IS_JOIN, " + "IS_SORT, "
			+ "SCRIPT_GROUP_KEY, " + "SCRIPT_KEY, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "SHOW) VALUES (?, " + "?, "
			+ "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?)";

	private static final String UPDATE = "UPDATE PUBLIC.SUBSTN_FILTER_DEFNSSET " + "RECORD_NUM = ?, " + "SET_KEY = ?, "
			+ "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "IS_ACTION = ?, " + "IS_JOIN = ?, " + "IS_SORT = ?, "
			+ "SCRIPT_GROUP_KEY = ?, " + "SCRIPT_KEY = ?, " + "REMINDER_KEY = ?, " + "DISPLAY_ORDER = ?, "
			+ "SHOW = ? WHERE SUBSTN_FILTER_DEFN_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.SUBSTN_FILTER_DEFNS WHERE SUBSTN_FILTER_DEFN_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.SUBSTN_FILTER_DEFNS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetKey;
	private int CommitPid;
	private int SubstnFilterDefnPid;
	private boolean IsSystem;
	private boolean IsAction;
	private boolean IsJoin;
	private boolean IsSort;
	private short ScriptGroupKey;
	private short ScriptKey;
	private short ReminderKey;
	private short DisplayOrder;
	private boolean Show;
	private SubstnFilterDefns model;

	public SubstnFilterDefns() throws SQLException {
	}

	public SubstnFilterDefns(int SubstnFilterDefnPid) throws SQLException {
		super();
		this.SubstnFilterDefnPid = SubstnFilterDefnPid;
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
			model = new SubstnFilterDefns();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setSubstnFilterDefnPid(rs.getInt("SUBSTN_FILTER_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setIsAction(rs.getBoolean("IS_ACTION"));
			model.setIsJoin(rs.getBoolean("IS_JOIN"));
			model.setIsSort(rs.getBoolean("IS_SORT"));
			model.setScriptGroupKey(rs.getShort("SCRIPT_GROUP_KEY"));
			model.setScriptKey(rs.getShort("SCRIPT_KEY"));
			model.setReminderKey(rs.getShort("REMINDER_KEY"));
			model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
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
			model.setSubstnFilterDefnPid(rs.getInt("SUBSTN_FILTER_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setIsAction(rs.getBoolean("IS_ACTION"));
			model.setIsJoin(rs.getBoolean("IS_JOIN"));
			model.setIsSort(rs.getBoolean("IS_SORT"));
			model.setScriptGroupKey(rs.getShort("SCRIPT_GROUP_KEY"));
			model.setScriptKey(rs.getShort("SCRIPT_KEY"));
			model.setReminderKey(rs.getShort("REMINDER_KEY"));
			model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
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

	public boolean getIsAction() {
		return this.IsAction;
	}

	public boolean getIsJoin() {
		return this.IsJoin;
	}

	public boolean getIsSort() {
		return this.IsSort;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public short getReminderKey() {
		return this.ReminderKey;
	}

	public short getScriptGroupKey() {
		return this.ScriptGroupKey;
	}

	public short getScriptKey() {
		return this.ScriptKey;
	}

	public short getSetKey() {
		return this.SetKey;
	}

	public boolean getShow() {
		return this.Show;
	}

	public int getSubstnFilterDefnPid() {
		return this.SubstnFilterDefnPid;
	}

	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		((SubstnFilterDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((SubstnFilterDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((SubstnFilterDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((SubstnFilterDefns) model).setSubstnFilterDefnPid(rs.getInt("SUBSTN_FILTER_DEFN_PID"));
		((SubstnFilterDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((SubstnFilterDefns) model).setIsAction(rs.getBoolean("IS_ACTION"));
		((SubstnFilterDefns) model).setIsJoin(rs.getBoolean("IS_JOIN"));
		((SubstnFilterDefns) model).setIsSort(rs.getBoolean("IS_SORT"));
		((SubstnFilterDefns) model).setScriptGroupKey(rs.getShort("SCRIPT_GROUP_KEY"));
		((SubstnFilterDefns) model).setScriptKey(rs.getShort("SCRIPT_KEY"));
		((SubstnFilterDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((SubstnFilterDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((SubstnFilterDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((SubstnFilterDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((SubstnFilterDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((SubstnFilterDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((SubstnFilterDefns) model).setSubstnFilterDefnPid(rs.getInt("SUBSTN_FILTER_DEFN_PID"));
		((SubstnFilterDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((SubstnFilterDefns) model).setIsAction(rs.getBoolean("IS_ACTION"));
		((SubstnFilterDefns) model).setIsJoin(rs.getBoolean("IS_JOIN"));
		((SubstnFilterDefns) model).setIsSort(rs.getBoolean("IS_SORT"));
		((SubstnFilterDefns) model).setScriptGroupKey(rs.getShort("SCRIPT_GROUP_KEY"));
		((SubstnFilterDefns) model).setScriptKey(rs.getShort("SCRIPT_KEY"));
		((SubstnFilterDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((SubstnFilterDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((SubstnFilterDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setDisplayOrder(short DisplayOrder) {
		this.DisplayOrder = DisplayOrder;
	}

	public void setIsAction(boolean IsAction) {
		this.IsAction = IsAction;
	}

	public void setIsJoin(boolean IsJoin) {
		this.IsJoin = IsJoin;
	}

	public void setIsSort(boolean IsSort) {
		this.IsSort = IsSort;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setReminderKey(short ReminderKey) {
		this.ReminderKey = ReminderKey;
	}

	public void setScriptGroupKey(short ScriptGroupKey) {
		this.ScriptGroupKey = ScriptGroupKey;
	}

	public void setScriptKey(short ScriptKey) {
		this.ScriptKey = ScriptKey;
	}

	public void setSetKey(short SetKey) {
		this.SetKey = SetKey;
	}

	public void setShow(boolean Show) {
		this.Show = Show;
	}

	public void setSubstnFilterDefnPid(int SubstnFilterDefnPid) {
		this.SubstnFilterDefnPid = SubstnFilterDefnPid;
	}

}
