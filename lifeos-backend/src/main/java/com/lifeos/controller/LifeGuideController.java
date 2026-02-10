package com.lifeos.controller;
import com.lifeos.engine.CityOpportunityEngine;
import com.lifeos.engine.CitySignalAnalyzer;
import com.lifeos.model.*;
import com.lifeos.util.LifeStageUtil;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/life-guide")
public class LifeGuideController {
 @PostMapping("/suggest")
 public Object suggest(@RequestBody UserProfile user) {

  CitySignal signal = new CitySignal();
  signal.setRestaurants(120);
  signal.setPetrolPumps(18);
  signal.setConstructionSites(22);
  signal.setRetailShops(95);
  signal.setHospitals(12);
  signal.setLogisticsHubs(7);

  CitySignalAnalyzer analyzer = new CitySignalAnalyzer();
  CityProfile city = analyzer.analyze(user.getCityName(), signal);

  user.setAge(2026 - user.getDob().getYear());

  String lifeStage = LifeStageUtil.calculateLifeStage(user.getAge());

  CityOpportunityEngine engine = new CityOpportunityEngine();

  return Map.of(
          "lifeStage", lifeStage,
          "cityReality", city,
          "suggestions", engine.suggest(user, city)
  );
 }

}