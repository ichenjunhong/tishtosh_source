package com.bytedance.bdlocation.service;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.client.LocationRequest;
import com.bytedance.bdlocation.p509a.C9222a;
import com.bytedance.bdlocation.p510b.C9223a;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.bdlocation.service.b */
public final class C9250b implements Callback {

    /* renamed from: a */
    public BDLocation f25316a;

    /* renamed from: b */
    public BDLocationException f25317b;

    /* renamed from: c */
    public final Map<Integer, LocationRequest> f25318c = new ConcurrentHashMap(50);

    /* renamed from: d */
    public Handler f25319d;

    /* renamed from: e */
    public Handler f25320e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public QPSController f25321f;

    /* renamed from: g */
    public long f25322g;

    /* renamed from: h */
    private AtomicInteger f25323h = new AtomicInteger(0);

    /* renamed from: com.bytedance.bdlocation.service.b$a */
    class C9251a implements Runnable {

        /* renamed from: a */
        public final Callback f25324a;

        /* renamed from: b */
        public final LocationOption f25325b;

        /* renamed from: d */
        private final int f25327d;

        /* renamed from: e */
        private int f25328e;

        /* renamed from: f */
        private CountDownLatch f25329f;

        /* renamed from: a */
        private BDLocation m18361a() {
            BDLocation bDLocation = C9250b.this.f25316a;
            if (bDLocation == null) {
                return null;
            }
            return new BDLocation(bDLocation);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
            if (r2 != false) goto L_0x009e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r20 = this;
                r0 = r20
                com.bytedance.bdlocation.client.LocationOption r1 = r0.f25325b
                long r1 = r1.getInterval()
                r4 = 0
                r6 = 1
                int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r7 > 0) goto L_0x0011
                r1 = 1
                goto L_0x0012
            L_0x0011:
                r1 = 0
            L_0x0012:
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                com.bytedance.bdlocation.b.a r2 = r2.getTrace()
                long r7 = r2.f25204b
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                long r9 = r2.getLocationTimeOutMs()
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                long r11 = r2.getInterval()
                r15 = -1
                int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0056
                com.bytedance.bdlocation.BDLocation r2 = com.bytedance.bdlocation.client.BDLocationConfig.getMockLocation()
                com.bytedance.bdlocation.BDLocation r11 = r20.m18361a()
                if (r2 == 0) goto L_0x003a
                r0.m18362a(r2)
                goto L_0x004d
            L_0x003a:
                if (r11 == 0) goto L_0x0040
                r0.m18362a(r11)
                goto L_0x004d
            L_0x0040:
                com.bytedance.bdlocation.service.b r2 = com.bytedance.bdlocation.service.C9250b.this
                com.bytedance.bdlocation.client.BDLocationException r2 = r2.f25317b
                if (r2 == 0) goto L_0x004d
                com.bytedance.bdlocation.service.b r2 = com.bytedance.bdlocation.service.C9250b.this
                com.bytedance.bdlocation.client.BDLocationException r2 = r2.f25317b
                r0.m18363a(r2)
            L_0x004d:
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                long r13 = r2.getInterval()
                r18 = r13
                goto L_0x00c0
            L_0x0056:
                int r2 = r0.f25327d
                int r11 = r0.f25328e
                com.bytedance.bdlocation.BDLocation r12 = com.bytedance.bdlocation.client.BDLocationConfig.getMockLocation()
                com.bytedance.bdlocation.BDLocation r3 = r20.m18361a()
                if (r12 == 0) goto L_0x006a
                r0.m18362a(r12)
            L_0x0067:
                r18 = r15
                goto L_0x00c0
            L_0x006a:
                if (r3 == 0) goto L_0x00a2
                long r13 = r3.getTime()
                com.bytedance.bdlocation.client.LocationOption r12 = r0.f25325b
                long r4 = r12.getMaxCacheTime()
                boolean r4 = com.bytedance.bdlocation.LocationUtil.checkCacheTime(r13, r4)
                if (r4 != 0) goto L_0x009e
                com.bytedance.bdlocation.client.LocationOption r4 = r0.f25325b
                com.bytedance.bdlocation.service.b r5 = com.bytedance.bdlocation.service.C9250b.this
                long r12 = r5.f25322g
                r5 = 10
                boolean r4 = m18364a(r4, r12, r11, r5)
                if (r4 != 0) goto L_0x009e
                com.bytedance.bdlocation.service.b r4 = com.bytedance.bdlocation.service.C9250b.this
                com.bytedance.bdlocation.service.QPSController r4 = r4.f25321f
                long r11 = (long) r2
                com.bytedance.bdlocation.service.QPSController$a r2 = r4.getQPS(r11)
                if (r2 == 0) goto L_0x009b
                int r2 = r2.f25302a
                if (r2 <= r6) goto L_0x009b
                r2 = 1
                goto L_0x009c
            L_0x009b:
                r2 = 0
            L_0x009c:
                if (r2 == 0) goto L_0x00be
            L_0x009e:
                r0.m18362a(r3)
                goto L_0x0067
            L_0x00a2:
                com.bytedance.bdlocation.service.b r2 = com.bytedance.bdlocation.service.C9250b.this
                com.bytedance.bdlocation.client.BDLocationException r2 = r2.f25317b
                if (r2 == 0) goto L_0x00be
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                com.bytedance.bdlocation.service.b r3 = com.bytedance.bdlocation.service.C9250b.this
                long r3 = r3.f25322g
                r5 = 20
                boolean r2 = m18364a(r2, r3, r11, r5)
                if (r2 == 0) goto L_0x00be
                com.bytedance.bdlocation.service.b r2 = com.bytedance.bdlocation.service.C9250b.this
                com.bytedance.bdlocation.client.BDLocationException r2 = r2.f25317b
                r0.m18363a(r2)
                goto L_0x0067
            L_0x00be:
                r18 = 300(0x12c, double:1.48E-321)
            L_0x00c0:
                long r2 = com.bytedance.bdlocation.client.BDLocationConfig.getMaxLocationTimeMs()
                r4 = 0
                int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x00da
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r7
                long r4 = com.bytedance.bdlocation.client.BDLocationConfig.getMaxLocationTimeMs()
                int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x00da
            L_0x00d7:
                r17 = 1
                goto L_0x00e8
            L_0x00da:
                if (r1 == 0) goto L_0x00e6
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r7
                int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x00e6
                goto L_0x00d7
            L_0x00e6:
                r17 = 0
            L_0x00e8:
                if (r17 == 0) goto L_0x0116
                com.bytedance.bdlocation.service.a r1 = com.bytedance.bdlocation.service.C9248a.m18347a()
                int r2 = r0.f25327d
                r1.mo16772a(r2, r6)
                com.bytedance.bdlocation.client.BDLocationException r1 = new com.bytedance.bdlocation.client.BDLocationException
                java.lang.String r2 = "Timeout."
                java.lang.String r3 = "Unknown"
                java.lang.String r4 = "3"
                r1.<init>(r2, r3, r4)
                com.bytedance.bdlocation.client.LocationOption r2 = r0.f25325b
                com.bytedance.bdlocation.b.a r2 = r2.getTrace()
                r2.mo16671a(r1)
                com.bytedance.bdlocation.client.BDLocationClient$Callback r2 = r0.f25324a
                r2.onError(r1)
                java.util.concurrent.CountDownLatch r1 = r0.f25329f
                if (r1 == 0) goto L_0x0115
                java.util.concurrent.CountDownLatch r1 = r0.f25329f
                r1.countDown()
            L_0x0115:
                return
            L_0x0116:
                int r1 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
                if (r1 == 0) goto L_0x0133
                com.bytedance.bdlocation.service.b r1 = com.bytedance.bdlocation.service.C9250b.this
                android.os.Handler r1 = r1.f25319d
                int r2 = r0.f25327d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = android.os.SystemClock.uptimeMillis()
                long r3 = r3 + r18
                r1.postAtTime(r0, r2, r3)
                int r1 = r0.f25328e
                int r1 = r1 + r6
                r0.f25328e = r1
                return
            L_0x0133:
                com.bytedance.bdlocation.service.a r1 = com.bytedance.bdlocation.service.C9248a.m18347a()
                int r2 = r0.f25327d
                r1.mo16771a(r2)
                java.util.concurrent.CountDownLatch r1 = r0.f25329f
                if (r1 == 0) goto L_0x0145
                java.util.concurrent.CountDownLatch r1 = r0.f25329f
                r1.countDown()
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.service.C9250b.C9251a.run():void");
        }

