package data.model;
import java.sql.*;
import java.lang.Exception;

public class JDBC {

    private String  compStName;


    public JDBC() {
    }

    public String getCompStName() {
        return compStName;
    }

    public void setCompStName(String compStName) {
        this.compStName = compStName;
    }

    public void returnStudentFromData() {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Computer_lab","computer_lab");
            Statement stmt=con.createStatement();
            ResultSet rst=stmt.executeQuery("select*from computer_student");

            while(rst.next())

            {
                String computer_student=rst.getString(2);

                setCompStName(computer_student);
            }
            con.close();


        }
        catch(Exception e)
        {
          System.out.println(e);
        }

        }


}
