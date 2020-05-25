package com.p683ss.android.medialib.p1185qr;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.C19318f;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1180b.C19222a.C19223a;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.p1185qr.PicScanner.C19387a;
import com.p683ss.android.medialib.presenter.C19360c;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.qr.EnigmaScanner */
public class EnigmaScanner implements C2593a {
    public C19385a listener;
    private long mCameraScanRequirement = 0;
    private float mCurCameraZoom = 1.0f;
    public boolean mFailed;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastZoomTime = 0;
    public PicScanner mPicScanner;
    public C19361d mPresenter;
    private Runnable mRunnable;
    public C19386b mScanMode = C19386b.CAMERA;
    public volatile boolean mStopped = false;

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$a */
    public interface C19385a {
        /* renamed from: a */
        void mo40443a(int i, int i2);

        /* renamed from: a */
        void mo40444a(EnigmaResult enigmaResult);
    }

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$b */
    public enum C19386b {
        CAMERA,
        PICTURE
    }

    static {
        C20129b.m49687d();
    }

    public C19386b getScanMode() {
        return this.mScanMode;
    }

    public void release() {
        MessageCenter.removeListener(this);
    }

    public void stop() {
        this.mStopped = true;
        stopCameraScan();
        stopPicScan();
    }

    public EnigmaScanner() {
        MessageCenter.addListener(this);
    }

    public void setScanMode() {
        if (this.mPicScanner != null) {
            this.mScanMode = C19386b.PICTURE;
            if (this.mPresenter != null) {
                this.mPresenter.mo40306a(false, this.mCameraScanRequirement);
            }
        } else {
            this.mScanMode = C19386b.CAMERA;
            if (this.mPresenter != null) {
                this.mPresenter.mo40306a(true, this.mCameraScanRequirement);
            }
        }
    }

    public synchronized void stopCameraScan() {
        this.mStopped = true;
        if (this.mPresenter != null) {
            C19274g.m47034b().mo39746j();
            this.mPresenter.mo40383i(false);
            this.mPresenter.mo40394m();
            this.mPresenter.mo40244a((C19223a) null);
            this.mPresenter = null;
        }
        setScanMode();
    }

    public synchronized void stopPicScan() {
        this.mStopped = true;
        if (this.mRunnable != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
        }
        if (this.mPicScanner != null) {
            this.mPicScanner.stop();
            this.mPicScanner.release();
            this.mPicScanner = null;
        }
        setScanMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void onResult() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ss.android.medialib.qr.EnigmaScanner$b r0 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.C19386b.PICTURE     // Catch:{ all -> 0x0085 }
            if (r0 != r1) goto L_0x0016
            com.ss.android.medialib.qr.PicScanner r0 = r7.mPicScanner     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r7.mFailed     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0016
            com.ss.android.medialib.qr.PicScanner r0 = r7.mPicScanner     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.getEnigmaResult()     // Catch:{ all -> 0x0085 }
            goto L_0x0026
        L_0x0016:
            com.ss.android.medialib.qr.EnigmaScanner$b r0 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.C19386b.CAMERA     // Catch:{ all -> 0x0085 }
            if (r0 != r1) goto L_0x0083
            com.ss.android.medialib.presenter.d r0 = r7.mPresenter     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.medialib.presenter.d r0 = r7.mPresenter     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.mo40410t()     // Catch:{ all -> 0x0085 }
        L_0x0026:
            if (r0 == 0) goto L_0x0081
            com.ss.android.medialib.model.Enigma[] r1 = r0.getResult()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x003d
            android.os.Handler r1 = r7.mHandler     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$4 r2 = new com.ss.android.medialib.qr.EnigmaScanner$4     // Catch:{ all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ all -> 0x0085 }
            r1.post(r2)     // Catch:{ all -> 0x0085 }
            r0 = 1
            r7.mStopped = r0     // Catch:{ all -> 0x0085 }
            monitor-exit(r7)
            return
        L_0x003d:
            com.ss.android.medialib.qr.EnigmaScanner$b r1 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.C19386b.CAMERA     // Catch:{ all -> 0x0085 }
            if (r1 != r2) goto L_0x0081
            com.ss.android.medialib.camera.g r1 = com.p683ss.android.medialib.camera.C19274g.m47034b()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x004b
            monitor-exit(r7)
            return
        L_0x004b:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r4 = r7.mLastZoomTime     // Catch:{ all -> 0x0085 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0081
            float r2 = r7.mCurCameraZoom     // Catch:{ all -> 0x0085 }
            float r0 = r0.zoomFactor     // Catch:{ all -> 0x0085 }
            float r2 = r2 * r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0070
        L_0x006a:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r2
        L_0x0070:
            float r2 = r7.mCurCameraZoom     // Catch:{ all -> 0x0085 }
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            r1.mo39720a(r0)     // Catch:{ all -> 0x0085 }
            r7.mCurCameraZoom = r0     // Catch:{ all -> 0x0085 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r7.mLastZoomTime = r0     // Catch:{ all -> 0x0085 }
        L_0x0081:
            monitor-exit(r7)
            return
        L_0x0083:
            monitor-exit(r7)
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.p1185qr.EnigmaScanner.onResult():void");
    }

