package com.p683ss.android.ugc.aweme.statistic;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.C9423k;
import com.bytedance.ies.ugc.statisticlogger.config.C11055b;
import com.bytedance.ies.ugc.statisticlogger.config.C11060d;
import com.bytedance.ies.ugc.statisticlogger.config.C11060d.C11061a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.statistic.a */
public final class C45710a {

    /* renamed from: com.ss.android.ugc.aweme.statistic.a$a */
    static final class C45711a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Application f115551a;

        C45711a(Application application) {
            this.f115551a = application;
        }

        public final /* synthetic */ Object call() {
            Bundle bundle = new Bundle();
            if (C18920g.m46048a(this.f115551a)) {
                bundle.putString("web_ua", RawURLGetter.m63083a("other"));
            }
            C45714b.m99523a(bundle);
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            bundle.putInt("filter_warn", d.mo47107d());
            AppLog.setCustomerHeader(bundle);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.statistic.a$b */
    public static final class C45712b extends C11060d {

        /* renamed from: b */
        final /* synthetic */ Application f115552b;

        /* renamed from: com.ss.android.ugc.aweme.statistic.a$b$a */
        public static final class C45713a implements C11061a {
            C45713a() {
            }

            /* renamed from: a */
            public final C9423k mo20045a() {
                return new AppLogNetworkClient();
            }
        }

        /* renamed from: b */
        public final boolean mo20044b() {
            return true;
        }

        /* renamed from: a */
        public final C11061a mo20043a() {
            return new C45713a();
        }

        C45712b(Application application, Application application2) {
            this.f115552b = application;
            super(application2);
        }
    }

    /* renamed from: a */
    public static final void m99519a(Application application) {
        C52711k.m112240b(application, "application");
        try {
            C0013i.m16a((Callable<TResult>) new C45711a<TResult>(application));
            C11055b.m22384a((C11060d) new C45712b(application, application));
        } catch (Exception unused) {
        }
    }
}
