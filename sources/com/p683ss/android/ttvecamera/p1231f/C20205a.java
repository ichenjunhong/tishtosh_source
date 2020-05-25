package com.p683ss.android.ttvecamera.p1231f;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1226a.C20148a;
import com.p683ss.android.ttvecamera.p1228c.C20177b;
import com.p683ss.android.ttvecamera.p1229d.C20188e;
import com.p907f.p908a.C13486b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttvecamera.f.a */
public final class C20205a extends C20148a {

    /* renamed from: A */
    boolean f55535A;

    /* renamed from: a */
    public final void mo42665a(Bundle bundle) {
    }

    /* renamed from: l */
    public final Bundle mo42667l() {
        Bundle l = super.mo42667l();
        this.f55535A = this.f55507a.mo42771a(this.f55520h.f55723e);
        l.putBoolean("support_anti_shake", this.f55535A);
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
            this.f55512f = new C20207c(this, this.f55524l, this.f55400w, this.f55523k);
        } else {
            this.f55512f = new C20206b(this, this.f55524l, this.f55400w, this.f55523k);
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
        mo42667l();
        this.f55522j.mo42784b(1, 0, "TEOppoCamera2 features is ready");
        this.f55400w.openCamera(this.f55520h.f55740v, this.f55403z, this.f55523k);
        return 0;
    }

    /* renamed from: d */
    public final void mo42666d(int i) {
        if (this.f55512f != null) {
            mo42670o();
            if (i == 0) {
                this.f55512f = new C20207c(this, this.f55524l, this.f55400w, this.f55523k);
                C20296p.m50062c("TEOppoCamera", "switch video mode");
            } else {
                this.f55512f = new C20206b(this, this.f55524l, this.f55400w, this.f55523k);
                C20296p.m50062c("TEOppoCamera", "switch image mode");
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

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo42787f(int i) {
        StringBuilder sb = new StringBuilder("updateAntiShake: ");
        sb.append(i);
        C20296p.m50061b("TEOppoCamera", sb.toString());
        int i2 = this.f55520h.f55728j.f55398a;
        int i3 = this.f55520h.f55728j.f55399b;
        String packageName = this.f55524l.getPackageName();
        Size size = new Size(i2, i3);
        String id = this.f55401x.getId();
        C13486b a = C13486b.m27243a();
        try {
            String b = a.mo25276b((String) C20188e.f55502d.get(packageName));
            if (b == null || b.isEmpty()) {
                C20296p.m50062c("TEOppoCamera", "oMediaVersion is null");
            } else {
                String b2 = a.mo25275b();
                if (b2 == null || !b2.contains(id)) {
                    C20296p.m50062c("TEOppoCamera", "omedia camList is null");
                    return;
                }
                String c = a.mo25277c(id);
                if (c == null || c.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder("omedia camera:");
                    sb2.append(id);
                    sb2.append("capability is null");
                    C20296p.m50062c("TEOppoCamera", sb2.toString());
                } else {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject(c);
                    String str = null;
                    if (1 == jSONObject2.optInt("EIS")) {
                        str = "EIS";
                        jSONObject.put(str, 1);
                    } else if (1 == jSONObject2.optInt("OIS-Movie")) {
                        str = "OIS-Movie";
                        jSONObject.put(str, 1);
                    }
                    boolean z = false;
                    if (!(c == null || str == null || str.isEmpty())) {
                        boolean a2 = C13486b.m27246a(c, str, new Size(size.getWidth(), size.getHeight()));
                        boolean a3 = C13486b.m27245a(c, str, i);
                        StringBuilder sb3 = new StringBuilder("w:");
                        sb3.append(size.getWidth());
                        sb3.append(" h:");
                        sb3.append(size.getHeight());
                        sb3.append("sizeCheck:");
                        sb3.append(a2);
                        sb3.append(" countCheck:");
                        sb3.append(a3);
                        C20296p.m50061b("TEOppoCamera", sb3.toString());
                        z = a2 & a3;
                    }
                    if (jSONObject.length() <= 0 || !z) {
                        StringBuilder sb4 = new StringBuilder("omedia update parm str is null ");
                        sb4.append(jSONObject);
                        sb4.append(" ");
                        sb4.append(z);
                        C20296p.m50062c("TEOppoCamera", sb4.toString());
                        return;
                    }
                    boolean a4 = a.mo25274a(jSONObject.toString());
                    StringBuilder sb5 = new StringBuilder("omedia set capability: ");
                    sb5.append(jSONObject.toString());
                    sb5.append(" setFeatureSuccess:");
                    sb5.append(a4);
                    C20296p.m50061b("TEOppoCamera", sb5.toString());
                }
            }
        } catch (RuntimeException unused) {
            C20296p.m50063d("TEOppoCamera", "omedia got a RuntimeException");
        } catch (JSONException unused2) {
            C20296p.m50062c("TEOppoCamera", "omedia got a json Exception");
        }
    }

    public C20205a(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
