package com.bytedance.android.livesdk.chatroom.p310f;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7213i;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.b */
public final class C5212b {
    /* renamed from: a */
    public static C51568c m11809a(AssetsModel assetsModel) {
        return m11810a(assetsModel, 0);
    }

    /* renamed from: b */
    private static boolean m11811b(AssetsModel assetsModel) {
        if (assetsModel == null || TextUtils.isEmpty(assetsModel.getMD5())) {
            return false;
        }
        C7213i resourceModel = assetsModel.getResourceModel();
        if (resourceModel == null) {
            return false;
        }
        List<String> list = resourceModel.f19591b;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C51568c m11810a(AssetsModel assetsModel, int i) {
        if (!m11811b(assetsModel)) {
            return null;
        }
        C7213i resourceModel = assetsModel.getResourceModel();
        String[] strArr = new String[resourceModel.f19591b.size()];
        resourceModel.f19591b.toArray(strArr);
        C51568c cVar = new C51568c(assetsModel.getId(), strArr, assetsModel.getMD5(), (long) i, true);
        return cVar;
    }
}
