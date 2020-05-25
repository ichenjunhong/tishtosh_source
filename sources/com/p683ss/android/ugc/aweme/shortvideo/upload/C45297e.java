package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45284c.C452851;
import com.p683ss.android.vesdk.C50711k;
import dmt.p2652av.video.C52908ad;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.e */
final /* synthetic */ class C45297e implements C50711k {

    /* renamed from: a */
    private final C452851 f114543a;

    /* renamed from: b */
    private final SynthetiseResult f114544b;

    /* renamed from: c */
    private final C52908ad f114545c;

    C45297e(C452851 r1, SynthetiseResult synthetiseResult, C52908ad adVar) {
        this.f114543a = r1;
        this.f114544b = synthetiseResult;
        this.f114545c = adVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C452851 r0 = this.f114543a;
        SynthetiseResult synthetiseResult = this.f114544b;
        C52908ad adVar = this.f114545c;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = i;
        StringBuilder sb = new StringBuilder("VECompiler failed. type = ");
        sb.append(i);
        sb.append(" ext = ");
        sb.append(i2);
        sb.append(" f = ");
        sb.append(f);
        sb.append(" msg = ");
        sb.append(str);
        if (r0.mo34623a((Throwable) new C43809fd(sb.toString(), clone))) {
            if (i2 == -214) {
                C40797m.m90246b(true);
            }
            adVar.f131275u.mo43082p();
        }
    }
}
