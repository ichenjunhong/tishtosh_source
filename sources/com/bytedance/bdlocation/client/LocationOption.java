package com.bytedance.bdlocation.client;

import com.bytedance.bdlocation.p510b.C9223a;
import com.bytedance.bdlocation.p510b.C9225c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LocationOption {
    int geocodeMode = 2;
    long interval;
    long locationTimeOutMs;
    C9223a mTrace;
    long maxCacheTime = 30000;
    int mode = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GeocodeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationMode {
    }

    public int geocodeMode() {
        return this.geocodeMode;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getLocationTimeOutMs() {
        return this.locationTimeOutMs;
    }

    public long getMaxCacheTime() {
        return this.maxCacheTime;
    }

    public int getMode() {
        return this.mode;
    }

    public C9223a getTrace() {
        return this.mTrace;
    }

    public int hashCode() {
        return (((((((((int) (this.locationTimeOutMs ^ (this.locationTimeOutMs >>> 32))) * 31) + ((int) (this.interval ^ (this.interval >>> 32)))) * 31) + this.mode) * 31) + this.geocodeMode) * 31) + ((int) (this.maxCacheTime ^ (this.maxCacheTime >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationOption{locationTimeOutMs=");
        sb.append(this.locationTimeOutMs);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", geocodeMode=");
        sb.append(this.geocodeMode);
        sb.append(", maxCacheTime=");
        sb.append(this.maxCacheTime);
        sb.append(", mTrace=");
        sb.append(this.mTrace);
        sb.append('}');
        return sb.toString();
    }

    public void setGeocodeMode(int i) {
        this.geocodeMode = i;
    }

    public void setInterval(long j) {
        this.interval = j;
    }

    public void setLocationTimeOutMs(long j) {
        this.locationTimeOutMs = j;
    }

    public void setMaxCacheTime(long j) {
        this.maxCacheTime = j;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setTrace(C9223a aVar) {
        this.mTrace = aVar;
    }

    public void setTraceCallback(C9225c cVar) {
        this.mTrace.f25208f = cVar;
    }

    public LocationOption(String str) {
        this.mTrace = new C9223a(str);
    }

    public LocationOption(LocationOption locationOption) {
        this.locationTimeOutMs = locationOption.locationTimeOutMs;
        this.interval = locationOption.interval;
        this.mode = locationOption.mode;
        this.maxCacheTime = locationOption.maxCacheTime;
        this.mTrace = locationOption.mTrace;
        this.geocodeMode = locationOption.geocodeMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationOption)) {
            return false;
        }
        LocationOption locationOption = (LocationOption) obj;
        if (this.locationTimeOutMs == locationOption.locationTimeOutMs && this.interval == locationOption.interval && this.geocodeMode == locationOption.geocodeMode && this.mode == locationOption.mode) {
            return true;
        }
        return false;
    }
}
