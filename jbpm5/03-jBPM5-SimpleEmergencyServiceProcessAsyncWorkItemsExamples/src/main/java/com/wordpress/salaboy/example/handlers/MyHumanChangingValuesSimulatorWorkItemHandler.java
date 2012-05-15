/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.salaboy.example.handlers;

import com.wordpress.salaboy.example.model.Emergency;
import java.util.HashMap;
import java.util.Map;
import org.drools.runtime.process.WorkItem;
import org.drools.runtime.process.WorkItemHandler;
import org.drools.runtime.process.WorkItemManager;

/**
 *
 * @author salaboy
 */
public class MyHumanChangingValuesSimulatorWorkItemHandler implements WorkItemHandler {
    private static int counter = 1;
    private WorkItemManager workItemManager;
    private long workItemId;
    private Map<String, Object> results;
    private Emergency currentEmergency;

    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        this.workItemId = workItem.getId();
        this.workItemManager = workItemManager;
        currentEmergency = (Emergency) workItem.getParameter("emergency");
        currentEmergency.setRevision(currentEmergency.getRevision() + counter);


    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }

    public void completeWorkItem() {
        results = new HashMap<String, Object>();
        results.put("emergency", currentEmergency);
        workItemManager.completeWorkItem(workItemId, results);

    }


}
