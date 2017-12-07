package counter.main;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Counter {

    public Label counter;
    private int startingNumber;

    public void pressButton(ActionEvent actionEvent) {
        counter.setText(addOne());
    }

    private String addOne() {
        startingNumber += 1;
        return Integer.toString(startingNumber);
    }
}
