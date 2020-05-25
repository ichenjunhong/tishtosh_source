package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model._CateCell_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _FeedItem_ProtoDecoder implements C2888b<FeedItem> {
    public final FeedItem decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FeedItem decodeStatic(C2895g gVar) throws Exception {
        FeedItem feedItem = new FeedItem();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        feedItem.type = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        feedItem.resId = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        feedItem.room = _Room_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (feedItem.tags == null) {
                            feedItem.tags = new ArrayList();
                        }
                        feedItem.tags.add(C2896h.m8234e(gVar));
                        break;
                    case 5:
                        feedItem.adRawString = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        feedItem.bannerContainer = _FeedBannerContainer_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        feedItem.rankRoundBanner = _RankRoundBanner_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        feedItem.cateCell = _CateCell_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        feedItem.isRecommendCard = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                feedItem.init();
                return feedItem;
            }
        }
    }
}
