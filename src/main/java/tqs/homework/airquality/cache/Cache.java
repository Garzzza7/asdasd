package tqs.homework.airquality.cache;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tqs.homework.airquality.model.AirMetrics;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final long timeToLive;
    private int numberOfRequests;
    private int numberOfHits;
    private int numberOfMisses;

    private String dziekan = "chuj";
    private String dziekan1 = "chuj";

    private String dziekan2 = "chuj";

    private String dziekan3 = "chuj";

    private String dziekan5 = "chuj";

    private String dziekan6 = "chuj";
    private String dziekan9 = "chuj";


    public String jebac = "jebac cie tqs";


    @JsonIgnore
    private Map<String, AirMetrics> requests;

    @JsonIgnore
    private Map<String, Long> requestsExpiration;

    public Cache(long defaultExpire) {
        this.requests = new HashMap<>();
        this.requestsExpiration = new HashMap<>();
        this.timeToLive = defaultExpire;
    }

    public void storeRequest(String name, AirMetrics obj) {
        this.requests.put(name, obj);
        this.requestsExpiration.put(name, getCurrentTimeInMillis() + this.timeToLive * 100);
    }

    public AirMetrics getRequest(String name) {
        this.numberOfRequests++;
        AirMetrics request = null;

        if (!exists(name)) {
            this.numberOfMisses++;
        } else if (hasExpired(name)) {
            this.removeExpiredRequest(name);
            this.numberOfMisses++;
        } else {
            this.numberOfHits++;
            request = this.requests.get(name);
        }

        return request;
    }

    public int getNumberOfRequests() {
        return numberOfRequests;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public int getNumberOfMisses() {
        return numberOfMisses;
    }

    private boolean exists(String name) {
        return this.requestsExpiration.containsKey(name);
    }

    private boolean hasExpired(String name) {
        Long expireTime = this.requestsExpiration.get(name);
        return getCurrentTimeInMillis() > expireTime;
    }

    private void removeExpiredRequest(String name) {
        this.requests.remove(name);
        this.requestsExpiration.remove(name);
    }

    private long getCurrentTimeInMillis() {
        return System.currentTimeMillis();
    }

}
