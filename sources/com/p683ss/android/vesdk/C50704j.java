package com.p683ss.android.vesdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.p683ss.android.medialib.log.C19349b;
import com.p683ss.android.ttve.monitor.C20102a;
import com.p683ss.android.ttve.monitor.C20112f;
import com.p683ss.android.ttve.monitor.C20112f.C20113a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttve.nativePort.TELogcat;
import com.p683ss.android.ttvecamera.C20208g;
import com.p683ss.android.ttvecamera.C20208g.C20209a;
import com.p683ss.android.ttvecamera.C20208g.C20211c;
import com.p683ss.android.ttvecamera.C20225h;
import com.p683ss.android.ttvecamera.C20225h.C20226a;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.C20239j;
import com.p683ss.android.ttvecamera.C20239j.C20240a;
import com.p683ss.android.ttvecamera.C20241k;
import com.p683ss.android.ttvecamera.C20275l;
import com.p683ss.android.ttvecamera.C20275l.C20277b;
import com.p683ss.android.ttvecamera.C20275l.C20282g;
import com.p683ss.android.ttvecamera.C20275l.C20283h;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.C20296p.C20297a;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20214b.C20216a;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import com.p683ss.android.vesdk.C50601ah.C50619g;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import com.p683ss.android.vesdk.VECameraSettings.C50532a;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import com.p683ss.android.vesdk.VEListener.C50543g;
import com.p683ss.android.vesdk.VEListener.C50557u;
import com.p683ss.android.vesdk.p2531a.C50589a;
import com.p683ss.android.vesdk.p2532b.C50653a;
import com.p683ss.android.vesdk.p2532b.C50654b;
import com.p683ss.android.vesdk.p2532b.C50656c;
import com.p683ss.android.vesdk.p2533c.C50658a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.j */
public class C50704j implements C20209a, C20283h, C20284i, C50589a {

    /* renamed from: a */
    public static final String f127242a = "j";

    /* renamed from: b */
    protected VECameraSettings f127243b;

    /* renamed from: c */
    protected C20275l f127244c;

    /* renamed from: d */
    protected Context f127245d;

    /* renamed from: e */
    protected VESize f127246e = new VESize(1280, 720);

    /* renamed from: f */
    protected C50619g f127247f;

    /* renamed from: g */
    protected C50625m f127248g;

    /* renamed from: h */
    protected C50543g f127249h;

    /* renamed from: i */
    protected C50557u f127250i;

    /* renamed from: j */
    public C50654b f127251j;

    /* renamed from: k */
    public boolean f127252k;

    /* renamed from: l */
    public long f127253l = 0;

