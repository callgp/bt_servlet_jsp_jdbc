package com.gp.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequestListener
 *
 */
@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener {

    
    public void requestDestroyed(ServletRequestEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("req destroyed");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("req request created/Initialized");
    }
	
}
