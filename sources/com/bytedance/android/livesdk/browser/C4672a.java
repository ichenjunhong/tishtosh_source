package com.bytedance.android.livesdk.browser;

import android.webkit.WebResourceResponse;
import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.p173d.p176b.C2914e;
import com.bytedance.android.p173d.p176b.C2930i;
import com.bytedance.ies.p675g.p678c.C10828c;
import com.bytedance.ies.p675g.p678c.C10829d;
import com.bytedance.ies.p675g.p678c.C10830e;
import com.bytedance.ies.p675g.p678c.C10830e.C10831a;
import com.bytedance.ies.p675g.p678c.C10830e.C10832b;
import com.bytedance.ies.p675g.p678c.C10863s;
import com.facebook.internal.C14338p;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2638e.C52647c;
import p2628d.p2638e.C52666o;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.bytedance.android.livesdk.browser.a */
public final class C4672a {

    /* renamed from: a */
    public static boolean f12740a;

    /* renamed from: b */
    public static final C4672a f12741b = new C4672a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2914e f12742c;

    /* renamed from: com.bytedance.android.livesdk.browser.a$a */
    public static final class C4673a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C4673a f12743a = new C4673a();

        C4673a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m11156a((String) obj);
        }

        /* renamed from: a */
        private static LinkedList<String> m11156a(String str) {
            JSONArray jSONArray;
            Throwable th;
            C52711k.m112240b(str, "it");
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            LinkedList<String> linkedList = new LinkedList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (optString != null) {
                    WebResourceResponse c = TTLiveSDKContext.getHostService().mo10316i().mo15573c(optString);
                    if (c != null) {
                        C52711k.m112236a((Object) c, "response");
                        InputStream data = c.getData();
                        C52711k.m112236a((Object) data, "response.data");
                        Closeable bufferedReader = new BufferedReader(new InputStreamReader(data, C52808d.f131043a), VideoCacheReadBuffersizeExperiment.DEFAULT);
                        try {
                            String b = C52666o.m112218b((BufferedReader) bufferedReader);
                            C52647c.m112189a(bufferedReader, null);
                            if (b != null) {
                                linkedList.add(b);
                            }
                        } catch (Throwable th2) {
                            C52647c.m112189a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
            }
            return linkedList;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$b */
    public static final class C4674b<T> implements C1715j<LinkedList<String>> {

        /* renamed from: a */
        public static final C4674b f12744a = new C4674b();

        C4674b() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            LinkedList linkedList = (LinkedList) obj;
            C52711k.m112240b(linkedList, "list");
            if (!linkedList.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$c */
    public static final class C4675c<T> implements C1710e<LinkedList<String>> {

        /* renamed from: a */
        public static final C4675c f12745a = new C4675c();

        C4675c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            LinkedList linkedList = (LinkedList) obj;
            C52711k.m112236a((Object) linkedList, "responseList");
            C10863s.m22030b().mo19610a(false).mo19609a((Executor) C4676d.f12746a).mo19607a((C10829d) new C4678e()).mo19606a((C10828c) new C4679f(linkedList)).mo19608a((C10830e) new C4680g()).mo19611a();
            C4672a.f12740a = true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$d */
    static final class C4676d implements Executor {

        /* renamed from: a */
        public static final C4676d f12746a = new C4676d();

        C4676d() {
        }

        public final void execute(Runnable runnable) {
            C2201v.m6614b(runnable).mo6529b(C2168a.m6521b()).mo6545f((C1710e<? super T>) C46771.f12747a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$e */
    public static final class C4678e implements C10829d {
        C4678e() {
        }

        /* renamed from: a */
        public final String mo10462a(String str) {
            C52711k.m112240b(str, "key");
            return C4672a.f12742c.mo7553a(str);
        }

        /* renamed from: c */
        public final void mo10466c(String str) {
            C52711k.m112240b(str, "key");
            C4672a.f12742c.mo7559c(str);
        }

        /* renamed from: b */
        public final Collection<String> mo10465b(String str) {
            C52711k.m112240b(str, "key");
            return C4672a.f12742c.mo7557b(str);
        }

        /* renamed from: a */
        public final void mo10463a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "value");
            C4672a.f12742c.mo7555a(str, str2);
        }

        /* renamed from: a */
        public final void mo10464a(String str, Collection<String> collection) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(collection, "collection");
            C4672a.f12742c.mo7556a(str, collection);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$f */
    public static final class C4679f implements C10828c {

        /* renamed from: a */
        final /* synthetic */ List f12748a;

        /* renamed from: a */
        public final List<String> mo10467a() {
            return this.f12748a;
        }

        C4679f(List list) {
            this.f12748a = list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.a$g */
    public static final class C4680g implements C10830e {

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$a */
        static final class C4681a<V> implements Callable<T> {

            /* renamed from: a */
            final /* synthetic */ String f12749a;

            /* renamed from: b */
            final /* synthetic */ Map f12750b;

            C4681a(String str, Map map) {
                this.f12749a = str;
                this.f12750b = map;
            }

            public final /* synthetic */ Object call() {
                Object a = ((INetworkService) C4116c.m10249a(INetworkService.class)).get(this.f12749a, C4672a.m11154a(this.f12750b)).mo15805a();
                C52711k.m112236a(a, "ServiceManager.getServic…               .execute()");
                return C4672a.m11153a((C8815e) a);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$b */
        static final class C4682b<T> implements C1710e<C10832b> {

            /* renamed from: a */
            final /* synthetic */ C10831a f12751a;

            C4682b(C10831a aVar) {
                this.f12751a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                C10832b bVar = (C10832b) obj;
                C10831a aVar = this.f12751a;
                C52711k.m112236a((Object) bVar, "response");
                aVar.mo19612a(bVar);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$c */
        static final class C4683c<T> implements C1710e<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C10831a f12752a;

            C4683c(C10831a aVar) {
                this.f12752a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C10831a aVar = this.f12752a;
                C52711k.m112236a((Object) th, "throwable");
                aVar.mo19613a(th);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$d */
        static final class C4684d<V> implements Callable<T> {

            /* renamed from: a */
            final /* synthetic */ String f12753a;

            /* renamed from: b */
            final /* synthetic */ Map f12754b;

            /* renamed from: c */
            final /* synthetic */ JSONObject f12755c;

            C4684d(String str, Map map, JSONObject jSONObject) {
                this.f12753a = str;
                this.f12754b = map;
                this.f12755c = jSONObject;
            }

            public final /* synthetic */ Object call() {
                INetworkService iNetworkService = (INetworkService) C4116c.m10249a(INetworkService.class);
                String str = this.f12753a;
                List a = C4672a.m11154a(this.f12754b);
                String str2 = "application/x-www-form-urlencoded; charset=UTF-8";
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator keys = this.f12755c.keys();
                C52711k.m112236a((Object) keys, "body.keys()");
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    String string = this.f12755c.getString(str3);
                    if (byteArrayOutputStream.size() > 0) {
                        byteArrayOutputStream.write(38);
                    }
                    String encode = URLEncoder.encode(str3, "UTF-8");
                    C52711k.m112236a((Object) encode, "URLEncoder.encode(key, \"UTF-8\")");
                    Charset charset = C52808d.f131043a;
                    if (encode != null) {
                        byte[] bytes = encode.getBytes(charset);
                        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        byteArrayOutputStream.write(bytes);
                        byteArrayOutputStream.write(61);
                        String encode2 = URLEncoder.encode(string, "UTF-8");
                        C52711k.m112236a((Object) encode2, "URLEncoder.encode(value, \"UTF-8\")");
                        Charset charset2 = C52808d.f131043a;
                        if (encode2 != null) {
                            byte[] bytes2 = encode2.getBytes(charset2);
                            C52711k.m112236a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                            byteArrayOutputStream.write(bytes2);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                Object a2 = iNetworkService.post(str, a, str2, byteArrayOutputStream.toByteArray()).mo15805a();
                C52711k.m112236a(a2, "ServiceManager.getServic…               .execute()");
                return C4672a.m11153a((C8815e) a2);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$e */
        static final class C4685e<T> implements C1710e<C10832b> {

            /* renamed from: a */
            final /* synthetic */ C10831a f12756a;

            C4685e(C10831a aVar) {
                this.f12756a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                C10832b bVar = (C10832b) obj;
                C10831a aVar = this.f12756a;
                C52711k.m112236a((Object) bVar, "response");
                aVar.mo19612a(bVar);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.browser.a$g$f */
        static final class C4686f<T> implements C1710e<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C10831a f12757a;

            C4686f(C10831a aVar) {
                this.f12757a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C10831a aVar = this.f12757a;
                C52711k.m112236a((Object) th, "throwable");
                aVar.mo19613a(th);
            }
        }

        C4680g() {
        }

        /* renamed from: a */
        public final void mo10468a(String str, Map<String, String> map, C10831a aVar) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(map, "headers");
            C52711k.m112240b(aVar, "callback");
            C2201v.m6607a((Callable<? extends T>) new C4681a<Object>(str, map)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4682b<Object>(aVar), (C1710e<? super Throwable>) new C4683c<Object>(aVar));
        }

        /* renamed from: a */
        public final void mo10469a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C10831a aVar) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(map, "headers");
            C52711k.m112240b(str2, "mimeType");
            C52711k.m112240b(jSONObject, "body");
            C52711k.m112240b(aVar, "callback");
            C2201v.m6607a((Callable<? extends T>) new C4684d<Object>(str, map, jSONObject)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4685e<Object>(aVar), (C1710e<? super Throwable>) new C4686f<Object>(aVar));
        }
    }

    private C4672a() {
    }

    static {
        C2914e a = C2930i.m8357a("web_prefetch");
        C52711k.m112236a((Object) a, "SuperKV.get(\"web_prefetch\")");
        f12742c = a;
    }

    /* renamed from: a */
    public static void m11155a(String str) {
        C52711k.m112240b(str, "url");
        if (f12740a) {
            C10863s.f29164b.mo19637a(str);
        }
    }

    /* renamed from: a */
    public static C10832b m11153a(C8815e eVar) {
        C10832b bVar = new C10832b();
        byte[] bArr = eVar.f24066e;
        C52711k.m112236a((Object) bArr, "this@toPrefetchResponse.body");
        bVar.mo19616a(bArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2977g gVar : eVar.f24064c) {
            C52711k.m112236a((Object) gVar, C14338p.f37308a);
            linkedHashMap.put(gVar.getName(), gVar.getValue());
        }
        bVar.mo19615a((Map<String, String>) linkedHashMap);
        return bVar;
    }

    /* renamed from: a */
    public static LinkedList<C2977g> m11154a(Map<String, String> map) {
        LinkedList<C2977g> linkedList = new LinkedList<>();
        for (Entry entry : map.entrySet()) {
            linkedList.add(new C2977g((String) entry.getKey(), (String) entry.getValue()));
        }
        return linkedList;
    }
}
