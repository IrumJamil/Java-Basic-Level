import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        window = primaryStage;
        window.setTitle("JavaFX - Zeeshan");

        TreeItem<String> root, zee, ali;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Bucky
        zee = makeBranch("Zeeshan", root);
        makeBranch("Java", zee);
        makeBranch("Python", zee);
        makeBranch("C sharp", zee);

        //Megan
        ali = makeBranch("Ali", root);
        makeBranch("PHP", ali);
        makeBranch("java", ali);

        //Create the tree and hide the main Root
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                    if (newValue != null)
                        System.out.println(newValue.getValue());
                });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    //Create branches
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}