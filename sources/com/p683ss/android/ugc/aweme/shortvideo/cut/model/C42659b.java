package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.b */
public final class C42659b {

    /* renamed from: a */
    HashMap<String, Float> f107927a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Float> f107928b = new HashMap<>();

    /* renamed from: c */
    public long f107929c;

    /* renamed from: d */
    public long f107930d;

    /* renamed from: e */
    public float f107931e;

    /* renamed from: f */
    public long f107932f;

    /* renamed from: g */
    public float f107933g;

    /* renamed from: h */
    public long f107934h;

    /* renamed from: i */
    public long f107935i;

    /* renamed from: j */
    private float f107936j;

    /* renamed from: a */
    public final long mo86960a(int i) {
        if (i == 2 || i == 0) {
            return this.f107930d;
        }
        return this.f107929c;
    }

    /* renamed from: a */
    public final void mo86962a(String str, float f) {
        this.f107927a.put(str, Float.valueOf(f));
    }

    public C42659b(List<VideoSegment> list, float f) {
        this.f107936j = f;
        for (VideoSegment videoSegment : list) {
            this.f107927a.put(videoSegment.mo86950e(), Float.valueOf(videoSegment.mo86954h()));
        }
    }

    /* renamed from: a */
    public final void mo86963a(List<VideoSegment> list, float f) {
        long j;
        int i;
        if (C9414h.m18630a(list)) {
            C50203g.m108362c("videoSegmentList is empty");
            j = 0;
        } else {
            float f2 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f107911j) {
                    f2 += ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f);
                }
            }
            j = (long) f2;
        }
        this.f107929c = j;
        this.f107932f = C42652k.m93580a(this.f107929c);
        StringBuilder sb = new StringBuilder("videoMultiDur: ");
        sb.append(this.f107929c);
        sb.append(" maxCutDuration is ");
        sb.append(this.f107932f);
        sb.append(" videoSize is ");
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        C50203g.m108362c(sb.toString());
        if (this.f107934h > 0) {
            this.f107932f = Math.min(this.f107929c, this.f107934h);
        }
        this.f107931e = ((float) this.f107932f) / this.f107936j;
        this.f107933g = (((float) C43307ea.m94995a()) * 1.0f) / this.f107931e;
        if (this.f107935i > 0) {
            this.f107933g = ((float) this.f107935i) / this.f107931e;
        }
        for (Entry entry : this.f107927a.entrySet()) {
            this.f107928b.put(entry.getKey(), Float.valueOf(this.f107931e * ((Float) entry.getValue()).floatValue() * f));
        }
    }

    /* renamed from: b */
    public static int m93613b(List<VideoSegment> list, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            VideoSegment videoSegment = (VideoSegment) list.get(i);
            f3 += ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f2);
            if (f <= f3) {
                return i;
            }
        }
        return list.size() - 1;
    }

    /* renamed from: a */
    public static long m93612a(List<VideoSegment> list, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f107911j) {
                arrayList.add(list.get(i2));
            }
        }
        long j = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j += videoSegment.f107904c;
            if (f <= ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f2)) {
                i = i3;
                break;
            }
            f -= ((float) (videoSegment.mo86953g() - videoSegment.mo86952f())) / (videoSegment.mo86954h() * f2);
            i3++;
        }
        if (i3 == arrayList.size()) {
            return (j - ((VideoSegment) arrayList.get(i)).f107904c) + ((VideoSegment) arrayList.get(i)).mo86953g();
        }
        return (long) (((float) ((j - ((VideoSegment) arrayList.get(i)).f107904c) + ((VideoSegment) arrayList.get(i)).mo86952f())) + (f * ((VideoSegment) arrayList.get(i)).mo86954h() * f2));
    }

    /* renamed from: a */
    public final void mo86961a(long j, String str, float f, int i) {
        long j2 = (long) (((float) j) / f);
        this.f107930d = j2;
        this.f107932f = C42652k.m93580a(j2);
        StringBuilder sb = new StringBuilder("path: ");
        sb.append(str);
        sb.append(" maxCutDuration is ");
        sb.append(this.f107932f);
        C50203g.m108362c(sb.toString());
        if (this.f107934h > 0) {
            this.f107932f = Math.min(this.f107934h, this.f107930d);
        }
        this.f107931e = ((float) this.f107932f) / this.f107936j;
        if (i == 0) {
            this.f107933g = (((float) C43307ea.m94995a()) * 1.0f) / this.f107931e;
        } else {
            this.f107933g = 500.0f / this.f107931e;
        }
        if (this.f107935i > 0) {
            this.f107933g = ((float) this.f107935i) / this.f107931e;
        }
        this.f107928b.put(str, Float.valueOf(this.f107931e * f));
    }
}
