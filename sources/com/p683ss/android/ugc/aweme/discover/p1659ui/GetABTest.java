package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.keva.Keva;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest */
public final class GetABTest extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C52668f f74751a = C52732g.m112286a(C52757k.NONE, C28439b.f74756a);

    /* renamed from: b */
    public static final Set<String> f74752b = C52555ag.m112064b("disable_hot_spot", "show_sort_and_filter", "use_profile_collection_tab", "use_profile_collection_tab_new_syle");

    /* renamed from: c */
    public static JSONObject f74753c;

    /* renamed from: d */
    public static final C28438a f74754d = new C28438a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest$a */
    public static final class C28438a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f74755a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28438a.class), "KEVA_REPO", "getKEVA_REPO()Lcom/bytedance/keva/Keva;"))};

        private C28438a() {
        }

        /* renamed from: b */
        private static Keva m67504b() {
            return (Keva) GetABTest.f74751a.getValue();
        }

        /* renamed from: c */
        private static Set<String> m67505c() {
            String[] strArr;
            try {
                strArr = (String[]) C10193n.m20607a().mo18202a(GetABTestSettings.class, "hybrid_get_ab_test", C10181b.m20511a().mo18175c().getHybridGetAbTest(), "java.lang.String[]", String[].class);
            } catch (Throwable unused) {
                strArr = null;
            }
            if (strArr != null) {
                C52575l.m112109a((Collection) GetABTest.f74752b, (Object[]) strArr);
            }
            return GetABTest.f74752b;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            return new org.json.JSONObject();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized org.json.JSONObject mo58048a() {
            /*
                r4 = this;
                monitor-enter(r4)
                org.json.JSONObject r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest.f74753c     // Catch:{ all -> 0x002d }
                if (r0 == 0) goto L_0x0013
                org.json.JSONObject r0 = com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest.f74753c     // Catch:{ all -> 0x002d }
                if (r0 == 0) goto L_0x000b
                monitor-exit(r4)
                return r0
            L_0x000b:
                d.u r0 = new d.u     // Catch:{ all -> 0x002d }
                java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
                r0.<init>(r1)     // Catch:{ all -> 0x002d }
                throw r0     // Catch:{ all -> 0x002d }
            L_0x0013:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0026 }
                com.bytedance.keva.Keva r1 = m67504b()     // Catch:{ Exception -> 0x0026 }
                java.lang.String r2 = "hybrid_abtest"
                java.lang.String r3 = ""
                java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ Exception -> 0x0026 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0026 }
                monitor-exit(r4)
                return r0
            L_0x0026:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x002d }
                r0.<init>()     // Catch:{ all -> 0x002d }
                monitor-exit(r4)
                return r0
            L_0x002d:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest.C28438a.mo58048a():org.json.JSONObject");
        }

        public /* synthetic */ C28438a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final synchronized void mo58049a(C18085o oVar) {
            C52711k.m112240b(oVar, "rawJson");
            JSONObject jSONObject = null;
            C18082l b = oVar.mo35022b("data");
            if (b != null) {
                String lVar = b.toString();
                if (lVar != null) {
                    jSONObject = new JSONObject(lVar);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                for (String str : m67505c()) {
                    Object opt = jSONObject.opt(str);
                    if (opt != null) {
                        jSONObject2.put(str, opt);
                    }
                }
            }
            GetABTest.f74753c = jSONObject2;
            m67504b().storeString("hybrid_abtest", jSONObject2.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.GetABTest$b */
    static final class C28439b extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C28439b f74756a = new C28439b();

        C28439b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepoSync("repo_hybrid_abtests", 0);
        }
    }

    public GetABTest() {
    }

    public GetABTest(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.optJSONArray("ab_test_names");
            } catch (Exception e) {
                C28668d.m67931a(e, "getABTestParams");
                aVar.mo60038a(0, e.getMessage());
                return;
            }
        } else {
            jSONArray = null;
        }
        JSONObject a = f74754d.mo58048a();
        if (jSONArray == null) {
            aVar.mo60039a((Object) a.toString());
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                Object opt = a.opt(optString);
                if (opt != null) {
                    jSONObject2.put(optString, opt);
                }
            }
        }
        aVar.mo60039a((Object) jSONObject2.toString());
    }
}
