package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.z */
final /* synthetic */ class C45047z implements C20818a {

    /* renamed from: a */
    private final C450192 f114086a;

    C45047z(C450192 r1) {
        this.f114086a = r1;
    }

    /* renamed from: a */
    public final void mo43757a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        C450192 r0 = this.f114086a;
        if (aSSimpleFaceInfoArr != null) {
            C45017b bVar = C45017b.this;
            if (!bVar.f113996N && C23780d.m58365a()) {
                if (aSSimpleFaceInfoArr == null || aSSimpleFaceInfoArr.length == 0) {
                    bVar.f113995M = 0;
                } else {
                    bVar.f113995M++;
                    if (bVar.f113995M == 6) {
                        int length = aSSimpleFaceInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                ((C42451a) bVar.f113992J.getValue()).mo86557a(true, C46814a.MALE);
                                bVar.f113996N = true;
                                break;
                            }
                            ASSimpleFaceInfo aSSimpleFaceInfo = aSSimpleFaceInfoArr[i];
                            if (aSSimpleFaceInfo != null && aSSimpleFaceInfo.f56706a <= C39618d.f101151O.mo83120d(C40796a.MALE_PROB_THRESHOLD)) {
                                ((C42451a) bVar.f113992J.getValue()).mo86557a(true, C46814a.FEMALE);
                                bVar.f113996N = true;
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            int length2 = aSSimpleFaceInfoArr.length;
            int i2 = 0;
            while (i2 < length2) {
                ASSimpleFaceInfo aSSimpleFaceInfo2 = aSSimpleFaceInfoArr[i2];
                if (aSSimpleFaceInfo2 == null || aSSimpleFaceInfo2.f56706a <= C39618d.f101151O.mo83120d(C40796a.MALE_PROB_THRESHOLD)) {
                    i2++;
                } else {
                    C45017b.this.f114043u.mo91032b(true);
                    return;
                }
            }
            C45017b.this.f114043u.mo91032b(false);
        }
    }
}
