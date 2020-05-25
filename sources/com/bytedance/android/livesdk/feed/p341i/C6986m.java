package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.feed.i.m */
final /* synthetic */ class C6986m implements OnClickListener {

    /* renamed from: a */
    private final C6983l f19092a;

    /* renamed from: b */
    private final FeedItem f19093b;

    /* renamed from: c */
    private final Room f19094c;

    C6986m(C6983l lVar, FeedItem feedItem, Room room) {
        this.f19092a = lVar;
        this.f19093b = feedItem;
        this.f19094c = room;
    }

    public final void onClick(View view) {
        this.f19092a.mo13159a(this.f19093b, this.f19094c, view);
    }
}
