package com.lianyitech.spittr.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by daniyyel on 8/24/16.
 */

public class Spittle {
    private final long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longtitude;

    public Spittle(String message, Date time, Double latitude, Double longtitude) {
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.id = 0;
    }

    public Spittle(String message, Date time) {

        this(message, time, null, null);
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, "id", "time");
    }
}
