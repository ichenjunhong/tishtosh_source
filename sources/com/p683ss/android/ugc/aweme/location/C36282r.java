package com.p683ss.android.ugc.aweme.location;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.location.r */
public final class C36282r implements Serializable {

    /* renamed from: a */
    private boolean f92857a;

    /* renamed from: b */
    private double f92858b;

    /* renamed from: c */
    private double f92859c;

    /* renamed from: d */
    private String f92860d;

    /* renamed from: e */
    private String f92861e;

    /* renamed from: f */
    private String f92862f;

    /* renamed from: g */
    private String f92863g;

    /* renamed from: h */
    private String f92864h;

    /* renamed from: i */
    private long f92865i;

    /* renamed from: j */
    private float f92866j;

    public final float getAccuracy() {
        return this.f92866j;
    }

    public final String getAddress() {
        return this.f92864h;
    }

    public final String getCity() {
        return this.f92862f;
    }

    public final String getCountry() {
        return this.f92860d;
    }

    public final String getDistrict() {
        return this.f92863g;
    }

    public final double getLatitude() {
        return this.f92858b;
    }

    public final double getLongitude() {
        return this.f92859c;
    }

    public final String getProvince() {
        return this.f92861e;
    }

    public final long getTime() {
        return this.f92865i;
    }

    public final boolean isGaode() {
        return this.f92857a;
    }

    public final boolean isValid() {
        if (this.f92858b == ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f92859c == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return false;
        }
        return true;
    }

    public final void setAccuracy(float f) {
        this.f92866j = f;
    }

    public final void setAddress(String str) {
        this.f92864h = str;
    }

    public final void setCity(String str) {
        this.f92862f = str;
    }

    public final void setCountry(String str) {
        this.f92860d = str;
    }

    public final void setDistrict(String str) {
        this.f92863g = str;
    }

    public final void setGaode(boolean z) {
        this.f92857a = z;
    }

    public final void setLatitude(double d) {
        this.f92858b = d;
    }

    public final void setLongitude(double d) {
        this.f92859c = d;
    }

    public final void setProvince(String str) {
        this.f92861e = str;
    }

    public final void setTime(long j) {
        this.f92865i = j;
    }
}
