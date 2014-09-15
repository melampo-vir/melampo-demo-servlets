package it.cnr.isti.cophir.ui.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class UIContextListener
 *
 */
public class UIContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public UIContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
    	 System.out.println("Servlet Context is initialized....");
    	// ServletContext context = arg0.getServletContext();
//    	 String uiHome = context.getInitParameter("UI_HOME");
//    	 Parameters.setUIHome(uiHome);
    	 
// 		try {
 			//TODO: eliminate following code, possibly by moving them to configurations or input elements
//			SearchBean.setResultsForPage(Integer.parseInt(UITools.getProperty(Parameters.getUIConfigFile().getPath(),
//			"resultsForPage").trim()));
//	 		SearchBean.setResultsForRow(Integer.parseInt(UITools.getProperty(Parameters.getUIConfigFile().getPath(),
//			"resultsForRow").trim()));
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

    	
		//MobileCostants.setRootPath("http://aimar.isti.cnr.it:8080/visitoWebClassifier");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
    	System.out.println("Servlet Context is destroyed....");
    }
	
}
