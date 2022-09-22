package org.hrb.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.sql.DataSource;

import org.hrb.Model.User;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;
		
	public AppDAOImpl(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		
		String SQL="select * from user";
		List<User> listUsers=new ArrayList<User>();
		Connection conn = null;
		
		try {
			
			conn=dataSource.getConnection();
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				User temp=new User(
						rs.getInt("user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getString("first_name"),
						rs.getString("last_name"));
				
				listUsers.add(temp);
				
			}
		rs.close();
		ps.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException  e) {
					e.printStackTrace();
				}
			}
		}
		
		return listUsers;
	}

}














