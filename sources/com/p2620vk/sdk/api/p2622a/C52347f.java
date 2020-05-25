package com.p2620vk.sdk.api.p2622a;

import com.p2620vk.sdk.api.p2622a.C52327a.C52330a;
import com.p2620vk.sdk.api.p2622a.C52333b.C52337a;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.a.f */
public class C52347f extends C52341d<JSONObject> {

    /* renamed from: f */
    public JSONObject f130341f;

    /* renamed from: com.vk.sdk.api.a.f$a */
    public static abstract class C52348a extends C52330a<C52347f, JSONObject> {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo109152c() {
        return this.f130341f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo109153d() {
        if (!super.mo109153d()) {
            return false;
        }
        this.f130341f = mo109158f();
        return true;
    }

    /* renamed from: f */
    public final JSONObject mo109158f() {
        if (this.f130341f == null) {
            String e = mo109154e();
            if (e == null) {
                return null;
            }
            try {
                this.f130341f = new JSONObject(e);
            } catch (Exception e2) {
                this.f130331d = e2;
            }
        }
        return this.f130341f;
    }

    public C52347f(C52337a aVar) {
        super(aVar);
    }
}
