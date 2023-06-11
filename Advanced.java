//Reouven Nakache 328574652
//Stav Cohen 209024249

//Advanced subscription - a single user subscription that pays for the gym and can purchase additional services.

import java.util.*;
public class Advanced extends Subscriber {
	protected ArrayList <Service> services;

	//Full contsructor
	public Advanced(int monthlyCost, int month) { 
		super(monthlyCost, month);
		services = new ArrayList <Service> ();	
	}
	
	@Override
	//Function to return the payment for all services purchased by the subscription. 
	public float calcCost() {
		float sum1 = super.calcCost();
		for(int i = 0; i< services.size(); i++) {
			sum1 += services.get(i).getServiceMonthlyCost()*12;
		}
		return (float) sum1;
	}
	
	@Override
	//Function to return the refund for all services purchased by the subscription and can be refunded.
	public float calcRefund (int lastMonth) {
		float sum2 = super.calcRefund(lastMonth);
		for(int i = 0; i< services.size(); i++) {
			if(services.get(i).isRefundable() == true)
				sum2 += (12 - ((13 - month + lastMonth)%12)) * (services.get(i).getServiceMonthlyCost());
		}
		return sum2;
	}
	
	//Function that receive a string representing a service name and returning truth if the subscription purchased the service.
	/**
	 * @param nameOfService
	 * @return True if the name of service exist , false if not found.
	 */
	public boolean serviceExist (String nameOfService)
	{
		for(int i = 0; i< services.size(); i++) {
			if(services.get(i).getServiceName() == nameOfService)
				return true;
		}
		return false;
	}
	
	//Function that receive a nservice If the customer has not yet purchased the service then we will add a copy of it.
	public void addService(Service obj) {
		if(serviceExist(obj.getServiceName()) == true) 
			System.out.println(obj.getServiceName() + " service already exist");
		else{
			services.add(services.size(), obj); 
			System.out.println(obj.getServiceName() + " service was added" );
		}
	}
	
	@Override
	//Function that prints the values of the attributes
	public void print() {
		super.print();
		for(int i =0; i < services.size(); i++) {
			System.out.println("serviceName: " + services.get(i).getServiceName() +
					" ,serviceMonthlyCost :" + services.get(i).getServiceMonthlyCost() +
					" ,refund: " + services.get(i).isRefundable());
		}
	}
	}
