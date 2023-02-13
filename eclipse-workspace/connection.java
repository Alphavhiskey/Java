import java.sql.*;
public class connection {
public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Class.forName("come.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/batch24";
	String username="root";
	String password="root";
	Connection connection=DriverManager.getConnection(url, username, password);
	if(connection!=null)
		System.out.println("Connection eshtabilished");
//	Statement st=connection.createStatement();
//	int x=st.executeUpdate("insert into college values(1035,'user',246,'A','CSE')");
//	if(x!=0)
//		System.out.println("Record inserted");
	String sql="insert into college values(?,?,?,?,?)";
	PreparedStatement ps=connection.prepareStatement(sql);
	ps.setInt(1,1032);
	ps.setString(2,"java");
	ps.setInt(3, 542);
	ps.setString(4, "A");
	ps.setString(5, "CSE");
	int x=ps.executeUpdate();
	if(x!=0)
		System.out.println("executed");
		
}

}
