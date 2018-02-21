package com.pixelduke.control;

import com.pixelduke.control.ribbon.RibbonGroup;
import com.pixelduke.control.ribbon.RibbonTab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by pedro_000 on 1/21/14.
 */
public class RibbonWithGroupsTest extends Application{

    @Override
    public void start(Stage primaryStage) {
        BorderPane rootNode = new BorderPane();
        Ribbon ribbon = new Ribbon();
        RibbonTab ribbonTab = new RibbonTab("Test");
        RibbonGroup ribbonGroup = new RibbonGroup();
        rootNode.setCenter(ribbon);

//        Image iconImage = new Image(getClass().getResourceAsStream("play.png"));
        Button iconButton = new Button("Play");
        iconButton.setContentDisplay(ContentDisplay.LEFT);
        ribbonGroup.getNodes().add(iconButton);

//        iconImage = new Image(getClass().getResourceAsStream("stop.png"));
        iconButton = new Button("Stop");
        iconButton.setContentDisplay(ContentDisplay.LEFT);
        ribbonGroup.getNodes().add(iconButton);

//        iconImage = new Image(getClass().getResourceAsStream("pause.png"));
        iconButton = new Button("Pause");
        iconButton.setContentDisplay(ContentDisplay.LEFT);
        ribbonGroup.getNodes().add(iconButton);

//        iconImage = new Image(getClass().getResourceAsStream("java/com/pixelduke/control/fastForward.png"));
        iconButton = new Button("Next");
        iconButton.setContentDisplay(ContentDisplay.LEFT);
        ribbonGroup.getNodes().add(iconButton);

        ribbonTab.getRibbonGroups().add(ribbonGroup);

        ribbonGroup = new RibbonGroup();
//        iconImage = new Image(getClass().getResourceAsStream("java/com/pixelduke/control/save.png"));
        iconButton = new Button("Save Results");
        iconButton.setContentDisplay(ContentDisplay.LEFT);
        ribbonGroup.getNodes().add(iconButton);

        ribbonTab.getRibbonGroups().add(ribbonGroup);


        ribbon.getTabs().add(ribbonTab);

        Scene scene = new Scene(rootNode);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
