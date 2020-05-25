package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BannerViewHolder_ViewBinding */
public class BannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BannerViewHolder f72822a;

    /* renamed from: b */
    private View f72823b;

    public void unbind() {
        BannerViewHolder bannerViewHolder = this.f72822a;
        if (bannerViewHolder != null) {
            this.f72822a = null;
            bannerViewHolder.mSdCover = null;
            this.f72823b.setOnClickListener(null);
            this.f72823b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BannerViewHolder_ViewBinding(final BannerViewHolder bannerViewHolder, View view) {
        this.f72822a = bannerViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.ci1, "field 'mSdCover' and method 'clickCover'");
        bannerViewHolder.mSdCover = (SmartImageView) Utils.castView(findRequiredView, R.id.ci1, "field 'mSdCover'", SmartImageView.class);
        this.f72823b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                bannerViewHolder.clickCover();
            }
        });
    }
}
