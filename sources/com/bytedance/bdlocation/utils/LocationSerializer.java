package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build.VERSION;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import java.lang.reflect.Type;

public class LocationSerializer implements C18090t<Location> {
    /* renamed from: a */
    public final /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        Location location = (Location) obj;
        C18085o oVar = new C18085o();
        oVar.mo35020a("mProvider", location.getProvider());
        oVar.mo35019a("mAccuracy", (Number) Float.valueOf(location.getAccuracy()));
        oVar.mo35019a("mAltitude", (Number) Double.valueOf(location.getAltitude()));
        oVar.mo35019a("mBearing", (Number) Float.valueOf(location.getBearing()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mBearingAccuracyDegrees", (Number) Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (VERSION.SDK_INT >= 17) {
            oVar.mo35019a("mElapsedRealtimeNanos", (Number) Long.valueOf(location.getElapsedRealtimeNanos()));
        }
        oVar.mo35019a("mLatitude", (Number) Double.valueOf(location.getLatitude()));
        oVar.mo35019a("mLongitude", (Number) Double.valueOf(location.getLongitude()));
        oVar.mo35020a("mProvider", location.getProvider());
        oVar.mo35019a("mSpeed", (Number) Float.valueOf(location.getSpeed()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mSpeedAccuracyMetersPerSecond", (Number) Float.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        oVar.mo35019a("mTime", (Number) Long.valueOf(location.getTime()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mVerticalAccuracyMeters", (Number) Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        return oVar;
    }
}
