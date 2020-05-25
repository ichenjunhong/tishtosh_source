package com.p683ss.android.ugc.effectmanager.effect.model.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse */
public class CategoryEffectListResponse extends BaseNetResponse {
    private CategoryPageModel data;

    public CategoryPageModel getData() {
        return this.data;
    }

    public boolean checkValue() {
        if (this.data == null || this.data.getCategoryEffects() == null) {
            return false;
        }
        return true;
    }

    public void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }
}
