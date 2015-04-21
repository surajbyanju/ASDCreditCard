package org.mum.asd.framework.partyPattern;

import java.util.Date;

import org.mum.asd.framework.AccountManager.IAccount;

public class Person extends AParty implements IPerson{
	private Date dateOfBirth=new Date("08/08/2012");
    private final String type = "P";

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

	@Override
	public void addAccount(IAccount account) {
		super.addAccount(account);
		
	}

   

    @Override
    public void removeAccount(IAccount account) {
       // super.removeAccount(account);
    }

    
    @Override
    public String getType() {
        return type;
    }

    
    
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
    /*@Override
    public void sendEmail(IFunctor f, IPredicate p, double amount) {
        if (p != null) {
            if (p.check(amount)) {
                if (f != null) {
                    f.compute(this);
                }
            }
        } else {
            f.compute(this);
        }
    }*/

  

    /*public IPredicate getDepositPredicate() {
        return new Person500DepositPredicate();
    }

    public IPredicate getWithdrawPredicate() {
        return new NegativeBalancePredicate();
    }*/
}
