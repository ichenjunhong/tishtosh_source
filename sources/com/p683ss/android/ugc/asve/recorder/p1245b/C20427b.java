package com.p683ss.android.ugc.asve.recorder.p1245b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.opengl.EGLContext;
import android.view.Surface;
import com.p683ss.android.medialib.model.C19350a;
import com.p683ss.android.medialib.p1180b.C19222a.C19224b;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.medialib.presenter.C19361d.C19375b;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.util.List;
import java.util.concurrent.ExecutorService;
import leakcanary.internal.LeakCanaryFileProvider;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.b.b */
public final class C20427b implements C20426a {

    /* renamed from: a */
    public final C19361d f55994a;

    /* renamed from: b */
    private final C20363h f55995b;

    /* renamed from: com.ss.android.ugc.asve.recorder.b.b$a */
    static final class C20428a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20427b f55996a;

        /* renamed from: b */
        final /* synthetic */ String f55997b;

        /* renamed from: c */
        final /* synthetic */ String f55998c;

        /* renamed from: d */
        final /* synthetic */ String f55999d;

        /* renamed from: e */
        final /* synthetic */ C52671b f56000e;

        C20428a(C20427b bVar, String str, String str2, String str3, C52671b bVar2) {
            this.f55996a = bVar;
            this.f55997b = str;
            this.f55998c = str2;
            this.f55999d = str3;
            this.f56000e = bVar2;
        }

