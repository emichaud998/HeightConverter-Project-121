public class HeightConverter{
 public static void main(String[] args){
    double conversionFactor = (2.54);
    String myName = ("Emily Michaud");
    int myAge = (19);
    int myHeightInches = (65);
    double myHeightCM = (myHeightInches*conversionFactor);
System.out.println(myName);
System.out.println("age: " + myAge);
System.out.println("height: " + myHeightInches + " inches");
System.out.println("height: " + myHeightCM + " cm");
}
}