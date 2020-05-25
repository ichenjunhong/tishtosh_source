package com.p683ss.android.ugc.aweme.commercialize.api;

import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.c */
final /* synthetic */ class C25644c implements C0011g {

    /* renamed from: a */
    static final C0011g f67868a = new C25644c();

    private C25644c() {
    }

    public final Object then(C0013i iVar) {
        if (!iVar.mo31c()) {
            if (!iVar.mo33d()) {
                Map<String, C26138s> map = ((C25646e) iVar.mo34e()).f67869a;
                for (String str : map.keySet()) {
                    C26138s sVar = (C26138s) map.get(str);
                    if (sVar != null) {
                        sVar.setLinkType(1);
                        if (C23324d.m57378a().getRawAdAwemeById(str) != null) {
                            Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str);
                            if (C26428bm.m63902a(rawAdAwemeById) == null || C26428bm.m63902a(rawAdAwemeById).getLinkType() == 1) {
                                C26428bm.m63903a(rawAdAwemeById, sVar);
                                C23324d.m57378a().updateRawAdAweme(rawAdAwemeById);
                            }
                        } else if (C23324d.m57378a().getAwemeById(str) != null) {
                            Aweme awemeById = C23324d.m57378a().getAwemeById(str);
                            if (C26428bm.m63902a(awemeById) == null || C26428bm.m63902a(awemeById).getLinkType() == 1) {
                                C26428bm.m63903a(awemeById, sVar);
                                C23324d.m57378a().updateAweme(awemeById);
                            }
                        } else {
                            C26428bm.f69676a.put(str, sVar);
                        }
                        C52711k.m112240b(str, "groupId");
                        if (sVar != null) {
                            C26072c.f68845b.mo53560a("link", "preload_result", sVar.creativeId, sVar.logExtra, str, 0);
                        }
                    }
                }
            } else {
                throw iVar.mo35f();
            }
        }
        return null;
    }
}
