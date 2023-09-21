package ghofuba.belajarspringdasar;

public class Database {

    private static Database database;

    public static  Database getInstance(){
       // return database == null ? new Database() : database;

        if (database == null) {
            new Database();
        }
            return database;

    }


    private Database(){

    }
}
