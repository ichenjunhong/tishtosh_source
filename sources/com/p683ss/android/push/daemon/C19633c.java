package com.p683ss.android.push.daemon;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p683ss.android.message.MessageReceiver;
import com.p683ss.android.message.NotifyService;
import com.p683ss.android.push.daemon.C19630b.C19631a;
import com.p683ss.android.push.daemon.C19630b.C19632b;
import com.p683ss.android.pushmanager.setting.C19710b;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.daemon.c */
public class C19633c {

    /* renamed from: c */
    static C19630b f54077c;

    /* renamed from: f */
    private static volatile C19633c f54078f;

    /* renamed from: a */
    Context f54079a;

    /* renamed from: b */
    C19637e f54080b;

    /* renamed from: d */
    boolean f54081d;

    /* renamed from: e */
    C19634a f54082e;

    /* renamed from: com.ss.android.push.daemon.c$a */
    class C19634a {

        /* renamed from: a */
        long f54083a;

        /* renamed from: b */
        long f54084b;

        /* renamed from: c */
        long f54085c;

        C19634a(Context context) {
            try {
                String a = C19710b.m48173a().f54262b.mo41081a("push_daemon_monitor", "");
                if (!TextUtils.isEmpty(a)) {
                    JSONObject jSONObject = new JSONObject(a);
                    this.f54084b = jSONObject.optLong("start", 0);
                    if (DateUtils.isToday(this.f54084b)) {
                        this.f54083a = jSONObject.optLong("duration", 0);
                        this.f54085c = jSONObject.optLong("end", 0);
                        return;
                    }
                    C19710b.m48173a().mo41089a(a);
                    this.f54084b = 0;
                    this.f54085c = 0;
                    this.f54083a = 0;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.push.daemon.c$b */
    class C19635b implements C19632b {
        /* renamed from: a */
        public final void mo40941a() {
            if (C19633c.this.f54082e != null) {
                C19634a aVar = C19633c.this.f54082e;
                Context context = C19633c.this.f54079a;
                aVar.f54085c = System.currentTimeMillis();
                if (aVar.f54085c >= aVar.f54084b) {
                    aVar.f54083a += aVar.f54085c - aVar.f54084b;
                }
                try {
                    if (aVar.f54084b > 0) {
                        if (aVar.f54085c > 0) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("start", aVar.f54084b);
                            jSONObject.put("end", aVar.f54085c);
                            jSONObject.put("duration", aVar.f54083a);
                            C19710b a = C19710b.m48173a();
                            a.f54262b.mo41080a().mo41074a("push_daemon_monitor", jSONObject.toString()).mo41076a();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        C19635b() {
        }
    }

    /* renamed from: c */
    private static boolean m47984c() {
        C19710b.m48173a();
        return true;
    }

    /* renamed from: b */
    private static boolean m47983b() {
        return C19710b.m48173a().mo41101j();
    }

    /* renamed from: a */
    public final void mo40945a() {
        if (VERSION.SDK_INT >= 21 && Boolean.valueOf(C19710b.m48173a().mo41099h()).booleanValue() && m47984c() && !m47983b()) {
            try {
                if (!this.f54081d) {
                    this.f54081d = true;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static C19633c m47982a(Context context) {
        if (f54078f == null) {
            synchronized (C19633c.class) {
                if (f54078f == null) {
                    f54078f = new C19633c(context);
                }
            }
        }
        return f54078f;
    }

    private C19633c(Context context) {
        this.f54079a = context;
        try {
            if (f54077c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f54079a.getPackageName());
                sb.append(":push");
                C19631a aVar = new C19631a(sb.toString(), NotifyService.class.getCanonicalName(), MessageReceiver.class.getCanonicalName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f54079a.getPackageName());
                sb2.append(":pushservice");
                f54077c = new C19630b(aVar, new C19631a(sb2.toString(), PushService.class.getCanonicalName(), PushReceiver.class.getCanonicalName()), new C19635b());
            }
            this.f54080b = new C19625a(f54077c);
            this.f54082e = new C19634a(context);
        } catch (Throwable unused) {
        }
    }
}
