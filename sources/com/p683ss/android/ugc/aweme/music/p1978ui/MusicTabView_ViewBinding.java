package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView_ViewBinding */
public final class MusicTabView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicTabView f95668a;

    public final void unbind() {
        MusicTabView musicTabView = this.f95668a;
        if (musicTabView != null) {
            this.f95668a = null;
            musicTabView.tabLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicTabView_ViewBinding(MusicTabView musicTabView, View view) {
        this.f95668a = musicTabView;
        musicTabView.tabLayout = (DmtTabLayout) Utils.findRequiredViewAsType(view, R.id.bor, "field 'tabLayout'", DmtTabLayout.class);
    }
}
