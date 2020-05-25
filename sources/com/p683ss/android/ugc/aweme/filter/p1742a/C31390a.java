package com.p683ss.android.ugc.aweme.filter.p1742a;

import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.tools.beauty.C46870d;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46829a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46833c;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.File;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.a.a */
public final class C31390a extends C29192b<C46870d, Void> {

    /* renamed from: h */
    public static final C31391a f82227h = new C31391a(null);

    /* renamed from: com.ss.android.ugc.aweme.filter.a.a$a */
    public static final class C31391a {
        private C31391a() {
        }

        public /* synthetic */ C31391a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo59082a() {
        return C46829a.m101681b(((C46870d) this.f76498g).f118406a);
    }

    /* renamed from: c */
    public final void mo59085c(C29190b<C46870d, Void> bVar) {
        C52711k.m112240b(bVar, "callback");
        C46833c.m101689b(((C46870d) this.f76498g).f118406a);
        bVar.mo59067b(this);
    }

    /* renamed from: b */
    public final void mo59084b(C29190b<C46870d, Void> bVar) {
        boolean z;
        C52711k.m112240b(bVar, "callback");
        File file = new File(((C46870d) this.f76498g).f118406a.getEffect().getZipPath());
        UrlModel fileUrl = ((C46870d) this.f76498g).f118406a.getEffect().getFileUrl();
        if (fileUrl != null) {
            Collection urlList = fileUrl.getUrlList();
            if (urlList == null || urlList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                fileUrl = null;
            }
            if (fileUrl != null) {
                Downloader.with(C39629l.m88233b()).url((String) fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).subThreadListener(new C31393c(this, bVar)).download();
                return;
            }
        }
        this.f76496e = new C29195e(Integer.valueOf(-1), "", null);
        bVar.mo59072c(this);
    }

    public C31390a(String str, C46870d dVar) {
        C52711k.m112240b(str, "mTaskId");
        C52711k.m112240b(dVar, "mParam");
        super(str, dVar);
    }
}
