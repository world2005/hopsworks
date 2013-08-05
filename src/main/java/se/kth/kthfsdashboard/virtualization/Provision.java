/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.kthfsdashboard.virtualization;

import se.kth.kthfsdashboard.virtualization.clusterparser.Cluster;

/**
 *
 * @author Alberto Lorente Leal <albll@kth.se>
 */
public interface Provision {
    
    public void initializeCluster();
    public boolean launchNodesBasicSetup();
    public void installPhase();
    public void deployingConfigurations();
}
