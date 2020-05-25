package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.view.View;
import com.p683ss.android.ugc.aweme.router.C41302w.C41309b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.router.s */
public final class C41298s implements C41288m {

    /* renamed from: a */
    private final C41309b f104740a;

    public C41298s(C41309b bVar) {
        C52711k.m112240b(bVar, "routerOpen");
        this.f104740a = bVar;
    }

    /* renamed from: b */
    private final String m91029b(String str) {
        if (str == null) {
            return null;
        }
        return this.f104740a.mo47844a(str);
    }

    /* renamed from: a */
    public final boolean mo47182a(String str) {
        boolean z;
        String b = m91029b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C41302w.m91042a().mo83861a(b);
    }

    /* renamed from: a */
    public final boolean mo47180a(Activity activity, String str) {
        boolean z;
        String b = m91029b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C41302w.m91042a().mo83858a(activity, b);
    }

    /* renamed from: a */
    public final boolean mo47181a(Activity activity, String str, View view) {
        boolean z;
        String b = m91029b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C41302w.m91042a().mo83860a(activity, b, view);
    }
}
