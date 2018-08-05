package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* The persistent class for the SUBSTN_OTHER_ALIASES database table.
*
* @version 2018-08-05
* @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
*
*/

public class SubstnOtherAliases extends AbstractHreDataModel {
private static final long serialVersionUID = 1L;
private ArrayList<AbstractHreDataModel> modelList;
private static final String SELECT = "SELECT " +
"RECORD_NUM, " +
"SET_KEY, " +
"COMMIT_PID, " +
"SUBSTN_OTHER_ALIAS_PID, " +
"IS_SYSTEM, " +
"IS_TEXT_LAYOUT_RELATED, " +
"IS_TEXT_STYLE_RELATED, " +
"TOP_STEP_KEY, " +
"REQUESTER_TYPE_KEY, " +
"REQUESTER_SUB_TYPE_KEY, " +
"OUTPUT_TYPE_KEY, " +
"OUTPUT_SUB_TYPE_KEY, " +
"PARAM_LIST_KEY, " +
"REMINDER_KEY, " +
"DISPLAY_ORDER, " +
"SHOW FROM PUBLIC.SUBSTN_OTHER_ALIASES WHERE SUBSTN_OTHER_ALIAS_PID = ?";

private static final String SELECTALL = "SELECT " +
"RECORD_NUM, " +  
"SET_KEY, " +  
"COMMIT_PID, " +  
"SUBSTN_OTHER_ALIAS_PID, " +  
"IS_SYSTEM, " +  
"IS_TEXT_LAYOUT_RELATED, " +  
"IS_TEXT_STYLE_RELATED, " +  
"TOP_STEP_KEY, " +  
"REQUESTER_TYPE_KEY, " +  
"REQUESTER_SUB_TYPE_KEY, " +  
"OUTPUT_TYPE_KEY, " +  
"OUTPUT_SUB_TYPE_KEY, " +  
"PARAM_LIST_KEY, " +  
"REMINDER_KEY, " +  
"DISPLAY_ORDER, " +  
"SHOW FROM PUBLIC.SUBSTN_OTHER_ALIASES";

private static final String INSERT = "INSERT INTO PUBLIC.SUBSTN_OTHER_ALIASES( " +
"RECORD_NUM, " +     
"SET_KEY, " +     
"COMMIT_PID, " +     
"SUBSTN_OTHER_ALIAS_PID, " +     
"IS_SYSTEM, " +     
"IS_TEXT_LAYOUT_RELATED, " +     
"IS_TEXT_STYLE_RELATED, " +     
"TOP_STEP_KEY, " +     
"REQUESTER_TYPE_KEY, " +     
"REQUESTER_SUB_TYPE_KEY, " +     
"OUTPUT_TYPE_KEY, " +     
"OUTPUT_SUB_TYPE_KEY, " +     
"PARAM_LIST_KEY, " +     
"REMINDER_KEY, " +     
"DISPLAY_ORDER, " +     
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
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?)";

private static final String UPDATE = "UPDATE PUBLIC.SUBSTN_OTHER_ALIASESSET " +
"RECORD_NUM = ?, " + 
"SET_KEY = ?, " + 
"COMMIT_PID = ?, " + 
"IS_SYSTEM = ?, " + 
"IS_TEXT_LAYOUT_RELATED = ?, " + 
"IS_TEXT_STYLE_RELATED = ?, " + 
"TOP_STEP_KEY = ?, " + 
"REQUESTER_TYPE_KEY = ?, " + 
"REQUESTER_SUB_TYPE_KEY = ?, " + 
"OUTPUT_TYPE_KEY = ?, " + 
"OUTPUT_SUB_TYPE_KEY = ?, " + 
"PARAM_LIST_KEY = ?, " + 
"REMINDER_KEY = ?, " + 
"DISPLAY_ORDER = ?, " + 
"SHOW = ? WHERE SUBSTN_OTHER_ALIAS_PID = ?";

