package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25765a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25767b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25769c;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1559d.C25771a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25781b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.f */
public final class C25661f implements C25769c {
    /* renamed from: a */
    public final C25771a mo52806a() {
        return C25765a.f68132a;
    }

    /* renamed from: a */
    public final C25781b mo52807a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "materialUrl");
        return new C25767b(context, str);
    }

    /* renamed from: a */
    public final boolean mo52809a(Context context, String str, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "openUrl");
        return C26540w.m64226a(context, str, false);
    }

    /* renamed from: a */
    public final boolean mo52808a(Context context, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "webUrl");
        C52711k.m112240b(str2, "title");
        return C26540w.m64222a(context, str, str2);
    }
}