        /* renamed from: a */
        private void m18362a(final BDLocation bDLocation) {
            this.f25325b.getTrace().mo16670a(bDLocation);
            C9250b.this.f25320e.post(new Runnable() {
                public final void run() {
                    if (BDLocationConfig.isDebug()) {
                        C51151a.m110018b("BDLocation", "Client onLocationChanged");
                    }
                    if (C9251a.this.f25324a != null) {
                        C9251a.this.f25324a.onLocationChanged(bDLocation);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m18363a(BDLocationException bDLocationException) {
            this.f25325b.getTrace().mo16671a(bDLocationException);
            C9250b.this.f25320e.post(new Runnable() {
                public final void run() {
                    BDLocationException bDLocationException;
                    if (BDLocationConfig.isDebug()) {
                        C51151a.m110018b("BDLocation", "Client onError");
                    }
                    if (C9251a.this.f25324a != null) {
                        Callback callback = C9251a.this.f25324a;
                        C9223a trace = C9251a.this.f25325b.getTrace();
                        if (!trace.f25206d.isEmpty()) {
                            bDLocationException = new BDLocationException(new ArrayList(trace.f25206d));
                        } else {
                            bDLocationException = trace.f25205c;
                        }
                        callback.onError(bDLocationException);
                        C9251a.this.f25325b.getTrace().f25206d.clear();
                    }
                }
            });
        }

        public C9251a(C9250b bVar, int i, Callback callback, LocationOption locationOption) {
            this(i, callback, locationOption, null);
        }

        /* renamed from: a */
        private static boolean m18364a(LocationOption locationOption, long j, int i, int i2) {
            long j2;
            long j3 = locationOption.getTrace().f25204b;
            long locationTimeOutMs = locationOption.getLocationTimeOutMs();
            if (locationTimeOutMs > 0) {
                if (locationOption.getInterval() > 0) {
                    j2 = locationOption.getInterval();
                } else {
                    j2 = 300;
                }
                if (j < j3 && ((long) i) * j2 > locationTimeOutMs) {
                    return true;
                }
                if (j <= j3 || i <= i2 - 1) {
                    return false;
                }
                return true;
            } else if (i > i2 - 1) {
                return true;
            } else {
                return false;
            }
        }

        private C9251a(int i, Callback callback, LocationOption locationOption, CountDownLatch countDownLatch) {
            this.f25327d = i;
            this.f25324a = callback;
            this.f25325b = locationOption;
            this.f25329f = null;
        }
    }

    /* renamed from: b */
    public final void mo16777b() {
        this.f25317b = null;
        this.f25316a = null;
    }

    /* renamed from: a */
    public final boolean mo16776a() {
        if (this.f25318c.size() != 0) {
            return true;
        }
        return false;
    }

    public final void onError(BDLocationException bDLocationException) {
        m18357a(null, bDLocationException);
    }

    /* renamed from: a */
    public final int mo16775a(LocationRequest locationRequest) {
        int incrementAndGet = this.f25323h.incrementAndGet();
        this.f25318c.put(Integer.valueOf(incrementAndGet), locationRequest);
        this.f25321f.startLocation((long) incrementAndGet);
        LocationOption option = locationRequest.getOption();
        this.f25319d.postAtTime(new C9251a(this, incrementAndGet, locationRequest.getCallback(), option), Integer.valueOf(incrementAndGet), SystemClock.uptimeMillis() + option.getInterval());
        return incrementAndGet;
    }

    public final void onLocationChanged(BDLocation bDLocation) {
        if (LocationUtil.isBetterLocation(bDLocation, this.f25316a) || LocationUtil.isGoodLocation(bDLocation)) {
            m18357a(bDLocation, null);
            C9222a aVar = C9248a.m18347a().f25307a;
            if (bDLocation != null && !bDLocation.isEmpty()) {
                if (aVar.f25200a == null) {
                    aVar.f25200a = aVar.mo16665a();
                }
                if (aVar.f25200a != null) {
                    int compareLocation = LocationUtil.compareLocation(aVar.f25200a, bDLocation);
                    if (compareLocation != -1) {
                        BDLocationConfig.notificationLocationChange(compareLocation, aVar.f25200a, bDLocation);
                    }
                }
                String a = C9222a.m18321a(bDLocation);
                if (!TextUtils.isEmpty(a)) {
                    aVar.mo16666a("BDLocation", a);
                }
                aVar.f25200a = new BDLocation(bDLocation);
            }
            if (BDLocationConfig.isDebug()) {
                C51151a.m110018b("BDLocation", "ConnectManager : onLocationChanged, isBetter");
            }
        }
    }

    /* renamed from: a */
    private void m18357a(BDLocation bDLocation, BDLocationException bDLocationException) {
        synchronized (this) {
            this.f25322g = System.currentTimeMillis();
            if (bDLocation != null) {
                this.f25316a = bDLocation;
                this.f25317b = null;
            } else {
                this.f25317b = bDLocationException;
                this.f25316a = null;
            }
        }
    }

    public C9250b(QPSController qPSController, Looper looper) {
        this.f25319d = new Handler(looper);
        this.f25321f = qPSController;
    }
}
