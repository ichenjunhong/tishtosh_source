package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.C6948i;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.widget.LiveTabIndicator;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.i.ak */
public final class C6970ak extends C3923a<FeedItem> {

    /* renamed from: b */
    final C6926k f19058b;

    /* renamed from: c */
    LiveTabIndicator f19059c;

    /* renamed from: b */
    public final boolean mo9281b() {
        return true;
    }

    public C6970ak(View view, C6926k kVar) {
        super(view);
        this.f19059c = (LiveTabIndicator) view.findViewById(R.id.cwu);
        this.f19058b = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        C6948i iVar = (C6948i) ((FeedItem) obj).item;
        this.f19059c.setTitles(iVar.f19023a);
        this.f19059c.setOnTabClickListener(new C6971al(this));
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "show");
        for (C6945f fVar : iVar.f19023a) {
            if (fVar.f19020l) {
                this.f19059c.mo13284a(fVar);
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
