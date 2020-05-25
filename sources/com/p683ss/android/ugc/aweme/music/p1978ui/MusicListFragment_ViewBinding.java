package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment_ViewBinding */
public class MusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicListFragment f95637a;

    public void unbind() {
        MusicListFragment musicListFragment = this.f95637a;
        if (musicListFragment != null) {
            this.f95637a = null;
            musicListFragment.mListView = null;
            musicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicListFragment_ViewBinding(MusicListFragment musicListFragment, View view) {
        this.f95637a = musicListFragment;
        musicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbq, "field 'mListView'", RecyclerView.class);
        musicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
