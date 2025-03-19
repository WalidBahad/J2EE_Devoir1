package ext;

import Dao.IDao;

public class DaoImplV2 implements IDao {
    public double getData(){
        System.out.println("Version Web Service");
        double t=24;
        return t;
    }
}