        public final void run() {
            int a = this.f55996a.f55994a.mo40267a(this.f55997b, this.f55998c, this.f55999d, "");
            C52671b bVar = this.f56000e;
            if (bVar != null) {
                bVar.invoke(new RecorderConcatResult(a, this.f55997b, this.f55998c));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.b.b$b */
    public static final class C20429b implements C19375b {

        /* renamed from: a */
        final /* synthetic */ C50616e f56001a;

        public final boolean cx_() {
            return this.f56001a.mo43762a();
        }

        C20429b(C50616e eVar) {
            this.f56001a = eVar;
        }

        /* renamed from: a */
        public final void mo40419a(C19350a aVar) {
            EGLContext eGLContext;
            int i;
            int i2;
            int i3;
            int i4;
            long j;
            C50616e eVar = this.f56001a;
            if (aVar != null) {
                eGLContext = aVar.f53491a;
            } else {
                eGLContext = null;
            }
            if (aVar != null) {
                i = aVar.f53492b;
            } else {
                i = 0;
            }
            if (aVar != null) {
                i2 = aVar.f53493c;
            } else {
                i2 = 0;
            }
            if (aVar != null) {
                i3 = aVar.f53494d;
            } else {
                i3 = 0;
            }
            if (aVar != null) {
                i4 = aVar.f53495e;
            } else {
                i4 = 0;
            }
            if (aVar != null) {
                j = aVar.f53496f;
            } else {
                j = 0;
            }
            eVar.mo43761a(eGLContext, i, i2, i3, i4, j);
        }
    }

    /* renamed from: b */
    public final void mo43305b(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
    }

    /* renamed from: g */
    public final boolean mo43317g(boolean z) {
        return false;
    }

    /* renamed from: m */
    public final int mo43323m() {
        return -1;
    }

    /* renamed from: n */
    public final int mo43324n() {
        return -1;
    }

    /* renamed from: o */
    public final int mo43325o() {
        return -1;
    }

    /* renamed from: p */
    public final float mo43326p() {
        return -1.0f;
    }

    /* renamed from: q */
    public final int mo43327q() {
        return -1;
    }

    /* renamed from: r */
    public final int mo43328r() {
        return -1;
    }

    /* renamed from: s */
    public final int mo43329s() {
        return -1;
    }

    /* renamed from: t */
    public final float mo43330t() {
        return -1.0f;
    }

    /* renamed from: u */
    public final float mo43331u() {
        return -1.0f;
    }

    /* renamed from: v */
    public final int mo43332v() {
        return -1;
    }

    /* renamed from: a */
    public final void mo43299a(List<ASMediaSegment> list, String str, String str2, int i, C50542f fVar) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C52711k.m112240b(fVar, "listener");
        fVar.mo43336a(this.f55994a.mo40252a(list.size(), str));
    }

    /* renamed from: a */
    public final void mo43295a(String str) {
        this.f55994a.mo40279a(str);
    }

    /* renamed from: a */
    public final void mo43297a(String str, long j, long j2) {
        this.f55994a.mo40278a(j, j2);
    }

    /* renamed from: a */
    public final void mo43293a(C50616e eVar) {
        if (eVar == null) {
            this.f55994a.mo40297a((C19375b) null);
        } else {
            this.f55994a.mo40297a((C19375b) new C20429b(eVar));
        }
    }

    /* renamed from: a */
    public final void mo43300a(boolean z) {
        this.f55994a.mo40389k(z);
    }

    /* renamed from: a */
    public final void mo43294a(C52671b<? super Integer, C52860x> bVar) {
        mo43312e();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(0));
        }
    }

    /* renamed from: a */
    public final void mo43291a(Surface surface) {
        this.f55994a.mo40320b(surface);
    }

    /* renamed from: a */
    public final void mo43290a(int i) {
        this.f55994a.mo40327b(i);
    }

    /* renamed from: a */
    public final void mo43296a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(compressFormat, "format");
        C52711k.m112240b(bVar, "callback");
        String str2 = str;
        this.f55994a.mo40269a(str2, new int[]{i, i2}, z, compressFormat, (C19224b) new C20430c(bVar));
    }

    /* renamed from: a */
    public final void mo43298a(String str, String str2, boolean z, String str3, String str4, C52671b<? super RecorderConcatResult, C52860x> bVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        ExecutorService a = C20315a.m50092a().mo43147a();
        C20428a aVar = new C20428a(this, str, str2, str3, bVar);
        a.submit(aVar);
    }

    /* renamed from: a */
    public final void mo43292a(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(mo43282a(surface, str)));
        }
    }

    /* renamed from: a */
    public final void mo43288a(float f) {
        this.f55994a.mo40284a(f, -1, -1);
    }

    /* renamed from: a */
    public final void mo43289a(float f, int i, int i2) {
        this.f55994a.mo40284a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo43286a() {
        this.f55994a.mo40400p();
    }

    /* renamed from: b */
    public final void mo43302b() {
        this.f55994a.mo40402q();
    }

    /* renamed from: c */
    public final long mo43308c() {
        return this.f55994a.mo40372g();
    }

    /* renamed from: d */
    public final void mo43310d() {
        this.f55994a.mo40381i();
    }

    /* renamed from: e */
    public final void mo43312e() {
        this.f55994a.mo40386j();
    }

    /* renamed from: f */
    public final void mo43314f() {
        this.f55994a.mo40398o();
    }

    /* renamed from: g */
    public final long mo43316g() {
        return this.f55994a.mo40372g();
    }

    /* renamed from: h */
    public final boolean mo43318h() {
        return this.f55994a.mo40390k();
    }

    /* renamed from: i */
    public final void mo43319i() {
        this.f55994a.mo40394m();
    }

    /* renamed from: j */
    public final void mo43320j() {
        this.f55994a.mo40367f();
    }

    /* renamed from: k */
    public final void mo43321k() {
        this.f55994a.mo40398o();
    }

    /* renamed from: l */
    public final long mo43322l() {
        return this.f55994a.mo40377h();
    }

    /* renamed from: w */
    public final float[] mo43333w() {
        return new float[]{1.0f, 1.0f};
    }

    /* renamed from: c */
    public final void mo43309c(boolean z) {
        this.f55994a.mo40352d(z ? 1 : 0);
    }

    /* renamed from: d */
    public final void mo43311d(boolean z) {
        this.f55994a.mo40407s(z);
    }

    /* renamed from: e */
    public final void mo43313e(boolean z) {
        this.f55994a.mo40369f(z);
    }

    /* renamed from: f */
    public final void mo43315f(boolean z) {
        this.f55994a.mo40359e(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo43303b(Surface surface) {
        C52711k.m112240b(surface, "surface");
        this.f55994a.mo40320b(surface);
    }

    /* renamed from: b */
    public final void mo43306b(C52671b<? super Integer, C52860x> bVar) {
        mo43314f();
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(0));
        }
    }

    /* renamed from: b */
    public final boolean mo43307b(boolean z) {
        return this.f55994a.mo40388j(z);
    }

    /* renamed from: b */
    public final int mo43301b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return this.f55994a.mo40339c(context, 5, audioRecorderInterface);
    }

    public C20427b(C19361d dVar, C20363h hVar) {
        C52711k.m112240b(dVar, "mediaRecordPresenter");
        C52711k.m112240b(hVar, "recorderContext");
        this.f55994a = dVar;
        this.f55995b = hVar;
    }

    /* renamed from: a */
    public final int mo43281a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return this.f55994a.mo40253a(context, 5, audioRecorderInterface);
    }

    /* renamed from: b */
    public final void mo43304b(Surface surface, String str) {
        this.f55994a.mo40256a(surface, str);
    }

    /* renamed from: a */
    public final int mo43282a(Surface surface, String str) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        return this.f55994a.mo40256a(surface, str);
    }

    /* renamed from: a */
    public final int mo43283a(String str, int i, int i2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(bVar, "callback");
        return this.f55994a.mo40268a(str, new int[]{i, i2}, (C19224b) new C20430c(bVar));
    }

    /* renamed from: a */
    public final int mo43284a(List<ASMediaSegment> list, String str, String str2, int i) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        return this.f55994a.mo40252a(list.size(), str);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo43285a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        return new RecorderConcatResult(this.f55994a.mo40267a(str, str2, str3, ""), str, str2);
    }

    /* renamed from: a */
    public final int mo43279a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f55994a.mo40246a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final void mo43287a(double d, boolean z, float f, int i, int i2, boolean z2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "callback");
        bVar.invoke(Integer.valueOf(mo43279a(d, z, f, i, i2, z2)));
    }

    /* renamed from: a */
    public final int mo43280a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        String str4 = str2;
        C52711k.m112240b(str4, "strDetectModelsDir");
        return this.f55994a.mo40251a(i, i2, str3, i3, i4, str4, i5, z);
    }
}
