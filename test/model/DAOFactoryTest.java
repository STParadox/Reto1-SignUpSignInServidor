package model;

import datatransferobject.Model;
import model.DAO;
import model.DAOFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author haize
 */
public class DAOFactoryTest {
    
    /**
     * Test of getModel method, of class DAOFactory.
     */
    @Test
    public static void testGetModel() {
        Model result = DAOFactory.getModel();
        assertNotNull("Null model", result);
        assertTrue("Instance of model is not ModelImplementation", result instanceof DAO);
    }
    
}