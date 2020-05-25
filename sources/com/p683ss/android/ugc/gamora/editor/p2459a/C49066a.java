package com.p683ss.android.ugc.gamora.editor.p2459a;

import android.app.Activity;
import android.content.res.Resources;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.a.a */
public final class C49066a {

    /* renamed from: a */
    public static final C49066a f123312a = new C49066a();

    private C49066a() {
    }

    /* renamed from: a */
    public static final boolean m105887a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        Resources resources = activity.getResources();
        C52711k.m112236a((Object) resources, "activity.resources");
        if (resources.getDisplayMetrics().density <= 1.5f) {
            return true;
        }
        return false;
    }
}
