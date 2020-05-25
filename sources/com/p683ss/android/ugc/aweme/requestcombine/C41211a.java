package com.p683ss.android.ugc.aweme.requestcombine;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41216a;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41217b;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41219c;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41220d;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41222e;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41223f;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41224g;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41225h;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41226i;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41227j;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41228k;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41229l;
import com.p683ss.android.ugc.aweme.requestcombine.p2115ab.SettingsCombineExperiment;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a */
public final class C41211a implements C41232c {

    /* renamed from: a */
    static SettingCombineModel f104653a;

    /* renamed from: b */
    static ArrayList<C41233d> f104654b = new ArrayList<>();

    /* renamed from: c */
    public static HashMap<String, C41216a> f104655c = new HashMap<>();

    /* renamed from: d */
    public static final C41211a f104656d = new C41211a();

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$a */
    public static final class C41212a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C41212a f104657a = new C41212a();

        C41212a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C12799u uVar = (C12799u) obj;
            C52711k.m112240b(uVar, "it");
            C17978g createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.mo34894a((C18097x) new CollectionTypeAdapterFactory());
            createAdapterGsonBuilder.mo34894a((C18097x) new MusicTypeAdapterFactory());
            createAdapterGsonBuilder.mo34894a((C18097x) new UserTypeAdapterFactory());
            createAdapterGsonBuilder.mo34896a((Type) C46066a.class, (Object) new BackgroundVideoDeserializer());
            createAdapterGsonBuilder.mo34894a((C18097x) new BaseResponseObjectTypeAdapterFactory());
            return (SettingCombineModel) ((SettingCombineModel) createAdapterGsonBuilder.mo34900d().mo34884a((String) uVar.f33552b, SettingCombineModel.class)).checkValid();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$b */
    public static final class C41213b implements C1674ab<SettingCombineModel> {

        /* renamed from: a */
        final /* synthetic */ Context f104658a;

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$b$a */
        static final class C41214a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C41213b f104659a;

            /* renamed from: b */
            final /* synthetic */ String f104660b;

            /* renamed from: c */
            final /* synthetic */ int f104661c;

            C41214a(C41213b bVar, String str, int i) {
                this.f104659a = bVar;
                this.f104660b = str;
                this.f104661c = i;
            }

