package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.i.z */
final /* synthetic */ class C7004z implements OnClickListener {

    /* renamed from: a */
    private final C6997t f19140a;

    /* renamed from: b */
    private final FeedItem f19141b;

    C7004z(C6997t tVar, FeedItem feedItem) {
        this.f19140a = tVar;
        this.f19141b = feedItem;
    }

    public final void onClick(View view) {
        this.f19140a.mo13168a(this.f19141b, view);
    }
}
