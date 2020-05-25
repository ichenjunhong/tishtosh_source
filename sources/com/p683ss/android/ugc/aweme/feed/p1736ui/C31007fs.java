package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fs */
public final class C31007fs extends C31009h {

    /* renamed from: a */
    private C30767ar f81190a;

    /* renamed from: b */
    private final OnTouchListener f81191b;

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        C30767ar arVar = this.f81190a;
        if (arVar != null) {
            arVar.mo63471a(dataCenter);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        C30767ar arVar = this.f81190a;
        if (arVar != null) {
            arVar.mo63472a(videoItemParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6z);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2, new LayoutParams(-2, -2));
        }
        OnTouchListener onTouchListener = this.f81191b;
        Context context = this.f81198r;
        C52711k.m112236a((Object) context, "mContext");
        this.f81190a = new C30767ar(view2, onTouchListener, context);
    }

    public C31007fs(View view, OnTouchListener onTouchListener) {
        super(view);
        this.f81191b = onTouchListener;
    }
}
