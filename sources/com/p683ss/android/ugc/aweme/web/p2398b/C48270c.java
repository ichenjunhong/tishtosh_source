package com.p683ss.android.ugc.aweme.web.p2398b;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.b.c */
public final class C48270c {

    /* renamed from: c */
    private static volatile C48270c f121475c;

    /* renamed from: a */
    public Map<String, String> f121476a;

    /* renamed from: b */
    public Context f121477b;

    private C48270c() {
    }

    /* renamed from: a */
    public static C48270c m104565a() {
        if (f121475c == null) {
            synchronized (C10749b.class) {
                if (f121475c == null) {
                    f121475c = new C48270c();
                }
            }
        }
        return f121475c;
    }
}
