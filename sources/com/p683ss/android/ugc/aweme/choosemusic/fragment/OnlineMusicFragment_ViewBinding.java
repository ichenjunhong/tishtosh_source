package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem;
import com.p683ss.android.ugc.aweme.choosemusic.view.StarTcmItem;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment_ViewBinding */
public class OnlineMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OnlineMusicFragment f65959a;

    public void unbind() {
        OnlineMusicFragment onlineMusicFragment = this.f65959a;
        if (onlineMusicFragment != null) {
            this.f65959a = null;
            onlineMusicFragment.mRelativeSearch = null;
            onlineMusicFragment.mLinearSearch = null;
            onlineMusicFragment.mSearchTextView = null;
            onlineMusicFragment.mCancelSearch = null;
            onlineMusicFragment.mStatusView = null;
            onlineMusicFragment.mSearchEditTextContainer = null;
            onlineMusicFragment.mListViewBackground = null;
            onlineMusicFragment.mSearchEditView = null;
            onlineMusicFragment.mBackView = null;
            onlineMusicFragment.mSkipView = null;
            onlineMusicFragment.mSearchBg = null;
            onlineMusicFragment.mSearchLayout = null;
            onlineMusicFragment.mMainLayout = null;
            onlineMusicFragment.txtClickRecommend = null;
            onlineMusicFragment.llRecommendMusic = null;
            onlineMusicFragment.starTcmItem = null;
            onlineMusicFragment.commerceTipsItem = null;
            onlineMusicFragment.cancelChooseMusicContainer = null;
            onlineMusicFragment.currentChooseMusicNameTv = null;
            onlineMusicFragment.cancelCurrentChooseMusicTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OnlineMusicFragment_ViewBinding(OnlineMusicFragment onlineMusicFragment, View view) {
        this.f65959a = onlineMusicFragment;
        onlineMusicFragment.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cdv, "field 'mRelativeSearch'", LinearLayout.class);
        onlineMusicFragment.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bg8, "field 'mLinearSearch'", LinearLayout.class);
        onlineMusicFragment.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dfd, "field 'mSearchTextView'", TextView.class);
        onlineMusicFragment.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.dff, "field 'mCancelSearch'", TextView.class);
        onlineMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        onlineMusicFragment.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cdx, "field 'mSearchEditTextContainer'", LinearLayout.class);
        onlineMusicFragment.mListViewBackground = Utils.findRequiredView(view, R.id.bfs, "field 'mListViewBackground'");
        onlineMusicFragment.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, R.id.dfc, "field 'mSearchEditView'", EditText.class);
        onlineMusicFragment.mBackView = Utils.findRequiredView(view, R.id.ik, "field 'mBackView'");
        onlineMusicFragment.mSkipView = Utils.findRequiredView(view, R.id.cp5, "field 'mSkipView'");
        onlineMusicFragment.mSearchBg = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cdw, "field 'mSearchBg'", RelativeLayout.class);
        onlineMusicFragment.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.zs, "field 'mSearchLayout'", LinearLayout.class);
        onlineMusicFragment.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.zt, "field 'mMainLayout'", FrameLayout.class);
        onlineMusicFragment.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, R.id.u5, "field 'txtClickRecommend'", TextView.class);
        onlineMusicFragment.llRecommendMusic = Utils.findRequiredView(view, R.id.c_2, "field 'llRecommendMusic'");
        onlineMusicFragment.starTcmItem = (StarTcmItem) Utils.findRequiredViewAsType(view, R.id.axa, "field 'starTcmItem'", StarTcmItem.class);
        onlineMusicFragment.commerceTipsItem = (CommerceTipsItem) Utils.findRequiredViewAsType(view, R.id.edf, "field 'commerceTipsItem'", CommerceTipsItem.class);
        onlineMusicFragment.cancelChooseMusicContainer = Utils.findRequiredView(view, R.id.qc, "field 'cancelChooseMusicContainer'");
        onlineMusicFragment.currentChooseMusicNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a2o, "field 'currentChooseMusicNameTv'", TextView.class);
        onlineMusicFragment.cancelCurrentChooseMusicTv = Utils.findRequiredView(view, R.id.qd, "field 'cancelCurrentChooseMusicTv'");
    }
}
