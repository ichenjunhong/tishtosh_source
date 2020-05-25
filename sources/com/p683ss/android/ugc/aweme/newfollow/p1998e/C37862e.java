package com.p683ss.android.ugc.aweme.newfollow.p1998e;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.UpLoadItemViewHolder;

/* renamed from: com.ss.android.ugc.aweme.newfollow.e.e */
public final class C37862e extends FollowFeed {

    /* renamed from: a */
    public int f96389a;

    /* renamed from: b */
    public Bitmap f96390b;

    /* renamed from: c */
    public boolean f96391c;

    /* renamed from: d */
    public UpLoadItemViewHolder f96392d;

    public C37862e() {
        setFeedType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
    }

    /* renamed from: a */
    public final void mo77303a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f96390b = bitmap;
        }
    }
}
