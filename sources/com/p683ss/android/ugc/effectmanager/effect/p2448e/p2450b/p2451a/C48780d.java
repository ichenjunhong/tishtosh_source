package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48658l;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48718a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d */
public final class C48780d extends C48653h<Effect> {

    /* renamed from: d */
    public final C48890g f122520d;

    /* renamed from: e */
    public final Effect f122521e;

    /* renamed from: f */
    private final List<String> f122522f;

    /* renamed from: g */
    private C48657k<C48749e> f122523g;

    /* renamed from: h */
    private final DownloadEffectExtra f122524h;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a */
    public static final class C48781a implements C48658l<C48749e> {

        /* renamed from: a */
        final /* synthetic */ C48780d f122525a;

        /* renamed from: b */
        final /* synthetic */ C48749e f122526b;

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a$a */
        static final class C48782a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48781a f122527a;

            /* renamed from: b */
            final /* synthetic */ C48649d f122528b;

            C48782a(C48781a aVar, C48649d dVar) {
                this.f122527a = aVar;
                this.f122528b = dVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f122527a.f122525a.f122520d.f122952E.mo96298a(this.f122527a.f122525a.f122521e, this.f122528b);
                if (this.f122527a.f122525a.f122286b instanceof C48705j) {
                    C48650e<T> eVar = this.f122527a.f122525a.f122286b;
                    if (eVar != null) {
                        ((C48705j) eVar).mo8644a(this.f122527a.f122525a.f122521e, this.f122528b);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a$b */
        static final class C48783b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48781a f122529a;

            C48783b(C48781a aVar) {
                this.f122529a = aVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                this.f122529a.f122525a.f122286b = null;
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a$c */
        static final class C48784c extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48781a f122530a;

            /* renamed from: b */
            final /* synthetic */ int f122531b;

            /* renamed from: c */
            final /* synthetic */ long f122532c;

            C48784c(C48781a aVar, int i, long j) {
                this.f122530a = aVar;
                this.f122531b = i;
                this.f122532c = j;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (this.f122530a.f122525a.f122286b instanceof C48699d) {
                    C48650e<T> eVar = this.f122530a.f122525a.f122286b;
                    if (eVar != null) {
                        C48699d dVar = (C48699d) eVar;
                        C48749e eVar2 = this.f122530a.f122526b;
                        C52711k.m112236a((Object) eVar2, "result");
                        dVar.mo59191a(eVar2.f122430b, this.f122531b, this.f122532c);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener");
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a$d */
        static final class C48785d extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48781a f122533a;

            /* renamed from: b */
            final /* synthetic */ C48749e f122534b;

            C48785d(C48781a aVar, C48749e eVar) {
                this.f122533a = aVar;
                this.f122534b = eVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C48718a aVar = this.f122533a.f122525a.f122520d.f122952E;
                if (aVar != null) {
                    aVar.mo96297a(this.f122533a.f122525a.f122521e);
                }
                C48650e<T> eVar = this.f122533a.f122525a.f122286b;
                if (eVar != null) {
                    Effect effect = this.f122534b.f122430b;
                    C52711k.m112236a((Object) effect, "response.effect");
                    eVar.mo8638a(effect);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$a$e */
        static final class C48786e extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C48781a f122535a;

            C48786e(C48781a aVar) {
                this.f122535a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C48718a aVar = this.f122535a.f122525a.f122520d.f122952E;
                if (aVar != null) {
                    aVar.mo96301b(this.f122535a.f122525a.f122521e);
                }
                if (this.f122535a.f122525a.f122286b instanceof C48705j) {
                    C48650e<T> eVar = this.f122535a.f122525a.f122286b;
                    if (eVar != null) {
                        ((C48705j) eVar).mo8643a(this.f122535a.f122525a.f122521e);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo96246a(C48657k<C48749e> kVar) {
            C52711k.m112240b(kVar, "syncTask");
            this.f122525a.mo96235a((C52670a<C52860x>) new C48786e<C52860x>(this));
        }

        /* renamed from: b */
        public final void mo96250b(C48657k<C48749e> kVar) {
            C52711k.m112240b(kVar, "syncTask");
            this.f122525a.mo96235a((C52670a<C52860x>) new C48783b<C52860x>(this));
        }

        C48781a(C48780d dVar, C48749e eVar) {
            this.f122525a = dVar;
            this.f122526b = eVar;
        }

        /* renamed from: a */
        public final void mo96248a(C48657k<C48749e> kVar, C48649d dVar) {
            C52711k.m112240b(kVar, "syncTask");
            C52711k.m112240b(dVar, "e");
            this.f122525a.mo96327a(false, dVar);
            this.f122525a.mo96235a((C52670a<C52860x>) new C48782a<C52860x>(this, dVar));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo96249a(C48657k kVar, Object obj) {
            C48749e eVar = (C48749e) obj;
            C52711k.m112240b(kVar, "syncTask");
            C52711k.m112240b(eVar, "response");
            this.f122525a.mo96327a(true, null);
            this.f122525a.mo96235a((C52670a<C52860x>) new C48785d<C52860x>(this, eVar));
        }

        /* renamed from: a */
        public final void mo96247a(C48657k<C48749e> kVar, int i, long j) {
            C52711k.m112240b(kVar, "syncTask");
            this.f122525a.mo96235a((C52670a<C52860x>) new C48784c<C52860x>(this, i, j));
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.d$b */
    static final class C48787b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48780d f122536a;

        C48787b(C48780d dVar) {
            this.f122536a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122536a.f122286b instanceof C48705j) {
                C48650e<T> eVar = this.f122536a.f122286b;
                if (eVar != null) {
                    ((C48705j) eVar).mo8643a(this.f122536a.f122521e);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: g */
    public final void mo96234g() {
        super.mo96234g();
        C48657k<C48749e> kVar = this.f122523g;
        if (kVar != null) {
            kVar.mo96244b();
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48705j) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48705j) eVar).mo8644a(this.f122521e, new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        C48657k<C48749e> kVar;
        String str;
        String str2 = null;
        if (this.f122520d.f122952E != null) {
            C48718a aVar = this.f122520d.f122952E;
            Effect effect = this.f122521e;
            if (effect != null) {
                str = effect.getId();
            } else {
                str = null;
            }
            if (aVar.mo96300a(str)) {
                mo96235a((C52670a<C52860x>) new C48787b<C52860x>(this));
                if (this.f122286b instanceof C48705j) {
                    C48718a aVar2 = this.f122520d.f122952E;
                    Effect effect2 = this.f122521e;
                    if (effect2 != null) {
                        str2 = effect2.getId();
                    }
                    C48650e<T> eVar = this.f122286b;
                    if (eVar != null) {
                        aVar2.mo96299a(str2, (C48705j) eVar);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                }
            }
        }
        Effect effect3 = this.f122521e;
        List<String> list = this.f122522f;
        File file = this.f122520d.f122964j;
        C52711k.m112236a((Object) file, "mConfiguration.effectDir");
        C48694b bVar = new C48694b(effect3, list, file.getPath());
        C48693a aVar3 = this.f122520d.f122949B;
        if (aVar3 != null) {
            kVar = aVar3.mo59209a(bVar);
        } else {
            kVar = null;
        }
        this.f122523g = kVar;
        C48749e a = new C48749e(this.f122521e, null).mo96323a(0).mo96324a(0);
        C48657k<C48749e> kVar2 = this.f122523g;
        if (kVar2 != null) {
            kVar2.f122294d = new C48781a(this, a);
        }
        C48657k<C48749e> kVar3 = this.f122523g;
        if (kVar3 != null) {
            kVar3.mo96239a();
        }
    }

    /* renamed from: a */
    public final void mo96327a(boolean z, C48649d dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!(this.f122520d.f122978x == null || this.f122524h == null || (!TextUtils.equals("beautify", this.f122524h.getPanel()) && !TextUtils.equals("beautifynew", this.f122524h.getPanel())))) {
            boolean z2 = !z;
            StringBuilder sb = new StringBuilder();
            if (this.f122522f != null) {
                for (String append : this.f122522f) {
                    sb.append(append);
                    sb.append(",");
                }
            }
            C48642c cVar = this.f122520d.f122978x;
            if (cVar != null) {
                String str5 = "effect_resource_download_success_rate";
                C48670h a = C48670h.m105314a();
                String str6 = "effect_id";
                if (this.f122521e == null) {
                    str = "";
                } else {
                    str = this.f122521e.getEffectId();
                }
                C48670h a2 = a.mo96255a(str6, str);
                String str7 = "effect_name";
                if (this.f122521e == null) {
                    str2 = "";
                } else {
                    str2 = this.f122521e.getName();
                }
                C48670h a3 = a2.mo96255a(str7, str2).mo96255a("app_id", this.f122520d.f122966l).mo96255a("access_key", this.f122520d.f122956b).mo96255a("download_urls", sb.toString()).mo96255a("panel", this.f122524h.getPanel());
                String str8 = "error_code";
                if (dVar == null) {
                    str3 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVar.f122279a);
                    str3 = sb2.toString();
                }
                C48670h a4 = a3.mo96255a(str8, str3);
                String str9 = "error_msg";
                if (dVar == null) {
                    str4 = "";
                } else {
                    str4 = dVar.f122280b;
                }
                cVar.mo59187a(str5, z2 ? 1 : 0, a4.mo96255a(str9, str4).mo96256b());
            }
        }
    }

    public C48780d(Effect effect, C48565a aVar, Handler handler, String str) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(aVar, "effectContext");
        C52711k.m112240b(str, "taskFlag");
        this(effect, aVar, str, handler, null);
    }

    public C48780d(Effect effect, C48565a aVar, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        UrlModel urlModel;
        C52711k.m112240b(aVar, "effectContext");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122521e = effect;
        this.f122524h = downloadEffectExtra;
        Effect effect2 = this.f122521e;
        if (effect2 != null) {
            urlModel = effect2.getFileUrl();
        } else {
            urlModel = null;
        }
        this.f122522f = C48669g.m105313b(urlModel);
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "effectContext.effectConfiguration");
        this.f122520d = gVar;
    }
}
