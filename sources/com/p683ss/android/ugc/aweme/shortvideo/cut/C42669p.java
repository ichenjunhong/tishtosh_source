package com.p683ss.android.ugc.aweme.shortvideo.cut;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42648h.C42649a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k.C43883a;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE;
import com.p683ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p683ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.p */
public final class C42669p implements C42648h {

    /* renamed from: a */
    public static final C42670a f107961a = new C42670a(null);

    /* renamed from: b */
    private int f107962b;

    /* renamed from: c */
    private VideoSegment f107963c;

    /* renamed from: d */
    private final C20347c f107964d;

    /* renamed from: e */
    private C50633an f107965e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.p$a */
    public static final class C42670a {
        private C42670a() {
        }

        public /* synthetic */ C42670a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C50657c m93643a(int i) {
            if (i == 90) {
                return C50657c.ROTATE_90;
            }
            if (i == 180) {
                return C50657c.ROTATE_180;
            }
            if (i != 270) {
                return C50657c.ROTATE_NONE;
            }
            return C50657c.ROTATE_270;
        }

        /* renamed from: a */
        public static void m93644a(List<? extends EditVideoSegment> list, C20347c cVar) {
            C52711k.m112240b(list, "videoList");
            C52711k.m112240b(cVar, "veEditor");
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                List arrayList4 = new ArrayList();
                List arrayList5 = new ArrayList();
                for (EditVideoSegment editVideoSegment : list) {
                    String a = C43883a.m96396a(new File(editVideoSegment.getVideoPath()));
                    arrayList2.add(Integer.valueOf((int) editVideoSegment.getVideoFileInfo().getDuration()));
                    arrayList.add(editVideoSegment.getVideoPath());
                    arrayList3.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getWidth()));
                    arrayList4.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getHeight()));
                    arrayList5.add(a);
                }
                String a2 = C43882k.m96394a(false, true, C39629l.m88233b(), arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null);
                C52711k.m112236a((Object) a2, "metaInfo");
                cVar.mo43002a("description", a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo86907a(int i, int i2) {
        this.f107964d.mo42970a(0, i, i2);
    }

    /* renamed from: b */
    public final void mo86918b(int i, int i2) {
        this.f107964d.mo43028b(i, i2);
    }

    /* renamed from: a */
    public final void mo86911a(List<? extends VideoSegment> list, int i) {
        if (list != null && !list.isEmpty()) {
            C46813b.m101661b(this.f107965e, list);
        }
    }

    /* renamed from: b */
    public final void mo86917b(int i, float f) {
        this.f107965e.f126936i[i] = (double) f;
        this.f107964d.mo42993a(this.f107965e);
    }

    public C42669p(C20347c cVar, C50633an anVar) {
        C52711k.m112240b(cVar, "veEditor");
        C52711k.m112240b(anVar, "timelineParam");
        this.f107964d = cVar;
        this.f107965e = anVar;
    }

    /* renamed from: a */
    public final void mo86909a(int i, VideoSegment videoSegment) {
        C52711k.m112240b(videoSegment, "segment");
        this.f107963c = videoSegment;
        this.f107962b = i;
        int i2 = videoSegment.f107912k;
        videoSegment.f107912k = 0;
        C46813b.m101658a(this.f107965e, i, videoSegment);
        this.f107964d.mo42994a(this.f107965e, (int) videoSegment.mo86952f(), (int) videoSegment.mo86953g());
        videoSegment.f107912k = i2;
        C42649a.m93564a(this, (float) videoSegment.f107912k, videoSegment.f107913l, videoSegment.f107914m, 0, 0, 24, null);
    }

    /* renamed from: a */
    public final void mo86910a(C42626c cVar, C50547k kVar) {
        C52711k.m112240b(cVar, "settings");
        C52711k.m112240b(kVar, "listener");
        VEVideoEncodeSettings a = new C50585a(2).mo98703a(cVar.f107829g).mo98699a(cVar.f107830h).mo98698a(cVar.f107831i).mo98692a(cVar.f107826d, cVar.f107827e).mo98711c(cVar.f107833k).mo98715f(cVar.f107834l).mo98695a(cVar.f107832j).mo98694a(COMPILE_TYPE.COMPILE_TYPE_MP4).mo98691a(cVar.f107828f).mo98714e(cVar.f107835m).mo98705a();
        Iterable<VideoSegment> iterable = cVar.f107823a;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (VideoSegment a2 : iterable) {
            arrayList.add(C43668b.m95932a(a2));
        }
        C42670a.m93644a((List) arrayList, this.f107964d);
        C20347c cVar2 = this.f107964d;
        String str = cVar.f107824b;
        String str2 = cVar.f107825c;
        C52711k.m112236a((Object) a, "encodeSettings");
        cVar2.mo43023a(str, str2, a, kVar);
    }

    /* renamed from: a */
    public final void mo86913a(List<? extends VideoSegment> list, boolean z) {
        C46813b.m101659a(this.f107965e, list);
        this.f107964d.mo42993a(this.f107965e);
        this.f107964d.mo42983a(0, C50743d.EDITOR_SEEK_FLAG_LastSeek);
        C42649a.m93564a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
    }

    /* renamed from: a */
    public final boolean mo86916a(int i, float f) {
        if (this.f107964d.mo42973a(0, i, C42670a.m93643a((int) f)) == 0) {
            return true;
        }
        return false;
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
        this.f107965e = anVar;
        for (Object next2 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C52575l.m112100b();
            }
            this.f107965e.f126929b[i3] = ((VideoSegment) next2).f107902a;
            i3 = i6;
        }
    }

    /* renamed from: a */
    public final void mo86914a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment = this.f107963c;
        if (videoSegment != null) {
            C50633an anVar = this.f107965e;
            int i = this.f107962b;
            C52711k.m112240b(anVar, "$this$unselect");
            C52711k.m112240b(videoSegment, "preSelectSegment");
            anVar.f126936i[i] = (double) videoSegment.mo86954h();
            anVar.f126932e[i] = (int) videoSegment.mo86952f();
            anVar.f126933f[i] = (int) videoSegment.mo86953g();
            anVar.f126938k[i] = C42670a.m93643a(videoSegment.f107912k);
            if (list != null) {
                int i2 = 0;
                for (Object next : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C52575l.m112100b();
                    }
                    anVar.f126937j[i2] = !((VideoSegment) next).f107911j;
                    i2 = i3;
                }
            }
            this.f107964d.mo42993a(this.f107965e);
            C42649a.m93564a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
        }
    }

    /* renamed from: a */
    public final void mo86912a(List<? extends VideoSegment> list, int i, long j, long j2) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (VideoSegment videoSegment : list) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = videoSegment.mo86941a(false);
                vEClipSourceParam.clipWidth = videoSegment.f107908g;
                vEClipSourceParam.clipHeight = videoSegment.f107909h;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) C47339t.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) videoSegment.f107904c;
                arrayList2.add(vEClipTimelineParam);
            }
            this.f107964d.mo42979a(0, i - list.size(), arrayList, arrayList2);
            this.f107964d.mo43028b((int) j, (int) j2);
        }
    }

    /* renamed from: a */
    public final boolean mo86915a(float f, float f2, float f3, int i, int i2) {
        this.f107964d.mo43014a(f2, f3, f, i, i2);
        return true;
    }
}
