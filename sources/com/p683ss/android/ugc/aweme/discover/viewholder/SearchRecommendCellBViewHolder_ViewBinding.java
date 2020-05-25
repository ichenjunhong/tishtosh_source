package com.p683ss.android.ugc.aweme.discover.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.viewholder.SearchRecommendCellBViewHolder_ViewBinding */
public class SearchRecommendCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchRecommendCellBViewHolder f75742a;

    /* renamed from: b */
    private View f75743b;

    /* renamed from: c */
    private View f75744c;

    /* renamed from: d */
    private View f75745d;

    /* renamed from: e */
    private View f75746e;

    public void unbind() {
        SearchRecommendCellBViewHolder searchRecommendCellBViewHolder = this.f75742a;
        if (searchRecommendCellBViewHolder != null) {
            this.f75742a = null;
            searchRecommendCellBViewHolder.txtDesc = null;
            searchRecommendCellBViewHolder.txtLikeCount = null;
            searchRecommendCellBViewHolder.authorAvatar = null;
            searchRecommendCellBViewHolder.txtAuthorName = null;
            searchRecommendCellBViewHolder.tagLayout = null;
            searchRecommendCellBViewHolder.mMixIcon = null;
            searchRecommendCellBViewHolder.mBottomDesc = null;
            this.f75743b.setOnClickListener(null);
            this.f75743b = null;
            this.f75744c.setOnClickListener(null);
            this.f75744c = null;
            this.f75745d.setOnClickListener(null);
            this.f75745d = null;
            this.f75746e.setOnClickListener(null);
            this.f75746e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchRecommendCellBViewHolder_ViewBinding(final SearchRecommendCellBViewHolder searchRecommendCellBViewHolder, View view) {
        this.f75742a = searchRecommendCellBViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.a4e, "field 'txtDesc' and method 'onClick'");
        searchRecommendCellBViewHolder.txtDesc = (TextView) Utils.castView(findRequiredView, R.id.a4e, "field 'txtDesc'", TextView.class);
        this.f75743b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                searchRecommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.baj, "field 'txtLikeCount' and method 'onClick'");
        searchRecommendCellBViewHolder.txtLikeCount = (TextView) Utils.castView(findRequiredView2, R.id.baj, "field 'txtLikeCount'", TextView.class);
        this.f75744c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                searchRecommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.h1, "field 'authorAvatar' and method 'onClick'");
        searchRecommendCellBViewHolder.authorAvatar = (SmartCircleImageView) Utils.castView(findRequiredView3, R.id.h1, "field 'authorAvatar'", SmartCircleImageView.class);
        this.f75745d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                searchRecommendCellBViewHolder.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.h3, "field 'txtAuthorName' and method 'onClick'");
        searchRecommendCellBViewHolder.txtAuthorName = (TextView) Utils.castView(findRequiredView4, R.id.h3, "field 'txtAuthorName'", TextView.class);
        this.f75746e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                searchRecommendCellBViewHolder.onClick(view);
            }
        });
        searchRecommendCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.cxc, "field 'tagLayout'", TagLayout.class);
        searchRecommendCellBViewHolder.mMixIcon = (ImageView) Utils.findOptionalViewAsType(view, R.id.bme, "field 'mMixIcon'", ImageView.class);
        searchRecommendCellBViewHolder.mBottomDesc = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.bej, "field 'mBottomDesc'", LinearLayout.class);
    }
}
