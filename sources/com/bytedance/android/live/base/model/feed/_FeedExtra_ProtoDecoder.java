package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _FeedExtra_ProtoDecoder implements C2888b<C2974a> {
    public final C2974a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2974a decodeStatic(C2895g gVar) throws Exception {
        C2974a aVar = new C2974a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f8714d = _FeedExtra_LogPb_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                switch (b) {
                    case 5:
                        aVar.f8711a = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f8715e = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        aVar.f8716f = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        aVar.f8719i = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        aVar.f8718h = _FeedBannerContainer_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        aVar.f8712b = _RankRoundBanner_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        aVar.f8713c = C2896h.m8234e(gVar);
                        break;
                    case 12:
                        aVar.f8720j = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                aVar.hasMore = C2896h.m8230a(gVar);
            }
        }
    }
}
