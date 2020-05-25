package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.a */
public abstract class C26333a implements C26334b {

    /* renamed from: e */
    public Context f69517e;

    /* renamed from: f */
    public C26325a f69518f;

    /* renamed from: a */
    public void mo54081a(boolean z, C26325a aVar) {
        C52711k.m112240b(aVar, "params");
    }

    /* renamed from: c */
    public final Context mo54082c() {
        Context context = this.f69517e;
        if (context == null) {
            C52711k.m112237a("context");
        }
        return context;
    }

    /* renamed from: d */
    public final C26325a mo54083d() {
        C26325a aVar = this.f69518f;
        if (aVar == null) {
            C52711k.m112237a("params");
        }
        return aVar;
    }

    /* renamed from: a */
    public static boolean m63755a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            return false;
        }
    }
}
