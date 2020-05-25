package com.p683ss.android.ttvecamera.p1230e;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.p1226a.C20148a;
import com.p683ss.android.ttvecamera.p1228c.C20177b;
import com.p904e.p905a.C13456a;

/* renamed from: com.ss.android.ttvecamera.e.a */
public final class C20197a extends C20148a {
    /* renamed from: l */
    public final Bundle mo42667l() {
        boolean z;
        Bundle l = super.mo42667l();
        String str = "support_wide_angle";
        if (this.f55507a.mo42769b() == this.f55520h.f55740v) {
            z = true;
        } else {
            z = false;
        }
        l.putBoolean(str, z);
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
            this.f55512f = new C20199c(this, this.f55524l, this.f55400w, this.f55523k);
        } else {
            this.f55512f = new C20198b(this, this.f55524l, this.f55400w, this.f55523k);
        }
        this.f55520h.f55740v = this.f55512f.mo42677a(this.f55520h.f55723e);
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
        C13456a.m27123a(this.f55520h.f55723e, this.f55403z, this.f55523k, this.f55400w);
        return 0;
    }

    public C20197a(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
