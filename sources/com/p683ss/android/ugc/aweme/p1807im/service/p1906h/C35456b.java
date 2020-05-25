package com.p683ss.android.ugc.aweme.p1807im.service.p1906h;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.service.h.b */
public abstract class C35456b {

    /* renamed from: e */
    public String f91114e;

    /* renamed from: f */
    public Object f91115f;

    /* renamed from: g */
    public String f91116g;

    /* renamed from: h */
    public String f91117h;

    /* renamed from: i */
    public long f91118i;

    /* renamed from: j */
    public int f91119j;

    /* renamed from: k */
    public int f91120k;

    /* renamed from: l */
    public int f91121l;

    /* renamed from: m */
    public HashMap<String, String> f91122m;

    /* renamed from: n */
    public boolean f91123n;

    /* renamed from: o */
    public boolean f91124o;

    /* renamed from: p */
    public C35457c f91125p = mo72633a();

    /* renamed from: a */
    public abstract C35457c mo72633a();

    /* renamed from: b */
    public abstract int mo72634b();

    public abstract String bm_();

    public int bn_() {
        return 0;
    }

    /* renamed from: d */
    public abstract void mo72643d();

    public C35456b() {
        mo72643d();
    }

    /* renamed from: h */
    public final boolean mo73754h() {
        if (mo72634b() == 0 || mo72634b() == 20) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73752a(boolean z) {
        this.f91123n = z;
    }

    /* renamed from: a */
    public final void mo73751a(long j) {
        if (j < 10000000000L) {
            this.f91118i = j * 1000;
        } else {
            this.f91118i = j;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35456b) || !TextUtils.equals(this.f91114e, ((C35456b) obj).f91114e)) {
            return false;
        }
        return true;
    }
}
