package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42648h.C42649a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50720o.C50743d;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.d */
public final class C42991d extends C42990c {

    /* renamed from: a */
    private int f108569a;

    /* renamed from: b */
    private VideoSegment f108570b;

    /* renamed from: c */
    private final C20347c f108571c;

    /* renamed from: d */
    private C50633an f108572d;

    /* renamed from: a */
    public final void mo86914a(boolean z, boolean z2, List<? extends VideoSegment> list) {
    }

    /* renamed from: b */
    public final void mo86918b(int i, int i2) {
        this.f108571c.mo43028b(i, i2);
    }

    /* renamed from: a */
    public final void mo86911a(List<? extends VideoSegment> list, int i) {
        if (!C23715d.m58202a((Collection<T>) list)) {
            C46813b.m101661b(this.f108572d, list);
        }
    }

    public C42991d(C20347c cVar, C50633an anVar) {
        C52711k.m112240b(cVar, "veEditor");
        C52711k.m112240b(anVar, "timelineParams");
        this.f108571c = cVar;
        this.f108572d = anVar;
    }

    /* renamed from: a */
    public final void mo86909a(int i, VideoSegment videoSegment) {
        C52711k.m112240b(videoSegment, "segment");
        this.f108570b = videoSegment;
        this.f108569a = i;
        int i2 = videoSegment.f107912k;
        videoSegment.f107912k = 0;
        C46813b.m101658a(this.f108572d, i, videoSegment);
        this.f108571c.mo42994a(this.f108572d, (int) videoSegment.mo86952f(), (int) videoSegment.mo86953g());
        videoSegment.f107912k = i2;
        C42649a.m93564a(this, (float) videoSegment.f107912k, videoSegment.f107913l, videoSegment.f107914m, 0, 0, 24, null);
    }

    /* renamed from: a */
    public final void mo86913a(List<? extends VideoSegment> list, boolean z) {
        C46813b.m101659a(this.f108572d, list);
        this.f108571c.mo42993a(this.f108572d);
        if (z) {
            this.f108571c.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
        }
        C42649a.m93564a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
    }

    /* renamed from: a */
    public final void mo86908a(int i, int i2, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        C52711k.m112240b(list, "videoList");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i3 = 0;
        if (list2 != null) {
            int i4 = 0;
            for (Object next : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C52575l.m112100b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                strArr[i4] = videoSegment.mo86941a(false);
                iArr[i4] = (int) videoSegment.mo86952f();
                iArr2[i4] = (int) videoSegment.mo86953g();
                fArr[i4] = videoSegment.mo86954h();
                iArr3[i4] = videoSegment.f107912k;
                i4 = i5;
            }
        }
        C50633an anVar = new C50633an(strArr);
        C46813b.m101660a(anVar, list, iArr, iArr2, fArr, iArr3);
        this.f108572d = anVar;
        for (Object next2 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C52575l.m112100b();
            }
            this.f108572d.f126929b[i3] = ((VideoSegment) next2).f107902a;
            i3 = i6;
        }
    }
}
