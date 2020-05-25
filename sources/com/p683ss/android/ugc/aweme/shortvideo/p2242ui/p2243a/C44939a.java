package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2243a;

import android.content.Context;
import com.p683ss.android.ugc.asve.p1241e.C20391c.C20392a;
import com.p683ss.android.ugc.asve.sandbox.C20652b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.a */
public final class C44939a {

    /* renamed from: a */
    public static final C44939a f113832a = new C44939a();

    private C44939a() {
    }

    /* renamed from: a */
    public static boolean m98279a(Context context) {
        C52711k.m112240b(context, "context");
        if (C20392a.m50597a(context).mo43226d()) {
            return true;
        }
        if (!C39618d.f101152P.mo83103a(C40790a.EnableASVESandBox) || !C20652b.f56510g.mo43786a(context)) {
            return false;
        }
        return true;
    }
}
