package com.p683ss.android.ugc.aweme.sdk;

import android.util.Pair;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sdk.a */
public final class C41322a {

    /* renamed from: a */
    public C10757a f104783a;

    /* renamed from: b */
    String f104784b = "charge";

    /* renamed from: c */
    String f104785c = "walletAuth";

    /* renamed from: d */
    public Pair<String, C10762d> f104786d;

    /* renamed from: e */
    public Pair<String, C10762d> f104787e;

    /* renamed from: f */
    public Map<String, C10762d> f104788f;

    /* renamed from: com.ss.android.ugc.aweme.sdk.a$a */
    public static class C41323a {

        /* renamed from: a */
        private C10757a f104789a;

        /* renamed from: b */
        private C10762d f104790b;

        /* renamed from: c */
        private C10762d f104791c;

        /* renamed from: d */
        private Map<String, C10762d> f104792d;

        /* renamed from: a */
        public final C41322a mo83900a() {
            C41322a aVar = new C41322a();
            aVar.f104787e = new Pair<>(aVar.f104785c, this.f104791c);
            aVar.f104786d = new Pair<>(aVar.f104784b, this.f104790b);
            aVar.f104783a = this.f104789a;
            aVar.f104788f = this.f104792d;
            return aVar;
        }

        /* renamed from: a */
        public final C41323a mo83898a(C10757a aVar) {
            this.f104789a = aVar;
            return this;
        }

        /* renamed from: a */
        public final C41323a mo83899a(String str, C10762d dVar) {
            if (this.f104792d == null) {
                this.f104792d = new HashMap(3);
            }
            this.f104792d.put(str, dVar);
            return this;
        }
    }

    /* renamed from: a */
    public static C41323a m91092a() {
        return new C41323a();
    }
}
