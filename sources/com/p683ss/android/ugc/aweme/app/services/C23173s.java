package com.p683ss.android.ugc.aweme.app.services;

import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.s */
public final class C23173s implements C36692m {
    /* renamed from: a */
    public final String mo47886a() {
        String b = C33106b.m76108b();
        C52711k.m112236a((Object) b, "LanguageHelper.getAppLocale()");
        return b;
    }

    /* renamed from: b */
    public final String mo47887b() {
        C33098b a = C33098b.m76080a();
        C52711k.m112236a((Object) a, "I18nManager.get()");
        String b = a.mo70131b();
        C52711k.m112236a((Object) b, "I18nManager.get().appLanguage");
        return b;
    }
}
