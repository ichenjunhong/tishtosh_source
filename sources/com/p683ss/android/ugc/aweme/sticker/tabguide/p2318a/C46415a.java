package com.p683ss.android.ugc.aweme.sticker.tabguide.p2318a;

import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sticker.tabguide.p2319b.C46418a;
import com.p683ss.android.ugc.aweme.sticker.tabguide.p2319b.C46418a.C46420b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.a.a */
public final class C46415a implements C46417b<C0794k<EffectCategoryModel, Object>> {

    /* renamed from: a */
    public static final C46416a f117102a = new C46416a(null);

    /* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.a.a$a */
    public static final class C46416a {
        private C46416a() {
        }

        public /* synthetic */ C46416a(C52707g gVar) {
            this();
        }
    }

    private C46415a() {
    }

    public /* synthetic */ C46415a(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final /* synthetic */ C46418a mo93136a(Object obj) {
        EffectCategoryModel effectCategoryModel;
        List list;
        boolean z;
        C0794k kVar = (C0794k) obj;
        UrlModel urlModel = null;
        if (kVar != null) {
            effectCategoryModel = (EffectCategoryModel) kVar.f2711a;
        } else {
            effectCategoryModel = null;
        }
        if (kVar != null) {
            list = kVar.f2712b;
        } else {
            list = null;
        }
        if (!(list instanceof List)) {
            list = null;
        }
        List list2 = list;
        if (list2 != null) {
            Iterable iterable = list2;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                CharSequence charSequence = (String) next;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            List list3 = (List) arrayList;
            if (!list3.isEmpty()) {
                urlModel = new UrlModel();
                urlModel.setUrlList(list3);
            }
        }
        if (kVar == null || effectCategoryModel == null || urlModel == null) {
            return new C46420b();
        }
        return new C46420b();
    }
}
