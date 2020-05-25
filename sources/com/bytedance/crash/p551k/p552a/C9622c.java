package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.C9544a;
import com.bytedance.crash.C9551b;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9588g;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p551k.C9644d;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9694f;
import com.bytedance.crash.p555n.C9715u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.a.c */
public abstract class C9622c {

    /* renamed from: a */
    protected C9571d f26270a;

    /* renamed from: b */
    protected Context f26271b;

    /* renamed from: c */
    protected C9588g f26272c = C9616k.m19147a().f26242a;

    /* renamed from: d */
    protected C9619b f26273d;

    /* renamed from: e */
    protected C9624d f26274e;

    /* renamed from: com.bytedance.crash.k.a.c$a */
    public interface C9623a {
        /* renamed from: a */
        C9584a mo17437a(int i, C9584a aVar);

        /* renamed from: a */
        C9584a mo17438a(int i, C9584a aVar, boolean z);

        /* renamed from: a */
        void mo17439a(Throwable th);
    }

    /* renamed from: a */
    public C9584a mo17452a(C9584a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo17453a() {
        return false;
    }

    /* renamed from: b */
    public int mo17466b() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo17468c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo17469d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17467c(C9584a aVar) {
        aVar.mo17398b(C9644d.m19234a(C9616k.m19156h().f26294g, C9616k.m19156h().f26295h));
    }

    /* renamed from: d */
    private C9584a m19177d(C9584a aVar) {
        aVar.mo17385a(C9616k.m19159k(), C9616k.f26235i);
        if (C9616k.m19158j()) {
            aVar.mo17395a("is_mp", (Object) Integer.valueOf(1));
        }
        try {
            aVar.mo17394a(null);
        } catch (Throwable unused) {
        }
        aVar.mo17399b((Map<Integer, String>) C9616k.f26232f);
        aVar.mo17395a("process_name", (Object) C9685a.m19318c(C9616k.m19154f()));
        return aVar;
    }

    /* renamed from: e */
    private C9584a m19178e(C9584a aVar) {
        if (!C9685a.m19317b(C9616k.m19154f())) {
            aVar.mo17395a("remote_process", (Object) Integer.valueOf(1));
        }
        aVar.mo17395a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.mo17386a(C9616k.m19157i());
        if (mo17468c() && this.f26273d != null) {
            aVar.mo17388a(this.f26273d);
        }
        try {
            aVar.mo17393a(null);
        } catch (Throwable unused) {
        }
        String str = C9616k.f26230d;
        if (str != null) {
            aVar.mo17395a("business", (Object) str);
        }
        aVar.mo17395a("is_background", (Object) Boolean.valueOf(true ^ C9685a.m19315a(this.f26271b)));
        return aVar;
    }

    /* renamed from: b */
    static void m19176b(C9584a aVar) {
        Map a = C9616k.m19147a().mo17446a();
        if (a != null) {
            if (a.containsKey("app_version")) {
                aVar.mo17395a("crash_version", a.get("app_version"));
            }
            if (a.containsKey("version_name")) {
                aVar.mo17395a("app_version", a.get("version_name"));
            }
            if (a.containsKey("version_code")) {
                try {
                    aVar.mo17395a("crash_version_code", (Object) Integer.valueOf(Integer.parseInt(a.get("version_code").toString())));
                } catch (Exception unused) {
                    aVar.mo17395a("crash_version_code", a.get("version_code"));
                }
            }
            if (a.containsKey("update_version_code")) {
                try {
                    aVar.mo17395a("crash_update_version_code", (Object) Integer.valueOf(Integer.parseInt(a.get("update_version_code").toString())));
                } catch (Exception unused2) {
                    aVar.mo17395a("crash_update_version_code", a.get("update_version_code"));
                }
            }
        }
    }

    /* renamed from: a */
    public C9584a mo17464a(int i, C9584a aVar) {
        if (aVar == null) {
            aVar = new C9584a();
        }
        int i2 = 0;
        switch (i) {
            case 0:
                m19177d(aVar);
                break;
            case 1:
                m19178e(aVar);
                C9551b b = C9616k.m19150b();
                List list = (List) b.f26023a.get(this.f26270a);
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = aVar.f26141a.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    aVar.mo17395a("custom", (Object) optJSONObject);
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        try {
                            C9544a aVar2 = (C9544a) list.get(i3);
                            long uptimeMillis = SystemClock.uptimeMillis();
                            C9584a.m19015a(optJSONObject, aVar2.mo17347a(this.f26270a));
                            StringBuilder sb = new StringBuilder("custom_cost_");
                            sb.append(aVar2.getClass().getName());
                            sb.append("_");
                            sb.append(hashMap.size());
                            hashMap.put(sb.toString(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                        } catch (Throwable th) {
                            C9584a.m19014a(optJSONObject, th);
                        }
                    }
                }
                try {
                    optJSONObject.put("fd_count", C9694f.m19344b());
                } catch (Throwable unused) {
                }
                C9551b b2 = C9616k.m19150b();
                List list2 = (List) b2.f26024b.get(this.f26270a);
                if (list2 != null) {
                    JSONObject optJSONObject2 = aVar.f26141a.optJSONObject("custom_long");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                        aVar.mo17395a("custom_long", (Object) optJSONObject2);
                    }
                    while (i2 < list2.size()) {
                        try {
                            C9544a aVar3 = (C9544a) list2.get(i2);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            C9584a.m19015a(optJSONObject2, aVar3.mo17347a(this.f26270a));
                            StringBuilder sb2 = new StringBuilder("custom_cost_");
                            sb2.append(aVar3.getClass().getName());
                            sb2.append("_");
                            sb2.append(hashMap.size());
                            hashMap.put(sb2.toString(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                        } catch (Throwable th2) {
                            C9584a.m19014a(optJSONObject2, th2);
                        }
                        i2++;
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    try {
                        optJSONObject.put((String) entry.getKey(), entry.getValue());
                    } catch (Throwable unused2) {
                    }
                }
                break;
            case 2:
                aVar.mo17389a(C9616k.m19147a().mo17450e());
                String str = "battery";
                if (this.f26274e != null) {
                    i2 = this.f26274e.f26275a;
                }
                aVar.mo17395a(str, (Object) Integer.valueOf(i2));
                aVar.mo17401c(C9616k.m19150b().f26025c);
                break;
            case 4:
                if (mo17453a()) {
                    mo17467c(aVar);
                    break;
                }
                break;
            case 5:
                if (mo17469d()) {
                    aVar.mo17404d(C9715u.m19452a(this.f26271b));
                    break;
                }
                break;
        }
        return aVar;
    }

    /* renamed from: a */
    public final C9584a mo17465a(C9584a aVar, C9623a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new C9584a();
        }
        C9584a aVar3 = aVar;
        C9584a aVar4 = aVar3;
        for (int i = 0; i < mo17466b(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar4 = aVar2.mo17437a(i, aVar4);
                } catch (Throwable th) {
                    aVar2.mo17439a(th);
                }
            }
            try {
                aVar4 = mo17464a(i, aVar4);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.mo17439a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != mo17466b() - 1) {
                        z2 = false;
                    }
                    aVar4 = aVar2.mo17438a(i, aVar4, z2);
                } catch (Throwable th3) {
                    aVar2.mo17439a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar3.mo17407e(aVar4.f26141a);
                    } else {
                        aVar3 = aVar4;
                    }
                    aVar4 = new C9584a();
                }
            }
            StringBuilder sb = new StringBuilder("step_cost_");
            sb.append(i);
            aVar3.mo17397b(sb.toString(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo17452a(aVar3);
    }

    C9622c(C9571d dVar, Context context, C9619b bVar, C9624d dVar2) {
        this.f26270a = dVar;
        this.f26271b = context;
        this.f26273d = bVar;
        this.f26274e = dVar2;
    }
}
