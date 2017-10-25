package jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "    " + rs.getString(2) + "    " + rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			rs.close();
			st.close();
			con.close();
		}

	}
}
