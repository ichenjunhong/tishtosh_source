package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.x */
final /* synthetic */ class C7618x implements C0199s {

    /* renamed from: a */
    private final GiftPanelListWidget f20955a;

    C7618x(GiftPanelListWidget giftPanelListWidget) {
        this.f20955a = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        GiftPage giftPage;
        GiftPanelListWidget giftPanelListWidget = this.f20955a;
        int intValue = ((Integer) obj).intValue();
        if (giftPanelListWidget.f20868q != intValue) {
            Iterator it = giftPanelListWidget.f20866o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    giftPage = null;
                    break;
                }
                giftPage = (GiftPage) it.next();
                if (giftPage != null && giftPage.pageType == intValue) {
                    break;
                }
            }
            if (giftPage != null) {
                giftPanelListWidget.f20868q = intValue;
                giftPanelListWidget.f20860i = 0;
                giftPanelListWidget.f20861j = 0;
                giftPanelListWidget.f20863l = null;
                if (giftPanelListWidget.f20854c != null) {
                    giftPanelListWidget.f20854c.mo13554b();
                    giftPanelListWidget.f20854c.mo13552a();
                }
                if (!giftPanelListWidget.f20857f) {
                    giftPanelListWidget.f20853b.mo4814b(0);
                }
                if (intValue == 5) {
                    giftPanelListWidget.mo13971f(giftPanelListWidget.mo13965b());
                    return;
                }
                List<C7491b> list = (List) giftPanelListWidget.f20867p.get(giftPage);
                if (list != null) {
                    for (C7491b bVar : list) {
                        if (bVar != null) {
                            bVar.f20514b = false;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    if (intValue == 1) {
                        giftPanelListWidget.mo13969d(arrayList);
                    }
                    giftPanelListWidget.mo13971f(arrayList);
                }
            }
        }
    }
}
