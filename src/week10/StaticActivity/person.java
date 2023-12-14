package week10.StaticActivity;

public class person {

 private int debt;
 private int netWorth;

 private static int personCount = 0;
 private String name;

 public person(String name, int debt, int netWorth){
  this.name = name;
  this.debt = debt;
  this.netWorth = netWorth;
  personCount++;
 }

 public String getName(){
  return name;
 }

 public int getDebt(){
  return debt;
 }

 public int getNetWorth(){
  return netWorth;
 }

 public int getPersonCount(){
  return personCount;
 }





}
