package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedLiveWindowView_ViewBinding */
public class FeedLiveWindowView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedLiveWindowView f80416a;

    /* renamed from: b */
    private View f80417b;

    /* renamed from: c */
    private View f80418c;

    public void unbind() {
        FeedLiveWindowView feedLiveWindowView = this.f80416a;
        if (feedLiveWindowView != null) {
            this.f80416a = null;
            feedLiveWindowView.mCoverIv = null;
            feedLiveWindowView.mVideoContainer = null;
            feedLiveWindowView.mTagView = null;
            this.f80417b.setOnClickListener(null);
            this.f80417b = null;
            this.f80418c.setOnClickListener(null);
            this.f80418c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedLiveWindowView_ViewBinding(final FeedLiveWindowView feedLiveWindowView, View view) {
        this.f80416a = feedLiveWindowView;
        feedLiveWindowView.mCoverIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.e8h, "field 'mCoverIv'", RemoteImageView.class);
        feedLiveWindowView.mVideoContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.e8j, "field 'mVideoContainer'", FrameLayout.class);
        feedLiveWindowView.mTagView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e8l, "field 'mTagView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e8i, "method 'clickClose'");
        this.f80417b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedLiveWindowView.clickClose();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e8k, "method 'clickWindow'");
        this.f80418c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedLiveWindowView.clickWindow();
            }
        });
    }
}
