package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.c */
public final /* synthetic */ class C24847c implements C0011g {

    /* renamed from: a */
    private final C24842a f65760a;

    /* renamed from: b */
    private final C17429o f65761b;

    public C24847c(C24842a aVar, C17429o oVar) {
        this.f65760a = aVar;
        this.f65761b = oVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65760a;
        C17429o oVar = this.f65761b;
        aVar.f65740c = false;
        if (!iVar.mo31c()) {
            long a = oVar.mo33754a(TimeUnit.MILLISECONDS);
            if (iVar.mo33d()) {
                aVar.f65739b.mo48228a("collection_feed_status", (Object) Integer.valueOf(1));
                aVar.f65742e.onEventV3("tool_performance_api", C23089d.m56640a().mo47829a("api_type", "music_list").mo47827a("duration", a).mo47829a("scene", "discover").mo47826a("status", 1).mo47829a("error_domain", TutorialVideoApiManager.f96873a).mo47829a("error_code", iVar.mo35f().getMessage()).f61491a);
            } else if (iVar.mo26b()) {
                C24862r rVar = (C24862r) iVar.mo34e();
                aVar.f65739b.mo48228a("collection_feed_cursor", (Object) Integer.valueOf(rVar.f65787b));
                aVar.f65739b.mo48228a("collection_feed_has_more", (Object) Integer.valueOf(rVar.f65788c));
                List list = (List) aVar.f65739b.mo48229a("list");
                if (list == null) {
                    aVar.f65739b.mo48228a("collection_feed_status", (Object) Integer.valueOf(1));
                } else {
                    for (C24861q qVar : ((C24862r) iVar.mo34e()).f65786a) {
                        list.add(new C24860p(C24964d.m60738a(qVar.f65785b), qVar.f65784a, 2));
                    }
                    aVar.f65739b.mo48228a("list", (Object) list);
                    aVar.f65739b.mo48228a("collection_feed_status", (Object) Integer.valueOf(0));
                    aVar.f65742e.onEventV3("tool_performance_api", C23089d.m56640a().mo47829a("api_type", "music_list").mo47827a("duration", a).mo47829a("scene", "discover").mo47826a("status", 0).f61491a);
                }
            }
        }
        return null;
    }
}
