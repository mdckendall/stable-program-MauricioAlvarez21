public class Horse extends Stable{
  String Name;
  Double Weight;
  boolean isTame;

  public Horse(String Name, Double Weight, boolean isTame){
    this.Name=Name;
    this.Weight=Weight;
    this.isTame=isTame;
  }
  public String Name(){
    return Name;
  }
  public Double Weight(){
    return Weight;
  }
  public boolean isTame(){
    return isTame;
  }
  }
  //Create the Horse class here.