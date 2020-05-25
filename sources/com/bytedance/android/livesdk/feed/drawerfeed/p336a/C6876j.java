package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.livesdk.feed.drawerfeed.C6890l;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.C6948i;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.j */
public final class C6876j extends C3923a<FeedItem> {

    /* renamed from: b */
    final C6890l f18832b;

    /* renamed from: c */
    LiveTabIndicator f18833c;

    /* renamed from: b */
    public final boolean mo9281b() {
        return true;
    }

    public C6876j(View view, C6890l lVar) {
        super(view);
        this.f18833c = (LiveTabIndicator) view.findViewById(R.id.cwu);
        this.f18832b = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        C6948i iVar = (C6948i) ((FeedItem) obj).item;
        this.f18833c.setTitles(iVar.f19023a);
        this.f18833c.setOnTabClickListener(new C6877k(this));
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "show");
        for (C6945f fVar : iVar.f19023a) {
            if (fVar.f19020l) {
                this.f18833c.mo13284a(fVar);
                String str = fVar.f19016h;
                if (str != null) {
                    StringBuilder sb = new StringBuilder("live_");
                    sb.append(str);
                    hashMap.put("enter_from_merge", sb.toString());
                }
            }
        }
        C7007b.m14648a("subtab_show", (Map<String, String>) hashMap);
    }
}
