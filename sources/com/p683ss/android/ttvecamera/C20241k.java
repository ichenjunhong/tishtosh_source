package com.p683ss.android.ttvecamera;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.content.C0726c;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20201f.C20204c;
import com.p683ss.android.ttvecamera.C20208g.C20209a;
import com.p683ss.android.ttvecamera.C20208g.C20211c;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.C20275l.C20276a;
import com.p683ss.android.ttvecamera.C20275l.C20277b;
import com.p683ss.android.ttvecamera.C20275l.C20278c;
import com.p683ss.android.ttvecamera.C20275l.C20279d;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20275l.C20282g;
import com.p683ss.android.ttvecamera.C20275l.C20283h;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.p1232g.C20212a;
import com.p683ss.android.ttvecamera.p1232g.C20214b;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import com.p683ss.android.ttvecamera.p1232g.C20219d;
import com.p683ss.android.ttvecamera.p1232g.C20221e;
import com.p683ss.android.ttvecamera.p1232g.C20223f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.k */
public enum C20241k {
    INSTANCE;
    

    /* renamed from: a */
    C20217c f55610a;

    /* renamed from: b */
    private Handler f55611b;

    /* renamed from: c */
    private HandlerThread f55612c;

    /* renamed from: d */
    private volatile boolean f55613d;

    /* renamed from: e */
    private float f55614e;

    /* renamed from: f */
    private Object f55615f;

    /* renamed from: g */
    private volatile boolean f55616g;

    /* renamed from: h */
    private volatile boolean f55617h;

    /* renamed from: i */
    private C20218a f55618i;

    /* renamed from: j */
    private volatile int f55619j;

    /* renamed from: k */
    private C20202a f55620k;

    /* renamed from: l */
    private C20203b f55621l;

    /* renamed from: m */
    private C20204c f55622m;
    public long mBeginTime;
    public C20208g mCameraClient;
    public C20201f mCameraInstance;
    public C20209a mCameraObserver;
    public C20275l mCameraSettings;
    public ConditionVariable mCondofClose;
    public int mCurrentCameraState;
    public boolean mIsFirstFrame;
    public Bundle mOpenInfoBundle;
    public long mOpenTime;
    public C20211c mPictureSizeCallback;
    public int mRetryCnt;
    public C20282g mSATZoomCallback;
    public final Object mStateLock;

    /* renamed from: com.ss.android.ttvecamera.k$a */
    static class C20274a implements Callback {

        /* renamed from: a */
        private WeakReference<C20241k> f55712a;

        public C20274a(C20241k kVar) {
            this.f55712a = new WeakReference<>(kVar);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            C20241k kVar = (C20241k) this.f55712a.get();
            if (i == 1) {
                C20296p.m50061b("TECameraServer", "startZoom...");
                synchronized (kVar.mStateLock) {
                    if (kVar.mCameraInstance != null) {
                        kVar.mCameraInstance.mo42717a(((float) message.arg1) / 10.0f, (C20284i) obj);
                    }
                }
            }
            return false;
        }
    }

    public final void changeCaptureFormat() {
    }

