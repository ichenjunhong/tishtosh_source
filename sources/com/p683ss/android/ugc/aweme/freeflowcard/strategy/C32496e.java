package com.p683ss.android.ugc.aweme.freeflowcard.strategy;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.strategy.e */
public final class C32496e implements C32495d {

    /* renamed from: a */
    public static final C32496e f84592a;

    /* renamed from: b */
    private static final String f84593b = f84593b;

    /* renamed from: c */
    private static volatile boolean f84594c;

    /* renamed from: d */
    private static volatile boolean f84595d;

    private C32496e() {
    }

    /* renamed from: b */
    public final boolean mo65808b() {
        return m75244a();
    }

    static {
        C32496e eVar = new C32496e();
        f84592a = eVar;
        C47718bf.m103290c(eVar);
    }

    /* renamed from: a */
    private static boolean m75244a() {
        C23718g b = C23718g.m58207b();
        C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
        if (b.mo49153d()) {
            C23718g b2 = C23718g.m58207b();
            C52711k.m112236a((Object) b2, "NetworkStateManager.getInstance()");
            if (!b2.mo49152c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m75245b(boolean z) {
        f84595d = z;
    }

    @C53771m(mo112977c = 1)
    public final void onNetworkChanged(C26918a aVar) {
        C52711k.m112240b(aVar, "event");
        if (m75244a()) {
            f84594c = false;
        }
    }

    /* renamed from: a */
    public final boolean mo65807a(boolean z) {
        Context context;
        if (!f84594c && !C32492a.f84588b && !z && !f84595d) {
            f84594c = true;
            Activity g = C11016e.m22312g();
            if (g != null) {
                context = g;
            } else {
                context = C11010c.m22280a();
            }
            C10691a.m21548c(context, (int) R.string.c73).mo19066a();
            String str = f84593b;
            C23089d dVar = new C23089d();
            dVar.mo47829a("enter_from", C32492a.f84587a);
            C26890h.m65011a(str, dVar.f61491a);
            C52711k.m112240b("popups", "event");
        }
        return true;
    }
}
