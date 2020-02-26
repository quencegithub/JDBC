import java.io.IOException; 
import java.sql.ResultSet;
import java.sql.ResultSetMetaData; 
import java.sql.SQLException;

public class Format_Query extends Sql 
{

	public Format_Query() throws IOException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	ResultSet rs1; 
	public void Format(ResultSet rs1) throws SQLException {
		ResultSetMetaData rsMetaData = rs1.getMetaData();

		int numberOfColumns = rsMetaData.getColumnCount();

		for(int i = 1; i <= numberOfColumns; i++) {
			System.out.print(rsMetaData.getColumnLabel(i) + "   |   "); }
		System.out.println("\n===================================================");

		while(rs1.next())
			System.out.println(""+rs1.getString(1)+"   |   "+rs1.getInt(2)+"   |   "+rs1.
					getString(3)+"  |  ");


	} }
