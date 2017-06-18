package DL;

public class Airport {
    long airportID;
    String airportCode;
    String airportCity;
    String airportName;
    int airportTimezone;
    float longitude;
    float latitude;

    public Airport(String airportCode,
                   String airportCity,
                   String airportName,
                   int airportTimezone) {

        this.airportCode = airportCode;
        this.airportCity = airportCity;
        this.airportName = airportName;
        this.airportTimezone = airportTimezone;
    }

    public Airport(String airportCode,
                   String airportCity,
                   String airportName,
                   int airportTimezone,
                   float longitude,
                   float latitude) {

        this.airportCode = airportCode;
        this.airportCity = airportCity;
        this.airportName = airportName;
        this.airportTimezone = airportTimezone;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
