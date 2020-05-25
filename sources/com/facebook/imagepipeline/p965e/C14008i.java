package com.facebook.imagepipeline.p965e;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p923g.C13705d;
import com.facebook.common.p923g.C13706e;
import com.facebook.common.p928l.C13732a;
import com.facebook.common.p928l.C13733b;
import com.facebook.common.p928l.C13733b.C13734a;
import com.facebook.common.p928l.C13735c;
import com.facebook.imagepipeline.memory.C14064ab;
import com.facebook.imagepipeline.memory.C14067ac;
import com.facebook.imagepipeline.p963c.C13944d;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p964d.C13960d;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p964d.C13971h.C13974a;
import com.facebook.imagepipeline.p964d.C13977i;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p964d.C13979k;
import com.facebook.imagepipeline.p964d.C13984n;
import com.facebook.imagepipeline.p964d.C13987q;
import com.facebook.imagepipeline.p964d.C13991t;
import com.facebook.imagepipeline.p965e.C14012j.C14014a;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p967g.C14031d;
import com.facebook.imagepipeline.p967g.C14032e;
import com.facebook.imagepipeline.p967g.C14034g;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p974n.C14123ai;
import com.facebook.imagepipeline.p974n.C14208u;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.imagepipeline.p977q.C14244c;
import com.facebook.p914c.p916b.C13636c;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.e.i */
public final class C14008i {

    /* renamed from: A */
    public static C14011b f36504A = new C14011b();

    /* renamed from: B */
    private final int f36505B;

    /* renamed from: C */
    private final Set<C14050c> f36506C;

    /* renamed from: a */
    public final Config f36507a;

    /* renamed from: b */
    public final C13691k<C13987q> f36508b;

    /* renamed from: c */
    public final C13974a f36509c;

    /* renamed from: d */
    public final C13969f f36510d;

    /* renamed from: e */
    public final Context f36511e;

    /* renamed from: f */
    public final boolean f36512f;

    /* renamed from: g */
    public final C14000g f36513g;

    /* renamed from: h */
    public final C13691k<C13987q> f36514h;

    /* renamed from: i */
    public final C13999f f36515i;

    /* renamed from: j */
    public final C13984n f36516j;

    /* renamed from: k */
    public final C14030c f36517k;

    /* renamed from: l */
    public final C14244c f36518l;

    /* renamed from: m */
    public final Integer f36519m;

    /* renamed from: n */
    public final C13691k<Boolean> f36520n;

    /* renamed from: o */
    public final C13636c f36521o;

    /* renamed from: p */
    public final C13705d f36522p;

    /* renamed from: q */
    public final int f36523q;

    /* renamed from: r */
    public final C14123ai f36524r;

    /* renamed from: s */
    public final C13946f f36525s;

    /* renamed from: t */
    public final C14067ac f36526t;

    /* renamed from: u */
    public final C14032e f36527u;

    /* renamed from: v */
    public final boolean f36528v;

    /* renamed from: w */
    public final C13636c f36529w;

    /* renamed from: x */
    public final C14031d f36530x;

    /* renamed from: y */
    public final C14012j f36531y;

    /* renamed from: z */
    public final boolean f36532z;

    /* renamed from: com.facebook.imagepipeline.e.i$a */
    public static class C14010a {

        /* renamed from: A */
        public final C14014a f36534A;

        /* renamed from: B */
        public boolean f36535B;

        /* renamed from: a */
        public Config f36536a;

        /* renamed from: b */
        public C13691k<C13987q> f36537b;

        /* renamed from: c */
        public C13974a f36538c;

        /* renamed from: d */
        public C13969f f36539d;

        /* renamed from: e */
        public final Context f36540e;

        /* renamed from: f */
        public boolean f36541f;

        /* renamed from: g */
        public C13691k<C13987q> f36542g;

        /* renamed from: h */
        public C13999f f36543h;

        /* renamed from: i */
        public C13984n f36544i;

        /* renamed from: j */
        public C14030c f36545j;

        /* renamed from: k */
        public C14244c f36546k;

        /* renamed from: l */
        public Integer f36547l;

        /* renamed from: m */
        public C13691k<Boolean> f36548m;

