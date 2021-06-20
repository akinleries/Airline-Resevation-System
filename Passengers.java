package airline;

public class Passengers {
    private String passengersFirstName;
    private String passengersLastName;
    private String passengersEmailAddress;
    private FlightType passengersFlightType;
    private int passengersSeatNumber;
    private String phoneNumber;


  public Passengers(){

  }

    public Passengers(String passengersFirstName, String passengersLastName, String passengersEmailAddress, String phoneNumber) {
        this.passengersFirstName = passengersFirstName;
        this.passengersLastName = passengersLastName;
        this.passengersEmailAddress = passengersEmailAddress;
        this.phoneNumber = phoneNumber;

    }

    public String displayBoardPass() {
        String display = "Name        :" + passengersFirstName + " " + passengersLastName+ "\n" +
                         "Email       :" + passengersEmailAddress + "\n" +
                         "Flight      :" + passengersFlightType + "\n" +
                         "Seat Number :" + passengersSeatNumber;

        return display;
    }

    public String getPassengersFirstName() {
        return passengersFirstName;
    }

    public void setPassengersFirstName(String passengersFirstName) {
        this.passengersFirstName = passengersFirstName;
    }

    public String getPassengersLastName() {
        return passengersLastName;
    }

    public void setPassengersLastName(String passengersLastName) {
        this.passengersLastName = passengersLastName;
    }

    public String getPassengersEmailAddress() {
        return passengersEmailAddress;
    }

    public void setPassengersEmailAddress(String passengersEmailAddress) {
        this.passengersEmailAddress = passengersEmailAddress;
    }

    public FlightType getPassengersFlightType() {
        return passengersFlightType;
    }

    public void setPassengersFlightType(FlightType passengersFlightType) {
        this.passengersFlightType = passengersFlightType;
    }

    public int getPassengersSeatNumber() {
        return passengersSeatNumber;
    }

    public void setPassengersSeatNumber(int passengersSeatNumber) {
        this.passengersSeatNumber = passengersSeatNumber;
    }
}
