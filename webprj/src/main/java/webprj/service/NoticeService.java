package webprj.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import webprj.entity.Notice;

public interface NoticeService {

	 List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	// Scalar 
	 int getCount() throws ClassNotFoundException, SQLException;
	 int insert(Notice notice) throws SQLException, ClassNotFoundException;
	 int update(Notice notice) throws SQLException, ClassNotFoundException;
	 int delete(int id) throws ClassNotFoundException, SQLException; 

}
