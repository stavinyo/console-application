//Reouven Nakache 328574652
//Stav Cohen 209024249

public class Service {
	protected String serviceName;
	protected int serviceMonthlyCost;
	protected boolean refundable;
	
	//Full constructor
	public Service(String serviceName, int serviceMonthlyCost, boolean refundable) //full cons't
	{
		this.serviceName = serviceName;
		this.setServiceMonthlyCost(serviceMonthlyCost);
		this.refundable =refundable;
	}
	
	//Part constructor
	public Service(String serviceName, int serviceMonthlyCost) //part cons't
	{
		this.serviceName = serviceName;
		this.setServiceMonthlyCost(serviceMonthlyCost);
		refundable = false;
	}
	
	//Part constructor
	public Service(String serviceName) //part cons't
	{
		this.serviceName = serviceName;
		serviceMonthlyCost = 10;
		refundable = false;
	}
	
	//Copy constructor
	public Service(Service Sr1){ //copy cons't
		this(Sr1.serviceName, Sr1.serviceMonthlyCost, Sr1.refundable);	
	}

	//Get
	public int getServiceMonthlyCost() {
		return serviceMonthlyCost;
	}
	
	//Set
	public void setServiceMonthlyCost(int serviceMonthlyCost) {
		if (serviceMonthlyCost < 10)
		{
			System.out.println("invalid price");
			this.serviceMonthlyCost = 10;
		}
		else
			this.serviceMonthlyCost = serviceMonthlyCost;
	}
	
	//Get
	public String getServiceName() {
		return serviceName;
	}
	
	//Get
	public boolean isRefundable() {
		return refundable;
	}
	
	//Function that prints the values of the attributes
	public void print(){
		System.out.println("serviceName: " + serviceName + ", "
				+ "serviceMonthlyCost: " + serviceMonthlyCost +", refundable: " + refundable);
	}
}




