package test;

import dataaccess.*;

public class InterfaceTest {
    public static void main(String[] args) {
        IDataAccess data = new MySQLImplementation();
        //data.list();
        print(data);
        
        data = new OracleImplementation();
        //data.list();
        print(data);
        
    }
    
    public static void print(IDataAccess data){
        data.list();
    }
}
