package com.bytedance.bdlocation.service;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.BaseLocate;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.netwok.p511a.C9234c;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.List;
import java.util.Locale;

public class SystemBaseLocationImpl extends BaseLocate {
    public static final String LBS_GEOCODE_NAME = "LBS";
    public static final String LOCATION_NAME = "Android";
    public static final String SYS_GEOCODE_NAME = "Android";
    public Callback mCallback;
    private LocationListener mGPSListener = new LocationListener() {
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            StringBuilder sb = new StringBuilder("onProviderDisabled:");
            sb.append(str);
            C51151a.m110021c("BDLocation", sb.toString());
            SystemBaseLocationImpl.this.mGpsDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            try {
                if (!C9248a.m18347a().mo16774b()) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl.this.mLastLocation = SystemBaseLocationImpl.this.transform(location, 1);
                SystemBaseLocationImpl.this.geocodeAndCallback(SystemBaseLocationImpl.this.mLastLocation, SystemBaseLocationImpl.this.mOption, SystemBaseLocationImpl.this.mCallback);
            } catch (Exception e) {
                C51151a.m110020b("Android", (Throwable) e);
            }
        }
    };
    public boolean mGpsDisabled;
    public BDLocation mLastLocation;
    private LocationManager mManager;
    private LocationListener mNetWorkListener = new LocationListener() {
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public final void onProviderEnabled(String str) {
            SystemBaseLocationImpl.this.mNetworkDisabled = false;
        }

        public final void onProviderDisabled(String str) {
            StringBuilder sb = new StringBuilder("onProviderDisabled:");
            sb.append(str);
            C51151a.m110021c("BDLocation", sb.toString());
            SystemBaseLocationImpl.this.mNetworkDisabled = true;
            SystemBaseLocationImpl.this.checkAndCallback();
        }

        public final void onLocationChanged(Location location) {
            try {
                if (!C9248a.m18347a().mo16774b()) {
                    SystemBaseLocationImpl.this.stopLocation();
                }
                SystemBaseLocationImpl.this.mLastLocation = SystemBaseLocationImpl.this.transform(location, 4);
                SystemBaseLocationImpl.this.geocodeAndCallback(SystemBaseLocationImpl.this.mLastLocation, SystemBaseLocationImpl.this.mOption, SystemBaseLocationImpl.this.mCallback);
            } catch (Exception e) {
                C51151a.m110020b("Android", (Throwable) e);
            }
        }
    };
    public boolean mNetworkDisabled;
    public LocationOption mOption;

    public BDPoint convertGCJ02(BDPoint bDPoint) {
        return null;
    }

    public String getLocateName() {
        return "Android";
    }

    public List<Object> getPoiSync(BDPoint bDPoint, String str) {
        return null;
    }

    public boolean needGeocode(BDLocation bDLocation, LocationOption locationOption) {
        return true;
    }

    public void setLocale(Locale locale) {
    }

    public void checkAndCallback() {
        if (checkProviderDisabled(this.mOption.getMode())) {
            geocodeAndCallback(null, this.mOption, this.mCallback);
        }
    }

    public void stopLocation() {
        try {
            this.mManager.removeUpdates(this.mNetWorkListener);
            this.mManager.removeUpdates(this.mGPSListener);
            if (BDLocationConfig.isDebug()) {
                C51151a.m110018b("BDLocation", "Android stopLocation");
            }
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
        }
    }

    public void setLocation(BDLocation bDLocation) {
        this.mLastLocation = bDLocation;
    }

    private boolean checkProviderDisabled(int i) {
        if (i == 2) {
            if (!this.mGpsDisabled || !this.mNetworkDisabled) {
                return false;
            }
            return true;
        } else if (i == 0) {
            return this.mNetworkDisabled;
        } else {
            return this.mGpsDisabled;
        }
    }

    public BDLocation transform(Location location, int i) {
        return transform(location, i, false);
    }

    public SystemBaseLocationImpl(Context context, QPSController qPSController) {
        super(context, qPSController);
        this.mManager = (LocationManager) context.getSystemService("location");
    }

    public SystemBaseLocationImpl(Context context, LocationManager locationManager) {
        super(context, null);
        this.mContext = context;
        if (locationManager == null) {
            this.mManager = (LocationManager) context.getSystemService("location");
        } else {
            this.mManager = locationManager;
        }
    }

    public BDLocation geocode(BDPoint bDPoint, String str) {
        BDLocation bDLocation;
        C9234c cVar;
        BDLocation bDLocation2 = null;
        if (!"wgs".equals(str)) {
            return null;
        }
        BDLocation bDLocation3 = new BDLocation(bDPoint.getProvider(), "Android");
        bDLocation3.setLatitude(bDPoint.getLatitude());
        bDLocation3.setLongitude(bDPoint.getLongitude());
        try {
            if (BDLocationConfig.isLocateUpload()) {
                cVar = getAndUploadLocation(bDLocation3, this.mContext);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                bDLocation2 = LocationUtil.locationResultToBDLocation(cVar);
            }
            if (!LocationUtil.checkGeocode(bDLocation2)) {
                bDLocation = LocationUtil.geocode(this.mContext, bDLocation3);
                return bDLocation;
            }
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
        }
        bDLocation = bDLocation2;
        return bDLocation;
    }

    private BDLocation transform(Location location, int i, boolean z) {
        if (location == null) {
            return null;
        }
        BDLocation bDLocation = new BDLocation(location, "Android");
        bDLocation.setLocationType(i);
        bDLocation.setCache(z);
        return bDLocation;
    }

    public void startLocation(Callback callback, LocationOption locationOption, Looper looper) {
        boolean z;
        long j;
        if (!Util.isLocationEnabled()) {
            callback.onError(new BDLocationException("定位服务没有开启，请在设置中打开定位服务开关", "Android", "7"));
            return;
        }
        this.mCallback = callback;
        this.mOption = locationOption;
        if (locationOption.getInterval() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                Location lastKnownLocation = this.mManager.getLastKnownLocation("gps");
                Location lastKnownLocation2 = this.mManager.getLastKnownLocation("network");
                if (lastKnownLocation2 != null && LocationUtil.checkCacheTime(lastKnownLocation2.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(lastKnownLocation2)) {
                    geocodeAndCallback(transform(lastKnownLocation2, 4, true), locationOption, this.mCallback);
                    return;
                } else if (lastKnownLocation != null && LocationUtil.checkCacheTime(lastKnownLocation.getTime(), locationOption.getMaxCacheTime()) && !LocationUtil.isEmpty(lastKnownLocation)) {
                    geocodeAndCallback(transform(lastKnownLocation, 1, true), locationOption, this.mCallback);
                    return;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (locationOption.getInterval() > 0) {
            j = locationOption.getInterval();
        } else {
            j = 300;
        }
        if (locationOption.getMode() == 0) {
            this.mManager.requestLocationUpdates("network", j, 0.0f, this.mNetWorkListener, looper);
        } else if (locationOption.getMode() == 1) {
            this.mManager.requestLocationUpdates("gps", j, 0.0f, this.mGPSListener, looper);
        } else {
            this.mManager.requestLocationUpdates("network", j, 0.0f, this.mNetWorkListener, looper);
            this.mManager.requestLocationUpdates("gps", j, 0.0f, this.mGPSListener, looper);
        }
        onLocateStart("Android");
        if (BDLocationConfig.isDebug()) {
            C51151a.m110018b("BDLocation", "Android startLocation");
        }
    }
}
