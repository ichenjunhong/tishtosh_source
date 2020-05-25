package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.DiscoverMusicFragment_ViewBinding */
public class DiscoverMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverMusicFragment f65849a;

    public void unbind() {
        DiscoverMusicFragment discoverMusicFragment = this.f65849a;
        if (discoverMusicFragment != null) {
            this.f65849a = null;
            discoverMusicFragment.mListView = null;
            discoverMusicFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverMusicFragment_ViewBinding(DiscoverMusicFragment discoverMusicFragment, View view) {
        this.f65849a = discoverMusicFragment;
        discoverMusicFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbq, "field 'mListView'", RecyclerView.class);
        discoverMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
