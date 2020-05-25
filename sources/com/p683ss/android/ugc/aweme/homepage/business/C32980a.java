package com.p683ss.android.ugc.aweme.homepage.business;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.C23111k;
import com.p683ss.android.ugc.aweme.app.C23128m;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask;
import com.p683ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.a */
public final class C32980a {
    /* renamed from: a */
    public static final void m75920a() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - C22574a.m55738f().f60707h;
        int a = C23128m.m56685a();
        int h = (int) C11010c.m22287h();
        if (a != h) {
            z = true;
        } else {
            z = false;
        }
        C23111k a2 = C23111k.m56679a();
        C52711k.m112236a((Object) a2, "AppLifeCircleCacheManager.getInstance()");
        if (a2.f61536a) {
            C35857a.m81001b().mo74526a(new MobLaunchEventTask(z, currentTimeMillis)).mo74527a();
        }
        if (a == 0) {
            C23128m.m56686a(h);
        }
        C23111k a3 = C23111k.m56679a();
        C52711k.m112236a((Object) a3, "AppLifeCircleCacheManager.getInstance()");
        a3.f61536a = false;
        C35857a.m81001b().mo74526a(new AntispamApiUploadTask()).mo74527a();
    }
}
