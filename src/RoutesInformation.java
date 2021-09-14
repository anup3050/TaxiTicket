
public class RoutesInformation {
	
	private Cities toCity;
	private Cities fromCity;
	private Integer distance;
    
	
	
	public RoutesInformation(Cities fromCity, Cities toCity, int distance) {
		this.toCity = toCity;
		this.fromCity = fromCity;
		this.distance = distance;
		// TODO Auto-generated constructor stub
	}
	public Cities getToCity() {
		return toCity;
	}
	public void setToCity(Cities toCity) {
		this.toCity = toCity;
	}
	public Cities getFromCity() {
		return fromCity;
	}
	public void setFromCity(Cities fromCity) {
		this.fromCity = fromCity;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	
	/*public RoutesInformation getRoutesInfomation() {
		
		return new RoutesInformation();
	}*/
	
}
