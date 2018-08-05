package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* The persistent class for the DIGITAL_NAMES database table.
*
* @version 2018-08-05
* @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
*
*/

public class DigitalNames extends AbstractHreDataModel {
private static final long serialVersionUID = 1L;
private ArrayList<AbstractHreDataModel> modelList;
private static final String SELECT = "SELECT " +
"RECORD_NUM, " +
"SET_KEY, " +
"COMMIT_PID, " +
"DIGITAL_NAME_PID, " +
"IS_SYSTEM, " +
"PARENT_SUB_TYPE_KEY, " +
"PARENT_PID, " +
"NAME_TAG_KEY, " +
"NAME_STYLE_KEY, " +
"ELEMENTS_ENTERED, " +
"THIS_HDATE_PID, " +
"THIS_NAME_EVENT_PID, " +
"THIS_HDATE_INFERRED, " +
"NEXT_HDATE_PID, " +
"NEXT_NAME_EVENT_PID, " +
"NEXT_HDATE_INFERRED, " +
"THEME_KEY, " +
"SENTCE_SET_KEY, " +
"SENTCE_TYPE_KEY, " +
"SENTCE_STYLE_KEY, " +
"MEMO_SET_PID FROM PUBLIC.DIGITAL_NAMES WHERE DIGITAL_NAME_PID = ?";

private static final String SELECTALL = "SELECT " +
"RECORD_NUM, " +  
"SET_KEY, " +  
"COMMIT_PID, " +  
"DIGITAL_NAME_PID, " +  
"IS_SYSTEM, " +  
"PARENT_SUB_TYPE_KEY, " +  
"PARENT_PID, " +  
"NAME_TAG_KEY, " +  
"NAME_STYLE_KEY, " +  
"ELEMENTS_ENTERED, " +  
"THIS_HDATE_PID, " +  
"THIS_NAME_EVENT_PID, " +  
"THIS_HDATE_INFERRED, " +  
"NEXT_HDATE_PID, " +  
"NEXT_NAME_EVENT_PID, " +  
"NEXT_HDATE_INFERRED, " +  
"THEME_KEY, " +  
"SENTCE_SET_KEY, " +  
"SENTCE_TYPE_KEY, " +  
"SENTCE_STYLE_KEY, " +  
"MEMO_SET_PID FROM PUBLIC.DIGITAL_NAMES";

private static final String INSERT = "INSERT INTO PUBLIC.DIGITAL_NAMES( " +
"RECORD_NUM, " +     
"SET_KEY, " +     
"COMMIT_PID, " +     
"DIGITAL_NAME_PID, " +     
"IS_SYSTEM, " +     
"PARENT_SUB_TYPE_KEY, " +     
"PARENT_PID, " +     
"NAME_TAG_KEY, " +     
"NAME_STYLE_KEY, " +     
"ELEMENTS_ENTERED, " +     
"THIS_HDATE_PID, " +     
"THIS_NAME_EVENT_PID, " +     
"THIS_HDATE_INFERRED, " +     
"NEXT_HDATE_PID, " +     
"NEXT_NAME_EVENT_PID, " +     
"NEXT_HDATE_INFERRED, " +     
"THEME_KEY, " +     
"SENTCE_SET_KEY, " +     
"SENTCE_TYPE_KEY, " +     
"SENTCE_STYLE_KEY, " +     
"MEMO_SET_PID) VALUES (?, " +
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
"?, " +
"?, " +
"?, " +
"?, " +
"?, " +
"?)";

private static final String UPDATE = "UPDATE PUBLIC.DIGITAL_NAMESSET " +
"RECORD_NUM = ?, " + 
"SET_KEY = ?, " + 
"COMMIT_PID = ?, " + 
"IS_SYSTEM = ?, " + 
"PARENT_SUB_TYPE_KEY = ?, " + 
"PARENT_PID = ?, " + 
"NAME_TAG_KEY = ?, " + 
"NAME_STYLE_KEY = ?, " + 
"ELEMENTS_ENTERED = ?, " + 
"THIS_HDATE_PID = ?, " + 
"THIS_NAME_EVENT_PID = ?, " + 
"THIS_HDATE_INFERRED = ?, " + 
"NEXT_HDATE_PID = ?, " + 
"NEXT_NAME_EVENT_PID = ?, " + 
"NEXT_HDATE_INFERRED = ?, " + 
"THEME_KEY = ?, " + 
"SENTCE_SET_KEY = ?, " + 
"SENTCE_TYPE_KEY = ?, " + 
"SENTCE_STYLE_KEY = ?, " + 
"MEMO_SET_PID = ? WHERE DIGITAL_NAME_PID = ?";

private static final String DELETE = "DELETE FROM PUBLIC.DIGITAL_NAMES WHERE DIGITAL_NAME_PID = ?";

private static final String DELETEALL = "DELETE FROM PUBLIC.DIGITAL_NAMES";

private int RecordNum;
private short SetKey;
private int CommitPid;
private int DigitalNamePid;
private boolean IsSystem;
private short ParentSubTypeKey;
private int ParentPid;
private short NameTagKey;
private short NameStyleKey;
private byte[] ElementsEntered;
private int ThisHdatePid;
private int ThisNameEventPid;
private boolean ThisHdateInferred;
private int NextHdatePid;
private int NextNameEventPid;
private boolean NextHdateInferred;
private short ThemeKey;
private int SentceSetKey;
private short SentceTypeKey;
private short SentceStyleKey;
private int MemoSetPid;
private DigitalNames model;

/**
* No-arg Constructor
*
* @throws SQLException If database access has failed
*/

public DigitalNames() throws SQLException {
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
model = new DigitalNames();
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setDigitalNamePid(rs.getInt("DIGITAL_NAME_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
model.setParentPid(rs.getInt("PARENT_PID"));
model.setNameTagKey(rs.getShort("NAME_TAG_KEY"));
model.setNameStyleKey(rs.getShort("NAME_STYLE_KEY"));
model.setElementsEntered(rs.getBytes("ELEMENTS_ENTERED"));
model.setThisHdatePid(rs.getInt("THIS_HDATE_PID"));
model.setThisNameEventPid(rs.getInt("THIS_NAME_EVENT_PID"));
model.setThisHdateInferred(rs.getBoolean("THIS_HDATE_INFERRED"));
model.setNextHdatePid(rs.getInt("NEXT_HDATE_PID"));
model.setNextNameEventPid(rs.getInt("NEXT_NAME_EVENT_PID"));
model.setNextHdateInferred(rs.getBoolean("NEXT_HDATE_INFERRED"));
model.setThemeKey(rs.getShort("THEME_KEY"));
model.setSentceSetKey(rs.getInt("SENTCE_SET_KEY"));
model.setSentceTypeKey(rs.getShort("SENTCE_TYPE_KEY"));
model.setSentceStyleKey(rs.getShort("SENTCE_STYLE_KEY"));
model.setMemoSetPid(rs.getInt("MEMO_SET_PID"));
modelList.add(model);
}
return modelList;
}

@Override
public DigitalNames get(int key) throws SQLException {
model = new DigitalNames();
ps = conn.prepareStatement(SELECT);
ps.setInt(1, (int) key);
rs = ps.executeQuery();
if (rs.next()) {
model.setRecordNum(rs.getInt("RECORD_NUM"));
model.setSetKey(rs.getShort("SET_KEY"));
model.setCommitPid(rs.getInt("COMMIT_PID"));
model.setDigitalNamePid(rs.getInt("DIGITAL_NAME_PID"));
model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
model.setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
model.setParentPid(rs.getInt("PARENT_PID"));
model.setNameTagKey(rs.getShort("NAME_TAG_KEY"));
model.setNameStyleKey(rs.getShort("NAME_STYLE_KEY"));
model.setElementsEntered(rs.getBytes("ELEMENTS_ENTERED"));
model.setThisHdatePid(rs.getInt("THIS_HDATE_PID"));
model.setThisNameEventPid(rs.getInt("THIS_NAME_EVENT_PID"));
model.setThisHdateInferred(rs.getBoolean("THIS_HDATE_INFERRED"));
model.setNextHdatePid(rs.getInt("NEXT_HDATE_PID"));
model.setNextNameEventPid(rs.getInt("NEXT_NAME_EVENT_PID"));
model.setNextHdateInferred(rs.getBoolean("NEXT_HDATE_INFERRED"));
model.setThemeKey(rs.getShort("THEME_KEY"));
model.setSentceSetKey(rs.getInt("SENTCE_SET_KEY"));
model.setSentceTypeKey(rs.getShort("SENTCE_TYPE_KEY"));
model.setSentceStyleKey(rs.getShort("SENTCE_STYLE_KEY"));
model.setMemoSetPid(rs.getInt("MEMO_SET_PID"));
}
return model;
}

@Override
public void post(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(INSERT);
((DigitalNames) model).setRecordNum(rs.getInt("RECORD_NUM"));
((DigitalNames) model).setSetKey(rs.getShort("SET_KEY"));
((DigitalNames) model).setCommitPid(rs.getInt("COMMIT_PID"));
((DigitalNames) model).setDigitalNamePid(rs.getInt("DIGITAL_NAME_PID"));
((DigitalNames) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((DigitalNames) model).setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
((DigitalNames) model).setParentPid(rs.getInt("PARENT_PID"));
((DigitalNames) model).setNameTagKey(rs.getShort("NAME_TAG_KEY"));
((DigitalNames) model).setNameStyleKey(rs.getShort("NAME_STYLE_KEY"));
((DigitalNames) model).setElementsEntered(rs.getBytes("ELEMENTS_ENTERED"));
((DigitalNames) model).setThisHdatePid(rs.getInt("THIS_HDATE_PID"));
((DigitalNames) model).setThisNameEventPid(rs.getInt("THIS_NAME_EVENT_PID"));
((DigitalNames) model).setThisHdateInferred(rs.getBoolean("THIS_HDATE_INFERRED"));
((DigitalNames) model).setNextHdatePid(rs.getInt("NEXT_HDATE_PID"));
((DigitalNames) model).setNextNameEventPid(rs.getInt("NEXT_NAME_EVENT_PID"));
((DigitalNames) model).setNextHdateInferred(rs.getBoolean("NEXT_HDATE_INFERRED"));
((DigitalNames) model).setThemeKey(rs.getShort("THEME_KEY"));
((DigitalNames) model).setSentceSetKey(rs.getInt("SENTCE_SET_KEY"));
((DigitalNames) model).setSentceTypeKey(rs.getShort("SENTCE_TYPE_KEY"));
((DigitalNames) model).setSentceStyleKey(rs.getShort("SENTCE_STYLE_KEY"));
((DigitalNames) model).setMemoSetPid(rs.getInt("MEMO_SET_PID"));
ps.executeUpdate();
}

@Override
public void put(AbstractHreDataModel model) throws SQLException {
ps = conn.prepareStatement(UPDATE);
((DigitalNames) model).setRecordNum(rs.getInt("RECORD_NUM"));
((DigitalNames) model).setSetKey(rs.getShort("SET_KEY"));
((DigitalNames) model).setCommitPid(rs.getInt("COMMIT_PID"));
((DigitalNames) model).setDigitalNamePid(rs.getInt("DIGITAL_NAME_PID"));
((DigitalNames) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
((DigitalNames) model).setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
((DigitalNames) model).setParentPid(rs.getInt("PARENT_PID"));
((DigitalNames) model).setNameTagKey(rs.getShort("NAME_TAG_KEY"));
((DigitalNames) model).setNameStyleKey(rs.getShort("NAME_STYLE_KEY"));
((DigitalNames) model).setElementsEntered(rs.getBytes("ELEMENTS_ENTERED"));
((DigitalNames) model).setThisHdatePid(rs.getInt("THIS_HDATE_PID"));
((DigitalNames) model).setThisNameEventPid(rs.getInt("THIS_NAME_EVENT_PID"));
((DigitalNames) model).setThisHdateInferred(rs.getBoolean("THIS_HDATE_INFERRED"));
((DigitalNames) model).setNextHdatePid(rs.getInt("NEXT_HDATE_PID"));
((DigitalNames) model).setNextNameEventPid(rs.getInt("NEXT_NAME_EVENT_PID"));
((DigitalNames) model).setNextHdateInferred(rs.getBoolean("NEXT_HDATE_INFERRED"));
((DigitalNames) model).setThemeKey(rs.getShort("THEME_KEY"));
((DigitalNames) model).setSentceSetKey(rs.getInt("SENTCE_SET_KEY"));
((DigitalNames) model).setSentceTypeKey(rs.getShort("SENTCE_TYPE_KEY"));
((DigitalNames) model).setSentceStyleKey(rs.getShort("SENTCE_STYLE_KEY"));
((DigitalNames) model).setMemoSetPid(rs.getInt("MEMO_SET_PID"));
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
* Get the DigitalNamePid field.
*
* @return Contents of the DIGITAL_NAME_PID column
*/
public int getDigitalNamePid() {
return this.DigitalNamePid;
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
* Get the ParentSubTypeKey field.
*
* @return Contents of the PARENT_SUB_TYPE_KEY column
*/
public short getParentSubTypeKey() {
return this.ParentSubTypeKey;
}

/**
* Get the ParentPid field.
*
* @return Contents of the PARENT_PID column
*/
public int getParentPid() {
return this.ParentPid;
}

/**
* Get the NameTagKey field.
*
* @return Contents of the NAME_TAG_KEY column
*/
public short getNameTagKey() {
return this.NameTagKey;
}

/**
* Get the NameStyleKey field.
*
* @return Contents of the NAME_STYLE_KEY column
*/
public short getNameStyleKey() {
return this.NameStyleKey;
}

/**
* Get the ElementsEntered field.
*
* @return Contents of the ELEMENTS_ENTERED column
*/
public byte[] getElementsEntered() {
return this.ElementsEntered;
}

/**
* Get the ThisHdatePid field.
*
* @return Contents of the THIS_HDATE_PID column
*/
public int getThisHdatePid() {
return this.ThisHdatePid;
}

/**
* Get the ThisNameEventPid field.
*
* @return Contents of the THIS_NAME_EVENT_PID column
*/
public int getThisNameEventPid() {
return this.ThisNameEventPid;
}

/**
* Get the ThisHdateInferred field.
*
* @return Contents of the THIS_HDATE_INFERRED column
*/
public boolean getThisHdateInferred() {
return this.ThisHdateInferred;
}

/**
* Get the NextHdatePid field.
*
* @return Contents of the NEXT_HDATE_PID column
*/
public int getNextHdatePid() {
return this.NextHdatePid;
}

/**
* Get the NextNameEventPid field.
*
* @return Contents of the NEXT_NAME_EVENT_PID column
*/
public int getNextNameEventPid() {
return this.NextNameEventPid;
}

/**
* Get the NextHdateInferred field.
*
* @return Contents of the NEXT_HDATE_INFERRED column
*/
public boolean getNextHdateInferred() {
return this.NextHdateInferred;
}

/**
* Get the ThemeKey field.
*
* @return Contents of the THEME_KEY column
*/
public short getThemeKey() {
return this.ThemeKey;
}

/**
* Get the SentceSetKey field.
*
* @return Contents of the SENTCE_SET_KEY column
*/
public int getSentceSetKey() {
return this.SentceSetKey;
}

/**
* Get the SentceTypeKey field.
*
* @return Contents of the SENTCE_TYPE_KEY column
*/
public short getSentceTypeKey() {
return this.SentceTypeKey;
}

/**
* Get the SentceStyleKey field.
*
* @return Contents of the SENTCE_STYLE_KEY column
*/
public short getSentceStyleKey() {
return this.SentceStyleKey;
}

/**
* Get the MemoSetPid field.
*
* @return Contents of the MEMO_SET_PID column
*/
public int getMemoSetPid() {
return this.MemoSetPid;
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
* Set the DigitalNamePid field
*
* @param DigitalNamePid Contents of the DIGITAL_NAME_PID column
*/
public void setDigitalNamePid(int DigitalNamePid) {
this.DigitalNamePid = DigitalNamePid;
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
* Set the ParentSubTypeKey field
*
* @param ParentSubTypeKey Contents of the PARENT_SUB_TYPE_KEY column
*/
public void setParentSubTypeKey(short ParentSubTypeKey) {
this.ParentSubTypeKey = ParentSubTypeKey;
}

/**
* Set the ParentPid field
*
* @param ParentPid Contents of the PARENT_PID column
*/
public void setParentPid(int ParentPid) {
this.ParentPid = ParentPid;
}

/**
* Set the NameTagKey field
*
* @param NameTagKey Contents of the NAME_TAG_KEY column
*/
public void setNameTagKey(short NameTagKey) {
this.NameTagKey = NameTagKey;
}

/**
* Set the NameStyleKey field
*
* @param NameStyleKey Contents of the NAME_STYLE_KEY column
*/
public void setNameStyleKey(short NameStyleKey) {
this.NameStyleKey = NameStyleKey;
}

/**
* Set the ElementsEntered field
*
* @param ElementsEntered Contents of the ELEMENTS_ENTERED column
*/
public void setElementsEntered(byte[] ElementsEntered) {
this.ElementsEntered = ElementsEntered;
}

/**
* Set the ThisHdatePid field
*
* @param ThisHdatePid Contents of the THIS_HDATE_PID column
*/
public void setThisHdatePid(int ThisHdatePid) {
this.ThisHdatePid = ThisHdatePid;
}

/**
* Set the ThisNameEventPid field
*
* @param ThisNameEventPid Contents of the THIS_NAME_EVENT_PID column
*/
public void setThisNameEventPid(int ThisNameEventPid) {
this.ThisNameEventPid = ThisNameEventPid;
}

/**
* Set the ThisHdateInferred field
*
* @param ThisHdateInferred Contents of the THIS_HDATE_INFERRED column
*/
public void setThisHdateInferred(boolean ThisHdateInferred) {
this.ThisHdateInferred = ThisHdateInferred;
}

/**
* Set the NextHdatePid field
*
* @param NextHdatePid Contents of the NEXT_HDATE_PID column
*/
public void setNextHdatePid(int NextHdatePid) {
this.NextHdatePid = NextHdatePid;
}

/**
* Set the NextNameEventPid field
*
* @param NextNameEventPid Contents of the NEXT_NAME_EVENT_PID column
*/
public void setNextNameEventPid(int NextNameEventPid) {
this.NextNameEventPid = NextNameEventPid;
}

/**
* Set the NextHdateInferred field
*
* @param NextHdateInferred Contents of the NEXT_HDATE_INFERRED column
*/
public void setNextHdateInferred(boolean NextHdateInferred) {
this.NextHdateInferred = NextHdateInferred;
}

/**
* Set the ThemeKey field
*
* @param ThemeKey Contents of the THEME_KEY column
*/
public void setThemeKey(short ThemeKey) {
this.ThemeKey = ThemeKey;
}

/**
* Set the SentceSetKey field
*
* @param SentceSetKey Contents of the SENTCE_SET_KEY column
*/
public void setSentceSetKey(int SentceSetKey) {
this.SentceSetKey = SentceSetKey;
}

/**
* Set the SentceTypeKey field
*
* @param SentceTypeKey Contents of the SENTCE_TYPE_KEY column
*/
public void setSentceTypeKey(short SentceTypeKey) {
this.SentceTypeKey = SentceTypeKey;
}

/**
* Set the SentceStyleKey field
*
* @param SentceStyleKey Contents of the SENTCE_STYLE_KEY column
*/
public void setSentceStyleKey(short SentceStyleKey) {
this.SentceStyleKey = SentceStyleKey;
}

/**
* Set the MemoSetPid field
*
* @param MemoSetPid Contents of the MEMO_SET_PID column
*/
public void setMemoSetPid(int MemoSetPid) {
this.MemoSetPid = MemoSetPid;
}

}

