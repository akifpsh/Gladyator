import java.sql.*;

public class App {
    public static void main(String[] args){
        try{    
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/gladyator","root","Onurmysql.720");    
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from oyunlar");  
            while(rs.next()){
            System.out.println(rs.getInt(1)+
            rs.getString(2)+
            rs.getString(3)+
            rs.getString(4)+
            rs.getString(5)+
            rs.getDouble(6)+
            rs.getDouble(7)+
            rs.getDouble(8)+
            rs.getDouble(9)+
            rs.getInt(10)+
            rs.getInt(11)+
            rs.getInt(12));    
            };
            stmt.executeUpdate("insert into oyunlar values(2,'b','b','b','b',45,45,45,45,45,45,33)");
            rs = stmt.executeQuery("select * from oyunlar");
            while(rs.next()){
                System.out.println(rs.getInt(1)+
                rs.getString(2)+
                rs.getString(3)+
                rs.getString(4)+
                rs.getString(5)+
                rs.getDouble(6)+
                rs.getDouble(7)+
                rs.getDouble(8)+
                rs.getDouble(9)+
                rs.getInt(10)+
                rs.getInt(11)+
                rs.getInt(12));   
                //con.close(); 
                };
                con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

