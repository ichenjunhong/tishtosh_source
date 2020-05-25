package com.p683ss.android.ugc.aweme.favorites.api.notice;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.a */
public final class C29682a extends C37716a<CollectionNotice> {

    /* renamed from: a */
    private C29684a f77591a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.a$a */
    public interface C29684a {
        /* renamed from: a */
        void mo59957a(CollectionNotice collectionNotice);
    }

    public final /* synthetic */ void handleData(Object obj) {
        CollectionNotice collectionNotice = (CollectionNotice) obj;
        super.handleData(collectionNotice);
        if (this.f77591a != null) {
            this.f77591a.mo59957a(collectionNotice);
        }
    }

    /* renamed from: a */
    public final void mo59954a(C29684a aVar) {
        this.f77591a = aVar;
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CollectionNoticeApi.m69721a();
            }
        }, 0);
    }
}
