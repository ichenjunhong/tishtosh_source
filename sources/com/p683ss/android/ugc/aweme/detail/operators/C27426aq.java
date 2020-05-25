package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.C28708d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.aq */
public final class C27426aq implements C27419al, C27420a {

    /* renamed from: a */
    private C26875a f72183a;

    /* renamed from: b */
    private C26876b f72184b = new C28708d();

    /* renamed from: a */
    public final boolean mo55879a() {
        return false;
    }

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final int getPageType(int i) {
        return 9;
    }

    public final Object getViewModel() {
        return this.f72183a;
    }

    public final boolean init(Fragment fragment) {
        return true;
    }

    public final boolean isDataEmpty() {
        return this.f72183a.isDataEmpty();
    }

    public final boolean isLoading() {
        return this.f72184b.mo54804o();
    }

    public final void unInit() {
        this.f72184b.mo46991S_();
        this.f72184b.aq_();
    }

    public C27426aq(C26875a aVar) {
        this.f72183a = aVar;
    }

    public final void bindView(C27424ao aoVar) {
        this.f72184b.mo54800a(aoVar);
        this.f72184b.mo54838a((C26878d) aoVar);
        this.f72184b.mo54799a(this.f72183a);
    }

    public final boolean deleteItem(String str) {
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById == null) {
            awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        return this.f72184b.mo54839a((Object) awemeById);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72184b.mo44934a_(Integer.valueOf(i));
    }
}
