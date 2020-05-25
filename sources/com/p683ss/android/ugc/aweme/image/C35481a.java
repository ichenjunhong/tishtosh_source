package com.p683ss.android.ugc.aweme.image;

import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.lighten.p766a.p769c.C12177l;
import com.facebook.net.C14551d;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.image.a */
public abstract class C35481a implements C12177l {

    /* renamed from: a */
    protected Executor f91204a;

    /* renamed from: b */
    public C35498j f91205b;

    /* renamed from: c */
    public C14551d f91206c;

    /* renamed from: d */
    protected C35499k f91207d;

    public C35481a() {
        this(new C9919a());
        this.f91207d = new C35499k();
    }

    private C35481a(Executor executor) {
        this.f91204a = executor;
    }

    /* renamed from: a */
    protected static String m80195a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
