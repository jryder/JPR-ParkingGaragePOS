/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpr.parkinggaragepos;

/**
 *
 * @author jorda_000
 */
public interface ReceiptDisplay {
    
    public abstract String getReceiptText(String carId, double hoursParked, double feeCharged);
    
}
