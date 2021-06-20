package airline;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.security.SecureRandom;

public class AirlineReservationSystem {
    private String passengersFirstName;
    private String passengersLastName;
    private String passengersEmailAddress;
    boolean[] flightSeats = new boolean[10];



    public boolean confirmEmptySeats() {
        for (int i = 0; i < flightSeats.length; i++) {
            flightSeats[i] = false;
        }
        return false;
    }

    public String displayAlternative() {
        String displayAlternative = """
                Press 1 For First Class.
                Press 2 For Economy.
                """;
        return displayAlternative;
    }

}
