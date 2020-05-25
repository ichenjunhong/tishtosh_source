package com.p683ss.android.ugc.aweme.livewallpaper.p1928c;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c.C36209a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.a */
public final class C36203a implements C36209a {

    /* renamed from: a */
    private String f92681a;

    public C36203a(String str) {
        this.f92681a = str;
    }

    /* renamed from: a */
    public final void mo74955a(boolean z, String str) {
        if (z) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.ddt).mo19066a();
            C36212f.m81734a(0, "");
        } else {
            C36212f.m81734a(1, str);
        }
        if (this.f92681a != null) {
            C36212f.m81738a(this.f92681a, "video_share", z);
        }
        C36205c.m81710a().mo74958a("video_share");
    }
}
