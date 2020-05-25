package com.p683ss.android.ugc.aweme.p1468bu;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bu.h */
public class C24076h {

    /* renamed from: a */
    static C24078i f63910a = C24078i.m58916a().mo49843a();

    /* renamed from: b */
    static C24060b f63911b = null;

    /* renamed from: c */
    static C24062d f63912c = new C24062d() {
        /* renamed from: a */
        public final void mo49823a(JSONObject jSONObject) {
        }

        /* renamed from: a */
        public final boolean mo49824a() {
            return false;
        }

        /* renamed from: b */
        public final void mo49825b(JSONObject jSONObject) {
        }

        /* renamed from: b */
        public final boolean mo49826b() {
            return false;
        }

        /* renamed from: c */
        public final void mo49827c(JSONObject jSONObject) {
        }

        /* renamed from: c */
        public final boolean mo49828c() {
            return false;
        }

        /* renamed from: d */
        public final void mo49829d(JSONObject jSONObject) {
        }

        /* renamed from: d */
        public final boolean mo49830d() {
            return false;
        }
    };

    /* renamed from: d */
    private static volatile ExecutorService f63913d;

    /* renamed from: e */
    private static volatile ExecutorService f63914e;

    /* renamed from: f */
    private static volatile ExecutorService f63915f;

    /* renamed from: g */
    private static volatile ScheduledExecutorService f63916g;

    /* renamed from: h */
    private static volatile ExecutorService f63917h;

    /* renamed from: a */
    static C24078i m58897a() {
        return f63910a;
    }

    /* renamed from: b */
    public static C24062d m58901b() {
        return f63912c;
    }

    /* renamed from: c */
    public static ExecutorService m58902c() {
        if (f63913d == null) {
            synchronized (C24076h.class) {
                if (f63913d == null) {
                    f63913d = C24088n.m58933a().mo49848a(C24085m.m58928a(C24093p.IO).mo49847a(), true);
                }
            }
        }
        return f63913d;
    }

    /* renamed from: d */
    public static ExecutorService m58903d() {
        if (f63914e == null) {
            synchronized (C24076h.class) {
                if (f63914e == null) {
                    f63914e = C24088n.m58933a().mo49848a(C24085m.m58928a(C24093p.DEFAULT).mo49847a(), true);
                }
            }
        }
        return f63914e;
    }

    /* renamed from: e */
    public static ExecutorService m58904e() {
        if (f63915f == null) {
            synchronized (C24076h.class) {
                if (f63915f == null) {
                    f63915f = C24088n.m58933a().mo49848a(C24085m.m58928a(C24093p.BACKGROUND).mo49847a(), true);
                }
            }
        }
        return f63915f;
    }

    /* renamed from: f */
    public static ScheduledExecutorService m58905f() {
        if (f63916g == null) {
            synchronized (C24076h.class) {
                if (f63916g == null) {
                    f63916g = (ScheduledExecutorService) C24088n.m58933a().mo49848a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a(), true);
                }
            }
        }
        return f63916g;
    }

    /* renamed from: g */
    public static ExecutorService m58906g() {
        if (f63917h == null) {
            synchronized (C24076h.class) {
                if (f63917h == null) {
                    f63917h = C24088n.m58933a().mo49848a(C24085m.m58928a(C24093p.SERIAL).mo49847a(), true);
                }
            }
        }
        return f63917h;
    }

    /* renamed from: a */
    public static ExecutorService m58898a(C24085m mVar) {
        if (mVar.f63932a != C24093p.IO && mVar.f63932a != C24093p.DEFAULT && mVar.f63932a != C24093p.BACKGROUND) {
            return C24088n.m58933a().mo49848a(mVar, false);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static boolean m58899a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String contains : f63910a.f63920c) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m58900a(ExecutorService executorService) {
        if (executorService == m58902c() || executorService == m58903d() || executorService == m58904e() || executorService == m58905f() || executorService == m58906g()) {
            return true;
        }
        return false;
    }
}
