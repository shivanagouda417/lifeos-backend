package com.lifeos.engine;

import com.lifeos.model.CityProfile;
import com.lifeos.model.CitySignal;

public class CitySignalAnalyzer {

    public CityProfile analyze(String cityName, CitySignal signal) {

        CityProfile city = new CityProfile();
        city.setCityName(cityName);

        city.setFoodDeliveryPresence(
                signal.getRestaurants() > 100 ? "HIGH" :
                        signal.getRestaurants() > 30 ? "MEDIUM" : "LOW"
        );

        city.setPetrolPumpDensity(
                signal.getPetrolPumps() > 20 ? "HIGH" :
                        signal.getPetrolPumps() > 8 ? "MEDIUM" : "LOW"
        );

        city.setConstructionActivity(
                signal.getConstructionSites() > 15 ? "HIGH" :
                        signal.getConstructionSites() > 5 ? "MEDIUM" : "LOW"
        );

        city.setRetailShopDensity(
                signal.getRetailShops() > 80 ? "HIGH" :
                        signal.getRetailShops() > 30 ? "MEDIUM" : "LOW"
        );

        city.setLogisticsActivity(
                signal.getLogisticsHubs() > 10 ? "HIGH" :
                        signal.getLogisticsHubs() > 3 ? "MEDIUM" : "LOW"
        );

        return city;
    }
}
