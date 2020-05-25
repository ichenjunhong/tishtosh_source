package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45455t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessGoodsServiceImpl */
public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    public final void clearCache() {
        C45455t.m99049a();
    }

    public final BusinessGoodsPublishModel getCurBusinessDraftModel(String str) {
        C52711k.m112240b(str, "videoPath");
        BusinessGoodsPublishModel b = C45455t.m99053b(str);
        C52711k.m112236a((Object) b, "BusinessGoodsDraftInfoPr…nessDraftModel(videoPath)");
        return b;
    }

    public final void removeUserSetting(String str) {
        C52711k.m112240b(str, "videoPath");
        C45455t.m99052a(str);
    }

    public final void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        C52711k.m112240b(businessGoodsPublishModel, "model");
        C45455t.m99050a(businessGoodsPublishModel);
    }
}
