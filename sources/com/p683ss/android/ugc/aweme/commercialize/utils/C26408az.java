package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.az */
public final class C26408az {

    /* renamed from: a */
    public static final LinkedHashMap<Integer, C26116c> f69657a = new LinkedHashMap<>();

    /* renamed from: b */
    public static final C26408az f69658b = new C26408az();

    private C26408az() {
    }

    /* renamed from: a */
    public static C26116c m63874a() {
        if (!f69657a.isEmpty()) {
            return (C26116c) f69657a.values().iterator().next();
        }
        return null;
    }
}
