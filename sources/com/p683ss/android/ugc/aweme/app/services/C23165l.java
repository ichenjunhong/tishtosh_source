package com.p683ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26140t;
import com.p683ss.android.ugc.aweme.commercialize.star.C26257b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.main.service.C36687h;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.l */
public final class C23165l implements C36687h {

    /* renamed from: com.ss.android.ugc.aweme.app.services.l$a */
    static class C23166a {

        /* renamed from: a */
        public static final C23165l f61581a = new C23165l();
    }

    /* renamed from: a */
    public static C23165l m56763a() {
        return C23166a.f61581a;
    }

    /* renamed from: c */
    public static C36687h m56764c() {
        if (C27991b.f73418B == null) {
            synchronized (C36687h.class) {
                if (C27991b.f73418B == null) {
                    C27991b.f73418B = C27613b.m66294g();
                }
            }
        }
        return (C36687h) C27991b.f73418B;
    }

    /* renamed from: b */
    public final boolean mo47881b() {
        return C26257b.m63630b();
    }

    /* renamed from: a */
    public final C26140t mo47878a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C26131l lVar = CommerceSettingsApi.f67857b;
        if (lVar != null) {
            C26140t[] tVarArr = lVar.f69008c;
            if (tVarArr != null) {
                for (C26140t tVar : tVarArr) {
                    if (C52711k.m112239a((Object) tVar.f69026a, (Object) str)) {
                        return tVar;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo47879a(Context context, String str, String str2) {
        return C26540w.m64222a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo47880a(Context context, String str, boolean z) {
        return C26540w.m64226a(context, str, false);
    }
}
