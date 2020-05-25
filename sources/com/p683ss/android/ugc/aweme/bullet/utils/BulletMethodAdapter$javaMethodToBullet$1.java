package com.p683ss.android.ugc.aweme.bullet.utils;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.utils.BulletMethodAdapter$javaMethodToBullet$1 */
public final class BulletMethodAdapter$javaMethodToBullet$1 extends BaseBridgeMethod {

    /* renamed from: b */
    final /* synthetic */ C10762d f64648b;

    /* renamed from: c */
    final /* synthetic */ String f64649c;

    /* renamed from: d */
    final /* synthetic */ C10269a f64650d;

    /* renamed from: e */
    final /* synthetic */ C10326b f64651e;

    /* renamed from: f */
    private final String f64652f;

    /* renamed from: g */
    private C10269a f64653g;

    /* renamed from: h */
    private boolean f64654h = true;

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64653g;
    }

    /* renamed from: c */
    public final boolean mo18298c() {
        return this.f64654h;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64652f;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64653g = aVar;
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONObject optJSONObject = jSONObject.optJSONObject("res");
        C10766h a = m58998a(jSONObject);
        this.f64648b.call(a, optJSONObject);
        this.f64654h = a.f28951h;
    }

    BulletMethodAdapter$javaMethodToBullet$1(C10762d dVar, String str, C10269a aVar, C10326b bVar, C10326b bVar2) {
        this.f64648b = dVar;
        this.f64649c = str;
        this.f64650d = aVar;
        this.f64651e = bVar;
        super(bVar2);
        this.f64652f = str;
        this.f64653g = aVar;
    }
}
