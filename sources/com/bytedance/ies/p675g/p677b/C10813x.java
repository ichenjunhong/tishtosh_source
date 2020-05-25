package com.bytedance.ies.p675g.p677b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.p675g.p677b.C10791k.C10792a;
import com.bytedance.ies.p675g.p677b.C10791k.C10792a.C10793a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.x */
final class C10813x {

    /* renamed from: a */
    private final Map<String, List<C10817b>> f29052a = new ConcurrentHashMap();

    /* renamed from: b */
    private final LruCache<String, C10818c> f29053b;

    /* renamed from: c */
    private final C10792a f29054c;

    /* renamed from: d */
    private final String f29055d;

    /* renamed from: e */
    private volatile boolean f29056e = false;

    /* renamed from: com.bytedance.ies.g.b.x$a */
    static class C10816a extends IllegalStateException {
        C10816a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ies.g.b.x$b */
    static final class C10817b {

        /* renamed from: a */
        Pattern f29061a;

        /* renamed from: b */
        C10824z f29062b;

        /* renamed from: c */
        List<String> f29063c;

        /* renamed from: d */
        List<String> f29064d;

        private C10817b() {
        }
    }

    /* renamed from: com.bytedance.ies.g.b.x$c */
    static final class C10818c {

        /* renamed from: a */
        C10824z f29065a = C10824z.PUBLIC;

        /* renamed from: b */
        Set<String> f29066b = new HashSet();

        /* renamed from: c */
        Set<String> f29067c = new HashSet();

        C10818c() {
        }
    }

    /* renamed from: b */
    private static String m21951b(String str) {
        StringBuilder sb = new StringBuilder("com.bytedance.ies.web.jsbridge2.PermissionConfig.");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19595a(JSONObject jSONObject) {
        mo19596b(jSONObject);
        this.f29054c.mo19560a(m21951b(this.f29055d), jSONObject.toString());
    }

    /* renamed from: b */
    public final void mo19596b(JSONObject jSONObject) {
        this.f29052a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(C42311c.f106865i);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                LinkedList linkedList = new LinkedList();
                this.f29052a.put(str, linkedList);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(m21952c(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException unused) {
            new StringBuilder("Parse configurations failed, response: ").append(jSONObject.toString());
        }
        this.f29056e = true;
    }

    /* renamed from: a */
    private C10818c m21950a(String str) throws C10816a {
        C10818c cVar = new C10818c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        String str2 = null;
        if (authority != null) {
            String[] split = authority.split("[.]");
            int length = split.length;
            if (length >= 2) {
                if (length == 2) {
                    str2 = authority;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split[length - 2]);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(split[length - 1]);
                    str2 = sb.toString();
                }
            }
        }
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || str2 == null) {
            cVar.f29065a = C10824z.PUBLIC;
            return cVar;
        } else if (this.f29056e) {
            List<C10817b> list = (List) this.f29052a.get(str2);
            if (list == null) {
                return cVar;
            }
            for (C10817b bVar : list) {
                if (bVar.f29061a.matcher(builder).find()) {
                    if (bVar.f29062b.compareTo(cVar.f29065a) >= 0) {
                        cVar.f29065a = bVar.f29062b;
                    }
                    cVar.f29066b.addAll(bVar.f29063c);
                    cVar.f29067c.addAll(bVar.f29064d);
                }
            }
            return cVar;
        } else {
            throw new C10816a("Permission config is outdated!");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e A[LOOP:1: B:17:0x006e->B:19:0x0074, LOOP_START, PHI: r2 
      PHI: (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:16:0x006c, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.ies.p675g.p677b.C10813x.C10817b m21952c(org.json.JSONObject r6) throws org.json.JSONException {
        /*
            com.bytedance.ies.g.b.x$b r0 = new com.bytedance.ies.g.b.x$b
            r1 = 0
            r0.<init>()
            java.lang.String r1 = "pattern"
            java.lang.String r1 = r6.getString(r1)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.f29061a = r1
            java.lang.String r1 = "group"
            java.lang.String r1 = r6.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0038
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "protected"
            boolean r2 = android.text.TextUtils.equals(r2, r1)
            if (r2 == 0) goto L_0x002d
            com.bytedance.ies.g.b.z r1 = com.bytedance.ies.p675g.p677b.C10824z.PROTECTED
            goto L_0x003a
        L_0x002d:
            java.lang.String r2 = "private"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x0038
            com.bytedance.ies.g.b.z r1 = com.bytedance.ies.p675g.p677b.C10824z.PRIVATE
            goto L_0x003a
        L_0x0038:
            com.bytedance.ies.g.b.z r1 = com.bytedance.ies.p675g.p677b.C10824z.PUBLIC
        L_0x003a:
            r0.f29062b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f29063c = r1
            java.lang.String r1 = "included_methods"
            org.json.JSONArray r1 = r6.optJSONArray(r1)
            r2 = 0
            if (r1 == 0) goto L_0x005f
            r3 = 0
        L_0x004d:
            int r4 = r1.length()
            if (r3 >= r4) goto L_0x005f
            java.lang.String r4 = r1.getString(r3)
            java.util.List<java.lang.String> r5 = r0.f29063c
            r5.add(r4)
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f29064d = r1
            java.lang.String r1 = "excluded_methods"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 == 0) goto L_0x0080
        L_0x006e:
            int r1 = r6.length()
            if (r2 >= r1) goto L_0x0080
            java.lang.String r1 = r6.getString(r2)
            java.util.List<java.lang.String> r3 = r0.f29064d
            r3.add(r1)
            int r2 = r2 + 1
            goto L_0x006e
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p677b.C10813x.m21952c(org.json.JSONObject):com.bytedance.ies.g.b.x$b");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10818c mo19594a(String str, Set<String> set) {
        String authority = Uri.parse(str).getAuthority();
        C10818c cVar = new C10818c();
        if (authority == null || authority.isEmpty()) {
            cVar.f29065a = C10824z.PUBLIC;
            return cVar;
        }
        for (String str2 : set) {
            if (!authority.equals(str2)) {
                StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                sb.append(str2);
                if (authority.endsWith(sb.toString())) {
                }
            }
            cVar.f29065a = C10824z.PRIVATE;
            return cVar;
        }
        C10818c cVar2 = (C10818c) this.f29053b.get(str);
        if (cVar2 != null) {
            return cVar2;
        }
        return m21950a(str);
    }

    C10813x(String str, int i, C10792a aVar, final Executor executor, JSONObject jSONObject) {
        this.f29055d = str;
        if (i <= 0) {
            this.f29053b = new LruCache<>(16);
        } else {
            this.f29053b = new LruCache<>(i);
        }
        this.f29054c = aVar;
        if (jSONObject == null) {
            aVar.mo19559a(m21951b(str), (C10793a) new C10793a() {
                /* renamed from: a */
                public final void mo19561a(final String str) {
                    executor.execute(new Runnable() {
                        public final void run() {
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    C10813x.this.mo19596b(new JSONObject(str));
                                } catch (JSONException unused) {
                                    new StringBuilder("Parse configurations failed, local storage content: ").append(str);
                                }
                            }
                        }
                    });
                }
            });
        } else {
            mo19595a(jSONObject);
        }
    }
}
