/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mum.asd.framework.main;

import org.mum.asd.client.view.CreditCardDashboard;
import org.mum.asd.framework.AccountManager.AccountManager;
import org.mum.asd.framework.gui.CommonForm.AccountFrm;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        AppInitiator.getMediator();
        AccountFrm form = new CreditCardDashboard();
//        form.setVisible(true);
        AppInitiator.setAccForm(form);
        
        AppInitiator.getAccForm().setVisible(true);
        
    }
}
