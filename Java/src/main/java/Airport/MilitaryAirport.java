package Airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import Airport;
import Models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.Plane;

public class MilitaryAirport extends Airport
{

	public MilitaryAirport(List<? extends Plane> planes)
	{
		super(planes);
	}

	@Override
	public List<MilitaryPlane> getPlanes() {
		List<MilitaryPlane> militaryPlanes = new ArrayList<>();
		for (Plane plane : planes) {
			if (plane instanceof MilitaryPlane)
				militaryPlanes.add((MilitaryPlane) plane);
		}
		return militaryPlanes;
	}
	public List<MilitaryPlane> getTransportMilitaryPlanes() {
		List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
		List<MilitaryPlane> militaryPlanes = getPlanes();
		for (int i = 0; i < militaryPlanes.size(); i++) {
			MilitaryPlane plane = militaryPlanes.get(i);
			if (plane.getType() == MilitaryType.TRANSPORT) {
				transportMilitaryPlanes.add(plane);
			}
		}
		return transportMilitaryPlanes;
	}
	public List<MilitaryPlane> getBomberMilitaryPlanes() {
		List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
		List<MilitaryPlane> militaryPlanes = getPlanes();
		for (int i = 0; i < militaryPlanes.size(); i++) {
			MilitaryPlane plane = militaryPlanes.get(i);
			if (plane.getType() == MilitaryType.BOMBER) {
				bomberMilitaryPlanes.add(plane);
			}
		}
		return bomberMilitaryPlanes;
	}

}
