package com.p683ss.android.ugc.asve.sandbox.p1253d;

import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.sandbox.C20791j.C20792a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20623d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20623d.C20625b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20628f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20673e;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20679g;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20691k;
import com.p683ss.android.vesdk.VEListener.C50542f;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.d */
public final class C20758d extends C20792a {

    /* renamed from: a */
    Surface f56650a;

    /* renamed from: b */
    private final C20426a f56651b;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$a */
    static final class C20759a extends C52712l implements C52671b<RecorderConcatResult, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20679g f56652a;

        C20759a(C20679g gVar) {
            this.f56652a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
            C52711k.m112240b(recorderConcatResult, "recorderConcatResult");
            C20679g gVar = this.f56652a;
            if (gVar != null) {
                gVar.mo43779a(recorderConcatResult);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$b */
    static final class C20760b extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20691k f56653a;

        C20760b(C20691k kVar) {
            this.f56653a = kVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C20691k kVar = this.f56653a;
            if (kVar != null) {
                kVar.mo43781a(intValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.d$c */
    static final class C20761c implements C50542f {

        /* renamed from: a */
        final /* synthetic */ C20673e f56654a;

        C20761c(C20673e eVar) {
            this.f56654a = eVar;
        }

        /* renamed from: a */
        public final void mo43336a(int i) {
            C20673e eVar = this.f56654a;
            if (eVar != null) {
                eVar.mo43784a(i, "");
            }
        }
    }

    /* renamed from: a */
    public final void mo44044a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i, C20673e eVar) {
        C52711k.m112240b(aSMediaSegmentArr, "segments");
        C52711k.m112240b(str, "videoDir");
        this.f56651b.mo43299a(C52568f.m112068a(aSMediaSegmentArr), str, str2, i, new C20761c(eVar));
    }

    /* renamed from: a */
    public final void mo44037a(C20670d dVar) {
        this.f56651b.mo43293a(dVar != null ? C20628f.m51964a(dVar) : null);
    }

    /* renamed from: a */
    public final void mo44040a(String str, int i, int i2, boolean z, int i3, C20688j jVar) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(jVar, "callback");
        C20426a aVar = this.f56651b;
        CompressFormat compressFormat = CompressFormat.values()[i3];
        C52711k.m112240b(jVar, "$this$proxy");
        aVar.mo43296a(str, i, i2, z, compressFormat, (C52671b<? super Integer, C52860x>) new C20625b<Object,C52860x>(jVar));
    }

    /* renamed from: a */
    public final void mo44038a(C20685i iVar) {
        this.f56651b.mo43294a(iVar != null ? C20623d.m51960a(iVar) : null);
    }

    /* renamed from: a */
    public final void mo44036a(Surface surface, String str, C20685i iVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "device");
        this.f56651b.mo43305b(surface, str, iVar != null ? C20623d.m51960a(iVar) : null);
    }

    /* renamed from: a */
    public final void mo44035a(Surface surface) {
        this.f56651b.mo43291a(surface);
    }

    /* renamed from: a */
    public final void mo44042a(String str, String str2, boolean z, String str3, String str4, C20679g gVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "comment");
        this.f56651b.mo43298a(str, str2, z, str3, str4, (C52671b<? super RecorderConcatResult, C52860x>) new C20759a<Object,C52860x>(gVar));
    }

    /* renamed from: a */
    public final void mo44043a(boolean z) {
        this.f56651b.mo43300a(z);
    }

    /* renamed from: a */
    public final void mo44039a(String str) {
        this.f56651b.mo43295a(str);
    }

    /* renamed from: a */
    public final void mo44041a(String str, long j, long j2) {
        this.f56651b.mo43297a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo44031a() {
        this.f56651b.mo43286a();
    }

    /* renamed from: b */
    public final void mo44045b() {
        this.f56651b.mo43302b();
    }

    /* renamed from: c */
    public final long mo44051c() {
        return this.f56651b.mo43308c();
    }

    /* renamed from: d */
    public final void mo44053d() {
        this.f56651b.mo43310d();
    }

    /* renamed from: e */
    public final void mo44055e() {
        this.f56651b.mo43312e();
    }

    /* renamed from: f */
    public final void mo44057f() {
        this.f56651b.mo43314f();
    }

    /* renamed from: g */
    public final long mo44059g() {
        return this.f56651b.mo43316g();
    }

    /* renamed from: h */
    public final boolean mo44060h() {
        return this.f56651b.mo43318h();
    }

    /* renamed from: i */
    public final void mo44061i() {
        this.f56651b.mo43319i();
    }

    /* renamed from: j */
    public final void mo44062j() {
        this.f56651b.mo43320j();
    }

    /* renamed from: k */
    public final void mo44063k() {
        this.f56651b.mo43321k();
    }

    /* renamed from: l */
    public final long mo44064l() {
        return this.f56651b.mo43322l();
    }

    /* renamed from: m */
    public final int mo44065m() {
        return this.f56651b.mo43323m();
    }

    /* renamed from: n */
    public final int mo44066n() {
        return this.f56651b.mo43324n();
    }

    /* renamed from: o */
    public final int mo44067o() {
        return this.f56651b.mo43325o();
    }

    /* renamed from: p */
    public final float mo44068p() {
        return this.f56651b.mo43326p();
    }

    /* renamed from: q */
    public final int mo44069q() {
        return this.f56651b.mo43327q();
    }

    /* renamed from: r */
    public final int mo44070r() {
        return this.f56651b.mo43328r();
    }

    /* renamed from: s */
    public final int mo44071s() {
        return this.f56651b.mo43329s();
    }

    /* renamed from: t */
    public final float mo44072t() {
        return this.f56651b.mo43330t();
    }

    /* renamed from: u */
    public final float mo44073u() {
        return this.f56651b.mo43331u();
    }

    /* renamed from: v */
    public final int mo44074v() {
        return this.f56651b.mo43332v();
    }

    /* renamed from: w */
    public final float[] mo44075w() {
        return this.f56651b.mo43333w();
    }

    public C20758d(C20426a aVar) {
        C52711k.m112240b(aVar, "mediaController");
        this.f56651b = aVar;
    }

    /* renamed from: b */
    public final void mo44046b(Surface surface) {
        C52711k.m112240b(surface, "surface");
        this.f56651b.mo43303b(surface);
    }

    /* renamed from: c */
    public final void mo44052c(boolean z) {
        this.f56651b.mo43309c(z);
    }

    /* renamed from: d */
    public final void mo44054d(boolean z) {
        this.f56651b.mo43315f(z);
    }

    /* renamed from: e */
    public final void mo44056e(boolean z) {
        this.f56651b.mo43311d(z);
    }

    /* renamed from: f */
    public final boolean mo44058f(boolean z) {
        return this.f56651b.mo43317g(z);
    }

    /* renamed from: b */
    public final void mo44049b(C20685i iVar) {
        C52671b bVar;
        C20426a aVar = this.f56651b;
        if (iVar != null) {
            bVar = C20623d.m51960a(iVar);
        } else {
            bVar = null;
        }
        aVar.mo43306b(bVar);
    }

    /* renamed from: b */
    public final boolean mo44050b(boolean z) {
        return this.f56651b.mo43307b(z);
    }

    /* renamed from: a */
    public final void mo44034a(int i) {
        this.f56651b.mo43290a(i);
    }

    /* renamed from: b */
    public final void mo44047b(Surface surface, String str) {
        this.f56651b.mo43304b(surface, str);
    }

    /* renamed from: a */
    public final int mo44028a(Surface surface, String str) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "device");
        return this.f56651b.mo43282a(surface, str);
    }

