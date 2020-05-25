package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;
import java.util.List;

public class NobleLevelInfo {
    @C17952c(mo34828a = "expire_time")
    public long expireTime;
    @C17952c(mo34828a = "noble_background")
    ImageModel nobleBackground;
    @C17952c(mo34828a = "noble_background_color")
    public List<String> nobleBackgroundColor;
    @C17952c(mo34828a = "noble_big_icon")
    ImageModel nobleBigIcon;
    @C17952c(mo34828a = "noble_boarder")
    public ImageModel nobleBoarder;
    @C17952c(mo34828a = "noble_icon")
    ImageModel nobleIcon;
    @C17952c(mo34828a = "noble_icon_with_back")
    ImageModel nobleIconWithBack;
    @C17952c(mo34828a = "noble_level")
    long nobleLevel;
    @C17952c(mo34828a = "noble_name")
    String nobleName;

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j) {
        this.nobleLevel = j;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }
}
