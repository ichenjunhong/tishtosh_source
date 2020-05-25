package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.asve.C20370d;
import com.p683ss.android.ugc.asve.C20377e;
import com.p683ss.android.ugc.asve.C20377e.C20378a;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.ugc.asve.sandbox.C20779f;
import com.p683ss.android.ugc.asve.sandbox.C20779f.C20780a;
import com.p683ss.android.ugc.asve.sandbox.C20800m.C20801a;
import com.p683ss.android.ugc.asve.sandbox.SandBoxResourceFinder;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b.C20820a;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c.C20823a;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e.C20829a;
import com.p683ss.android.vesdk.VEListener.C50538b;
import java.util.LinkedHashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.a */
public final class C20584a {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$a */
    public static final class C20585a extends C20801a {

        /* renamed from: a */
        final /* synthetic */ C2592c f56428a;

        /* renamed from: b */
        private final Map<Long, Long> f56429b = new LinkedHashMap();

        /* renamed from: c */
        private SandBoxResourceFinder f56430c;

        /* renamed from: a */
        public final long mo43729a(long j) {
            return this.f56428a.createNativeResourceFinder(j);
        }

        public C20585a(C2592c cVar) {
            this.f56428a = cVar;
        }

        /* renamed from: b */
        public final void mo43731b(long j) {
            SandBoxResourceFinder sandBoxResourceFinder = this.f56430c;
            if (sandBoxResourceFinder != null) {
                sandBoxResourceFinder.releaseLoacl(j);
            }
            this.f56428a.release(j);
        }

