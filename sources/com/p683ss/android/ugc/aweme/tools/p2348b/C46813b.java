package com.p683ss.android.ugc.aweme.tools.p2348b;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.VEUtils;
import com.p683ss.android.vesdk.VEUtils.C50574e;
import java.util.Arrays;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.b.b */
public final class C46813b {
    /* renamed from: a */
    public static final C50574e m101657a(String str) {
        C52711k.m112240b(str, "strInVideo");
        C39629l.m88232a().mo58586q();
        C50574e videoFileInfo = VEUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO));
        if (!(videoFileInfo == null || videoFileInfo.f126803c % NormalGiftView.ALPHA_180 == 0)) {
            int i = videoFileInfo.f126802b;
            videoFileInfo.f126802b = videoFileInfo.f126801a;
            videoFileInfo.f126801a = i;
        }
        return videoFileInfo;
    }

    /* renamed from: a */
    public static final int m101656a(String str, int[] iArr) {
        C52711k.m112240b(str, "strInVideo");
        C52711k.m112240b(iArr, "outInfo");
        C39629l.m88232a().mo58586q();
        int videoFileInfo = VEUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr);
        if (videoFileInfo == 0 && iArr[2] % NormalGiftView.ALPHA_180 != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        return videoFileInfo;
    }

    /* renamed from: b */
    public static final void m101661b(C50633an anVar, List<? extends VideoSegment> list) {
        C52711k.m112240b(anVar, "$this$addVideoSegment");
        if (list != null && !list.isEmpty()) {
            int length = anVar.f126932e.length;
            int size = list.size() + length;
            anVar.f126932e = Arrays.copyOf(anVar.f126932e, size);
            anVar.f126933f = Arrays.copyOf(anVar.f126933f, size);
            anVar.f126936i = Arrays.copyOf(anVar.f126936i, size);
            anVar.f126937j = Arrays.copyOf(anVar.f126937j, size);
            anVar.f126938k = (C50657c[]) Arrays.copyOf(anVar.f126938k, size);
            anVar.f126928a = (String[]) Arrays.copyOf(anVar.f126928a, size);
            anVar.f126929b = Arrays.copyOf(anVar.f126929b, size);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                int i3 = i + length;
                anVar.f126932e[i3] = (int) videoSegment.mo86952f();
                anVar.f126933f[i3] = (int) videoSegment.mo86953g();
                anVar.f126936i[i3] = (double) C47339t.NORMAL.value();
                anVar.f126937j[i3] = true;
                anVar.f126938k[i3] = C50657c.ROTATE_NONE;
                anVar.f126928a[i3] = videoSegment.mo86941a(false);
                anVar.f126929b[i3] = videoSegment.f107902a;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m101659a(C50633an anVar, List<? extends VideoSegment> list) {
        C52711k.m112240b(anVar, "$this$unselectAll");
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                anVar.f126932e[i] = (int) videoSegment.mo86952f();
                anVar.f126933f[i] = (int) videoSegment.mo86953g();
                anVar.f126938k[i] = C42670a.m93643a(videoSegment.f107912k);
                anVar.f126936i[i] = (double) videoSegment.mo86954h();
                anVar.f126937j[i] = !videoSegment.f107911j;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m101658a(C50633an anVar, int i, VideoSegment videoSegment) {
        boolean z;
        C52711k.m112240b(anVar, "$this$selectSegment");
        C52711k.m112240b(videoSegment, "segment");
        boolean[] zArr = anVar.f126937j;
        C52711k.m112236a((Object) zArr, "enable");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            boolean[] zArr2 = anVar.f126937j;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i3] = z;
            i2++;
            i3 = i4;
        }
        anVar.f126936i[i] = (double) videoSegment.mo86954h();
        anVar.f126932e[i] = 0;
        anVar.f126933f[i] = (int) videoSegment.f107904c;
        anVar.f126938k[i] = C42670a.m93643a(videoSegment.f107912k);
    }

    /* renamed from: a */
    public static final void m101660a(C50633an anVar, List<? extends VideoSegment> list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        C52711k.m112240b(anVar, "$this$update");
        C52711k.m112240b(iArr, "vTrimInArray");
        C52711k.m112240b(iArr2, "vTrimOutArray");
        C52711k.m112240b(fArr, "speedArray");
        C52711k.m112240b(iArr3, "rotateArray");
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    anVar.f126937j[i] = !((VideoSegment) next).f107911j;
                    anVar.f126932e[i] = iArr[i];
                    anVar.f126933f[i] = iArr2[i];
                    anVar.f126936i[i] = (double) fArr[i];
                    anVar.f126938k[i] = C42670a.m93643a(iArr3[i]);
                    i = i2;
                }
            }
        }
    }
}
