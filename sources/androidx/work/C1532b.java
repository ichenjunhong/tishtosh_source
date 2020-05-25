package androidx.work;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.b */
public final class C1532b {

    /* renamed from: a */
    public final Executor f5506a;

    /* renamed from: b */
    public final C1659k f5507b;

    /* renamed from: c */
    public final int f5508c;

    /* renamed from: d */
    public final int f5509d;

    /* renamed from: e */
    public final int f5510e;

    /* renamed from: f */
    private final int f5511f;

    /* renamed from: androidx.work.b$a */
    public static final class C1533a {

        /* renamed from: a */
        Executor f5512a;

        /* renamed from: b */
        C1659k f5513b;

        /* renamed from: c */
        int f5514c = 4;

        /* renamed from: d */
        int f5515d;

        /* renamed from: e */
        int f5516e = Integer.MAX_VALUE;

        /* renamed from: f */
        int f5517f = 20;

        /* renamed from: a */
        public final C1532b mo5911a() {
            return new C1532b(this);
        }
    }

    /* renamed from: a */
    public final int mo5910a() {
        if (VERSION.SDK_INT == 23) {
            return this.f5511f / 2;
        }
        return this.f5511f;
    }

    C1532b(C1533a aVar) {
        if (aVar.f5512a == null) {
            this.f5506a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4))).mo49847a());
        } else {
            this.f5506a = aVar.f5512a;
        }
        if (aVar.f5513b == null) {
            this.f5507b = new C1659k() {
            };
        } else {
            this.f5507b = aVar.f5513b;
        }
        this.f5508c = aVar.f5514c;
        this.f5509d = aVar.f5515d;
        this.f5510e = aVar.f5516e;
        this.f5511f = aVar.f5517f;
    }
}
