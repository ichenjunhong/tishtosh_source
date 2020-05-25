package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build.VERSION;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import java.lang.reflect.Type;

public class LocationDeserializer implements C18081k<Location> {
    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C18085o m = lVar.mo35009m();
        Location location = new Location(m.mo35023c("mProvider").mo34905c());
        location.setAccuracy(m.mo35023c("mAccuracy").mo34907e());
        location.setAltitude((double) m.mo35023c("mAltitude").mo34907e());
        location.setBearing(m.mo35023c("mBearing").mo34907e());
        if (VERSION.SDK_INT >= 26) {
            location.setBearingAccuracyDegrees(m.mo35023c("mBearingAccuracyDegrees").mo34907e());
        }
        if (VERSION.SDK_INT >= 17) {
            location.setElapsedRealtimeNanos(m.mo35023c("mElapsedRealtimeNanos").mo34909f());
        }
        location.setLatitude(m.mo35023c("mLatitude").mo34906d());
        location.setLongitude(m.mo35023c("mLongitude").mo34906d());
        location.setProvider(m.mo35023c("mProvider").mo34905c());
        location.setSpeed(m.mo35023c("mSpeed").mo34907e());
        if (VERSION.SDK_INT >= 26) {
            location.setSpeedAccuracyMetersPerSecond(m.mo35023c("mSpeedAccuracyMetersPerSecond").mo34907e());
        }
        location.setTime(m.mo35023c("mTime").mo34909f());
        if (VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(m.mo35023c("mVerticalAccuracyMeters").mo34907e());
        }
        return location;
    }
}