    /* renamed from: b */
    public final void mo44048b(Surface surface, String str, C20685i iVar) {
        C52671b bVar;
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "device");
        this.f56650a = surface;
        C20426a aVar = this.f56651b;
        if (iVar != null) {
            bVar = C20623d.m51960a(iVar);
        } else {
            bVar = null;
        }
        aVar.mo43305b(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo44033a(float f, int i, int i2) {
        this.f56651b.mo43289a(f, i, i2);
    }

    /* renamed from: a */
    public final int mo44029a(ASMediaSegment[] aSMediaSegmentArr, String str, String str2, int i) {
        C52711k.m112240b(aSMediaSegmentArr, "segments");
        C52711k.m112240b(str, "videoDir");
        return this.f56651b.mo43284a(C52568f.m112068a(aSMediaSegmentArr), str, str2, i);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo44030a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "comment");
        return this.f56651b.mo43285a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final int mo44026a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56651b.mo43279a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo44032a(double d, boolean z, float f, int i, int i2, boolean z2, C20691k kVar) {
        this.f56651b.mo43287a(d, z, f, i, i2, z2, new C20760b(kVar));
    }

    /* renamed from: a */
    public final int mo44027a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        String str4 = str2;
        C52711k.m112240b(str4, "strDetectModelsDir");
        return this.f56651b.mo43280a(i, i2, str3, i3, i4, str4, i5, z);
    }
}
