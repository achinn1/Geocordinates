package shortestmile.utils;

import java.sql.SQLException;

/**
 * @author achinn1
 * 
 * This Class used for Get Store Info to extract the particular store using APache Knox API.
 * TODO Develop as Apache Knox JDBC CALL
 *
 */
public class GetStoreInfo {
	
	public static void main(String[] args) {
		String query="select * from store_info where postal_code IN (72712)";
		//try {
			//executeQuery(query);
		//} catch (SQLException e) {
			//e.printStackTrace();
		//}
		//closeConnection();
	}

}
