package com.p683ss.android.ugc.asve.recorder.p1245b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20370d;
import com.p683ss.android.ugc.asve.C20377e;
import com.p683ss.android.ugc.asve.C20377e.C20378a;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.C20416a;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.vesdk.C50601ah;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VECameraSettings;
import com.p683ss.android.vesdk.VEListener.C50542f;
import com.p683ss.android.vesdk.VEListener.C50546j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.recorder.b.d */
public final class C20431d implements C20426a {

    /* renamed from: a */
    public final C50601ah f56003a;

    /* renamed from: b */
    public final C20363h f56004b;

    /* renamed from: c */
    private final VECameraSettings f56005c;

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$a */
    static final class C20432a implements C50546j {

        /* renamed from: a */
        final /* synthetic */ C52671b f56006a;

        C20432a(C52671b bVar) {
            this.f56006a = bVar;
        }

        /* renamed from: a */
        public final void mo43335a(int i, String str, String str2) {
            C52671b bVar = this.f56006a;
            if (bVar != null) {
                C52711k.m112236a((Object) str, "reallyVideoPath");
                C52711k.m112236a((Object) str2, "reallyAudioPath");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$b */
    static final class C20433b implements C50546j {

        /* renamed from: a */
        final /* synthetic */ C52671b f56007a;

        C20433b(C52671b bVar) {
            this.f56007a = bVar;
        }

        /* renamed from: a */
        public final void mo43335a(int i, String str, String str2) {
            C52671b bVar = this.f56007a;
            if (bVar != null) {
                C52711k.m112236a((Object) str, "reallyVideoPath");
                C52711k.m112236a((Object) str2, "reallyAudioPath");
                bVar.invoke(new RecorderConcatResult(i, str, str2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$c */
    static final class C20434c extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        public static final C20434c f56008a = new C20434c();

        C20434c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$d */
    static final class C20435d implements C50542f {

        /* renamed from: a */
        final /* synthetic */ C52671b f56009a;

        C20435d(C52671b bVar) {
            this.f56009a = bVar;
        }

        /* renamed from: a */
        public final void mo43336a(int i) {
            C52671b bVar = this.f56009a;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.d$e */
    static final class C20436e implements C50542f {

        /* renamed from: a */
        final /* synthetic */ C52671b f56010a;

        C20436e(C52671b bVar) {
            this.f56010a = bVar;
        }

        /* renamed from: a */
        public final void mo43336a(int i) {
            this.f56010a.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final int mo43280a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "strDetectModelsDir");
        return 0;
    }

    /* renamed from: a */
    public final int mo43281a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return 0;
    }

    /* renamed from: a */
    public final void mo43288a(float f) {
    }

    /* renamed from: a */
    public final void mo43289a(float f, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo43290a(int i) {
    }

    /* renamed from: a */
    public final void mo43295a(String str) {
    }

    /* renamed from: b */
    public final int mo43301b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return 0;
    }

    /* renamed from: b */
    public final void mo43303b(Surface surface) {
        C52711k.m112240b(surface, "surface");
    }

    /* renamed from: b */
    public final void mo43304b(Surface surface, String str) {
    }

    /* renamed from: e */
    public final void mo43313e(boolean z) {
    }

    /* renamed from: i */
    public final void mo43319i() {
    }

    /* renamed from: j */
    public final void mo43320j() {
    }

    /* renamed from: a */
    public final void mo43298a(String str, String str2, boolean z, String str3, String str4, C52671b<? super RecorderConcatResult, C52860x> bVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        if (z) {
            this.f56003a.mo98795a((C50546j) new C20432a(bVar));
        } else {
            this.f56003a.mo98787a(0, str3, str4, (C50546j) new C20433b(bVar));
        }
    }

    /* renamed from: a */
    public final void mo43299a(List<ASMediaSegment> list, String str, String str2, int i, C50542f fVar) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C52711k.m112240b(fVar, "listener");
        C50601ah ahVar = this.f56003a;
        Iterable<ASMediaSegment> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ASMediaSegment a : iterable) {
            arrayList.add(C20416a.m50636a(a));
        }
        ahVar.mo98814a((List) arrayList, str2, i, 2, fVar);
    }

    /* renamed from: a */
    public final void mo43297a(String str, long j, long j2) {
        if (str != null) {
            C20377e c = C20315a.m50092a().mo43149c();
            this.f56003a.mo98766a(c != null ? c.mo43206a(str, C20378a.AUDIO) : null, (int) j, -1, 2);
        }
    }

    /* renamed from: a */
    public final void mo43293a(C50616e eVar) {
        this.f56003a.mo98800a(eVar);
    }

    /* renamed from: a */
    public final void mo43300a(boolean z) {
        this.f56003a.mo98872k(z);
    }

    /* renamed from: a */
    public final void mo43296a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C52671b<? super Integer, C52860x> bVar) {
        C52671b<? super Integer, C52860x> bVar2 = bVar;
        String str2 = str;
        C52711k.m112240b(str, "strImagePath");
        CompressFormat compressFormat2 = compressFormat;
        C52711k.m112240b(compressFormat2, "format");
        C52711k.m112240b(bVar2, "callback");
        this.f56003a.mo98809a(str2, i, i2, false, z, compressFormat2, new C20438f(bVar2), false);
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.ss.android.ugc.asve.recorder.b.e] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43294a(p2628d.p2639f.p2640a.C52671b<? super java.lang.Integer, p2628d.C52860x> r3) {
        /*
            r2 = this;
            com.ss.android.vesdk.ah r0 = r2.f56003a
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.b.e r1 = new com.ss.android.ugc.asve.recorder.b.e
            r1.<init>(r3)
            r3 = r1
        L_0x000a:
            com.ss.android.vesdk.VEListener$f r3 = (com.p683ss.android.vesdk.VEListener.C50542f) r3
            r0.mo98794a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.recorder.p1245b.C20431d.mo43294a(d.f.a.b):void");
    }

    /* renamed from: a */
    public final void mo43292a(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56003a.mo98792a(this.f56005c);
        this.f56003a.mo98789a(surface, (C50542f) new C20435d(bVar));
    }

    /* renamed from: a */
    public final void mo43291a(Surface surface) {
        this.f56003a.mo98834b(surface);
    }

    /* renamed from: c */
    public final long mo43308c() {
        return mo43316g();
    }

    /* renamed from: e */
    public final void mo43312e() {
        this.f56003a.mo98858f();
    }

    /* renamed from: f */
    public final void mo43314f() {
        this.f56003a.mo98875m();
    }

    /* renamed from: g */
    public final long mo43316g() {
        return this.f56003a.mo98865h();
    }

    /* renamed from: k */
    public final void mo43321k() {
        this.f56003a.mo98875m();
    }

    /* renamed from: l */
    public final long mo43322l() {
        return this.f56003a.mo98862g();
    }

    /* renamed from: m */
    public final int mo43323m() {
        return this.f56003a.mo98885r();
    }

    /* renamed from: n */
    public final int mo43324n() {
        return this.f56003a.mo98887s();
    }

    /* renamed from: o */
    public final int mo43325o() {
        return this.f56003a.mo98889t();
    }

    /* renamed from: p */
    public final float mo43326p() {
        return this.f56003a.mo98891u();
    }

    /* renamed from: q */
    public final int mo43327q() {
        return this.f56003a.mo98897x();
    }

    /* renamed from: r */
    public final int mo43328r() {
        return this.f56003a.mo98899y();
    }

    /* renamed from: s */
    public final int mo43329s() {
        return this.f56003a.mo98900z();
    }

    /* renamed from: t */
    public final float mo43330t() {
        return this.f56003a.mo98748A();
    }

    /* renamed from: u */
    public final float mo43331u() {
        return this.f56003a.mo98895w();
    }

    /* renamed from: v */
    public final int mo43332v() {
        return this.f56003a.mo98893v();
    }

    /* renamed from: b */
    public final void mo43302b() {
        this.f56003a.mo98871k();
    }

    /* renamed from: h */
    public final boolean mo43318h() {
        if (this.f56003a.mo98854e() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final float[] mo43333w() {
        float[] B = this.f56003a.mo98749B();
        C52711k.m112236a((Object) B, "recorder.aecSuggestVolume");
        return B;
    }

    /* renamed from: d */
    public final void mo43310d() {
        if (this.f56003a.mo98854e() == 3) {
            mo43294a((C52671b<? super Integer, C52860x>) C20434c.f56008a);
        }
        this.f56003a.mo98867i();
    }

    /* renamed from: a */
    public final void mo43286a() {
        this.f56003a.mo98869j();
    }

    /* renamed from: d */
    public final void mo43311d(boolean z) {
        this.f56003a.mo98830b(z);
    }

    /* renamed from: c */
    public final void mo43309c(boolean z) {
        this.f56003a.mo98878n(z);
    }

    /* renamed from: f */
    public final void mo43315f(boolean z) {
        this.f56003a.mo98864g(z);
    }

    /* renamed from: g */
    public final boolean mo43317g(boolean z) {
        if (this.f56003a.mo98898x(z) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.ss.android.ugc.asve.recorder.b.e] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43306b(p2628d.p2639f.p2640a.C52671b<? super java.lang.Integer, p2628d.C52860x> r3) {
        /*
            r2 = this;
            com.ss.android.vesdk.ah r0 = r2.f56003a
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.asve.recorder.b.e r1 = new com.ss.android.ugc.asve.recorder.b.e
            r1.<init>(r3)
            r3 = r1
        L_0x000a:
            com.ss.android.vesdk.VEListener$f r3 = (com.p683ss.android.vesdk.VEListener.C50542f) r3
            r0.mo98835b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.recorder.p1245b.C20431d.mo43306b(d.f.a.b):void");
    }

    /* renamed from: b */
    public final boolean mo43307b(boolean z) {
        return this.f56003a.mo98874l(z);
    }

    /* renamed from: a */
    public final int mo43282a(Surface surface, String str) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56003a.mo98792a(this.f56005c);
        this.f56003a.mo98788a(surface);
        return 0;
    }

    public C20431d(C50601ah ahVar, C20363h hVar, VECameraSettings vECameraSettings) {
        C52711k.m112240b(ahVar, "recorder");
        C52711k.m112240b(hVar, "recorderContext");
        C52711k.m112240b(vECameraSettings, "cameraSettings");
        this.f56003a = ahVar;
        this.f56004b = hVar;
        this.f56005c = vECameraSettings;
    }

    /* renamed from: b */
    public final void mo43305b(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        mo43292a(surface, str, bVar);
    }

    /* renamed from: a */
    public final int mo43283a(String str, int i, int i2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(bVar, "callback");
        this.f56003a.mo98809a(str, i, i2, false, true, CompressFormat.PNG, new C20438f(bVar), true);
        return 0;
    }

    /* renamed from: a */
    public final int mo43284a(List<ASMediaSegment> list, String str, String str2, int i) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C50601ah ahVar = this.f56003a;
        Iterable<ASMediaSegment> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ASMediaSegment a : iterable) {
            arrayList.add(C20416a.m50636a(a));
        }
        return ahVar.mo98771a((List) arrayList, str2, i, 2);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo43285a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        try {
            String[] a = this.f56003a.mo98821a(0, str3, str4);
            String str5 = a[0];
            C52711k.m112236a((Object) str5, "contactResult[0]");
            String str6 = a[1];
            C52711k.m112236a((Object) str6, "contactResult[1]");
            return new RecorderConcatResult(0, str5, str6);
        } catch (C50751p e) {
            C20370d b = C20315a.m50092a().mo43148b();
            StringBuilder sb = new StringBuilder("msg: ");
            sb.append(e.getMsgDes());
            sb.append(" ret: ");
            sb.append(e.getRetCd());
            b.mo42961b(sb.toString());
            return new RecorderConcatResult(e.getRetCd(), str, str2);
        }
    }

    /* renamed from: a */
    public final int mo43279a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56003a.mo98752a((float) d);
    }

    /* renamed from: a */
    public final void mo43287a(double d, boolean z, float f, int i, int i2, boolean z2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        this.f56003a.mo98782a((float) d, (C50542f) new C20436e(bVar));
    }
}
