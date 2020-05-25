package com.p683ss.android.newmedia;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.p1195a.C19540c;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p683ss.android.ugc.aweme.web.C48380q;

/* renamed from: com.ss.android.newmedia.f */
public abstract class C19555f {

    /* renamed from: h */
    private static volatile AwemeAppData f53934h;

    /* renamed from: a */
    protected int f53935a = ((int) C11010c.m22287h());

    /* renamed from: b */
    protected final Context f53936b = C11010c.m22280a();

    /* renamed from: c */
    public long f53937c = -1;

    /* renamed from: d */
    public long f53938d = -1;

    /* renamed from: e */
    private final Object f53939e = new Object();

    /* renamed from: f */
    private int f53940f = 1;

    /* renamed from: g */
    private int f53941g = 2;

    /* renamed from: f */
    public C19767n mo40808f() {
        return C48380q.m104672e();
    }

    /* renamed from: d */
    public final boolean mo40806d() {
        synchronized (this.f53939e) {
            if (this.f53940f > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public final void mo40809g() {
        SplashAdManagerHolder.m99464b(this.f53936b).mo38109c();
    }

    /* renamed from: a */
    public static AwemeAppData m47851a() {
        if (f53934h == null) {
            synchronized (C19555f.class) {
                if (f53934h == null) {
                    f53934h = new AwemeAppData();
                }
            }
        }
        return f53934h;
    }

    /* renamed from: c */
    public final int mo40805c() {
        if (this.f53935a == -1 || this.f53935a == 0 || this.f53935a == 1) {
            this.f53935a = (int) C11010c.m22287h();
        }
        return this.f53935a;
    }

    /* renamed from: e */
    public final int mo40807e() {
        if (this.f53941g == 1 || this.f53941g == 0 || this.f53941g == 2) {
            return this.f53941g;
        }
        return 2;
    }

    protected C19555f() {
    }

    /* renamed from: b */
    public final String mo40804b() {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        String i = C11010c.m22288i();
        if (i == null) {
            i = "1.0";
        }
        sb.append(i);
        sb.append(" Build ");
        sb.append(C11010c.m22295p());
        sb.append("_");
        sb.append(C19540c.m47819a(this.f53936b).mo40795a("release_build", ""));
        return sb.toString();
    }
}
