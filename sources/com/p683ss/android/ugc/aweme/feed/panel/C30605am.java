package com.p683ss.android.ugc.aweme.feed.panel;

import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1149d.p1150a.C18964a;
import com.p683ss.android.ugc.aweme.video.C48021h;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.am */
final /* synthetic */ class C30605am implements C1710e {

    /* renamed from: a */
    private final C30604al f79911a;

    C30605am(C30604al alVar) {
        this.f79911a = alVar;
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        C30597ae aeVar = (C30597ae) this.f79911a.f79908a.get();
        if (aeVar != null) {
            C48021h ar = aeVar.mo62781ar();
            if (ar.mo95257o()) {
                StringBuilder sb = new StringBuilder("panel:");
                sb.append(aeVar);
                sb.append(",player:");
                sb.append(ar);
                sb.append(". is playing! should not be like this!");
                C32458a.m75141a(6, "PlayerManagerMonitor", sb.toString());
                C18964a.m46136a();
                C9951d.m19997a("aweme_player_monitor", new JSONObject());
            }
        }
    }
}
