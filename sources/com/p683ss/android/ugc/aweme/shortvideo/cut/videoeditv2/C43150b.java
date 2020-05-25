package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b */
public final class C43150b {

    /* renamed from: e */
    public static final C43151a f109076e = new C43151a(null);

    /* renamed from: a */
    public float f109077a;

    /* renamed from: b */
    public long f109078b;

    /* renamed from: c */
    public long f109079c;

    /* renamed from: d */
    public long f109080d;

    /* renamed from: f */
    private float f109081f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.b$a */
    public static final class C43151a {
        private C43151a() {
        }

        public /* synthetic */ C43151a(C52707g gVar) {
            this();
        }
    }

    public C43150b(float f) {
        this.f109081f = f;
    }

    /* renamed from: a */
    public final void mo87718a(long j) {
        this.f109078b = Math.min(Math.min(this.f109078b, j), this.f109079c);
        this.f109077a = ((float) this.f109078b) / this.f109081f;
    }

    /* renamed from: b */
    public final void mo87720b(long j, float f) {
        this.f109078b = Math.min(this.f109078b, j);
        this.f109077a = ((float) this.f109078b) / this.f109081f;
    }

    /* renamed from: a */
    public static final long m94679a(List<? extends VideoSegment> list, float f) {
        C52711k.m112240b(list, "videoSegmentList");
        if (C9414h.m18630a(list)) {
            return 0;
        }
        float f2 = 0.0f;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f107911j) {
                f2 += ((float) (videoSegment.f107906e - videoSegment.f107905d)) / (videoSegment.f107907f * f);
            }
        }
        return (long) f2;
    }

    /* renamed from: a */
    public final void mo87719a(long j, float f) {
        this.f109078b = Math.min(Math.min(this.f109078b, (long) (((float) j) / f)), this.f109079c);
        this.f109077a = ((float) this.f109078b) / this.f109081f;
    }

    /* renamed from: a */
    public static final C52847n<Integer, Float> m94680a(long j, float f, int i, List<? extends VideoSegment> list) {
        C52711k.m112240b(list, "videoList");
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f107911j) {
                float f4 = (float) j;
                if (f4 < f2) {
                    break;
                }
                float f5 = ((float) (videoSegment.f107906e - videoSegment.f107905d)) / videoSegment.f107907f;
                float f6 = f2 + f5;
                if (f4 >= f6) {
                    i2 += C52733a.m112277a((float) Math.ceil((double) (f5 / f)));
                } else {
                    float f7 = f4 - f2;
                    int i3 = (int) (f7 / f);
                    i2 += i3;
                    f3 = ((f7 - (((float) i3) * f)) / f) * ((float) i);
                }
                f2 = f6;
            }
        }
        return new C52847n<>(Integer.valueOf(i2), Float.valueOf(f3));
    }
}
