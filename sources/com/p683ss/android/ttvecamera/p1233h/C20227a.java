package com.p683ss.android.ttvecamera.p1233h;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20201f.C20204c;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1226a.C20148a;
import com.p683ss.android.ttvecamera.p1228c.C20177b;
import com.p683ss.android.ttvecamera.p1229d.C20194i;

/* renamed from: com.ss.android.ttvecamera.h.a */
public final class C20227a extends C20148a {
    /* renamed from: l */
    public final Bundle mo42667l() {
        Bundle l = super.mo42667l();
        l.putBoolean("support_wide_angle", ((C20194i) this.f55507a).mo42769b().equals(this.f55520h.f55740v));
        l.putBoolean("support_anti_shake", true);
        return l;
    }

    /* renamed from: m */
    public final int mo42668m() throws Exception {
        int i;
        if (this.f55400w == null) {
            this.f55400w = (CameraManager) this.f55524l.getSystemService("camera");
            if (this.f55400w == null) {
                return -1;
            }
        }
        if (this.f55520h.f55734p == 0) {
            this.f55512f = new C20230c(this, this.f55524l, this.f55400w, this.f55523k);
        } else {
            this.f55512f = new C20228b(this, this.f55524l, this.f55400w, this.f55523k);
            this.f55512f.mo42750a(this.f55531s);
        }
        this.f55512f.f55484w = this.f55532t;
        this.f55520h.f55740v = this.f55512f.mo42677a(this.f55520h.f55723e);
        StringBuilder sb = new StringBuilder("_open:mCameraSettings.mStrCameraID ");
        sb.append(this.f55520h.f55740v);
        C20296p.m50059a("TEVivoCameraImp", sb.toString());
        if (this.f55520h.f55740v == null) {
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
        this.f55522j.mo42784b(1, 0, "TEVivoCamera2 features is ready");
        this.f55400w.openCamera(this.f55520h.f55740v, this.f55403z, this.f55523k);
        return 0;
    }

    /* renamed from: a */
    public final void mo42778a(C20204c cVar) {
        this.f55532t = cVar;
    }

    /* renamed from: d */
    public final void mo42666d(int i) {
        if (this.f55512f != null) {
            mo42670o();
            if (i == 0) {
                this.f55512f = new C20230c(this, this.f55524l, this.f55400w, this.f55523k);
            } else {
                this.f55512f = new C20228b(this, this.f55524l, this.f55400w, this.f55523k);
                this.f55512f.mo42750a(this.f55531s);
            }
            this.f55512f.f55484w = this.f55532t;
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

    public C20227a(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
