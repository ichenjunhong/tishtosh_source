package com.bytedance.bdlocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.support.p030v4.content.C0745i;
import android.text.TextUtils;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.utils.BDLocationDeserializer;
import com.bytedance.bdlocation.utils.BDLocationSerializer;
import com.bytedance.bdlocation.utils.C9275f;
import com.bytedance.bdlocation.utils.LocationDeserializer;
import com.bytedance.bdlocation.utils.LocationSerializer;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class Util {
    public static int LOCATION_PERMISSION_NO = 71;
    public static int LOCATION_PERMISSION_OK = 1;
    public static int currentGPSState = -1;
    public static boolean isFinish = false;
    public static C17971f sGson;
    private static ExecutorService sWorker = _lancet.m18320x6416be54();

    static class GPSReceiver extends BroadcastReceiver {
        GPSReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
                int gpsStatusLimitTime = Util.getGpsStatusLimitTime(context);
                Util.currentGPSState = gpsStatusLimitTime;
                StringBuilder sb = new StringBuilder("GPSReceiver onReceive: ");
                sb.append(gpsStatusLimitTime);
                C51151a.m110021c("GPSReceiver", sb.toString());
            }
        }
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m18320x6416be54() {
            return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        }
    }

    public static boolean needLocate() {
        if (VERSION.SDK_INT < 23 || checkLocationPermissions(BDLocationConfig.getContext()) == LOCATION_PERMISSION_OK) {
            return true;
        }
        return false;
    }

    static {
        C17978g gVar = new C17978g();
        gVar.f49902a = gVar.f49902a.mo34915a(new C9275f(), false, true);
        gVar.f49902a = gVar.f49902a.mo34915a(new C9275f(), true, false);
        sGson = gVar.mo34895a(Location.class, (Object) new LocationSerializer()).mo34895a(Location.class, (Object) new LocationDeserializer()).mo34895a(BDLocation.class, (Object) new BDLocationSerializer()).mo34895a(BDLocation.class, (Object) new BDLocationDeserializer()).mo34900d();
    }

    public static boolean isLocationEnabled() {
        if (VERSION.SDK_INT >= 28) {
            return ((LocationManager) BDLocationConfig.getContext().getSystemService("location")).isLocationEnabled();
        }
        if (VERSION.SDK_INT >= 19) {
            try {
                if (Secure.getInt(BDLocationConfig.getContext().getContentResolver(), "location_mode") != 0) {
                    return true;
                }
                return false;
            } catch (SettingNotFoundException unused) {
                return false;
            }
        } else if (!TextUtils.isEmpty(Secure.getString(BDLocationConfig.getContext().getContentResolver(), "location_providers_allowed"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int getGpsStatus(Context context) {
        if (currentGPSState != -1) {
            return currentGPSState;
        }
        return getGpsStatusLimitTime(context);
    }

    public static boolean isEmpty(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static int checkLocationPermissions(Context context) {
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        for (int i = 0; i < 2; i++) {
            if (C0745i.m2143a(context, strArr[i]) == 0) {
                return LOCATION_PERMISSION_OK;
            }
        }
        return LOCATION_PERMISSION_NO;
    }

    public static void ready(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.PROVIDERS_CHANGED");
            context.registerReceiver(new GPSReceiver(), intentFilter);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("ready: ");
            sb.append(e.getMessage());
            C51151a.m110019b("Util", sb.toString(), e);
        }
    }

    public static int getGpsStatusLimitTime(final Context context) {
        isFinish = false;
        sWorker.submit(new Runnable() {
            public final void run() {
                int i = 0;
                try {
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    if (locationManager != null) {
                        List providers = locationManager.getProviders(true);
                        if (providers != null && !providers.isEmpty() && locationManager.isProviderEnabled("gps")) {
                            i = 1;
                        }
                    }
                } catch (Exception e) {
                    if (BDLocationConfig.isDebug()) {
                        StringBuilder sb = new StringBuilder("getGpsStatusLimitTime: ");
                        sb.append(e.getMessage());
                        C51151a.m110019b("Util", sb.toString(), e);
                    }
                }
                Util.currentGPSState = i;
                Util.isFinish = true;
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        int i = 1;
        while (System.currentTimeMillis() - currentTimeMillis < 300 && !isFinish) {
            try {
                Thread.sleep((long) i);
                if (i < 10) {
                    i++;
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("getGpsStatusLimitTime: ");
                sb.append(e.getMessage());
                C51151a.m110019b("Util", sb.toString(), e);
            }
        }
        if (!isFinish) {
            return -1;
        }
        return currentGPSState;
    }

    public static int checkPermissions(Context context, String str) {
        if (C0745i.m2143a(context, str) == 0) {
            return LOCATION_PERMISSION_OK;
        }
        return LOCATION_PERMISSION_NO;
    }
}