private static final String DELETE = "DELETE FROM PUBLIC.SUBSTN_OTHER_ALIASES WHERE SUBSTN_OTHER_ALIAS_PID = ?";

private static final String DELETEALL = "DELETE FROM PUBLIC.SUBSTN_OTHER_ALIASES";

private int RecordNum;
private short SetKey;
private int CommitPid;
private int SubstnOtherAliasPid;
private boolean IsSystem;
private boolean IsTextLayoutRelated;
private boolean IsTextStyleRelated;
private short TopStepKey;
private short RequesterTypeKey;
private short RequesterSubTypeKey;
private short OutputTypeKey;
private short OutputSubTypeKey;
private short ParamListKey;
private short ReminderKey;
private short DisplayOrder;
private boolean Show;
private SubstnOtherAliases model;

/**
* No-arg Constructor
*
* @throws SQLException If database access has failed
*/

public SubstnOtherAliases() throws SQLException {
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
model = new SubstnOtherAliases();
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setSubstnOtherAliasPid(rs.getInt("SUBSTN_OTHER_ALIAS_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setIsTextLayoutRelated(rs.getBoolean("IS_TEXT_LAYOUT_RELATED"));
model.setIsTextStyleRelated(rs.getBoolean("IS_TEXT_STYLE_RELATED"));
model.setTopStepKey(rs.getShort("TOP_STEP_KEY"));
model.setRequesterTypeKey(rs.getShort("REQUESTER_TYPE_KEY"));
model.setRequesterSubTypeKey(rs.getShort("REQUESTER_SUB_TYPE_KEY"));
model.setOutputTypeKey(rs.getShort("OUTPUT_TYPE_KEY"));
model.setOutputSubTypeKey(rs.getShort("OUTPUT_SUB_TYPE_KEY"));
model.setParamListKey(rs.getShort("PARAM_LIST_KEY"));
model.setReminderKey(rs.getShort("REMINDER_KEY"));
model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
model.setShow(rs.getBoolean("SHOW"));
modelList.add(model);
}
return modelList;
}

@Override
public SubstnOtherAliases get(int key) throws SQLException {
model = new SubstnOtherAliases();
ps = conn.prepareStatement(SELECT);
ps.setInt(1, (int) key);
rs = ps.executeQuery();
if (rs.next()) {
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setSubstnOtherAliasPid(rs.getInt("SUBSTN_OTHER_ALIAS_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setIsTextLayoutRelated(rs.getBoolean("IS_TEXT_LAYOUT_RELATED"));
model.setIsTextStyleRelated(rs.getBoolean("IS_TEXT_STYLE_RELATED"));
model.setTopStepKey(rs.getShort("TOP_STEP_KEY"));
model.setRequesterTypeKey(rs.getShort("REQUESTER_TYPE_KEY"));
model.setRequesterSubTypeKey(rs.getShort("REQUESTER_SUB_TYPE_KEY"));
model.setOutputTypeKey(rs.getShort("OUTPUT_TYPE_KEY"));
model.setOutputSubTypeKey(rs.getShort("OUTPUT_SUB_TYPE_KEY"));
model.setParamListKey(rs.getShort("PARAM_LIST_KEY"));
model.setReminderKey(rs.getShort("REMINDER_KEY"));
model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
model.setShow(rs.getBoolean("SHOW"));
}
return model;
}

@Override
public void post(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(INSERT);
((SubstnOtherAliases) model).setRecordNum(rs.getInt("RECORD_NUM"));
((SubstnOtherAliases) model).setSetKey(rs.getShort("SET_KEY"));
((SubstnOtherAliases) model).setCommitPid(rs.getInt("COMMIT_PID"));
((SubstnOtherAliases) model).setSubstnOtherAliasPid(rs.getInt("SUBSTN_OTHER_ALIAS_PID"));
((SubstnOtherAliases) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((SubstnOtherAliases) model).setIsTextLayoutRelated(rs.getBoolean("IS_TEXT_LAYOUT_RELATED"));
((SubstnOtherAliases) model).setIsTextStyleRelated(rs.getBoolean("IS_TEXT_STYLE_RELATED"));
((SubstnOtherAliases) model).setTopStepKey(rs.getShort("TOP_STEP_KEY"));
((SubstnOtherAliases) model).setRequesterTypeKey(rs.getShort("REQUESTER_TYPE_KEY"));
((SubstnOtherAliases) model).setRequesterSubTypeKey(rs.getShort("REQUESTER_SUB_TYPE_KEY"));
((SubstnOtherAliases) model).setOutputTypeKey(rs.getShort("OUTPUT_TYPE_KEY"));
((SubstnOtherAliases) model).setOutputSubTypeKey(rs.getShort("OUTPUT_SUB_TYPE_KEY"));
((SubstnOtherAliases) model).setParamListKey(rs.getShort("PARAM_LIST_KEY"));
((SubstnOtherAliases) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((SubstnOtherAliases) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((SubstnOtherAliases) model).setShow(rs.getBoolean("SHOW"));
ps.executeUpdate();
}

@Override
public void put(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(UPDATE);
((SubstnOtherAliases) model).setRecordNum(rs.getInt("RECORD_NUM"));
((SubstnOtherAliases) model).setSetKey(rs.getShort("SET_KEY"));
((SubstnOtherAliases) model).setCommitPid(rs.getInt("COMMIT_PID"));
((SubstnOtherAliases) model).setSubstnOtherAliasPid(rs.getInt("SUBSTN_OTHER_ALIAS_PID"));
((SubstnOtherAliases) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((SubstnOtherAliases) model).setIsTextLayoutRelated(rs.getBoolean("IS_TEXT_LAYOUT_RELATED"));
((SubstnOtherAliases) model).setIsTextStyleRelated(rs.getBoolean("IS_TEXT_STYLE_RELATED"));
((SubstnOtherAliases) model).setTopStepKey(rs.getShort("TOP_STEP_KEY"));
((SubstnOtherAliases) model).setRequesterTypeKey(rs.getShort("REQUESTER_TYPE_KEY"));
((SubstnOtherAliases) model).setRequesterSubTypeKey(rs.getShort("REQUESTER_SUB_TYPE_KEY"));
((SubstnOtherAliases) model).setOutputTypeKey(rs.getShort("OUTPUT_TYPE_KEY"));
((SubstnOtherAliases) model).setOutputSubTypeKey(rs.getShort("OUTPUT_SUB_TYPE_KEY"));
((SubstnOtherAliases) model).setParamListKey(rs.getShort("PARAM_LIST_KEY"));
((SubstnOtherAliases) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((SubstnOtherAliases) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((SubstnOtherAliases) model).setShow(rs.getBoolean("SHOW"));
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
* Get the SubstnOtherAliasPid field.
*
* @return Contents of the SUBSTN_OTHER_ALIAS_PID column
*/
public int getSubstnOtherAliasPid() {
return this.SubstnOtherAliasPid;
}

/**
* Get the IsSystem field.
*
* @return Contents of the IS_SYSTEM column
*/
public boolean getIsSystem() {
return this.IsSystem;
}

/**
* Get the IsTextLayoutRelated field.
*
* @return Contents of the IS_TEXT_LAYOUT_RELATED column
*/
public boolean getIsTextLayoutRelated() {
return this.IsTextLayoutRelated;
}

/**
* Get the IsTextStyleRelated field.
*
* @return Contents of the IS_TEXT_STYLE_RELATED column
*/
public boolean getIsTextStyleRelated() {
return this.IsTextStyleRelated;
}

/**
* Get the TopStepKey field.
*
* @return Contents of the TOP_STEP_KEY column
*/
public short getTopStepKey() {
return this.TopStepKey;
}

/**
* Get the RequesterTypeKey field.
*
* @return Contents of the REQUESTER_TYPE_KEY column
*/
public short getRequesterTypeKey() {
return this.RequesterTypeKey;
}

/**
* Get the RequesterSubTypeKey field.
*
* @return Contents of the REQUESTER_SUB_TYPE_KEY column
*/
public short getRequesterSubTypeKey() {
return this.RequesterSubTypeKey;
}

/**
* Get the OutputTypeKey field.
*
* @return Contents of the OUTPUT_TYPE_KEY column
*/
public short getOutputTypeKey() {
return this.OutputTypeKey;
}

/**
* Get the OutputSubTypeKey field.
*
* @return Contents of the OUTPUT_SUB_TYPE_KEY column
*/
public short getOutputSubTypeKey() {
return this.OutputSubTypeKey;
}

/**
* Get the ParamListKey field.
*
* @return Contents of the PARAM_LIST_KEY column
*/
public short getParamListKey() {
return this.ParamListKey;
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
* Set the SubstnOtherAliasPid field
*
* @param SubstnOtherAliasPid Contents of the SUBSTN_OTHER_ALIAS_PID column
*/
public void setSubstnOtherAliasPid(int SubstnOtherAliasPid) {
this.SubstnOtherAliasPid = SubstnOtherAliasPid;
}

/**
* Set the IsSystem field
*
* @param IsSystem Contents of the IS_SYSTEM column
*/
public void setIsSystem(boolean IsSystem) {
this.IsSystem = IsSystem;
}

/**
* Set the IsTextLayoutRelated field
*
* @param IsTextLayoutRelated Contents of the IS_TEXT_LAYOUT_RELATED column
*/
public void setIsTextLayoutRelated(boolean IsTextLayoutRelated) {
this.IsTextLayoutRelated = IsTextLayoutRelated;
}

/**
* Set the IsTextStyleRelated field
*
* @param IsTextStyleRelated Contents of the IS_TEXT_STYLE_RELATED column
*/
public void setIsTextStyleRelated(boolean IsTextStyleRelated) {
this.IsTextStyleRelated = IsTextStyleRelated;
}

/**
* Set the TopStepKey field
*
* @param TopStepKey Contents of the TOP_STEP_KEY column
*/
public void setTopStepKey(short TopStepKey) {
this.TopStepKey = TopStepKey;
}

/**
* Set the RequesterTypeKey field
*
* @param RequesterTypeKey Contents of the REQUESTER_TYPE_KEY column
*/
public void setRequesterTypeKey(short RequesterTypeKey) {
this.RequesterTypeKey = RequesterTypeKey;
}

/**
* Set the RequesterSubTypeKey field
*
* @param RequesterSubTypeKey Contents of the REQUESTER_SUB_TYPE_KEY column
*/
public void setRequesterSubTypeKey(short RequesterSubTypeKey) {
this.RequesterSubTypeKey = RequesterSubTypeKey;
}

/**
* Set the OutputTypeKey field
*
* @param OutputTypeKey Contents of the OUTPUT_TYPE_KEY column
*/
public void setOutputTypeKey(short OutputTypeKey) {
this.OutputTypeKey = OutputTypeKey;
}

/**
* Set the OutputSubTypeKey field
*
* @param OutputSubTypeKey Contents of the OUTPUT_SUB_TYPE_KEY column
*/
public void setOutputSubTypeKey(short OutputSubTypeKey) {
this.OutputSubTypeKey = OutputSubTypeKey;
}

/**
* Set the ParamListKey field
*
* @param ParamListKey Contents of the PARAM_LIST_KEY column
*/
public void setParamListKey(short ParamListKey) {
this.ParamListKey = ParamListKey;
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
* Set the Show field
*
* @param Show Contents of the SHOW column
*/
public void setShow(boolean Show) {
this.Show = Show;
}

}

