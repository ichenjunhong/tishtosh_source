package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicWithLyricTabFragment_ViewBinding */
public class NewMusicWithLyricTabFragment_ViewBinding extends NewMusicTabFragment_ViewBinding {

    /* renamed from: a */
    private NewMusicWithLyricTabFragment f65936a;

    public void unbind() {
        NewMusicWithLyricTabFragment newMusicWithLyricTabFragment = this.f65936a;
        if (newMusicWithLyricTabFragment != null) {
            this.f65936a = null;
            newMusicWithLyricTabFragment.mVpFragmentContainer = null;
            newMusicWithLyricTabFragment.mFrameLayout = null;
            newMusicWithLyricTabFragment.mTextView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicWithLyricTabFragment_ViewBinding(NewMusicWithLyricTabFragment newMusicWithLyricTabFragment, View view) {
        super(newMusicWithLyricTabFragment, view);
        this.f65936a = newMusicWithLyricTabFragment;
        newMusicWithLyricTabFragment.mVpFragmentContainer = (ViewPager) Utils.findRequiredViewAsType(view, R.id.agz, "field 'mVpFragmentContainer'", ViewPager.class);
        newMusicWithLyricTabFragment.mFrameLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.erc, "field 'mFrameLayout'", FrameLayout.class);
        newMusicWithLyricTabFragment.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.el4, "field 'mTextView'", TextView.class);
    }
}
