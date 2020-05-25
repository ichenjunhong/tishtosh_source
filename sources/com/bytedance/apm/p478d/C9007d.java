package com.bytedance.apm.p478d;

import android.text.TextUtils;
import com.bytedance.apm.core.C8989b;
import com.bytedance.apm.p479e.C9011a;
import com.bytedance.apm.p486i.C9050a;
import com.bytedance.apm.p486i.C9051b;
import com.bytedance.apm.p486i.C9052c;
import com.bytedance.apm.p486i.C9053d;
import com.bytedance.apm.p501q.C9196m;
import com.bytedance.frameworks.core.p577a.C9925b;
import com.bytedance.services.apm.api.C13221d;
import com.bytedance.services.apm.api.IHttpService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d.d */
public final class C9007d {

    /* renamed from: a */
    public List<String> f24519a;

    /* renamed from: b */
    public List<String> f24520b;

    /* renamed from: c */
    public List<String> f24521c;

    /* renamed from: d */
    public C9052c f24522d;

    /* renamed from: e */
    public final boolean f24523e;

    /* renamed from: f */
    public final boolean f24524f;

    /* renamed from: g */
    public final boolean f24525g;

    /* renamed from: h */
    public final boolean f24526h;

    /* renamed from: i */
    public final boolean f24527i;

    /* renamed from: j */
    public final boolean f24528j;

    /* renamed from: k */
    public final long f24529k;

    /* renamed from: l */
    public final boolean f24530l;

    /* renamed from: m */
    public final boolean f24531m;

    /* renamed from: n */
    public final boolean f24532n;

    /* renamed from: o */
    public final JSONObject f24533o;

    /* renamed from: p */
    public final C8989b f24534p;

    /* renamed from: q */
    public final IHttpService f24535q;

    /* renamed from: r */
    public final Set<Object> f24536r;

    /* renamed from: s */
    public final long f24537s;

    /* renamed from: t */
    public final C9051b f24538t;

    /* renamed from: u */
    public final C9050a f24539u;

    /* renamed from: v */
    public final C9053d f24540v;

    /* renamed from: w */
    public final ExecutorService f24541w;

    /* renamed from: x */
    public final C13221d f24542x;

    /* renamed from: com.bytedance.apm.d.d$a */
    public static final class C9009a {

        /* renamed from: a */
        boolean f24543a;

        /* renamed from: b */
        boolean f24544b;

        /* renamed from: c */
        boolean f24545c;

        /* renamed from: d */
        boolean f24546d;

        /* renamed from: e */
        long f24547e = 2500;

        /* renamed from: f */
        boolean f24548f;

        /* renamed from: g */
        boolean f24549g;

        /* renamed from: h */
        boolean f24550h = true;

        /* renamed from: i */
        boolean f24551i;

        /* renamed from: j */
        boolean f24552j;

        /* renamed from: k */
        public List<String> f24553k = C9011a.f24568a;

        /* renamed from: l */
        public List<String> f24554l = C9011a.f24570c;

        /* renamed from: m */
        public List<String> f24555m = C9011a.f24573f;

        /* renamed from: n */
        JSONObject f24556n = new JSONObject();

        /* renamed from: o */
        public C8989b f24557o;

        /* renamed from: p */
        public IHttpService f24558p;

        /* renamed from: q */
        Set<Object> f24559q = new HashSet();

        /* renamed from: r */
        public long f24560r = 10;

        /* renamed from: s */
        public C9051b f24561s;

        /* renamed from: t */
        public C9050a f24562t;

        /* renamed from: u */
        C9053d f24563u;

        /* renamed from: v */
        ExecutorService f24564v;

        /* renamed from: w */
        C9052c f24565w;

        /* renamed from: x */
        C13221d f24566x = new C13221d() {
            /* renamed from: a */
            public final byte[] mo16335a(byte[] bArr) {
                return C9925b.m19906a(bArr, bArr.length);
            }
        };

        /* renamed from: a */
        public final C9007d mo16334a() {
            if (!TextUtils.isEmpty(this.f24556n.optString("aid"))) {
                C9196m.m18270a(this.f24556n.optString("app_version"), "app_version");
                C9196m.m18270a(this.f24556n.optString("update_version_code"), "update_version_code");
                C9196m.m18270a(this.f24556n.optString("device_id"), "device_id");
                return new C9007d(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("aid");
            sb.append(" must not be empty");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final C9009a mo16333a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = this.f24556n;
                if (jSONObject2 != null) {
                    if (jSONObject != null) {
                        Iterator keys = jSONObject.keys();
                        if (keys != null) {
                            while (keys.hasNext()) {
                                String str = (String) keys.next();
                                if (!jSONObject.isNull(str)) {
                                    jSONObject2.put(str, jSONObject.opt(str));
                                }
                            }
                        }
                    }
                }
                return this;
            } catch (JSONException unused) {
                return this;
            }
        }

        /* renamed from: a */
        public final C9009a mo16331a(String str, int i) {
            try {
                this.f24556n.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public final C9009a mo16332a(String str, String str2) {
            try {
                this.f24556n.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private C9007d(C9009a aVar) {
        this.f24533o = aVar.f24556n;
        this.f24532n = aVar.f24543a;
        this.f24534p = aVar.f24557o;
        this.f24519a = aVar.f24553k;
        this.f24535q = aVar.f24558p;
        this.f24524f = aVar.f24550h;
        this.f24523e = aVar.f24549g;
        this.f24526h = aVar.f24544b;
        this.f24527i = aVar.f24545c;
        this.f24528j = aVar.f24546d;
        this.f24529k = aVar.f24547e;
        this.f24531m = aVar.f24552j;
        this.f24536r = aVar.f24559q;
        this.f24520b = aVar.f24554l;
        this.f24521c = aVar.f24555m;
        this.f24537s = aVar.f24560r;
        this.f24530l = aVar.f24548f;
        this.f24525g = aVar.f24551i;
        this.f24539u = aVar.f24562t;
        this.f24538t = aVar.f24561s;
        this.f24540v = aVar.f24563u;
        this.f24541w = aVar.f24564v;
        this.f24522d = aVar.f24565w;
        this.f24542x = aVar.f24566x;
    }
}
