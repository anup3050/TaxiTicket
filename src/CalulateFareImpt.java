
public class CalulateFareImpt implements CalculateFare{

	@Override
	public FareInfo calculateFare(RoutesInformation routesInformation, Integer travellers) {
		// TODO Auto-generated method stub
		
		Integer total = (750+(5*(routesInformation.getDistance()-100)))* travellers;
		
		
		return new FareInfo(routesInformation, total, travellers);
	}

	
	
}
