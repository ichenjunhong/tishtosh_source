package com.p683ss.android.ugc.aweme.crossplatform.prefetch;

import com.bytedance.ies.p675g.p678c.C10830e;
import com.bytedance.ies.p675g.p678c.C10830e.C10831a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47809dg;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48307b;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48308c;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48309d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a */
public final class C27258a implements C10830e {

    /* renamed from: a */
    public static final C27258a f71921a = new C27258a();

    /* renamed from: b */
    private static C48308c f71922b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final CommonApi f71923c = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$a */
    static final class C27259a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f71924a;

        /* renamed from: b */
        final /* synthetic */ Map f71925b;

        C27259a(String str, Map map) {
            this.f71924a = str;
            this.f71925b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27273d call() {
            String a = C27258a.f71921a.mo55642a(this.f71924a, null);
            C48307b bVar = new C48307b("get", C27258a.f71921a.mo55642a(this.f71924a, null), null);
            try {
                ArrayList arrayList = new ArrayList();
                for (Entry entry : this.f71925b.entrySet()) {
                    arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                }
                String str = (String) C27258a.f71923c.doGet(a, null, (List<C12685b>) arrayList).execute().f33552b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("_raw", str);
                jSONObject.put("response", new JSONObject(str));
                return new C27273d(bVar, new C48309d(jSONObject, null));
            } catch (C19174b e) {
                JSONObject jSONObject2 = new JSONObject();
                C27258a.f71921a.mo55643a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
                return new C27273d(bVar, new C48309d(jSONObject2, e));
            } catch (C23459a e2) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e2.getResponse());
                } catch (JSONException unused) {
                }
                C27258a aVar = C27258a.f71921a;
                int errorCode = e2.getErrorCode();
                String errorMsg = e2.getErrorMsg();
                String prompt = e2.getPrompt();
                C52711k.m112236a((Object) prompt, "apiReturnWrong.prompt");
                aVar.mo55643a(jSONObject3, 0, errorCode, errorMsg, prompt, "");
                return new C27273d(bVar, new C48309d(jSONObject3, e2));
            } catch (Exception e3) {
                JSONObject jSONObject4 = new JSONObject();
                C27258a.f71921a.mo55643a(jSONObject4, 0, -408, e3.getMessage(), "", "");
                return new C27273d(bVar, new C48309d(jSONObject4, e3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$b */
    static final class C27260b<TTaskResult, TContinuationResult> implements C0011g<C27273d, Void> {

        /* renamed from: a */
        final /* synthetic */ C10831a f71926a;

        C27260b(C10831a aVar) {
            this.f71926a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r0 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.m65704a()
                r1 = 0
                if (r0 == 0) goto L_0x002d
                java.lang.String r2 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
                boolean r2 = r5.mo26b()
                if (r2 == 0) goto L_0x002d
                java.lang.Object r2 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r2 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r2
                if (r2 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.web.jsbridge.a.a$b r2 = r2.f71948a
                goto L_0x001e
            L_0x001d:
                r2 = r1
            L_0x001e:
                java.lang.Object r3 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r3 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r3
                if (r3 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.web.jsbridge.a.a$d r3 = r3.f71949b
                goto L_0x002a
            L_0x0029:
                r3 = r1
            L_0x002a:
                r0.mo49921a(r2, r3)
            L_0x002d:
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.Object r5 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r5 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r5
                if (r5 == 0) goto L_0x0041
                com.ss.android.ugc.aweme.web.jsbridge.a.a$d r5 = r5.f71949b
                if (r5 == 0) goto L_0x0041
                org.json.JSONObject r5 = r5.f121543a
                goto L_0x0042
            L_0x0041:
                r5 = r1
            L_0x0042:
                if (r5 == 0) goto L_0x008f
                java.lang.String r0 = "code"
                java.lang.Object r0 = r5.opt(r0)
                r2 = 1
                boolean r3 = r0 instanceof java.lang.Integer
                if (r3 != 0) goto L_0x0050
                goto L_0x008f
            L_0x0050:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r2 != r0) goto L_0x008f
                com.bytedance.ies.g.c.e$a r0 = r4.f71926a
                com.bytedance.ies.g.c.e$b r2 = new com.bytedance.ies.g.c.e$b
                r2.<init>()
                java.lang.String r3 = "response"
                java.lang.Object r5 = r5.opt(r3)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r3 = p2628d.p2650m.C52808d.f131043a
                if (r5 == 0) goto L_0x0087
                byte[] r5 = r5.getBytes(r3)
                java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
                r2.mo19616a(r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Map r5 = (java.util.Map) r5
                r2.mo19615a(r5)
                r0.mo19612a(r2)
                goto L_0x008f
            L_0x0087:
                d.u r5 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x008f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.C27260b.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$c */
    static final class C27261c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f71927a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f71928b;

        /* renamed from: c */
        final /* synthetic */ String f71929c;

        /* renamed from: d */
        final /* synthetic */ Map f71930d;

        C27261c(String str, JSONObject jSONObject, String str2, Map map) {
            this.f71927a = str;
            this.f71928b = jSONObject;
            this.f71929c = str2;
            this.f71930d = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27273d call() {
            String str;
            Collection collection;
            String a = C27258a.f71921a.mo55642a(this.f71927a, null);
            C48307b bVar = new C48307b("post", C27258a.f71921a.mo55642a(this.f71927a, null), this.f71928b);
            String str2 = "";
            try {
                if (this.f71929c != null) {
                    C47809dg dgVar = C47809dg.f120359a;
                    JSONObject jSONObject = this.f71928b;
                    String str3 = this.f71929c;
                    Map map = this.f71930d;
                    if (map != null) {
                        Collection arrayList = new ArrayList(map.size());
                        for (Entry entry : map.entrySet()) {
                            arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                        }
                        collection = (List) arrayList;
                    } else {
                        collection = null;
                    }
                    str = dgVar.mo95052b(a, jSONObject, str3, C52575l.m112139e(collection));
                } else {
                    HashMap hashMap = new HashMap();
                    if (this.f71928b != null) {
                        Iterator keys = this.f71928b.keys();
                        while (keys.hasNext()) {
                            String str4 = (String) keys.next();
                            String optString = this.f71928b.optString(str4, "");
                            Map map2 = hashMap;
                            C52711k.m112236a((Object) str4, "key");
                            C52711k.m112236a((Object) optString, "value");
                            map2.put(str4, optString);
                        }
                    }
                    NetUtil.putCommonParams(hashMap, true);
                    T t = C27258a.f71923c.doPost(this.f71927a, hashMap).execute().f33552b;
                    C52711k.m112236a((Object) t, "JS_API.doPost(url, map).execute().body()");
                    str = (String) t;
                }
                String str5 = str;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("response", new JSONObject(str5));
                jSONObject2.put("_raw", str5);
                return new C27273d(bVar, new C48309d(jSONObject2, null));
            } catch (C19174b e) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("code", 0);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("errCode", e.getStatusCode());
                    jSONObject4.put("message", e.getMessage());
                    jSONObject3.put("error", jSONObject4);
                } catch (JSONException unused) {
                }
                return new C27273d(bVar, new C48309d(jSONObject3, e));
            } catch (Exception e2) {
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("code", 0);
                    jSONObject5.put("response", new JSONObject(str2));
                    jSONObject5.put("_raw", str2);
                } catch (JSONException unused2) {
                }
                return new C27273d(bVar, new C48309d(jSONObject5, e2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.a$d */
    static final class C27262d<TTaskResult, TContinuationResult> implements C0011g<C27273d, Void> {

        /* renamed from: a */
        final /* synthetic */ C10831a f71931a;

        C27262d(C10831a aVar) {
            this.f71931a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.web.jsbridge.a.a$c r0 = com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.m65704a()
                r1 = 0
                if (r0 == 0) goto L_0x0027
                java.lang.String r2 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r2)
                java.lang.Object r2 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r2 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r2
                if (r2 == 0) goto L_0x0017
                com.ss.android.ugc.aweme.web.jsbridge.a.a$b r2 = r2.f71948a
                goto L_0x0018
            L_0x0017:
                r2 = r1
            L_0x0018:
                java.lang.Object r3 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r3 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r3
                if (r3 == 0) goto L_0x0023
                com.ss.android.ugc.aweme.web.jsbridge.a.a$d r3 = r3.f71949b
                goto L_0x0024
            L_0x0023:
                r3 = r1
            L_0x0024:
                r0.mo49921a(r2, r3)
            L_0x0027:
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.Object r5 = r5.mo34e()
                com.ss.android.ugc.aweme.crossplatform.prefetch.d r5 = (com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27273d) r5
                if (r5 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.web.jsbridge.a.a$d r5 = r5.f71949b
                if (r5 == 0) goto L_0x003b
                org.json.JSONObject r5 = r5.f121543a
                goto L_0x003c
            L_0x003b:
                r5 = r1
            L_0x003c:
                if (r5 == 0) goto L_0x0089
                java.lang.String r0 = "code"
                java.lang.Object r0 = r5.opt(r0)
                r2 = 1
                boolean r3 = r0 instanceof java.lang.Integer
                if (r3 != 0) goto L_0x004a
                goto L_0x0089
            L_0x004a:
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r2 != r0) goto L_0x0089
                com.bytedance.ies.g.c.e$a r0 = r4.f71931a
                com.bytedance.ies.g.c.e$b r2 = new com.bytedance.ies.g.c.e$b
                r2.<init>()
                java.lang.String r3 = "response"
                java.lang.Object r5 = r5.opt(r3)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r3 = p2628d.p2650m.C52808d.f131043a
                if (r5 == 0) goto L_0x0081
                byte[] r5 = r5.getBytes(r3)
                java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
                r2.mo19616a(r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Map r5 = (java.util.Map) r5
                r2.mo19615a(r5)
                r0.mo19612a(r2)
                goto L_0x0089
            L_0x0081:
                d.u r5 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r5.<init>(r0)
                throw r5
            L_0x0089:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.C27262d.then(a.i):java.lang.Object");
        }
    }

    private C27258a() {
    }

    /* renamed from: a */
    public static C48308c m65704a() {
        return f71922b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo55642a(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            com.ss.android.common.util.i r7 = new com.ss.android.common.util.i
            r7.<init>(r6)
            java.lang.String r6 = "request_tag_from"
            java.lang.String r0 = "h5"
            java.util.List<com.ss.android.http.a.b.e> r1 = r7.f52131a
            r2 = 1
            if (r1 == 0) goto L_0x0038
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0038
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r1.next()
            com.ss.android.http.a.b.e r3 = (com.p683ss.android.http.p1169a.p1172b.C19180e) r3
            java.lang.String r4 = "pair"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.mo39131a()
            boolean r3 = p2628d.p2650m.C52830p.m112406a(r6, r3, r2)
            if (r3 == 0) goto L_0x001c
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            if (r2 != 0) goto L_0x003e
            r7.mo38778a(r6, r0)
        L_0x003e:
            java.lang.String r6 = r7.mo38774a()
            java.lang.String r7 = "urlBuilder.build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27258a.mo55642a(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: a */
    public final void mo10468a(String str, Map<String, String> map, C10831a aVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "headers");
        C52711k.m112240b(aVar, "callback");
        C0013i.m16a((Callable<TResult>) new C27259a<TResult>(str, map)).mo20a((C0011g<TResult, TContinuationResult>) new C27260b<TResult,TContinuationResult>(aVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo10469a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C10831a aVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "headers");
        C52711k.m112240b(str2, "mimeType");
        C52711k.m112240b(jSONObject, "postData");
        C52711k.m112240b(aVar, "callback");
        C0013i.m16a((Callable<TResult>) new C27261c<TResult>(str, jSONObject, str2, map)).mo20a((C0011g<TResult, TContinuationResult>) new C27262d<TResult,TContinuationResult>(aVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo55643a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i2);
                jSONObject2.put("prompts", str2);
                if (str != null) {
                    jSONObject2.put("message", str);
                }
            } catch (JSONException unused) {
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused2) {
        }
    }
}
