package MachineCoding.RideSharingApp.entity;

public class Location {

    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public double calculateDistance(Location destination){
        double dX = this.latitude - destination.getLatitude();
        double dY = this.longitude - destination.getLongitude();

        return Math.sqrt(dX * dX + dY * dY);
    }

}
