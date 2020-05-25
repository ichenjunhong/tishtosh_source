package com.bytedance.bdlocation.client;

import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.netwok.C9231a;
import com.bytedance.bdlocation.netwok.C9244b;
import com.bytedance.bdlocation.netwok.INetworkApiCopy;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.bytedance.bdlocation.netwok.p511a.C9237f;
import com.bytedance.bdlocation.netwok.p511a.C9240i;
import com.bytedance.bdlocation.p510b.C9225c;
import com.bytedance.bdlocation.service.C9248a;
import com.bytedance.bdlocation.service.SystemBaseLocationImpl;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p887e.C13333g;
import com.google.gson.C18085o;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class BDLocationClient {
    private boolean isStart;
    private int mId;
    private LocationOption mOption;
    private String mTag;

    public interface Callback {
        void onError(BDLocationException bDLocationException);

        void onLocationChanged(BDLocation bDLocation);
    }

    public interface LocationNotification {
        void onLocationChanged(BDLocation bDLocation, BDLocation bDLocation2);
    }

    public int getId() {
        return this.mId;
    }

    public boolean getIsStart() {
        return this.isStart;
    }

    public LocationOption getOption() {
        return this.mOption;
    }

    public BDLocation getCache() {
        return C9248a.m18347a().f25307a.mo16665a();
    }

    public Long getInterval() {
        return Long.valueOf(this.mOption.getInterval());
    }

    public BDLocationClient reset() {
        this.mOption = new LocationOption(this.mTag);
        this.mOption.setMaxCacheTime(600000);
        this.mOption.setLocationTimeOutMs(30000);
        return this;
    }

    public void stopLocation() {
        synchronized (this) {
            C9248a.m18347a().mo16771a(this.mId);
            this.isStart = false;
        }
    }

    public BDLocation getLocation() throws BDLocationException {
        if (this.mOption.getInterval() != 0) {
            this.mOption.setInterval(0);
        }
        return C9248a.m18347a().mo16768a(new LocationOption(this.mOption));
    }

    public C9237f getCountry() {
        String str;
        try {
            C18085o oVar = new C18085o();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("getcountry", C9244b.m18342a(oVar));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("sdk_version", "1.4.0-rc.5-fix");
            C9231a networkApi = BDLocationConfig.getNetworkApi();
            if (networkApi != null) {
                str = networkApi.mo16744a(C9244b.m18341a(), "/location/getcountry/", linkedHashMap2, linkedHashMap, null, true);
            } else {
                str = (String) ((INetworkApiCopy) C13333g.m26861a(C9244b.m18341a(), INetworkApiCopy.class)).doPost(-1, "/location/getcountry/", linkedHashMap2, linkedHashMap, null, null, true).execute().f33552b;
            }
            String string = new JSONObject(str).getString("data");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            C9237f fVar = (C9237f) Util.sGson.mo34884a(C9244b.m18343a(string), C9237f.class);
            C51151a.m110021c("BDLocation", Util.sGson.mo34889b(fVar));
            return fVar;
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
            return null;
        }
    }

    public BDLocationClient setGeocodeMode(int i) {
        this.mOption.geocodeMode = i;
        return this;
    }

    public BDLocationClient setLocationInterval(long j) {
        this.mOption.interval = j;
        return this;
    }

    public BDLocationClient setLocationMode(int i) {
        this.mOption.mode = i;
        return this;
    }

    public BDLocationClient setLocationTimeOut(long j) {
        this.mOption.locationTimeOutMs = j;
        return this;
    }

    public BDLocationClient setMaxCacheTime(long j) {
        this.mOption.maxCacheTime = j;
        return this;
    }

    public BDLocationClient setTraceCallback(C9225c cVar) {
        this.mOption.setTraceCallback(cVar);
        return this;
    }

    public BDLocationClient(String str) {
        this.mTag = str;
        reset();
    }

    public BDPoint convertGCJ02(BDPoint bDPoint) {
        return C9248a.m18347a().mo16769a(bDPoint);
    }

    public void getLocation(Callback callback) {
        if (this.mOption.getInterval() != 0) {
            this.mOption.setInterval(0);
        }
        C9248a.m18347a().mo16767a(callback, new LocationOption(this.mOption));
    }

    public C9234c getBdLBSResult(boolean z) {
        C9234c cVar;
        BDLocation bDLocation = null;
        if (z) {
            cVar = C9248a.m18347a().f25307a.mo16667b();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        try {
            if (Util.needLocate()) {
                bDLocation = getLocation();
            }
            return SystemBaseLocationImpl.getAndUploadLocation(bDLocation, BDLocationConfig.getContext());
        } catch (BDLocationException | Exception unused) {
            return cVar;
        }
    }

    public void startLocation(Callback callback) {
        synchronized (this) {
            if (!this.isStart) {
                this.isStart = true;
                if (this.mOption.getInterval() < 1000) {
                    this.mOption.setInterval(1000);
                }
                this.mId = C9248a.m18347a().mo16767a(callback, new LocationOption(this.mOption));
            }
        }
    }

    public List<BDLocation> geocodeForDetail(BDPoint bDPoint) {
        try {
            BDLocation createLocation = LocationUtil.createLocation(bDPoint.getLatitude(), bDPoint.getLongitude());
            INetworkApi iNetworkApi = (INetworkApi) C13333g.m26861a(C9244b.m18341a(), INetworkApi.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("longitude", String.valueOf(createLocation.getLongitude()));
            linkedHashMap.put("latitude", String.valueOf(createLocation.getLatitude()));
            Locale locale = BDLocationConfig.getLocale();
            if (locale == null) {
                locale = Locale.getDefault();
            }
            linkedHashMap.put("language", C9244b.m18344a(locale));
            JSONArray jSONArray = new JSONObject((String) iNetworkApi.doGet(true, -1, "/location/gis/reverse_geolocation_i18n", linkedHashMap, null, null).execute().f33552b).getJSONArray("locations");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(LocationUtil.locationResultToBDLocation((C9240i) Util.sGson.mo34884a(jSONArray.getString(0), C9240i.class)));
            }
            return arrayList;
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
            return null;
        }
    }

    public List<Object> getPoi(BDPoint bDPoint, String str) {
        return C9248a.m18347a().mo16770a(bDPoint, str);
    }

    public BDLocation geocode(BDPoint bDPoint, String str) {
        BDLocation bDLocation;
        C9248a a = C9248a.m18347a();
        if (a.f25308b != null) {
            bDLocation = a.f25308b.geocode(bDPoint, str);
        } else {
            bDLocation = null;
        }
        if (!LocationUtil.checkGeocode(bDLocation)) {
            return a.f25309c.geocode(bDPoint, str);
        }
        return bDLocation;
    }
}
