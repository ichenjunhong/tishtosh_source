package com.p683ss.android.ugc.aweme.filter.p1742a;

import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.a.e */
public final class C31397e extends C29192b<Effect, Void> {
    /* renamed from: b */
    public final void mo59084b(C29190b<Effect, Void> bVar) {
        boolean z;
        C52711k.m112240b(bVar, "callback");
        File file = new File(((Effect) this.f76498g).getZipPath());
        UrlModel fileUrl = ((Effect) this.f76498g).getFileUrl();
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
                Downloader.with(C39629l.m88233b()).url((String) fileUrl.getUrlList().get(0)).savePath(file.getParent()).name(file.getName()).subThreadListener(new C31394d(this, bVar)).download();
                return;
            }
        }
        this.f76496e = new C29195e(Integer.valueOf(-1), "", null);
        bVar.mo59072c(this);
    }

    public C31397e(String str, Effect effect) {
        C52711k.m112240b(str, "mTaskId");
        C52711k.m112240b(effect, "mParam");
        super(str, effect);
    }
}