    public final int getCameraState() {
        int i;
        synchronized (this.mStateLock) {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    /* renamed from: a */
    private synchronized int m50021a() {
        C20296p.m50059a("TECameraServer", "destroy...");
        this.f55616g = false;
        if (this.f55612c != null) {
            if (VERSION.SDK_INT >= 18) {
                this.f55612c.quitSafely();
            } else {
                this.f55612c.quit();
            }
            this.f55612c = null;
            this.f55613d = true;
            this.f55611b = null;
        }
        C20214b bVar = this.f55610a.f55554b;
        if (bVar != null) {
            bVar.mo42808e();
        }
        this.mCameraObserver = C20210b.m49945a();
        return 0;
    }

    /* renamed from: c */
    private synchronized int m50027c() {
        this.f55619j++;
        StringBuilder sb = new StringBuilder("sClientCount = ");
        sb.append(this.f55619j);
        C20296p.m50061b("TECameraServer", sb.toString());
        return this.f55619j;
    }

    /* renamed from: d */
    private synchronized int m50028d() {
        this.f55619j--;
        StringBuilder sb = new StringBuilder("sClientCount = ");
        sb.append(this.f55619j);
        C20296p.m50061b("TECameraServer", sb.toString());
        if (this.f55619j < 0) {
            StringBuilder sb2 = new StringBuilder("Invalid ClientCount = ");
            sb2.append(this.f55619j);
            C20296p.m50062c("TECameraServer", sb2.toString());
            this.f55619j = 0;
        }
        return this.f55619j;
    }

    public final boolean isCameraPermitted() {
        boolean z = true;
        try {
            if (C0726c.m2090a(this.mCameraSettings.f55720b, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("test camera permission failed!: ");
            sb.append(e.toString());
            C20296p.m50063d("TECameraServer", sb.toString());
        }
        Bundle bundle = this.mOpenInfoBundle;
        StringBuilder sb2 = new StringBuilder("CamPerm");
        sb2.append(this.mRetryCnt);
        bundle.putBoolean(sb2.toString(), z);
        return z;
    }

    /* renamed from: b */
    private C20201f m50026b() {
        if (VERSION.SDK_INT < 24) {
            return C20169c.m49762a(this.mCameraSettings.f55720b, this.f55620k, this.f55611b, this.f55621l);
        }
        if (this.mCameraSettings.f55721c == 1) {
            return C20169c.m49762a(this.mCameraSettings.f55720b, this.f55620k, this.f55611b, this.f55621l);
        }
        if (this.mCameraSettings.f55721c != 6 || VERSION.SDK_INT <= 28) {
            return C20195e.m49850a(this.mCameraSettings.f55721c, this.mCameraSettings.f55720b, this.f55620k, this.f55611b, this.f55621l);
        }
        this.mCameraSettings.f55721c = 2;
        return C20158b.m49734a(this.mCameraSettings, this.f55620k, this.f55611b, this.f55621l);
    }

    public final int close() {
        if (this.f55613d || Looper.myLooper() == this.f55611b.getLooper()) {
            C20296p.m50061b("TECameraServer", "close...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 0) {
                    StringBuilder sb = new StringBuilder("No need switch state: ");
                    sb.append(this.mCurrentCameraState);
                    sb.append(" ==> 0");
                    C20296p.m50062c("TECameraServer", sb.toString());
                } else {
                    this.mCurrentCameraState = 0;
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo42733e();
                    }
                }
                this.mCameraInstance = null;
            }
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mCondofClose.close();
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20239j.m50016a("te_record_camera_push_close_task_time", System.currentTimeMillis() - currentTimeMillis);
                    C20241k.this.close();
                    C20241k.this.mCondofClose.open();
                    C20239j.m50016a("te_record_camera_close_cost", System.currentTimeMillis() - currentTimeMillis);
                }
            });
            this.mCondofClose.block(5000);
            StringBuilder sb2 = new StringBuilder("Camera close cost: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append("ms");
            C20296p.m50062c("TECameraServer", sb2.toString());
        }
        return 0;
    }

    public final void setSATZoomCallback(C20282g gVar) {
        this.mSATZoomCallback = gVar;
    }

