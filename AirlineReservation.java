package airline;

public class AirlineReservation {

    private String passengersFirstName;
    private String passengersLastName;
    private String passengersEmailAddress;
    private FlightType passengersFlightType;
    private String phoneNumber;
    private boolean[]  flightSeats = new boolean[10];
    private  int firstClassSeatCapacity = 0;
    private  int economySeatCapacity = 0;


    public AirlineReservation(){

    }


    public AirlineReservation(String passengersFirstName, String passengersLastName, String passengersEmailAddress, String phoneNumber) {
        this.passengersFirstName = passengersFirstName;
        this.passengersLastName = passengersLastName;
        this.passengersEmailAddress = passengersEmailAddress;
        this.phoneNumber = phoneNumber;

    }



    public boolean isAssignSeats(int passengerInput) {
        if (passengerInput == 1){
            for (int i = 0; i < flightSeats.length/2 ; i++) {
                if (!flightSeats[i]){
                    System.out.println("Your ticket" + "\n" + "Seat Number   : "  + "000"+ (i + 1));
                    System.out.println(displayFirstClassBoardPass());
                    firstClassSeatCapacity++;
                    System.out.println(flightSeats[i] = true);
                    return flightSeats[i] = true;
                }
            }
        }

      else if (passengerInput == 2){
            for (int i = 5; i <= flightSeats.length; i++) {
                if (!flightSeats[i]){
                    System.out.println("Your ticket" + "\n" + "Seat Number   : "  + "000"+ (i + 1));
                    System.out.println(displayEconomyBoardPass());
                    economySeatCapacity++;
                    System.out.println(flightSeats[i] = true);
                    return flightSeats[i] = true;
                }
            }
        }
    return false;
    }

    public int assignFirstClassSeats(){
           return firstClassSeatCapacity;
    }
    public int assignEconomySeats(){
           return economySeatCapacity;
    }

    public String displayBoardPass() {
        String display ="Name          :" + passengersFirstName + " " + passengersLastName+ "\n" +
                        "Email         :" + passengersEmailAddress + "\n" +
                        "Flight        :" + passengersFlightType + "\n" +
                        "Phone Number  :" + phoneNumber;

        return display;
    }

    public String displayFirstClassBoardPass(){
        String display ="Name          :" + passengersFirstName + " " + passengersLastName+ "\n" +
                        "Email         :" + passengersEmailAddress + "\n" +
                        "Flight        :" + FlightType.FIRSTCLASS + "\n" +
                        "Phone Number  :" + phoneNumber + "\n" + "\n";

        return display;

    }

    public String displayEconomyBoardPass() {
        String display ="Name          :" + passengersFirstName + " " + passengersLastName+ "\n" +
                        "Email         :" + passengersEmailAddress + "\n" +
                        "Flight        :" + FlightType.ECONOMY + "\n" +
                        "Phone Number  :" + phoneNumber+ "\n" + "\n";

        return display;
    }

}



