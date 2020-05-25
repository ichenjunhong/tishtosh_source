package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MultilineInputFragment_ViewBinding */
public class MultilineInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MultilineInputFragment f102297a;

    /* renamed from: b */
    private View f102298b;

    /* renamed from: c */
    private View f102299c;

    /* renamed from: d */
    private View f102300d;

    /* renamed from: e */
    private View f102301e;

    public void unbind() {
        MultilineInputFragment multilineInputFragment = this.f102297a;
        if (multilineInputFragment != null) {
            this.f102297a = null;
            multilineInputFragment.mTitleBar = null;
            multilineInputFragment.mInput = null;
            multilineInputFragment.mClearAllBtn = null;
            multilineInputFragment.mLengthHint = null;
            multilineInputFragment.mPopRemarkname = null;
            multilineInputFragment.mTvContactname = null;
            multilineInputFragment.mTvSetting = null;
            this.f102298b.setOnClickListener(null);
            this.f102298b = null;
            this.f102299c.setOnClickListener(null);
            this.f102299c = null;
            this.f102300d.setOnClickListener(null);
            this.f102300d = null;
            this.f102301e.setOnClickListener(null);
            this.f102301e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MultilineInputFragment_ViewBinding(final MultilineInputFragment multilineInputFragment, View view) {
        this.f102297a = multilineInputFragment;
        multilineInputFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", ButtonTitleBar.class);
        multilineInputFragment.mInput = (EditText) Utils.findRequiredViewAsType(view, R.id.au2, "field 'mInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.az6, "field 'mClearAllBtn' and method 'onClick'");
        multilineInputFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.az6, "field 'mClearAllBtn'", ImageView.class);
        this.f102298b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        multilineInputFragment.mLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.db5, "field 'mLengthHint'", TextView.class);
        multilineInputFragment.mPopRemarkname = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.c3k, "field 'mPopRemarkname'", RelativeLayout.class);
        multilineInputFragment.mTvContactname = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d8i, "field 'mTvContactname'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dfs, "field 'mTvSetting' and method 'onClick'");
        multilineInputFragment.mTvSetting = (DmtTextView) Utils.castView(findRequiredView2, R.id.dfs, "field 'mTvSetting'", DmtTextView.class);
        this.f102299c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ik, "method 'onClick'");
        this.f102300d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.ccd, "method 'onClick'");
        this.f102301e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
    }
}
