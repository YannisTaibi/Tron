/*
 *
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IGrid {

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleById(int id) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    List<Example> getAllExamples() throws SQLException;

    /**
     * Gets the height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the width.
     *
     * @return the width
     */
    int getWidth();

    /**
     * Gets the matrix XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the matrix XY
     */
    public IMotionLess getMatrixXY(int x, int y);

    /**
     * Sets the matrix XY.
     *
     * @param motionLess
     *            the motion less
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public void setMatrixXY(final IMotionLess motionLess, final int x, final int y);

    /**
     * Gets the lightcycle.
     *
     * @return the lightcycle
     */
    public ArrayList<ILightcycle> getLightcycle();

    ILightcycle getLightcycleByPlayer(int player);

    public void setLightcyclesHaveMoved();

    public void createWall(final int player);

}
