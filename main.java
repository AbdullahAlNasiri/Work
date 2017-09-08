import javax.swing.*;
import java.util.Calendar;

public class main {

    public static void main(String [] args)
    {
        //Initialise ticket model to set prices
        ticket model;

        //Create a view to update view
        View view = new View();

        //Create calendar to check what day it is. If Wednesday (4), then discount ticket else no discount ticket
        Calendar cal = Calendar.getInstance();
        int val = cal.get(Calendar.DAY_OF_WEEK);
        if (val==4) //4 represents Wednesday
        {
            //initialise model with discounted ticket object
            model = new discTicket();
        }
        else
        {
            //initialise model with normal ticket object
            model = new normalTicket();
        }

        //Initialise controller
        CinemaController controller = new CinemaController(model, view);
        //Update the GUI
        controller.updateView();
    }
}

