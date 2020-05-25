package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListActivity_ViewBinding */
public class MusicListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicListActivity f95616a;

    public void unbind() {
        MusicListActivity musicListActivity = this.f95616a;
        if (musicListActivity != null) {
            this.f95616a = null;
            musicListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicListActivity_ViewBinding(MusicListActivity musicListActivity, View view) {
        this.f95616a = musicListActivity;
        musicListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
    }
}
