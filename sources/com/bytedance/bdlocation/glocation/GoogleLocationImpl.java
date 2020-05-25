package com.bytedance.bdlocation.glocation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.BaseLocate;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.service.C9248a;
import com.bytedance.bdlocation.service.QPSController;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15234a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.internal.C15291bt;
import com.google.android.gms.common.api.internal.C15336h;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.common.api.internal.C15341j;
import com.google.android.gms.common.api.internal.C15347p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.location.C16870aa;
import com.google.android.gms.location.C16882b;
import com.google.android.gms.location.C16885d;
import com.google.android.gms.location.C16886e;
import com.google.android.gms.location.C16908z;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.p1033b.C15172a;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.List;
import java.util.Locale;

public class GoogleLocationImpl extends BaseLocate implements C15235b, C15236c {
    public Callback mCallback;
    private C15233f mClient;
    private C16885d mFusedLocationCallback = new C16885d() {
        /* renamed from: a */
        public final void mo16742a(LocationResult locationResult) {
            super.mo16742a(locationResult);
            if (locationResult != null) {
                if (!C9248a.m18347a().mo16774b()) {
                    GoogleLocationImpl.this.stopLocation();
                }
                for (Location location : locationResult.f47636b) {
                    if (!LocationUtil.isEmpty(location)) {
                        GoogleLocationImpl.this.geocodeAndCallback(new BDLocation(location, "Google"), GoogleLocationImpl.this.mOption, GoogleLocationImpl.this.mCallback);
                        return;
                    }
                }
            }
        }
    };
    private C16882b mFusedLocationClient;
    private Looper mLooper;
    public LocationOption mOption;

    private int transformMode(int i) {
        if (i == 0) {
            return 104;
        }
        return i == 1 ? 100 : 100;
    }

    public BDPoint convertGCJ02(BDPoint bDPoint) {
        return null;
    }

    public String getLocateName() {
        return "Google";
    }

    public List<Object> getPoiSync(BDPoint bDPoint, String str) {
        return null;
    }

    public boolean needGeocode(BDLocation bDLocation, LocationOption locationOption) {
        return true;
    }

    public void onConnectionSuspended(int i) {
    }

    public void setLocale(Locale locale) {
    }

    public void stopLocation() {
        try {
            if (this.mFusedLocationClient != null) {
                C16882b bVar = this.mFusedLocationClient;
                C16885d dVar = this.mFusedLocationCallback;
                String simpleName = C16885d.class.getSimpleName();
                C15464q.m32124a(dVar, (Object) "Listener must not be null");
                C15464q.m32124a(simpleName, (Object) "Listener type must not be null");
                C15464q.m32126a(simpleName, (Object) "Listener type must not be empty");
                bVar.mo28087a(new C15337a(dVar, simpleName)).mo27990a((C15172a<TResult, TContinuationResult>) new C15291bt<TResult,TContinuationResult>());
            }
            this.mClient.mo28111g();
            onLocateStop("Google");
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
        }
    }

    private void onError(BDLocationException bDLocationException) {
        this.mCallback.onError(bDLocationException);
        onLocateError("Google", bDLocationException);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        StringBuilder sb = new StringBuilder("Connect google service fail: ");
        sb.append(connectionResult.f39248d);
        sb.append(", code : ");
        sb.append(connectionResult.f39246b);
        onError(new BDLocationException(sb.toString(), "Google", "1"));
    }

    public void onConnected(Bundle bundle) {
        boolean z;
        try {
            this.mFusedLocationClient = new C16882b(this.mContext);
            LocationRequest locationRequest = new LocationRequest();
            if (this.mOption.getInterval() == 0) {
                locationRequest.mo32563a(300);
            } else {
                locationRequest.mo32563a(this.mOption.getInterval());
            }
            long locationTimeOutMs = this.mOption.getLocationTimeOutMs();
            LocationRequest.m40985b(locationTimeOutMs);
            locationRequest.f47634h = locationTimeOutMs;
            int transformMode = transformMode(this.mOption.getMode());
            switch (transformMode) {
                case 100:
                case 102:
                case 104:
                case 105:
                    locationRequest.f47627a = transformMode;
                    C16882b bVar = this.mFusedLocationClient;
                    C16885d dVar = this.mFusedLocationCallback;
                    Looper looper = this.mLooper;
                    zzbd zzbd = new zzbd(locationRequest, zzbd.f46413a, null, false, false, false, null);
                    if (looper == null) {
                        if (Looper.myLooper() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C15464q.m32130a(z, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
                        looper = Looper.myLooper();
                    }
                    String simpleName = C16885d.class.getSimpleName();
                    C15464q.m32124a(dVar, (Object) "Listener must not be null");
                    C15464q.m32124a(looper, (Object) "Looper must not be null");
                    C15464q.m32124a(simpleName, (Object) "Listener type must not be null");
                    C15336h hVar = new C15336h(looper, dVar, simpleName);
                    bVar.mo28088a((C15341j) new C16908z(bVar, hVar, zzbd, hVar), (C15347p) new C16870aa(bVar, hVar.f39616b));
                    onLocateStart("Google");
                    return;
                default:
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("invalid quality: ");
                    sb.append(transformMode);
                    throw new IllegalArgumentException(sb.toString());
            }
        } catch (SecurityException e) {
            onError(new BDLocationException((Throwable) e, "Google", "1"));
        } catch (Exception e2) {
            onError(new BDLocationException((Throwable) e2, "Google", "1"));
        }
    }

    public GoogleLocationImpl(Context context, QPSController qPSController) {
        super(context, qPSController);
    }

    public BDLocation geocode(BDPoint bDPoint, String str) {
        BDLocation bDLocation = new BDLocation(bDPoint.getProvider(), "Google");
        bDLocation.setLatitude(bDPoint.getLatitude());
        bDLocation.setLongitude(bDPoint.getLongitude());
        try {
            return LocationUtil.geocode(this.mContext, bDLocation);
        } catch (Exception e) {
            C51151a.m110020b("BDLocation", (Throwable) e);
            return null;
        }
    }

    public void startLocation(Callback callback, LocationOption locationOption, Looper looper) {
        if (!Util.isLocationEnabled()) {
            callback.onError(new BDLocationException("定位服务没有开启，请在设置中打开定位服务开关", "Google", "7"));
            return;
        }
        this.mClient = new C15234a(this.mContext).mo28118a((C15235b) this).mo28119a((C15236c) this).mo28116a(C16886e.f47652a).mo28120a();
        this.mOption = locationOption;
        this.mCallback = callback;
        this.mLooper = looper;
        this.mClient.mo28109e();
    }
}