        /* renamed from: n */
        public C13636c f36549n;

        /* renamed from: o */
        public C13705d f36550o;

        /* renamed from: p */
        public Integer f36551p;

        /* renamed from: q */
        public C14123ai f36552q;

        /* renamed from: r */
        public C13946f f36553r;

        /* renamed from: s */
        public C14067ac f36554s;

        /* renamed from: t */
        public C14032e f36555t;

        /* renamed from: u */
        public Set<C14050c> f36556u;

        /* renamed from: v */
        public boolean f36557v;

        /* renamed from: w */
        public C13636c f36558w;

        /* renamed from: x */
        public C14000g f36559x;

        /* renamed from: y */
        public C14031d f36560y;

        /* renamed from: z */
        public int f36561z;

        /* renamed from: a */
        public final C14008i mo26206a() {
            return new C14008i(this);
        }

        /* renamed from: a */
        public final C14010a mo26199a(Config config) {
            this.f36536a = config;
            return this;
        }

        /* renamed from: a */
        public final C14010a mo26200a(C13636c cVar) {
            this.f36549n = cVar;
            return this;
        }

        /* renamed from: a */
        public final C14010a mo26201a(C13691k<C13987q> kVar) {
            this.f36537b = (C13691k) C13689i.m27652a(kVar);
            return this;
        }

        private C14010a(Context context) {
            this.f36557v = true;
            this.f36561z = -1;
            this.f36534A = new C14014a(this);
            this.f36535B = true;
            this.f36540e = (Context) C13689i.m27652a(context);
        }

        /* renamed from: a */
        public final C14010a mo26202a(C13705d dVar) {
            this.f36550o = dVar;
            return this;
        }

        /* renamed from: a */
        public final C14010a mo26203a(C14123ai aiVar) {
            this.f36552q = aiVar;
            return this;
        }

        /* renamed from: a */
        public final C14010a mo26204a(Set<C14050c> set) {
            this.f36556u = set;
            return this;
        }

        /* renamed from: a */
        public final C14010a mo26205a(boolean z) {
            this.f36541f = z;
            return this;
        }
    }

    /* renamed from: com.facebook.imagepipeline.e.i$b */
    public static class C14011b {

        /* renamed from: a */
        public boolean f36562a;

        private C14011b() {
        }
    }

    /* renamed from: a */
    public final Set<C14050c> mo26198a() {
        return Collections.unmodifiableSet(this.f36506C);
    }

    /* renamed from: a */
    public static C14010a m28571a(Context context) {
        return new C14010a(context);
    }

