package com.p683ss.android.ugc.aweme.music;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicListFragment_ViewBinding */
public class OriginMusicListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OriginMusicListFragment f95016a;

    public void unbind() {
        OriginMusicListFragment originMusicListFragment = this.f95016a;
        if (originMusicListFragment != null) {
            this.f95016a = null;
            originMusicListFragment.mListView = null;
            originMusicListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OriginMusicListFragment_ViewBinding(OriginMusicListFragment originMusicListFragment, View view) {
        this.f95016a = originMusicListFragment;
        originMusicListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cge, "field 'mListView'", RecyclerView.class);
        originMusicListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
