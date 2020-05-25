package com.p683ss.android.ugc.aweme.tools.music.lrc;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47202e;
import com.p683ss.android.ugc.aweme.utils.C47710bc;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b */
public class C47207b {

    /* renamed from: c */
    private static C47207b f119172c;

    /* renamed from: a */
    public final int f119173a = 10;

    /* renamed from: b */
    public final int f119174b = 11;

    /* renamed from: d */
    private C17971f f119175d;

    /* renamed from: e */
    private C47710bc f119176e;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$a */
    class C47213a {

        /* renamed from: a */
        public int f119190a;

        /* renamed from: b */
        public List<C47205a> f119191b;

        C47213a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$b */
    public interface C47214b {
        /* renamed from: a */
        void mo94391a(String str, List<C47205a> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$c */
    public interface C47215c {
        /* renamed from: a */
        void mo94374a(int i, String str, JSONArray jSONArray);
    }

    /* renamed from: a */
    public static C47207b m102463a() {
        if (f119172c == null) {
            synchronized (C47207b.class) {
                if (f119172c == null) {
                    f119172c = new C47207b();
                }
            }
        }
        return f119172c;
    }

    /* renamed from: b */
    public static File m102465b() {
        File file = new File(C48016e.m103932a(), "lrc");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private C47207b() {
        try {
            this.f119176e = C47710bc.m103257a(m102465b(), 1, 1, 3145728);
            this.f119175d = C47202e.m102460a();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static JSONArray m102464a(List<C47205a> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < list.size()) {
            C47205a aVar = (C47205a) list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", aVar.f119170b);
                jSONObject.put("timeId", String.valueOf(aVar.f119169a));
                jSONArray.put(jSONObject);
                i++;
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private List<C47205a> m102466b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i != 11) {
            return (List) this.f119175d.mo34885a(str, new C17956a<ArrayList<C47205a>>() {
            }.f49843c);
        }
        C47205a aVar = new C47205a(0.0f, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023 A[SYNTHETIC, Splitter:B:17:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002a A[SYNTHETIC, Splitter:B:25:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.tools.music.lrc.C47205a> mo94446a(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            com.ss.android.ugc.aweme.utils.bc r1 = r2.f119176e     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            com.ss.android.ugc.aweme.utils.bc$c r3 = r1.mo94993a(r3)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r1 = 0
            java.io.InputStream r3 = r3.mo95015a(r1)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            java.lang.String r1 = com.p683ss.android.ugc.tools.utils.C50200d.m108340a(r3, r0)     // Catch:{ IOException -> 0x0028, all -> 0x001c }
            java.util.List r4 = r2.m102466b(r1, r4)     // Catch:{ IOException -> 0x0028, all -> 0x001c }
            if (r3 == 0) goto L_0x001b
            r3.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r4
        L_0x001c:
            r4 = move-exception
            r0 = r3
            goto L_0x0021
        L_0x001f:
            return r0
        L_0x0020:
            r4 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            throw r4
        L_0x0027:
            r3 = r0
        L_0x0028:
            if (r3 == 0) goto L_0x002d
            r3.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b.mo94446a(java.lang.String, int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.tools.music.lrc.C47205a> mo94447a(java.lang.String r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "url"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r1)     // Catch:{ Exception -> 0x006b }
            com.ss.android.ugc.aweme.services.IAVServiceProxy r1 = com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin()     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = "ServiceManager.get().get…ServiceProxy::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x006b }
            com.ss.android.ugc.aweme.services.IAVServiceProxy r1 = (com.p683ss.android.ugc.aweme.services.IAVServiceProxy) r1     // Catch:{ Exception -> 0x006b }
            com.ss.android.ugc.aweme.port.in.ac r1 = r1.getApplicationService()     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = "ServiceManager.get().get…       applicationService"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x006b }
            android.app.Application r1 = r1.mo74157c()     // Catch:{ Exception -> 0x006b }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x006b }
            boolean r1 = com.p683ss.android.ugc.aweme.tools.music.p2366e.C47199c.m102458a(r1)     // Catch:{ Exception -> 0x006b }
            if (r1 == 0) goto L_0x0063
            r1 = 0
            java.lang.String r4 = com.p683ss.android.common.util.NetworkUtils.executeGet(r1, r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r2 = "NetworkUtils.executeGet(0, url)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)     // Catch:{ Exception -> 0x006b }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x006b }
            if (r2 == 0) goto L_0x0037
            return r0
        L_0x0037:
            java.util.List r5 = r3.m102466b(r4, r5)     // Catch:{ Exception -> 0x006b }
            com.ss.android.ugc.aweme.utils.bc r2 = r3.f119176e     // Catch:{ Exception -> 0x0061 }
            com.ss.android.ugc.aweme.utils.bc$a r6 = r2.mo94996b(r6)     // Catch:{ Exception -> 0x0061 }
            if (r6 == 0) goto L_0x005b
            java.io.OutputStream r1 = r6.mo95004a(r1)     // Catch:{ Exception -> 0x0061 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0059 }
            r1.write(r4)     // Catch:{ Exception -> 0x0059 }
            r1.flush()     // Catch:{ Exception -> 0x0059 }
            r1.close()     // Catch:{ Exception -> 0x0059 }
            r6.mo95005a()     // Catch:{ Exception -> 0x0059 }
            r0 = r1
            goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            com.ss.android.ugc.aweme.utils.bc r4 = r3.f119176e     // Catch:{ Exception -> 0x0061 }
            r4.mo95001d()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0071
        L_0x0061:
            goto L_0x006c
        L_0x0063:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x006b }
            r4.<init>()     // Catch:{ Exception -> 0x006b }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ Exception -> 0x006b }
            throw r4     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            r5 = r0
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b.mo94447a(java.lang.String, int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final void mo94448a(final String str, final int i, C47214b bVar) {
        if (!TextUtils.isEmpty(str)) {
            final SoftReference softReference = new SoftReference(bVar);
            C0013i.m16a((Callable<TResult>) new Callable<List<C47205a>>() {
                public final /* synthetic */ Object call() throws Exception {
                    String a = C9395d.m18571a(str);
                    List a2 = C47207b.this.mo94446a(a, i);
                    if (!C9376b.m18558a((Collection<T>) a2)) {
                        return a2;
                    }
                    List a3 = C47207b.this.mo94447a(str, i, a);
                    if (!C9376b.m18558a((Collection<T>) a3)) {
                        return a3;
                    }
                    return null;
                }
            }).mo24b(new C0011g<List<C47205a>, C0013i<Void>>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    if (!(softReference == null || softReference.get() == null)) {
                        ((C47214b) softReference.get()).mo94391a(str, (List) iVar.mo34e());
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo94449a(final String str, final int i, C47215c cVar) {
        if (!TextUtils.isEmpty(str)) {
            final SoftReference softReference = new SoftReference(cVar);
            C0013i.m16a((Callable<TResult>) new Callable<C47213a>() {
                public final /* synthetic */ Object call() throws Exception {
                    C47213a aVar = new C47213a();
                    String a = C9395d.m18571a(str);
                    List<C47205a> a2 = C47207b.this.mo94446a(a, i);
                    if (!C9376b.m18558a((Collection<T>) a2)) {
                        aVar.f119190a = 1;
                        aVar.f119191b = a2;
                        return aVar;
                    }
                    List<C47205a> a3 = C47207b.this.mo94447a(str, i, a);
                    if (C9376b.m18558a((Collection<T>) a3)) {
                        return null;
                    }
                    aVar.f119190a = 2;
                    aVar.f119191b = a3;
                    return aVar;
                }
            }).mo24b(new C0011g<C47213a, C0013i<Void>>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    if (!(softReference == null || softReference.get() == null)) {
                        ((C47215c) softReference.get()).mo94374a(((C47213a) iVar.mo34e()).f119190a, str, C47207b.m102464a(((C47213a) iVar.mo34e()).f119191b));
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
    }
}
