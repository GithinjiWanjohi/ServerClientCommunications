import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ToyView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //creating label toy code
        Text toy_code = new Text("ToyView Code");

        //Creating Text Field for toy code
        TextField textToyCode = new TextField();

        //creating label toy code
        Text toy_name = new Text("ToyView Name");

        //Creating Text Field for toy name
        TextField textToyName = new TextField();

        //creating label description
        Text description = new Text("Description");

        //Creating Text Field for description
         TextField textDescription = new TextField();

        //creating label price
        Text price = new Text("Price");

        //Creating Text Field for price
        TextField textPrice = new TextField();

        //creating label dom
        Text dom = new Text("Date of Manufacture");

        //Creating Text Field for dom
        TextField textDom = new TextField();

        //creating label batch number
        Text batch_number = new Text("Batch Number");

        //Creating Text Field for batch no
        TextField textBatch = new TextField();

        //creating label Manufacturer Name
        Text manufacturer_name = new Text("Manufacturer Name");

        //Creating Text Field for Manufacturer Name
        TextField textManuName = new TextField();

        //creating label address
        Text man_address = new Text("Manufacturer Address");

        //Creating Text Field for Manufacturer Address
        TextField textAddress = new TextField();

        //creating label Zip code
        Text zip_code = new Text("Zip Code");

        //Creating Text Field for Zip code
        TextField textZipCode = new TextField();

        //creating label Country
        Text country = new Text("Country");

        //Creating Text Field for Country
        TextField textCountry = new TextField();

        //creating label password
        Text text2 = new Text("Password");

        //Creating Text Filed for password
        PasswordField textField2 = new PasswordField();

        //Creating Buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(toy_code, 0, 0);
        gridPane.add(textToyCode, 1, 0);
        gridPane.add(toy_name, 0, 1);
        gridPane.add(textToyName, 1, 1);
        gridPane.add(description, 0, 2);
        gridPane.add(textDescription, 1, 2);
        gridPane.add(price, 0, 3);
        gridPane.add(textPrice, 1, 3);
        gridPane.add(dom, 0, 4);
        gridPane.add(textDom, 1, 4);
        gridPane.add(batch_number, 0, 5);
        gridPane.add(textBatch, 1, 5);
        gridPane.add(manufacturer_name, 0, 6);
        gridPane.add(textManuName, 1, 6);
        gridPane.add(man_address, 0, 7);
        gridPane.add(textAddress, 1, 7);
        gridPane.add(zip_code, 0, 8);
        gridPane.add(textZipCode, 1, 8);
        gridPane.add(country, 0, 9);
        gridPane.add(textCountry, 1, 9);

        //Styling nodes
//        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
//        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

//        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
//        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
//        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        primaryStage.setTitle("ToyView Details");

        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }
}
