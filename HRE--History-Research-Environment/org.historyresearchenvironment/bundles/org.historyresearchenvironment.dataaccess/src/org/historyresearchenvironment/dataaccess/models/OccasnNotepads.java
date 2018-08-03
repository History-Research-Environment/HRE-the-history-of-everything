package org.historyresearchenvironment.dataaccess.models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the OCCASN_NOTEPADS database table.
 *
 * @version 2018-08-03
 * @author H2ModelGenerator, &copy; History Research Environment Ltd., 2018
 *
 */

public class OccasnNotepads extends AbstractHreDataModel {
	private static final long serialVersionUID = 1L;
	private static final String SELECT = "SELECT " + "RECORD_NUM, " + "SET_KEYD, " + "COMMIT_PID, "
			+ "OCCASN_NOTEPAD_PID, " + "IS_SYSTEM, " + "PARENT_PID, " + "PARENT_SUB_TYPE_KEY, " + "NOTEPAD_DEFN_PID, "
			+ "NOTEPAD FROM PUBLIC.OCCASN_NOTEPADS WHERE OCCASN_NOTEPAD_PID = ?";
	private static final String SELECTALL = "SELECT " + "RECORD_NUM, " + "SET_KEYD, " + "COMMIT_PID, "
			+ "OCCASN_NOTEPAD_PID, " + "IS_SYSTEM, " + "PARENT_PID, " + "PARENT_SUB_TYPE_KEY, " + "NOTEPAD_DEFN_PID, "
			+ "NOTEPAD FROM PUBLIC.OCCASN_NOTEPADS";

	private static final String INSERT = "INSERT INTO PUBLIC.OCCASN_NOTEPADS( " + "RECORD_NUM, " + "SET_KEYD, "
			+ "COMMIT_PID, " + "OCCASN_NOTEPAD_PID, " + "IS_SYSTEM, " + "PARENT_PID, " + "PARENT_SUB_TYPE_KEY, "
			+ "NOTEPAD_DEFN_PID, " + "NOTEPAD) VALUES (?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, " + "?, "
			+ "?)";

	private static final String UPDATE = "UPDATE PUBLIC.OCCASN_NOTEPADSSET " + "RECORD_NUM = ?, " + "SET_KEYD = ?, "
			+ "COMMIT_PID = ?, " + "IS_SYSTEM = ?, " + "PARENT_PID = ?, " + "PARENT_SUB_TYPE_KEY = ?, "
			+ "NOTEPAD_DEFN_PID = ?, " + "NOTEPAD = ? WHERE OCCASN_NOTEPAD_PID = ?";

	private static final String DELETE = "DELETE FROM PUBLIC.OCCASN_NOTEPADS WHERE OCCASN_NOTEPAD_PID = ?";

	private static final String DELETEALL = "DELETE FROM PUBLIC.OCCASN_NOTEPADS";

	private ArrayList<AbstractHreDataModel> modelList;

	private int RecordNum;
	private short SetKeyd;
	private int CommitPid;
	private int OccasnNotepadPid;
	private boolean IsSystem;
	private int ParentPid;
	private short ParentSubTypeKey;
	private short NotepadDefnPid;
	private String Notepad;
	private OccasnNotepads model;

	public OccasnNotepads() throws SQLException {
	}

