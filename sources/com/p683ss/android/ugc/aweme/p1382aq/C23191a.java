package com.p683ss.android.ugc.aweme.p1382aq;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a;
import com.p683ss.android.ugc.aweme.p1382aq.C23191a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.aq.a */
public abstract class C23191a<E extends C23191a<E>> extends C23241k<E> {

    /* renamed from: a */
    public String f61656a;

    /* renamed from: b */
    public boolean f61657b;

    /* renamed from: c */
    public String f61658c;

    /* renamed from: d */
    public int f61659d = -1;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47945b() {
        super.mo47945b();
        String a = C23195ac.m56840a(this.f61985g, this.f61657b, this.f61658c);
        if (!TextUtils.isEmpty(this.f61656a)) {
            mo48072a("search_keyword", this.f61656a, C23232a.f62005a);
        }
        mo48072a("enter_method", a, C23232a.f62005a);
        if (this.f61659d != -1) {
            mo48072a("is_fullscreen", String.valueOf(this.f61659d), C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final E mo47941a(String str) {
        this.f61658c = str;
        return this;
    }

    /* renamed from: b */
    public final E mo47944b(boolean z) {
        this.f61659d = 0;
        return this;
    }

    public C23191a(String str) {
        C52711k.m112240b(str, "event");
        super(str);
    }

    /* renamed from: a */
    public final E mo47942a(boolean z) {
        this.f61657b = true;
        return this;
    }

    /* renamed from: b */
    public final E mo47943b(String str) {
        C52711k.m112240b(str, "rank");
        this.f62004z = str;
        return this;
    }

    /* renamed from: a */
    public final E mo47940a(Context context) {
        String str;
        String str2;
        if (context == null) {
            return this;
        }
        C30669b a = C30666a.m71942a(context);
        String str3 = null;
        if (a != null) {
            str = a.getSearchKeyword();
        } else {
            str = null;
        }
        this.f61656a = str;
        if (a != null) {
            str2 = a.getObjectId();
        } else {
            str2 = null;
        }
        this.f61998t = str2;
        if (a != null) {
            str3 = a.getCardType();
        }
        this.f61997s = str3;
        return this;
    }
}
