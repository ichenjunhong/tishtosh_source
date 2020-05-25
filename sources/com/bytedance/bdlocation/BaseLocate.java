package com.bytedance.bdlocation;

import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.C9231a;
import com.bytedance.bdlocation.netwok.C9244b;
import com.bytedance.bdlocation.netwok.INetworkApiCopy;
import com.bytedance.bdlocation.netwok.p511a.C9233b;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.bytedance.bdlocation.netwok.p511a.C9235d;
import com.bytedance.bdlocation.netwok.p511a.C9239h;
import com.bytedance.bdlocation.netwok.p511a.C9240i;
import com.bytedance.bdlocation.p509a.C9222a;
import com.bytedance.bdlocation.p510b.C9226d;
import com.bytedance.bdlocation.p510b.C9227e;
import com.bytedance.bdlocation.service.C9248a;
import com.bytedance.bdlocation.service.QPSController;
import com.bytedance.bdlocation.utils.C9272c;
import com.bytedance.ttnet.p887e.C13333g;
import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public abstract class BaseLocate implements ILocate, ILocateCallback {
    protected Context mContext;
    protected QPSController mController;
    protected ILocateCallback mLocateCb;

    /* access modifiers changed from: protected */
    public abstract boolean needGeocode(BDLocation bDLocation, LocationOption locationOption);

    public void setLocateCallback(ILocateCallback iLocateCallback) {
        this.mLocateCb = iLocateCallback;
    }

    private static List<C9235d> getBssInfos(C9233b bVar) {
        if (bVar != null) {
            return bVar.f25222b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean needBDLBS(BDLocation bDLocation) {
        if (bDLocation.getBdLBSResult() == null) {
            return true;
        }
        return false;
    }

    public void onLocateStart(String str) {
        if (this.mLocateCb != null) {
            this.mLocateCb.onLocateStart(str);
        }
    }

    public void onLocateStop(String str) {
        if (this.mLocateCb != null) {
            this.mLocateCb.onLocateStop(str);
        }
    }

    private static List<Object> getPois(BDLocation bDLocation) {
        List<Object> list;
        if (bDLocation.getGCJ02() != null) {
            list = C9248a.m18347a().mo16770a(bDLocation.getGCJ02(), "gcj");
        } else {
            C9248a a = C9248a.m18347a();
            BDPoint bDPoint = new BDPoint(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getProvider());
            list = a.mo16770a(bDPoint, "wgs");
        }
        if (list == null || list.size() <= BDLocationConfig.getPoiNum()) {
            return list;
        }
        return list.subList(0, BDLocationConfig.getPoiNum() - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> getWifiSettingAndMode(android.content.Context r3) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "location"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch:{ Exception -> 0x003c }
            android.location.LocationManager r3 = (android.location.LocationManager) r3     // Catch:{ Exception -> 0x003c }
            if (r3 == 0) goto L_0x003a
            java.util.List r2 = r3.getProviders(r0)     // Catch:{ Exception -> 0x003c }
            if (r2 == 0) goto L_0x003a
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x003c }
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = "gps"
            boolean r2 = r3.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = "network"
            boolean r1 = r3.isProviderEnabled(r1)     // Catch:{ Exception -> 0x0035 }
            if (r1 == 0) goto L_0x0029
            r1 = r2 | 2
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            java.lang.String r2 = "passive"
            boolean r3 = r3.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0038 }
            if (r3 == 0) goto L_0x0049
            r1 = r1 | 4
            goto L_0x0049
        L_0x0035:
            r3 = move-exception
            r1 = r2
            goto L_0x003e
        L_0x0038:
            r3 = move-exception
            goto L_0x003e
        L_0x003a:
            r0 = 0
            goto L_0x0049
        L_0x003c:
            r3 = move-exception
            r0 = 0
        L_0x003e:
            boolean r2 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = "BDLocation"
            com.p683ss.p2544b.p2545a.C51151a.m110020b(r2, r3)
        L_0x0049:
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BaseLocate.getWifiSettingAndMode(android.content.Context):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.gson.C17980i getWifiInfoByDetail(android.content.Context r10) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x006f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Context r4 = r10.getApplicationContext()
            java.lang.String r5 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4
            if (r4 == 0) goto L_0x006f
            java.util.List r4 = r4.getScanResults()
            java.util.Iterator r4 = r4.iterator()
        L_0x0020:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r4.next()
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            java.lang.String r6 = r5.SSID
            if (r6 == 0) goto L_0x0020
            java.lang.String r6 = r5.SSID
            int r6 = r6.length()
            if (r6 == 0) goto L_0x0020
            java.lang.String r6 = r5.capabilities
            java.lang.String r7 = "[IBSS]"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0020
            java.util.Iterator r6 = r3.iterator()
        L_0x0046:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r6.next()
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
            java.lang.String r8 = r7.SSID
            java.lang.String r9 = r5.SSID
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0046
            java.lang.String r7 = r7.capabilities
            java.lang.String r8 = r5.capabilities
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0046
            r6 = 1
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r6 != 0) goto L_0x0020
            r3.add(r5)
            goto L_0x0020
        L_0x006f:
            r3 = r0
        L_0x0070:
            android.net.wifi.WifiInfo r10 = com.bytedance.bdlocation.utils.C9276g.m18394a(r10)
            com.google.gson.i r4 = new com.google.gson.i
            r4.<init>()
            if (r10 == 0) goto L_0x0091
            java.lang.String r5 = r10.getBSSID()
            java.lang.String r6 = "^[0-9|A-Z|a-z]{2}(:[0-9|A-Z|a-z]{2}){5}$"
            boolean r6 = r5.matches(r6)
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = "02:00:00:00:00:00"
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0091
            r5 = 1
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 == 0) goto L_0x00dc
            com.google.gson.o r0 = new com.google.gson.o
            r0.<init>()
            java.lang.String r5 = r10.getSSID()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00b4
            java.lang.String r6 = "\".*\""
            boolean r6 = r5.matches(r6)
            if (r6 == 0) goto L_0x00b4
            int r6 = r5.length()
            int r6 = r6 - r2
            java.lang.String r5 = r5.substring(r2, r6)
        L_0x00b4:
            java.lang.String r6 = r10.getBSSID()
            java.lang.String r7 = "wifi_name"
            r0.mo35020a(r7, r5)
            java.lang.String r5 = "wifi_mac"
            r0.mo35020a(r5, r6)
            java.lang.String r5 = "rssi"
            int r10 = r10.getRssi()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0.mo35019a(r5, r10)
            java.lang.String r10 = "is_current"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo35019a(r10, r2)
            r4.mo34903a(r0)
            r0 = r6
        L_0x00dc:
            if (r3 == 0) goto L_0x0142
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto L_0x0142
            int r10 = r3.size()
            int r2 = com.bytedance.bdlocation.client.BDLocationConfig.getWifiNum()
            if (r10 <= r2) goto L_0x00f2
            int r10 = com.bytedance.bdlocation.client.BDLocationConfig.getWifiNum()
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r2 >= r10) goto L_0x0142
            java.lang.Object r5 = r3.get(r2)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            if (r5 == 0) goto L_0x013f
            java.lang.String r6 = r5.SSID
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x013f
            java.lang.String r6 = r5.BSSID
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x013f
            java.lang.String r6 = r5.BSSID
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 != 0) goto L_0x013f
            com.google.gson.o r6 = new com.google.gson.o
            r6.<init>()
            java.lang.String r7 = "wifi_name"
            java.lang.String r8 = r5.SSID
            r6.mo35020a(r7, r8)
            java.lang.String r7 = "wifi_mac"
            java.lang.String r8 = r5.BSSID
            r6.mo35020a(r7, r8)
            java.lang.String r7 = "rssi"
            int r5 = r5.level
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo35019a(r7, r5)
            java.lang.String r5 = "is_current"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6.mo35019a(r5, r7)
            r4.mo34903a(r6)
        L_0x013f:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0142:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BaseLocate.getWifiInfoByDetail(android.content.Context):com.google.gson.i");
    }

    private void onError(Callback callback, BDLocationException bDLocationException) {
        callback.onError(bDLocationException);
    }

    public BaseLocate(Context context, QPSController qPSController) {
        this.mContext = context;
        this.mController = qPSController;
    }

    private void onLocationChanged(Callback callback, BDLocation bDLocation) {
        callback.onLocationChanged(bDLocation);
        onLocateChange(getLocateName(), bDLocation);
    }

    public void onLocateChange(String str, BDLocation bDLocation) {
        if (this.mLocateCb != null) {
            this.mLocateCb.onLocateChange(str, bDLocation);
        }
    }

    public void onLocateError(String str, BDLocationException bDLocationException) {
        if (this.mLocateCb != null) {
            this.mLocateCb.onLocateError(str, bDLocationException);
        }
    }

    private static C17980i getWifiInfo(Context context, C9227e eVar) {
        try {
            if (BDLocationConfig.isUploadWIFI()) {
                return getWifiInfoByDetail(context);
            }
            return null;
        } catch (Exception e) {
            if (BDLocationConfig.isDebug()) {
                C51151a.m110020b("BDLocation", (Throwable) e);
            }
            eVar.mo16675a("wifi_failure_reason", e.getMessage());
            return null;
        }
    }

    private static C9239h bdLocationToGpsInfo(BDLocation bDLocation, boolean z) {
        if (bDLocation == null) {
            return null;
        }
        C9239h hVar = new C9239h();
        hVar.f25263a = bDLocation.getCountry();
        hVar.f25266d = bDLocation.getDistrict();
        hVar.f25264b = bDLocation.getAdministrativeArea();
        hVar.f25265c = bDLocation.getCity();
        hVar.f25267e = bDLocation.getAddress();
        if (z) {
            hVar.f25269g = bDLocation.getLatitude();
            hVar.f25268f = bDLocation.getLongitude();
        }
        hVar.f25270h = bDLocation.getTime();
        hVar.f25271i = bDLocation.getLocationType();
        hVar.f25272j = bDLocation.getLocationSDKName();
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.bdlocation.netwok.p511a.C9234c getAndUploadLocation(com.bytedance.bdlocation.BDLocation r16, android.content.Context r17) throws java.lang.Exception {
        /*
            r0 = r16
            r1 = r17
            com.bytedance.bdlocation.b.e r8 = new com.bytedance.bdlocation.b.e
            r8.<init>()
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.bytedance.bdlocation.BDLocation r3 = new com.bytedance.bdlocation.BDLocation
            r3.<init>(r0)
            goto L_0x0013
        L_0x0012:
            r3 = r2
        L_0x0013:
            com.bytedance.bdlocation.netwok.a.b r4 = getBaseStation(r1, r8)
            com.google.gson.i r5 = getWifiInfo(r1, r8)
            android.util.Pair r0 = getWifiSettingAndMode(r17)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            if (r3 == 0) goto L_0x00ad
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadPoi()     // Catch:{ Exception -> 0x00aa }
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = getPois(r3)     // Catch:{ Exception -> 0x00aa }
            r1 = r0
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isChineseChannel()     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x0084
            com.bytedance.bdlocation.client.BDPoint r0 = r3.getGCJ02()     // Catch:{ Exception -> 0x00a8 }
            if (r0 != 0) goto L_0x0084
            com.bytedance.bdlocation.service.a r0 = com.bytedance.bdlocation.service.C9248a.m18347a()     // Catch:{ Exception -> 0x00a8 }
            com.bytedance.bdlocation.client.BDPoint r15 = new com.bytedance.bdlocation.client.BDPoint     // Catch:{ Exception -> 0x00a8 }
            double r10 = r3.getLatitude()     // Catch:{ Exception -> 0x00a8 }
            double r12 = r3.getLongitude()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r14 = r3.getProvider()     // Catch:{ Exception -> 0x00a8 }
            r9 = r15
            r9.<init>(r10, r12, r14)     // Catch:{ Exception -> 0x00a8 }
            com.bytedance.bdlocation.client.BDPoint r0 = r0.mo16769a(r15)     // Catch:{ Exception -> 0x00a8 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "gps_failure_reason"
            java.lang.String r9 = "Chinese channel cannot be converted to gcj02."
            r8.mo16675a(r0, r9)     // Catch:{ Exception -> 0x00a8 }
            r9 = 0
            r3.setLatitude(r9)     // Catch:{ Exception -> 0x00a8 }
            r3.setLongitude(r9)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0084
        L_0x0076:
            double r9 = r0.getLatitude()     // Catch:{ Exception -> 0x00a8 }
            r3.setLatitude(r9)     // Catch:{ Exception -> 0x00a8 }
            double r9 = r0.getLongitude()     // Catch:{ Exception -> 0x00a8 }
            r3.setLongitude(r9)     // Catch:{ Exception -> 0x00a8 }
        L_0x0084:
            java.lang.String r0 = "Android"
            java.lang.String r9 = r3.getLocationSDKName()     // Catch:{ Exception -> 0x00a8 }
            boolean r0 = r0.equals(r9)     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x009c
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadGPS()     // Catch:{ Exception -> 0x00a8 }
            com.bytedance.bdlocation.netwok.a.h r0 = bdLocationToGpsInfo(r3, r0)     // Catch:{ Exception -> 0x00a8 }
            r10 = r0
            r9 = r1
            r11 = r2
            goto L_0x00c5
        L_0x009c:
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isUploadGPS()     // Catch:{ Exception -> 0x00a8 }
            com.bytedance.bdlocation.netwok.a.h r0 = bdLocationToGpsInfo(r3, r0)     // Catch:{ Exception -> 0x00a8 }
            r11 = r0
            r9 = r1
            r10 = r2
            goto L_0x00c5
        L_0x00a8:
            r0 = move-exception
            goto L_0x00b7
        L_0x00aa:
            r0 = move-exception
            r1 = r2
            goto L_0x00b7
        L_0x00ad:
            java.lang.String r0 = "gps_failure_reason"
            java.lang.String r1 = "No latitude and longitude."
            r8.mo16675a(r0, r1)     // Catch:{ Exception -> 0x00aa }
            r9 = r2
            r10 = r9
            goto L_0x00c4
        L_0x00b7:
            boolean r3 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r3 == 0) goto L_0x00c2
            java.lang.String r3 = "BDLocation"
            com.p683ss.p2544b.p2545a.C51151a.m110020b(r3, r0)
        L_0x00c2:
            r9 = r1
            r10 = r2
        L_0x00c4:
            r11 = r10
        L_0x00c5:
            java.util.List r12 = getBssInfos(r4)
            r0 = r4
            r1 = r5
            r2 = r6
            r3 = r7
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            com.bytedance.bdlocation.netwok.a.c r0 = getBdLBSResult(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BaseLocate.getAndUploadLocation(com.bytedance.bdlocation.BDLocation, android.content.Context):com.bytedance.bdlocation.netwok.a.c");
    }

    private static C9233b getBaseStation(Context context, C9227e eVar) {
        try {
            if (!BDLocationConfig.isUploadBaseSite()) {
                return null;
            }
            C9272c cVar = new C9272c(context);
            C9233b bVar = new C9233b();
            if (cVar.f25378a != null) {
                bVar.f25221a = new C9235d();
                bVar.f25222b = new ArrayList();
                if (VERSION.SDK_INT >= 17) {
                    List<CellInfo> allCellInfo = cVar.f25378a.getAllCellInfo();
                    if (allCellInfo != null && !allCellInfo.isEmpty()) {
                        C9272c.m18390a(bVar.f25221a, (CellInfo) allCellInfo.get(0));
                        for (CellInfo cellInfo : allCellInfo) {
                            C9235d dVar = new C9235d();
                            C9272c.m18390a(dVar, cellInfo);
                            bVar.f25222b.add(dVar);
                        }
                    }
                } else {
                    CellLocation cellLocation = cVar.f25378a.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        bVar.f25221a.f25230a = 16;
                        bVar.f25221a.f25236g = (long) gsmCellLocation.getCid();
                        bVar.f25221a.f25235f = (long) gsmCellLocation.getCid();
                        bVar.f25221a.f25234e = (long) gsmCellLocation.getLac();
                        bVar.f25221a.f25237h = (long) gsmCellLocation.getPsc();
                    } else if (cellLocation instanceof CdmaCellLocation) {
                        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                        bVar.f25221a.f25230a = 4;
                        bVar.f25221a.f25239j = cdmaCellLocation.getBaseStationId();
                        bVar.f25221a.f25240k = cdmaCellLocation.getBaseStationLatitude();
                        bVar.f25221a.f25241l = cdmaCellLocation.getBaseStationLongitude();
                        bVar.f25221a.f25242m = cdmaCellLocation.getNetworkId();
                        bVar.f25221a.f25243n = cdmaCellLocation.getSystemId();
                    }
                    C9272c.m18389a(bVar, cVar.f25378a.getNeighboringCellInfo());
                }
            }
            return bVar;
        } catch (Exception e) {
            if (BDLocationConfig.isDebug()) {
                C51151a.m110020b("BDLocation", (Throwable) e);
            }
            eVar.mo16675a("bss_failure_reason", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        onError(r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb A[Catch:{ Exception -> 0x00f6 }, ExcHandler: BDLocationException (r12v4 'e' com.bytedance.bdlocation.client.BDLocationException A[CUSTOM_DECLARE, Catch:{ Exception -> 0x00f6 }]), Splitter:B:33:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9 A[Catch:{ Exception -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A[Catch:{ Exception -> 0x00f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void geocodeAndCallback(com.bytedance.bdlocation.BDLocation r12, com.bytedance.bdlocation.client.LocationOption r13, com.bytedance.bdlocation.client.BDLocationClient.Callback r14) {
        /*
            r11 = this;
            boolean r0 = com.bytedance.bdlocation.client.BDLocationConfig.isDebug()
            if (r0 == 0) goto L_0x0029
            if (r12 == 0) goto L_0x0029
            java.lang.String r0 = "BDLocation"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getLocateName()
            r1.append(r2)
            java.lang.String r2 = " onLocationChanged: "
            r1.append(r2)
            java.lang.String r2 = r12.getAddress()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.p2544b.p2545a.C51151a.m110018b(r0, r1)
        L_0x0029:
            com.bytedance.bdlocation.service.QPSController r0 = r11.mController
            r0.callback(r12)
            boolean r0 = com.bytedance.bdlocation.LocationUtil.isEmpty(r12)     // Catch:{ Exception -> 0x00f6 }
            if (r0 != 0) goto L_0x00e5
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f6 }
            boolean r2 = r11.needGeocode(r12, r13)     // Catch:{ Exception -> 0x00f6 }
            r3 = 0
            if (r2 == 0) goto L_0x007e
            boolean r2 = com.bytedance.bdlocation.LocationUtil.isEmpty(r12)     // Catch:{ Exception -> 0x00f6 }
            if (r2 != 0) goto L_0x007e
            com.bytedance.bdlocation.client.BDPoint r2 = new com.bytedance.bdlocation.client.BDPoint     // Catch:{ Exception -> 0x00f6 }
            double r5 = r12.getLatitude()     // Catch:{ Exception -> 0x00f6 }
            double r7 = r12.getLongitude()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r9 = r12.getProvider()     // Catch:{ Exception -> 0x00f6 }
            r4 = r2
            r4.<init>(r5, r7, r9)     // Catch:{ Exception -> 0x00f6 }
            com.bytedance.bdlocation.service.a r4 = com.bytedance.bdlocation.service.C9248a.m18347a()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r5 = "wgs"
            int r6 = r13.geocodeMode()     // Catch:{ Exception -> 0x00f6 }
            if (r6 != 0) goto L_0x0064
            goto L_0x007e
        L_0x0064:
            r7 = 2
            if (r6 != r7) goto L_0x0071
            com.bytedance.bdlocation.ILocate r6 = r4.f25308b     // Catch:{ Exception -> 0x00f6 }
            if (r6 == 0) goto L_0x0071
            com.bytedance.bdlocation.ILocate r3 = r4.f25308b     // Catch:{ Exception -> 0x00f6 }
            com.bytedance.bdlocation.BDLocation r3 = r3.geocode(r2, r5)     // Catch:{ Exception -> 0x00f6 }
        L_0x0071:
            boolean r6 = com.bytedance.bdlocation.LocationUtil.checkGeocode(r3)     // Catch:{ Exception -> 0x00f6 }
            if (r6 != 0) goto L_0x007e
            com.bytedance.bdlocation.ILocate r3 = r4.f25309c     // Catch:{ Exception -> 0x00f6 }
            com.bytedance.bdlocation.BDLocation r2 = r3.geocode(r2, r5)     // Catch:{ Exception -> 0x00f6 }
            r3 = r2
        L_0x007e:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f6 }
            com.bytedance.bdlocation.b.a r2 = r13.getTrace()     // Catch:{ Exception -> 0x00f6 }
            r6 = 0
            long r0 = r4 - r0
            long r6 = r2.f25207e     // Catch:{ Exception -> 0x00f6 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
            r2.f25207e = r0     // Catch:{ Exception -> 0x00f6 }
        L_0x0093:
            if (r3 != 0) goto L_0x0097
            r2 = r12
            goto L_0x0098
        L_0x0097:
            r2 = r3
        L_0x0098:
            boolean r6 = r11.needBDLBS(r2)     // Catch:{ Exception -> 0x00f6 }
            if (r6 == 0) goto L_0x00d0
            boolean r6 = com.bytedance.bdlocation.client.BDLocationConfig.isLocateUpload()     // Catch:{ Exception -> 0x00f6 }
            if (r6 == 0) goto L_0x00d0
            android.content.Context r0 = com.bytedance.bdlocation.client.BDLocationConfig.getContext()     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c4 }
            com.bytedance.bdlocation.netwok.a.c r0 = getAndUploadLocation(r2, r0)     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x00d7
            com.bytedance.bdlocation.BDLocation r0 = com.bytedance.bdlocation.LocationUtil.locationResultToBDLocation(r2, r0)     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c4 }
            com.bytedance.bdlocation.b.a r13 = r13.getTrace()     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c1 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c1 }
            r3 = 0
            long r1 = r1 - r4
            r13.mo16669a(r1)     // Catch:{ BDLocationException -> 0x00cb, Exception -> 0x00c1 }
            r3 = r0
            goto L_0x00d7
        L_0x00c1:
            r13 = move-exception
            r3 = r0
            goto L_0x00c5
        L_0x00c4:
            r13 = move-exception
        L_0x00c5:
            java.lang.String r0 = "BDLocation"
            com.p683ss.p2544b.p2545a.C51151a.m110020b(r0, r13)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00d7
        L_0x00cb:
            r12 = move-exception
            r11.onError(r14, r12)     // Catch:{ Exception -> 0x00f6 }
            return
        L_0x00d0:
            com.bytedance.bdlocation.b.a r13 = r13.getTrace()     // Catch:{ Exception -> 0x00f6 }
            r13.mo16669a(r0)     // Catch:{ Exception -> 0x00f6 }
        L_0x00d7:
            if (r3 == 0) goto L_0x00e1
            com.bytedance.bdlocation.BDLocation r12 = com.bytedance.bdlocation.LocationUtil.composeGeocodeLocation(r12, r3)     // Catch:{ Exception -> 0x00f6 }
            r11.onLocationChanged(r14, r12)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00f5
        L_0x00e1:
            r11.onLocationChanged(r14, r12)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010c
        L_0x00e5:
            com.bytedance.bdlocation.client.BDLocationException r12 = new com.bytedance.bdlocation.client.BDLocationException     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r13 = "SDK callback null!"
            java.lang.String r0 = r11.getLocateName()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r1 = "4"
            r12.<init>(r13, r0, r1)     // Catch:{ Exception -> 0x00f6 }
            r11.onError(r14, r12)     // Catch:{ Exception -> 0x00f6 }
        L_0x00f5:
            return
        L_0x00f6:
            r12 = move-exception
            java.lang.String r13 = r11.getLocateName()
            com.p683ss.p2544b.p2545a.C51151a.m110020b(r13, r12)
            com.bytedance.bdlocation.client.BDLocationException r13 = new com.bytedance.bdlocation.client.BDLocationException
            java.lang.String r0 = r11.getLocateName()
            java.lang.String r1 = "0"
            r13.<init>(r12, r0, r1)
            r11.onError(r14, r13)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.BaseLocate.geocodeAndCallback(com.bytedance.bdlocation.BDLocation, com.bytedance.bdlocation.client.LocationOption, com.bytedance.bdlocation.client.BDLocationClient$Callback):void");
    }

    private static C9234c getBdLBSResult(C9233b bVar, C17980i iVar, int i, int i2, List<Object> list, C9239h hVar, C9239h hVar2, List<C9235d> list2, C9227e eVar) throws Exception {
        int i3;
        int i4;
        int i5;
        String str;
        String str2;
        C9233b bVar2 = bVar;
        C17980i iVar2 = iVar;
        C9239h hVar3 = hVar;
        C9239h hVar4 = hVar2;
        C9227e eVar2 = eVar;
        if (hVar3 == null && hVar4 == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        eVar2.mo16677b("has_gps", Integer.valueOf(i3));
        if (iVar2 == null || iVar.mo34901a() == 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        eVar2.mo16677b("has_wifi", Integer.valueOf(i4));
        if (bVar2 != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        eVar2.mo16677b("has_bss", Integer.valueOf(i5));
        if (hVar3 != null) {
            eVar2.mo16675a("gps_source", C9226d.m18335a(hVar3.f25271i));
        } else if (hVar4 != null) {
            eVar2.mo16675a("gps_source", C9226d.m18335a(hVar4.f25271i));
        }
        C18085o oVar = new C18085o();
        oVar.mo35017a("sys_location", Util.sGson.mo34875a((Object) hVar3));
        oVar.mo35017a("amap_location", Util.sGson.mo34875a((Object) hVar4));
        oVar.mo35017a("base_station", Util.sGson.mo34875a((Object) bVar));
        oVar.mo35017a("wifi_info", Util.sGson.mo34875a((Object) iVar));
        oVar.mo35017a("cell", Util.sGson.mo34875a((Object) list2));
        oVar.mo35019a("location_mode", (Number) Integer.valueOf(i2));
        oVar.mo35019a("location_setting", (Number) Integer.valueOf(i));
        oVar.mo35019a("submit_time", (Number) Long.valueOf(System.currentTimeMillis() / 1000));
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        oVar.mo35020a("language", C9244b.m18344a(locale));
        List<Object> list3 = list;
        oVar.mo35017a("pois", Util.sGson.mo34875a((Object) list));
        C51151a.m110021c("BDLocation", Util.sGson.mo34886a((C18082l) oVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dwinfo", C9244b.m18342a(oVar));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("sdk_version", "1.4.0-rc.5-fix");
        C9231a networkApi = BDLocationConfig.getNetworkApi();
        if (networkApi != null) {
            str = networkApi.mo16744a(C9244b.m18341a(), "/location/locate/", linkedHashMap2, linkedHashMap, null, true);
        } else {
            str = (String) ((INetworkApiCopy) C13333g.m26861a(C9244b.m18341a(), INetworkApiCopy.class)).doPost(-1, "/location/locate/", linkedHashMap2, linkedHashMap, null, null, true).execute().f33552b;
        }
        try {
            C9234c cVar = (C9234c) Util.sGson.mo34884a(C9244b.m18343a(new JSONObject(str).getString("data")), C9234c.class);
            if (cVar == null) {
                eVar2.mo16676a(false);
            } else if (cVar.f25229g == null || cVar.f25229g.f25220b != 202) {
                C9222a aVar = C9248a.m18347a().f25307a;
                aVar.f25201b = cVar;
                try {
                    str2 = Util.sGson.mo34889b(cVar);
                } catch (Throwable th) {
                    C51151a.m110020b("BDLocation", th);
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.mo16666a("LBSResult", str2);
                }
                C51151a.m110021c("BDLocation", Util.sGson.mo34889b(cVar));
                BDLocation locationResultToBDLocation = LocationUtil.locationResultToBDLocation(cVar);
                eVar2.mo16675a("country_ascii_name", locationResultToBDLocation.getCountry());
                eVar2.mo16675a("subdivision_ascii_name", locationResultToBDLocation.getAdministrativeArea());
                eVar2.mo16675a("city_ascii_name", locationResultToBDLocation.getCity());
                eVar2.mo16675a("district_ascii_name", locationResultToBDLocation.getDistrict());
                C9240i iVar3 = cVar.f25223a;
                if (iVar3 != null) {
                    eVar2.mo16675a("method", iVar3.f25281i);
                }
                eVar2.mo16676a(true);
            } else {
                throw new BDLocationException("Disputed area", "Unknown", "10");
            }
            return cVar;
        } catch (Exception e) {
            eVar2.mo16676a(false);
            throw e;
        }
    }
}
