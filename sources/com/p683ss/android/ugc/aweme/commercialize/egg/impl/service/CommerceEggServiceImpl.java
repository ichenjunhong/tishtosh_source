package com.p683ss.android.ugc.aweme.commercialize.egg.impl.service;

import android.text.TextUtils;
import android.view.ViewStub;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.C25791a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1565d.C25816a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.view.C25822a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25769c;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a.C25774a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p683ss.android.ugc.aweme.feed.model.EditHint;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl */
public final class CommerceEggServiceImpl implements ICommerceEggService {
    public final void clearCommentData() {
        C25791a.f68205c = null;
        C25791a.f68204b = null;
    }

    public static ICommerceEggService createICommerceEggServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ICommerceEggService.class);
        if (a != null) {
            return (ICommerceEggService) a;
        }
        return new CommerceEggServiceImpl();
    }

    public final C25780a getCommerceEggView(ViewStub viewStub) {
        C52711k.m112240b(viewStub, "view");
        return new C25822a(viewStub);
    }

    public final void init(C25769c cVar) {
        C52711k.m112240b(cVar, "depend");
        C52711k.m112240b(cVar, "<set-?>");
        C25815a.f68256a = cVar;
    }

    private final boolean checkEggData(C25773a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f68154b) && !TextUtils.isEmpty(aVar.f68153a)) {
            return true;
        }
        return false;
    }

    public final void addCommerceEggData(C25773a aVar) {
        if (checkEggData(aVar)) {
            if (aVar == null) {
                aVar = null;
            } else if (aVar.f68159g) {
                C25816a.m62456a(aVar);
            }
            C25791a.m62417a(aVar);
        }
    }

    public final String getCommentEggHint(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List<? extends EditHint> list = C25791a.f68205c;
        if (list == null) {
            return null;
        }
        for (EditHint editHint : list) {
            if (TextUtils.equals(charSequence, editHint.getLanguage())) {
                return editHint.getHint();
            }
        }
        return null;
    }

    public final void preloadCommentData(String str, String str2, ItemCommentEggGroup itemCommentEggGroup, boolean z) {
        List<? extends EditHint> list;
        if (itemCommentEggGroup != null) {
            List<ItemCommentEggData> commentEggData = itemCommentEggGroup.getCommentEggData();
            if (commentEggData != null) {
                ArrayList arrayList = new ArrayList();
                for (ItemCommentEggData itemCommentEggData : commentEggData) {
                    if (C25791a.m62418a(itemCommentEggData)) {
                        C25774a aVar = new C25774a();
                        C52711k.m112236a((Object) itemCommentEggData, "eggData");
                        C25774a a = aVar.mo52975a(itemCommentEggData);
                        a.f68170b = z;
                        C25773a a2 = a.mo52976a(str).mo52978b(str2).mo52977a();
                        arrayList.add(a2);
                        if (z) {
                            C25816a.m62456a(a2);
                        }
                    }
                }
                C25791a.f68204b = arrayList;
            }
        }
        if (itemCommentEggGroup != null) {
            list = itemCommentEggGroup.getEditintist();
        } else {
            list = null;
        }
        C25791a.f68205c = list;
    }
}
