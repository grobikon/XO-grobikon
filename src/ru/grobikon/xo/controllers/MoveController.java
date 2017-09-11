package ru.grobikon.xo.controllers;

import ru.grobikon.xo.model.Field;
import ru.grobikon.xo.model.Figure;
import ru.grobikon.xo.model.exceptions.AlreadyOccupiedException;
import ru.grobikon.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}
