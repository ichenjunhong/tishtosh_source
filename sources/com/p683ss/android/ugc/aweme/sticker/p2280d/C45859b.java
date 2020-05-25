package com.p683ss.android.ugc.aweme.sticker.p2280d;

import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a.C46025a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.b */
public final class C45859b {
    /* renamed from: a */
    public static final boolean m99697a(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "effect");
        if (stickerWrapper.f115781c != 3 || !C46059g.m100074b(stickerWrapper)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m99695a(C46354l lVar) {
        C52711k.m112240b(lVar, "$this$findFirstRemoteCategoryIndex");
        Map a = lVar.mo92973a().mo92536h().mo92505a();
        Collection arrayList = new ArrayList(a.size());
        for (Entry key : a.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        List list = (List) arrayList;
        int i = 0;
        for (Object next : C45924b.m99852a(lVar.mo92973a().mo92537i())) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            if (!list.contains(((EffectCategoryModel) next).getKey())) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    /* renamed from: a */
    public static final boolean m99699a(C46354l lVar, Effect effect) {
        C52711k.m112240b(lVar, "$this$isCurrentChildEffect");
        return lVar.mo92989g().mo93017c(effect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r5, (java.lang.Object) r3) != false) goto L_0x0043;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m99701b(com.p683ss.android.ugc.aweme.sticker.presenter.C46354l r4, com.p683ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            java.lang.String r0 = "$this$isCurrentUseEffect"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            r0 = 0
            if (r5 == 0) goto L_0x0044
            java.lang.String r1 = r5.getEffectId()
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r4.mo92985c()
            r3 = 0
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.getEffectId()
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 != 0) goto L_0x0043
            com.ss.android.ugc.aweme.sticker.presenter.m r1 = r4.mo92992j()
            java.lang.String r1 = r1.f116949a
            java.lang.String r2 = "livestreaming"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x0042
            java.lang.String r5 = r5.getResourceId()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.mo92985c()
            if (r4 == 0) goto L_0x003b
            java.lang.String r3 = r4.getResourceId()
        L_0x003b:
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r3)
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            return r0
        L_0x0043:
            r0 = 1
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b.m99701b(com.ss.android.ugc.aweme.sticker.presenter.l, com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    /* renamed from: a */
    public static final boolean m99698a(C46354l lVar, int i) {
        boolean z;
        C52711k.m112240b(lVar, "$this$isFavoriteCategory");
        if (!lVar.mo92992j().f116952d) {
            return false;
        }
        try {
            z = C46025a.m100011a((EffectCategoryModel) C45924b.m99852a(lVar.mo92973a().mo92537i()).get(i));
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m99700a(C46354l lVar, String str) {
        C52711k.m112240b(lVar, "$this$isStickerInFavorite");
        return lVar.mo92973a().mo92533e().mo92501a(str);
    }

    /* renamed from: a */
    public static final StickerWrapper m99696a(C46354l lVar, List<? extends StickerWrapper> list, int i) {
        C52711k.m112240b(lVar, "$this$findFirstNotDownload");
        C52711k.m112240b(list, "stickers");
        if (list.size() - 2 < i) {
            return null;
        }
        int size = list.size();
        while (i < size) {
            if (m99697a((StickerWrapper) list.get(i))) {
                return (StickerWrapper) list.get(i);
            }
            i++;
        }
        return null;
    }
}
