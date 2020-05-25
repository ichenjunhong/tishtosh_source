package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sticker.prop.p2315b.C46363b;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.c */
public final class C46387c implements C24622b {
    public final void onJumpToDetail(String str) {
    }

    public final boolean sendCustomRequest(C26876b bVar, int i) {
        return false;
    }

    public final C26876b getPresenter(int i, FragmentActivity fragmentActivity) {
        C26876b bVar = new C26876b();
        bVar.mo54799a(new C46363b());
        return bVar;
    }

    public final C24623c getJumpToVideoParam(C24623c cVar, Aweme aweme) {
        C26890h.m65011a("feed_enter", C23089d.m56640a().mo47829a("enter_from", "prop_page").mo47829a("group_id", aweme.getAid()).mo47829a("tag_id", cVar.f65169d).mo47826a("rank_index", cVar.f65171f).mo47829a("process_id", cVar.f65170e).f61491a);
        cVar.f65166a = "from_sticker";
        cVar.f65167b = "sticker_id";
        cVar.f65168c = "prop_page";
        return cVar;
    }

    public final C24540e onCreateDetailAwemeViewHolder(View view, String str, C24579d dVar) {
        return new C46390e(view, str, dVar);
    }
}
