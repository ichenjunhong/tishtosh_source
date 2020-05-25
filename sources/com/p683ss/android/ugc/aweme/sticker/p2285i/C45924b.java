package com.p683ss.android.ugc.aweme.sticker.p2285i;

import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45919q;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.b */
public final class C45924b {
    /* renamed from: a */
    public static final List<EffectCategoryModel> m99852a(C45919q qVar) {
        C52711k.m112240b(qVar, "$this$categoryList");
        List<EffectCategoryModel> list = (List) qVar.mo92545f().getValue();
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }

    /* renamed from: b */
    public static final Map<String, CategoryEffectModel> m99853b(C45919q qVar) {
        CategoryEffectModel categoryEffectModel;
        C52711k.m112240b(qVar, "$this$categoryEffectMap");
        Map d = qVar.mo92543d();
        Map<String, CategoryEffectModel> linkedHashMap = new LinkedHashMap<>(C52550ab.m112044a(d.size()));
        for (Entry entry : d.entrySet()) {
            Object key = entry.getKey();
            C37721a aVar = (C37721a) ((LiveData) entry.getValue()).getValue();
            if (aVar != null) {
                categoryEffectModel = (CategoryEffectModel) aVar.f96125a;
            } else {
                categoryEffectModel = null;
            }
            linkedHashMap.put(key, categoryEffectModel);
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static CategoryEffectModel m99850a(C45919q qVar, String str, boolean z) {
        C52711k.m112240b(qVar, "$this$categoryEffectModel");
        if (str == null) {
            return null;
        }
        C37721a aVar = (C37721a) qVar.mo92538a(str, z).getValue();
        if (aVar != null) {
            return (CategoryEffectModel) aVar.f96125a;
        }
        return null;
    }
}
