public class FareInfo {
	
	private Integer travellers;
	private Integer total;
	private RoutesInformation routesInformation;
	
	
	public FareInfo(RoutesInformation routesInformation, Integer total, Integer travellers) {
		// TODO Auto-generated constructor stub
		
		this.routesInformation = routesInformation;
		this.total = total;
		this.travellers = travellers;
	}
	public RoutesInformation getRoutesInformation() {
		return routesInformation;
	}
	public void setRoutesInformation(RoutesInformation routesInformation) {
		this.routesInformation = routesInformation;
	}
	public Integer getTravellers() {
		return travellers;
	}
	public void setTravellers(Integer travellers) {
		this.travellers = travellers;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public FareInfo calculateFare(RoutesInformation routesInformation, Integer travellers) {
		
		this.routesInformation = routesInformation;
		
		this.total = (750*routesInformation.getDistance()*5)*travellers;
		FareInfo fareInfo = new FareInfo(routesInformation, total, travellers);
		return fareInfo;
	}

}
