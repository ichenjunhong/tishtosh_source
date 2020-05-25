package com.p683ss.android.ugc.aweme.app.launch;

import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.bytedance.ies.ugc.statisticlogger.C11053c;
import com.bytedance.ies.ugc.statisticlogger.config.C11059c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1377g.C23097c;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.p1698f.C29631a;
import com.p683ss.android.ugc.aweme.p1698f.C29632b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.launch.b */
public final class C23117b {

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$a */
    public static final class C23118a<T> implements C1715j<C11059c> {

        /* renamed from: a */
        public static final C23118a f61540a = new C23118a();

        C23118a() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            C11059c cVar = (C11059c) obj;
            C52711k.m112240b(cVar, "it");
            if (cVar == C11059c.Local) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$b */
    public static final class C23119b implements C1710e<C11059c> {

        /* renamed from: a */
        private boolean f61541a;

        public final /* synthetic */ void accept(Object obj) {
            C11059c cVar = (C11059c) obj;
            if (!this.f61541a) {
                C35857a.m81001b().mo74526a(new MonitorInitTask()).mo74527a();
                this.f61541a = true;
            }
            if (!C9431p.m18664a(C11049a.m22366b()) && !C9431p.m18664a(C11049a.m22367c())) {
                C35857a.m81001b().mo74526a(new RedBadgeUpdateTask()).mo74527a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$c */
    public static final class C23120c<T> implements C1710e<C11053c> {

        /* renamed from: a */
        public static final C23120c f61542a = new C23120c();

        C23120c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C11053c cVar = (C11053c) obj;
            C52711k.m112236a((Object) cVar, "it");
            C52711k.m112240b(cVar, "sessionChangeEvent");
            switch (C29632b.f77488a[cVar.f29679a.ordinal()]) {
                case 1:
                    if (!C29631a.f77486a) {
                        C29631a.f77486a = true;
                        C18898c.m46009a(C11010c.m22280a(), "monitor", "launch");
                        return;
                    }
                    break;
                case 2:
                    C23223a.m57034a("monitor", "launch", cVar.f29681c);
                    C23794bh.m58410x().uploadAccountNum(false);
                    return;
                case 3:
                    C18898c.m46009a(C11010c.m22280a(), "monitor", "terminate");
                    C23223a.m57034a("monitor", "terminate", cVar.f29681c);
                    C29631a.f77486a = false;
                    if (C23097c.m56658a()) {
                        C23097c.m56659b().mo47839c();
                        break;
                    }
                    break;
            }
        }
    }
}
