package com.bytedance.bdlocation.client;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient.LocationNotification;
import com.bytedance.bdlocation.netwok.C9231a;
import com.bytedance.bdlocation.p510b.C9224b;
import com.bytedance.bdlocation.service.C9248a;
import com.bytedance.bdlocation.service.C9254c;
import com.bytedance.bdlocation.service.C9265f;
import com.bytedance.bdlocation.service.SystemBaseLocationImpl;
import com.bytedance.bdlocation.utils.C9267a;
import com.bytedance.bdlocation.utils.C9270b;
import com.bytedance.bdlocation.utils.C9270b.C9271a;
import com.bytedance.bdlocation.utils.C9273d;
import com.bytedance.bdlocation.utils.C9274e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p683ss.p2544b.p2545a.C51151a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class BDLocationConfig {
    private static boolean enableBackgroundLocate = true;
    private static boolean isChineseChannel = true;
    private static boolean isDebug = false;
    private static boolean isLocateUpload = true;
    private static boolean isUpload = false;
    private static boolean isUploadBaseSite = true;
    private static boolean isUploadGPS = false;
    private static boolean isUploadPoi = false;
    private static boolean isUploadWIFI = true;
    private static String sBaseUrl = null;
    private static int sBssNum = 10;
    public static Context sContext = null;
    private static long sInterval = 600000;
    private static Locale sLocale = null;
    private static long sMaxLocationTimeMs = -1;
    private static BDLocation sMockLocation = null;
    private static C9231a sNetworkApi = null;
    private static SparseArray<List<LocationNotification>> sNotifications = new SparseArray<>();
    private static int sPoiNum = 20;
    private static C9270b sProvider = null;
    private static boolean sReportAtStart = false;
    private static final List<C9224b> sTraceListeners = new ArrayList();
    private static final Object sTraceLock = new Object();
    private static boolean sUploadMccAndSystemRegionInfo = false;
    private static int sWifiNum = 10;
    private static int uploadDelayTime = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationRange {
    }

    public static C9270b getAppBackgroundProvider() {
        return sProvider;
    }

    public static String getBaseUrl() {
        return sBaseUrl;
    }

    public static int getBssNum() {
        return sBssNum;
    }

    public static Context getContext() {
        return sContext;
    }

    public static boolean getEnableBackgroundLocate() {
        return enableBackgroundLocate;
    }

    public static Locale getLocale() {
        return sLocale;
    }

    public static long getMaxLocationTimeMs() {
        return sMaxLocationTimeMs;
    }

    public static BDLocation getMockLocation() {
        return sMockLocation;
    }

    public static C9231a getNetworkApi() {
        return sNetworkApi;
    }

    public static int getPoiNum() {
        return sPoiNum;
    }

    public static int getUploadDelayTime() {
        return uploadDelayTime;
    }

    public static long getUploadInterval() {
        return sInterval;
    }

    public static int getWifiNum() {
        return sWifiNum;
    }

    public static boolean isChineseChannel() {
        return isChineseChannel;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static boolean isLocateUpload() {
        return isLocateUpload;
    }

    public static boolean isReportAtStart() {
        return sReportAtStart;
    }

    public static boolean isUpload() {
        return isUpload;
    }

    public static boolean isUploadBaseSite() {
        return isUploadBaseSite;
    }

    public static boolean isUploadGPS() {
        return isUploadGPS;
    }

    public static boolean isUploadMccAndSystemRegionInfo() {
        return sUploadMccAndSystemRegionInfo;
    }

    public static boolean isUploadPoi() {
        return isUploadPoi;
    }

    public static boolean isUploadWIFI() {
        return isUploadWIFI;
    }

    private static boolean isInit() {
        if (sContext != null) {
            return true;
        }
        return false;
    }

    public static void checkInit() {
        if (getContext() == null) {
            throw new RuntimeException("Must be called after BDLocation initialization!");
        }
    }

    public static void setBssNum(int i) {
        sBssNum = i;
    }

    public static void setChineseChannel(boolean z) {
        isChineseChannel = z;
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setEnableBackgroundLocate(boolean z) {
        enableBackgroundLocate = z;
    }

    public static void setIsUploadGPS(boolean z) {
        isUploadGPS = z;
    }

    public static void setLocale(Locale locale) {
        sLocale = locale;
    }

    public static void setLocateUpload(boolean z) {
        isLocateUpload = z;
    }

    public static void setMaxLocationTimeMs(long j) {
        sMaxLocationTimeMs = j;
    }

    public static void setNetworkApi(C9231a aVar) {
        sNetworkApi = aVar;
    }

    public static void setPoiNum(int i) {
        sPoiNum = i;
    }

    public static void setReportAtStart(boolean z) {
        sReportAtStart = z;
    }

    public static void setUploadBaseSite(boolean z) {
        isUploadBaseSite = z;
    }

    public static void setUploadDelayTime(int i) {
        uploadDelayTime = i;
    }

    public static void setUploadInterval(long j) {
        sInterval = j;
    }

    public static void setUploadMccAndSystemRegionInfo(boolean z) {
        sUploadMccAndSystemRegionInfo = z;
    }

    public static void setUploadPoi(boolean z) {
        isUploadPoi = z;
    }

    public static void setUploadWIFI(boolean z) {
        isUploadWIFI = z;
    }

    public static void setWifiNum(int i) {
        sWifiNum = i;
    }

    public static void init(Application application) {
        init(application, "", -1);
    }

    public static void addTraceListener(C9224b bVar) {
        synchronized (sTraceLock) {
            sTraceListeners.add(bVar);
        }
    }

    public static void removeTraceListener(C9224b bVar) {
        synchronized (sTraceLock) {
            sTraceListeners.remove(bVar);
        }
    }

    public static void setAppBackgroundProvider(C9270b bVar) {
        C9271a aVar;
        if (sProvider != null) {
            aVar = sProvider.f25376a;
            sProvider.f25376a = null;
        } else {
            aVar = null;
        }
        sProvider = bVar;
        if (aVar != null) {
            sProvider.f25376a = aVar;
        }
    }

    private static List<LocationNotification> switchNotification(int i) {
        List<LocationNotification> list = (List) sNotifications.get(i);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        sNotifications.put(i, arrayList);
        return arrayList;
    }

    public static void setBaseUrl(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains(WebKitApi.SCHEME_HTTPS)) {
            if (!isDebug()) {
                C51151a.m110023e("BDLocation", "Base url should be https !!!");
            } else {
                throw new IllegalArgumentException("Base url should be https !!!");
            }
        }
        sBaseUrl = str;
    }

    public static void setMockLocation(final BDLocation bDLocation) {
        sMockLocation = bDLocation;
        if (isInit()) {
            C92292 r0 = new Runnable() {
                public final void run() {
                    try {
                        SystemBaseLocationImpl.getAndUploadLocation(bDLocation, BDLocationConfig.getContext());
                    } catch (Exception unused) {
                        C51151a.m110022d("BDLocation", "server mock failed.");
                    }
                }
            };
            if (C9274e.f25380b == null) {
                C9274e.f25380b = new Handler(C9274e.m18392a());
            }
            C9274e.f25380b.post(r0);
        }
    }

    public static void setUpload(boolean z) {
        if (isInit() && !isUpload && z && C9912g.m19864a(sContext)) {
            new Handler(C9274e.m18392a()).postDelayed(new Runnable() {
                public final void run() {
                    if (!C9265f.m18378c()) {
                        C9265f.m18377a(true);
                        C9248a.m18347a().mo16773a((C9254c) new C9265f(BDLocationConfig.sContext));
                    }
                }
            }, (long) getUploadDelayTime());
        }
        isUpload = z;
    }

    public static void addNotification(LocationNotification locationNotification, int i) {
        switchNotification(i).add(locationNotification);
    }

    public static void removeNotification(LocationNotification locationNotification, int i) {
        switchNotification(i).remove(locationNotification);
    }

    public static void notificationLocationChange(int i, BDLocation bDLocation, BDLocation bDLocation2) {
        while (i < 6) {
            List<LocationNotification> list = (List) sNotifications.get(i);
            if (list != null) {
                for (LocationNotification onLocationChanged : list) {
                    onLocationChanged.onLocationChanged(bDLocation, bDLocation2);
                }
            }
            i++;
        }
    }

    public static void init(Application application, String str, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sContext == null) {
            Context applicationContext = application.getApplicationContext();
            sContext = applicationContext;
            Util.ready(applicationContext);
            if (sProvider == null) {
                C9273d dVar = new C9273d();
                application.registerActivityLifecycleCallbacks(C9267a.f25375c);
                synchronized (C9267a.class) {
                    C9267a.f25374b.add(dVar);
                }
                setAppBackgroundProvider(dVar);
            }
            C9248a.m18347a();
            initStatistics(application, str, i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gps_switch", Util.getGpsStatus(application));
                jSONObject.put("gps_permission", Util.checkPermissions(application, "android.permission.ACCESS_FINE_LOCATION"));
                jSONObject.put("bss_permission", Util.checkPermissions(application, "android.permission.ACCESS_COARSE_LOCATION"));
                jSONObject.put("wifi_permission", Util.checkPermissions(application, "android.permission.ACCESS_COARSE_LOCATION"));
                jSONObject.put("duration", SystemClock.elapsedRealtime() - elapsedRealtime);
                notifyTraceListener("bd_location_sdk_init", null, jSONObject, null);
            } catch (JSONException unused) {
            }
        }
    }

    private static void initStatistics(Context context, String str, int i) {
        try {
            Class cls = Class.forName("com.bytedance.bdlocation.statistics.LocationStatistics");
            Method method = cls.getMethod("init", new Class[]{Context.class});
            Method method2 = cls.getMethod("init", new Class[]{Context.class, String.class, Integer.TYPE});
            if (!TextUtils.isEmpty(str)) {
                method2.invoke(cls, new Object[]{context, str, Integer.valueOf(i)});
                return;
            }
            method.invoke(cls, new Object[]{context});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
        }
    }

    public static void notifyTraceListener(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!sTraceListeners.isEmpty()) {
            synchronized (sTraceLock) {
                Iterator it = sTraceListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
