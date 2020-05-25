package com.p683ss.android.ugc.aweme.tools.beauty;

import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.BeautyCategory */
public final class BeautyCategory {
    private final BeautyCategoryExtra beautyCategoryExtra;
    private final List<ComposerBeauty> beautyList;
    private final EffectCategoryResponse categoryResponse;
    private boolean selected;

    public final BeautyCategoryExtra getBeautyCategoryExtra() {
        return this.beautyCategoryExtra;
    }

    public final List<ComposerBeauty> getBeautyList() {
        return this.beautyList;
    }

    public final EffectCategoryResponse getCategoryResponse() {
        return this.categoryResponse;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int hashCode() {
        String id = this.categoryResponse.getId();
        if (id != null) {
            return id.hashCode();
        }
        return this.categoryResponse.hashCode();
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BeautyCategory) {
            return C52711k.m112239a((Object) ((BeautyCategory) obj).categoryResponse.getId(), (Object) this.categoryResponse.getId());
        }
        return false;
    }

    public BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List<ComposerBeauty> list, boolean z) {
        C52711k.m112240b(effectCategoryResponse, "categoryResponse");
        C52711k.m112240b(beautyCategoryExtra2, "beautyCategoryExtra");
        C52711k.m112240b(list, "beautyList");
        this.categoryResponse = effectCategoryResponse;
        this.beautyCategoryExtra = beautyCategoryExtra2;
        this.beautyList = list;
        this.selected = z;
    }

    public /* synthetic */ BeautyCategory(EffectCategoryResponse effectCategoryResponse, BeautyCategoryExtra beautyCategoryExtra2, List list, boolean z, int i, C52707g gVar) {
        if ((i & 8) != 0) {
            z = false;
        }
        this(effectCategoryResponse, beautyCategoryExtra2, list, z);
    }
}
