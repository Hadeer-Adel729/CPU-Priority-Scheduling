/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityScheduling;

import java.util.Comparator;

/**
 *
 * @author Nada
 */
class Sort implements Comparator<Process> {
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Process a, Process b)
    {
        return a.arrivalTime - b.arrivalTime;
    }

    
 
}
