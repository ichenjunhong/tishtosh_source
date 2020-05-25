package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.ILocate;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.client.LocationRequest;
import com.bytedance.bdlocation.p509a.C9222a;
import com.bytedance.bdlocation.p510b.C9223a;
import com.bytedance.bdlocation.utils.C9274e;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.bdlocation.service.a */
public class C9248a {

    /* renamed from: d */
    private static volatile C9248a f25306d;

    /* renamed from: a */
    public C9222a f25307a;

    /* renamed from: b */
    public ILocate f25308b;

    /* renamed from: c */
    public ILocate f25309c;

    /* renamed from: e */
    private C9250b f25310e;

    /* renamed from: f */
    private C9255d f25311f;

    /* renamed from: b */
    public final boolean mo16774b() {
        return this.f25310e.mo16776a();
    }

    /* renamed from: a */
    public static C9248a m18347a() {
        if (f25306d == null) {
            synchronized (C9248a.class) {
                if (f25306d == null) {
                    f25306d = new C9248a(BDLocationConfig.getContext());
                }
            }
        }
        return f25306d;
    }

    /* renamed from: a */
    public final void mo16771a(int i) {
        mo16772a(i, false);
    }

    /* renamed from: a */
    public final void mo16773a(C9254c cVar) {
        this.f25311f.mo16785a(cVar);
    }

