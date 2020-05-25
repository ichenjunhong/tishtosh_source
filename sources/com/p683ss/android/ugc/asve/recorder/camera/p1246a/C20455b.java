package com.p683ss.android.ugc.asve.recorder.camera.p1246a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.b */
public final class C20455b {

    /* renamed from: c */
    public static boolean f56085c;

    /* renamed from: d */
    public static boolean f56086d;

    /* renamed from: a */
    public int f56087a = -1;

    /* renamed from: b */
    public boolean f56088b;

    /* renamed from: e */
    public Context f56089e;

    /* renamed from: f */
    public int f56090f;

    /* renamed from: g */
    public C20457b f56091g;

    /* renamed from: a */
    public boolean mo43400a() {
        if (this.f56090f == 1 || this.f56090f == 2 || this.f56090f == 3 || this.f56090f == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m50913a(int i) {
        if (i == -1) {
            return C20454a.m50912a(Build.MODEL);
        }
        return i;
    }

    /* renamed from: b */
    public final void mo43401b(Context context) {
        this.f56088b = true;
        if (f56085c != f56086d) {
            mo43399a(f56086d);
        }
    }

    /* renamed from: a */
    public final void mo43398a(Context context) {
        this.f56088b = false;
        if (f56085c) {
            mo43399a(false);
        }
    }

    /* renamed from: a */
    public void mo43399a(final boolean z) {
        if (this.f56088b && mo43400a() && VERSION.SDK_INT >= 23) {
            this.f56091g.mo43363c(z);
            this.f56091g.mo43341a(this.f56091g.mo43365d(), (C19263c) new C19263c() {
                /* renamed from: a */
                public final void mo39670a(int i) {
                    String str;
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str = "on ";
                    } else {
                        str = "off";
                    }
                    sb.append(str);
                    sb.append(", camera open success: Camera id:");
                    sb.append(C20455b.this.f56091g.mo43365d());
                    sb.append(", camera type");
                    sb.append(i);
                    C20455b.f56085c = z;
                }

                /* renamed from: a */
                public final void mo39671a(int i, int i2, String str) {
                    String str2;
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str2 = "on ";
                    } else {
                        str2 = "off";
                    }
                    sb.append(str2);
                    sb.append(", camera open fail: Camera id:");
                    sb.append(C20455b.this.f56091g.mo43365d());
                    sb.append(", camera type");
                    sb.append(i);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m50914a(Context context, int i) {
        if (C20391c.m50589a(context).f55919a.getInt("key_camera_shake_mode", 0) != 0) {
            return f56086d;
        }
        switch (m50913a(i)) {
        }
        C20391c.m50589a(context).mo43224b(2);
        f56085c = false;
        f56086d = false;
        return false;
    }

    public C20455b(Context context, C20457b bVar, int i) {
        this.f56087a = i;
        this.f56090f = m50913a(this.f56087a);
        this.f56089e = context;
        this.f56088b = true;
        this.f56091g = bVar;
    }
}
