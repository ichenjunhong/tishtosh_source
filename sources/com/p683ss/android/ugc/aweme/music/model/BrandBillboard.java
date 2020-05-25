package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.BrandBillboard */
public class BrandBillboard implements Serializable {
    @C17952c(mo34828a = "category_list")
    private List<BrandCategory> categoryList;
    @C17952c(mo34828a = "title")
    private String title;

    public List<BrandCategory> getCategoryList() {
        return this.categoryList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategoryList(List<BrandCategory> list) {
        this.categoryList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
