package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.h */
public final class C23238h extends C23241k<C23238h> {

    /* renamed from: O */
    private String f62013O;

    /* renamed from: P */
    private String f62014P;

    /* renamed from: Q */
    private String f62015Q;

    /* renamed from: R */
    private Aweme f62016R;

    /* renamed from: S */
    private String f62017S;

    /* renamed from: T */
    private String f62018T;

    /* renamed from: U */
    private String f62019U;

    /* renamed from: V */
    private String f62020V;

    /* renamed from: W */
    private String f62021W;

    /* renamed from: a */
    public int f62022a;

    /* renamed from: b */
    public String f62023b;

    /* renamed from: c */
    public int f62024c;

    /* renamed from: d */
    public String f62025d;

    /* renamed from: e */
    public String f62026e;

    public C23238h() {
        super("click_more_button");
        this.f62001w = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("group_id", this.f62013O, C23232a.f62006b);
        mo48072a("author_id", this.f62014P, C23232a.f62006b);
        if (this.f62016R != null) {
            mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f62016R, this.f62015Q));
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(C23198ae.m56857c(this.f62016R));
        }
        if (this.f62022a != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f62022a);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62018T)) {
            mo48072a(this.f62018T, this.f62019U, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62017S)) {
            mo48072a("playlist_type", this.f62017S, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62025d)) {
            mo48072a("log_pb", this.f62025d, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62023b)) {
            mo48072a("prop_id", this.f62023b, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62026e)) {
            mo48069a("enter_method", this.f62026e);
        }
        if (this.f62024c != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f62024c);
            mo48072a("scene_id", sb2.toString(), C23232a.f62005a);
        }
        mo48072a("previous_page", this.f62020V, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f62021W)) {
            mo48072a("impr_type", this.f62021W, C23232a.f62005a);
        }
        mo48069a("request_id", C23198ae.m56857c(this.f62016R));
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
    }

    /* renamed from: a */
    public final C23238h mo48083a(String str) {
        this.f62017S = str;
        return this;
    }

    /* renamed from: b */
    public final C23238h mo48084b(String str) {
        this.f62018T = str;
        return this;
    }

    /* renamed from: c */
    public final C23238h mo48085c(String str) {
        this.f62019U = str;
        return this;
    }

    /* renamed from: d */
    public final C23238h mo48086d(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: e */
    public final C23238h mo48088e(String str) {
        this.f62020V = str;
        return this;
    }

    /* renamed from: f */
    public final C23238h mo48089f(String str) {
        this.f62015Q = str;
        return this;
    }

    /* renamed from: g */
    public final C23238h mo48090g(String str) {
        this.f62013O = str;
        return this;
    }

    /* renamed from: h */
    public final C23238h mo48091h(String str) {
        this.f62014P = str;
        return this;
    }

    public C23238h(boolean z) {
        String str;
        if (z) {
            str = "click_share_button";
        } else {
            str = "click_more_button";
        }
        super(str);
        this.f62022a = 0;
        this.f62001w = true;
    }

    /* renamed from: e */
    public final C23238h mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62016R = aweme;
            this.f62013O = aweme.getAid();
            this.f62021W = C23198ae.m56883s(aweme);
        }
        return this;
    }
}
