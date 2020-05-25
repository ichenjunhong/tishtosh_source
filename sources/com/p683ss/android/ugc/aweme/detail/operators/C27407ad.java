package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.similarvideo.p2269b.C45645a;
import com.p683ss.android.ugc.aweme.similarvideo.p2269b.C45647b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ad */
public final class C27407ad implements C27419al {

    /* renamed from: a */
    private C26875a f72161a;

    /* renamed from: b */
    private C26876b f72162b;

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final int getPageType(int i) {
        return 16;
    }

    public final Object getViewModel() {
        return this.f72161a;
    }

    public final boolean init(Fragment fragment) {
        return true;
    }

    public final boolean isDataEmpty() {
        return this.f72161a.isDataEmpty();
    }

    public final boolean isLoading() {
        return this.f72162b.mo54804o();
    }

    public final void unInit() {
        this.f72162b.mo46991S_();
        this.f72162b.aq_();
    }

    public C27407ad(C26875a aVar) {
        if (aVar == null) {
            this.f72161a = new C45645a();
            this.f72162b = new C45647b();
            return;
        }
        this.f72161a = aVar;
        this.f72162b = new C45647b();
    }

    public final void bindView(C27424ao aoVar) {
        this.f72162b.mo54800a(aoVar);
        this.f72162b.mo54838a((C26878d) aoVar);
        this.f72162b.mo54799a(this.f72161a);
    }

    public final boolean deleteItem(String str) {
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById == null) {
            awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        return this.f72162b.mo54839a((Object) awemeById);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72162b.mo44934a_(Integer.valueOf(i));
    }
}
