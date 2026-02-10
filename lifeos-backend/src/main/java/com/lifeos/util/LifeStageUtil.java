package com.lifeos.util;
public class LifeStageUtil {
 public static String calculateLifeStage(int age){
  if(age<=12) return "FOUNDATION";
  if(age<=18) return "EXPLORATION";
  if(age<=25) return "SKILL_BUILDING";
  if(age<=35) return "INCOME_GROWTH";
  if(age<=50) return "STABILITY";
  if(age<=65) return "SECURITY";
  return "WELLBEING";
 }
}