    public final C20276a getCameraECInfo(C20208g gVar) {
        if (m50023a(gVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo42780s();
        }
        return null;
    }

    public final boolean isSupportWhileBalance(C20208g gVar) {
        boolean z = false;
        if (!m50023a(gVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.mo42738j()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean isTorchSupported(C20208g gVar) {
        if (!m50023a(gVar)) {
            return false;
        }
        C20201f fVar = this.mCameraInstance;
        if (fVar == null || !fVar.mo42739k()) {
            return false;
        }
        return true;
    }

    public final int cancelFocus(final C20208g gVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.cancelFocus(gVar);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "cancelFocus...");
            synchronized (this.mStateLock) {
                this.mCameraInstance.mo42737i();
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (m50028d() != 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return m50021a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int disConnect(com.p683ss.android.ttvecamera.C20208g r4) {
        /*
            r3 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "disConnect with client: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r0, r1)
            java.lang.Object r0 = r3.f55615f
            monitor-enter(r0)
            com.ss.android.ttvecamera.g r1 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r1 != r4) goto L_0x0037
            com.ss.android.ttvecamera.g r4 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0037
            r4 = 0
            r3.mCameraClient = r4     // Catch:{ all -> 0x003b }
            android.os.Handler r1 = r3.f55611b     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r3.close()
            int r4 = r3.m50028d()
            if (r4 != 0) goto L_0x0035
            int r4 = r3.m50021a()
            return r4
        L_0x0035:
            r4 = 0
            return r4
        L_0x0037:
            r4 = -100
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r4
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.disConnect(com.ss.android.ttvecamera.g):int");
    }

    public final int removeCameraProvider(final C20208g gVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.removeCameraProvider(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                C20217c cVar = this.f55610a;
                if (cVar.f55554b != null) {
                    cVar.f55554b.mo42808e();
                    cVar.f55554b = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private synchronized void m50022a(boolean z) {
        C20296p.m50059a("TECameraServer", "init...");
        if (!this.f55616g) {
            this.f55611b = m50025b(true);
            this.f55613d = false;
            this.f55610a = new C20217c();
            this.f55616g = true;
            this.f55614e = 0.0f;
        }
    }

    /* renamed from: b */
    private Handler m50025b(boolean z) {
        Looper looper;
        if (z) {
            try {
                if (this.f55612c != null) {
                    this.f55612c.quit();
                }
                this.f55612c = new HandlerThread("TECameraServer");
                this.f55612c.start();
                return new Handler(this.f55612c.getLooper(), new C20274a(this));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("CreateHandler failed!: ");
                sb.append(e.toString());
                C20296p.m50063d("TECameraServer", sb.toString());
            }
        }
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        return new Handler(looper);
    }

    public final boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C20296p.m50062c("TECameraServer", "No need this");
        }
        switch (i) {
            case 0:
                return true;
            case 1:
                if (this.mCurrentCameraState != 0) {
                    StringBuilder sb = new StringBuilder("No need open camera again, state = ");
                    sb.append(this.mCurrentCameraState);
                    C20296p.m50062c("TECameraServer", sb.toString());
                }
                return true;
            case 2:
            case 3:
                if (this.mCurrentCameraState == 1) {
                    return true;
                }
                return false;
            default:
                StringBuilder sb2 = new StringBuilder("Invalidate camera state = ");
                sb2.append(i);
                C20296p.m50063d("TECameraServer", sb2.toString());
                return false;
        }
    }

    public final void downExposureCompensation(final C20208g gVar) {
        if (m50023a(gVar)) {
            if (Looper.myLooper() != this.f55611b.getLooper()) {
                this.f55611b.post(new Runnable() {
                    public final void run() {
                        C20241k.this.downExposureCompensation(gVar);
                    }
                });
                return;
            }
            C20296p.m50061b("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    C20276a s = this.mCameraInstance.mo42780s();
                    if (s == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo42728b(s.f55746b - 1);
                    }
                } else {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set ec on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getExposureCompensation(com.p683ss.android.ttvecamera.C20208g r4) {
        /*
            r3 = this;
            boolean r4 = r3.m50023a(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.mStateLock
            monitor-enter(r4)
            int r0 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1 = 3
            if (r0 == r1) goto L_0x002c
            int r0 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1 = 2
            if (r0 == r1) goto L_0x002c
            com.ss.android.ttvecamera.g$a r0 = r3.mCameraObserver     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "Can not get ec on state : "
            r1.<init>(r2)     // Catch:{ all -> 0x003e }
            int r2 = r3.mCurrentCameraState     // Catch:{ all -> 0x003e }
            r1.append(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003e }
            r2 = -105(0xffffffffffffff97, float:NaN)
            r0.onError(r2, r1)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return r2
        L_0x002c:
            com.ss.android.ttvecamera.f r0 = r3.mCameraInstance     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.l r1 = r0.f55520h     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.l$a r1 = r1.f55742x     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003b
            com.ss.android.ttvecamera.l r0 = r0.f55520h     // Catch:{ all -> 0x003e }
            com.ss.android.ttvecamera.l$a r0 = r0.f55742x     // Catch:{ all -> 0x003e }
            int r0 = r0.f55746b     // Catch:{ all -> 0x003e }
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Client is not connected!!!"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.getExposureCompensation(com.ss.android.ttvecamera.g):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSupportedExposureCompensation(com.p683ss.android.ttvecamera.C20208g r5) {
        /*
            r4 = this;
            boolean r5 = r4.m50023a(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Object r5 = r4.mStateLock
            monitor-enter(r5)
            int r1 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2 = 3
            if (r1 == r2) goto L_0x002c
            int r1 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x002c
            java.lang.String r1 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "Can not set ec on state : "
            r2.<init>(r3)     // Catch:{ all -> 0x0041 }
            int r3 = r4.mCurrentCameraState     // Catch:{ all -> 0x0041 }
            r2.append(r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0041 }
            com.p683ss.android.ttvecamera.C20296p.m50062c(r1, r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x002c:
            com.ss.android.ttvecamera.f r1 = r4.mCameraInstance     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.l r2 = r1.f55520h     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.l$a r2 = r2.f55742x     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            com.ss.android.ttvecamera.l r1 = r1.f55520h     // Catch:{ all -> 0x0041 }
            com.ss.android.ttvecamera.l$a r1 = r1.f55742x     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.mo42918a()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.isSupportedExposureCompensation(com.ss.android.ttvecamera.g):boolean");
    }

    public final int startCameraFaceDetect(final C20208g gVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.startCameraFaceDetect(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not start face detect on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo42730c();
            }
        }
        return 0;
    }

    public final int stopCameraFaceDetect(final C20208g gVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.stopCameraFaceDetect(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not stop face detect on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo42732d();
            }
        }
        return 0;
    }

    public final void upExposureCompensation(final C20208g gVar) {
        if (m50023a(gVar)) {
            if (Looper.myLooper() != this.f55611b.getLooper()) {
                this.f55611b.post(new Runnable() {
                    public final void run() {
                        C20241k.this.upExposureCompensation(gVar);
                    }
                });
                return;
            }
            C20296p.m50061b("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    C20276a s = this.mCameraInstance.mo42780s();
                    if (s == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo42728b(s.f55746b + 1);
                    }
                } else {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set ec on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m50023a(C20208g gVar) {
        synchronized (this.f55615f) {
            if (this.mCameraClient == gVar) {
                return true;
            }
            if (this.mCameraClient == null) {
                C20296p.m50062c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
            } else {
                StringBuilder sb = new StringBuilder("Invalid CameraClient, need : ");
                sb.append(this.mCameraClient);
                C20296p.m50062c("TECameraServer", sb.toString());
            }
            return false;
        }
    }

    public final int stop(final C20208g gVar) {
        StringBuilder sb = new StringBuilder("stop: client");
        sb.append(gVar);
        C20296p.m50059a("TECameraServer", sb.toString());
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.stop(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    StringBuilder sb2 = new StringBuilder("No need switch state: ");
                    sb2.append(this.mCurrentCameraState);
                    sb2.append(" ==> 2");
                    C20296p.m50062c("TECameraServer", sb2.toString());
                    return 0;
                } else if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb3 = new StringBuilder("Invalidate state: ");
                    sb3.append(this.mCurrentCameraState);
                    sb3.append(" ==> 2");
                    aVar.onError(-105, sb3.toString());
                    return -105;
                } else {
                    this.mCurrentCameraState = 2;
                    this.mCameraInstance.mo42727b();
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private boolean m50024a(C20275l lVar) {
        if (this.mCameraSettings == null || (this.mCameraSettings.f55721c == lVar.f55721c && this.mCameraSettings.f55728j.f55398a == lVar.f55728j.f55398a && this.mCameraSettings.f55728j.f55399b == lVar.f55728j.f55399b && this.mCameraSettings.f55723e == lVar.f55723e && this.mCameraSettings.f55744z == lVar.f55744z && this.mCameraSettings.f55717B == lVar.f55717B && this.mCameraSettings.f55736r == lVar.f55736r && this.mCameraSettings.f55731m == lVar.f55731m && this.mCameraSettings.f55733o == lVar.f55733o)) {
            return false;
        }
        return true;
    }

    public final int start(final C20208g gVar) {
        StringBuilder sb = new StringBuilder("start: client");
        sb.append(gVar);
        C20296p.m50059a("TECameraServer", sb.toString());
        if (!m50023a(gVar)) {
            return -108;
        }
        if (this.mCameraSettings == null || this.mCameraSettings.f55720b == null) {
            C20296p.m50063d("TECameraServer", "mCameraSettings has some error");
            return -100;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.start(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    StringBuilder sb2 = new StringBuilder("No need switch state: ");
                    sb2.append(this.mCurrentCameraState);
                    sb2.append(" ==> 3");
                    C20296p.m50062c("TECameraServer", sb2.toString());
                    if (!this.f55617h) {
                        return 0;
                    }
                    this.mCameraInstance.mo42727b();
                    this.mCurrentCameraState = 2;
                    this.f55617h = false;
                }
                if (this.mCurrentCameraState != 2) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb3 = new StringBuilder("Invalidate state: ");
                    sb3.append(this.mCurrentCameraState);
                    sb3.append(" ==> 3");
                    aVar.onError(-105, sb3.toString());
                    return -105;
                }
                this.mCurrentCameraState = 3;
                this.mCameraObserver.onInfo(3, this.mCurrentCameraState, "Camera state: running");
                this.mCameraInstance.mo42715a();
                C20239j.m50016a("te_record_camera_type", (long) this.mCameraInstance.mo42734f());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.mCameraSettings.f55728j.f55398a);
                sb4.append("*");
                sb4.append(this.mCameraSettings.f55728j.f55399b);
                C20239j.m50017a("te_preview_camera_resolution", sb4.toString());
                String str = "te_record_camera_frame_rate";
                double d = (double) this.mCameraSettings.f55722d.f55773b;
                if (C20239j.f55608a != null) {
                    C20239j.f55608a.mo42841a(str, d);
                }
                C20239j.m50016a("te_record_camera_direction", (long) this.mCameraSettings.f55723e);
            }
        }
        return 0;
    }

    public final float queryShaderZoomStep(final C20208g gVar, final C20283h hVar) {
        if (!m50023a(gVar)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.queryShaderZoomStep(gVar, hVar);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "queryShaderZoomStep...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42722a(hVar);
                }
            }
        }
        return 0.0f;
    }

    public final int queryZoomAbility(final C20208g gVar, final C20284i iVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.queryZoomAbility(gVar, iVar);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "queryZoomAbility...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42723a(iVar);
                }
            }
        }
        return 0;
    }

    public final int setFeatureParameters(final C20208g gVar, final Bundle bundle) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.setFeatureParameters(gVar, bundle);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42665a(bundle);
                }
            }
        }
        return 0;
    }

    public final int stopZoom(final C20208g gVar, final C20284i iVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.stopZoom(gVar, iVar);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42729b(iVar);
                }
            }
        }
        return 0;
    }

    public final int zoomV2(final C20208g gVar, final float f) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.zoomV2(gVar, f);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42716a(f);
                }
            }
        }
        return 0;
    }

    public final int focusAtPoint(final C20208g gVar, final C20294n nVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.focusAtPoint(gVar, nVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo42724a(nVar);
                } else {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set focus on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
            }
        }
        return 0;
    }

    public final float[] getFOV(final C20208g gVar, final C20277b bVar) {
        float[] fArr = new float[2];
        if (!m50023a(gVar)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    float[] fov = C20241k.this.getFOV(gVar, bVar);
                    if (bVar != null) {
                        bVar.mo42919a(fov);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not getFOV on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    float[] fArr2 = {-2.0f, -2.0f};
                    return fArr2;
                }
                fArr = this.mCameraInstance.mo42736h();
            }
        }
        return fArr;
    }

    public final int process(final C20208g gVar, final C20279d dVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.process(gVar, dVar);
                }
            });
        } else {
            C20296p.m50061b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    C20201f fVar = this.mCameraInstance;
                    if (dVar != null && dVar.f55750a == 2) {
                        fVar.f55533u.set(true);
                    }
                }
            }
        }
        return 0;
    }

    public final void setExposureCompensation(final C20208g gVar, final int i) {
        if (m50023a(gVar)) {
            if (Looper.myLooper() != this.f55611b.getLooper()) {
                this.f55611b.post(new Runnable() {
                    public final void run() {
                        C20241k.this.setExposureCompensation(gVar, i);
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("setExposureCompensation: ");
            sb.append(i);
            C20296p.m50061b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo42728b(i);
                    return;
                }
                C20209a aVar = this.mCameraObserver;
                StringBuilder sb2 = new StringBuilder("Can not set ec on state : ");
                sb2.append(this.mCurrentCameraState);
                aVar.onError(-105, sb2.toString());
            }
        }
    }

    public final int switchCameraMode(final C20208g gVar, final int i) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (gVar.f55536a.f55721c == 1 || (i != 1 && i != 0)) {
            return -100;
        }
        if (gVar.f55536a.f55734p == i) {
            return 0;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.switchCameraMode(gVar, i);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Invalidate state: ");
                    sb.append(this.mCurrentCameraState);
                    sb.append(" ==> 3");
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo42718a(i);
            }
        }
        return 0;
    }

    public final int switchFlashMode(final C20208g gVar, final int i) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.switchFlashMode(gVar, i);
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append(i);
            C20296p.m50059a("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42731c(i);
                }
            }
        }
        return 0;
    }

    public final int toggleTorch(final C20208g gVar, final boolean z) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.toggleTorch(gVar, z);
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("toggleTorch: ");
            sb.append(z);
            C20296p.m50061b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42725a(z);
                }
            }
        }
        return 0;
    }

    public final int addCameraProvider(final C20208g gVar, final C20218a aVar) {
        boolean z;
        if (!m50023a(gVar)) {
            return -108;
        }
        if (this.f55613d || Looper.myLooper() == this.f55611b.getLooper()) {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                if (!(this.f55618i == null || this.mCameraInstance.f55526n == null)) {
                    if (this.f55618i != null) {
                        C20218a aVar2 = this.f55618i;
                        if (aVar != null && aVar2.f55555a == aVar.f55555a && aVar2.f55556b.f55398a == aVar.f55556b.f55398a && aVar2.f55556b.f55399b == aVar.f55556b.f55399b && aVar2.f55557c == aVar.f55557c && aVar2.f55558d == aVar.f55558d && aVar2.f55559e == aVar.f55559e && aVar2.f55560f == aVar.f55560f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                    this.f55617h = false;
                }
                C20217c cVar = this.f55610a;
                C20201f fVar = this.mCameraInstance;
                if (cVar.f55554b != null) {
                    cVar.f55554b.mo42808e();
                }
                if (aVar.f55561g == C20235b.PIXEL_FORMAT_OpenGL_OES) {
                    cVar.f55554b = new C20223f(aVar, fVar);
                } else if (!(fVar instanceof C20195e) || VERSION.SDK_INT < 19) {
                    cVar.f55554b = new C20212a(aVar, fVar);
                } else if (aVar.f55560f > 0) {
                    cVar.f55554b = new C20221e(aVar, fVar);
                } else {
                    cVar.f55554b = new C20219d(aVar, fVar);
                }
                fVar.f55526n = cVar;
                this.f55617h = true;
                this.f55618i = aVar;
            }
        } else {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.addCameraProvider(gVar, aVar);
                }
            });
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int open(com.p683ss.android.ttvecamera.C20208g r10, com.p683ss.android.ttvecamera.C20275l r11) {
        /*
            r9 = this;
            boolean r0 = r9.m50023a(r10)
            if (r0 != 0) goto L_0x0009
            r10 = -108(0xffffffffffffff94, float:NaN)
            return r10
        L_0x0009:
            android.os.Handler r0 = r9.f55611b
            if (r0 != 0) goto L_0x0017
            java.lang.String r10 = "TECameraServer"
            java.lang.String r11 = "mHandler is null!"
            com.p683ss.android.ttvecamera.C20296p.m50063d(r10, r11)
            r10 = -112(0xffffffffffffff90, float:NaN)
            return r10
        L_0x0017:
            boolean r0 = r9.f55613d
            r1 = 0
            if (r0 != 0) goto L_0x003c
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r2 = r9.f55611b
            android.os.Looper r2 = r2.getLooper()
            if (r0 == r2) goto L_0x003c
            long r5 = java.lang.System.currentTimeMillis()
            android.os.Handler r0 = r9.f55611b
            com.ss.android.ttvecamera.k$1 r2 = new com.ss.android.ttvecamera.k$1
            r3 = r2
            r4 = r9
            r7 = r10
            r8 = r11
            r3.<init>(r5, r7, r8)
            r0.post(r2)
            goto L_0x00bc
        L_0x003c:
            r9.mCameraSettings = r11
            r10 = 0
            r9.f55614e = r10
            int r10 = r9.mRetryCnt
            if (r10 >= 0) goto L_0x0049
            int r10 = r11.f55732n
            r9.mRetryCnt = r10
        L_0x0049:
            java.lang.Object r10 = r9.mStateLock
            monitor-enter(r10)
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            r0 = 1
            if (r11 == 0) goto L_0x0073
            java.lang.String r11 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "No need open camera again, state = "
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            int r3 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
            com.p683ss.android.ttvecamera.C20296p.m50062c(r11, r2)     // Catch:{ all -> 0x00bd }
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            if (r11 == r0) goto L_0x0071
            com.ss.android.ttvecamera.g$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "Camera features is ready"
            r11.onInfo(r0, r1, r2)     // Catch:{ all -> 0x00bd }
        L_0x0071:
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            return r1
        L_0x0073:
            r9.mCurrentCameraState = r0     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            if (r11 != 0) goto L_0x0098
            com.ss.android.ttvecamera.f r11 = r9.m50026b()     // Catch:{ all -> 0x00bd }
            r9.mCameraInstance = r11     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f$c r0 = r9.f55622m     // Catch:{ all -> 0x00bd }
            r11.mo42778a(r0)     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            if (r11 != 0) goto L_0x0098
            r9.mCurrentCameraState = r1     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.g$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x00bd }
            r0 = -100
            java.lang.String r1 = "open : mCameraInstance is null."
            r11.onError(r0, r1)     // Catch:{ all -> 0x00bd }
            r11 = -1
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            return r11
        L_0x0098:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r9.mBeginTime = r2     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.l r0 = r9.mCameraSettings     // Catch:{ all -> 0x00bd }
            int r11 = r11.mo42713a(r0)     // Catch:{ all -> 0x00bd }
            if (r11 == 0) goto L_0x00bb
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "Open camera failed, ret = "
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            r2.append(r11)     // Catch:{ all -> 0x00bd }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00bd }
            com.p683ss.android.ttvecamera.C20296p.m50062c(r0, r11)     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            return r1
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.open(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.l):int");
    }

    public final void queryFeatures(String str, Bundle bundle) {
        Class<TEFocusParameters> cls;
        if (this.mCameraInstance != null) {
            Bundle bundle2 = (Bundle) this.mCameraInstance.f55534v.get(str);
            if (bundle2 == null) {
                C20296p.m50063d("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (bundle2.containsKey(str2)) {
                    if (C20278c.f55749a.containsKey(str2)) {
                        cls = (Class) C20278c.f55749a.get(str2);
                    } else {
                        cls = null;
                    }
                    if (cls == Boolean.class) {
                        bundle.putBoolean(str2, bundle2.getBoolean(str2));
                    } else if (cls == Integer.class) {
                        bundle.putInt(str2, bundle2.getInt(str2));
                    } else if (cls == Long.class) {
                        bundle.putLong(str2, bundle2.getLong(str2));
                    } else if (cls == Float.class) {
                        bundle.putFloat(str2, bundle2.getFloat(str2));
                    } else if (cls == Double.class) {
                        bundle.putDouble(str2, bundle2.getDouble(str2));
                    } else if (cls == String.class) {
                        bundle.putString(str2, bundle2.getString(str2));
                    } else if (cls == ArrayList.class) {
                        bundle.putParcelableArrayList(str2, bundle2.getParcelableArrayList(str2));
                    } else if (cls == TEFrameSizei.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else if (cls == TEFocusParameters.class) {
                        bundle.putParcelable(str2, bundle2.getParcelable(str2));
                    } else {
                        StringBuilder sb = new StringBuilder("Not supported key:");
                        sb.append(str2);
                        C20296p.m50062c("TECameraServer", sb.toString());
                    }
                }
            }
            return;
        }
        C20296p.m50063d("TECameraServer", "queryFeatures: camera instance null");
    }

    public final int switchCamera(final C20208g gVar, final int i) {
        StringBuilder sb = new StringBuilder("switchCamera: ");
        sb.append(i);
        C20296p.m50059a("TECameraServer", sb.toString());
        if (!m50023a(gVar)) {
            return -108;
        }
        if (this.mCameraSettings.f55723e == i) {
            return -423;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.switchCamera(gVar, i);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 1) {
                    this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                    return -105;
                }
                this.mCameraSettings.f55723e = i;
                this.f55614e = 0.0f;
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = m50026b();
                }
                if (this.mCurrentCameraState != 0) {
                    this.mCameraInstance.mo42733e();
                    this.mCurrentCameraState = 0;
                }
                this.mCurrentCameraState = 1;
                if (this.mRetryCnt < 0) {
                    this.mRetryCnt = this.mCameraSettings.f55732n;
                }
                this.mBeginTime = System.currentTimeMillis();
                int a = this.mCameraInstance.mo42713a(this.mCameraSettings);
                if (a != 0) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb2 = new StringBuilder("Switch camera failed @");
                    sb2.append(this.mCameraSettings.f55721c);
                    sb2.append(",face:");
                    sb2.append(this.mCameraSettings.f55723e);
                    sb2.append(" ");
                    sb2.append(this.mCameraSettings.f55728j.toString());
                    aVar.onError(a, sb2.toString());
                }
            }
        }
        return 0;
    }

    public final int takePicture(final C20208g gVar, final C20281f fVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            this.f55611b.post(new Runnable() {
                public final void run() {
                    C20241k.this.takePicture(gVar, fVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not takePicture on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                if (this.mCameraSettings.f55721c == 1) {
                    this.mCurrentCameraState = 2;
                }
                this.mCameraInstance.mo42721a(fVar);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        close();
        open(r6, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int switchCamera(final com.p683ss.android.ttvecamera.C20208g r6, final com.p683ss.android.ttvecamera.C20275l r7) {
        /*
            r5 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "switchCamera: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r0, r1)
            boolean r0 = r5.m50023a(r6)
            if (r0 != 0) goto L_0x001c
            r6 = -108(0xffffffffffffff94, float:NaN)
            return r6
        L_0x001c:
            boolean r0 = r5.m50024a(r7)
            if (r0 != 0) goto L_0x0025
            r6 = -423(0xfffffffffffffe59, float:NaN)
            return r6
        L_0x0025:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r5.f55611b
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            if (r0 == r1) goto L_0x003e
            android.os.Handler r0 = r5.f55611b
            com.ss.android.ttvecamera.k$32 r1 = new com.ss.android.ttvecamera.k$32
            r1.<init>(r6, r7)
            r0.post(r1)
            goto L_0x00cf
        L_0x003e:
            java.lang.Object r0 = r5.mStateLock
            monitor-enter(r0)
            int r1 = r5.mCurrentCameraState     // Catch:{ all -> 0x00d0 }
            r3 = 1
            if (r1 != r3) goto L_0x0051
            com.ss.android.ttvecamera.g$a r6 = r5.mCameraObserver     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "Camera is opening, ignore this switch request."
            r1 = -105(0xffffffffffffff97, float:NaN)
            r6.onError(r1, r7)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return r1
        L_0x0051:
            com.ss.android.ttvecamera.l r1 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r1 = r1.f55721c     // Catch:{ all -> 0x00d0 }
            int r4 = r7.f55721c     // Catch:{ all -> 0x00d0 }
            if (r1 != r4) goto L_0x00c8
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x006a
            com.ss.android.ttvecamera.f r6 = r5.m50026b()     // Catch:{ all -> 0x00d0 }
            r5.mCameraInstance = r6     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f$c r1 = r5.f55622m     // Catch:{ all -> 0x00d0 }
            r6.mo42778a(r1)     // Catch:{ all -> 0x00d0 }
        L_0x006a:
            int r6 = r5.mCurrentCameraState     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x0075
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            r6.mo42733e()     // Catch:{ all -> 0x00d0 }
            r5.mCurrentCameraState = r2     // Catch:{ all -> 0x00d0 }
        L_0x0075:
            r5.mCameraSettings = r7     // Catch:{ all -> 0x00d0 }
            r5.mCurrentCameraState = r3     // Catch:{ all -> 0x00d0 }
            int r6 = r5.mRetryCnt     // Catch:{ all -> 0x00d0 }
            if (r6 >= 0) goto L_0x0083
            com.ss.android.ttvecamera.l r6 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r6 = r6.f55732n     // Catch:{ all -> 0x00d0 }
            r5.mRetryCnt = r6     // Catch:{ all -> 0x00d0 }
        L_0x0083:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r5.mBeginTime = r6     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.l r7 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r6 = r6.mo42713a(r7)     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x00c6
            com.ss.android.ttvecamera.g$a r7 = r5.mCameraObserver     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Switch camera failed @"
            r1.<init>(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.l r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r3 = r3.f55721c     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = ",face:"
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.l r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r3 = r3.f55723e     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = " "
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.l r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.TEFrameSizei r3 = r3.f55728j     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d0 }
            r7.onError(r6, r1)     // Catch:{ all -> 0x00d0 }
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return r2
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            r5.close()
            r5.open(r6, r7)
        L_0x00cf:
            return r2
        L_0x00d0:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.switchCamera(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.l):int");
    }

    public final TEFrameSizei getBestPreviewSize(C20208g gVar, float f, TEFrameSizei tEFrameSizei) {
        if (!m50023a(gVar) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo42714a(f, tEFrameSizei);
    }

    public final void setWhileBalance(final C20208g gVar, final boolean z, final String str) {
        if (m50023a(gVar)) {
            if (Looper.myLooper() != this.f55611b.getLooper()) {
                this.f55611b.post(new Runnable() {
                    public final void run() {
                        C20241k.this.setWhileBalance(gVar, z, str);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo42726a(z, str);
                }
            }
        }
    }

    public final int startZoom(C20208g gVar, float f, C20284i iVar) {
        Message message;
        if (!m50023a(gVar)) {
            return -108;
        }
        Looper.myLooper();
        this.f55611b.getLooper();
        C20201f fVar = this.mCameraInstance;
        if (fVar == null) {
            C20296p.m50062c("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float abs = Math.abs(f - this.f55614e);
        if (Math.abs(f - fVar.f55530r) < 0.1f) {
            f = fVar.f55530r;
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (abs < 0.1f) {
            return 0;
        }
        this.f55614e = f;
        if (this.f55611b.hasMessages(1)) {
            this.f55611b.removeMessages(1);
            message = new Message();
        } else {
            message = this.f55611b.obtainMessage();
        }
        message.what = 1;
        message.arg1 = (int) (f * 10.0f);
        message.obj = iVar;
        this.f55611b.sendMessage(message);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        m50027c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        com.p683ss.android.ttvecamera.C20296p.m50059a("TECameraServer", "reopen camera.");
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        return open(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int connect(com.p683ss.android.ttvecamera.C20208g r5, com.p683ss.android.ttvecamera.C20208g.C20209a r6, com.p683ss.android.ttvecamera.C20275l r7, com.p683ss.android.ttvecamera.C20208g.C20211c r8) {
        /*
            r4 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "connect with client: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r0, r1)
            if (r5 == 0) goto L_0x0067
            if (r6 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x0057
            java.lang.Object r0 = r4.f55615f
            monitor-enter(r0)
            boolean r1 = r4.m50024a(r7)     // Catch:{ all -> 0x0054 }
            com.ss.android.ttvecamera.g r2 = r4.mCameraClient     // Catch:{ all -> 0x0054 }
            r3 = 0
            if (r5 != r2) goto L_0x0030
            if (r1 != 0) goto L_0x0030
            java.lang.String r5 = "TECameraServer"
            java.lang.String r6 = "No need reconnect."
            com.p683ss.android.ttvecamera.C20296p.m50062c(r5, r6)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return r3
        L_0x0030:
            boolean r2 = r4.f55616g     // Catch:{ all -> 0x0054 }
            if (r2 != 0) goto L_0x0039
            r1 = 1
            r4.m50022a(r1)     // Catch:{ all -> 0x0054 }
            r1 = 0
        L_0x0039:
            r4.mCameraClient = r5     // Catch:{ all -> 0x0054 }
            r4.mCameraObserver = r6     // Catch:{ all -> 0x0054 }
            r4.mPictureSizeCallback = r8     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r4.m50027c()
            if (r1 == 0) goto L_0x004f
            java.lang.String r6 = "TECameraServer"
            java.lang.String r8 = "reopen camera."
            com.p683ss.android.ttvecamera.C20296p.m50059a(r6, r8)
            r4.close()
        L_0x004f:
            int r5 = r4.open(r5, r7)
            return r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r5
        L_0x0057:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "mParams must not be null"
            r5.<init>(r6)
            throw r5
        L_0x005f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "observer must not be null"
            r5.<init>(r6)
            throw r5
        L_0x0067:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "client must not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.C20241k.connect(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.g$a, com.ss.android.ttvecamera.l, com.ss.android.ttvecamera.g$c):int");
    }

    public final int takePicture(C20208g gVar, int i, int i2, C20281f fVar) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            Handler handler = this.f55611b;
            final C20208g gVar2 = gVar;
            final int i3 = i;
            final int i4 = i2;
            final C20281f fVar2 = fVar;
            C202684 r1 = new Runnable() {
                public final void run() {
                    C20241k.this.takePicture(gVar2, i3, i4, fVar2);
                }
            };
            handler.post(r1);
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not takePicture on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCurrentCameraState = 2;
                this.mCameraInstance.mo42720a(i, i2, fVar);
            }
        }
        return 0;
    }

    public final int focusAtPoint(C20208g gVar, int i, int i2, float f, int i3, int i4) {
        if (!m50023a(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.f55611b.getLooper()) {
            Handler handler = this.f55611b;
            final C20208g gVar2 = gVar;
            final int i5 = i;
            final int i6 = i2;
            final float f2 = f;
            final int i7 = i3;
            final int i8 = i4;
            C202717 r1 = new Runnable() {
                public final void run() {
                    C20241k.this.focusAtPoint(gVar2, i5, i6, f2, i7, i8);
                }
            };
            handler.post(r1);
        } else {
            StringBuilder sb = new StringBuilder("focusAtPoint: [");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append("]");
            C20296p.m50061b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo42719a(i, i2, f, i3, i4);
                } else {
                    C20209a aVar = this.mCameraObserver;
                    StringBuilder sb2 = new StringBuilder("Can not set focus on state : ");
                    sb2.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb2.toString());
                    return -105;
                }
            }
        }
        return 0;
    }
}
