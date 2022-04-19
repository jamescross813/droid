public class Droid{
    String name;
    int batteryLevel;
  
  
    public Droid(String droidName){
      this.name = droidName;
      this.batteryLevel = 100;
    }
  
    public String toString(){
      return "Hello, I'm the droid: " + this.name;
    }
  
    public void performTask(String task){
      System.out.println(this.name +" is performing task: " + task);
      this.batteryLevel -=10;
      this.energyReport();
    }
  
    public void energyReport(){
      System.out.println("Current battery level is: " + this.batteryLevel);
    }
  
    public static void main(String[] args){
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("dancing");
      // codey.energyReport();
      codey.performTask("chatting");
    }
  }