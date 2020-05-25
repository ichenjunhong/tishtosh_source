package com.p683ss.android.ugc.asve.sandbox.p1252c;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20791j;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20623d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20628f;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20645t;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20647v;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20650y;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20670d;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20679g;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20685i.C20686a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.lang.reflect.Proxy;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.d */
public final class C20750d implements C20426a {

    /* renamed from: a */
    private C50542f f56624a;

    /* renamed from: b */
    private final C20791j f56625b;

    /* renamed from: c */
    private C50616e f56626c;

    /* renamed from: d */
    private C52671b<? super Integer, C52860x> f56627d;

    /* renamed from: e */
    private C52671b<? super Integer, C52860x> f56628e;

    /* renamed from: f */
    private C52671b<? super Integer, C52860x> f56629f;

    /* renamed from: g */
    private C52671b<? super Integer, C52860x> f56630g;

    /* renamed from: h */
    private C52671b<? super Integer, C52860x> f56631h;

    /* renamed from: i */
    private C52671b<? super Integer, C52860x> f56632i;

    /* renamed from: j */
    private C52671b<? super RecorderConcatResult, C52860x> f56633j;

    /* renamed from: k */
    private final String f56634k;

    /* renamed from: a */
    public final int mo43281a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return 0;
    }

    /* renamed from: b */
    public final int mo43301b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return 0;
    }

    /* renamed from: e */
    public final void mo43313e(boolean z) {
    }

    /* renamed from: a */
    public final void mo43299a(List<ASMediaSegment> list, String str, String str2, int i, C50542f fVar) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C52711k.m112240b(fVar, "listener");
        this.f56624a = fVar;
        C20791j jVar = this.f56625b;
        Object[] array = list.toArray(new ASMediaSegment[0]);
        if (array != null) {
            ASMediaSegment[] aSMediaSegmentArr = (ASMediaSegment[]) array;
            C52711k.m112240b(fVar, "$this$stub");
            jVar.mo44044a(aSMediaSegmentArr, str, str2, i, new C20650y(fVar));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo43293a(C50616e eVar) {
        this.f56626c = eVar;
        this.f56625b.mo44037a((C20670d) eVar != null ? C20628f.m51963a(eVar) : null);
    }

    /* renamed from: a */
    public final void mo43296a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(compressFormat, "format");
        C52711k.m112240b(bVar, "callback");
        this.f56627d = bVar;
        this.f56625b.mo44040a(str, i, i2, z, compressFormat.ordinal(), (C20688j) C20608c.m51928a(bVar));
    }

    /* renamed from: a */
    public final void mo43290a(int i) {
        this.f56625b.mo44034a(i);
    }

    /* renamed from: a */
    public final void mo43294a(C52671b<? super Integer, C52860x> bVar) {
        this.f56629f = bVar;
        this.f56625b.mo44038a((C20685i) bVar != null ? C20623d.m51959a(bVar) : null);
    }

    /* renamed from: a */
    public final void mo43292a(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56631h = bVar;
        this.f56625b.mo44036a(surface, str, (C20685i) bVar != null ? C20623d.m51959a(bVar) : null);
    }

    /* renamed from: a */
    public final void mo43291a(Surface surface) {
        this.f56625b.mo44035a(surface);
    }

    /* renamed from: a */
    public final void mo43298a(String str, String str2, boolean z, String str3, String str4, C52671b<? super RecorderConcatResult, C52860x> bVar) {
        C20679g gVar;
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        this.f56633j = bVar;
        C20791j jVar = this.f56625b;
        if (bVar != null) {
            C52711k.m112240b(bVar, "$this$stub");
            gVar = new C20645t(bVar);
        } else {
            gVar = null;
        }
        jVar.mo44042a(str, str2, z, str3, str4, gVar);
    }

    /* renamed from: a */
    public final void mo43288a(float f) {
        this.f56625b.mo44033a(f, -1, -1);
    }

    /* renamed from: a */
    public final void mo43289a(float f, int i, int i2) {
        this.f56625b.mo44033a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo43300a(boolean z) {
        this.f56625b.mo44043a(z);
    }

    /* renamed from: a */
    public final void mo43295a(String str) {
        this.f56625b.mo44039a(str);
    }

    /* renamed from: a */
    public final void mo43297a(String str, long j, long j2) {
        this.f56625b.mo44041a(str, j, j2);
    }

    /* renamed from: c */
    public final long mo43308c() {
        return this.f56625b.mo44051c();
    }

    /* renamed from: d */
    public final void mo43310d() {
        this.f56625b.mo44053d();
    }

    /* renamed from: e */
    public final void mo43312e() {
        this.f56625b.mo44055e();
    }

    /* renamed from: f */
    public final void mo43314f() {
        this.f56625b.mo44057f();
    }

    /* renamed from: g */
    public final long mo43316g() {
        return this.f56625b.mo44059g();
    }

    /* renamed from: h */
    public final boolean mo43318h() {
        return this.f56625b.mo44060h();
    }

    /* renamed from: i */
    public final void mo43319i() {
        this.f56625b.mo44061i();
    }

    /* renamed from: k */
    public final void mo43321k() {
        this.f56625b.mo44063k();
    }

    /* renamed from: l */
    public final long mo43322l() {
        return this.f56625b.mo44064l();
    }

    /* renamed from: m */
    public final int mo43323m() {
        return this.f56625b.mo44065m();
    }

    /* renamed from: n */
    public final int mo43324n() {
        return this.f56625b.mo44066n();
    }

    /* renamed from: o */
    public final int mo43325o() {
        return this.f56625b.mo44067o();
    }

    /* renamed from: p */
    public final float mo43326p() {
        return this.f56625b.mo44068p();
    }

    /* renamed from: q */
    public final int mo43327q() {
        return this.f56625b.mo44069q();
    }

    /* renamed from: r */
    public final int mo43328r() {
        return this.f56625b.mo44070r();
    }

    /* renamed from: s */
    public final int mo43329s() {
        return this.f56625b.mo44071s();
    }

    /* renamed from: t */
    public final float mo43330t() {
        return this.f56625b.mo44072t();
    }

    /* renamed from: u */
    public final float mo43331u() {
        return this.f56625b.mo44073u();
    }

    /* renamed from: v */
    public final int mo43332v() {
        return this.f56625b.mo44074v();
    }

    /* renamed from: b */
    public final void mo43302b() {
        this.f56625b.mo44045b();
    }

    /* renamed from: w */
    public final float[] mo43333w() {
        float[] w = this.f56625b.mo44075w();
        C52711k.m112236a((Object) w, "safeRemoteMediaController.suggestVolume");
        return w;
    }

    /* renamed from: j */
    public final void mo43320j() {
        this.f56628e = null;
        this.f56632i = null;
        this.f56631h = null;
        this.f56630g = null;
        this.f56629f = null;
        this.f56627d = null;
        this.f56626c = null;
        this.f56633j = null;
        this.f56625b.mo44062j();
    }

    /* renamed from: a */
    public final void mo43286a() {
        this.f56625b.mo44031a();
    }

    /* renamed from: c */
    public final void mo43309c(boolean z) {
        this.f56625b.mo44052c(z);
    }

    /* renamed from: d */
    public final void mo43311d(boolean z) {
        this.f56625b.mo44056e(z);
    }

    /* renamed from: f */
    public final void mo43315f(boolean z) {
        this.f56625b.mo44054d(z);
    }

    /* renamed from: g */
    public final boolean mo43317g(boolean z) {
        return this.f56625b.mo44058f(z);
    }

    /* renamed from: b */
    public final void mo43303b(Surface surface) {
        C52711k.m112240b(surface, "surface");
        this.f56625b.mo44046b(surface);
    }

    /* renamed from: b */
    public final void mo43306b(C52671b<? super Integer, C52860x> bVar) {
        C20686a aVar;
        this.f56630g = bVar;
        C20791j jVar = this.f56625b;
        if (bVar != null) {
            aVar = C20623d.m51959a(bVar);
        } else {
            aVar = null;
        }
        jVar.mo44049b((C20685i) aVar);
    }

    /* renamed from: b */
    public final boolean mo43307b(boolean z) {
        return this.f56625b.mo44050b(z);
    }

    public C20750d(C20791j jVar, String str) {
        C52711k.m112240b(str, "photoPath");
        this.f56634k = str;
        Object newProxyInstance = Proxy.newProxyInstance(C20791j.class.getClassLoader(), new Class[]{C20791j.class}, new C20752d(jVar));
        if (newProxyInstance != null) {
            this.f56625b = (C20791j) newProxyInstance;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteMediaService");
    }

    /* renamed from: a */
    public final int mo43282a(Surface surface, String str) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        return this.f56625b.mo44028a(surface, str);
    }

    /* renamed from: b */
    public final void mo43304b(Surface surface, String str) {
        this.f56625b.mo44047b(surface, str);
    }

    /* renamed from: b */
    public final void mo43305b(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C20686a aVar;
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56632i = bVar;
        C20791j jVar = this.f56625b;
        if (bVar != null) {
            aVar = C20623d.m51959a(bVar);
        } else {
            aVar = null;
        }
        jVar.mo44048b(surface, str, aVar);
    }

    /* renamed from: a */
    public final int mo43283a(String str, int i, int i2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(bVar, "callback");
        this.f56627d = bVar;
        this.f56625b.mo44040a(str, i, i2, true, CompressFormat.PNG.ordinal(), (C20688j) C20608c.m51928a(bVar));
        return 0;
    }

    /* renamed from: a */
    public final int mo43284a(List<ASMediaSegment> list, String str, String str2, int i) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C20791j jVar = this.f56625b;
        Object[] array = list.toArray(new ASMediaSegment[0]);
        if (array != null) {
            return jVar.mo44029a((ASMediaSegment[]) array, str, str2, i);
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final RecorderConcatResult mo43285a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        RecorderConcatResult a = this.f56625b.mo44030a(str, str2, str3, str4);
        if (a == null) {
            return new RecorderConcatResult(-1, "", "");
        }
        return a;
    }

    /* renamed from: a */
    public final int mo43279a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56625b.mo44026a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo43287a(double d, boolean z, float f, int i, int i2, boolean z2, C52671b<? super Integer, C52860x> bVar) {
        C52671b<? super Integer, C52860x> bVar2 = bVar;
        C52711k.m112240b(bVar2, "callback");
        this.f56628e = bVar2;
        C20791j jVar = this.f56625b;
        C52711k.m112240b(bVar2, "$this$toSandboxStartRecorderCallback");
        jVar.mo44032a(d, z, f, i, i2, z2, new C20647v(bVar2));
    }

    /* renamed from: a */
    public final int mo43280a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        String str4 = str2;
        C52711k.m112240b(str4, "strDetectModelsDir");
        return this.f56625b.mo44027a(i, i2, str3, i3, i4, str4, i5, z);
    }
}
