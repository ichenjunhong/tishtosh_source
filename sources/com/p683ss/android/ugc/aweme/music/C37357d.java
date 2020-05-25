package com.p683ss.android.ugc.aweme.music;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IAVMobService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.p2425e.C48545a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.d */
public final class C37357d implements C37435b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f95319a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37357d.class), "avMobService", "getAvMobService()Lcom/ss/android/ugc/aweme/services/IAVMobService;"))};

    /* renamed from: g */
    public static final C37358a f95320g = new C37358a(null);

    /* renamed from: b */
    public long f95321b;

    /* renamed from: c */
    public final String f95322c;

    /* renamed from: d */
    public final String f95323d;

    /* renamed from: e */
    public final C37435b f95324e;

    /* renamed from: f */
    public final String f95325f;

    /* renamed from: h */
    private final C52668f f95326h;

    /* renamed from: com.ss.android.ugc.aweme.music.d$a */
    public static final class C37358a {
        private C37358a() {
        }

        public /* synthetic */ C37358a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.d$b */
    static final class C37359b extends C52712l implements C52670a<IAVMobService> {

        /* renamed from: a */
        public static final C37359b f95327a = new C37359b();

        C37359b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return AVExternalServiceImpl.getAVServiceImpl_Monster().getAVMobService();
        }
    }

    /* renamed from: c */
    private final IAVMobService m83644c() {
        return (IAVMobService) this.f95326h.getValue();
    }

    /* renamed from: b */
    public final void mo55354b() {
        this.f95321b = System.currentTimeMillis();
        C37435b bVar = this.f95324e;
        if (bVar != null) {
            bVar.mo55354b();
        }
    }

    /* renamed from: a */
    public final void mo55350a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f95321b;
        C37435b bVar = this.f95324e;
        if (bVar != null) {
            bVar.mo55350a();
        }
        IAVMobService c = m83644c();
        String str = "tool_performance_resource_download";
        C23089d a = C23089d.m56640a().mo47829a("resource_type", "music").mo47827a("duration", currentTimeMillis).mo47826a("status", 2).mo47829a("resource_id", this.f95322c).mo47829a("error_domain", this.f95323d);
        String str2 = "enter_from";
        String str3 = this.f95325f;
        if (str3 == null) {
            str3 = "";
        }
        c.onEventV3(str, a.mo47829a(str2, str3).f61491a);
    }

    /* renamed from: a */
    public final void mo55351a(int i) {
        C37435b bVar = this.f95324e;
        if (bVar != null) {
            bVar.mo55351a(i);
        }
    }

    /* renamed from: a */
    public final void mo55352a(C48545a aVar) {
        C52711k.m112240b(aVar, "error");
        long currentTimeMillis = System.currentTimeMillis() - this.f95321b;
        C37435b bVar = this.f95324e;
        if (bVar != null) {
            bVar.mo55352a(aVar);
        }
        IAVMobService c = m83644c();
        String str = "tool_performance_resource_download";
        C23089d a = C23089d.m56640a().mo47829a("resource_type", "music").mo47827a("duration", currentTimeMillis).mo47826a("status", 1).mo47829a("resource_id", this.f95322c).mo47829a("error_domain", this.f95323d).mo47826a("error_code", aVar.getErrorCode());
        String str2 = "enter_from";
        String str3 = this.f95325f;
        if (str3 == null) {
            str3 = "";
        }
        c.onEventV3(str, a.mo47829a(str2, str3).f61491a);
    }

    /* renamed from: a */
    public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
        C52711k.m112240b(str, "musicFile");
        long currentTimeMillis = System.currentTimeMillis() - this.f95321b;
        C37435b bVar = this.f95324e;
        if (bVar != null) {
            bVar.mo55353a(str, musicWaveBean);
        }
        IAVMobService c = m83644c();
        String str2 = "tool_performance_resource_download";
        C23089d a = C23089d.m56640a().mo47829a("resource_type", "music").mo47827a("duration", currentTimeMillis).mo47826a("status", 0).mo47829a("resource_id", this.f95322c);
        String str3 = "enter_from";
        String str4 = this.f95325f;
        if (str4 == null) {
            str4 = "";
        }
        c.onEventV3(str2, a.mo47829a(str3, str4).f61491a);
    }

    private C37357d(String str, String str2, C37435b bVar, String str3) {
        this.f95322c = str;
        this.f95323d = str2;
        this.f95324e = bVar;
        this.f95325f = str3;
        this.f95326h = C52732g.m112285a(C37359b.f95327a);
    }

    public /* synthetic */ C37357d(String str, String str2, C37435b bVar, String str3, C52707g gVar) {
        this(str, str2, bVar, str3);
    }
}
