package com.p683ss.android.ttvecamera.p1226a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.C20298q;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1227b.C20163d;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

/* renamed from: com.ss.android.ttvecamera.a.c */
public class C20151c extends C20150b {

    /* renamed from: B */
    private boolean f55408B;

    /* renamed from: C */
    private boolean f55409C;

    /* renamed from: D */
    private boolean f55410D;

    /* renamed from: E */
    private HandlerThread f55411E;

    /* renamed from: c */
    public int f55412c;

    /* renamed from: d */
    protected ImageReader f55413d;

    /* renamed from: e */
    public int f55414e;

    /* renamed from: f */
    public C20281f f55415f;

    /* renamed from: g */
    public long f55416g;

    /* renamed from: h */
    public Handler f55417h;

    /* renamed from: d */
    public void mo42686d() {
        if (this.f55413d != null) {
            this.f55413d.close();
            this.f55413d = null;
        }
        if (this.f55415f != null) {
            this.f55415f = null;
        }
        super.mo42686d();
    }

    /* renamed from: e */
    public final void mo42687e() {
        super.mo42687e();
        if (this.f55411E != null) {
            if (VERSION.SDK_INT >= 18) {
                this.f55411E.quitSafely();
            } else {
                this.f55411E.quit();
            }
            this.f55411E = null;
            this.f55417h = null;
        }
    }

    /* renamed from: h */
    public final void mo42690h() {
        if (this.f55486y == null) {
            C20296p.m50060a("TEImage2Mode", "resumePreview session null", new Throwable());
            return;
        }
        try {
            this.f55486y.capture(this.f55478q.build(), this.f55465A, this.f55474m);
            this.f55486y.setRepeatingRequest(this.f55478q.build(), this.f55465A, this.f55474m);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: b */
    public final void mo42683b() {
        try {
            Builder createCaptureRequest = this.f55407b.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f55413d.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            C201543 r1 = new CaptureCallback() {
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    if (C20151c.this.f55478q != null) {
                        Integer num = (Integer) C20151c.this.f55478q.get(CaptureRequest.CONTROL_AF_TRIGGER);
                        if (num != null && num.intValue() == 1) {
                            C20296p.m50059a("TEImage2Mode", "need cancel af trigger");
                            C20151c.this.f55478q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                        }
                    }
                    C20296p.m50059a("TEImage2Mode", "captureStillPicture callback come");
                    C20151c.this.mo42690h();
                }
            };
            this.f55486y.stopRepeating();
            m49716a(this.f55478q, createCaptureRequest);
            if (this.f55482u != null) {
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.f55482u);
            }
            this.f55486y.capture(createCaptureRequest.build(), r1, this.f55474m);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("captureStillPicture get exception: ");
            sb.append(e.getMessage());
            C20296p.m50063d("TEImage2Mode", sb.toString());
        }
        this.f55412c = 0;
    }

    /* renamed from: f */
    public final int mo42688f() {
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55478q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        this.f55478q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        this.f55477p = this.f55478q.build();
        try {
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo42689g() {
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -100, "rollbackMeteringSessionRequest : param is null.");
            return -100;
        }
        if (VERSION.SDK_INT >= 23) {
            this.f55478q.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
        }
        this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55477p = this.f55478q.build();
        try {
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: c */
    public int mo42685c() throws Exception {
        int i;
        boolean z;
        boolean z2;
        this.f55408B = false;
        Float f = (Float) this.f55475n.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            i = 0;
        } else {
            i = f.intValue();
        }
        StringBuilder sb = new StringBuilder("lensInfoMinFocusDistance = ");
        sb.append(i);
        C20296p.m50061b("TEImage2Mode", sb.toString());
        if (i != 0) {
            if (Build.MANUFACTURER.equalsIgnoreCase("samsung") || Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = true;
                this.f55409C = z;
                C20217c cVar = this.f55471j.f55526n;
                if (this.f55407b != null || cVar == null) {
                    C20296p.m50061b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
                    return -100;
                }
                if (!this.f55410D) {
                    cVar.f55554b.mo42804d();
                }
                this.f55410D = false;
                int i2 = super.mo42754i();
                if (i2 != 0) {
                    return i2;
                }
                mo42680a(this.f55472k.f55729k.f55398a, this.f55472k.f55729k.f55399b);
                this.f55478q = this.f55407b.createCaptureRequest(1);
                if (this.f55482u != null) {
                    this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, this.f55482u);
                }
                ArrayList<Surface> arrayList = new ArrayList<>();
                if (cVar.f55554b.mo42803c() == 8) {
                    arrayList.addAll(Arrays.asList(cVar.mo42815c()));
                } else {
                    arrayList.add(cVar.mo42814b());
                }
                for (Surface addTarget : arrayList) {
                    this.f55478q.addTarget(addTarget);
                }
                arrayList.add(this.f55413d.getSurface());
                this.f55478q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
                this.f55407b.createCaptureSession(arrayList, this.f55487z, this.f55474m);
                return 0;
            }
        }
        z = false;
        this.f55409C = z;
        C20217c cVar2 = this.f55471j.f55526n;
        if (this.f55407b != null) {
        }
        C20296p.m50061b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
        return -100;
    }