        /* renamed from: a */
        public final String mo43730a(long j, String str, String str2) {
            long longValue;
            C52711k.m112240b(str, "dir");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
            if (!this.f56429b.containsKey(Long.valueOf(j))) {
                longValue = this.f56428a.createNativeResourceFinder(j);
                this.f56429b.put(Long.valueOf(j), Long.valueOf(longValue));
            } else {
                Object obj = this.f56429b.get(Long.valueOf(j));
                if (obj == null) {
                    C52711k.m112234a();
                }
                longValue = ((Number) obj).longValue();
            }
            long j2 = longValue;
            if (this.f56430c == null) {
                this.f56430c = new SandBoxResourceFinder(this);
            }
            SandBoxResourceFinder sandBoxResourceFinder = this.f56430c;
            if (sandBoxResourceFinder == null) {
                C52711k.m112234a();
            }
            return sandBoxResourceFinder.nativeGetResourceUrl(j2, j, str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$b */
    public static final class C20586b extends C20823a {

        /* renamed from: a */
        final /* synthetic */ C20370d f56431a;

        public C20586b(C20370d dVar) {
            this.f56431a = dVar;
        }

        /* renamed from: a */
        public final void mo43732a(String str) {
            C52711k.m112240b(str, "msg");
            this.f56431a.mo42960a(str);
        }

        /* renamed from: b */
        public final void mo43733b(String str) {
            C52711k.m112240b(str, "msg");
            this.f56431a.mo42961b(str);
        }

        /* renamed from: c */
        public final void mo43734c(String str) {
            C52711k.m112240b(str, "msg");
            this.f56431a.mo42962c(str);
        }

        /* renamed from: d */
        public final void mo43735d(String str) {
            C52711k.m112240b(str, "msg");
            this.f56431a.mo42963d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$c */
    public static final class C20587c extends C20829a {

        /* renamed from: a */
        final /* synthetic */ C20483d f56432a;

        public C20587c(C20483d dVar) {
            this.f56432a = dVar;
        }

        /* renamed from: a */
        public final void mo43736a(String str, String str2) {
            C52711k.m112240b(str, "logType");
            C52711k.m112240b(str2, "JsonString");
            this.f56432a.mo43741a(str, new JSONObject(str2));
        }

        /* renamed from: a */
        public final void mo43738a(String str, Map<Object, Object> map) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(map, "map");
            this.f56432a.mo43439a(str, C52731z.m112270f(map));
        }

        /* renamed from: a */
        public final void mo43737a(String str, String str2, String str3, String str4) {
            this.f56432a.mo43438a(str, str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$d */
    public static final class C20588d extends C20820a {

        /* renamed from: a */
        final /* synthetic */ C50538b f56433a;

        public C20588d(C50538b bVar) {
            this.f56433a = bVar;
        }

        /* renamed from: a */
        public final void mo43739a(String str, String str2, String str3, String str4, String str5) {
            if (str != null && str2 != null && str5 != null) {
                this.f56433a.mo43742a(str, new JSONObject(str2), str3, str4, str5);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$e */
    public static final class C20589e extends C20780a {

        /* renamed from: a */
        final /* synthetic */ C20377e f56434a;

        public C20589e(C20377e eVar) {
            this.f56434a = eVar;
        }

        /* renamed from: a */
        public final String mo43740a(String str, int i) {
            C52711k.m112240b(str, "ori");
            return this.f56434a.mo43206a(str, C20378a.values()[i]);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$f */
    public static final class C20590f implements C20370d {

        /* renamed from: a */
        final /* synthetic */ C20822c f56435a;

        public C20590f(C20822c cVar) {
            this.f56435a = cVar;
        }

        /* renamed from: a */
        public final void mo42960a(String str) {
            C52711k.m112240b(str, "message");
            this.f56435a.mo43732a(str);
        }

        /* renamed from: b */
        public final void mo42961b(String str) {
            C52711k.m112240b(str, "message");
            this.f56435a.mo43733b(str);
        }

        /* renamed from: c */
        public final void mo42962c(String str) {
            C52711k.m112240b(str, "message");
            this.f56435a.mo43734c(str);
        }

        /* renamed from: d */
        public final void mo42963d(String str) {
            C52711k.m112240b(str, "message");
            this.f56435a.mo43735d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$g */
    public static final class C20591g implements C20483d {

        /* renamed from: a */
        final /* synthetic */ C20828e f56436a;

        /* renamed from: a */
        public final void mo43440a(Throwable th, String str) {
            C52711k.m112240b(th, "throwable");
            C52711k.m112240b(str, "key");
        }

        public C20591g(C20828e eVar) {
            this.f56436a = eVar;
        }

        /* renamed from: a */
        public final void mo43439a(String str, Map<String, String> map) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(map, "map");
            this.f56436a.mo43738a(str, (Map) map);
        }

        /* renamed from: a */
        public final void mo43741a(String str, JSONObject jSONObject) {
            C52711k.m112240b(str, "logType");
            C52711k.m112240b(jSONObject, "logExtra");
            this.f56436a.mo43736a(str, jSONObject.toString());
        }

        /* renamed from: a */
        public final void mo43438a(String str, String str2, String str3, String str4) {
            this.f56436a.mo43737a(str, str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$h */
    public static final class C20592h implements C50538b {

        /* renamed from: a */
        final /* synthetic */ C20819b f56437a;

        public C20592h(C20819b bVar) {
            this.f56437a = bVar;
        }

        /* renamed from: a */
        public final void mo43742a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
            C52711k.m112240b(str, "event");
            C52711k.m112240b(str4, "productType");
            this.f56437a.mo43739a(str, String.valueOf(jSONObject), str2, str3, str4);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.a$i */
    public static final class C20593i implements C20377e {

        /* renamed from: a */
        final /* synthetic */ C20779f f56438a;

        public C20593i(C20779f fVar) {
            this.f56438a = fVar;
        }

        /* renamed from: a */
        public final String mo43206a(String str, C20378a aVar) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(aVar, "type");
            String a = this.f56438a.mo43740a(str, aVar.ordinal());
            C52711k.m112236a((Object) a, "this@stub.getAdaptionPath(path, type.ordinal)");
            return a;
        }
    }
}
