package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.q */
public final class C29266q implements C48714s {

    /* renamed from: f */
    public static final C29267a f76629f = new C29267a(null);

    /* renamed from: a */
    public final String f76630a;

    /* renamed from: b */
    public final String f76631b;

    /* renamed from: c */
    public final int f76632c;

    /* renamed from: d */
    public final int f76633d;

    /* renamed from: e */
    public final C48714s f76634e;

    /* renamed from: g */
    private final C17429o f76635g;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.q$a */
    public static final class C29267a {
        private C29267a() {
        }

        public /* synthetic */ C29267a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29266q m68973a(String str, String str2, int i, int i2, C48714s sVar) {
            C52711k.m112240b(str, "panel");
            C52711k.m112240b(str2, "keyword");
            C52711k.m112240b(sVar, "listener");
            C29266q qVar = new C29266q(str, str2, i, i2, sVar, null);
            return qVar;
        }
    }

    /* renamed from: a */
    public static final C29266q m68970a(String str, String str2, int i, int i2, C48714s sVar) {
        return C29267a.m68973a(str, str2, i, i2, sVar);
    }

    /* renamed from: a */
    public final void mo59196a(C48649d dVar) {
        String str;
        int i;
        if (dVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = dVar.f122279a;
            str = dVar.f122280b;
            C52711k.m112236a((Object) str, "e.msg");
        }
        C39629l.m88232a().mo58567E().mo49426a("search_effect_error_rate", 1, new C42437ay().mo86519a("errorCode", Integer.valueOf(i)).mo86521a("errorDesc", str).mo86519a("count", Integer.valueOf(this.f76632c)).mo86519a("cursor", Integer.valueOf(this.f76633d)).mo86521a("panel", this.f76630a).mo86521a("keyword", this.f76631b).mo86522b());
        this.f76634e.mo59196a(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8638a(Object obj) {
        SearchEffectResponse searchEffectResponse = (SearchEffectResponse) obj;
        long a = this.f76635g.mo33754a(TimeUnit.MILLISECONDS);
        this.f76634e.mo8638a(searchEffectResponse);
        C39629l.m88232a().mo58567E().mo49426a("search_effect_error_rate", 0, new C42437ay().mo86520a("duration", Long.valueOf(a)).mo86519a("count", Integer.valueOf(this.f76632c)).mo86519a("cursor", Integer.valueOf(this.f76633d)).mo86521a("keyword", this.f76631b).mo86521a("panel", this.f76630a).mo86522b());
    }

    private C29266q(String str, String str2, int i, int i2, C48714s sVar) {
        this.f76630a = str;
        this.f76631b = str2;
        this.f76632c = i;
        this.f76633d = i2;
        this.f76634e = sVar;
        C17429o b = C17429o.m42675b();
        C52711k.m112236a((Object) b, "Stopwatch.createStarted()");
        this.f76635g = b;
    }

    public /* synthetic */ C29266q(String str, String str2, int i, int i2, C48714s sVar, C52707g gVar) {
        this(str, str2, i, i2, sVar);
    }
}
