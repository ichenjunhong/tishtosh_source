package com.bytedance.bdlocation;

import android.location.Address;
import java.util.Locale;

public class Address2 extends Address {
    private float accuracy;
    private double altitude;
    private float horizontalAccuracy;
    private float speed;
    private float verticalAccuracy;

    public float getAccuracy() {
        return this.accuracy;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address2{speed=");
        sb.append(this.speed);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", altitude=");
        sb.append(this.altitude);
        sb.append(", verticalAccuracy=");
        sb.append(this.verticalAccuracy);
        sb.append(", horizontalAccuracy=");
        sb.append(this.horizontalAccuracy);
        sb.append(", addr= ");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public Address2(Locale locale) {
        super(locale);
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setHorizontalAccuracy(float f) {
        this.horizontalAccuracy = f;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setVerticalAccuracy(float f) {
        this.verticalAccuracy = f;
    }

    Address2(Address address) {
        super(address.getLocale());
        setFeatureName(address.getFeatureName());
        for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
            setAddressLine(i, address.getAddressLine(i));
        }
        setAdminArea(address.getAdminArea());
        setSubAdminArea(address.getSubAdminArea());
        setLocality(address.getLocality());
        setSubLocality(address.getSubLocality());
        setThoroughfare(address.getThoroughfare());
        setSubThoroughfare(address.getSubThoroughfare());
        setPremises(address.getPremises());
        setPostalCode(address.getPostalCode());
        setCountryCode(address.getCountryCode());
        setCountryName(address.getCountryName());
        setLatitude(address.getLatitude());
        setLongitude(address.getLongitude());
        setPhone(address.getPhone());
        setUrl(address.getUrl());
        setExtras(address.getExtras());
    }
}