    /* renamed from: m */
    public C20211c f127254m = new C20211c() {
        /* renamed from: a */
        public final TEFrameSizei mo42799a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (C50704j.this.f127250i == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei : list) {
                arrayList.add(new VESize(tEFrameSizei.f55398a, tEFrameSizei.f55399b));
            }
            for (TEFrameSizei tEFrameSizei2 : list2) {
                arrayList2.add(new VESize(tEFrameSizei2.f55398a, tEFrameSizei2.f55399b));
            }
            VESize a = C50704j.this.f127250i.mo98574a(arrayList, arrayList2);
            if (a == null) {
                return null;
            }
            TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
            tEFrameSizei3.f55398a = a.width;
            tEFrameSizei3.f55399b = a.height;
            return tEFrameSizei3;
        }
    };

    /* renamed from: n */
    public C20282g f127255n = new C20282g() {
        /* renamed from: a */
        public final void mo42920a(int i, float f) {
            if (C50704j.this.f127248g != null) {
                C50704j.this.f127248g.mo43397a(i, f);
            }
        }
    };

    /* renamed from: o */
    private C50588a<C50654b> f127256o;

    /* renamed from: p */
    private C20208g f127257p = new C20208g(this, this.f127254m);

    /* renamed from: q */
    private AtomicBoolean f127258q = new AtomicBoolean(false);

    /* renamed from: r */
    private int f127259r = -1;

    /* renamed from: s */
    private boolean f127260s = true;

    /* renamed from: t */
    private C20216a f127261t = new C20216a() {
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
            C50654b bVar = C50704j.this.f127251j;
            if (bVar != null && bVar.f127005d != null) {
                bVar.f127005d.onNewSurfaceTexture(surfaceTexture);
            }
        }

        public final void onFrameCaptured(C20232i iVar) {
            C50654b bVar = C50704j.this.f127251j;
            if (!(bVar == null || bVar.f127005d == null)) {
                bVar.f127005d.onFrameCaptured(iVar);
            }
            if (!C50704j.this.f127252k) {
                C20114g.m49645a(0, "te_record_camera_preview_first_frame_cost", System.currentTimeMillis() - C50704j.this.f127253l);
                C50543g gVar = C50704j.this.f127249h;
                if (gVar != null) {
                    gVar.mo43395a(3, 0, "Camera first frame captured");
                }
                C50704j.this.f127252k = true;
                C50792y.m109909a(C50704j.f127242a, "Camera first frame captured!!");
            }
        }
    };

    /* renamed from: i */
    public final VECameraSettings mo98735i() {
        return this.f127243b;
    }

    /* renamed from: j */
    public final VESize mo98736j() {
        return this.f127246e;
    }

    /* renamed from: a */
    public final void mo99223a(C50619g gVar) {
        this.f127247f = gVar;
    }

    /* renamed from: a */
    public final void mo99224a(C50625m mVar) {
        this.f127248g = mVar;
        if (this.f127257p != null) {
            C20241k.INSTANCE.setSATZoomCallback(this.f127255n);
        }
    }

    /* renamed from: a */
    public final boolean mo42923a() {
        return this.f127247f != null && this.f127247f.mo43392a();
    }

    /* renamed from: a */
    public final float[] mo99225a(C20277b bVar) {
        return C20241k.INSTANCE.getFOV(this.f127257p, bVar);
    }

    /* renamed from: a */
    public final void mo99221a(Bundle bundle) {
        C20241k.INSTANCE.setFeatureParameters(this.f127257p, bundle);
    }

    /* renamed from: d */
    public final int mo98731d() {
        return this.f127257p.mo42794c();
    }

    /* renamed from: e */
    public final int mo98732e() {
        this.f127258q.set(false);
        return this.f127257p.mo42788a();
    }

    /* renamed from: g */
    public final boolean mo99227g() {
        return C20241k.INSTANCE.isTorchSupported(this.f127257p);
    }

    /* renamed from: h */
    public final int mo99228h() {
        return C20241k.INSTANCE.queryZoomAbility(this.f127257p, this);
    }

    /* renamed from: f */
    public final void mo98733f() {
        this.f127247f = null;
        this.f127249h = null;
        this.f127245d = null;
        if (this.f127244c != null) {
            C20275l lVar = this.f127244c;
            lVar.f55720b = null;
            lVar.f55737s.clear();
            this.f127244c = null;
        }
    }

    /* renamed from: b */
    public final int mo98730b() {
        if (this.f127244c == null || this.f127243b == null) {
            C20296p.m50063d(f127242a, "mCameraParams == null, please init VECameraCapture!");
            return -105;
        } else if (this.f127244c.f55728j.f55398a <= 0 || this.f127244c.f55728j.f55399b <= 0) {
            return -100;
        } else {
            if (!this.f127258q.get()) {
                C19349b.f53485a = System.currentTimeMillis();
            }
            this.f127258q.set(true);
            if (this.f127244c.f55721c != this.f127243b.f126687i.ordinal()) {
                this.f127244c = m109626b(this.f127243b);
            }
            return this.f127257p.mo42791a(this.f127244c);
        }
    }

    /* renamed from: c */
    public final int mo99226c() {
        C20216a aVar;
        C20218a aVar2;
        if (this.f127256o == null || this.f127256o.mo98726a()) {
            C50792y.m109914d(f127242a, "start with empty TECapturePipeline list");
            return -100;
        } else if (!this.f127258q.get()) {
            C50792y.m109913c(f127242a, "startPreview when camera is closed!");
            return -105;
        } else {
            boolean equals = "landscape".equals(this.f127243b.f126690l);
            boolean z = false;
            for (C50654b bVar : this.f127256o.mo98728b()) {
                if (bVar == null || !bVar.mo99030b()) {
                    C50792y.m109913c(f127242a, "pipeline is not valid");
                } else {
                    if (bVar.f127006e) {
                        aVar = this.f127261t;
                        this.f127251j = bVar;
                    } else {
                        aVar = bVar.f127005d;
                    }
                    C20216a aVar3 = aVar;
                    if (bVar.f127003b == C20235b.PIXEL_FORMAT_OpenGL_OES) {
                        C50656c cVar = (C50656c) bVar;
                        if (this.f127259r == 1 && !this.f127260s) {
                            cVar.mo99029a().release();
                            cVar.f127010h = new C50658a(cVar.f127009a);
                            if (this.f127259r == 1) {
                                this.f127259r = 0;
                            }
                        }
                        aVar2 = new C20218a(cVar.f127004c, aVar3, cVar.f127006e, cVar.mo99029a(), cVar.f127009a);
                    } else {
                        C50653a aVar4 = (C50653a) bVar;
                        C20218a aVar5 = new C20218a(aVar4.f127004c, aVar3, aVar4.f127006e, aVar4.mo99029a(), aVar4.f127003b, aVar4.f127001a);
                        aVar2 = aVar5;
                    }
                    this.f127257p.mo42790a(aVar2);
                    bVar.f127007f = equals;
                    z = true;
                }
            }
            if (z) {
                return this.f127257p.mo42792b();
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo99222a(C50543g gVar) {
        this.f127249h = gVar;
    }

    /* renamed from: a */
    public final int mo99215a(float f) {
        return C20241k.INSTANCE.startZoom(this.f127257p, f, this);
    }

    public void onCaptureStopped(int i) {
        if (this.f127249h != null) {
            this.f127249h.mo43395a(5, i, "Camera is closed!");
        }
    }

    /* renamed from: a */
    public final int mo99218a(CAMERA_FLASH_MODE camera_flash_mode) {
        int i;
        if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i = 0;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i = 1;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i = 3;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i = 2;
        } else if (camera_flash_mode != CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            return -100;
        } else {
            i = 4;
        }
        return C20241k.INSTANCE.switchFlashMode(this.f127257p, i);
    }

    /* renamed from: b */
    private C20275l m109626b(VECameraSettings vECameraSettings) {
        if (vECameraSettings == null) {
            return null;
        }
        C20275l lVar = new C20275l(this.f127245d);
        lVar.f55721c = vECameraSettings.f126687i.ordinal();
        lVar.f55723e = vECameraSettings.f126688j.ordinal();
        lVar.f55741w = vECameraSettings.f126689k;
        lVar.f55736r = vECameraSettings.f126686h.ordinal();
        lVar.f55728j.f55398a = vECameraSettings.f126684f.height;
        lVar.f55728j.f55399b = vECameraSettings.f126684f.width;
        lVar.f55744z = vECameraSettings.f126683e;
        lVar.f55717B = vECameraSettings.f126691m;
        lVar.f55737s = vECameraSettings.f126702x;
        lVar.f55733o = vECameraSettings.f126692n;
        lVar.f55731m = vECameraSettings.f126693o;
        lVar.f55734p = vECameraSettings.f126699u.ordinal();
        this.f127246e.width = lVar.f55728j.f55398a;
        this.f127246e.height = lVar.f55728j.f55399b;
        lVar.f55743y = vECameraSettings.f126698t;
        lVar.f55727i = vECameraSettings.f126700v;
        lVar.f55732n = vECameraSettings.f126701w;
        lVar.f55716A = vECameraSettings.mo98489a().ordinal();
        lVar.f55737s = vECameraSettings.f126702x;
        return lVar;
    }

    /* renamed from: a */
    public final int mo99219a(VECameraSettings vECameraSettings) {
        C19349b.f53486b = System.currentTimeMillis();
        this.f127243b = vECameraSettings;
        this.f127244c = m109626b(vECameraSettings);
        int b = this.f127257p.mo42793b(this.f127244c);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", vECameraSettings.f126688j.name());
            jSONObject.put("resultCode", b);
            C20102a.m49612a("vesdk_event_recorder_change_camera", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: a */
    public final int mo98734a(C50588a<C50654b> aVar) {
        this.f127256o = aVar;
        if (this.f127256o != null && !this.f127256o.mo98726a()) {
            return mo99226c();
        }
        C50792y.m109914d(f127242a, "start with empty TECapturePipeline list");
        return -100;
    }

    public void onError(int i, String str) {
        if (this.f127249h != null) {
            this.f127249h.mo43396a(i, str);
        }
    }

    /* renamed from: a */
    public final int mo99217a(Context context, VECameraSettings vECameraSettings) {
        this.f127245d = context;
        this.f127243b = vECameraSettings;
        this.f127244c = m109626b(vECameraSettings);
        byte b = C50792y.f127604b;
        C20296p.f55777c = new C20297a() {
            /* renamed from: a */
            public final void mo42937a(byte b, String str, String str2) {
                TELogcat.Log(b, str, str2);
            }
        };
        String str = "VESDK";
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            C20296p.f55775a = sb.toString();
        }
        C20296p.f55776b = b;
        C20239j.f55608a = new C20240a() {
            /* renamed from: a */
            public final void mo42841a(String str, double d) {
                C20114g.m49644a(0, str, d);
            }

            /* renamed from: a */
            public final void mo42842a(String str, long j) {
                C20114g.m49645a(0, str, j);
            }

            /* renamed from: a */
            public final void mo42843a(String str, String str2) {
                C20114g.m49646a(0, str, str2);
            }
        };
        C20225h.f55575a = new WeakReference<>(new C20226a() {
            /* renamed from: a */
            public final void mo42821a(Throwable th) {
                C20113a aVar;
                WeakReference<C20113a> weakReference = C20112f.f55316a;
                if (weakReference == null) {
                    aVar = null;
                } else {
                    aVar = (C20113a) weakReference.get();
                }
                if (aVar != null) {
                    aVar.mo42267a(th);
                }
            }
        });
        return 0;
    }

    public void onCaptureStarted(int i, int i2) {
        CAMERA_FACING_ID camera_facing_id;
        synchronized (this) {
            C20275l lVar = this.f127244c;
            if (lVar != null) {
                VECameraSettings vECameraSettings = this.f127243b;
                int i3 = lVar.f55723e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        camera_facing_id = CAMERA_FACING_ID.FACING_FRONT;
                    } else if (i3 == 2) {
                        camera_facing_id = CAMERA_FACING_ID.FACING_WIDE_ANGLE;
                    } else if (i3 == 3) {
                        camera_facing_id = CAMERA_FACING_ID.FACING_TELEPHOTO;
                    }
                    vECameraSettings.f126688j = camera_facing_id;
                }
                camera_facing_id = CAMERA_FACING_ID.FACING_BACK;
                vECameraSettings.f126688j = camera_facing_id;
            }
        }
        C50543g gVar = this.f127249h;
        if (i2 == 0) {
            mo99226c();
            if (this.f127260s) {
                this.f127260s = false;
            }
            if (gVar != null) {
                gVar.mo43393a();
                StringBuilder sb = new StringBuilder("Camera type: ");
                sb.append(i);
                gVar.mo43395a(2, i, sb.toString());
            }
        } else if (gVar != null) {
            gVar.mo43394a(i);
        }
    }

    /* renamed from: a */
    public final synchronized VESize mo99220a(float f, VESize vESize) {
        TEFrameSizei tEFrameSizei;
        C20208g gVar = this.f127257p;
        float f2 = 1.0f / f;
        if (vESize != null) {
            tEFrameSizei = new TEFrameSizei(vESize.height, vESize.width);
        } else {
            tEFrameSizei = null;
        }
        TEFrameSizei bestPreviewSize = C20241k.INSTANCE.getBestPreviewSize(gVar, f2, tEFrameSizei);
        if (bestPreviewSize == null) {
            return null;
        }
        this.f127246e.width = bestPreviewSize.f55398a;
        this.f127246e.height = bestPreviewSize.f55399b;
        this.f127244c.f55728j.f55398a = this.f127246e.width;
        this.f127244c.f55728j.f55399b = this.f127246e.height;
        this.f127243b = new C50532a(this.f127243b).mo98520a(this.f127246e.height, this.f127246e.width).f126710a;
        return this.f127246e;
    }

    /* renamed from: a */
    public static void m109625a(Context context, CAMERA_TYPE camera_type, Bundle bundle) {
        C20208g.m49935a(context, camera_type.ordinal(), bundle);
    }

    public void onInfo(int i, int i2, String str) {
        if (this.f127249h != null) {
            this.f127249h.mo43395a(i, i2, str);
        }
        if (i == 0) {
            this.f127252k = false;
        } else if (i != 50 || str == null) {
            if (i == 3 && i2 == 3) {
                this.f127253l = System.currentTimeMillis();
            }
        } else {
            String[] split = str.split("x");
            if (split != null && split.length == 2) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
                C50654b bVar = this.f127251j;
                if (!(bVar == null || bVar.f127005d == null)) {
                    bVar.f127005d.mo99031a(tEFrameSizei);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo42921a(int i, float f, boolean z) {
        if (this.f127247f != null) {
            this.f127247f.mo43390a(i, f, z);
        }
    }

    /* renamed from: a */
    public final int mo99216a(int i, int i2, float f, int i3, int i4) {
        return this.f127257p.mo42789a(i, i2, f, i3, i4);
    }

    /* renamed from: a */
    public final void mo42922a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        if (this.f127247f != null) {
            this.f127247f.mo43391a(i, z, z2, f, list);
        }
    }
}
