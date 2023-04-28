/*
 * @author amy.antonucci and modified to calculate UTC by mark.ryan
 */
package c195datepickertolocaldatetimeandutc;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author amy.antonucci
 */
public class MainController implements Initializable {

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> cboHour;

    @FXML
    private ComboBox<String> cboMin;

    @FXML
    private Button btnOk;
    ObservableList<String> hours = FXCollections.observableArrayList();
    ObservableList<String> minutes = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        hours.addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23");
        minutes.addAll("00", "15", "30", "45");
        cboHour.setItems(hours);
        cboMin.setItems(minutes);
    }

    @FXML
    void handleButton(ActionEvent event) {
        if (datePicker.getValue() == null || cboHour.getValue() == null || cboMin.getValue() == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Date and time not completly filled in!");
            alert.setContentText("Please use the calendar date picker to select a date AND use the Hour and Minute dropdown to set hours and minutes before clicking this button");
            alert.setGraphic(null);
            alert.showAndWait();
        } else {
            LocalDate date = datePicker.getValue();
            String hour = cboHour.getValue();
            String minute = cboMin.getValue();
            // obtain the LocalDateTime
            LocalDateTime ldt = LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), Integer.parseInt(hour), Integer.parseInt(minute));
            // obtain the ZonedDateTime version of LocalDateTime
            ZonedDateTime locZdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
            // obtain the UTC ZonedDateTime of the ZonedDateTime version of LocalDateTime
            ZonedDateTime utcZdt = locZdt.withZoneSameInstant(ZoneOffset.UTC);
            Alert alert = new Alert(AlertType.INFORMATION);
            // make it look good in 24 hour format sortable by yyyy-MM-dd HH:mm:ss  (we are going to ignore fractions beyond seconds
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            alert.setTitle("Time and Date");
            alert.setHeaderText(null);
            alert.setContentText(
                    "Locale.getDefault().toString:" + Locale.getDefault().toString()
                    + "\n\n"
                    + "ZoneOffset.systemDefault:" + ZoneOffset.systemDefault()
                    + "\n\n"
                    + "Local Date and Time:" + customFormatter.format(locZdt)
                    + "\n\n"
                    + "UTC Date and Time:" + customFormatter.format(utcZdt)
            );

            alert.showAndWait();
        }
    }

    @FXML
    void handleDatePicker(ActionEvent event) {

    }

    @FXML
    void handleHour(ActionEvent event) {

    }

    @FXML
    void handleMinute(ActionEvent event) {

    }
}
