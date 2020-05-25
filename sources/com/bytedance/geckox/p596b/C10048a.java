package com.bytedance.geckox.p596b;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.p612j.C10120b;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.geckox.b.a */
public final class C10048a {

    /* renamed from: a */
    public final C10120b f27312a;

    /* renamed from: b */
    public final List<Pair<String, C10050a>> f27313b;

    /* renamed from: c */
    public final String f27314c;

    /* renamed from: d */
    public final String f27315d;

    /* renamed from: e */
    public final String f27316e;

    /* renamed from: f */
    public final String f27317f;

    /* renamed from: g */
    public final File f27318g;

    /* renamed from: h */
    public final String[] f27319h;

    /* renamed from: i */
    public final Application f27320i;

    /* renamed from: j */
    private final Long f27321j;

    /* renamed from: com.bytedance.geckox.b.a$a */
    public enum C10050a {
        ONLINE(1, "线上"),
        LOCAL_TEST(0, "内测");
        

        /* renamed from: a */
        int f27323a;

        /* renamed from: b */
        String f27324b;

        public final String getValue() {
            return this.f27324b;
        }

        private C10050a(int i, String str) {
            this.f27323a = i;
            this.f27324b = str;
        }
    }

    /* renamed from: com.bytedance.geckox.b.a$b */
    public static class C10051b {

        /* renamed from: a */
        public C10120b f27325a;

        /* renamed from: b */
        public List<Pair<String, C10050a>> f27326b;

        /* renamed from: c */
        public Long f27327c;

        /* renamed from: d */
        public String f27328d;

        /* renamed from: e */
        public String f27329e;

        /* renamed from: f */
        public File f27330f;

        /* renamed from: g */
        public String f27331g;

        /* renamed from: h */
        public String f27332h;

        /* renamed from: i */
        public Application f27333i;

        /* renamed from: j */
        public String[] f27334j;

        public C10051b(Application application) {
            this.f27333i = application;
        }
    }

    private C10048a(C10051b bVar) {
        this.f27320i = bVar.f27333i;
        if (this.f27320i != null) {
            this.f27313b = bVar.f27326b;
            this.f27321j = bVar.f27327c;
            this.f27314c = bVar.f27328d;
            this.f27316e = bVar.f27331g;
            this.f27317f = bVar.f27332h;
            this.f27318g = bVar.f27330f;
            this.f27319h = bVar.f27334j;
            if (this.f27313b == null || this.f27313b.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            } else if (this.f27321j == null) {
                throw new IllegalArgumentException("appId == null");
            } else if (!TextUtils.isEmpty(this.f27314c)) {
                this.f27312a = bVar.f27325a;
                this.f27315d = bVar.f27329e;
                if (TextUtils.isEmpty(this.f27315d)) {
                    throw new IllegalArgumentException("host == empty");
                } else if (this.f27319h == null || this.f27319h.length <= 0) {
                    throw new IllegalArgumentException("groupType == empty");
                }
            } else {
                throw new IllegalArgumentException("deviceId key empty");
            }
        } else {
            throw new IllegalArgumentException("application is empty");
        }
    }
}
