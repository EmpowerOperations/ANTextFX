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

    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();

        StructuredTextArea codeArea = new StructuredTextArea(
                MathyParser.class,
                MathyLexer.class,
                MathyParser::block
        );

        root.getChildren().add(codeArea);

        codeArea.getHighlighters().add(new LexicalBracketCountingHighlighter("(", ")", "bracket"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("Mathy.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
    }
}
