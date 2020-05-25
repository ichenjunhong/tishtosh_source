package com.p683ss.android.ugc.aweme.share;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.trill.share.api.C50414a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.b */
public final class C41990b implements C42204k {

    /* renamed from: a */
    public C50414a f106282a = new C50414a();

    public C41990b() {
        this.f106282a.mo54800a(this);
    }

    /* renamed from: b */
    public final void mo86075b() {
        C10691a.m21542b(C11010c.m22280a(), (int) R.string.doj).mo19066a();
    }

    /* renamed from: a */
    public final void mo86074a() {
        SharePrefCache.inst().getTwitterSecret().mo47778b();
        SharePrefCache.inst().getFacebookAccessToken().mo47778b();
        SharePrefCache.inst().getTwitterAccessToken().mo47778b();
        C10691a.m21533a(C11010c.m22280a(), (int) R.string.di7).mo19066a();
    }
}