    public void setListener(C19385a aVar) {
        this.listener = aVar;
    }

    public void enableCameraScan(boolean z) {
        enableCameraScanWithRequirement(z, this.mCameraScanRequirement);
    }

    public void enableCameraScanWithRequirement(boolean z, long j) {
        this.mCameraScanRequirement = j;
        if (this.mPresenter != null) {
            this.mPresenter.mo40306a(z, j);
            if (z) {
                this.mStopped = false;
            }
        }
    }

    public void startScan(String str, ScanSettings scanSettings, long j) {
        stopPicScan();
        this.mPicScanner = new PicScanner();
        this.mPicScanner.setListener(new C19387a() {
            /* renamed from: a */
            public final void mo40440a(boolean z) {
                if (!z && EnigmaScanner.this.listener != null) {
                    EnigmaScanner.this.listener.mo40443a(-2001, -1);
                }
            }
        });
        setScanMode();
        this.mFailed = false;
        int start = this.mPicScanner.start(str, scanSettings);
        if (start >= 0 || this.listener == null) {
            this.mRunnable = new Runnable() {

                /* renamed from: a */
                final PicScanner f53588a = EnigmaScanner.this.mPicScanner;

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r4 = this;
                        com.ss.android.medialib.qr.EnigmaScanner r0 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this
                        monitor-enter(r0)
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53588a     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003f
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53588a     // Catch:{ all -> 0x0041 }
                        boolean r1 = r1.isValid()     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003f
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53588a     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner r2 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.PicScanner r2 = r2.mPicScanner     // Catch:{ all -> 0x0041 }
                        if (r1 == r2) goto L_0x0018
                        goto L_0x003f
                    L_0x0018:
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$b r1 = r1.mScanMode     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$b r2 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.C19386b.PICTURE     // Catch:{ all -> 0x0041 }
                        if (r1 != r2) goto L_0x003d
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53588a     // Catch:{ all -> 0x0041 }
                        boolean r1 = r1.isSuccess()     // Catch:{ all -> 0x0041 }
                        if (r1 != 0) goto L_0x003d
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003d
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0041 }
                        r2 = -2002(0xfffffffffffff82e, float:NaN)
                        r3 = -1
                        r1.mo40443a(r2, r3)     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p683ss.android.medialib.p1185qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        r2 = 1
                        r1.mFailed = r2     // Catch:{ all -> 0x0041 }
                    L_0x003d:
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        return
                    L_0x003f:
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        return
                    L_0x0041:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.p1185qr.EnigmaScanner.C193833.run():void");
                }
            };
            this.mHandler.postDelayed(this.mRunnable, j);
            this.mStopped = false;
            return;
        }
        this.listener.mo40443a(-2000, start);
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (i != 24) {
            return;
        }
        if (!this.mStopped || this.mScanMode == C19386b.PICTURE) {
            onResult();
        }
    }

    public void startScan(final Context context, C19264d dVar, final SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        stopCameraScan();
        this.mPresenter = new C19361d();
        this.mCameraScanRequirement = scanSettings.detectRequirement;
        final C19274g b = C19274g.m47034b();
        if (b.f53198i) {
            b.mo39741e();
        }
        b.mo39724a(dVar);
        if (b.f53198i) {
            b.mo39728a((C19360c) this.mPresenter);
            C19361d dVar2 = this.mPresenter;
            C19318f.m47183a().f53369a = dVar2.f53536i;
            int initFaceBeautyPlayOnlyPreview = dVar2.f53536i.initFaceBeautyPlayOnlyPreview(scanSettings);
            if (initFaceBeautyPlayOnlyPreview >= 0 || this.listener == null) {
                b.mo39732a(0, (C19263c) new C19263c() {
                    /* renamed from: a */
                    public final void mo39670a(int i) {
                        b.mo39722a(context);
                        EnigmaScanner.this.setScanMode();
                        EnigmaScanner.this.mPresenter.mo40294a((C19233b) new C19233b() {
                            /* renamed from: a */
                            public final void mo39625a(int i, int i2) {
                            }

                            /* renamed from: a */
                            public final void mo39624a(int i) {
                                if (EnigmaScanner.this.listener != null) {
                                    if (i == 0) {
                                        EnigmaScanner.this.mPresenter.mo40284a(((float) b.mo39737c()) / ((float) b.mo39739d()), b.mo39737c(), b.mo39739d());
                                        return;
                                    }
                                    EnigmaScanner.this.listener.mo40443a(-2001, i);
                                }
                            }
                        });
                        EnigmaScanner.this.mPresenter.mo40256a(surfaceHolder.getSurface(), Build.DEVICE);
                        EnigmaScanner.this.mStopped = false;
                    }

                    /* renamed from: a */
                    public final void mo39671a(int i, int i2, String str) {
                        if (EnigmaScanner.this.listener != null) {
                            EnigmaScanner.this.listener.mo40443a(-1000, i);
                        }
                    }
                });
            } else {
                this.listener.mo40443a(-2000, initFaceBeautyPlayOnlyPreview);
            }
        }
    }
}
