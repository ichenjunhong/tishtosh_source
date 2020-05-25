package com.bytedance.android.livesdk.feed.drawerfeed.p336a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p337e.C6909a;
import com.bytedance.android.livesdk.feed.p341i.C6983l;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.i */
public abstract class C6875i extends C6983l {
    /* renamed from: a */
    public final boolean mo13069a(FeedItem feedItem, boolean z, String str, Bundle bundle) {
        boolean a = super.mo13069a(feedItem, z, str, bundle);
        if (a) {
            C4495a.m10823a().mo10301a((Object) new C6909a(0));
        }
        return a;
    }

    public C6875i(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        super(view, aVar, iVar, feedDataKey, mVar, gVar, bVar, bVar2, bVar3, bVar4);
        this.f19044i = true;
    }
}
