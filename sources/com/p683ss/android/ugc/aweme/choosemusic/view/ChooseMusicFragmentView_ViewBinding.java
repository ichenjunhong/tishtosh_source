package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView_ViewBinding */
public class ChooseMusicFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChooseMusicFragmentView f66116a;

    public void unbind() {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66116a;
        if (chooseMusicFragmentView != null) {
            this.f66116a = null;
            chooseMusicFragmentView.mRelativeSearch = null;
            chooseMusicFragmentView.mLinearSearch = null;
            chooseMusicFragmentView.mSearchTextView = null;
            chooseMusicFragmentView.mCancelSearch = null;
            chooseMusicFragmentView.mSearchEditTextContainer = null;
            chooseMusicFragmentView.mSearchEditView = null;
            chooseMusicFragmentView.mBackView = null;
            chooseMusicFragmentView.mSkipView = null;
            chooseMusicFragmentView.starTcmItem = null;
            chooseMusicFragmentView.commerceTipsItem = null;
            chooseMusicFragmentView.mSearchLayout = null;
            chooseMusicFragmentView.mMainLayout = null;
            chooseMusicFragmentView.txtClickRecommend = null;
            chooseMusicFragmentView.mClearView = null;
            chooseMusicFragmentView.endTextContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChooseMusicFragmentView_ViewBinding(ChooseMusicFragmentView chooseMusicFragmentView, View view) {
        this.f66116a = chooseMusicFragmentView;
        chooseMusicFragmentView.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cdv, "field 'mRelativeSearch'", LinearLayout.class);
        chooseMusicFragmentView.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bg8, "field 'mLinearSearch'", LinearLayout.class);
        chooseMusicFragmentView.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dfd, "field 'mSearchTextView'", TextView.class);
        chooseMusicFragmentView.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.dff, "field 'mCancelSearch'", TextView.class);
        chooseMusicFragmentView.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cdx, "field 'mSearchEditTextContainer'", LinearLayout.class);
        chooseMusicFragmentView.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, R.id.dfc, "field 'mSearchEditView'", EditText.class);
        chooseMusicFragmentView.mBackView = Utils.findRequiredView(view, R.id.ik, "field 'mBackView'");
        chooseMusicFragmentView.mSkipView = Utils.findRequiredView(view, R.id.cp5, "field 'mSkipView'");
        chooseMusicFragmentView.starTcmItem = (StarTcmItem) Utils.findRequiredViewAsType(view, R.id.axa, "field 'starTcmItem'", StarTcmItem.class);
        chooseMusicFragmentView.commerceTipsItem = (CommerceTipsItem) Utils.findRequiredViewAsType(view, R.id.edf, "field 'commerceTipsItem'", CommerceTipsItem.class);
        chooseMusicFragmentView.mSearchLayout = (SearchResultView) Utils.findRequiredViewAsType(view, R.id.zs, "field 'mSearchLayout'", SearchResultView.class);
        chooseMusicFragmentView.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.zt, "field 'mMainLayout'", FrameLayout.class);
        chooseMusicFragmentView.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, R.id.u5, "field 'txtClickRecommend'", TextView.class);
        chooseMusicFragmentView.mClearView = (ImageView) Utils.findRequiredViewAsType(view, R.id.az5, "field 'mClearView'", ImageView.class);
        chooseMusicFragmentView.endTextContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.e7c, "field 'endTextContainer'", FrameLayout.class);
    }
}
