package com.bytedance.ies.p675g.p677b;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.ies.g.b.k */
public interface C10791k {

    /* renamed from: com.bytedance.ies.g.b.k$a */
    public interface C10792a {

        /* renamed from: com.bytedance.ies.g.b.k$a$a */
        public interface C10793a {
            /* renamed from: a */
            void mo19561a(String str);
        }

        /* renamed from: a */
        void mo19559a(String str, C10793a aVar);

        /* renamed from: a */
        void mo19560a(String str, String str2);
    }

    /* renamed from: com.bytedance.ies.g.b.k$b */
    public interface C10794b {
        /* renamed from: a */
        void mo19562a(String str);

        /* renamed from: a */
        void mo19563a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.g.b.k$c */
    public interface C10795c {
        /* renamed from: a */
        boolean mo19564a(String str);

        /* renamed from: a */
        boolean mo19565a(String str, String str2);
    }

    /* renamed from: com.bytedance.ies.g.b.k$d */
    public enum C10796d {
        SG("https://jsb-sg.byteoversea.com/src/server/v2/package"),
        US("https://jsb-va.byteoversea.com/src/server/v2/package");
        
        public String url;

        private C10796d(String str) {
            this.url = str;
        }
    }

    /* renamed from: a */
    C10796d mo19550a();

    /* renamed from: a */
    void mo19551a(String str, Map<String, String> map, String str2, byte[] bArr, C10794b bVar);

    /* renamed from: b */
    int mo19552b();

    /* renamed from: c */
    String mo19553c();

    /* renamed from: d */
    String mo19554d();

    /* renamed from: e */
    String mo19555e();

    /* renamed from: f */
    Collection<String> mo19556f();

    /* renamed from: g */
    C10792a mo19557g();

    /* renamed from: h */
    Executor mo19558h();
}
