package com.p683ss.android.ugc.aweme.shortvideo.cut;

import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.vesdk.VEListener.C50547k;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.h */
public interface C42648h {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.h$a */
    public static final class C42649a {
        /* renamed from: a */
        public static /* synthetic */ boolean m93564a(C42648h hVar, float f, float f2, float f3, int i, int i2, int i3, Object obj) {
            float f4;
            float f5;
            if ((i3 & 2) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 4) != 0) {
                f5 = 1.0f;
            } else {
                f5 = f3;
            }
            return hVar.mo86915a(f, f4, f5, 0, 0);
        }
    }

    /* renamed from: a */
    void mo86907a(int i, int i2);

    /* renamed from: a */
    void mo86908a(int i, int i2, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo86909a(int i, VideoSegment videoSegment);

    /* renamed from: a */
    void mo86910a(C42626c cVar, C50547k kVar);

    /* renamed from: a */
    void mo86911a(List<? extends VideoSegment> list, int i);

    /* renamed from: a */
    void mo86912a(List<? extends VideoSegment> list, int i, long j, long j2);

    /* renamed from: a */
    void mo86913a(List<? extends VideoSegment> list, boolean z);

    /* renamed from: a */
    void mo86914a(boolean z, boolean z2, List<? extends VideoSegment> list);

    /* renamed from: a */
    boolean mo86915a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    boolean mo86916a(int i, float f);

    /* renamed from: b */
    void mo86917b(int i, float f);

    /* renamed from: b */
    void mo86918b(int i, int i2);
}
