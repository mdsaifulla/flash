package saif;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Jdbc {
	static String name,bjsid;
	static int marks1,marks2,marks3;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
DriverManager.registerDriver(new OracleDriver());
System.out.println("driver has been loaded");

Connection con=null;
Statement stmt=null;
ResultSet res=null;
String url="jdbc:oracle:thin:@//localhost:1521/XE/SAIFUL";
String user="system";
String password="saiful";

Class.forName("oracle.jdbc.driver.OracleDriver");

System.out.println("driver loaded this time also"); 

con=DriverManager.getConnection(url, user,password);
System.out.println("connection established successfully");

String s="select * from SAIFUL.STUDENT where bjsid=?" ;
stmt=con.createStatement();
res=stmt.executeQuery(s);
while(res.next()==true)
{
	 name=res.getString(1);
	 bjsid=res.getString(2);
	 marks1=res.getInt(3);
	 marks2=res.getInt(4);
	 marks3=res.getInt(5);
		
}
	
System.out.println(name+""+bjsid+""+marks1+""+marks2+""+marks3);
	}

}
