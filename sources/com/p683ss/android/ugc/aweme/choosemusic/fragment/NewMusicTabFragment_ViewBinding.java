package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment_ViewBinding */
public class NewMusicTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NewMusicTabFragment f65914a;

    public void unbind() {
        NewMusicTabFragment newMusicTabFragment = this.f65914a;
        if (newMusicTabFragment != null) {
            this.f65914a = null;
            newMusicTabFragment.mDmtStatusView = null;
            newMusicTabFragment.tabLayout = null;
            newMusicTabFragment.mVpFragmentContainer = null;
            newMusicTabFragment.mScrollableLayout = null;
            newMusicTabFragment.mVwDivideLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicTabFragment_ViewBinding(NewMusicTabFragment newMusicTabFragment, View view) {
        this.f65914a = newMusicTabFragment;
        newMusicTabFragment.mDmtStatusView = (DmtStatusView) Utils.findOptionalViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
        newMusicTabFragment.tabLayout = (DmtTabLayout) Utils.findOptionalViewAsType(view, R.id.cwz, "field 'tabLayout'", DmtTabLayout.class);
        newMusicTabFragment.mVpFragmentContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.agz, "field 'mVpFragmentContainer'", ViewPager.class);
        newMusicTabFragment.mScrollableLayout = (ScrollableLayout) Utils.findOptionalViewAsType(view, R.id.chv, "field 'mScrollableLayout'", ScrollableLayout.class);
        newMusicTabFragment.mVwDivideLine = view.findViewById(R.id.a6f);
    }
}
