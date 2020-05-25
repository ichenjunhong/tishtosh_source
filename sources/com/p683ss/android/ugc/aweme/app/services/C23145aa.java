package com.p683ss.android.ugc.aweme.app.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.login.C27966g;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import java.util.LinkedList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.aa */
public final class C23145aa implements C36699t {
    /* renamed from: d */
    public static C36699t m56732d() {
        if (C27991b.f73513i == null) {
            synchronized (C36699t.class) {
                if (C27991b.f73513i == null) {
                    C27991b.f73513i = C27613b.m66291d();
                }
            }
        }
        return (C36699t) C27991b.f73513i;
    }

    /* renamed from: b */
    public final String mo47865b() {
        String e = C35837h.m80980e();
        C52711k.m112236a((Object) e, "RegionHelper.getRegion()");
        return e;
    }

    /* renamed from: c */
    public final String mo47866c() {
        String f = C35837h.m80981f();
        if (f == null) {
            return " ";
        }
        return f;
    }

    /* renamed from: a */
    public final List<String> mo47864a() {
        LinkedList linkedList = new LinkedList();
        C35834e currentI18nItem = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(AwemeApplication.m56199a());
        C52711k.m112236a((Object) currentI18nItem, "ServiceManager.get().get…ication.getApplication())");
        for (C27966g name : currentI18nItem.mo70125e()) {
            linkedList.add(name.name());
        }
        return linkedList;
    }
}