    /* renamed from: a */
    public final BDLocation mo16768a(LocationOption locationOption) throws BDLocationException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final BDLocation[] bDLocationArr = new BDLocation[1];
        final BDLocationException[] bDLocationExceptionArr = new BDLocationException[1];
        mo16767a((Callback) new Callback() {
            public final void onError(BDLocationException bDLocationException) {
                bDLocationExceptionArr[0] = bDLocationException;
                countDownLatch.countDown();
            }

            public final void onLocationChanged(BDLocation bDLocation) {
                bDLocationArr[0] = bDLocation;
                countDownLatch.countDown();
            }
        }, locationOption);
        try {
            countDownLatch.await(locationOption.getLocationTimeOutMs(), TimeUnit.MILLISECONDS);
            if (bDLocationExceptionArr[0] == null) {
                return bDLocationArr[0];
            }
            throw bDLocationExceptionArr[0];
        } catch (InterruptedException e) {
            throw new BDLocationException((Throwable) e, "Android", "3");
        }
    }

    private C9248a(Context context) {
        this.f25307a = new C9222a(context);
        QPSController qPSController = new QPSController();
        if (C9274e.f25379a == null) {
            HandlerThread handlerThread = new HandlerThread("LocationConnectWorker");
            C9274e.f25379a = handlerThread;
            handlerThread.start();
        }
        this.f25310e = new C9250b(qPSController, C9274e.f25379a.getLooper());
        this.f25308b = m18346a(context, qPSController);
        this.f25309c = new SystemBaseLocationImpl(context, qPSController);
        this.f25311f = new C9255d(context, this.f25308b, this.f25309c, C9274e.m18392a());
        C9255d dVar = this.f25311f;
        dVar.f25339g = new C9263e(this.f25310e, dVar.f25333a, dVar.f25334b, dVar);
    }

    /* renamed from: b */
    private BDLocation m18348b(LocationOption locationOption) {
        if (locationOption.getMaxCacheTime() <= 0 || locationOption.getInterval() != 0) {
            return null;
        }
        BDLocation mockLocation = BDLocationConfig.getMockLocation();
        if (mockLocation != null) {
            return mockLocation;
        }
        BDLocation a = this.f25307a.mo16665a();
        if (a == null || LocationUtil.isEmpty(a)) {
            return null;
        }
        if ((locationOption.geocodeMode() != 0 && !a.hasAddress()) || !LocationUtil.checkCacheTime(a.getLocationMs(), locationOption.getMaxCacheTime())) {
            return null;
        }
        a.setCache(true);
        return a;
    }

    /* renamed from: a */
    public final BDPoint mo16769a(BDPoint bDPoint) {
        BDPoint bDPoint2;
        if (this.f25308b != null) {
            bDPoint2 = this.f25308b.convertGCJ02(bDPoint);
        } else {
            bDPoint2 = null;
        }
        if (bDPoint2 == null) {
            return this.f25309c.convertGCJ02(bDPoint);
        }
        return bDPoint2;
    }

    /* renamed from: a */
    private static ILocate m18346a(Context context, QPSController qPSController) {
        ILocate iLocate;
        try {
            iLocate = (ILocate) Class.forName("com.bytedance.bdlocation.amap.AMapLocationImpl").getConstructor(new Class[]{Context.class, QPSController.class}).newInstance(new Object[]{context, qPSController});
        } catch (Throwable unused) {
            iLocate = null;
        }
        if (iLocate == null) {
            try {
                return (ILocate) Class.forName("com.bytedance.bdlocation.glocation.GoogleLocationImpl").getConstructor(new Class[]{Context.class, QPSController.class}).newInstance(new Object[]{context, qPSController});
            } catch (Throwable unused2) {
            }
        }
        return iLocate;
    }

    /* renamed from: a */
    public final int mo16767a(Callback callback, LocationOption locationOption) {
        BDLocationConfig.checkInit();
        locationOption.getTrace().mo16668a();
        int i = -1;
        if (!BDLocationConfig.getEnableBackgroundLocate() && BDLocationConfig.getAppBackgroundProvider().f25377b) {
            BDLocationException bDLocationException = new BDLocationException("接入方已设置后台不进行定位", "Unknown", "9");
            locationOption.getTrace().mo16671a(bDLocationException);
            locationOption.getTrace().mo16672b();
            callback.onError(bDLocationException);
            return -1;
        } else if (!Util.needLocate()) {
            BDLocationException bDLocationException2 = new BDLocationException("No Location Permission", "Unknown", "6");
            locationOption.getTrace().mo16671a(bDLocationException2);
            locationOption.getTrace().mo16672b();
            callback.onError(bDLocationException2);
            return -1;
        } else {
            BDLocation b = m18348b(locationOption);
            if (b != null) {
                callback.onLocationChanged(b);
                C9223a trace = locationOption.getTrace();
                trace.mo16670a(b);
                trace.mo16672b();
            } else if (!Util.isLocationEnabled()) {
                BDLocationException bDLocationException3 = new BDLocationException("Device did not enable location service", "Unknown", "7");
                locationOption.getTrace().mo16671a(bDLocationException3);
                locationOption.getTrace().mo16672b();
                callback.onError(bDLocationException3);
                return -1;
            } else {
                i = this.f25310e.mo16775a(new LocationRequest(locationOption, callback));
                this.f25311f.mo16784a(locationOption);
            }
            StringBuilder sb = new StringBuilder("startLocation :");
            sb.append(i);
            C51151a.m110018b("BDLocation", sb.toString());
            return i;
        }
    }

    /* renamed from: a */
    public final List<Object> mo16770a(BDPoint bDPoint, String str) {
        List<Object> list;
        if (this.f25308b != null) {
            list = this.f25308b.getPoiSync(bDPoint, str);
        } else {
            list = null;
        }
        if (list == null) {
            return this.f25309c.getPoiSync(bDPoint, str);
        }
        return list;
    }

    /* renamed from: a */
    public final void mo16772a(int i, boolean z) {
        if (i != -1) {
            C9250b bVar = this.f25310e;
            bVar.f25319d.removeCallbacksAndMessages(Integer.valueOf(i));
            bVar.f25321f.stopLocation((long) i);
            LocationRequest locationRequest = (LocationRequest) bVar.f25318c.get(Integer.valueOf(i));
            if (locationRequest != null) {
                bVar.f25318c.remove(Integer.valueOf(i));
                LocationOption option = locationRequest.getOption();
                C51151a.m110021c("BDLocation", option.toString());
                option.getTrace().mo16672b();
            }
            if (!this.f25310e.mo16776a()) {
                this.f25311f.mo16786a(z);
            }
            if (BDLocationConfig.isDebug()) {
                StringBuilder sb = new StringBuilder("stopLocation :");
                sb.append(i);
                C51151a.m110018b("BDLocation", sb.toString());
            }
        }
    }
}
