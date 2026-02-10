package com.lifeos.engine;
import com.lifeos.model.*;
import java.util.*;
public class CityOpportunityEngine {
 public List<String> suggest(UserProfile user, CityProfile city){
  List<String> list=new ArrayList<>();
  if("HIGH".equals(city.getFoodDeliveryPresence()) && user.getAge()>=18 && user.getAge()<=35){
   list.add("Food delivery (Zomato/Swiggy)");
  }
  if("HIGH".equals(city.getConstructionActivity())){
   list.add("Construction related work");
  }
  return list;
 }
}