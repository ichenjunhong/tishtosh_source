package com.p683ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35868f;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.app.launch.d */
public final class C23125d {

    /* renamed from: a */
    static long f61546a;

    /* renamed from: b */
    static long f61547b;

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$a */
    public static final class C23126a<T> implements C1710e<Activity> {

        /* renamed from: a */
        public static final C23126a f61548a = new C23126a();

        C23126a() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Activity activity = (Activity) obj;
            C23125d.f61547b = System.currentTimeMillis();
            C35868f b = C35857a.m81001b();
            b.mo74526a(new ResumeTask());
            b.mo74527a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$b */
    public static final class C23127b<T> implements C1710e<Activity> {

        /* renamed from: a */
        public static final C23127b f61549a = new C23127b();

        C23127b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Activity activity = (Activity) obj;
            C23125d.f61546a = System.currentTimeMillis();
        }
    }
}
