package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.t */
public final class C31211t implements C41683a {
    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        if (cVar.f105477T != null) {
            String str = "";
            int size = cVar.f105477T.size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                Object obj = cVar.f105477T.get(i);
                C52711k.m112236a(obj, "settings.selectedContentLanguage[i]");
                sb.append(((C41684a) obj).getLanguageCode());
                sb.append(",");
                str = sb.toString();
            }
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf userAddLanguages = inst.getUserAddLanguages();
            C52711k.m112236a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
            userAddLanguages.mo47776a(str);
        }
    }
}