	public OccasnNotepads(int OccasnNotepadPid) throws SQLException {
		super();
		this.OccasnNotepadPid = OccasnNotepadPid;
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
			model = new OccasnNotepads();
			model.setRecordNum(rs.getInt("RECORD_NUM"));
			model.setSetKeyd(rs.getShort("SET_KEYD"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setOccasnNotepadPid(rs.getInt("OCCASN_NOTEPAD_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setParentPid(rs.getInt("PARENT_PID"));
			model.setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
			model.setNotepadDefnPid(rs.getShort("NOTEPAD_DEFN_PID"));
			model.setNotepad(rs.getString("NOTEPAD"));
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
			model.setSetKeyd(rs.getShort("SET_KEYD"));
			model.setCommitPid(rs.getInt("COMMIT_PID"));
			model.setOccasnNotepadPid(rs.getInt("OCCASN_NOTEPAD_PID"));
			model.setIsSystem(rs.getBoolean("IS_SYSTEM"));
			model.setParentPid(rs.getInt("PARENT_PID"));
			model.setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
			model.setNotepadDefnPid(rs.getShort("NOTEPAD_DEFN_PID"));
			model.setNotepad(rs.getString("NOTEPAD"));
		}
		return this;
	}

	public int getCommitPid() {
		return this.CommitPid;
	}

	public boolean getIsSystem() {
		return this.IsSystem;
	}

	public String getNotepad() {
		return this.Notepad;
	}

	public short getNotepadDefnPid() {
		return this.NotepadDefnPid;
	}

	public int getOccasnNotepadPid() {
		return this.OccasnNotepadPid;
	}

	public int getParentPid() {
		return this.ParentPid;
	}

	public short getParentSubTypeKey() {
		return this.ParentSubTypeKey;
	}

	public int getRecordNum() {
		return this.RecordNum;
	}

	public short getSetKeyd() {
		return this.SetKeyd;
	}

	@Override
	public void post(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(INSERT);
		((OccasnNotepads) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((OccasnNotepads) model).setSetKeyd(rs.getShort("SET_KEYD"));
		((OccasnNotepads) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((OccasnNotepads) model).setOccasnNotepadPid(rs.getInt("OCCASN_NOTEPAD_PID"));
		((OccasnNotepads) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((OccasnNotepads) model).setParentPid(rs.getInt("PARENT_PID"));
		((OccasnNotepads) model).setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
		((OccasnNotepads) model).setNotepadDefnPid(rs.getShort("NOTEPAD_DEFN_PID"));
		((OccasnNotepads) model).setNotepad(rs.getString("NOTEPAD"));
		ps.executeUpdate();
	}

	@Override
	public void put(AbstractHreDataModel model) throws SQLException {
		ps = conn.prepareStatement(UPDATE);
		((OccasnNotepads) model).setRecordNum(rs.getInt("RECORD_NUM"));
		((OccasnNotepads) model).setSetKeyd(rs.getShort("SET_KEYD"));
		((OccasnNotepads) model).setCommitPid(rs.getInt("COMMIT_PID"));
		((OccasnNotepads) model).setOccasnNotepadPid(rs.getInt("OCCASN_NOTEPAD_PID"));
		((OccasnNotepads) model).setIsSystem(rs.getBoolean("IS_SYSTEM"));
		((OccasnNotepads) model).setParentPid(rs.getInt("PARENT_PID"));
		((OccasnNotepads) model).setParentSubTypeKey(rs.getShort("PARENT_SUB_TYPE_KEY"));
		((OccasnNotepads) model).setNotepadDefnPid(rs.getShort("NOTEPAD_DEFN_PID"));
		((OccasnNotepads) model).setNotepad(rs.getString("NOTEPAD"));
		ps.executeUpdate();
	}

	public void setCommitPid(int CommitPid) {
		this.CommitPid = CommitPid;
	}

	public void setIsSystem(boolean IsSystem) {
		this.IsSystem = IsSystem;
	}

	public void setNotepad(String Notepad) {
		this.Notepad = Notepad;
	}

	public void setNotepadDefnPid(short NotepadDefnPid) {
		this.NotepadDefnPid = NotepadDefnPid;
	}

	public void setOccasnNotepadPid(int OccasnNotepadPid) {
		this.OccasnNotepadPid = OccasnNotepadPid;
	}

	public void setParentPid(int ParentPid) {
		this.ParentPid = ParentPid;
	}

	public void setParentSubTypeKey(short ParentSubTypeKey) {
		this.ParentSubTypeKey = ParentSubTypeKey;
	}

	public void setRecordNum(int RecordNum) {
		this.RecordNum = RecordNum;
	}

	public void setSetKeyd(short SetKeyd) {
		this.SetKeyd = SetKeyd;
	}

}
