package model;

import java.sql.SQLException;
import java.util.List;

import view.IEasyFrame;
import model.dao.ExampleDAO;
import model.IGrid;
/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	private Grid grid;
	private EasyFrame easyFrame;
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade(final int height, final int width) {
        super();
        this.grid = new Grid(height, width);
        this.easyFrame = new EasyFrame("Tron", this.grid);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

}
