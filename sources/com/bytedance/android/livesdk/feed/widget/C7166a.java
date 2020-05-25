package com.bytedance.android.livesdk.feed.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.tab.p350c.C7133a;

/* renamed from: com.bytedance.android.livesdk.feed.widget.a */
final /* synthetic */ class C7166a implements OnClickListener {

    /* renamed from: a */
    private final LiveTabIndicator f19453a;

    /* renamed from: b */
    private final int f19454b;

    /* renamed from: c */
    private final C6945f f19455c;

    /* renamed from: d */
    private final C7133a f19456d;

    C7166a(LiveTabIndicator liveTabIndicator, int i, C6945f fVar, C7133a aVar) {
        this.f19453a = liveTabIndicator;
        this.f19454b = i;
        this.f19455c = fVar;
        this.f19456d = aVar;
    }

    public final void onClick(View view) {
        this.f19453a.mo13283a(this.f19454b, this.f19455c, this.f19456d, view);
    }
}
