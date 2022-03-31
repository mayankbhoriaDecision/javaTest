




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {
    public static void main(String[] args) throws Exception
    {
        
        //fill your code here


         String QUERY = "SELECT id, title, category, Author,Price FROM book";



        DBConnection ConnectOBJ = new DBConnection();


        try
        {

        Connection conn=ConnectOBJ.getConnection();

        Statement stmt = conn.createStatement();



        String sqlTable =   "CREATE TABLE book"+
                            "(id number(10) not null, " +
                            "title VARCHAR2(45) not null, " +
                            "category VARCHAR2(45) not null, "+
                            "author VARCHAR2(45) not null, "+
                            "price binary_double not null, "+
                            "primary key(id)) ";  


      //  stmt.executeUpdate(sqlTable);

              
         Statement stmt2 = conn.createStatement();



        ResultSet rs = stmt2.executeQuery(QUERY);


        System.out.println("List of Books");



 
         System.out.format("%-5s %-20s %-20s %-10s %s\n","Id","Title","Category","Author","Price");


        while(rs.next()){
            //Display values
          

                            


            System.out.format("%-5s %-20s %-20s %-10s %s\n",rs.getInt("id"),rs.getString("title"),rs.getString("category"),rs.getString("author"),rs.getDouble("price"));





         }

        }
        catch (SQLException e) {
         e.printStackTrace();
      } 





    }
}
