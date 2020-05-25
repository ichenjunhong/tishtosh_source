package com.bytedance.android.livesdk.feed.p341i;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p340h.C6956c;
import com.bytedance.android.livesdkapi.depend.live.C8670t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8759i;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.feed.i.r */
final /* synthetic */ class C6995r implements OnClickListener {

    /* renamed from: a */
    private final C6992b f19111a;

    /* renamed from: b */
    private final FeedItem f19112b;

    C6995r(C6992b bVar, FeedItem feedItem) {
        this.f19111a = bVar;
        this.f19112b = feedItem;
    }

    public final void onClick(View view) {
        C6992b bVar = this.f19111a;
        FeedItem feedItem = this.f19112b;
        if (!C6996s.m14626a(C6989p.this.f19100d)) {
            C4204a.m10421a(C6989p.this.f19100d, (int) R.string.eas);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (FeedItem feedItem2 : C6989p.this.f19099c) {
            if (feedItem2.item instanceof Room) {
                Room room = (Room) feedItem2.item;
                room.setRequestId(feedItem2.requestId());
                room.setLog_pb(feedItem2.logPb());
                arrayList.add(room);
            }
        }
        int max = Math.max(arrayList.indexOf(feedItem.item), 0);
        C8759i.m17243b().mo15418a(new C6956c(arrayList));
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", CustomActionPushReceiver.f104061f);
        bundle.putString("source", "");
        bundle.putLong("live.intent.extra.USER_FROM", 2);
        bundle.putString("request_id", ((Room) arrayList.get(max)).getRequestId());
        bundle.putString("log_pb", ((Room) arrayList.get(max)).getLog_pb());
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "follow_live");
        Bundle a = C8670t.m17142a(C6989p.this.f19100d, max, CustomActionPushReceiver.f104061f, null, 2, false, bundle);
        if (a.get("live.intent.extra.USER_ID") == null) {
            a.putString("live.intent.extra.USER_ID", String.valueOf(((Room) arrayList.get(max)).getOwnerUserId()));
        }
        C6856b.m14400c().mo13048j().mo15568a(C6989p.this.f19100d, ((Room) arrayList.get(max)).getId(), a);
    }
}
