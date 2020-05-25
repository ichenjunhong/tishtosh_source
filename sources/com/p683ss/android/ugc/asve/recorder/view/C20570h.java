package com.p683ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.view.h */
public final class C20570h implements C20426a {

    /* renamed from: a */
    private final C20426a f56374a;

    /* renamed from: a */
    public final int mo43279a(double d, boolean z, float f, int i, int i2, boolean z2) {
        return this.f56374a.mo43279a(d, z, f, i, i2, z2);
    }

    /* renamed from: a */
    public final int mo43280a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z) {
        String str3 = str;
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        String str4 = str2;
        C52711k.m112240b(str4, "strDetectModelsDir");
        return this.f56374a.mo43280a(i, i2, str3, i3, i4, str4, i5, z);
    }

    /* renamed from: a */
    public final int mo43281a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return this.f56374a.mo43281a(context, audioRecorderInterface);
    }

    /* renamed from: a */
    public final int mo43282a(Surface surface, String str) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        return this.f56374a.mo43282a(surface, str);
    }

    /* renamed from: a */
    public final int mo43283a(String str, int i, int i2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(bVar, "callback");
        return this.f56374a.mo43283a(str, i, i2, bVar);
    }

    /* renamed from: a */
    public final int mo43284a(List<ASMediaSegment> list, String str, String str2, int i) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        return this.f56374a.mo43284a(list, str, str2, i);
    }

    /* renamed from: a */
    public final RecorderConcatResult mo43285a(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        return this.f56374a.mo43285a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo43286a() {
        this.f56374a.mo43286a();
    }

    /* renamed from: a */
    public final void mo43287a(double d, boolean z, float f, int i, int i2, boolean z2, C52671b<? super Integer, C52860x> bVar) {
        C52671b<? super Integer, C52860x> bVar2 = bVar;
        C52711k.m112240b(bVar2, "callback");
        this.f56374a.mo43287a(d, z, f, i, i2, z2, bVar2);
    }

    /* renamed from: a */
    public final void mo43288a(float f) {
        this.f56374a.mo43288a(f);
    }

    /* renamed from: a */
    public final void mo43289a(float f, int i, int i2) {
        this.f56374a.mo43289a(f, i, i2);
    }

    /* renamed from: a */
    public final void mo43290a(int i) {
        this.f56374a.mo43290a(i);
    }

    /* renamed from: a */
    public final void mo43291a(Surface surface) {
        this.f56374a.mo43291a(surface);
    }

    /* renamed from: a */
    public final void mo43292a(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56374a.mo43292a(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo43293a(C50616e eVar) {
        this.f56374a.mo43293a(eVar);
    }

    /* renamed from: a */
    public final void mo43294a(C52671b<? super Integer, C52860x> bVar) {
        this.f56374a.mo43294a(bVar);
    }

    /* renamed from: a */
    public final void mo43295a(String str) {
        this.f56374a.mo43295a(str);
    }

    /* renamed from: a */
    public final void mo43296a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "strImagePath");
        C52711k.m112240b(compressFormat, "format");
        C52711k.m112240b(bVar, "callback");
        this.f56374a.mo43296a(str, i, i2, z, compressFormat, bVar);
    }

    /* renamed from: a */
    public final void mo43297a(String str, long j, long j2) {
        this.f56374a.mo43297a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo43298a(String str, String str2, boolean z, String str3, String str4, C52671b<? super RecorderConcatResult, C52860x> bVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "description");
        C52711k.m112240b(str4, "coment");
        this.f56374a.mo43298a(str, str2, z, str3, str4, bVar);
    }

    /* renamed from: a */
    public final void mo43299a(List<ASMediaSegment> list, String str, String str2, int i, C50542f fVar) {
        C52711k.m112240b(list, "mediaSegments");
        C52711k.m112240b(str, "videoDir");
        C52711k.m112240b(fVar, "listener");
        this.f56374a.mo43299a(list, str, str2, i, fVar);
    }

    /* renamed from: a */
    public final void mo43300a(boolean z) {
        this.f56374a.mo43300a(z);
    }

    /* renamed from: b */
    public final int mo43301b(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        return this.f56374a.mo43301b(context, audioRecorderInterface);
    }

    /* renamed from: b */
    public final void mo43302b() {
        this.f56374a.mo43302b();
    }

    /* renamed from: b */
    public final void mo43303b(Surface surface) {
        C52711k.m112240b(surface, "surface");
        this.f56374a.mo43303b(surface);
    }

    /* renamed from: b */
    public final void mo43304b(Surface surface, String str) {
        this.f56374a.mo43304b(surface, str);
    }

    /* renamed from: b */
    public final void mo43305b(Surface surface, String str, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        this.f56374a.mo43305b(surface, str, bVar);
    }

    /* renamed from: b */
    public final void mo43306b(C52671b<? super Integer, C52860x> bVar) {
        this.f56374a.mo43306b(bVar);
    }

    /* renamed from: b */
    public final boolean mo43307b(boolean z) {
        return this.f56374a.mo43307b(z);
    }

    /* renamed from: c */
    public final long mo43308c() {
        return this.f56374a.mo43308c();
    }

    /* renamed from: c */
    public final void mo43309c(boolean z) {
        this.f56374a.mo43309c(z);
    }

    /* renamed from: d */
    public final void mo43310d() {
        this.f56374a.mo43310d();
    }

    /* renamed from: d */
    public final void mo43311d(boolean z) {
        this.f56374a.mo43311d(z);
    }

    /* renamed from: e */
    public final void mo43312e() {
        this.f56374a.mo43312e();
    }

    /* renamed from: e */
    public final void mo43313e(boolean z) {
        this.f56374a.mo43313e(z);
    }

    /* renamed from: f */
    public final void mo43314f() {
        this.f56374a.mo43314f();
    }

    /* renamed from: f */
    public final void mo43315f(boolean z) {
        this.f56374a.mo43315f(z);
    }

    /* renamed from: g */
    public final long mo43316g() {
        return this.f56374a.mo43316g();
    }

    /* renamed from: g */
    public final boolean mo43317g(boolean z) {
        return this.f56374a.mo43317g(z);
    }

    /* renamed from: h */
    public final boolean mo43318h() {
        return this.f56374a.mo43318h();
    }

    /* renamed from: i */
    public final void mo43319i() {
        this.f56374a.mo43319i();
    }

    /* renamed from: j */
    public final void mo43320j() {
        this.f56374a.mo43320j();
    }

    /* renamed from: k */
    public final void mo43321k() {
        this.f56374a.mo43321k();
    }

    /* renamed from: l */
    public final long mo43322l() {
        return this.f56374a.mo43322l();
    }

    /* renamed from: m */
    public final int mo43323m() {
        return this.f56374a.mo43323m();
    }

    /* renamed from: n */
    public final int mo43324n() {
        return this.f56374a.mo43324n();
    }

    /* renamed from: o */
    public final int mo43325o() {
        return this.f56374a.mo43325o();
    }

    /* renamed from: p */
    public final float mo43326p() {
        return this.f56374a.mo43326p();
    }

    /* renamed from: q */
    public final int mo43327q() {
        return this.f56374a.mo43327q();
    }

    /* renamed from: r */
    public final int mo43328r() {
        return this.f56374a.mo43328r();
    }

    /* renamed from: s */
    public final int mo43329s() {
        return this.f56374a.mo43329s();
    }

    /* renamed from: t */
    public final float mo43330t() {
        return this.f56374a.mo43330t();
    }

    /* renamed from: u */
    public final float mo43331u() {
        return this.f56374a.mo43331u();
    }

    /* renamed from: v */
    public final int mo43332v() {
        return this.f56374a.mo43332v();
    }

    /* renamed from: w */
    public final float[] mo43333w() {
        return this.f56374a.mo43333w();
    }

    public C20570h(C20426a aVar) {
        C52711k.m112240b(aVar, "ctrl");
        this.f56374a = aVar;
    }
}
