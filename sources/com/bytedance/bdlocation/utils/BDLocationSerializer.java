package com.bytedance.bdlocation.utils;

import android.os.Build.VERSION;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import java.lang.reflect.Type;

public class BDLocationSerializer implements C18090t<BDLocation> {
    /* renamed from: a */
    public final /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        BDLocation bDLocation = (BDLocation) obj;
        C18085o oVar = new C18085o();
        oVar.mo35020a("mProvider", bDLocation.getProvider());
        oVar.mo35019a("mAccuracy", (Number) Float.valueOf(bDLocation.getAccuracy()));
        oVar.mo35019a("mAltitude", (Number) Double.valueOf(bDLocation.getAltitude()));
        oVar.mo35019a("mBearing", (Number) Float.valueOf(bDLocation.getBearing()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mBearingAccuracyDegrees", (Number) Float.valueOf(bDLocation.getBearingAccuracyDegrees()));
        }
        if (VERSION.SDK_INT >= 17) {
            oVar.mo35019a("mElapsedRealtimeNanos", (Number) Long.valueOf(bDLocation.getElapsedRealtimeNanos()));
        }
        oVar.mo35019a("mLatitude", (Number) Double.valueOf(bDLocation.getLatitude()));
        oVar.mo35019a("mLongitude", (Number) Double.valueOf(bDLocation.getLongitude()));
        oVar.mo35020a("mProvider", bDLocation.getProvider());
        oVar.mo35019a("mSpeed", (Number) Float.valueOf(bDLocation.getSpeed()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mSpeedAccuracyMetersPerSecond", (Number) Float.valueOf(bDLocation.getSpeedAccuracyMetersPerSecond()));
        }
        oVar.mo35019a("mTime", (Number) Long.valueOf(bDLocation.getTime()));
        if (VERSION.SDK_INT >= 26) {
            oVar.mo35019a("mVerticalAccuracyMeters", (Number) Float.valueOf(bDLocation.getVerticalAccuracyMeters()));
        }
        oVar.mo35020a("mAddress", bDLocation.getAddress());
        oVar.mo35020a("mCountry", bDLocation.getCountry());
        oVar.mo35020a("mAdministrativeArea", bDLocation.getAdministrativeArea());
        oVar.mo35020a("mSubAdministrativeArea", bDLocation.getSubAdministrativeArea());
        oVar.mo35020a("mCity", bDLocation.getCity());
        oVar.mo35020a("mDistrict", bDLocation.getDistrict());
        oVar.mo35020a("mCityCode", bDLocation.getCityCode());
        oVar.mo35020a("mStreet", bDLocation.getStreet());
        oVar.mo35020a("mStreetNum", bDLocation.getStreetNum());
        oVar.mo35020a("mFloor", bDLocation.getFloor());
        oVar.mo35019a("mLocationMs", (Number) Long.valueOf(bDLocation.getLocationMs()));
        oVar.mo35020a("mLocationSDKName", bDLocation.getLocationSDKName());
        oVar.mo35020a("mPoi", bDLocation.getPoi());
        oVar.mo35019a("mLocationType", (Number) Integer.valueOf(bDLocation.getLocationType()));
        oVar.mo35020a("mCountryCode", bDLocation.getCountryCode());
        oVar.mo35020a("mLocalID", bDLocation.getLocalID());
        oVar.mo35020a("mGeoNameID", bDLocation.getGeoNameID());
        oVar.mo35020a("mGeocodeSDKName", bDLocation.getGeocodeSDKName());
        oVar.mo35020a("mAoi", bDLocation.getAoi());
        oVar.mo35017a("mBdLBSResult", Util.sGson.mo34875a((Object) bDLocation.getBdLBSResult()));
        oVar.mo35017a("mGCJ02", Util.sGson.mo34875a((Object) bDLocation.getGCJ02()));
        return oVar;
    }
}
