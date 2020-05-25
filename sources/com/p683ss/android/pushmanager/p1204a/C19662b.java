package com.p683ss.android.pushmanager.p1204a;

import android.app.Service;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.common.utility.p526f.C9409b;
import com.p683ss.android.message.p1191b.C19470k;

/* renamed from: com.ss.android.pushmanager.a.b */
public final class C19662b {

    /* renamed from: com.ss.android.pushmanager.a.b$a */
    static class C19663a implements Callback {

        /* renamed from: a */
        Handler f54164a;

        /* renamed from: b */
        Callback f54165b;

        public final boolean handleMessage(Message message) {
            boolean z;
            if (message != null) {
                try {
                    if (this.f54165b != null) {
                        z = this.f54165b.handleMessage(message);
                    } else {
                        z = false;
                    }
                    if (!z && this.f54164a != null) {
                        this.f54164a.handleMessage(message);
                    }
                    return true;
                } catch (Throwable unused) {
                }
            }
            if (this.f54165b != null) {
                return this.f54165b.handleMessage(message);
            }
            return false;
        }

        public C19663a(Handler handler, Callback callback) {
            this.f54164a = handler;
            this.f54165b = callback;
        }
    }

    /* renamed from: a */
    public static void m48032a(Service service) {
        if (service instanceof JobService) {
            try {
                JobService jobService = (JobService) service;
                if (!C19470k.m47658c(jobService) && VERSION.SDK_INT >= 21 && VERSION.SDK_INT < 26) {
                    C9409b a = C9409b.m18609a((Object) jobService);
                    a.mo17054b("ensureHandler");
                    Handler handler = (Handler) a.mo17051a("mHandler", (Class<?>[]) new Class[]{Class.forName("android.app.job.JobService$JobHandler")}).f25654a;
                    if (handler != null) {
                        C9409b a2 = C9409b.m18609a((Object) handler);
                        a2.mo17050a("mCallback", (Object) new C19663a(handler, (Callback) a2.mo17051a("mCallback", (Class<?>[]) new Class[]{Callback.class}).f25654a));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
