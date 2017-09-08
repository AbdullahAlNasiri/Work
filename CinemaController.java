import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinemaController {
    /*
    * sum integer to store final price
    * standardTicks, oapTicks etc to store how many of those tickets selected in combo box
    * */

    private ticket model;
    private View view;
    private int sum;
    private int standardTicks;
    private int oapTicks;
    private int studentTicks;
    private int childTicks;

    public CinemaController(final ticket model, final View view){
        this.model = model;
        this.view = view;


        //Button listener to calculate the total price
        view.purchaseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Get how many of each ticket selected
                standardTicks = (Integer)view.comboBox1.getSelectedItem();
                oapTicks = (Integer)view.comboBox2.getSelectedItem();
                studentTicks = (Integer)view.comboBox3.getSelectedItem();
                childTicks = (Integer)view.comboBox4.getSelectedItem();

                //Adding together all ticket prices multiplied by how many of them is selected
                sum = (model.getStandard()*standardTicks) + (model.getOAP()*oapTicks) + (model.getStudent()*studentTicks)
                    + (model.getChild()*childTicks);


                //Dialog produces showing final price
                JOptionPane.showMessageDialog(null, "The total cost of tickets for this movie is £" + sum);


            }
        });

    }

    public void updateView(){
        view.setPrices(model.getStandard(), model.getOAP(), model.getStudent(), model.getChild());
    }
}
