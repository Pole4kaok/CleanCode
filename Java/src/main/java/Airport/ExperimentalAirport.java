package Airport;

import java.util.ArrayList;
import java.util.List;

import Planes.ExperimentalPlane;
import Planes.Plane;

public class ExperimentalAirport extends Airport
{
	public ExperimentalAirport(List<? extends Plane> planes)
	{
		super(planes);
	}
	public List<ExperimentalPlane> getExperimentalPlane() {
		List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
		for (Plane plane : planes) {
			if (plane instanceof ExperimentalPlane) {
				experimentalPlanes.add((ExperimentalPlane) plane);
			}
		}
		return experimentalPlanes;
	}
}
