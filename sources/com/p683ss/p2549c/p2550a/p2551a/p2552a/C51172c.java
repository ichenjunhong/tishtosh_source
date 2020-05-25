package com.p683ss.p2549c.p2550a.p2551a.p2552a;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.c.a.a.a.c */
public final class C51172c {

    /* renamed from: a */
    final String f127812a;

    /* renamed from: b */
    final String f127813b;

    /* renamed from: c */
    final C51171b f127814c;

    /* renamed from: d */
    final List<Pair<String, String>> f127815d;

    /* renamed from: com.ss.c.a.a.a.c$a */
    public static class C51174a {

        /* renamed from: a */
        public String f127816a;

        /* renamed from: b */
        public String f127817b;

        /* renamed from: c */
        public String f127818c;

        /* renamed from: d */
        public int f127819d;

        /* renamed from: e */
        public C51171b f127820e;

        /* renamed from: a */
        public final C51172c mo101706a() {
            return new C51172c(this);
        }
    }

    /* renamed from: com.ss.c.a.a.a.c$b */
    static class C51175b implements C51171b {
        private C51175b() {
        }

        /* renamed from: a */
        public final String mo14019a(String str) throws Exception {
            throw new RuntimeException("no implementation");
        }

        /* renamed from: a */
        public final String mo14020a(String str, byte[] bArr, String str2, String str3) throws Exception {
            throw new RuntimeException("no implementation");
        }
    }

    private C51172c(C51174a aVar) {
        String str;
        this.f127812a = aVar.f127816a;
        if (aVar.f127817b == null) {
            str = "http://i.snssdk.com";
        } else {
            str = aVar.f127817b;
        }
        this.f127813b = str;
        if (aVar.f127820e == null) {
            this.f127814c = new C51175b();
        } else {
            this.f127814c = aVar.f127820e;
        }
        this.f127815d = new ArrayList();
        if (this.f127812a != null) {
            this.f127815d.add(Pair.create("ProjectKey", this.f127812a));
        }
        if (aVar.f127818c != null) {
            this.f127815d.add(Pair.create("DeviceId", aVar.f127818c));
        }
    }
}
