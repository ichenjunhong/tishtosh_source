package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment_ViewBinding */
public class NewMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NewMusicListFragment f65875a;

    public void unbind() {
        NewMusicListFragment newMusicListFragment = this.f65875a;
        if (newMusicListFragment != null) {
            this.f65875a = null;
            newMusicListFragment.mListView = null;
            newMusicListFragment.mStatusView = null;
            newMusicListFragment.mBackgroundView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public NewMusicListFragment_ViewBinding(NewMusicListFragment newMusicListFragment, View view) {
        this.f65875a = newMusicListFragment;
        newMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbq, "field 'mListView'", RecyclerView.class);
        newMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        newMusicListFragment.mBackgroundView = Utils.findRequiredView(view, R.id.bfs, "field 'mBackgroundView'");
    }
}
