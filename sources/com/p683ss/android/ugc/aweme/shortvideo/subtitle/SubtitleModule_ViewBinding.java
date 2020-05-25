package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule_ViewBinding */
public class SubtitleModule_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SubtitleModule f113495a;

    public void unbind() {
        SubtitleModule subtitleModule = this.f113495a;
        if (subtitleModule != null) {
            this.f113495a = null;
            subtitleModule.mEffectTitleLayout = null;
            subtitleModule.mContentLayout = null;
            subtitleModule.mCancelView = null;
            subtitleModule.mSaveView = null;
            subtitleModule.mLoadingArea = null;
            subtitleModule.mLoadingStatusView = null;
            subtitleModule.mSubtitleLayout = null;
            subtitleModule.mRecyclerView = null;
            subtitleModule.mHighLightArea = null;
            subtitleModule.mIvFont = null;
            subtitleModule.mIvDelete = null;
            subtitleModule.mLoadingProgress = null;
            subtitleModule.mLoadingHint = null;
            subtitleModule.mIvEdit = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SubtitleModule_ViewBinding(SubtitleModule subtitleModule, View view) {
        this.f113495a = subtitleModule;
        subtitleModule.mEffectTitleLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.a_5, "field 'mEffectTitleLayout'", RelativeLayout.class);
        subtitleModule.mContentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a07, "field 'mContentLayout'", FrameLayout.class);
        subtitleModule.mCancelView = (TextView) Utils.findRequiredViewAsType(view, R.id.d7e, "field 'mCancelView'", TextView.class);
        subtitleModule.mSaveView = (TextView) Utils.findRequiredViewAsType(view, R.id.df8, "field 'mSaveView'", TextView.class);
        subtitleModule.mLoadingArea = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bh_, "field 'mLoadingArea'", LinearLayout.class);
        subtitleModule.mLoadingStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.bhp, "field 'mLoadingStatusView'", DmtStatusView.class);
        subtitleModule.mSubtitleLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cuz, "field 'mSubtitleLayout'", LinearLayout.class);
        subtitleModule.mRecyclerView = (AVDmtPanelRecyleView) Utils.findRequiredViewAsType(view, R.id.caf, "field 'mRecyclerView'", AVDmtPanelRecyleView.class);
        subtitleModule.mHighLightArea = Utils.findRequiredView(view, R.id.aor, "field 'mHighLightArea'");
        subtitleModule.mIvFont = (ImageView) Utils.findRequiredViewAsType(view, R.id.aqu, "field 'mIvFont'", ImageView.class);
        subtitleModule.mIvDelete = (ImageView) Utils.findRequiredViewAsType(view, R.id.aqt, "field 'mIvDelete'", ImageView.class);
        subtitleModule.mLoadingProgress = (TextView) Utils.findRequiredViewAsType(view, R.id.bhn, "field 'mLoadingProgress'", TextView.class);
        subtitleModule.mLoadingHint = (TextView) Utils.findRequiredViewAsType(view, R.id.bhi, "field 'mLoadingHint'", TextView.class);
        subtitleModule.mIvEdit = (ImageView) Utils.findRequiredViewAsType(view, R.id.ebj, "field 'mIvEdit'", ImageView.class);
    }
}
