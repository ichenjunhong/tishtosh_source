package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.t */
public final class C42293t extends C42316d {

    /* renamed from: b */
    public static final C42294a f106846b = new C42294a(null);

    /* renamed from: a */
    public final String f106847a;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.t$a */
    public static final class C42294a {
        private C42294a() {
        }

        public /* synthetic */ C42294a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.ao_;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "more";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return this.f106847a;
    }

    /* renamed from: d */
    public final String mo86230d() {
        return null;
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.au1;
    }

    public C42293t(String str) {
        C52711k.m112240b(str, "label");
        this.f106847a = str;
    }

    /* renamed from: a */
    public final boolean mo86229a(Context context, Intent intent) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        Intent createChooser = Intent.createChooser(intent, "");
        C52711k.m112236a((Object) createChooser, "Intent.createChooser(intent, \"\")");
        return super.mo86229a(context, createChooser);
    }
}
