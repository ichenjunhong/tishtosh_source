package com.bytedance.ies.p675g.p678c;

import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.e */
public interface C10830e {

    /* renamed from: com.bytedance.ies.g.c.e$a */
    public interface C10831a {
        /* renamed from: a */
        void mo19612a(C10832b bVar);

        /* renamed from: a */
        void mo19613a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.g.c.e$b */
    public static final class C10832b {

        /* renamed from: a */
        public Map<String, String> f29095a;

        /* renamed from: b */
        public byte[] f29096b;

        /* renamed from: a */
        public final Map<String, String> mo19614a() {
            Map<String, String> map = this.f29095a;
            if (map == null) {
                C52711k.m112237a("headerMap");
            }
            return map;
        }

        /* renamed from: b */
        public final byte[] mo19617b() {
            byte[] bArr = this.f29096b;
            if (bArr == null) {
                C52711k.m112237a("body");
            }
            return bArr;
        }

        /* renamed from: a */
        public final void mo19615a(Map<String, String> map) {
            C52711k.m112240b(map, "<set-?>");
            this.f29095a = map;
        }

        /* renamed from: a */
        public final void mo19616a(byte[] bArr) {
            C52711k.m112240b(bArr, "<set-?>");
            this.f29096b = bArr;
        }
    }

    /* renamed from: a */
    void mo10468a(String str, Map<String, String> map, C10831a aVar);

    /* renamed from: a */
    void mo10469a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C10831a aVar);
}
