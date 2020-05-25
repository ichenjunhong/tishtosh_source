package com.bytedance.apm.p489l;

import android.os.Process;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.e */
public final class C9108e extends C9081a {

    /* renamed from: g */
    private static IFdCheck f24905g;

    /* renamed from: a */
    private int f24906a;

    /* renamed from: b */
    private long f24907b;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo16223d() {
        return this.f24907b;
    }

    public C9108e() {
        this.f24906a = 800;
        this.f24907b = 600000;
        this.f24812e = "fd";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo16225f() {
        super.mo16225f();
        if (System.currentTimeMillis() - C8976c.m17755k() > 1200000) {
            int i = 0;
            int myPid = Process.myPid();
            try {
                StringBuilder sb = new StringBuilder("/proc/");
                sb.append(myPid);
                sb.append("/fd");
                i = new File(sb.toString()).listFiles().length;
            } catch (Throwable unused) {
            }
            if (i != 0) {
                if (i <= 0 || i >= this.f24906a) {
                    if (f24905g == null) {
                        f24905g = (IFdCheck) C12401c.m24975a(IFdCheck.class);
                    }
                    IFdCheck iFdCheck = f24905g;
                    if (iFdCheck != null) {
                        try {
                            String a = C9190h.m18251a(iFdCheck.getFdList(), "\n");
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fd_count", i);
                            jSONObject.put("fd_detail", a);
                            jSONObject.put("is_main_process", C8976c.m17747c());
                            jSONObject.put("process_name", C8976c.m17745b());
                            m17983a(new C9024f("fd", null, null, jSONObject));
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("fd_count", i);
                        jSONObject2.put("is_main_process", C8976c.m17747c());
                        jSONObject2.put("process_name", C8976c.m17745b());
                        m17983a(new C9024f("fd", null, null, jSONObject2));
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        super.mo16219a(jSONObject);
        this.f24906a = jSONObject.optInt("fd_count_threshold", 800);
        this.f24907b = jSONObject.optLong("collect_interval", 10) * 60000;
    }
}
