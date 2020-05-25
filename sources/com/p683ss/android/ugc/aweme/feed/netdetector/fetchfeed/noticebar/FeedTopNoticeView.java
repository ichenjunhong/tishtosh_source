package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.FeedTopNoticeView */
public final class FeedTopNoticeView extends FrameLayout {

    /* renamed from: b */
    public static final C30573a f79859b = new C30573a(null);

    /* renamed from: a */
    final FrameLayout f79860a;

    /* renamed from: c */
    private final View f79861c;

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.FeedTopNoticeView$a */
    public static final class C30573a {
        private C30573a() {
        }

        public /* synthetic */ C30573a(C52707g gVar) {
            this();
        }
    }

    public FeedTopNoticeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final FrameLayout getContent() {
        return this.f79860a;
    }

    public final View getRoot() {
        return this.f79861c;
    }

    public FeedTopNoticeView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f79861c = LayoutInflater.from(context).inflate(R.layout.b_l, this, true);
        this.f79860a = (FrameLayout) this.f79861c.findViewById(R.id.bwz);
        if (C30550b.m71531b()) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a8w, this.f79860a, true);
            View findViewById = inflate.findViewById(R.id.cdu);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.b1k);
            DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.d8j);
            C52711k.m112236a((Object) imageView, "mIvIcon");
            imageView.setVisibility(8);
            C52711k.m112236a((Object) dmtTextView, "mTvContent");
            dmtTextView.setText(getContext().getString(R.string.cg1));
            findViewById.setBackgroundColor(getContext().getResources().getColor(R.color.arw));
            C52711k.m112236a((Object) findViewById, "mRootView");
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, ((int) C9432q.m18687b(getContext(), 52.0f)) + C9432q.m18695e(getContext()), 0, 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    private /* synthetic */ FeedTopNoticeView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
