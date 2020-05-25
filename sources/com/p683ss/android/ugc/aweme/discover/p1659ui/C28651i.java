package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27497g;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.profile.C39940m;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.i */
public final class C28651i extends C27497g {
    /* renamed from: a */
    public final boolean mo55911a() {
        return true;
    }

    /* renamed from: e */
    public final C23700a mo55915e() {
        C23700a aVar = new C23700a();
        aVar.mo49126a(C28713w.class, "page_feed", 0, 1.0f, getArguments()).mo49125a(C39940m.m88696f(), "page_profile");
        return aVar;
    }

    /* renamed from: b */
    public final void mo55912b(Aweme aweme) {
        super.mo55912b(aweme);
        C47718bf.m103288a(new C30332aw(21, new DiscoverPlaylistUpdateParam(this.f72297j.getIndex(), this.f72297j.getTabName(), this.f72297j.getCellId(), mo55919i())));
    }

    /* renamed from: a */
    public final void mo55910a(boolean z, int i) {
        if (!TextUtils.equals(this.f72297j.getFrom(), "from_discovery_v4")) {
            super.mo55910a(z, i);
        }
    }
}
