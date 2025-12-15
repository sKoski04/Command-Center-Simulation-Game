package Services;

import Models.Soldier;

public class SoldierService implements GeneralizedService {
    @Override
    public String getServiceName() {
        return "SoldierService";
    }

    public void heal(Soldier soldier, int amount){


    }
    public void damage(Soldier soldier, int amount){

    }

    public void supply(Soldier soldier){
//TODO: add the items that soldier gets and add them to parameters
    }

}
