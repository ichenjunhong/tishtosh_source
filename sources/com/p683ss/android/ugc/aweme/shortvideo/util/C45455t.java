package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.t */
public final class C45455t {

    /* renamed from: a */
    private static BusinessGoodsPublishSetting f114871a;

    /* renamed from: a */
    public static void m99049a() {
        f114871a = null;
    }

    /* renamed from: c */
    private static synchronized BusinessGoodsPublishSetting m99055c() {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        synchronized (C45455t.class) {
            if (f114871a == null) {
                Iterator it = m99054b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        BusinessGoodsPublishSetting businessGoodsPublishSetting2 = (BusinessGoodsPublishSetting) it.next();
                        try {
                            if (BaseUserService.getBaseUserService_Monster().getCurrentUserID().equals(businessGoodsPublishSetting2.getUserId())) {
                                f114871a = businessGoodsPublishSetting2;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            businessGoodsPublishSetting = f114871a;
        }
        return businessGoodsPublishSetting;
    }

    /* renamed from: b */
    private static List<BusinessGoodsPublishSetting> m99054b() {
        String str = (String) C23183v.m56778a().mo47911g().mo47782d();
        if (!TextUtils.isEmpty(str)) {
            return (List) new C17971f().mo34885a(str, new C17956a<List<BusinessGoodsPublishSetting>>() {
            }.f49843c);
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public static void m99050a(BusinessGoodsPublishModel businessGoodsPublishModel) {
        BusinessGoodsPublishSetting c = m99055c();
        if (c == null) {
            c = new BusinessGoodsPublishSetting();
            c.setUserId(BaseUserService.getBaseUserService_Monster().getCurrentUserID());
        }
        List goodsPublishModels = c.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList();
        } else {
            goodsPublishModels.remove(businessGoodsPublishModel);
        }
        if (businessGoodsPublishModel != null) {
            goodsPublishModels.add(businessGoodsPublishModel);
        }
        c.setGoodsPublishModels(goodsPublishModels);
        m99051a(c);
    }

    /* renamed from: b */
    public static BusinessGoodsPublishModel m99053b(String str) {
        if (m99055c() == null) {
            return null;
        }
        for (BusinessGoodsPublishModel businessGoodsPublishModel : f114871a.getGoodsPublishModels()) {
            if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                return businessGoodsPublishModel;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m99051a(BusinessGoodsPublishSetting businessGoodsPublishSetting) {
        List b = m99054b();
        b.remove(businessGoodsPublishSetting);
        b.add(businessGoodsPublishSetting);
        C23183v.m56778a().mo47911g().mo47776a(new C17971f().mo34889b(b));
        f114871a = businessGoodsPublishSetting;
    }

    /* renamed from: a */
    public static void m99052a(String str) {
        if (!TextUtils.isEmpty(str)) {
            BusinessGoodsPublishSetting c = m99055c();
            if (c != null) {
                List goodsPublishModels = c.getGoodsPublishModels();
                if (goodsPublishModels != null && goodsPublishModels.size() != 0) {
                    Iterator it = goodsPublishModels.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BusinessGoodsPublishModel businessGoodsPublishModel = (BusinessGoodsPublishModel) it.next();
                        if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                            goodsPublishModels.remove(businessGoodsPublishModel);
                            break;
                        }
                    }
                    c.setGoodsPublishModels(goodsPublishModels);
                    List b = m99054b();
                    b.remove(c);
                    b.add(c);
                    C23183v.m56778a().mo47911g().mo47776a(new C17971f().mo34889b(b));
                }
            }
        }
    }
}
