package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.p683ss.android.ugc.aweme.push.C40906h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.aq.ao */
public final class C23209ao extends C23231d {

    /* renamed from: A */
    private String f61756A;

    /* renamed from: B */
    private String f61757B;

    /* renamed from: C */
    private String f61758C;

    /* renamed from: D */
    private String f61759D;

    /* renamed from: E */
    private String f61760E;

    /* renamed from: F */
    private int f61761F;

    /* renamed from: G */
    private String f61762G;

    /* renamed from: H */
    private String f61763H;

    /* renamed from: I */
    private String f61764I;

    /* renamed from: J */
    private String f61765J;

    /* renamed from: K */
    private String f61766K;

    /* renamed from: a */
    public String f61767a;

    /* renamed from: b */
    public String f61768b;

    /* renamed from: c */
    public String f61769c;

    /* renamed from: d */
    public boolean f61770d;

    /* renamed from: e */
    public String f61771e;

    public C23209ao() {
        super("shoot");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("shoot_way", this.f61756A, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61771e)) {
            mo48069a("enter_from", this.f61771e);
        }
        if (!TextUtils.isEmpty(this.f61757B)) {
            mo48072a("music_id", this.f61757B, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61768b)) {
            mo48072a("group_id", this.f61768b, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61767a)) {
            mo48072a("poi_id", this.f61767a, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61758C)) {
            mo48072a("tag_id", this.f61758C, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61762G)) {
            mo48072a("sticker_id", this.f61762G, C23232a.f62006b);
        }
        mo48072a("content_type", this.f61759D, C23232a.f62005a);
        mo48072a("content_cnt", String.valueOf(this.f61761F), C23232a.f62005a);
        mo48072a("creation_id", this.f61763H, C23232a.f62005a);
        mo48072a("content_source", this.f61760E, C23232a.f62005a);
        if (this.f61770d) {
            mo48072a("log_pb", this.f61769c, C23232a.f62005a);
        }
        if (C40906h.m90485a().mo83391b(this.f61768b)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61764I)) {
            mo48069a("coupon_code", this.f61764I);
        }
        if (!TextUtils.isEmpty(this.f61765J)) {
            mo48069a("supplier_id", this.f61765J);
        }
        if (!TextUtils.isEmpty(this.f61766K)) {
            mo48069a("order_id", this.f61766K);
        }
        C39454n nVar = C39454n.f100872a;
        String str = "shoot";
        String str2 = "";
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "arg");
        C39454n.m87738a().trackAppsFlyerEvent(str, str2);
    }

    /* renamed from: a */
    public final C23209ao mo47992a(int i) {
        this.f61761F = 1;
        return this;
    }

    /* renamed from: b */
    public final C23209ao mo47994b(String str) {
        this.f61759D = str;
        return this;
    }

    /* renamed from: c */
    public final C23209ao mo47995c(String str) {
        this.f61760E = str;
        return this;
    }

    /* renamed from: d */
    public final C23209ao mo47996d(String str) {
        this.f61763H = str;
        return this;
    }

    /* renamed from: a */
    public final C23209ao mo47993a(String str) {
        this.f61756A = str;
        return this;
    }
}
