package com.p683ss.caijing.globaliap.p2561e;

import android.text.TextUtils;
import com.p683ss.base.p2546a.C51153a;
import com.p683ss.base.p2546a.C51157d;
import com.p683ss.caijing.globaliap.p2561e.C51276c.C51277a;
import com.p683ss.caijing.globaliap.p2561e.C51276c.C51278b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.e.e */
public abstract class C51280e implements C51157d<JSONObject> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo101744a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<String, String> mo101746b();

    /* renamed from: a */
    public final void mo101675a(C51153a<? super JSONObject> aVar) {
        C51278b bVar;
        String a = mo101744a();
        if (!TextUtils.isEmpty(a)) {
            try {
                C51277a a2 = new C51277a().mo101800a(a);
                if (mo101746b() != null) {
                    bVar = a2.mo101801a(mo101746b()).f128048a.mo101799a();
                } else {
                    bVar = a2.f128048a.mo101799a();
                }
                if (bVar.f128049a == 200) {
                    try {
                        aVar.f127778a = new JSONObject(bVar.f128050b);
                        aVar.f127780c = true;
                    } catch (JSONException e) {
                        aVar.f127779b = e;
                    }
                } else {
                    new StringBuilder("result code is not 200:").append(bVar.f128049a);
                    C51275b bVar2 = new C51275b(bVar.f128050b);
                    bVar2.f128041a = bVar.f128049a;
                    aVar.f127779b = bVar2;
                }
            } catch (C51275b e2) {
                aVar.f127779b = e2;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
