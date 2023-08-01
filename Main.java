import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


      //  ArrayList<Vehicle> ArrayLIstvehicle = new ArrayList<>();
        VehicleManagement vehicleManagement = new VehicleManagement();
        int choice;
        boolean activated = true;

        String tipoVechiculo;
        String maker;
        String model;
        int year;
        int wheel;
        int velocity;
        int numSeats;
        int cylinder;
        int pedalCadence;
        int distancia;

        Car car;
        Bicycle bicycle;
        MotorCycle motorCycle;


        String[] typeVehicle = new String[3];
        typeVehicle[0] = "Carro";
        typeVehicle[1] = "Bicicleta";
        typeVehicle[2] = "Motocicleta";


        do {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog(null, getMenu()));


                switch (choice) {
                    case 1:
                        String opt = (String) JOptionPane.showInputDialog(null, "Elija el Vehiculo:", "Vehiculos", JOptionPane.INFORMATION_MESSAGE, null, typeVehicle, typeVehicle[0]);

                        if (opt.equals("Carro")) {


                            tipoVechiculo = opt;

                            try {
                                wheel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Ruedas:"));
                                velocity = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad (m/h):"));
                                numSeats = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de Asientos:"));


                                car = new Car(tipoVechiculo, wheel, velocity, numSeats);
                                vehicleManagement.create(car);



                            JOptionPane.showMessageDialog(null, "El vehiculo se registró con exito");

                           double newDistance  = Double.parseDouble ( JOptionPane.showInputDialog(null, "Ingresar la distancia (m) "));


                            double time =    vehicleManagement.calculateTime(car,newDistance);

                           JOptionPane.showMessageDialog(null, "El tiempo que le tomará desplazarse al vehiculo es: " +time + " h" );

                            }
                            catch (NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"Dato no ingresado");
                            }


                        } else if (opt.equals("Motocicleta")) {

                            tipoVechiculo = opt;


                            wheel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Ruedas:"));
                            velocity = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad (m/h): "));
                            cylinder = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad de cilindraje:"));


                            motorCycle = new MotorCycle(tipoVechiculo, wheel, velocity, cylinder);
                            vehicleManagement.create(motorCycle);

                            JOptionPane.showMessageDialog(null, "El vehiculo se registró con exito:");

                            double newDistance  = Double.parseDouble ( JOptionPane.showInputDialog(null, "Ingresar la distancia (m) "));


                            double time =    vehicleManagement.calculateTime(motorCycle,newDistance);

                            JOptionPane.showMessageDialog(null, "El tiempo que le tomará desplazarse al vehiculo es: "+ time + " h");



                        } else if (opt.equals("Bicicleta")) {

                            tipoVechiculo = opt;


                            wheel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero de Ruedas:"));
                            velocity = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad (m/h): "));
                            pedalCadence = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cadencia de Pedaleo:"));

                            bicycle = new Bicycle(tipoVechiculo, wheel, velocity, pedalCadence);
                            vehicleManagement.create(bicycle);
                            JOptionPane.showMessageDialog(null, "El vehiculo se registró con exito");

                            double newDistance  = Double.parseDouble ( JOptionPane.showInputDialog(null, "Ingresar la distancia (m) "));


                            double time =    vehicleManagement.calculateTime(bicycle,newDistance);

                            JOptionPane.showMessageDialog(null, "El tiempo que le tomará desplazarse al vehiculo es: " + time + " h" );


                        }


                        break;
                    case 2:
                        vehicleManagement.read();

                        break;


                    case 3:

                        activated = false;
                        JOptionPane.showMessageDialog(null, "Ha salido del sistema");
                        System.exit(1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida");
                        break;

                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, " No ha seleccionado ninguna opción");

            }
        } while (activated);

    }


    public static String getMenu() {

        String menu = "--------------------------------------------------------------" + "\n";
        menu += "CALCULO DE TIEMPO EN RECORRER DISTANCIA" + "\n";
        menu += "                        " + "\n";
        menu += "Seleccione la opción que desea realizar:" + "\n";
        menu += "1- Ingrese Vehiculo y Distancia para calcular tiempo" + "\n";
        menu += "2- Consultar  Vehículos ingresados" + "\n";
        menu += "3- Salir" + "\n";

        return menu;


    }


}