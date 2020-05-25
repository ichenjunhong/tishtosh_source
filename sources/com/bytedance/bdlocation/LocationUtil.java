package com.bytedance.bdlocation;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.bytedance.bdlocation.netwok.p511a.C9238g;
import com.bytedance.bdlocation.netwok.p511a.C9240i;
import com.bytedance.bdlocation.netwok.p511a.C9241j;
import com.bytedance.bdlocation.netwok.p511a.C9242k;
import com.bytedance.bdlocation.service.SystemBaseLocationImpl;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class LocationUtil {
    private LocationUtil() {
    }

    public static BDLocation locationResultToBDLocation(C9234c cVar) {
        return locationResultToBDLocation(null, cVar);
    }

    public static String getCityCodeForChina(C9234c cVar) {
        if (cVar != null) {
            C9240i iVar = cVar.f25223a;
            if (iVar != null) {
                C9242k kVar = iVar.f25276d;
                if (kVar != null) {
                    return kVar.f25299e;
                }
            }
        }
        return null;
    }

    public static String getCountryCode(C9234c cVar) {
        if (cVar != null) {
            C9240i iVar = cVar.f25223a;
            if (iVar != null) {
                C9242k kVar = iVar.f25274b;
                if (kVar != null) {
                    return kVar.f25295a;
                }
            }
        }
        return null;
    }

    public static String getCityCodeForOverSea(C9234c cVar) {
        if (cVar != null) {
            C9240i iVar = cVar.f25223a;
            if (iVar != null) {
                C9242k kVar = iVar.f25276d;
                if (kVar != null) {
                    return String.valueOf(kVar.f25296b);
                }
            }
        }
        return null;
    }

    public static boolean isEmpty(Location location) {
        if (location == null) {
            return true;
        }
        if (Double.compare(location.getLatitude(), ProfileUiInitOptimizeEnterThreshold.DEFAULT) == 0 && Double.compare(location.getLongitude(), ProfileUiInitOptimizeEnterThreshold.DEFAULT) == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkGeocode(BDLocation bDLocation) {
        if (bDLocation == null || TextUtils.isEmpty(bDLocation.getCountry())) {
            return false;
        }
        if (!TextUtils.isEmpty(bDLocation.getAdministrativeArea()) || !TextUtils.isEmpty(bDLocation.getSubAdministrativeArea()) || !TextUtils.isEmpty(bDLocation.getCity())) {
            return true;
        }
        return false;
    }

    public static boolean isGoodLocation(BDLocation bDLocation) {
        if (Calendar.getInstance().getTimeInMillis() - bDLocation.getTime() < 30000 && bDLocation.getAccuracy() <= 500.0f && bDLocation.getLocationType() != 3) {
            return true;
        }
        return false;
    }

    public static Address2 locationToAddress2(BDLocation bDLocation) {
        if (bDLocation == null) {
            return null;
        }
        Address2 address2 = new Address2(Locale.getDefault());
        address2.setSpeed(bDLocation.getSpeed());
        address2.setAccuracy(bDLocation.getAccuracy());
        address2.setAltitude(bDLocation.getAltitude());
        address2.setLatitude(bDLocation.getLatitude());
        address2.setLongitude(bDLocation.getLongitude());
        address2.setAdminArea(bDLocation.getAdministrativeArea());
        address2.setSubAdminArea(bDLocation.getSubAdministrativeArea());
        address2.setCountryName(bDLocation.getCountry());
        address2.setLocality(bDLocation.getCity());
        address2.setSubLocality(bDLocation.getDistrict());
        address2.setAddressLine(0, bDLocation.getAddress());
        return address2;
    }

    public static BDLocation locationResultToBDLocation(C9240i iVar) {
        if (iVar == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation("bd_lbs", "Android");
        bDLocation.setGeocodeSDKName(SystemBaseLocationImpl.LBS_GEOCODE_NAME);
        C9234c cVar = new C9234c();
        cVar.f25223a = iVar;
        bDLocation.setBdLBSResult(cVar);
        C9242k kVar = iVar.f25274b;
        if (kVar != null) {
            bDLocation.setCountry(kVar.f25298d);
            bDLocation.setCountryCode(kVar.f25295a);
        }
        C9241j jVar = iVar.f25278f;
        if (jVar != null && !Util.isEmpty(jVar.f25283a)) {
            bDLocation.setAddress((String) jVar.f25283a.get(0));
        }
        C9242k[] kVarArr = iVar.f25275c;
        if (kVarArr != null && kVarArr.length > 0) {
            bDLocation.setAdministrativeArea(kVarArr[0].f25298d);
        }
        if (kVarArr != null && kVarArr.length > 1) {
            bDLocation.setSubAdministrativeArea(kVarArr[1].f25298d);
        }
        C9242k kVar2 = iVar.f25276d;
        if (kVar2 != null) {
            bDLocation.setCity(kVar2.f25298d);
            bDLocation.setLocalID(kVar2.f25299e);
            bDLocation.setGeoNameID(String.valueOf(kVar2.f25296b));
        }
        C9242k kVar3 = iVar.f25277e;
        if (kVar3 != null) {
            bDLocation.setDistrict(kVar3.f25298d);
        }
        C9238g gVar = iVar.f25279g;
        if (!(gVar == null || gVar.f25260d == ProfileUiInitOptimizeEnterThreshold.DEFAULT || gVar.f25260d == ProfileUiInitOptimizeEnterThreshold.DEFAULT)) {
            bDLocation.setLatitude(gVar.f25260d);
            bDLocation.setLongitude(gVar.f25261e);
        }
        return bDLocation;
    }

    public static BDLocation createLocation(double d, double d2) {
        BDLocation bDLocation = new BDLocation("none", "none");
        bDLocation.setLatitude(d);
        bDLocation.setLongitude(d2);
        return bDLocation;
    }

    private static boolean isSameProvider(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static boolean checkCacheTime(long j, long j2) {
        if (j != 0 && Calendar.getInstance().getTimeInMillis() - j < j2 + 5000) {
            return true;
        }
        return false;
    }

    public static BDLocation geocode(Context context, BDLocation bDLocation) throws IOException {
        if (!Geocoder.isPresent()) {
            return null;
        }
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return addressesToBDLocation(new Geocoder(context, locale).getFromLocation(bDLocation.getLatitude(), bDLocation.getLongitude(), 10), bDLocation, "Android");
    }

    public static boolean isBetterLocation(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if (time > 120000) {
            z = true;
        } else {
            z = false;
        }
        if (time < -120000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (time > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        if (accuracy > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (accuracy < 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (accuracy > 200) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean isSameProvider = isSameProvider(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (z3 && !z4) {
            return true;
        }
        if (!z3 || z6 || !isSameProvider) {
            return false;
        }
        return true;
    }

    public static int compareLocation(BDLocation bDLocation, BDLocation bDLocation2) {
        if (bDLocation == null || bDLocation2 == null || bDLocation.isEmpty() || bDLocation2.isEmpty()) {
            return -1;
        }
        if (!C9431p.m18665a(bDLocation.getCountry(), bDLocation2.getCountry()) && !TextUtils.isEmpty(bDLocation.getCountry()) && !TextUtils.isEmpty(bDLocation2.getCountry())) {
            return 1;
        }
        if (!C9431p.m18665a(bDLocation.getAdministrativeArea(), bDLocation2.getAdministrativeArea()) && !TextUtils.isEmpty(bDLocation.getAdministrativeArea()) && !TextUtils.isEmpty(bDLocation2.getAdministrativeArea())) {
            return 2;
        }
        if (!C9431p.m18665a(bDLocation.getSubAdministrativeArea(), bDLocation2.getSubAdministrativeArea()) && !TextUtils.isEmpty(bDLocation.getSubAdministrativeArea()) && !TextUtils.isEmpty(bDLocation2.getSubAdministrativeArea())) {
            return 3;
        }
        if (!C9431p.m18665a(bDLocation.getCity(), bDLocation2.getCity()) && !TextUtils.isEmpty(bDLocation.getCity()) && !TextUtils.isEmpty(bDLocation2.getCity())) {
            return 4;
        }
        if (C9431p.m18665a(bDLocation.getDistrict(), bDLocation2.getDistrict()) || TextUtils.isEmpty(bDLocation.getDistrict()) || TextUtils.isEmpty(bDLocation2.getDistrict())) {
            return -1;
        }
        return 5;
    }

    public static BDLocation composeGeocodeLocation(BDLocation bDLocation, BDLocation bDLocation2) {
        BDLocation bDLocation3 = new BDLocation(bDLocation);
        bDLocation3.setAddress(bDLocation2.getAddress());
        bDLocation3.setCity(bDLocation2.getCity());
        bDLocation3.setAdministrativeArea(bDLocation2.getAdministrativeArea());
        bDLocation3.setSubAdministrativeArea(bDLocation2.getSubAdministrativeArea());
        bDLocation3.setProvider(bDLocation2.getProvider());
        bDLocation3.setDistrict(bDLocation2.getDistrict());
        bDLocation3.setCountry(bDLocation2.getCountry());
        bDLocation3.setCityCode(bDLocation2.getCityCode());
        bDLocation3.setStreet(bDLocation2.getStreet());
        bDLocation3.setStreetNum(bDLocation2.getStreetNum());
        bDLocation3.setFloor(bDLocation2.getFloor());
        bDLocation3.setThirdPartLocation(bDLocation2.getThirdPartLocation());
        bDLocation3.setLocationSDKName(bDLocation2.getLocationSDKName());
        bDLocation3.setPoi(bDLocation2.getPoi());
        bDLocation3.setGCJ02(bDLocation2.getGCJ02());
        bDLocation3.setLocationType(bDLocation2.getLocationType());
        bDLocation3.setCountryCode(bDLocation2.getCountryCode());
        bDLocation3.setLocalID(bDLocation2.getLocalID());
        bDLocation3.setGeoNameID(bDLocation2.getGeoNameID());
        bDLocation3.setBdLBSResult(bDLocation2.getBdLBSResult());
        bDLocation3.setGeocodeSDKName(bDLocation2.getGeocodeSDKName());
        bDLocation3.setAoi(bDLocation2.getAoi());
        return bDLocation3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.bdlocation.BDLocation locationResultToBDLocation(com.bytedance.bdlocation.BDLocation r5, com.bytedance.bdlocation.netwok.p511a.C9234c r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.bytedance.bdlocation.netwok.a.i r1 = r6.f25223a
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            if (r5 != 0) goto L_0x0015
            com.bytedance.bdlocation.BDLocation r0 = new com.bytedance.bdlocation.BDLocation
            java.lang.String r2 = "bd_lbs"
            java.lang.String r3 = "Android"
            r0.<init>(r2, r3)
            goto L_0x0041
        L_0x0015:
            com.bytedance.bdlocation.BDLocation r0 = new com.bytedance.bdlocation.BDLocation
            r0.<init>(r5)
            java.lang.String r2 = r5.getGeocodeSDKName()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "LBS"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0041
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "_LBS"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.setGeocodeSDKName(r2)
            goto L_0x0046
        L_0x0041:
            java.lang.String r2 = "LBS"
            r0.setGeocodeSDKName(r2)
        L_0x0046:
            r0.setBdLBSResult(r6)
            if (r5 == 0) goto L_0x0074
            boolean r5 = r5.hasAddress()
            if (r5 != 0) goto L_0x0052
            goto L_0x0074
        L_0x0052:
            com.bytedance.bdlocation.netwok.a.k r5 = r1.f25274b
            if (r5 == 0) goto L_0x0060
            java.lang.String r6 = r5.f25298d
            r0.setCountry(r6)
            java.lang.String r5 = r5.f25295a
            r0.setCountryCode(r5)
        L_0x0060:
            com.bytedance.bdlocation.netwok.a.k r5 = r1.f25276d
            if (r5 == 0) goto L_0x00f1
            java.lang.String r6 = r5.f25299e
            r0.setLocalID(r6)
            long r5 = r5.f25296b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setGeoNameID(r5)
            goto L_0x00f1
        L_0x0074:
            com.bytedance.bdlocation.netwok.a.k r5 = r1.f25274b
            if (r5 == 0) goto L_0x0082
            java.lang.String r6 = r5.f25298d
            r0.setCountry(r6)
            java.lang.String r5 = r5.f25295a
            r0.setCountryCode(r5)
        L_0x0082:
            com.bytedance.bdlocation.netwok.a.j r5 = r1.f25278f
            r6 = 0
            if (r5 == 0) goto L_0x009a
            java.util.List<java.lang.String> r2 = r5.f25283a
            boolean r2 = com.bytedance.bdlocation.Util.isEmpty(r2)
            if (r2 != 0) goto L_0x009a
            java.util.List<java.lang.String> r5 = r5.f25283a
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r0.setAddress(r5)
        L_0x009a:
            com.bytedance.bdlocation.netwok.a.k[] r5 = r1.f25275c
            if (r5 == 0) goto L_0x00a8
            int r2 = r5.length
            if (r2 <= 0) goto L_0x00a8
            r6 = r5[r6]
            java.lang.String r6 = r6.f25298d
            r0.setAdministrativeArea(r6)
        L_0x00a8:
            if (r5 == 0) goto L_0x00b5
            int r6 = r5.length
            r2 = 1
            if (r6 <= r2) goto L_0x00b5
            r5 = r5[r2]
            java.lang.String r5 = r5.f25298d
            r0.setSubAdministrativeArea(r5)
        L_0x00b5:
            com.bytedance.bdlocation.netwok.a.k r5 = r1.f25276d
            if (r5 == 0) goto L_0x00cc
            java.lang.String r6 = r5.f25298d
            r0.setCity(r6)
            java.lang.String r6 = r5.f25299e
            r0.setLocalID(r6)
            long r5 = r5.f25296b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setGeoNameID(r5)
        L_0x00cc:
            com.bytedance.bdlocation.netwok.a.k r5 = r1.f25277e
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = r5.f25298d
            r0.setDistrict(r5)
        L_0x00d5:
            com.bytedance.bdlocation.netwok.a.g r5 = r1.f25279g
            if (r5 == 0) goto L_0x00f1
            double r1 = r5.f25260d
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            double r1 = r5.f25260d
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00f1
            double r1 = r5.f25260d
            r0.setLatitude(r1)
            double r5 = r5.f25261e
            r0.setLongitude(r5)
        L_0x00f1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.LocationUtil.locationResultToBDLocation(com.bytedance.bdlocation.BDLocation, com.bytedance.bdlocation.netwok.a.c):com.bytedance.bdlocation.BDLocation");
    }

    public static BDLocation addressesToBDLocation(List<Address> list, BDLocation bDLocation, String str) {
        if (Util.isEmpty(list)) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        bDLocation2.setGeocodeSDKName(str);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Address address = (Address) it.next();
            if (address.hasLatitude() && address.hasLongitude()) {
                bDLocation2.setCountry(address.getCountryName());
                bDLocation2.setAdministrativeArea(address.getAdminArea());
                bDLocation2.setSubAdministrativeArea(address.getSubAdminArea());
                bDLocation2.setCity(address.getLocality());
                bDLocation2.setDistrict(address.getSubLocality());
                bDLocation2.setStreet(address.getThoroughfare());
                bDLocation2.setStreetNum(address.getSubThoroughfare());
                bDLocation2.setAddress(address.getAddressLine(0));
                bDLocation2.setPoi(address.getFeatureName());
                break;
            }
        }
        return bDLocation2;
    }
}
