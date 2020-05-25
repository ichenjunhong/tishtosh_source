package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.BrandCategory */
public class BrandCategory implements Serializable {
    @C17952c(mo34828a = "brand_list")
    private List<Brand> brandList;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private int f95400id;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "weekly_info")
    private BillboardWeeklyInfoStruct weeklyInfo;

    public List<Brand> getBrandList() {
        return this.brandList;
    }

    public int getId() {
        return this.f95400id;
    }

    public String getName() {
        return this.name;
    }

    public BillboardWeeklyInfoStruct getWeeklyInfo() {
        return this.weeklyInfo;
    }

    public void setBrandList(List<Brand> list) {
        this.brandList = list;
    }

    public void setId(int i) {
        this.f95400id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWeeklyInfo(BillboardWeeklyInfoStruct billboardWeeklyInfoStruct) {
        this.weeklyInfo = billboardWeeklyInfoStruct;
    }
}
