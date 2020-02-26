

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql extends Configuration 

{		Statement stmt ;
public Sql() throws IOException, SQLException {
	super();
	stmt = conn.createStatement(); 



}

public void Query(String sql) throws SQLException, IOException
{


	ResultSet rs1 = stmt.executeQuery(sql);
	Format_Query f = new Format_Query();
	f.Format(rs1);

}
public static void main(String [] args) throws IOException, SQLException

{
	Sql s= new Sql();
	String sql ="select film.Filmname,film.Year, director.Name AS 'DirectorName' from film INNER JOIN director ON director.iddirector=film.idFilm order by director.iddirector";
	//s.Create_Connection();
	s.Query(sql);
}
}
