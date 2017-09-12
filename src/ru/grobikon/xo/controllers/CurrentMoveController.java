package ru.grobikon.xo.controllers;

import ru.grobikon.xo.model.Field;
import ru.grobikon.xo.model.Figure;
import ru.grobikon.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {

    public Figure currentMove(final Field field){
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++){
            countFigure += countFiguresInTheRow(field, x);
        }
        return (countFigure == field.getSize() * field.getSize()) ? null : countFigure % 2 == 0 ? Figure.X : Figure.O;
    }

    private int countFiguresInTheRow(final Field field, final int row){
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++){
            try {
                if (field.getFigure(new Point(x, row)) != null)
                    countFigure++;
            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }
}