    /* renamed from: b */
    private static C13636c m28573b(Context context) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return C13636c.m27531a(context).mo25503a();
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    private C14008i(C14010a aVar) {
        C13691k<C13987q> kVar;
        C13974a aVar2;
        Config config;
        C13969f fVar;
        C14000g gVar;
        C13691k<C13987q> kVar2;
        C13984n nVar;
        C13691k<Boolean> kVar3;
        C13636c cVar;
        C13705d dVar;
        int i;
        int i2;
        C14123ai aiVar;
        C14067ac acVar;
        C14032e eVar;
        Set<C14050c> set;
        C13636c cVar2;
        C13999f fVar2;
        if (C14237b.m29187b()) {
            C14237b.m29186a("ImagePipelineConfig()");
        }
        C14244c cVar3 = null;
        this.f36531y = new C14012j(aVar.f36534A);
        if (aVar.f36537b == null) {
            kVar = new C13977i<>((ActivityManager) aVar.f36540e.getSystemService("activity"));
        } else {
            kVar = aVar.f36537b;
        }
        this.f36508b = kVar;
        if (aVar.f36538c == null) {
            aVar2 = new C13960d();
        } else {
            aVar2 = aVar.f36538c;
        }
        this.f36509c = aVar2;
        if (aVar.f36536a == null) {
            config = Config.ARGB_8888;
        } else {
            config = aVar.f36536a;
        }
        this.f36507a = config;
        if (aVar.f36539d == null) {
            fVar = C13978j.m28504a();
        } else {
            fVar = aVar.f36539d;
        }
        this.f36510d = fVar;
        this.f36511e = (Context) C13689i.m27652a(aVar.f36540e);
        if (aVar.f36559x == null) {
            gVar = new C13996c(new C13998e());
        } else {
            gVar = aVar.f36559x;
        }
        this.f36513g = gVar;
        this.f36512f = aVar.f36541f;
        if (aVar.f36542g == null) {
            kVar2 = new C13979k<>();
        } else {
            kVar2 = aVar.f36542g;
        }
        this.f36514h = kVar2;
        if (aVar.f36544i == null) {
            nVar = C13991t.m28520a();
        } else {
            nVar = aVar.f36544i;
        }
        this.f36516j = nVar;
        this.f36517k = aVar.f36545j;
        if (aVar.f36546k == null || aVar.f36547l == null) {
            if (aVar.f36546k != null) {
                cVar3 = aVar.f36546k;
            }
            this.f36518l = cVar3;
            this.f36519m = aVar.f36547l;
            if (aVar.f36548m == null) {
                kVar3 = new C13691k<Boolean>() {
                    /* renamed from: b */
                    public final /* synthetic */ Object mo23157b() {
                        return Boolean.valueOf(true);
                    }
                };
            } else {
                kVar3 = aVar.f36548m;
            }
            this.f36520n = kVar3;
            if (aVar.f36549n == null) {
                cVar = m28573b(aVar.f36540e);
            } else {
                cVar = aVar.f36549n;
            }
            this.f36521o = cVar;
            if (aVar.f36550o == null) {
                dVar = C13706e.m27726a();
            } else {
                dVar = aVar.f36550o;
            }
            this.f36522p = dVar;
            C14012j jVar = this.f36531y;
            if (aVar.f36551p != null) {
                i = aVar.f36551p.intValue();
            } else if (jVar.f36573k) {
                i = 1;
            } else {
                i = 0;
            }
            this.f36523q = i;
            if (aVar.f36561z < 0) {
                i2 = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            } else {
                i2 = aVar.f36561z;
            }
            this.f36505B = i2;
            if (C14237b.m29187b()) {
                C14237b.m29186a("ImagePipelineConfig->mNetworkFetcher");
            }
            if (aVar.f36552q == null) {
                aiVar = new C14208u(this.f36505B);
            } else {
                aiVar = aVar.f36552q;
            }
            this.f36524r = aiVar;
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            this.f36525s = aVar.f36553r;
            if (aVar.f36554s == null) {
                acVar = new C14067ac(C14064ab.m28770a().mo26318a());
            } else {
                acVar = aVar.f36554s;
            }
            this.f36526t = acVar;
            if (aVar.f36555t == null) {
                eVar = new C14034g();
            } else {
                eVar = aVar.f36555t;
            }
            this.f36527u = eVar;
            if (aVar.f36556u == null) {
                set = new HashSet<>();
            } else {
                set = aVar.f36556u;
            }
            this.f36506C = set;
            this.f36528v = aVar.f36557v;
            if (aVar.f36558w == null) {
                cVar2 = this.f36521o;
            } else {
                cVar2 = aVar.f36558w;
            }
            this.f36529w = cVar2;
            this.f36530x = aVar.f36560y;
            int c = this.f36526t.mo26322c();
            if (aVar.f36543h == null) {
                fVar2 = new C13994a(c);
            } else {
                fVar2 = aVar.f36543h;
            }
            this.f36515i = fVar2;
            this.f36532z = aVar.f36535B;
            C13733b bVar = this.f36531y.f36566d;
            if (bVar != null) {
                m28572a(bVar, this.f36531y, new C13944d(this.f36526t));
            } else if (this.f36531y.f36563a && C13735c.f35722a) {
                C13733b a = C13735c.m27785a();
                if (a != null) {
                    m28572a(a, this.f36531y, new C13944d(this.f36526t));
                }
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    /* renamed from: a */
    private static void m28572a(C13733b bVar, C14012j jVar, C13732a aVar) {
        C13735c.f35725d = bVar;
        C13734a aVar2 = jVar.f36564b;
        if (aVar2 != null) {
            bVar.setWebpErrorLogger(aVar2);
        }
        bVar.setBitmapCreator(aVar);
    }
}
