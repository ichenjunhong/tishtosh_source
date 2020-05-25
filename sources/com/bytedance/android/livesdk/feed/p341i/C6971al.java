package com.bytedance.android.livesdk.feed.p341i;

import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator.C7164a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.i.al */
final /* synthetic */ class C6971al implements C7164a {

    /* renamed from: a */
    private final C6970ak f19060a;

    C6971al(C6970ak akVar) {
        this.f19060a = akVar;
    }

    /* renamed from: a */
    public final void mo13070a(C6945f fVar) {
        C6970ak akVar = this.f19060a;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "click");
        StringBuilder sb = new StringBuilder("live_");
        sb.append(fVar.f19016h);
        hashMap.put("event_module", sb.toString());
        C7007b.m14648a("subtab_click", (Map<String, String>) hashMap);
        akVar.f19058b.mo13120a(fVar);
    }
}
