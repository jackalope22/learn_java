public class Droid{
    
    String name;
    int batteryLevel = 100;
    
    public Droid(String droidName){
        name = droidName;
    }

    public String toString(){
        return "Hello I am the droid: "+name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void reCharge() {
        batteryLevel = 100;
        System.out.println("battery recharged");
    }

    public void batteryStatus() {
        System.out.println("battery at "+batteryLevel+"%");
    }

    public static void main(String[] args) {
        Droid codey = new Droid("codey");
        System.out.println(codey);
        codey.performTask("running");
        codey.batteryStatus();
        codey.performTask("digging");
        codey.batteryStatus();
        codey.reCharge();
        codey.batteryStatus();

    }
}