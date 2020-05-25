package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView_ViewBinding */
public class ChallengeMusicView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChallengeMusicView f66105a;

    public void unbind() {
        ChallengeMusicView challengeMusicView = this.f66105a;
        if (challengeMusicView != null) {
            this.f66105a = null;
            challengeMusicView.mVgContainer = null;
            challengeMusicView.mTvwContent = null;
            challengeMusicView.mLlMusicContainer = null;
            challengeMusicView.mVwDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChallengeMusicView_ViewBinding(ChallengeMusicView challengeMusicView, View view) {
        this.f66105a = challengeMusicView;
        challengeMusicView.mVgContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ber, "field 'mVgContainer'", LinearLayout.class);
        challengeMusicView.mTvwContent = (TextView) Utils.findRequiredViewAsType(view, R.id.dip, "field 'mTvwContent'", TextView.class);
        challengeMusicView.mLlMusicContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bes, "field 'mLlMusicContainer'", LinearLayout.class);
        challengeMusicView.mVwDivider = Utils.findRequiredView(view, R.id.dt_, "field 'mVwDivider'");
    }
}
