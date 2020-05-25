package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

public class FraternityInfo {
    @C17952c(mo34828a = "background")
    ImageModel background;
    @C17952c(mo34828a = "font_color")
    String fontColor;
    @C17952c(mo34828a = "level")
    long level;
    @C17952c(mo34828a = "name")
    String name;

    public ImageModel getBackground() {
        return this.background;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.name) || this.level <= 0 || this.background == null) {
            return false;
        }
        return true;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public void setLevel(long j) {
        this.level = j;
    }

    public void setName(String str) {
        this.name = str;
    }
}
