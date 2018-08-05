package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* The persistent class for the SCRIPT_GROUP_DEFNS database table.
*
* @version 2018-08-05
* @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
*
*/

public class ScriptGroupDefns extends AbstractHreDataModel {
private static final long serialVersionUID = 1L;
private ArrayList<AbstractHreDataModel> modelList;
private static final String SELECT = "SELECT " +
"RECORD_NUM, " +
"SET_KEY, " +
"COMMIT_PID, " +
"SCRIPT_GROUP_DEFN_PID, " +
"ACTION_TYPE_KEY, " +
"INPUT_FOCUS_TYPE_KEY, " +
"INPUT_SUB_TYPE_KEY, " +
"REMINDER_KEY, " +
"DISPLAY_ORDER, " +
"IS_DEFAULT, " +
"SHOW FROM PUBLIC.SCRIPT_GROUP_DEFNS WHERE SCRIPT_GROUP_DEFN_PID = ?";

private static final String SELECTALL = "SELECT " +
"RECORD_NUM, " +  
"SET_KEY, " +  
"COMMIT_PID, " +  
"SCRIPT_GROUP_DEFN_PID, " +  
"ACTION_TYPE_KEY, " +  
"INPUT_FOCUS_TYPE_KEY, " +  
"INPUT_SUB_TYPE_KEY, " +  
"REMINDER_KEY, " +  
"DISPLAY_ORDER, " +  
"IS_DEFAULT, " +  
"SHOW FROM PUBLIC.SCRIPT_GROUP_DEFNS";

private static final String INSERT = "INSERT INTO PUBLIC.SCRIPT_GROUP_DEFNS( " +
"RECORD_NUM, " +     
"SET_KEY, " +     
"COMMIT_PID, " +     
"SCRIPT_GROUP_DEFN_PID, " +     
"ACTION_TYPE_KEY, " +     
"INPUT_FOCUS_TYPE_KEY, " +     
"INPUT_SUB_TYPE_KEY, " +     
"REMINDER_KEY, " +     
"DISPLAY_ORDER, " +     
"IS_DEFAULT, " +     
"SHOW) VALUES (?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?)";

private static final String UPDATE = "UPDATE PUBLIC.SCRIPT_GROUP_DEFNSSET " +
"RECORD_NUM = ?, " + 
"SET_KEY = ?, " + 
"COMMIT_PID = ?, " + 
"ACTION_TYPE_KEY = ?, " + 
"INPUT_FOCUS_TYPE_KEY = ?, " + 
"INPUT_SUB_TYPE_KEY = ?, " + 
"REMINDER_KEY = ?, " + 
"DISPLAY_ORDER = ?, " + 
"IS_DEFAULT = ?, " + 
"SHOW = ? WHERE SCRIPT_GROUP_DEFN_PID = ?";

private static final String DELETE = "DELETE FROM PUBLIC.SCRIPT_GROUP_DEFNS WHERE SCRIPT_GROUP_DEFN_PID = ?";

private static final String DELETEALL = "DELETE FROM PUBLIC.SCRIPT_GROUP_DEFNS";

private int RecordNum;
private short SetKey;
private int CommitPid;
private int ScriptGroupDefnPid;
private short ActionTypeKey;
private short InputFocusTypeKey;
private short InputSubTypeKey;
private short ReminderKey;
private short DisplayOrder;
private boolean IsDefault;
private boolean Show;
private ScriptGroupDefns model;

/**
* No-arg Constructor
*
* @throws SQLException If database access has failed
*/

public ScriptGroupDefns() throws SQLException {
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
model = new ScriptGroupDefns();
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setScriptGroupDefnPid(rs.getInt("SCRIPT_GROUP_DEFN_PID"));
model.setActionTypeKey(rs.getShort("ACTION_TYPE_KEY"));
model.setInputFocusTypeKey(rs.getShort("INPUT_FOCUS_TYPE_KEY"));
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
public ScriptGroupDefns get(int key) throws SQLException {
model = new ScriptGroupDefns();
ps = conn.prepareStatement(SELECT);
ps.setInt(1, (int) key);
rs = ps.executeQuery();
if (rs.next()) {
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setScriptGroupDefnPid(rs.getInt("SCRIPT_GROUP_DEFN_PID"));
model.setActionTypeKey(rs.getShort("ACTION_TYPE_KEY"));
model.setInputFocusTypeKey(rs.getShort("INPUT_FOCUS_TYPE_KEY"));
model.setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
model.setReminderKey(rs.getShort("REMINDER_KEY"));
model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
model.setIsDefault(rs.getBoolean("IS_DEFAULT"));
model.setShow(rs.getBoolean("SHOW"));
}
return model;
}

@Override
public void post(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(INSERT);
((ScriptGroupDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
((ScriptGroupDefns) model).setSetKey(rs.getShort("SET_KEY"));
((ScriptGroupDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
((ScriptGroupDefns) model).setScriptGroupDefnPid(rs.getInt("SCRIPT_GROUP_DEFN_PID"));
((ScriptGroupDefns) model).setActionTypeKey(rs.getShort("ACTION_TYPE_KEY"));
((ScriptGroupDefns) model).setInputFocusTypeKey(rs.getShort("INPUT_FOCUS_TYPE_KEY"));
((ScriptGroupDefns) model).setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
((ScriptGroupDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((ScriptGroupDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((ScriptGroupDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
((ScriptGroupDefns) model).setShow(rs.getBoolean("SHOW"));
ps.executeUpdate();
}

@Override
public void put(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(UPDATE);
((ScriptGroupDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
((ScriptGroupDefns) model).setSetKey(rs.getShort("SET_KEY"));
((ScriptGroupDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
((ScriptGroupDefns) model).setScriptGroupDefnPid(rs.getInt("SCRIPT_GROUP_DEFN_PID"));
((ScriptGroupDefns) model).setActionTypeKey(rs.getShort("ACTION_TYPE_KEY"));
((ScriptGroupDefns) model).setInputFocusTypeKey(rs.getShort("INPUT_FOCUS_TYPE_KEY"));
((ScriptGroupDefns) model).setInputSubTypeKey(rs.getShort("INPUT_SUB_TYPE_KEY"));
((ScriptGroupDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((ScriptGroupDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((ScriptGroupDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
((ScriptGroupDefns) model).setShow(rs.getBoolean("SHOW"));
ps.executeUpdate();
}

/**
* Get the RecordNum field.
*
* @return Contents of the RECORD_NUM column
*/
public int getRecordNum() {
return this.RecordNum;
}

/**
* Get the SetKey field.
*
* @return Contents of the SET_KEY column
*/
public short getSetKey() {
return this.SetKey;
}

/**
* Get the CommitPid field.
*
* @return Contents of the COMMIT_PID column
*/
public int getCommitPid() {
return this.CommitPid;
}

/**
* Get the ScriptGroupDefnPid field.
*
* @return Contents of the SCRIPT_GROUP_DEFN_PID column
*/
public int getScriptGroupDefnPid() {
return this.ScriptGroupDefnPid;
}

/**
* Get the ActionTypeKey field.
*
* @return Contents of the ACTION_TYPE_KEY column
*/
public short getActionTypeKey() {
return this.ActionTypeKey;
}

/**
* Get the InputFocusTypeKey field.
*
* @return Contents of the INPUT_FOCUS_TYPE_KEY column
*/
public short getInputFocusTypeKey() {
return this.InputFocusTypeKey;
}

/**
* Get the InputSubTypeKey field.
*
* @return Contents of the INPUT_SUB_TYPE_KEY column
*/
public short getInputSubTypeKey() {
return this.InputSubTypeKey;
}

/**
* Get the ReminderKey field.
*
* @return Contents of the REMINDER_KEY column
*/
public short getReminderKey() {
return this.ReminderKey;
}

/**
* Get the DisplayOrder field.
*
* @return Contents of the DISPLAY_ORDER column
*/
public short getDisplayOrder() {
return this.DisplayOrder;
}

/**
* Get the IsDefault field.
*
* @return Contents of the IS_DEFAULT column
*/
public boolean getIsDefault() {
return this.IsDefault;
}

/**
* Get the Show field.
*
* @return Contents of the SHOW column
*/
public boolean getShow() {
return this.Show;
}

/**
* Set the RecordNum field
*
* @param RecordNum Contents of the RECORD_NUM column
*/
public void setRecordNum(int RecordNum) {
this.RecordNum = RecordNum;
}

/**
* Set the SetKey field
*
* @param SetKey Contents of the SET_KEY column
*/
public void setSetKey(short SetKey) {
this.SetKey = SetKey;
}

/**
* Set the CommitPid field
*
* @param CommitPid Contents of the COMMIT_PID column
*/
public void setCommitPid(int CommitPid) {
this.CommitPid = CommitPid;
}

/**
* Set the ScriptGroupDefnPid field
*
* @param ScriptGroupDefnPid Contents of the SCRIPT_GROUP_DEFN_PID column
*/
public void setScriptGroupDefnPid(int ScriptGroupDefnPid) {
this.ScriptGroupDefnPid = ScriptGroupDefnPid;
}

/**
* Set the ActionTypeKey field
*
* @param ActionTypeKey Contents of the ACTION_TYPE_KEY column
*/
public void setActionTypeKey(short ActionTypeKey) {
this.ActionTypeKey = ActionTypeKey;
}

/**
* Set the InputFocusTypeKey field
*
* @param InputFocusTypeKey Contents of the INPUT_FOCUS_TYPE_KEY column
*/
public void setInputFocusTypeKey(short InputFocusTypeKey) {
this.InputFocusTypeKey = InputFocusTypeKey;
}

/**
* Set the InputSubTypeKey field
*
* @param InputSubTypeKey Contents of the INPUT_SUB_TYPE_KEY column
*/
public void setInputSubTypeKey(short InputSubTypeKey) {
this.InputSubTypeKey = InputSubTypeKey;
}

/**
* Set the ReminderKey field
*
* @param ReminderKey Contents of the REMINDER_KEY column
*/
public void setReminderKey(short ReminderKey) {
this.ReminderKey = ReminderKey;
}

/**
* Set the DisplayOrder field
*
* @param DisplayOrder Contents of the DISPLAY_ORDER column
*/
public void setDisplayOrder(short DisplayOrder) {
this.DisplayOrder = DisplayOrder;
}

/**
* Set the IsDefault field
*
* @param IsDefault Contents of the IS_DEFAULT column
*/
public void setIsDefault(boolean IsDefault) {
this.IsDefault = IsDefault;
}

/**
* Set the Show field
*
* @param Show Contents of the SHOW column
*/
public void setShow(boolean Show) {
this.Show = Show;
}

}

