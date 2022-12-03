package transport_main;

import transport_main.drivers.BusDriver;
import transport_main.drivers.PassengerCarDriver;
import transport_main.drivers.TruckDriver;
import transport_main.exceptions.DiagnosticFailedException;
import transport_main.transport.Bus;
import transport_main.transport.PassengerCar;
import transport_main.transport.Truck;

public class Main {
    public static void main(String[] args) throws DiagnosticFailedException {
        PassengerCar pajero = new PassengerCar("Mitsubishi", "Pajero", 3.2, PassengerCar.CarBodyType.JEEP);
        PassengerCar pathfinder = new PassengerCar("Nissan", "Pathfinder", 3.0, PassengerCar.CarBodyType.JEEP);
        PassengerCar outlander = new PassengerCar("Mitsubishi", "Outlander", 3.0, PassengerCar.CarBodyType.CROSSOVER);
        PassengerCar xTrail = new PassengerCar("Nissan", "X-Trail", 2.4, PassengerCar.CarBodyType.CROSSOVER);

        Bus nefaz5299 = new Bus("НефАЗ", "nefaz5299", 4.0, Bus.PassengerCapacity.MIDDLE);
        Bus maz206 = new Bus("МАЗ", "maz206", 5.0, Bus.PassengerCapacity.BIG);
        Bus gazeleCity = new Bus("ГАЗель", "gazeleCity", 3.0, Bus.PassengerCapacity.ESPECIALLY_SMALL);
        Bus bus4 = new Bus("", " ", -2.0, Bus.PassengerCapacity.SMALL);

        Truck valdaiNext = new Truck("Валдай", "NEXT", 2.8, Truck.Tonnage.N1);
        Truck kamaz5490= new Truck("КамАЗ", "5490", 12, Truck.Tonnage.N2);
        Truck manTgx = new Truck("MAN", "TGX", 12.4, Truck.Tonnage.N3);
        Truck volvoFh16 = new Truck("Volvo", "FH16", 16, Truck.Tonnage.N3);

        System.out.println(pajero);
        System.out.println(pathfinder);
        System.out.println(outlander);
        System.out.println(nefaz5299);
        System.out.println(maz206);
        System.out.println(gazeleCity);
        System.out.println(bus4);
        System.out.println(valdaiNext);
        System.out.println(kamaz5490);
        System.out.println(manTgx);
        System.out.println(volvoFh16);

        PassengerCarDriver<PassengerCar> hakkinen = new PassengerCarDriver<>("Hakkinen", true, 25);
        BusDriver<Bus> hamilton = new BusDriver<>("Hamilton", true, 18);
        TruckDriver<Truck> schumacher = new TruckDriver<>("Schumacher", true, 36);

        pajero.printType();
        gazeleCity.printType();
        valdaiNext.printType();

        pajero.passDiagnostics(hakkinen);
        gazeleCity.passDiagnostics(hamilton);
        valdaiNext.passDiagnostics(schumacher);
    }
}