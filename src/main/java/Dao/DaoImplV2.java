package Dao;

import org.springframework.stereotype.Repository;

@Repository("dao22")
public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("version webservice");
        double t=99;
        return t;
    }
}
