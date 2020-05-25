package com.twitter.sdk.android.core;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.twitter.sdk.android.core.internal.C52094a;
import com.twitter.sdk.android.core.internal.C52094a.C52095a;
import com.twitter.sdk.android.core.internal.C52094a.C52095a.C520961;
import com.twitter.sdk.android.core.internal.C52094a.C52097b;
import com.twitter.sdk.android.core.internal.C52120m;
import com.twitter.sdk.android.core.internal.C52120m.C521211;
import com.twitter.sdk.android.core.internal.scribe.C52143a;
import com.twitter.sdk.android.core.internal.scribe.C52154ae;

/* renamed from: com.twitter.sdk.android.core.s */
final /* synthetic */ class C52226s implements Runnable {

    /* renamed from: a */
    static final Runnable f130057a = new C52226s();

    private C52226s() {
    }

    public final void run() {
        C52225r rVar = C52225r.f130048a;
        rVar.f130049b.mo108768a();
        rVar.f130050c.mo108768a();
        rVar.mo108950c();
        C52143a aVar = new C52143a(rVar.f130053f, rVar.f130049b, rVar.mo108950c(), C52190l.m111617a().f129905c, C52143a.m111517a("TwitterCore", C52225r.m111639b()));
        C52154ae.f129818a = aVar;
        C52120m<C52231v> mVar = rVar.f130051d;
        C52094a aVar2 = C52190l.m111617a().f129908f;
        C521211 r2 = new C52097b() {
            /* renamed from: a */
            public final void mo108805a(Activity activity) {
                C52120m.this.mo108821a();
            }
        };
        if (aVar2.f129699a != null) {
            C52095a aVar3 = aVar2.f129699a;
            if (aVar3.f129701b != null) {
                C520961 r1 = new ActivityLifecycleCallbacks(r2) {

                    /* renamed from: a */
                    final /* synthetic */ C52097b f129702a;

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStopped(Activity activity) {
                    }

                    public final void onActivityStarted(Activity activity) {
                        this.f129702a.mo108805a(activity);
                    }

                    {
                        this.f129702a = r2;
                    }
                };
                aVar3.f129701b.registerActivityLifecycleCallbacks(r1);
                aVar3.f129700a.add(r1);
            }
        }
    }
}
