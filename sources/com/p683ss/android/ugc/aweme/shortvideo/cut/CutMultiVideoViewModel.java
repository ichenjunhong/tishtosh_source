package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel */
public class CutMultiVideoViewModel extends C0209x implements C0183j {

    /* renamed from: a */
    public C0198r<C0794k<Integer, Integer>> f107667a = new C0198r<>();

    /* renamed from: b */
    public C0198r<Long> f107668b = new C0198r<>();

    /* renamed from: c */
    public C0198r<Long> f107669c = new C0198r<>();

    /* renamed from: d */
    public C0198r<Float> f107670d = new C0198r<>();

    /* renamed from: e */
    public C0198r<Void> f107671e = new C0198r<>();

    /* renamed from: f */
    public C0198r<VideoSegment> f107672f = new C0198r<>();

    /* renamed from: g */
    public C0198r<C0794k<Integer, Integer>> f107673g = new C0198r<>();

    /* renamed from: h */
    public C0198r<Void> f107674h = new C0198r<>();

    /* renamed from: i */
    public C0198r<Void> f107675i = new C0198r<>();

    /* renamed from: j */
    public C0198r<C42663f> f107676j = new C0198r<>();

    /* renamed from: k */
    public boolean f107677k;

    /* renamed from: l */
    public int f107678l;

    /* renamed from: m */
    private HashMap<String, Integer> f107679m = new HashMap<>();

    /* renamed from: b */
    public final void mo86802b() {
        this.f107671e.setValue(null);
    }

    /* renamed from: c */
    public final void mo86803c() {
        this.f107674h.setValue(null);
    }

    /* renamed from: d */
    public final void mo86804d() {
        this.f107675i.setValue(null);
    }

    /* renamed from: a */
    public final void mo86795a() {
        this.f107667a.setValue(C0794k.m2265a(Integer.valueOf(0), Integer.valueOf(0)));
    }

    /* renamed from: a */
    public final void mo86799a(VideoSegment videoSegment) {
        this.f107672f.setValue(videoSegment);
    }

    /* renamed from: a */
    public final void mo86796a(float f) {
        this.f107670d.setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo86800a(C42663f fVar) {
        this.f107676j.setValue(fVar);
    }

    /* renamed from: a */
    public final void mo86801a(String str) {
        this.f107679m.put(str, Integer.valueOf(1));
    }

    /* renamed from: a */
    public final void mo86797a(int i, int i2) {
        this.f107673g.setValue(C0794k.m2265a(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public final void mo86798a(long j, List<VideoSegment> list, float f) {
        int i;
        this.f107669c.setValue(Long.valueOf(j));
        if (this.f107667a.getValue() != null) {
            i = ((Integer) ((C0794k) this.f107667a.getValue()).f2712b).intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f107911j) {
                arrayList.add(list.get(i2));
            }
        }
        long j2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j2 = (long) (((float) j2) + (((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f)));
            if (j2 > j) {
                this.f107667a.setValue(C0794k.m2265a(Integer.valueOf(i), Integer.valueOf(i3)));
                return;
            }
        }
    }
}
