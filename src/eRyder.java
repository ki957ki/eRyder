public class eRyder {
public String bikeId;
public int batteryLevel;
public boolean isAvailable;
public double kmDriven;

public eRyder(){
    bikeId ="Unknown";
    batteryLevel =0;
    isAvailable = false;
    kmDriven =0.0;
}

public eRyder(String bikeId, int batteryLevel,boolean isAvailable, double kmDriven){
    this.bikeId = bikeId;
    this.batteryLevel = batteryLevel;
    this.isAvailable = isAvailable;
    this.kmDriven = kmDriven;
}
public String getBikeId(){
    return bikeId;
}
public void setBikeId(String bikeId){
    this.bikeId = bikeId;
}

public int getBatteryLevel(){
    return batteryLevel;
}

public void setBatteryLevel(int b){
if (b<100 && b>0) {
    this.batteryLevel =b;  
}else{
    System.out.println("Battery level is not valid");
}
}
public boolean getIsAvailable(){
    return isAvailable;
}
public void setIsAvailable(boolean isAvailable){
    this.isAvailable = isAvailable;
}
public double getKmDriven(){
    return kmDriven;
}
public void setKmDriven(double kmDriven){
    this.kmDriven = kmDriven;
}
public void printBikeDetails(){
    System.out.println("Bike ID:"+bikeId);
    System.out.println("Battery Lavel:"+batteryLevel);
    System.out.println("Is Available:"+isAvailable);
    System.out.println("Kilometers Driven:"+kmDriven);
}
public void ride(int batteryLevel,boolean isAvailable){

    if (batteryLevel >0 && isAvailable ==true) {
        System.out.println("You can ride the bike");

        
    }else{
        System.out.println("You cannot ride the bike");
    }

}





}
