package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator.C7164a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.k */
final /* synthetic */ class C6877k implements C7164a {

    /* renamed from: a */
    private final C6876j f18834a;

    C6877k(C6876j jVar) {
        this.f18834a = jVar;
    }

    /* renamed from: a */
    public final void mo13070a(C6945f fVar) {
        C6876j jVar = this.f18834a;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "click");
        StringBuilder sb = new StringBuilder("live_");
        sb.append(fVar.f19016h);
        hashMap.put("event_module", sb.toString());
        C7007b.m14648a("subtab_click", (Map<String, String>) hashMap);
        jVar.f18832b.mo13081a(fVar);
    }
}
