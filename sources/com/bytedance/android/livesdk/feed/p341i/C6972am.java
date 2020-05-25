package com.bytedance.android.livesdk.feed.p341i;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.i.am */
public final class C6972am extends C6983l {

    /* renamed from: b */
    public static int f19061b = -1;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo13075e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13071a(ImageModel imageModel) {
        if (imageModel == null) {
            m14599a(0, 0);
        } else {
            m14599a(imageModel.width, imageModel.height);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13073a(FeedItem feedItem) {
        Bundle bundle = new Bundle();
        String str = this.f19040e.f18991b;
        if (str.contains(CustomActionPushReceiver.f104061f) && C6926k.f18950l != null) {
            this.f19043h = C6926k.f18950l;
            str = C6926k.f18950l.f19016h;
            TextUtils.isEmpty(str);
        }
        bundle.putString("source", str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_small_picture");
        bundle2.putString("subtab", str);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putString("enter_from", CustomActionPushReceiver.f104061f);
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.f19043h.f19017i);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        mo13069a(feedItem, true, "small_picture", bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13072a(ImageModel imageModel, Room room) {
        m14599a(imageModel.getWidth(), imageModel.getHeight());
        super.mo13072a(imageModel, room);
        if (C6828b.f18714c) {
            m14607a((View) this.f19080q, 8);
            m14607a(this.f19079p, 8);
        }
    }

    /* renamed from: a */
    private void m14599a(int i, int i2) {
        int i3;
        if (f19061b <= 0) {
            f19061b = (C9432q.m18670a(this.itemView.getContext()) - 3) / 2;
        }
        if (i <= 0 || i2 <= 0) {
            i3 = f19061b;
        } else {
            i3 = (f19061b * i2) / i;
        }
        LayoutParams layoutParams = this.f19075l.getLayoutParams();
        if (layoutParams.width != f19061b || layoutParams.height != i3) {
            layoutParams.width = f19061b;
            layoutParams.height = i3;
            this.f19075l.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13074a(FeedItem feedItem, Room room, int i) {
        super.mo13074a(feedItem, room, i);
        m14607a(this.f19079p, 8);
    }

    public C6972am(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        super(view, aVar, iVar, feedDataKey, mVar, gVar, bVar, bVar2, bVar3, bVar4);
    }
}
