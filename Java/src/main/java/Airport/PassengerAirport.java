package Airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Planes.PassengerPlane;
import Planes.Plane;

public class PassengerAirport extends Airport
{


	public PassengerAirport(List<? extends Plane> planes)
	{
		super(planes);
	}
	@Override
	public List<PassengerPlane> getPlanes() {
		List<PassengerPlane> passengerPlanes = new ArrayList<>();
		for (Plane plane : planes) {
			if (plane instanceof PassengerPlane)
				passengerPlanes.add((PassengerPlane) plane);
		}
		return passengerPlanes;
	}


	public PassengerPlane getPlaneWithMaxCapacity() {
		List<PassengerPlane> passengerPlanes = getPlanes();
		PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
		for (int i = 0; i < passengerPlanes.size(); i++) {
			if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
				planeWithMaxCapacity = passengerPlanes.get(i);
			}
		}
		return planeWithMaxCapacity;
	}
//
//	//@Override
//	public PassengerAirport sortByMaxSpeed() {
//		Collections.sort(planes, new Comparator<Plane>() {
//			public int compare(Plane o1, Plane o2) {
//				return o1.getMaxSpeed() - o2.getMaxSpeed();
//			}
//		});
//		return this;
//	}
}
