package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48720c.C48721a;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.a */
public final class C48766a extends C48653h<Boolean> {

    /* renamed from: d */
    public static final int f122481d = 1;

    /* renamed from: e */
    public static final int f122482e = 2;

    /* renamed from: f */
    public static final C48767a f122483f = new C48767a(null);

    /* renamed from: n */
    private static final String f122484n = "version";

    /* renamed from: o */
    private static final String f122485o = f122485o;

    /* renamed from: g */
    private final C48890g f122486g;

    /* renamed from: h */
    private String f122487h;

    /* renamed from: i */
    private final C48565a f122488i;

    /* renamed from: j */
    private final String f122489j;

    /* renamed from: k */
    private final String f122490k;

    /* renamed from: l */
    private final int f122491l;

    /* renamed from: m */
    private final Map<String, String> f122492m;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.a$a */
    public static final class C48767a {
        private C48767a() {
        }

        /* renamed from: a */
        public static int m105504a() {
            return C48766a.f122481d;
        }

        public /* synthetic */ C48767a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.a$b */
    static final class C48768b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48766a f122493a;

        /* renamed from: b */
        final /* synthetic */ EffectCheckUpdateResponse f122494b;

        C48768b(C48766a aVar, EffectCheckUpdateResponse effectCheckUpdateResponse) {
            this.f122493a = aVar;
            this.f122494b = effectCheckUpdateResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122493a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(Boolean.valueOf(this.f122494b.isUpdated()));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.a$c */
    static final class C48769c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48766a f122495a;

        C48769c(C48766a aVar) {
            this.f122495a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122495a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(Boolean.valueOf(true));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.a$d */
    static final class C48770d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48766a f122496a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122497b;

        C48770d(C48766a aVar, C48649d dVar) {
            this.f122496a = aVar;
            this.f122497b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122496a.f122286b instanceof C48721a) {
                C48650e<T> eVar = this.f122496a.f122286b;
                if (eVar != null) {
                    ((C48721a) eVar).mo96302a(this.f122497b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.repository.newrepo.NewEffectListRepository.WrapCheckChannelListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48721a) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48721a) eVar).mo96302a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.repository.newrepo.NewEffectListRepository.WrapCheckChannelListener");
        }
    }

    /* renamed from: a */
    private final boolean m105501a() {
        String str;
        InputStream inputStream;
        int i = this.f122491l;
        if (i == 0) {
            StringBuilder sb = new StringBuilder("effect_version");
            sb.append(this.f122489j);
            str = sb.toString();
        } else if (i == f122482e) {
            str = C48667e.m105297a(this.f122489j);
        } else if (i == f122481d) {
            str = C48667e.m105302c(this.f122489j, this.f122490k);
        } else {
            StringBuilder sb2 = new StringBuilder("effect_version");
            sb2.append(this.f122489j);
            str = sb2.toString();
        }
        C48620c cVar = this.f122486g.f122972r;
        CheckUpdateVersionModel checkUpdateVersionModel = null;
        if (cVar != null) {
            C52711k.m112236a((Object) str, "key");
            inputStream = cVar.mo96152b(str);
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            return false;
        }
        try {
            C48641b bVar = this.f122486g.f122976v;
            if (bVar != null) {
                checkUpdateVersionModel = (CheckUpdateVersionModel) bVar.mo59189a(inputStream, CheckUpdateVersionModel.class);
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        C48660a.m105288a(inputStream);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.f122487h = checkUpdateVersionModel.version;
        return true;
    }

    /* renamed from: e */
    public final void mo96229e() {
        String str;
        EffectCheckUpdateResponse effectCheckUpdateResponse;
        if (m105501a()) {
            SharedPreferences a = C35807d.m80935a(this.f122488i.mo96085b(), f122484n, 0);
            boolean z = !C52711k.m112239a((Object) a.getString(f122485o, ""), (Object) this.f122486g.f122958d);
            if (z) {
                Editor edit = a.edit();
                edit.putString(f122485o, this.f122486g.f122958d);
                edit.commit();
            }
            HashMap a2 = C48668f.f122308a.mo96252a(this.f122486g);
            Map map = a2;
            String str2 = "panel";
            String str3 = this.f122489j;
            if (str3 == null) {
                str3 = "default";
            }
            map.put(str2, str3);
            int i = this.f122491l;
            if (i == 0 || i == f122482e || i != f122481d) {
                str = "/panel/check";
            } else {
                str = "/category/check";
                String str4 = "category";
                String str5 = this.f122490k;
                if (str5 == null) {
                    str5 = C22858c.f61205a;
                }
                map.put(str4, str5);
            }
            if (z) {
                map.put("version", "");
            } else {
                String str6 = "version";
                String str7 = this.f122487h;
                if (str7 == null) {
                    str7 = "";
                }
                map.put(str6, str7);
            }
            if (this.f122492m != null) {
                a2.putAll(this.f122492m);
            }
            String str8 = this.f122486g.f122980z;
            if (!TextUtils.isEmpty(str8)) {
                C52711k.m112236a((Object) str8, "testStatus");
                map.put("test_status", str8);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122488i.mo96084a());
            sb.append(this.f122486g.f122955a);
            sb.append(str);
            C48605b bVar = new C48605b("GET", C48676l.m105346a(map, sb.toString()));
            if (!this.f122285a) {
                try {
                    C48644a aVar = this.f122486g.f122977w;
                    if (aVar != null) {
                        effectCheckUpdateResponse = (EffectCheckUpdateResponse) aVar.mo96220a(bVar, this.f122486g.f122976v, EffectCheckUpdateResponse.class);
                    } else {
                        effectCheckUpdateResponse = null;
                    }
                    if (effectCheckUpdateResponse != null) {
                        mo96235a((C52670a<C52860x>) new C48768b<C52860x>(this, effectCheckUpdateResponse));
                    } else {
                        m105500a(new C48649d(10002));
                    }
                } catch (Exception e) {
                    m105500a(new C48649d(e));
                }
            }
        } else {
            mo96235a((C52670a<C52860x>) new C48769c<C52860x>(this));
        }
    }

    /* renamed from: a */
    private final void m105500a(C48649d dVar) {
        mo96235a((C52670a<C52860x>) new C48770d<C52860x>(this, dVar));
    }

    public C48766a(C48565a aVar, String str, Handler handler, String str2, String str3, int i, Map<String, String> map) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122488i = aVar;
        this.f122489j = str2;
        this.f122490k = str3;
        this.f122491l = i;
        this.f122492m = map;
        C48890g gVar = this.f122488i.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122486g = gVar;
    }
}
