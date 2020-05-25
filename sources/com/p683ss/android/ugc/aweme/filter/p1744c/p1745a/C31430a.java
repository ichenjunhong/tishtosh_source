package com.p683ss.android.ugc.aweme.filter.p1744c.p1745a;

import android.app.Application;
import android.content.Context;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.filter.C31413an;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31429a;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31453b;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31594j;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31565f;
import com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox.C31575c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox.C31577d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31503a;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31504b;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31529h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31497j;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31500m;
import com.p683ss.android.ugc.aweme.port.p2082in.C39576ax;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43871a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45398ap;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.c.a.a */
public final class C31430a implements C31429a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82289a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31430a.class), "filterConfig", "getFilterConfig()Lcom/ss/android/ugc/aweme/filter/services/IFilterConfig;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31430a.class), "filterDataService", "getFilterDataService()Lcom/ss/android/ugc/aweme/filter/services/IFilterDataService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31430a.class), "filterRepository", "getFilterRepository()Lcom/ss/android/ugc/aweme/filter/repository/api/IFilterRepository;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31430a.class), "filterBoxRepositoryFactory", "getFilterBoxRepositoryFactory()Lcom/ss/android/ugc/aweme/filter/repository/api/IFilterBoxRepositoryFactory;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31430a.class), "filterRepositoryFactory", "getFilterRepositoryFactory()Lcom/ss/android/ugc/aweme/filter/repository/api/IFilterRepositoryFactory;"))};

    /* renamed from: b */
    public final C17432q<String> f82290b = C31450f.f82317a;

    /* renamed from: c */
    final C52668f f82291c = C52732g.m112285a(new C31444e(this));

    /* renamed from: d */
    private final C52668f f82292d = C52732g.m112285a(C31441b.f82307a);

    /* renamed from: e */
    private final C52668f f82293e = C52732g.m112285a(C31442c.f82308a);

    /* renamed from: f */
    private final C52668f f82294f = C52732g.m112285a(new C31443d(this));

    /* renamed from: g */
    private final C52668f f82295g = C52732g.m112285a(new C31431a(this));

    /* renamed from: h */
    private C29252f f82296h;

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a */
    static final class C31431a extends C52712l implements C52670a<C31575c> {

        /* renamed from: a */
        final /* synthetic */ C31430a f82297a;

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$a */
        static final class C31433a<T> implements C17432q<FilterBoxApi> {

            /* renamed from: a */
            public static final C31433a f82299a = new C31433a();

            C31433a() {
            }

            public final /* synthetic */ Object get() {
                C39576ax z = C39629l.m88232a().mo58595z();
                String itemName = ((Host) EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0)).getItemName();
                C52711k.m112236a((Object) itemName, "ServiceManager.get().get…a).getHosts()[0].itemName");
                return (FilterBoxApi) z.retrofitCreate(itemName, FilterBoxApi.class);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$b */
        static final class C31434b<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31434b f82300a = new C31434b();

            C31434b() {
            }

            public final /* synthetic */ Object get() {
                return AppLog.getServerDeviceId();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$c */
        static final class C31435c<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31435c f82301a = new C31435c();

            C31435c() {
            }

            public final /* synthetic */ Object get() {
                return EffectPlatform.m68835b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$d */
        static final class C31436d<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31436d f82302a = new C31436d();

            C31436d() {
            }

            public final /* synthetic */ Object get() {
                return C39629l.m88232a().mo58590u().mo74214a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$e */
        static final class C31437e<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31437e f82303a = new C31437e();

            C31437e() {
            }

            public final /* synthetic */ Object get() {
                return C39629l.m88232a().mo58588s().mo74163i();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$f */
        static final class C31438f<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31438f f82304a = new C31438f();

            C31438f() {
            }

            public final /* synthetic */ Object get() {
                return C39629l.m88232a().mo58575f().mo58631b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$g */
        static final class C31439g<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31439g f82305a = new C31439g();

            C31439g() {
            }

            public final /* synthetic */ Object get() {
                return EffectPlatform.m68836c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$a$h */
        static final class C31440h<T> implements C17432q<String> {

            /* renamed from: a */
            public static final C31440h f82306a = new C31440h();

            C31440h() {
            }

            public final /* synthetic */ Object get() {
                return C39629l.m88232a().mo58575f().mo58630a();
            }
        }

        C31431a(C31430a aVar) {
            this.f82297a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C17432q qVar = C31433a.f82299a;
            C31577d dVar = new C31577d(C31434b.f82300a, C31435c.f82301a, C31436d.f82302a, C31437e.f82303a, this.f82297a.f82290b, C31438f.f82304a, C31439g.f82305a, C31440h.f82306a);
            return new C31575c(this.f82297a.mo64334d(), qVar, new C17432q<C29252f>(this) {

                /* renamed from: a */
                final /* synthetic */ C31431a f82298a;

                {
                    this.f82298a = r1;
                }

                public final /* synthetic */ Object get() {
                    return this.f82298a.f82297a.mo64335e();
                }
            }, dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$b */
    static final class C31441b extends C52712l implements C52670a<C31451b> {

        /* renamed from: a */
        public static final C31441b f82307a = new C31441b();

        C31441b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C31451b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$c */
    static final class C31442c extends C52712l implements C52670a<C31452c> {

        /* renamed from: a */
        public static final C31442c f82308a = new C31442c();

        C31442c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C31452c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$d */
    static final class C31443d extends C52712l implements C52670a<C31499l> {

        /* renamed from: a */
        final /* synthetic */ C31430a f82309a;

        C31443d(C31430a aVar) {
            this.f82309a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((C31500m) this.f82309a.f82291c.getValue()).mo64417a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$e */
    static final class C31444e extends C52712l implements C52670a<C31529h> {

        /* renamed from: a */
        final /* synthetic */ C31430a f82310a;

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$e$a */
        static final class C31446a<T> implements C17432q<C31567e> {

            /* renamed from: a */
            public static final C31446a f82312a = new C31446a();

            C31446a() {
            }

            public final /* synthetic */ Object get() {
                IFoundationAVServiceProxy iFoundationAVServiceProxy;
                String str = C43308eb.f109504q;
                int h = C39629l.m88232a().mo58588s().mo74162h();
                Object a = C27991b.m66756a(IFoundationAVServiceProxy.class);
                if (a != null) {
                    iFoundationAVServiceProxy = (IFoundationAVServiceProxy) a;
                } else {
                    iFoundationAVServiceProxy = (IFoundationAVServiceProxy) C20302a.m50070a(IFoundationAVServiceProxy.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                }
                C52711k.m112236a((Object) iFoundationAVServiceProxy, "ServiceManager.get().get…ServiceProxy::class.java)");
                iFoundationAVServiceProxy.getShortVideoPluginService();
                List b = C52575l.m112099b((Object[]) new C52847n[]{C52856t.m112465a(new int[]{R.raw.filters}, C43307ea.f109491d), C52856t.m112465a(C43871a.f111131b, C43307ea.f109504q), C52856t.m112465a(C43871a.f111130a, C43307ea.f109507t), C52856t.m112465a(new int[]{R.raw.facereshape_v2}, C43307ea.f109507t)});
                C31504b bVar = new C31504b(R.array.a7, R.array.a8, R.array.a9);
                Application b2 = C39629l.m88233b();
                C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
                Context context = b2;
                C52711k.m112236a((Object) str, "filterLocalRootDir");
                C31503a aVar = new C31503a(context, str, h, b, bVar);
                return aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$e$b */
        static final class C31447b<T> implements C17432q<C31594j> {

            /* renamed from: a */
            public static final C31447b f82313a = new C31447b();

            C31447b() {
            }

            public final /* synthetic */ Object get() {
                return new C31413an();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$e$c */
        public static final class C31448c implements C17432q<C31596l> {

            /* renamed from: a */
            static final /* synthetic */ C52767h[] f82314a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31448c.class), "tt", "getTt()Lcom/ss/android/ugc/aweme/filter/repository/internal/downloader/InternalDownloaderTT;"))};

            /* renamed from: b */
            private final C52668f f82315b = C52732g.m112285a(C31449a.f82316a);

            /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$e$c$a */
            static final class C31449a extends C52712l implements C52670a<C31565f> {

                /* renamed from: a */
                public static final C31449a f82316a = new C31449a();

                C31449a() {
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    Application b = C39629l.m88233b();
                    C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                    return new C31565f(b);
                }
            }

            C31448c() {
            }

            public final /* synthetic */ Object get() {
                return (C31565f) this.f82315b.getValue();
            }
        }

        C31444e(C31430a aVar) {
            this.f82310a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C17432q<C31567e> qVar = C31446a.f82312a;
            C31448c cVar = new C31448c();
            C17432q<C31594j> qVar2 = C31447b.f82313a;
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            C31529h hVar = new C31529h(b, new C17432q<C29252f>(this) {

                /* renamed from: a */
                final /* synthetic */ C31444e f82311a;

                {
                    this.f82311a = r1;
                }

                public final /* synthetic */ Object get() {
                    return this.f82311a.f82310a.mo64335e();
                }
            }, this.f82310a.f82290b);
            C52711k.m112240b(qVar, "provider");
            C31529h hVar2 = hVar;
            hVar2.f82466a = qVar;
            C17432q<C31596l> qVar3 = cVar;
            C52711k.m112240b(qVar3, "provider");
            hVar2.f82467b = qVar3;
            C52711k.m112240b(qVar2, "provider");
            hVar.f82468c = qVar2;
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.c.a.a$f */
    static final class C31450f<T> implements C17432q<String> {

        /* renamed from: a */
        public static final C31450f f82317a = new C31450f();

        C31450f() {
        }

        public final /* synthetic */ Object get() {
            if (C39629l.m88232a().mo58583n().mo83104b(C40790a.ColorFilterPanel) == 2) {
                return "colorfilterexperiment";
            }
            return "colorfilternew";
        }
    }

    /* renamed from: a */
    public final void mo64331a() {
        C45398ap.m98955a();
    }

    /* renamed from: b */
    public final C31453b mo64332b() {
        return (C31453b) this.f82292d.getValue();
    }

    /* renamed from: c */
    public final C31454c mo64333c() {
        return (C31454c) this.f82293e.getValue();
    }

    /* renamed from: d */
    public final C31499l mo64334d() {
        return (C31499l) this.f82294f.getValue();
    }

    /* renamed from: f */
    public final C31497j mo64336f() {
        return (C31497j) this.f82295g.getValue();
    }

    /* renamed from: e */
    public final C29252f mo64335e() {
        C29252f fVar;
        synchronized (this) {
            fVar = this.f82296h;
            if (fVar == null) {
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                fVar = C29242c.m68869a(b, null);
            }
            this.f82296h = fVar;
        }
        return fVar;
    }

    /* renamed from: g */
    public final void mo64337g() {
        C29252f fVar;
        synchronized (this) {
            fVar = this.f82296h;
            this.f82296h = null;
        }
        if (fVar != null) {
            fVar.mo59125a((String) this.f82290b.get());
        }
    }
}
