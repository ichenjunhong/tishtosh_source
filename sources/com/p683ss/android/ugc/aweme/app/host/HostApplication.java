package com.p683ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.content.Context;
import com.bytedance.apm.agent.instrumentation.AppInstrumentation;
import com.p683ss.android.ugc.aweme.lancet.C18991l;
import com.p683ss.android.ugc.p2411b.p2412a.p2413a.C48495a;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import dagger.android.C52871b;
import dagger.android.C52874c;
import dagger.android.C52876d;

/* renamed from: com.ss.android.ugc.aweme.app.host.HostApplication */
public class HostApplication extends TrillApplication implements C52876d {

    /* renamed from: e */
    public C52874c<Activity> f61520e;

    /* renamed from: f */
    public C48495a f61521f;

    public void attachBaseContext(Context context) {
        AppInstrumentation.attachBaseContextStart();
        super.attachBaseContext(context);
        AppInstrumentation.attachBaseContextEnd();
    }

    /* renamed from: e */
    public final C52871b<Activity> mo47846e() {
        return this.f61520e;
    }

    public void onCreate() {
        AppInstrumentation.onCreateStart();
        super.onCreate();
        AppInstrumentation.onCreateEnd();
    }

    /* renamed from: d */
    public final void mo47845d() {
        C18991l.f52296c = this;
        Keep.emptyMethod();
    }

    public HostApplication() {
        AppInstrumentation.initStart();
        AppInstrumentation.initEnd();
    }
}
