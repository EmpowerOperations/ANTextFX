package com.empowerops.antextfx;

import com.empowerops.antextfx.mathy.MathyLexer;
import com.empowerops.antextfx.mathy.MathyParser;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Geoff on 6/6/2016.
 */
public class SampleApp extends Application {

    private static final String INITIAL_TEXT = "" +
            "This is a sample app!\n" +
            "1 + 2 / 3";

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();

        StructuredTextArea sampleArea = new StructuredTextArea(
                MathyParser.class,
                MathyLexer.class,
                MathyParser::block
        );

        root.getChildren().add(sampleArea);

        sampleArea.setImplicitTerminalStyle(true);
        sampleArea.getHighlighters().add(new LexicalBracketCountingHighlighter("(", ")", "bracket"));
        sampleArea.getStyleClass().add("code-area");

        sampleArea.replaceText(0, 0, INITIAL_TEXT);
        sampleArea.setPrefHeight(200);
        sampleArea.setPrefWidth(600);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("Mathy.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("ANTextFX Demo");
        primaryStage.show();
    }
}
