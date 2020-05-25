package com.p683ss.android.ugc.aweme.app.launch;

import android.content.Context;
import android.os.AsyncTask;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9384a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.bytedance.ies.ugc.statisticlogger.config.C11059c;
import com.bytedance.ttnet.p887e.C13330e;
import com.p683ss.android.ugc.aweme.p1434bg.C23792a;
import org.greenrobot.eventbus.C53755c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.launch.c */
public final class C23121c {

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$a */
    public static final class C23122a<T> implements C1715j<C11059c> {

        /* renamed from: a */
        public static final C23122a f61543a = new C23122a();

        C23122a() {
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

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$b */
    public static final class C23123b<T> implements C1710e<C11059c> {

        /* renamed from: a */
        final /* synthetic */ Context f61544a;

        public C23123b(Context context) {
            this.f61544a = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            C11059c cVar = (C11059c) obj;
            Context context = this.f61544a;
            if (C11016e.m22312g() == null) {
                System.currentTimeMillis();
            }
            if (!C9431p.m18664a(C11049a.m22366b()) && !C9431p.m18664a(C11049a.m22367c())) {
                C9384a.m18565a(new C23124c(context), new Void[0]);
            }
            C53755c.m114319a().mo112960d(new C23792a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$c */
    public static final class C23124c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f61545a;

        C23124c(Context context) {
            this.f61545a = context;
        }

        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C52711k.m112240b((Void[]) objArr, "params");
            C13330e.m26852a(this.f61545a, C11049a.m22368d());
            return null;
        }
    }
}
