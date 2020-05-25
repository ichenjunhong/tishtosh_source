package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28123f;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28126g;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28137o;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28140p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ab */
public final class C27405ab implements C27419al {

    /* renamed from: a */
    private C26875a f72159a;

    /* renamed from: b */
    private C26876b f72160b;

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
        return this.f72159a;
    }

    public final boolean init(Fragment fragment) {
        return true;
    }

    public final boolean isDataEmpty() {
        return this.f72159a.isDataEmpty();
    }

    public final boolean isLoading() {
        return this.f72160b.mo54804o();
    }

    public final void unInit() {
        this.f72160b.mo46991S_();
        this.f72160b.aq_();
    }

    public final void bindView(C27424ao aoVar) {
        this.f72160b.mo54800a(aoVar);
        this.f72160b.mo54838a((C26878d) aoVar);
        this.f72160b.mo54799a(this.f72159a);
    }

    public C27405ab(C26875a aVar) {
        C26876b bVar;
        if (aVar == null) {
            this.f72159a = new C28123f();
            bVar = new C28126g();
        } else {
            this.f72159a = aVar;
            if (aVar instanceof C28137o) {
                bVar = new C28140p(null);
            } else {
                bVar = new C28126g();
            }
        }
        this.f72160b = bVar;
    }

    public final boolean deleteItem(String str) {
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById == null) {
            awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        return this.f72160b.mo54839a((Object) awemeById);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72160b.mo44934a_(Integer.valueOf(i));
    }
}
