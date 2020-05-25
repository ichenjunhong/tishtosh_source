package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.l */
public final class C33121l {

    /* renamed from: a */
    public static final C33121l f85962a = new C33121l();

    private C33121l() {
    }

    /* renamed from: a */
    private static Keva m76124a() {
        Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), "InitialChooseLanguagePreferences", 0);
        C52711k.m112236a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final int m76123a(int i) {
        return m76124a().getInt("languageDialogShowState", 0);
    }

    /* renamed from: b */
    public static final void m76125b(int i) {
        m76124a().storeInt("languageDialogShowState", i);
    }
}
