package com.p683ss.android.ugc.aweme.main.dialogmanager;

import android.os.Handler;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.a */
public final class C36588a implements C27979p {

    /* renamed from: a */
    static boolean f93691a;

    /* renamed from: b */
    public static final C36588a f93692b = new C36588a();

    /* renamed from: com.ss.android.ugc.aweme.main.dialogmanager.a$a */
    static final class C36589a implements Runnable {

        /* renamed from: a */
        public static final C36589a f93693a = new C36589a();

        C36589a() {
        }

        public final void run() {
            C36588a aVar = C36588a.f93692b;
            if (!C36588a.f93691a) {
                C47718bf.m103288a(new C36590b());
            }
        }
    }

    private C36588a() {
    }

    /* renamed from: b */
    public final void mo47072b() {
        f93691a = true;
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        if (f93691a) {
            f93691a = false;
            new Handler().postDelayed(C36589a.f93693a, TimeUnit.SECONDS.toMillis(5));
        }
    }
}
