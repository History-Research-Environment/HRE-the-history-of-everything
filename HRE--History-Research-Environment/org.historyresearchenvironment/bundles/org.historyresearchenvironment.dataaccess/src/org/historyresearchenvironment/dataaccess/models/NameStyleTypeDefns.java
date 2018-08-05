package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* The persistent class for the NAME_STYLE_TYPE_DEFNS database table.
*
* @version 2018-08-05
* @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
*
*/

public class NameStyleTypeDefns extends AbstractHreDataModel {
private static final long serialVersionUID = 1L;
private ArrayList<AbstractHreDataModel> modelList;
private static final String SELECT = "SELECT " +
"RECORD_NUM, " +
"SET_KEY, " +
"COMMIT_PID, " +
"NAME_STYLE_TYPE_DEFN_PID, " +
"IS_SYSTEM, " +
"ENTITY_TYPE_KEY, " +
"ENTITY_SUB_TYPE_KEY, " +
"START_USAGE_PID, " +
"END_USAGE_PID, " +
"REMINDER_KEY, " +
"DISPLAY_ORDER, " +
"IS_DEFAULT, " +
"SHOW FROM PUBLIC.NAME_STYLE_TYPE_DEFNS WHERE NAME_STYLE_TYPE_DEFN_PID = ?";

private static final String SELECTALL = "SELECT " +
"RECORD_NUM, " +  
"SET_KEY, " +  
"COMMIT_PID, " +  
"NAME_STYLE_TYPE_DEFN_PID, " +  
"IS_SYSTEM, " +  
"ENTITY_TYPE_KEY, " +  
"ENTITY_SUB_TYPE_KEY, " +  
"START_USAGE_PID, " +  
"END_USAGE_PID, " +  
"REMINDER_KEY, " +  
"DISPLAY_ORDER, " +  
"IS_DEFAULT, " +  
"SHOW FROM PUBLIC.NAME_STYLE_TYPE_DEFNS";

private static final String INSERT = "INSERT INTO PUBLIC.NAME_STYLE_TYPE_DEFNS( " +
"RECORD_NUM, " +     
"SET_KEY, " +     
"COMMIT_PID, " +     
"NAME_STYLE_TYPE_DEFN_PID, " +     
"IS_SYSTEM, " +     
"ENTITY_TYPE_KEY, " +     
"ENTITY_SUB_TYPE_KEY, " +     
"START_USAGE_PID, " +     
"END_USAGE_PID, " +     
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
"?, " +
"?, " +
"?)";

private static final String UPDATE = "UPDATE PUBLIC.NAME_STYLE_TYPE_DEFNSSET " +
"RECORD_NUM = ?, " + 
"SET_KEY = ?, " + 
"COMMIT_PID = ?, " + 
"IS_SYSTEM = ?, " + 
"ENTITY_TYPE_KEY = ?, " + 
"ENTITY_SUB_TYPE_KEY = ?, " + 
"START_USAGE_PID = ?, " + 
"END_USAGE_PID = ?, " + 
"REMINDER_KEY = ?, " + 
"DISPLAY_ORDER = ?, " + 
"IS_DEFAULT = ?, " + 
"SHOW = ? WHERE NAME_STYLE_TYPE_DEFN_PID = ?";

private static final String DELETE = "DELETE FROM PUBLIC.NAME_STYLE_TYPE_DEFNS WHERE NAME_STYLE_TYPE_DEFN_PID = ?";

private static final String DELETEALL = "DELETE FROM PUBLIC.NAME_STYLE_TYPE_DEFNS";

private int RecordNum;
private short SetKey;
private int CommitPid;
private int NameStyleTypeDefnPid;
private boolean IsSystem;
private short EntityTypeKey;
private short EntitySubTypeKey;
private int StartUsagePid;
private int EndUsagePid;
private short ReminderKey;
private short DisplayOrder;
private boolean IsDefault;
private boolean Show;
private NameStyleTypeDefns model;

/**
* No-arg Constructor
*
* @throws SQLException If database access has failed
*/

public NameStyleTypeDefns() throws SQLException {
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
model = new NameStyleTypeDefns();
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setNameStyleTypeDefnPid(rs.getInt("NAME_STYLE_TYPE_DEFN_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
model.setStartUsagePid(rs.getInt("START_USAGE_PID"));
model.setEndUsagePid(rs.getInt("END_USAGE_PID"));
model.setReminderKey(rs.getShort("REMINDER_KEY"));
model.setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
model.setIsDefault(rs.getBoolean("IS_DEFAULT"));
model.setShow(rs.getBoolean("SHOW"));
modelList.add(model);
}
return modelList;
}

@Override
public NameStyleTypeDefns get(int key) throws SQLException {
model = new NameStyleTypeDefns();
ps = conn.prepareStatement(SELECT);
ps.setInt(1, (int) key);
rs = ps.executeQuery();
if (rs.next()) {
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setNameStyleTypeDefnPid(rs.getInt("NAME_STYLE_TYPE_DEFN_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
model.setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
model.setStartUsagePid(rs.getInt("START_USAGE_PID"));
model.setEndUsagePid(rs.getInt("END_USAGE_PID"));
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
((NameStyleTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
((NameStyleTypeDefns) model).setSetKey(rs.getShort("SET_KEY"));
((NameStyleTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
((NameStyleTypeDefns) model).setNameStyleTypeDefnPid(rs.getInt("NAME_STYLE_TYPE_DEFN_PID"));
((NameStyleTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((NameStyleTypeDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
((NameStyleTypeDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
((NameStyleTypeDefns) model).setStartUsagePid(rs.getInt("START_USAGE_PID"));
((NameStyleTypeDefns) model).setEndUsagePid(rs.getInt("END_USAGE_PID"));
((NameStyleTypeDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((NameStyleTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((NameStyleTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
((NameStyleTypeDefns) model).setShow(rs.getBoolean("SHOW"));
ps.executeUpdate();
}

@Override
public void put(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(UPDATE);
((NameStyleTypeDefns) model).setRecordNum(rs.getInt("RECORD_NUM"));
((NameStyleTypeDefns) model).setSetKey(rs.getShort("SET_KEY"));
((NameStyleTypeDefns) model).setCommitPid(rs.getInt("COMMIT_PID"));
((NameStyleTypeDefns) model).setNameStyleTypeDefnPid(rs.getInt("NAME_STYLE_TYPE_DEFN_PID"));
((NameStyleTypeDefns) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((NameStyleTypeDefns) model).setEntityTypeKey(rs.getShort("ENTITY_TYPE_KEY"));
((NameStyleTypeDefns) model).setEntitySubTypeKey(rs.getShort("ENTITY_SUB_TYPE_KEY"));
((NameStyleTypeDefns) model).setStartUsagePid(rs.getInt("START_USAGE_PID"));
((NameStyleTypeDefns) model).setEndUsagePid(rs.getInt("END_USAGE_PID"));
((NameStyleTypeDefns) model).setReminderKey(rs.getShort("REMINDER_KEY"));
((NameStyleTypeDefns) model).setDisplayOrder(rs.getShort("DISPLAY_ORDER"));
((NameStyleTypeDefns) model).setIsDefault(rs.getBoolean("IS_DEFAULT"));
((NameStyleTypeDefns) model).setShow(rs.getBoolean("SHOW"));
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
* Get the NameStyleTypeDefnPid field.
*
* @return Contents of the NAME_STYLE_TYPE_DEFN_PID column
*/
public int getNameStyleTypeDefnPid() {
return this.NameStyleTypeDefnPid;
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
* Get the EntityTypeKey field.
*
* @return Contents of the ENTITY_TYPE_KEY column
*/
public short getEntityTypeKey() {
return this.EntityTypeKey;
}

/**
* Get the EntitySubTypeKey field.
*
* @return Contents of the ENTITY_SUB_TYPE_KEY column
*/
public short getEntitySubTypeKey() {
return this.EntitySubTypeKey;
}

/**
* Get the StartUsagePid field.
*
* @return Contents of the START_USAGE_PID column
*/
public int getStartUsagePid() {
return this.StartUsagePid;
}

/**
* Get the EndUsagePid field.
*
* @return Contents of the END_USAGE_PID column
*/
public int getEndUsagePid() {
return this.EndUsagePid;
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
* Set the NameStyleTypeDefnPid field
*
* @param NameStyleTypeDefnPid Contents of the NAME_STYLE_TYPE_DEFN_PID column
*/
public void setNameStyleTypeDefnPid(int NameStyleTypeDefnPid) {
this.NameStyleTypeDefnPid = NameStyleTypeDefnPid;
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
* Set the EntityTypeKey field
*
* @param EntityTypeKey Contents of the ENTITY_TYPE_KEY column
*/
public void setEntityTypeKey(short EntityTypeKey) {
this.EntityTypeKey = EntityTypeKey;
}

/**
* Set the EntitySubTypeKey field
*
* @param EntitySubTypeKey Contents of the ENTITY_SUB_TYPE_KEY column
*/
public void setEntitySubTypeKey(short EntitySubTypeKey) {
this.EntitySubTypeKey = EntitySubTypeKey;
}

/**
* Set the StartUsagePid field
*
* @param StartUsagePid Contents of the START_USAGE_PID column
*/
public void setStartUsagePid(int StartUsagePid) {
this.StartUsagePid = StartUsagePid;
}

/**
* Set the EndUsagePid field
*
* @param EndUsagePid Contents of the END_USAGE_PID column
*/
public void setEndUsagePid(int EndUsagePid) {
this.EndUsagePid = EndUsagePid;
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

