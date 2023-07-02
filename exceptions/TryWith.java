package exceptions;
import java.sql.*;

public class TryWith {
    
    public static void viewTable(Connection con) throws SQLException {
        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
        
        try (Statement st = con.createStatement()){
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " + 
                                    price + ", " + sales + ", " + total);
            }
        } catch (SQLException e){
            System.out.println("SQLException" + e.getMessage());
            // JDBCTutorialUtilities.printSQLException(e);
        }
    }
}
