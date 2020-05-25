package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.p686e.C10941f;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.k */
final class C10901k extends C10864a {

    /* renamed from: b */
    private C10900j f29259b;

    /* renamed from: c */
    private Map<String, C10957d> f29260c;

    /* renamed from: d */
    private C10898h f29261d;

    /* renamed from: e */
    private C10885e f29262e;

    public final void run() {
        this.f29259b.mo19698a(this.f29260c);
        String b = this.f29262e.mo19664b();
        C10941f.m22204a().mo19727a(b);
        if (C10941f.m22204a().f29355a) {
            this.f29259b.mo19697a((Iterable<C10957d>) this.f29260c.values(), this.f29262e.f29210d, this.f29262e.f29209c);
        } else {
            C10900j jVar = this.f29259b;
            Map<String, C10957d> map = this.f29260c;
            String str = this.f29262e.f29210d;
            String str2 = this.f29262e.f29209c;
            ArrayList<C10957d> arrayList = new ArrayList<>();
            if (map.size() > 0) {
                arrayList.addAll(map.values());
            }
            if (arrayList.size() > 0) {
                for (C10957d a : arrayList) {
                    C10900j.m22137a(a, str, str2);
                }
            }
        }
        C10941f.m22204a().mo19730b(b);
        this.f29261d.mo19667d();
    }

    public C10901k(C10900j jVar, Map<String, C10957d> map, C10885e eVar) {
        super(null);
        this.f29259b = jVar;
        this.f29260c = map;
        this.f29261d = eVar;
        this.f29262e = eVar;
    }
}
