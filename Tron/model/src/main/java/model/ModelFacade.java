/*
 *
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.ExampleDAO;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IGrid {

    // private Grid grid;
    // private EasyFrame easyFrame;
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
        // this.grid = new Grid(height, width);
        // this.easyFrame = new EasyFrame("Tron", this.grid);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getHeight()
     */
    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getWidth()
     */
    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getMatrixXY(int, int)
     */
    @Override
    public IMotionLess getMatrixXY(final int x, final int y) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#setMatrixXY(model.IMotionLess, int, int)
     */
    @Override
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see model.IGrid#getLightcycle()
     */
    @Override
    public ArrayList<ILightcycle> getLightcycle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ILightcycle getLightcycleByPlayer(final int player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setLightcyclesHaveMoved() {
        // TODO Auto-generated method stub

    }

    @Override
    public void createWall(final int player) {
        // TODO Auto-generated method stub

    }

}