            public final /* synthetic */ Object call() {
                if (C41231b.m90957a(this.f104659a.f104658a)) {
                    C23569o.m57776a("combine_settings_monitor_service", 1, C23088c.m56631a().mo47824a("errorDesc", this.f104660b).mo47822a("requestCount", Integer.valueOf(this.f104661c)).mo47825b());
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$b$b */
        static final class C41215b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ int f104662a;

            C41215b(int i) {
                this.f104662a = i;
            }

            public final /* synthetic */ Object call() {
                C23569o.m57776a("combine_settings_monitor_service", 0, C23088c.m56631a().mo47822a("requestCount", Integer.valueOf(this.f104662a)).mo47825b());
                return C52860x.f131107a;
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public C41213b(Context context) {
            this.f104658a = context;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            if ((th instanceof C9872a) && ((C9872a) th).getStatusCode() == 509) {
                return;
            }
            if (!(th instanceof C23459a) || ((C23459a) th).getErrorCode() != 509) {
                C35862d d = C35857a.m81005d();
                for (C41216a a : C41211a.f104655c.values()) {
                    a.mo83710a(d);
                }
                d.mo74520a();
                C41211a aVar = C41211a.f104656d;
                for (C41233d a2 : C41211a.f104654b) {
                    a2.mo83716a(th);
                }
                C0013i.m18a((Callable<TResult>) new C41214a<TResult>(this, th.getMessage(), C41211a.f104655c.size()), (Executor) C26890h.m65003a());
            }
        }

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v1, types: [com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean] */
        /* JADX WARNING: type inference failed for: r5v2, types: [com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean] */
        /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r5v8 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean, java.lang.Integer]
          mth insns count: 97
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r11) {
            /*
                r10 = this;
                com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r11 = (com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel) r11
                java.lang.String r0 = "settingCombineModel"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                com.ss.android.ugc.aweme.requestcombine.a r0 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104656d
                android.content.Context r0 = r10.f104658a
                java.lang.System.currentTimeMillis()
                java.lang.String r1 = "setting_repo_sp"
                r2 = 0
                com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepoFromSp(r0, r1, r2)
                r1 = 1
                if (r0 == 0) goto L_0x001d
                java.lang.String r3 = "key_has_local_cache"
                r0.storeInt(r3, r1)
            L_0x001d:
                com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104653a = r11
                com.ss.android.ugc.aweme.lego.a$d r0 = new com.ss.android.ugc.aweme.lego.a$d
                r0.<init>()
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.requestcombine.a.a> r3 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104655c
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x002e:
                boolean r4 = r3.hasNext()
                r5 = 0
                if (r4 == 0) goto L_0x0094
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r6 = r4.getKey()
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r4 = r4.getValue()
                com.ss.android.ugc.aweme.requestcombine.a.a r4 = (com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41216a) r4
                com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r7 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104653a
                boolean r7 = r4.mo83711a(r7)
                if (r7 != 0) goto L_0x002e
                com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r7 = r4.mo83712b()
                if (r7 == 0) goto L_0x005d
                int r7 = r7.getHttpCode()
                r8 = 509(0x1fd, float:7.13E-43)
                if (r7 == r8) goto L_0x002e
            L_0x005d:
                r4.mo83710a(r0)
                java.lang.String r7 = "key"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r4 = r4.mo83712b()
                if (r4 == 0) goto L_0x0073
                int r4 = r4.getHttpCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            L_0x0073:
                boolean r4 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.m90899a()
                if (r4 == 0) goto L_0x002e
                java.lang.String r4 = "combine_settings_monitor_service"
                r7 = 2
                com.ss.android.ugc.aweme.app.f.c r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                java.lang.String r9 = "errorCode"
                com.ss.android.ugc.aweme.app.f.c r5 = r8.mo47822a(r9, r5)
                java.lang.String r8 = "url"
                com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r8, r6)
                org.json.JSONObject r5 = r5.mo47825b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r4, r7, r5)
                goto L_0x002e
            L_0x0094:
                r0.mo74520a()
                com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r0 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104653a
                if (r0 == 0) goto L_0x00d7
                com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r0 = r0.getData()
                if (r0 == 0) goto L_0x00d7
                com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r0 = r0.getSameCityModel()
                if (r0 == 0) goto L_0x00d7
                int r3 = r0.getHttpCode()
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 != r4) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                r1 = 0
            L_0x00b1:
                if (r1 == 0) goto L_0x00b4
                goto L_0x00b5
            L_0x00b4:
                r0 = r5
            L_0x00b5:
                if (r0 == 0) goto L_0x00d7
                com.ss.android.ugc.aweme.poi.a.k r0 = r0.getSameCityModel()
                if (r0 == 0) goto L_0x00bf
                com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean r5 = r0.f99247a
            L_0x00bf:
                if (r5 == 0) goto L_0x00d7
                java.lang.String r0 = ""
                c.a.v r0 = p064c.p065a.C2201v.m6614b(r0)
                c.a.ac r1 = p064c.p065a.p093k.C2168a.m6521b()
                c.a.v r0 = r0.mo6529b(r1)
                com.ss.android.ugc.aweme.feed.g r1 = new com.ss.android.ugc.aweme.feed.g
                r1.<init>(r5)
                r0.mo6545f(r1)
            L_0x00d7:
                java.util.ArrayList<com.ss.android.ugc.aweme.requestcombine.d> r0 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104654b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x00df:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00ef
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.requestcombine.d r1 = (com.p683ss.android.ugc.aweme.requestcombine.C41233d) r1
                r1.mo83715a()
                goto L_0x00df
            L_0x00ef:
                com.ss.android.ugc.aweme.lego.a$f r0 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()
                com.ss.android.ugc.aweme.requestcombine.ColdLaunchRequestCombiner$onCombineSuccess$2 r1 = new com.ss.android.ugc.aweme.requestcombine.ColdLaunchRequestCombiner$onCombineSuccess$2
                r1.<init>(r11)
                com.ss.android.ugc.aweme.lego.LegoTask r1 = (com.p683ss.android.ugc.aweme.lego.LegoTask) r1
                com.ss.android.ugc.aweme.lego.a$f r11 = r0.mo74526a(r1)
                r11.mo74527a()
                com.ss.android.ugc.aweme.requestcombine.a r11 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104656d
                java.util.HashMap r11 = com.p683ss.android.ugc.aweme.requestcombine.C41211a.f104655c
                int r11 = r11.size()
                com.ss.android.ugc.aweme.requestcombine.a$b$b r0 = new com.ss.android.ugc.aweme.requestcombine.a$b$b
                r0.<init>(r11)
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.util.concurrent.ExecutorService r11 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
                java.util.concurrent.Executor r11 = (java.util.concurrent.Executor) r11
                p001a.C0013i.m18a(r0, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.C41211a.C41213b.onNext(java.lang.Object):void");
        }
    }

    private C41211a() {
    }

    /* renamed from: b */
    public final boolean mo83705b() {
        return SettingsCombineExperiment.m90956a();
    }

    /* renamed from: a */
    static boolean m90899a() {
        try {
            C23718g b = C23718g.m58207b();
            C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
            return b.mo49153d();
        } catch (Throwable unused) {
            return false;
        }
    }

    static {
        m90898a((C41216a) new C41223f());
        m90898a((C41216a) new C41222e());
        m90898a((C41216a) new C41224g());
        m90898a((C41216a) new C41225h());
        m90898a((C41216a) new C41226i());
        m90898a((C41216a) new C41227j());
        m90898a((C41216a) new C41228k());
        m90898a((C41216a) new C41229l());
        m90898a((C41216a) new C41219c());
        m90898a((C41216a) new C41217b());
        m90898a((C41216a) new C41220d());
    }

    /* renamed from: a */
    public final void mo83704a(C41233d dVar) {
        f104654b.add(dVar);
    }

    /* renamed from: a */
    private static void m90898a(C41216a aVar) {
        String a = aVar.mo83708a();
        if (a != null) {
            f104655c.put(a, aVar);
        }
    }

    /* renamed from: a */
    public final BaseCombineMode mo83703a(String str) {
        C52711k.m112240b(str, "url");
        C41216a aVar = (C41216a) f104655c.get(str);
        if (aVar != null) {
            return aVar.mo83712b();
        }
        return null;
    }
}
