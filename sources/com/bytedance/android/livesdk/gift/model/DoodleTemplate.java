package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

public class DoodleTemplate {
    @C17952c(mo34828a = "template_id")

    /* renamed from: id */
    public long f20510id;
    @C17952c(mo34828a = "image")
    public ImageModel image;
    public boolean selected;

    public long getId() {
        return this.f20510id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j) {
        this.f20510id = j;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
