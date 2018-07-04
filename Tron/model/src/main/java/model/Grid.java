package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Grid extends Observable implements IGrid {
    public int                           width;
    public int                           height;
    private IMotionLess[][]              matrix;
    private final ArrayList<ILightcycle> lightcycle;

    public Grid(final int width, final int height) {
        this.width = width;
        this.height = height;
        this.lightcycle = new ArrayList<ILightcycle>();
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    @Override
    public IMotionLess getMatrixXY(final int x, final int y) {
        return this.matrix[x][y];
    }

    @Override
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
        this.matrix[x][y] = motionLess;
    }

    @Override
    public ArrayList<ILightcycle> getLightcycle() {
        return this.lightcycle;
    }

    @Override
    public Example getExampleById(final int id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Example getExampleByName(final String name) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Example> getAllExamples() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ILightcycle getMobileByPlayer(final int player) {
        // TODO Auto-generated method stub
        return null;
    }

}
