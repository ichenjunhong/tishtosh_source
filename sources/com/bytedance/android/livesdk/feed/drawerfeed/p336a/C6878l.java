package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.drawerfeed.C6890l;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.l */
public final class C6878l extends C6875i {

    /* renamed from: b */
    public static int f18835b = -1;

    /* renamed from: x */
    private ViewGroup f18836x;

    /* renamed from: e */
    public final int mo13075e() {
        return 2;
    }

    /* renamed from: a */
    public final void mo13071a(ImageModel imageModel) {
        if (imageModel == null) {
            m14419a(0, 0);
        } else {
            m14419a(imageModel.width, imageModel.height);
        }
    }

    /* renamed from: a */
    public final void mo13073a(FeedItem feedItem) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        String str3 = this.f19040e.f18991b;
        if (str3.contains(CustomActionPushReceiver.f104061f) && C6890l.f18863l != null) {
            this.f19043h = C6890l.f18863l;
            str3 = C6890l.f18863l.f19016h;
        }
        bundle.putString("source", str3);
        Bundle bundle2 = new Bundle();
        bundle2.putString("live_source", "live_small_picture");
        bundle2.putString("subtab", str3);
        bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
        bundle.putString("log_pb", feedItem.logPb);
        bundle.putString("request_id", feedItem.resId);
        bundle.putString("enter_from", CustomActionPushReceiver.f104061f);
        bundle.putLong("live.intent.extra.USER_FROM", (long) this.f19043h.f19017i);
        bundle.putString("enter_from_merge", "live_merge");
        bundle.putString("enter_method", "live_cover");
        String str4 = "enter_from_merge";
        if (C8830k.m17330d() != null) {
            str = C8830k.m17330d().mo15060m().mo10870b();
        } else {
            str = null;
        }
        bundle.putString(str4, str);
        String str5 = "enter_method";
        if (TextUtils.equals("live_merge", C8830k.m17330d().mo15060m().mo10870b())) {
            str2 = "live_cover";
        } else {
            str2 = "drawer_cover";
        }
        bundle.putString(str5, str2);
        if (feedItem.isRecommendCard) {
            bundle.putString("enter_from_merge_recommend", "pop_card");
        }
        mo13069a(feedItem, false, "small_picture", bundle);
    }

    /* renamed from: a */
    public final void mo13072a(ImageModel imageModel, Room room) {
        m14419a(imageModel.getWidth(), imageModel.getHeight());
        super.mo13072a(imageModel, room);
        if (C6828b.f18714c) {
            m14607a((View) this.f19080q, 8);
            m14607a(this.f19079p, 8);
        }
    }

    /* renamed from: a */
    private void m14419a(int i, int i2) {
        int i3;
        if (f18835b <= 0) {
            f18835b = (this.f18836x.getMeasuredWidth() - 3) / 2;
        }
        if (i <= 0 || i2 <= 0) {
            i3 = f18835b;
        } else {
            i3 = (f18835b * i2) / i;
        }
        LayoutParams layoutParams = this.f19075l.getLayoutParams();
        if (layoutParams.width != f18835b || layoutParams.height != i3) {
            layoutParams.width = f18835b;
            layoutParams.height = i3;
            this.f19075l.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo13074a(FeedItem feedItem, Room room, int i) {
        super.mo13074a(feedItem, room, i);
        m14607a(this.f19079p, 8);
    }

    public C6878l(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4, ViewGroup viewGroup) {
        super(view, aVar, iVar, feedDataKey, mVar, gVar, bVar, bVar2, bVar3, bVar4);
        this.f18836x = viewGroup;
        if (feedDataKey.f18991b.equals(CustomActionPushReceiver.f104061f)) {
            this.f19043h = C6890l.f18863l;
        } else {
            this.f19043h = mVar.mo13182a(feedDataKey.f18992c);
        }
    }
}
