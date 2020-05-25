package com.bytedance.ies.bullet.p628b.p633e.p634a;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import com.bytedance.ies.bullet.p628b.p637g.C10324a;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.a.h */
public interface C10273h extends C10324a {

    /* renamed from: com.bytedance.ies.bullet.b.e.a.h$a */
    public static final class C10274a extends Exception {
        public C10274a(String str) {
            C52711k.m112240b(str, "scope");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found");
            super(sb.toString());
        }
    }

    /* renamed from: a */
    void mo18306a(C10273h hVar, boolean z);

    /* renamed from: a */
    void mo18307a(C52682m<? super List<? extends C10273h>, ? super C10268e, C52860x> mVar);

    /* renamed from: a */
    void mo18308a(List<String> list, JSONObject jSONObject, C10270b bVar, C52671b<? super Throwable, C52860x> bVar2);

    /* renamed from: b */
    String mo18309b();

    /* renamed from: c */
    Map<String, C10273h> mo18310c();

    /* renamed from: d */
    Map<String, C10268e> mo18311d();
}