    /* renamed from: b */
    public final void mo42684b(int i) {
        int i2;
        if (this.f55478q == null || this.f55486y == null) {
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append("Capture Session is null");
            C20296p.m50063d("TEImage2Mode", sb.toString());
            return;
        }
        Integer num = (Integer) this.f55478q.get(CaptureRequest.FLASH_MODE);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        if (i != 1) {
            if (i == 0) {
                this.f55408B = false;
                this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f55478q.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder("not support flash mode: ");
                sb2.append(i);
                C20296p.m50063d("TEImage2Mode", sb2.toString());
                return;
            } else if (i2 == 2) {
                C20296p.m50059a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
                return;
            } else {
                this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f55478q.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
            }
            this.f55477p = this.f55478q.build();
            final Semaphore semaphore = new Semaphore(0);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Thread.currentThread().getName());
            sb3.append(", ");
            sb3.append(this.f55411E.getName());
            C20296p.m50061b("TEImage2Mode", sb3.toString());
            try {
                this.f55486y.setRepeatingRequest(this.f55477p, new CaptureCallback() {
                    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                        semaphore.release();
                    }
                }, this.f55417h);
            } catch (Exception e) {
                C20296p.m50060a("TEImage2Mode", "switchFlashMode exception ", e);
                semaphore.release();
            }
            try {
                semaphore.acquire();
            } catch (Exception e2) {
                StringBuilder sb4 = new StringBuilder("switchFlashMode lock exception: ");
                sb4.append(e2.getMessage());
                C20296p.m50063d("TEImage2Mode", sb4.toString());
            }
            mo42690h();
        } else if (i2 == 2) {
            C20296p.m50059a("TEImage2Mode", "switchFlashMode flashStatus == FLASH_MODE_TORCH");
        } else {
            this.f55408B = true;
        }
    }

    /* renamed from: a */
    public final int mo42679a(String str, int i) throws CameraAccessException {
        this.f55411E.start();
        this.f55417h = new Handler(this.f55411E.getLooper());
        this.f55410D = true;
        return super.mo42679a(str, i);
    }

    /* renamed from: a */
    private static void m49716a(Builder builder, Builder builder2) {
        Integer num = (Integer) builder.get(CaptureRequest.CONTROL_AE_MODE);
        if (num == null || num.intValue() != 3) {
            if (num != null && num.intValue() == 1) {
                Integer num2 = (Integer) builder.get(CaptureRequest.FLASH_MODE);
                if (num2 != null && num2.intValue() == 2) {
                    C20296p.m50061b("TEImage2Mode", "配置主闪");
                    builder2.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                    builder2.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                }
            }
            return;
        }
        C20296p.m50061b("TEImage2Mode", "配置主闪");
        builder2.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42680a(int i, int i2) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f55475n.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (this.f55472k.f55733o) {
            this.f55472k.f55729k = C20285m.m50047a((List<TEFrameSizei>) arrayList, this.f55472k.f55728j, this.f55472k.f55731m);
            StringBuilder sb = new StringBuilder("takePicture size: ");
            sb.append(this.f55472k.f55729k.toString());
            C20296p.m50059a("TEImage2Mode", sb.toString());
            this.f55413d = ImageReader.newInstance(this.f55472k.f55729k.f55398a, this.f55472k.f55729k.f55399b, UnReadVideoExperiment.BROWSE_RECORD_LIST, 1);
        } else {
            TEFrameSizei tEFrameSizei = null;
            if (this.f55483v != null) {
                Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                ArrayList arrayList2 = new ArrayList();
                for (Size size2 : outputSizes2) {
                    arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
                }
                tEFrameSizei = this.f55483v.mo42785a(arrayList, arrayList2);
            }
            if (tEFrameSizei != null) {
                this.f55472k.f55729k = tEFrameSizei;
                this.f55413d = ImageReader.newInstance(this.f55472k.f55729k.f55398a, this.f55472k.f55729k.f55399b, UnReadVideoExperiment.BROWSE_RECORD_LIST, 1);
            } else {
                this.f55472k.f55729k = C20285m.m50048a((List<TEFrameSizei>) arrayList, this.f55472k.f55728j, new TEFrameSizei(i, i2));
                this.f55413d = ImageReader.newInstance(this.f55472k.f55729k.f55398a, this.f55472k.f55729k.f55399b, 35, 1);
            }
        }
        this.f55413d.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                C20235b bVar;
                int i;
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    int width = acquireNextImage.getWidth();
                    int height = acquireNextImage.getHeight();
                    C20298q qVar = new C20298q(acquireNextImage.getPlanes());
                    if (acquireNextImage.getFormat() == 256) {
                        bVar = C20235b.PIXEL_FORMAT_JPEG;
                    } else {
                        bVar = C20235b.PIXEL_FORMAT_YUV420;
                    }
                    if (C20151c.this.f55414e == 1) {
                        i = 270;
                    } else {
                        i = 90;
                    }
                    new C20232i(qVar, bVar, width, height, i);
                    acquireNextImage.close();
                }
            }
        }, this.f55474m);
    }

    /* renamed from: a */
    public final void mo42682a(C20281f fVar, int i) {
        super.mo42682a(fVar, i);
        this.f55415f = fVar;
        this.f55414e = i;
        C20296p.m50059a("TEImage2Mode", "takePicture...");
        try {
            this.f55412c = 1;
            if (this.f55409C) {
                this.f55478q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f55478q.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                if (this.f55408B) {
                    this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                }
                this.f55416g = SystemClock.elapsedRealtime();
                try {
                    this.f55486y.capture(this.f55478q.build(), this.f55465A, this.f55474m);
                } catch (CameraAccessException unused) {
                }
                return;
            }
            if (this.f55408B) {
                this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f55478q.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
            }
            mo42683b();
        } catch (Exception e) {
            this.f55474m.post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo42681a(int i, int i2, C20281f fVar) {
        C20296p.m50059a("TEImage2Mode", "Deprecated...");
    }

    public C20151c(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
        this.f55410D = true;
        this.f55411E = new HandlerThread("camera_v2_back");
        this.f55485x = new C20163d(this);
        this.f55465A = new CaptureCallback() {
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m49729a(android.hardware.camera2.CaptureResult r10) {
                /*
                    r9 = this;
                    com.ss.android.ttvecamera.a.c r0 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    int r0 = r0.f55412c
                    r1 = 5
                    r2 = 4
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    switch(r0) {
                        case 0: goto L_0x00c1;
                        case 1: goto L_0x000e;
                        default: goto L_0x000c;
                    }
                L_0x000c:
                    goto L_0x0122
                L_0x000e:
                    android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                    java.lang.Object r0 = r10.get(r0)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    java.lang.String r6 = "TEImage2Mode"
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r8 = "进来了一层,afState--->"
                    r7.<init>(r8)
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.p683ss.android.ttvecamera.C20296p.m50059a(r6, r7)
                    if (r0 != 0) goto L_0x002d
                L_0x002b:
                    r3 = 1
                    goto L_0x0071
                L_0x002d:
                    int r6 = r0.intValue()
                    if (r2 == r6) goto L_0x0046
                    int r2 = r0.intValue()
                    if (r1 == r2) goto L_0x0046
                    int r1 = r0.intValue()
                    if (r4 == r1) goto L_0x0046
                    r1 = 6
                    int r0 = r0.intValue()
                    if (r1 != r0) goto L_0x0071
                L_0x0046:
                    android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                    java.lang.Object r10 = r10.get(r0)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    java.lang.String r0 = "TEImage2Mode"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "进来了一层,aeState--->"
                    r1.<init>(r2)
                    r1.append(r10)
                    java.lang.String r1 = r1.toString()
                    com.p683ss.android.ttvecamera.C20296p.m50059a(r0, r1)
                    if (r10 == 0) goto L_0x0069
                    int r10 = r10.intValue()
                    if (r10 != r4) goto L_0x0071
                L_0x0069:
                    java.lang.String r10 = "TEImage2Mode"
                    java.lang.String r0 = "进来了第二层"
                    com.p683ss.android.ttvecamera.C20296p.m50059a(r10, r0)
                    goto L_0x002b
                L_0x0071:
                    if (r3 != 0) goto L_0x00b9
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    long r6 = r10.f55416g
                    long r0 = r0 - r6
                    r6 = 1500(0x5dc, double:7.41E-321)
                    int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                    if (r10 <= 0) goto L_0x00b9
                    java.lang.String r10 = "TEImage2Mode"
                    java.lang.String r0 = "ae af time out"
                    com.p683ss.android.ttvecamera.C20296p.m50059a(r10, r0)
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r10 = r10.f55478q
                    android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
                    java.lang.Object r10 = r10.get(r0)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    if (r10 == 0) goto L_0x00b8
                    int r10 = r10.intValue()
                    r0 = 3
                    if (r10 != r0) goto L_0x00b8
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r10 = r10.f55478q
                    android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                    r10.set(r0, r1)
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r10 = r10.f55478q
                    android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                    r10.set(r0, r1)
                L_0x00b8:
                    r3 = 1
                L_0x00b9:
                    if (r3 == 0) goto L_0x0122
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    r10.mo42683b()
                    goto L_0x0122
                L_0x00c1:
                    com.ss.android.ttvecamera.a.c r0 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r0 = r0.f55478q
                    if (r0 == 0) goto L_0x0122
                    com.ss.android.ttvecamera.a.c r0 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r0 = r0.f55478q
                    android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
                    java.lang.Object r0 = r0.get(r6)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L_0x0121
                    int r0 = r0.intValue()
                    if (r0 != r5) goto L_0x0121
                    android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                    java.lang.Object r10 = r10.get(r0)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    if (r10 == 0) goto L_0x00f2
                    int r0 = r10.intValue()
                    if (r2 == r0) goto L_0x00f1
                    int r10 = r10.intValue()
                    if (r1 != r10) goto L_0x00f2
                L_0x00f1:
                    r3 = 1
                L_0x00f2:
                    if (r3 == 0) goto L_0x0121
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this
                    android.hardware.camera2.CaptureRequest$Builder r10 = r10.f55478q
                    android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                    r10.set(r0, r1)
                    com.ss.android.ttvecamera.a.c r10 = com.p683ss.android.ttvecamera.p1226a.C20151c.this     // Catch:{ Exception -> 0x0119 }
                    android.hardware.camera2.CameraCaptureSession r10 = r10.f55486y     // Catch:{ Exception -> 0x0119 }
                    com.ss.android.ttvecamera.a.c r0 = com.p683ss.android.ttvecamera.p1226a.C20151c.this     // Catch:{ Exception -> 0x0119 }
                    android.hardware.camera2.CaptureRequest$Builder r0 = r0.f55478q     // Catch:{ Exception -> 0x0119 }
                    android.hardware.camera2.CaptureRequest r0 = r0.build()     // Catch:{ Exception -> 0x0119 }
                    com.ss.android.ttvecamera.a.c r1 = com.p683ss.android.ttvecamera.p1226a.C20151c.this     // Catch:{ Exception -> 0x0119 }
                    android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = r1.f55465A     // Catch:{ Exception -> 0x0119 }
                    com.ss.android.ttvecamera.a.c r2 = com.p683ss.android.ttvecamera.p1226a.C20151c.this     // Catch:{ Exception -> 0x0119 }
                    android.os.Handler r2 = r2.f55474m     // Catch:{ Exception -> 0x0119 }
                    r10.setRepeatingRequest(r0, r1, r2)     // Catch:{ Exception -> 0x0119 }
                    goto L_0x0122
                L_0x0119:
                    r10 = move-exception
                    java.lang.String r0 = "TEImage2Mode"
                    java.lang.String r1 = "mCaptureCallback preview exeption"
                    com.p683ss.android.ttvecamera.C20296p.m50060a(r0, r1, r10)
                L_0x0121:
                    return
                L_0x0122:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1226a.C20151c.C201521.m49729a(android.hardware.camera2.CaptureResult):void");
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                m49729a(totalCaptureResult);
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                m49729a(captureResult);
            }
        };
    }
}
