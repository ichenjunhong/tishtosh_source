package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;

/* renamed from: com.ss.android.ugc.aweme.aq.y */
public final class C23255y extends C23231d {

    /* renamed from: A */
    private String f62157A;

    /* renamed from: a */
    public String f62158a;

    /* renamed from: b */
    private String f62159b;

    /* renamed from: c */
    private String f62160c;

    /* renamed from: d */
    private String f62161d;

    /* renamed from: e */
    private String f62162e;

    public C23255y() {
        super("launch_log");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("launch_method", this.f62159b, C23232a.f62005a);
        mo48072a("push_id", this.f62160c, C23232a.f62005a);
        mo48072a("enter_to", this.f62161d, C23232a.f62005a);
        mo48072a("red_badge_number", this.f62162e, C23232a.f62005a);
        mo48072a("is_cold_launch", this.f62157A, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f62158a)) {
            mo48072a("launch_from", this.f62158a, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23255y mo48177a(String str) {
        this.f62159b = str;
        return this;
    }

    /* renamed from: b */
    public final C23255y mo48178b(String str) {
        this.f62160c = str;
        return this;
    }

    /* renamed from: c */
    public final C23255y mo48179c(String str) {
        this.f62161d = str;
        return this;
    }

    /* renamed from: d */
    public final C23255y mo48180d(String str) {
        this.f62162e = str;
        return this;
    }

    /* renamed from: e */
    public final C23255y mo48181e(String str) {
        this.f62157A = str;
        return this;
    }
}
