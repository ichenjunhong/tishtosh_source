package com.p683ss.android.ugc.aweme.commercialize.api;

import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.d */
public final class C25645d implements C25643b {
    /* renamed from: a */
    public final void mo52800a(String str, List<Aweme> list) {
        List<Aweme> list2 = list;
        if (list2 != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme = (Aweme) list2.get(i);
                if (aweme != null) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(aweme.getAid());
                    if (aweme.needPreloadAdLink()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(aweme.getAid());
                        C26072c cVar = C26072c.f68845b;
                        String aid = aweme.getAid();
                        C52711k.m112240b(aid, "groupId");
                        C26072c cVar2 = cVar;
                        String str2 = aid;
                        cVar2.mo53560a("link", "data_received", "-1", "", str2, -1);
                        cVar2.mo53560a("link", "preload_start", "-1", "", str2, -1);
                    }
                }
            }
            if (sb.length() > 0) {
                String sb3 = sb.toString();
                if (!(str == null || str.length() == 0 || sb3 == null || sb3.length() == 0)) {
                    LinkDataApi.f67866b.requestLinkData(str, sb3, null, null, null, null).mo19a(C25644c.f67868a);
                }
            }
            LinkDataApi.f67867c = sb2.toString();
        }
    }
}
