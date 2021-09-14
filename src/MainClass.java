import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		RoutesInformation routesInformation1 = new RoutesInformation(new Cities("PUNE"), new Cities("MUMBAI"), 120);
		RoutesInformation routesInformation2 = new RoutesInformation(new Cities("PUNE"), new Cities("NASIK"), 200);
		RoutesInformation routesInformation3 = new RoutesInformation(new Cities("MUMBAI"), new Cities("GOA"), 350);
		RoutesInformation routesInformation4 = new RoutesInformation(new Cities("MUMBAI"), new Cities("NASIK"), 180);
		
		List<RoutesInformation> routesInformationsList = new ArrayList<>();
		
		routesInformationsList.add(routesInformation1);
		routesInformationsList.add(routesInformation2);
		routesInformationsList.add(routesInformation3);
		routesInformationsList.add(routesInformation4);
		
		String place1 = "PUNE";
		String place2 = "NASIK";
		int travellers = 2;
		
		RoutesInformation routesInformation=null;

				
		for (RoutesInformation routesInfo : routesInformationsList) {
		
					if(routesInfo.getFromCity().getName().equalsIgnoreCase(place1) || (routesInfo.getToCity().getName().equalsIgnoreCase(place1))){
						if(routesInfo.getFromCity().getName().equalsIgnoreCase(place2) || (routesInfo.getToCity().getName().equalsIgnoreCase(place2))){
							
							routesInformation = new RoutesInformation(new Cities(place1), new Cities(place2), routesInfo.getDistance());
							break;
						}
					}
		}
		
		
		FareInfo fareInfo = new CalulateFareImpt().calculateFare(routesInformation, travellers);
		
		TicketGenerator ticketGenerator = fi -> {
			System.out.println("Taxi Ticket");
			System.out.println("-----------");
			System.out.println("Source:"+ fi.getRoutesInformation().getToCity().getName());
			System.out.println("Destination:"+ fi.getRoutesInformation().getFromCity().getName());
			System.out.println("Kms:"+ fi.getRoutesInformation().getDistance());
			System.out.println("No. of travellers:"+ fi.getTravellers());
			System.out.println("Total:"+ fi.getTotal());
		}; 
		
		ticketGenerator.printTicket(fareInfo);
	}

}
