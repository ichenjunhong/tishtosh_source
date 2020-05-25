package com.p683ss.android.ugc.aweme.sticker.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel */
public class TabSelectViewModel extends C0209x {

    /* renamed from: a */
    private Map<String, C0198r<EffectCategoryModel>> f117616a = new HashMap(1);

    /* renamed from: b */
    private Map<String, C0198r<String>> f117617b = new HashMap(1);

    /* renamed from: c */
    private Map<String, C0198r<Integer>> f117618c = new HashMap(1);

    /* renamed from: a */
    public final C0198r<EffectCategoryModel> mo93418a(String str) {
        C0198r<EffectCategoryModel> rVar = (C0198r) this.f117616a.get(str);
        if (rVar != null) {
            return rVar;
        }
        C0198r<EffectCategoryModel> rVar2 = new C0198r<>();
        this.f117616a.put(str, rVar2);
        return rVar2;
    }

    /* renamed from: b */
    public final C0198r<String> mo93421b(String str) {
        C0198r<String> rVar = (C0198r) this.f117617b.get(str);
        if (rVar != null) {
            return rVar;
        }
        C0198r<String> rVar2 = new C0198r<>();
        this.f117617b.put(str, rVar2);
        return rVar2;
    }

    /* renamed from: c */
    public C0198r<Integer> mo93422c(String str) {
        C0198r<Integer> rVar = (C0198r) this.f117618c.get(str);
        if (rVar != null) {
            return rVar;
        }
        C0198r<Integer> rVar2 = new C0198r<>();
        this.f117618c.put(str, rVar2);
        return rVar2;
    }

    /* renamed from: a */
    public final void mo93420a(String str, String str2) {
        mo93421b(str).setValue(str2);
    }

    /* renamed from: a */
    public final void mo93419a(String str, EffectCategoryModel effectCategoryModel, int i) {
        mo93418a(str).setValue(effectCategoryModel);
        mo93422c(str).setValue(Integer.valueOf(i));
    }
}
