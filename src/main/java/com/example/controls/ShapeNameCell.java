package com.example.controls;

import javafx.scene.control.ListCell;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class ShapeNameCell extends ListCell<String> {
    @Override
    public void updateItem(String item, boolean empty){
        super.updateItem(item, empty);
        if(empty){
            setText(null);
            setGraphic(null);
        }
        else{
            setText(item);
            Shape shape = this.getShape(item);
            setGraphic(shape);
        }
    }

    public Shape getShape(String name){
        Shape shape = switch (name) {
            case "patrick" -> new Line(0, 10, 20, 10);
            case "patryk" -> new Rectangle(0, 10, 20, 10);
            case "papryczek" -> new Circle(0, 10, 10);
            default -> null;
        };
        return shape;
    }
}
