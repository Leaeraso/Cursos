package dataaccess;

public interface IDataAccess {
    int MAX_REGISTRO = 10;
    
    void insert();
    
    void list();
    
    void update();
    
    void delete();
}
