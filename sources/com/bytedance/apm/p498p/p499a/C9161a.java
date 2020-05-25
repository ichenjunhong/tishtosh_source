package com.bytedance.apm.p498p.p499a;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.p.a.a */
public final class C9161a implements C9153b {

    /* renamed from: a */
    public final HashMap<String, C9163a> f25086a;

    /* renamed from: com.bytedance.apm.p.a.a$a */
    static class C9163a {

        /* renamed from: a */
        public String f25090a;

        /* renamed from: b */
        public float f25091b;

        /* renamed from: c */
        long f25092c = System.currentTimeMillis();

        /* renamed from: d */
        int f25093d = 1;

        C9163a(String str, float f) {
            this.f25090a = str;
            this.f25091b = f;
        }
    }

    /* renamed from: com.bytedance.apm.p.a.a$b */
    static class C9164b {

        /* renamed from: a */
        public static final C9161a f25094a = new C9161a();
    }

    /* renamed from: a */
    public static C9161a m18186a() {
        return C9164b.f25094a;
    }

    private C9161a() {
        this.f25086a = new HashMap<>();
        C9149b.m18170a().mo16523a((C9153b) this);
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        boolean z;
        float f;
        if (!this.f25086a.isEmpty()) {
            Iterator it = this.f25086a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                C9163a aVar = (C9163a) entry.getValue();
                if (j - aVar.f25092c > 120000) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    it.remove();
                    if (aVar.f25093d > 0) {
                        f = aVar.f25091b / ((float) aVar.f25093d);
                    } else {
                        f = -1.0f;
                    }
                    if (C8976c.m17751g()) {
                        StringBuilder sb = new StringBuilder("聚合 fps: ");
                        sb.append(str);
                        sb.append(" , value: ");
                        sb.append(f);
                        String[] strArr = {sb.toString()};
                    }
                    if (f > 0.0f) {
                        float f2 = 60.0f;
                        if (f <= 60.0f) {
                            f2 = f;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) f2);
                            JSONObject c = ApmDelegate.m17947a().mo16434c("fps");
                            c.put("scene", str);
                            C8936b.m17654a("fps", str, jSONObject, c, (JSONObject) null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16536a(final String str, final float f) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C9163a aVar = (C9163a) C9161a.this.f25086a.get(str);
                if (aVar == null) {
                    C9161a.this.f25086a.put(str, new C9163a(str, f));
                    return;
                }
                aVar.f25091b += f;
                aVar.f25093d++;
            }
        });
    }
}
