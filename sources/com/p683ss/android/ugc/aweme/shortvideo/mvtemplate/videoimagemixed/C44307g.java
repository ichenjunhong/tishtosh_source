package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p683ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p683ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g */
public final class C44307g {

    /* renamed from: d */
    public static final C44308a f112171d = new C44308a(null);

    /* renamed from: a */
    public C20347c f112172a;

    /* renamed from: b */
    public boolean f112173b;

    /* renamed from: c */
    public List<Integer> f112174c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g$a */
    public static final class C44308a {
        private C44308a() {
        }

        public /* synthetic */ C44308a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo90197a() {
        if (this.f112172a != null && !C9190h.m18253a(this.f112174c)) {
            int[] iArr = new int[this.f112174c.size()];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = ((Number) this.f112174c.get(i)).intValue();
            }
            this.f112174c.clear();
            C20347c cVar = this.f112172a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo43008a(iArr);
        }
    }

    /* renamed from: a */
    public static VEImageTransformFilterParam m97050a(int i) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        } else if (i != VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            return null;
        } else {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
    }

    /* renamed from: b */
    private static boolean m97051b(List<? extends VideoSegment> list) {
        if (C9190h.m18253a(list)) {
            return false;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f107911j) {
                String a = videoSegment.mo86941a(false);
                C52711k.m112236a((Object) a, "videoSegment.getPath(false)");
                if (!C44300e.m97039a(a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo90198a(List<? extends VideoSegment> list) {
        if (C44300e.m97041c() && this.f112172a != null && !C9190h.m18253a(list)) {
            mo90197a();
            if (this.f112173b) {
                if (list == null) {
                    C52711k.m112234a();
                }
                if (!m97051b(list)) {
                    for (VideoSegment videoSegment : list) {
                        videoSegment.f107920s = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
                    }
                    return;
                }
                int i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                long j = 0;
                for (VideoSegment videoSegment2 : list) {
                    long g = videoSegment2.mo86953g() - videoSegment2.mo86952f();
                    if (!videoSegment2.f107911j) {
                        String a = videoSegment2.mo86941a(false);
                        C52711k.m112236a((Object) a, "segment.getPath(false)");
                        if (C44300e.m97039a(a)) {
                            videoSegment2.f107920s = i;
                            VEImageTransformFilterParam a2 = m97050a(i);
                            if (a2 != null) {
                                C20347c cVar = this.f112172a;
                                if (cVar == null) {
                                    C52711k.m112234a();
                                }
                                VEBaseFilterParam vEBaseFilterParam = a2;
                                int a3 = cVar.mo42975a(0, 0, vEBaseFilterParam, (int) j, (int) (j + g));
                                C20347c cVar2 = this.f112172a;
                                if (cVar2 == null) {
                                    C52711k.m112234a();
                                }
                                cVar2.mo42982a(a3, vEBaseFilterParam);
                                this.f112174c.add(Integer.valueOf(a3));
                            }
                        } else if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                        } else {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                        }
                        j += g;
                    }
                }
            }
        }
    }
}
