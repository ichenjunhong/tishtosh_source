package com.bytedance.android.livesdk.feed.p341i;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.i.ag */
public final class C6966ag extends C6983l {

    /* renamed from: b */
    public static int f19055b = -1;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo13075e() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13073a(FeedItem feedItem) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_big_picture");
        String str = this.f19040e.f18991b;
        if (str.contains(CustomActionPushReceiver.f104061f) && C6926k.f18950l != null) {
            this.f19043h = C6926k.f18950l;
            str = C6926k.f18950l.f19016h;
            TextUtils.isEmpty(str);
        }
        bundle2.putString("subtab", str);
        bundle.putString("source", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.f19043h.f19017i);
        bundle.putString("enter_from", CustomActionPushReceiver.f104061f);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        mo13069a(feedItem, true, "big_picture", bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13074a(FeedItem feedItem, Room room, int i) {
        super.mo13074a(feedItem, room, i);
        if (!TextUtils.isEmpty(room.getDistanceCity())) {
            this.f19080q.setText(room.getDistanceCity());
        } else if (!TextUtils.isEmpty(room.getDistance())) {
            this.f19080q.setText(room.getDistance());
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_page", "city");
            hashMap.put("event_type", "show");
            C7007b.m14648a("boost_info_show", (Map<String, String>) hashMap);
        }
        if (f19055b <= 0) {
            f19055b = C9432q.m18670a(this.f19075l.getContext());
        }
        HSImageView hSImageView = this.f19075l;
        int i2 = f19055b;
        hSImageView.setLayoutParams(new LayoutParams(i2, i2));
    }

    public C6966ag(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        super(view, aVar, iVar, feedDataKey, mVar, gVar, bVar, bVar2, bVar3, bVar4);
    }
}
