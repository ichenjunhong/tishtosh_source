package com.p683ss.android.ttvecamera.p1226a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20195e.C20196a;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20225h;
import com.p683ss.android.ttvecamera.C20275l.C20280e;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1228c.C20177b;

/* renamed from: com.ss.android.ttvecamera.a.a */
public class C20148a extends C20195e {

    /* renamed from: w */
    protected CameraManager f55400w;

    /* renamed from: x */
    protected CameraDevice f55401x;

    /* renamed from: y */
    protected int f55402y = -1;

    /* renamed from: z */
    protected StateCallback f55403z = new StateCallback() {

        /* renamed from: a */
        C20196a<CameraDevice> f55404a = new C20196a<>(C20148a.this);

        public final void onDisconnected(CameraDevice cameraDevice) {
            C20296p.m50059a("TECamera2", "onDisconnected: OpenCameraCallBack");
            this.f55404a.mo42776b(cameraDevice);
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C20296p.m50059a("TECamera2", "onOpened: OpenCameraCallBack");
            C20148a.this.f55401x = cameraDevice;
            C20148a.this.f55512f.mo42678a((Object) cameraDevice);
            if (!this.f55404a.mo42774a(cameraDevice)) {
                cameraDevice.close();
            }
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(i);
            C20296p.m50059a("TECamera2", sb.toString());
            this.f55404a.mo42775a(cameraDevice, i);
        }
    };

    /* renamed from: l */
    public Bundle mo42667l() {
        return super.mo42667l();
    }

    /* renamed from: p */
    public final boolean mo42671p() {
        if (this.f55401x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final int mo42669n() {
        if (this.f55512f == null) {
            this.f55522j.mo42782a(this.f55520h.f55721c, -425, "_startCapture : mode is null");
            return -1;
        }
        try {
            this.f55512f.mo42686d();
            int c = this.f55512f.mo42685c();
            if (c != 0) {
                this.f55522j.mo42782a(this.f55520h.f55721c, c, "_startCapture : something wrong");
            }
            return c;
        } catch (Exception e) {
            C20225h.m49990a(e);
            this.f55522j.mo42782a(this.f55520h.f55721c, -425, "_startCapture : mode is null");
            return -1;
        }
    }

    /* renamed from: o */
    public final int mo42670o() {
        if (this.f55512f == null) {
            this.f55522j.mo42782a(this.f55520h.f55721c, -425, "_stopCapture : mode is null");
            return -1;
        }
        try {
            this.f55512f.f55486y.stopRepeating();
            this.f55512f.mo42686d();
            this.f55522j.mo42784b(4, 0, "TECamera2 preview stoped");
            return 0;
        } catch (Exception unused) {
            this.f55522j.mo42782a(this.f55520h.f55721c, -425, "_stopCapture : mode is null");
            return -1;
        }
    }

    /* renamed from: q */
    public final void mo42672q() {
        try {
            this.f55512f.mo42687e();
            this.f55512f.mo42686d();
            if (this.f55401x != null) {
                this.f55401x.close();
                this.f55401x = null;
                this.f55522j.mo42783a(this);
            }
        } catch (Throwable th) {
            C20296p.m50063d("TECamera2", th.getMessage());
        }
        super.mo42672q();
    }

    /* renamed from: m */
    public int mo42668m() throws Exception {
        int i;
        if (this.f55400w == null) {
            this.f55400w = (CameraManager) this.f55524l.getSystemService("camera");
            if (this.f55400w == null) {
                return -401;
            }
        }
        if (this.f55520h.f55734p == 0) {
            this.f55512f = new C20157d(this, this.f55524l, this.f55400w, this.f55523k);
        } else {
            this.f55512f = new C20151c(this, this.f55524l, this.f55400w, this.f55523k);
            this.f55512f.mo42750a(this.f55531s);
        }
        this.f55520h.f55740v = this.f55512f.mo42677a(this.f55520h.f55723e);
        if (this.f55520h.f55740v == null) {
            C20296p.m50063d("TECamera2", "Invalid CameraID");
            return -401;
        }
        C20177b bVar = this.f55512f;
        String str = this.f55520h.f55740v;
        if (this.f55511e) {
            i = this.f55520h.f55736r;
        } else {
            i = 0;
        }
        int a = bVar.mo42679a(str, i);
        if (a != 0) {
            return a;
        }
        mo42667l();
        this.f55522j.mo42784b(1, 0, "TECamera2 features is ready");
        if (this.f55512f instanceof C20151c) {
            this.f55400w.openCamera(this.f55520h.f55740v, this.f55403z, ((C20151c) this.f55512f).f55417h);
        } else {
            this.f55400w.openCamera(this.f55520h.f55740v, this.f55403z, this.f55523k);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo42665a(Bundle bundle) {
        super.mo42665a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f55534v.get(this.f55520h.f55740v);
            for (String str : bundle.keySet()) {
                if (C20280e.m50037a(str, bundle.get(str)) && str == "support_light_soft") {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    /* renamed from: d */
    public void mo42666d(int i) {
        if (this.f55512f != null) {
            mo42670o();
            if (i == 0) {
                this.f55512f = new C20157d(this, this.f55524l, this.f55400w, this.f55523k);
            } else {
                this.f55512f = new C20151c(this, this.f55524l, this.f55400w, this.f55523k);
                this.f55512f.mo42750a(this.f55531s);
            }
            try {
                this.f55520h.f55740v = this.f55512f.mo42677a(this.f55520h.f55723e);
                if (this.f55520h.f55740v == null || this.f55512f.mo42679a(this.f55520h.f55740v, this.f55520h.f55736r) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            this.f55512f.mo42678a((Object) this.f55401x);
            mo42669n();
        }
    }

    public C20148a(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
