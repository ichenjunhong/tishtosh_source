package com.bytedance.bdlocation.utils;

import android.os.Build.VERSION;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18088r;
import com.p683ss.p2544b.p2545a.C51151a;
import java.lang.reflect.Type;

public class BDLocationDeserializer implements C18081k<BDLocation> {
    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        return m18381b(lVar, type, jVar);
    }

    /* renamed from: b */
    private static BDLocation m18381b(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C18085o m = lVar.mo35009m();
        BDLocation bDLocation = new BDLocation(m.mo35023c("mProvider").mo34905c(), m.mo35023c("mLocationSDKName").mo34905c());
        bDLocation.setAccuracy(m.mo35023c("mAccuracy").mo34907e());
        bDLocation.setAltitude((double) m.mo35023c("mAltitude").mo34907e());
        bDLocation.setBearing(m.mo35023c("mBearing").mo34907e());
        if (VERSION.SDK_INT >= 26) {
            bDLocation.setBearingAccuracyDegrees(m.mo35023c("mBearingAccuracyDegrees").mo34907e());
        }
        if (VERSION.SDK_INT >= 17) {
            bDLocation.setElapsedRealtimeNanos(m.mo35023c("mElapsedRealtimeNanos").mo34909f());
        }
        bDLocation.setLatitude(m.mo35023c("mLatitude").mo34906d());
        bDLocation.setLongitude(m.mo35023c("mLongitude").mo34906d());
        bDLocation.setSpeed(m.mo35023c("mSpeed").mo34907e());
        if (VERSION.SDK_INT >= 26) {
            bDLocation.setSpeedAccuracyMetersPerSecond(m.mo35023c("mSpeedAccuracyMetersPerSecond").mo34907e());
        }
        bDLocation.setTime(m.mo35023c("mTime").mo34909f());
        if (VERSION.SDK_INT >= 26) {
            bDLocation.setVerticalAccuracyMeters(m.mo35023c("mVerticalAccuracyMeters").mo34907e());
        }
        C18088r c = m.mo35023c("mAddress");
        if (c != null) {
            bDLocation.setAddress(c.mo34905c());
        }
        C18088r c2 = m.mo35023c("mCountry");
        if (c2 != null) {
            bDLocation.setCountry(c2.mo34905c());
        }
        C18088r c3 = m.mo35023c("mAdministrativeArea");
        if (c3 != null) {
            bDLocation.setAdministrativeArea(c3.mo34905c());
        }
        C18088r c4 = m.mo35023c("mSubAdministrativeArea");
        if (c4 != null) {
            bDLocation.setSubAdministrativeArea(c4.mo34905c());
        }
        C18088r c5 = m.mo35023c("mCity");
        if (c5 != null) {
            bDLocation.setCity(c5.mo34905c());
        }
        C18088r c6 = m.mo35023c("mDistrict");
        if (c6 != null) {
            bDLocation.setDistrict(c6.mo34905c());
        }
        C18088r c7 = m.mo35023c("mCityCode");
        if (c7 != null) {
            bDLocation.setCityCode(c7.mo34905c());
        }
        C18088r c8 = m.mo35023c("mStreet");
        if (c8 != null) {
            bDLocation.setStreet(c8.mo34905c());
        }
        C18088r c9 = m.mo35023c("mStreetNum");
        if (c9 != null) {
            bDLocation.setStreetNum(c9.mo34905c());
        }
        C18088r c10 = m.mo35023c("mFloor");
        if (c10 != null) {
            bDLocation.setFloor(c10.mo34905c());
        }
        bDLocation.setLocationMs(m.mo35023c("mLocationMs").mo34909f());
        C18088r c11 = m.mo35023c("mLocationSDKName");
        if (c11 != null) {
            bDLocation.setLocationSDKName(c11.mo34905c());
        }
        C18088r c12 = m.mo35023c("mPoi");
        if (c12 != null) {
            bDLocation.setPoi(c12.mo34905c());
        }
        BDPoint bDPoint = new BDPoint();
        C18085o e = m.mo35025e("mGCJ02");
        if (e != null) {
            C18088r c13 = e.mo35023c("provider");
            if (c13 != null) {
                bDPoint.setProvider(c13.mo34905c());
            }
            bDPoint.setLongitude(e.mo35023c("longitude").mo34906d());
            bDPoint.setLatitude(e.mo35023c("latitude").mo34906d());
            bDLocation.setGCJ02(bDPoint);
        }
        bDLocation.setLocationType(m.mo35023c("mLocationType").mo34910g());
        C18088r c14 = m.mo35023c("mCountryCode");
        if (c14 != null) {
            bDLocation.setCountryCode(c14.mo34905c());
        }
        C18088r c15 = m.mo35023c("mLocalID");
        if (c15 != null) {
            bDLocation.setLocalID(c15.mo34905c());
        }
        C18088r c16 = m.mo35023c("mGeoNameID");
        if (c16 != null) {
            bDLocation.setGeoNameID(c16.mo34905c());
        }
        C18088r c17 = m.mo35023c("mGeocodeSDKName");
        if (c17 != null) {
            bDLocation.setGeocodeSDKName(c17.mo34905c());
        }
        C18088r c18 = m.mo35023c("mAoi");
        if (c18 != null) {
            bDLocation.setAoi(c18.mo34905c());
        }
        try {
            C18085o e2 = m.mo35025e("mBdLBSResult");
            if (e2 != null) {
                bDLocation.setBdLBSResult((C9234c) Util.sGson.mo34881a((C18082l) e2, C9234c.class));
            }
        } catch (Exception e3) {
            C51151a.m110020b("BDLocation", (Throwable) e3);
        }
        return bDLocation;
    }
}
