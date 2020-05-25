package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.i.v */
final /* synthetic */ class C7000v implements OnClickListener {

    /* renamed from: a */
    private final C6997t f19133a;

    /* renamed from: b */
    private final FeedItem f19134b;

    C7000v(C6997t tVar, FeedItem feedItem) {
        this.f19133a = tVar;
        this.f19134b = feedItem;
    }

    public final void onClick(View view) {
        this.f19133a.mo13171c(this.f19134b, view);
    }
}
