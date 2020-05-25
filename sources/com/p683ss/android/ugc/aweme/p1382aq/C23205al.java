package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.aq.al */
public final class C23205al extends C23241k<C23205al> {

    /* renamed from: e */
    public static final C23206a f61716e = new C23206a(null);

    /* renamed from: O */
    private String f61717O;

    /* renamed from: P */
    private int f61718P;

    /* renamed from: Q */
    private int f61719Q;

    /* renamed from: R */
    private String f61720R;

    /* renamed from: S */
    private String f61721S;

    /* renamed from: T */
    private String f61722T;

    /* renamed from: U */
    private String f61723U;

    /* renamed from: V */
    private String f61724V;

    /* renamed from: W */
    private int f61725W;

    /* renamed from: X */
    private String f61726X;

    /* renamed from: a */
    public String f61727a;

    /* renamed from: b */
    public String f61728b;

    /* renamed from: c */
    public String f61729c;

    /* renamed from: d */
    public final String f61730d;

    /* renamed from: com.ss.android.ugc.aweme.aq.al$a */
    public static final class C23206a {
        private C23206a() {
        }

        public /* synthetic */ C23206a(C52707g gVar) {
            this();
        }
    }

    public C23205al() {
        this(null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("rec_uid", this.f61727a, C23232a.f62005a);
        mo48072a("enter_from", this.f61985g, C23232a.f62005a);
        mo48072a("event_type", this.f61728b, C23232a.f62005a);
        mo48072a("req_id", this.f61717O, C23232a.f62005a);
        mo48072a("impr_order", String.valueOf(this.f61718P), C23232a.f62005a);
        mo48072a("feed_order", String.valueOf(this.f61719Q), C23232a.f62005a);
        mo48072a("rec_reason", this.f61720R, C23232a.f62005a);
        mo48072a("page_status", this.f61723U, C23232a.f62005a);
        mo48072a("scene_id", this.f61724V, C23232a.f62005a);
        mo48072a("card_type", this.f61722T, C23232a.f62005a);
        mo48072a("group_id", this.f61726X, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61729c)) {
            mo48069a("enter_method", this.f61729c);
        }
        if (this.f61725W != -1) {
            mo48069a("sub_order", String.valueOf(this.f61725W));
        }
    }

    /* renamed from: a */
    public final C23205al mo47977a(int i) {
        this.f61718P = i;
        return this;
    }

    /* renamed from: f */
    public final C23205al mo47984f(String str) {
        this.f61722T = str;
        return this;
    }

    /* renamed from: h */
    public final C23205al mo47986h(String str) {
        this.f61724V = str;
        return this;
    }

    /* renamed from: a */
    public final C23205al mo47979a(String str) {
        if (str == null) {
            str = "";
        }
        this.f61727a = str;
        return this;
    }

    /* renamed from: b */
    public final C23205al mo47980b(String str) {
        if (str == null) {
            str = "";
        }
        this.f61985g = str;
        return this;
    }

    /* renamed from: c */
    public final C23205al mo47981c(String str) {
        if (str == null) {
            str = "";
        }
        this.f61728b = str;
        return this;
    }

    /* renamed from: d */
    public final C23205al mo47982d(String str) {
        if (str == null) {
            str = "";
        }
        this.f61717O = str;
        return this;
    }

    /* renamed from: e */
    public final C23205al mo47983e(String str) {
        if (str == null) {
            str = "";
        }
        this.f61720R = str;
        return this;
    }

    /* renamed from: g */
    public final C23205al mo47985g(String str) {
        if (str == null) {
            str = "";
        }
        this.f61723U = str;
        return this;
    }

    /* renamed from: a */
    public final C23205al mo47978a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        this.f61725W = i;
        return this;
    }

    private C23205al(String str) {
        C52711k.m112240b(str, "event");
        super(str);
        this.f61730d = str;
        this.f61727a = "";
        this.f61728b = "";
        this.f61717O = "";
        this.f61720R = "";
        this.f61721S = "";
        this.f61722T = "";
        this.f61723U = "";
        this.f61724V = "";
        this.f61725W = -1;
        this.f61726X = "";
        this.f61729c = "";
        this.f62001w = true;
    }

    public /* synthetic */ C23205al(String str, int i, C52707g gVar) {
        this("follow_card");
    }
}
