package Section12_JavaCollections.SetAndHashSet;

public class Planet extends HeavenlyBody {

// fields

// constructor

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

// methods

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyType.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
