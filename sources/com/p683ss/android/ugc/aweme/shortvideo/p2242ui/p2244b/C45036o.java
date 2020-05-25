package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.shortvideo.C43789em;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.o */
final /* synthetic */ class C45036o implements C52686q {

    /* renamed from: a */
    private final C45017b f114073a;

    C45036o(C45017b bVar) {
        this.f114073a = bVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TimeSpeedModelExtension timeSpeedModelExtension;
        C45017b bVar = this.f114073a;
        Integer num = (Integer) obj2;
        String str = (String) obj3;
        if (((Integer) obj).intValue() == 1021 && bVar.f114042t != null && bVar.f114042t.f107122o) {
            C43789em p = bVar.f114042t.mo86375p();
            if (p.isEmpty()) {
                timeSpeedModelExtension = null;
            } else {
                timeSpeedModelExtension = (TimeSpeedModelExtension) p.get(p.size() - 1);
            }
            if (timeSpeedModelExtension != null) {
                long segmentAudioLength = bVar.mo91307M().getSegmentAudioLength() / 1000;
                long duration = (long) timeSpeedModelExtension.getDuration();
                double speed = timeSpeedModelExtension.getSpeed();
                timeSpeedModelExtension.adjustDuration(segmentAudioLength);
                ShortVideoContext shortVideoContext = bVar.f114042t;
                double m = (double) bVar.f114042t.mo86372m();
                double d = (double) (segmentAudioLength - duration);
                Double.isNaN(d);
                double d2 = d / speed;
                Double.isNaN(m);
                shortVideoContext.mo86357a((long) (m + d2));
                C23727n.m58238a(new C45030i(bVar));
            }
        }
        return C52860x.f131107a;
    }
}
