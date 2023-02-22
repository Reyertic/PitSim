package dev.kyro.pitsim.misc.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polygon2D {
	private final List<PolygonPoint> points;

	public Polygon2D(PolygonPoint... points) {
		this.points = new ArrayList<>(Arrays.asList(points));
	}

	/**
	 * Return true if the given point is contained inside the boundary.
	 * See: http://www.ecse.rpi.edu/Homepages/wrf/Research/Short_Notes/pnpoly.html
	 * @param test The point to check
	 * @return true if the point is inside the boundary, false otherwise
	 */
	public boolean contains(PolygonPoint test) {
		int i;
		int j;
		boolean result = false;
		for(i = 0, j = points.size() - 1; i < points.size(); j = i++) {
			if((points.get(i).z > test.z) != (points.get(j).z > test.z) &&
					(test.x < (points.get(j).x - points.get(i).x) * (test.z - points.get(i).z) / (points.get(j).z - points.get(i).z) + points.get(i).x)) {
				result = !result;
			}
		}
		return result;
	}
}
