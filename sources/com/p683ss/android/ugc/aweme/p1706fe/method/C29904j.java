package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.sensitiveserver.C41485a;
import com.p683ss.android.ugc.aweme.sensitiveserver.C41485a.C41486a;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.fe.method.j */
final /* synthetic */ class C29904j implements Callable {

    /* renamed from: a */
    private final C29881e f78039a;

    /* renamed from: b */
    private final File f78040b;

    C29904j(C29881e eVar, File file) {
        this.f78039a = eVar;
        this.f78040b = file;
    }

    public final Object call() {
        C41485a.m91309a(this.f78040b, "1", "qualification_photo", "1", new C41486a() {
            /* renamed from: a */
            public final void mo60098a() {
                C29881e.this.mo60096a("image", C29881e.this.mo60093a(0, "", ""));
            }

            /* renamed from: a */
            public final void mo60099a(String str, String str2) {
                new Handler(Looper.getMainLooper()).post(new C29905k(this, str, str2));
            }
        });
        return null;
    }
}
