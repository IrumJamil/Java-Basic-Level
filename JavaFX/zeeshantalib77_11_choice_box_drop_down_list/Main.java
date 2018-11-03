import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application 
{
    Stage window;
    Scene scene;
    Button button;
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        window.setTitle("ChoiceBox Demo");
        button = new Button("Click Here");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Item A");
        choiceBox.getItems().add("Item B");
        choiceBox.getItems().addAll("Item C", "Item D", "Item E");

        //Set a default value
        choiceBox.setValue("Apples");

        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    //To get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox)
    {
        String food = choiceBox.getValue();
        System.out.println(food);
    }
}