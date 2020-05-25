package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45032k;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ez */
final /* synthetic */ class C43803ez implements C52671b {

    /* renamed from: a */
    private final C43802ey f110923a;

    C43803ez(C43802ey eyVar) {
        this.f110923a = eyVar;
    }

    public final Object invoke(Object obj) {
        C43802ey eyVar = this.f110923a;
        Integer num = (Integer) obj;
        C50203g.m108363d("MultiEditlog: stopRecordAsync ret = ret");
        C45412b.m98979a().end("av_video_stop_record", "stopRecordAsync#callback");
        if (num.intValue() <= 0) {
            C43802ey.m96242a("stop_record", (long) num.intValue(), eyVar.f110920b);
        }
        C45017b bVar = eyVar.f110919a;
        bVar.f114045w.post(new C45032k(bVar));
        return C52860x.f131107a;
    }
}
