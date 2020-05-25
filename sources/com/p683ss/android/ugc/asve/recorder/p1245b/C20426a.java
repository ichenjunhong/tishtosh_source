package com.p683ss.android.ugc.asve.recorder.p1245b;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.VEListener.C50542f;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.asve.recorder.b.a */
public interface C20426a {
    /* renamed from: a */
    int mo43279a(double d, boolean z, float f, int i, int i2, boolean z2);

    /* renamed from: a */
    int mo43280a(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z);

    /* renamed from: a */
    int mo43281a(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: a */
    int mo43282a(Surface surface, String str);

    /* renamed from: a */
    int mo43283a(String str, int i, int i2, C52671b<? super Integer, C52860x> bVar);

    /* renamed from: a */
    int mo43284a(List<ASMediaSegment> list, String str, String str2, int i);

    /* renamed from: a */
    RecorderConcatResult mo43285a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo43286a();

    /* renamed from: a */
    void mo43287a(double d, boolean z, float f, int i, int i2, boolean z2, C52671b<? super Integer, C52860x> bVar);

    /* renamed from: a */
    void mo43288a(float f);

    /* renamed from: a */
    void mo43289a(float f, int i, int i2);

    /* renamed from: a */
    void mo43290a(int i);

    /* renamed from: a */
    void mo43291a(Surface surface);

    /* renamed from: a */
    void mo43292a(Surface surface, String str, C52671b<? super Integer, C52860x> bVar);

    /* renamed from: a */
    void mo43293a(C50616e eVar);

    /* renamed from: a */
    void mo43294a(C52671b<? super Integer, C52860x> bVar);

    /* renamed from: a */
    void mo43295a(String str);

    /* renamed from: a */
    void mo43296a(String str, int i, int i2, boolean z, CompressFormat compressFormat, C52671b<? super Integer, C52860x> bVar);

    /* renamed from: a */
    void mo43297a(String str, long j, long j2);

    /* renamed from: a */
    void mo43298a(String str, String str2, boolean z, String str3, String str4, C52671b<? super RecorderConcatResult, C52860x> bVar);

    /* renamed from: a */
    void mo43299a(List<ASMediaSegment> list, String str, String str2, int i, C50542f fVar);

    /* renamed from: a */
    void mo43300a(boolean z);

    /* renamed from: b */
    int mo43301b(Context context, AudioRecorderInterface audioRecorderInterface);

    /* renamed from: b */
    void mo43302b();

    /* renamed from: b */
    void mo43303b(Surface surface);

    /* renamed from: b */
    void mo43304b(Surface surface, String str);

    /* renamed from: b */
    void mo43305b(Surface surface, String str, C52671b<? super Integer, C52860x> bVar);

    /* renamed from: b */
    void mo43306b(C52671b<? super Integer, C52860x> bVar);

    /* renamed from: b */
    boolean mo43307b(boolean z);

    /* renamed from: c */
    long mo43308c();

    /* renamed from: c */
    void mo43309c(boolean z);

    /* renamed from: d */
    void mo43310d();

    /* renamed from: d */
    void mo43311d(boolean z);

    /* renamed from: e */
    void mo43312e();

    /* renamed from: e */
    void mo43313e(boolean z);

    /* renamed from: f */
    void mo43314f();

    /* renamed from: f */
    void mo43315f(boolean z);

    /* renamed from: g */
    long mo43316g();

    /* renamed from: g */
    boolean mo43317g(boolean z);

    /* renamed from: h */
    boolean mo43318h();

    /* renamed from: i */
    void mo43319i();

    /* renamed from: j */
    void mo43320j();

    /* renamed from: k */
    void mo43321k();

    /* renamed from: l */
    long mo43322l();

    /* renamed from: m */
    int mo43323m();

    /* renamed from: n */
    int mo43324n();

    /* renamed from: o */
    int mo43325o();

    /* renamed from: p */
    float mo43326p();

    /* renamed from: q */
    int mo43327q();

    /* renamed from: r */
    int mo43328r();

    /* renamed from: s */
    int mo43329s();

    /* renamed from: t */
    float mo43330t();

    /* renamed from: u */
    float mo43331u();

    /* renamed from: v */
    int mo43332v();

    /* renamed from: w */
    float[] mo43333w();
}
