import javax.swing.*;
import java.util.ArrayList;

public class VehicleManagement implements RecordsManagement{

    ArrayList<Vehicle> arrayListVehicle = new ArrayList<>();

    public ArrayList<Vehicle> getArrayListVehicle() {
        return arrayListVehicle;
    }

    public String[] getTypeVehicle() {

        // Iterator<Plane> it = arrayPlane.iterator();
        String[] typeVehicle = new String[arrayListVehicle.size()];


        for (int i = 0; i < arrayListVehicle.size(); i++) {

            typeVehicle[i] =  arrayListVehicle.get(i).getType();


        }
        return typeVehicle;

    }



    @Override
    public void create(Vehicle v) {

        arrayListVehicle.add(v);

    }

    @Override
    public void read() {

        String string = "";
        for (int i = 0; i < arrayListVehicle.size(); i++) {
            string += "Vehiculo " + (i + 1) + "------------------------------------\n";
            string += arrayListVehicle.get(i).getType() + " ----------->" + arrayListVehicle.get(i).getVelocity() + " m/h" +"\n";

        }

        JOptionPane.showMessageDialog(null,string);

    }

    public  double calculateTime(Vehicle vehicle, double distancia) {
        double time = 0;
        time = distancia / vehicle.getVelocity();

        return time;
    }




}
