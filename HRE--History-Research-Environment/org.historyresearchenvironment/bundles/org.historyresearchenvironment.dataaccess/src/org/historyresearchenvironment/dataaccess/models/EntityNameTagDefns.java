package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the ENTITY_NAME_TAG_DEFNS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class EntityNameTagDefns extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "ENTITY_NAME_TAG_DEFN_PID, " + "IS_SYSTEM, " + "PLUGIN_PID, " + "VIEW_DATA_SCRIPT_GROUP_KEY, "
			+ "VIEW_DATA_SCRIPT_PID, " + "MODIFY_DATA_SCRIPT_GROUP_KEY, " + "MODIFY_DATA_SCRIPT_PID, "
			+ "DELETE_DATA_SCRIPT_GROUP_KEY, " + "DELETE_DATA_SCRIPT_PID, " + "ENTITY_TYPE_KEY, "
			+ "ENTITY_SUB_TYPE_KEY, " + "DFLT_SENTCE_SET_KEY, " + "DFLT_TAG_GROUP_KEY, " + "DFLT_THEME_KEY, "
			+ "SENTCE_SET_TYPE_KEY, " + "SENTCE_STYLE_TYPE_KEY, " + "GLOBAL_SENTCE_SET_KEY, " + "MEMO_SET_TYPE_KEY, "
			+ "HAS_MULTI_PART, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW FROM PUBLIC.ENTITY_NAME_TAG_DEFNS WHERE ENTITY_NAME_TAG_DEFN_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_KEY, " + "COMMIT_PID, "
			+ "ENTITY_NAME_TAG_DEFN_PID, " + "IS_SYSTEM, " + "PLUGIN_PID, " + "VIEW_DATA_SCRIPT_GROUP_KEY, "
			+ "VIEW_DATA_SCRIPT_PID, " + "MODIFY_DATA_SCRIPT_GROUP_KEY, " + "MODIFY_DATA_SCRIPT_PID, "
			+ "DELETE_DATA_SCRIPT_GROUP_KEY, " + "DELETE_DATA_SCRIPT_PID, " + "ENTITY_TYPE_KEY, "
			+ "ENTITY_SUB_TYPE_KEY, " + "DFLT_SENTCE_SET_KEY, " + "DFLT_TAG_GROUP_KEY, " + "DFLT_THEME_KEY, "
			+ "SENTCE_SET_TYPE_KEY, " + "SENTCE_STYLE_TYPE_KEY, " + "GLOBAL_SENTCE_SET_KEY, " + "MEMO_SET_TYPE_KEY, "
			+ "HAS_MULTI_PART, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW FROM PUBLIC.ENTITY_NAME_TAG_DEFNS";

	private static final String INSERT = "INSERT INTO PUBLIC.ENTITY_NAME_TAG_DEFNS( " + "RECORD_NUM, " + "SET_KEY, "
			+ "COMMIT_PID, " + "ENTITY_NAME_TAG_DEFN_PID, " + "IS_SYSTEM, " + "PLUGIN_PID, "
			+ "VIEW_DATA_SCRIPT_GROUP_KEY, " + "VIEW_DATA_SCRIPT_PID, " + "MODIFY_DATA_SCRIPT_GROUP_KEY, "
			+ "MODIFY_DATA_SCRIPT_PID, " + "DELETE_DATA_SCRIPT_GROUP_KEY, " + "DELETE_DATA_SCRIPT_PID, "
			+ "ENTITY_TYPE_KEY, " + "ENTITY_SUB_TYPE_KEY, " + "DFLT_SENTCE_SET_KEY, " + "DFLT_TAG_GROUP_KEY, "
			+ "DFLT_THEME_KEY, " + "SENTCE_SET_TYPE_KEY, " + "SENTCE_STYLE_TYPE_KEY, " + "GLOBAL_SENTCE_SET_KEY, "
			+ "MEMO_SET_TYPE_KEY, " + "HAS_MULTI_PART, " + "REMINDER_KEY, " + "DISPLAY_ORDER, " + "IS_DEFAULT, "
			+ "SHOW) VALUES (?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, "
			+ "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, "
			+ "?, " + "?)";

	private static final String UPDATE = "UPDATE PUBLIC.ENTITY_NAME_TAG_DEFNSSET " + "RECORD_NUM = ?, "
			+ "SET_KEY = ?, " + "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "PLUGIN_PID = ?, "
			+ "VIEW_DATA_SCRIPT_GROUP_KEY = ?, " + "VIEW_DATA_SCRIPT_PID = ?, " + "MODIFY_DATA_SCRIPT_GROUP_KEY = ?, "
			+ "MODIFY_DATA_SCRIPT_PID = ?, " + "DELETE_DATA_SCRIPT_GROUP_KEY = ?, " + "DELETE_DATA_SCRIPT_PID = ?, "
			+ "ENTITY_TYPE_KEY = ?, " + "ENTITY_SUB_TYPE_KEY = ?, " + "DFLT_SENTCE_SET_KEY = ?, "
			+ "DFLT_TAG_GROUP_KEY = ?, " + "DFLT_THEME_KEY = ?, " + "SENTCE_SET_TYPE_KEY = ?, "
			+ "SENTCE_STYLE_TYPE_KEY = ?, " + "GLOBAL_SENTCE_SET_KEY = ?, " + "MEMO_SET_TYPE_KEY = ?, "
			+ "HAS_MULTI_PART = ?, " + "REMINDER_KEY = ?, " + "DISPLAY_ORDER = ?, " + "IS_DEFAULT = ?, "
			+ "SHOW = ? WHERE ENTITY_NAME_TAG_DEFN_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.ENTITY_NAME_TAG_DEFNS WHERE ENTITY_NAME_TAG_DEFN_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.ENTITY_NAME_TAG_DEFNS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetKey;
	private int CommitPid;
	private int EntityNameTagDefnPid;
	private boolean IsSystem;
	private short PluginPid;
	private short ViewDataScriptGroupKey;
	private int ViewDataScriptPid;
	private short ModifyDataScriptGroupKey;
	private int ModifyDataScriptPid;
	private short DeleteDataScriptGroupKey;
	private int DeleteDataScriptPid;
	private short EntityTypeKey;
	private short EntitySubTypeKey;
	private short DfltSentceSetKey;
	private short DfltTagGroupKey;
	private short DfltThemeKey;
	private short SentceSetTypeKey;
	private short SentceStyleTypeKey;
	private short GlobalSentceSetKey;
	private short MemoSetTypeKey;
	private boolean HasMultiPart;
	private short ReminderKey;
	private short DisplayOrder;
	private boolean IsDefault;
	private boolean Show;
	private EntityNameTagDefns model;

	public EntityNameTagDefns() throws SQLException {
	}

	public EntityNameTagDefns(int EntityNameTagDefnPid) throws SQLException {
		super();
		this.EntityNameTagDefnPid = EntityNameTagDefnPid;
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
			model = new EntityNameTagDefns();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKey(rs.getShort("SET_KEY"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setEntityNameTagDefnPid(rs.getInt("ENTITY_NAME_TAG_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setPluginPid(rs.getShort("PLUGIN_PID"));
			model.setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
			model.setViewDataScriptPid(rs.getInt("VIEW_DATA_SCRIPT_PID"));
			model.setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
			model.setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
			model.setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
			model.setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
			model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
			model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
			model.setDfltSentceSetKey(rs.getShort("DFLT_SENTCE_SET_KEY"));
			model.setDfltTagGroupKey(rs.getShort("DFLT_TAG_GROUP_KEY"));
			model.setDfltThemeKey(rs.getShort("DFLT_THEME_KEY"));
			model.setSentceSetTypeKey(rs.getShort("SENTCE_SET_TYPE_KEY"));
			model.setSentceStyleTypeKey(rs.getShort("SENTCE_STYLE_TYPE_KEY"));
			model.setGlobalSentceSetKey(rs.getShort("GLOBAL_SENTCE_SET_KEY"));
			model.setMemoSetTypeKey(rs.getShort("MEMO_SET_TYPE_KEY"));
			model.setHasMultiPart(rs.getBoolean("HAS_MULTI_PART"));
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
			model.setEntityNameTagDefnPid(rs.getInt("ENTITY_NAME_TAG_DEFN_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setPluginPid(rs.getShort("PLUGIN_PID"));
			model.setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
			model.setViewDataScriptPid(rs.getInt("VIEW_DATA_SCRIPT_PID"));
			model.setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
			model.setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
			model.setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
			model.setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
			model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
			model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
			model.setDfltSentceSetKey(rs.getShort("DFLT_SENTCE_SET_KEY"));
			model.setDfltTagGroupKey(rs.getShort("DFLT_TAG_GROUP_KEY"));
			model.setDfltThemeKey(rs.getShort("DFLT_THEME_KEY"));
			model.setSentceSetTypeKey(rs.getShort("SENTCE_SET_TYPE_KEY"));
			model.setSentceStyleTypeKey(rs.getShort("SENTCE_STYLE_TYPE_KEY"));
			model.setGlobalSentceSetKey(rs.getShort("GLOBAL_SENTCE_SET_KEY"));
			model.setMemoSetTypeKey(rs.getShort("MEMO_SET_TYPE_KEY"));
			model.setHasMultiPart(rs.getBoolean("HAS_MULTI_PART"));
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

	public short getDeleteDataScriptGroupKey() {
		return this.DeleteDataScriptGroupKey;
	}

	public int getDeleteDataScriptPid() {
		return this.DeleteDataScriptPid;
	}

	public short getDfltSentceSetKey() {
		return this.DfltSentceSetKey;
	}

	public short getDfltTagGroupKey() {
		return this.DfltTagGroupKey;
	}

	public short getDfltThemeKey() {
		return this.DfltThemeKey;
	}

	public short getDisplayOrder() {
		return this.DisplayOrder;
	}

	public int getEntityNameTagDefnPid() {
		return this.EntityNameTagDefnPid;
	}

	public short getEntitySubTypeKey() {
		return this.EntitySubTypeKey;
	}

	public short getEntityTypeKey() {
		return this.EntityTypeKey;
	}

	public short getGlobalSentceSetKey() {
		return this.GlobalSentceSetKey;
	}

	public boolean getHasMultiPart() {
		return this.HasMultiPart;
	}

	public boolean getIsDefault() {
		return this.IsDefault;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public short getMemoSetTypeKey() {
		return this.MemoSetTypeKey;
	}

	public short getModifyDataScriptGroupKey() {
		return this.ModifyDataScriptGroupKey;
	}

	public int getModifyDataScriptPid() {
		return this.ModifyDataScriptPid;
	}

	public short getPluginPid() {
		return this.PluginPid;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public short getReminderKey() {
		return this.ReminderKey;
	}

	public short getSentceSetTypeKey() {
		return this.SentceSetTypeKey;
	}

	public short getSentceStyleTypeKey() {
		return this.SentceStyleTypeKey;
	}

	public short getSetKey() {
		return this.SetKey;
	}

	public boolean getShow() {
		return this.Show;
	}

	public short getViewDataScriptGroupKey() {
		return this.ViewDataScriptGroupKey;
	}

	public int getViewDataScriptPid() {
		return this.ViewDataScriptPid;
	}

	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		((EntityNameTagDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((EntityNameTagDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((EntityNameTagDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((EntityNameTagDefns) model).setEntityNameTagDefnPid(rs.getInt("ENTITY_NAME_TAG_DEFN_PID"));
		((EntityNameTagDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((EntityNameTagDefns) model).setPluginPid(rs.getShort("PLUGIN_PID"));
		((EntityNameTagDefns) model).setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setViewDataScriptPid(rs.getInt("VIEW_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
		((EntityNameTagDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
		((EntityNameTagDefns) model).setDfltSentceSetKey(rs.getShort("DFLT_SENTCE_SET_KEY"));
		((EntityNameTagDefns) model).setDfltTagGroupKey(rs.getShort("DFLT_TAG_GROUP_KEY"));
		((EntityNameTagDefns) model).setDfltThemeKey(rs.getShort("DFLT_THEME_KEY"));
		((EntityNameTagDefns) model).setSentceSetTypeKey(rs.getShort("SENTCE_SET_TYPE_KEY"));
		((EntityNameTagDefns) model).setSentceStyleTypeKey(rs.getShort("SENTCE_STYLE_TYPE_KEY"));
		((EntityNameTagDefns) model).setGlobalSentceSetKey(rs.getShort("GLOBAL_SENTCE_SET_KEY"));
		((EntityNameTagDefns) model).setMemoSetTypeKey(rs.getShort("MEMO_SET_TYPE_KEY"));
		((EntityNameTagDefns) model).setHasMultiPart(rs.getBoolean("HAS_MULTI_PART"));
		((EntityNameTagDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((EntityNameTagDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((EntityNameTagDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((EntityNameTagDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((EntityNameTagDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((EntityNameTagDefns) model).setSetKey(rs.getShort("SET_KEY"));
		((EntityNameTagDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((EntityNameTagDefns) model).setEntityNameTagDefnPid(rs.getInt("ENTITY_NAME_TAG_DEFN_PID"));
		((EntityNameTagDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((EntityNameTagDefns) model).setPluginPid(rs.getShort("PLUGIN_PID"));
		((EntityNameTagDefns) model).setViewDataScriptGroupKey(rs.getShort("VIEW_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setViewDataScriptPid(rs.getInt("VIEW_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setModifyDataScriptGroupKey(rs.getShort("MODIFY_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setModifyDataScriptPid(rs.getInt("MODIFY_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setDeleteDataScriptGroupKey(rs.getShort("DELETE_DATA_SCRIPT_GROUP_KEY"));
		((EntityNameTagDefns) model).setDeleteDataScriptPid(rs.getInt("DELETE_DATA_SCRIPT_PID"));
		((EntityNameTagDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
		((EntityNameTagDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
		((EntityNameTagDefns) model).setDfltSentceSetKey(rs.getShort("DFLT_SENTCE_SET_KEY"));
		((EntityNameTagDefns) model).setDfltTagGroupKey(rs.getShort("DFLT_TAG_GROUP_KEY"));
		((EntityNameTagDefns) model).setDfltThemeKey(rs.getShort("DFLT_THEME_KEY"));
		((EntityNameTagDefns) model).setSentceSetTypeKey(rs.getShort("SENTCE_SET_TYPE_KEY"));
		((EntityNameTagDefns) model).setSentceStyleTypeKey(rs.getShort("SENTCE_STYLE_TYPE_KEY"));
		((EntityNameTagDefns) model).setGlobalSentceSetKey(rs.getShort("GLOBAL_SENTCE_SET_KEY"));
		((EntityNameTagDefns) model).setMemoSetTypeKey(rs.getShort("MEMO_SET_TYPE_KEY"));
		((EntityNameTagDefns) model).setHasMultiPart(rs.getBoolean("HAS_MULTI_PART"));
		((EntityNameTagDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
		((EntityNameTagDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
		((EntityNameTagDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
		((EntityNameTagDefns) model).setShow(rs.getBoolean("SHOW"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setDeleteDataScriptGroupKey(short DeleteDataScriptGroupKey) {
		this.DeleteDataScriptGroupKey = DeleteDataScriptGroupKey;
	}

	public void setDeleteDataScriptPid(int DeleteDataScriptPid) {
		this.DeleteDataScriptPid = DeleteDataScriptPid;
	}

	public void setDfltSentceSetKey(short DfltSentceSetKey) {
		this.DfltSentceSetKey = DfltSentceSetKey;
	}

	public void setDfltTagGroupKey(short DfltTagGroupKey) {
		this.DfltTagGroupKey = DfltTagGroupKey;
	}

	public void setDfltThemeKey(short DfltThemeKey) {
		this.DfltThemeKey = DfltThemeKey;
	}

	public void setDisplayOrder(short DisplayOrder) {
		this.DisplayOrder = DisplayOrder;
	}

	public void setEntityNameTagDefnPid(int EntityNameTagDefnPid) {
		this.EntityNameTagDefnPid = EntityNameTagDefnPid;
	}

	public void setEntitySubTypeKey(short EntitySubTypeKey) {
		this.EntitySubTypeKey = EntitySubTypeKey;
	}

	public void setEntityTypeKey(short EntityTypeKey) {
		this.EntityTypeKey = EntityTypeKey;
	}

	public void setGlobalSentceSetKey(short GlobalSentceSetKey) {
		this.GlobalSentceSetKey = GlobalSentceSetKey;
	}

	public void setHasMultiPart(boolean HasMultiPart) {
		this.HasMultiPart = HasMultiPart;
	}

	public void setIsDefault(boolean IsDefault) {
		this.IsDefault = IsDefault;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setMemoSetTypeKey(short MemoSetTypeKey) {
		this.MemoSetTypeKey = MemoSetTypeKey;
	}

	public void setModifyDataScriptGroupKey(short ModifyDataScriptGroupKey) {
		this.ModifyDataScriptGroupKey = ModifyDataScriptGroupKey;
	}

	public void setModifyDataScriptPid(int ModifyDataScriptPid) {
		this.ModifyDataScriptPid = ModifyDataScriptPid;
	}

	public void setPluginPid(short PluginPid) {
		this.PluginPid = PluginPid;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setReminderKey(short ReminderKey) {
		this.ReminderKey = ReminderKey;
	}

	public void setSentceSetTypeKey(short SentceSetTypeKey) {
		this.SentceSetTypeKey = SentceSetTypeKey;
	}

	public void setSentceStyleTypeKey(short SentceStyleTypeKey) {
		this.SentceStyleTypeKey = SentceStyleTypeKey;
	}

	public void setSetKey(short SetKey) {
		this.SetKey = SetKey;
	}

	public void setShow(boolean Show) {
		this.Show = Show;
	}

	public void setViewDataScriptGroupKey(short ViewDataScriptGroupKey) {
		this.ViewDataScriptGroupKey = ViewDataScriptGroupKey;
	}

	public void setViewDataScriptPid(int ViewDataScriptPid) {
		this.ViewDataScriptPid = ViewDataScriptPid;
	}

}
