package com.bytedance.bdlocation.client;

public class BDPoint {
    private double latitude;
    private double longitude;
    private String provider;

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getProvider() {
        return this.provider;
    }

    public BDPoint() {
        this("Android");
    }

    public int hashCode() {
        return Double.valueOf((this.latitude + this.longitude) * 1000000.0d).intValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BDPoint{provider='");
        sb.append(this.provider);
        sb.append('\'');
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append('}');
        return sb.toString();
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public BDPoint(String str) {
        this.provider = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BDPoint)) {
            return false;
        }
        BDPoint bDPoint = (BDPoint) obj;
        if (this.latitude == bDPoint.latitude && this.longitude == bDPoint.longitude) {
            return true;
        }
        return false;
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.latitude = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.longitude = d;
    }

    public BDPoint(double d, double d2) {
        this(d, d2, "none");
    }

    public BDPoint(double d, double d2, String str) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        }
        if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.longitude = d2;
        this.latitude = d;
        this.provider = str;
    }
}
