package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.twitter.sdk.android.core.internal.a */
public final class C52094a {

    /* renamed from: a */
    public final C52095a f129699a;

    /* renamed from: com.twitter.sdk.android.core.internal.a$a */
    public static class C52095a {

        /* renamed from: a */
        public final Set<ActivityLifecycleCallbacks> f129700a = new HashSet();

        /* renamed from: b */
        public final Application f129701b;

        C52095a(Application application) {
            this.f129701b = application;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.a$b */
    public static abstract class C52097b {
        /* renamed from: a */
        public void mo108805a(Activity activity) {
        }
    }

    public C52094a(Context context) {
        this.f129699a = new C52095a((Application) context.getApplicationContext());
    }
}
