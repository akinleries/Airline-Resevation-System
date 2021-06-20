package airline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class airlineReservationTest {



    @BeforeEach
    void startWith(){

    }

    @Test

    void confirmedThatAirlineIsCreated(){
        AirlineReservation airlineReservation =  new AirlineReservation();
        assertNotNull(airlineReservation);
    }

    @Test
    void checkThatSystemCanAssignSeats(){
        AirlineReservation airlineReservation =  new AirlineReservation();
        assertTrue(airlineReservation.isAssignSeats(1));
        assertTrue(airlineReservation.isAssignSeats(1));
        assertTrue(airlineReservation.isAssignSeats(1));
    }

    @Test
    void checkThatSystemCanAssignSeatInFirstClass(){
        AirlineReservation airlineReservation =  new AirlineReservation();
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        assertEquals(5, airlineReservation.assignFirstClassSeats());

    }

    @Test
    void checkThatSystemCanAssignSeatInEconomy(){
        AirlineReservation airlineReservation =  new AirlineReservation();
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        assertEquals(5, airlineReservation.assignEconomySeats());
    }

    @Test
    void checkThatSystemCanDisplayPassengersBoardPass(){
        AirlineReservation airlineReservation =  new AirlineReservation();
        assertNotNull(airlineReservation.displayBoardPass());
    }

    @Test
    void checkThatSystemCanDisplayFirstClassBoardPass(){
        AirlineReservation airlineReservation =  new AirlineReservation("lasisi","akin","qwerty","123456");
        assertNotNull(airlineReservation.displayFirstClassBoardPass());

        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        airlineReservation.isAssignSeats(1);
        assertEquals(5, airlineReservation.assignFirstClassSeats());
    }
    @Test
    void checkThatSystemCanDisplayEconomyBoardPass(){
        AirlineReservation airlineReservation = new AirlineReservation("adf","eeotor","derftg","12345");
        assertNotNull(airlineReservation.displayEconomyBoardPass());

        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        airlineReservation.isAssignSeats(2);
        assertEquals(5, airlineReservation.assignEconomySeats());
    }

}
