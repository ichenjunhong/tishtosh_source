package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.s */
public final class C29269s implements C48701f {

    /* renamed from: e */
    public static final C29270a f76637e = new C29270a(null);

    /* renamed from: a */
    public final String f76638a;

    /* renamed from: b */
    public final int f76639b;

    /* renamed from: c */
    public final int f76640c;

    /* renamed from: d */
    public final C48701f f76641d;

    /* renamed from: f */
    private final C17429o f76642f;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.s$a */
    public static final class C29270a {
        private C29270a() {
        }

        public /* synthetic */ C29270a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29269s m68980a(String str, int i, int i2, C48701f fVar) {
            C52711k.m112240b(str, "panel");
            C52711k.m112240b(fVar, "listener");
            C29269s sVar = new C29269s(str, i, i2, new C29255i(str, fVar), null);
            return sVar;
        }
    }

    /* renamed from: a */
    public static final C29269s m68977a(String str, int i, int i2, C48701f fVar) {
        return C29270a.m68980a(str, i, i2, fVar);
    }

    /* renamed from: a */
    public final void mo59186a(C48649d dVar) {
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
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 1, new C42437ay().mo86519a("errorCode", Integer.valueOf(i)).mo86521a("errorDesc", str).mo86519a("count", Integer.valueOf(this.f76639b)).mo86519a("cursor", Integer.valueOf(this.f76640c)).mo86521a("panel", this.f76638a).mo86522b());
        C48701f fVar = this.f76641d;
        if (fVar != null) {
            fVar.mo59186a(dVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8638a(Object obj) {
        CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
        long a = this.f76642f.mo33754a(TimeUnit.MILLISECONDS);
        C48701f fVar = this.f76641d;
        if (fVar != null) {
            fVar.mo8638a(categoryPageModel);
        }
        C39629l.m88232a().mo58567E().mo49426a("sticker_list_error_rate", 0, new C42437ay().mo86520a("duration", Long.valueOf(a)).mo86519a("abParam", Integer.valueOf(C39629l.m88232a().mo58583n().mo83104b(C40790a.PlatformOptimizeStrategy))).mo86519a("count", Integer.valueOf(this.f76639b)).mo86519a("cursor", Integer.valueOf(this.f76640c)).mo86521a("panel", this.f76638a).mo86522b());
    }

    private C29269s(String str, int i, int i2, C48701f fVar) {
        this.f76638a = str;
        this.f76639b = i;
        this.f76640c = i2;
        this.f76641d = fVar;
        C17429o b = C17429o.m42675b();
        C52711k.m112236a((Object) b, "Stopwatch.createStarted()");
        this.f76642f = b;
    }

    public /* synthetic */ C29269s(String str, int i, int i2, C48701f fVar, C52707g gVar) {
        this(str, i, i2, fVar);
    }
}
