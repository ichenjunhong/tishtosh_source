package com.p683ss.android.ugc.aweme.requesttask.p2116a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.b */
public final class C41238b implements C35889c {

    /* renamed from: a */
    public static boolean f104682a = true;

    /* renamed from: b */
    public static final C41239a f104683b = new C41239a(null);

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.b$a */
    public static final class C41239a {
        private C41239a() {
        }

        public /* synthetic */ C41239a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.b$b */
    static final class C41240b implements Runnable {

        /* renamed from: a */
        public static final C41240b f104684a = new C41240b();

        C41240b() {
        }

        public final void run() {
            int i;
            if (C41238b.f104682a) {
                i = 1;
            } else {
                i = 5;
            }
            C38046d.m85101a(false, i);
            C41238b.f104682a = false;
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = C41240b.f104684a;
        C23098h hVar = C23098h.f61512f;
        String str = "fetch_notice_count";
        C52711k.m112240b(str, "apiName");
        long a = hVar.mo47840a(str);
        if (a == 60000) {
            a = 0;
        }
        handler.postDelayed(runnable, a);
    }
}
