package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import com.bytedance.common.utility.C9423k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.d */
public abstract class C11060d {

    /* renamed from: a */
    public final Application f29692a;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.d$a */
    public interface C11061a {
        /* renamed from: a */
        C9423k mo20045a();
    }

    /* renamed from: a */
    public abstract C11061a mo20043a();

    /* renamed from: b */
    public abstract boolean mo20044b();

    public C11060d(Application application) {
        C52711k.m112240b(application, "application");
        this.f29692a = application;
    }
}
