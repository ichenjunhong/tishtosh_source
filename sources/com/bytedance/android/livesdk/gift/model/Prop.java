package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.google.gson.p1076a.C17952c;

public class Prop {
    public static final int CNY_PROP_SEND_COUNT = 10;
    public static final long PROP_TYPE_POPULAR_CARD = 4;
    @C17952c(mo34828a = "banner")
    public C8692a banner;
    @C17952c(mo34828a = "count")
    public int count;
    @C17952c(mo34828a = "description")
    public String description;
    @C17952c(mo34828a = "diamond")
    public int diamond;
    @C17952c(mo34828a = "diamond_icon")
    public ImageModel diamondLabel;
    @C17952c(mo34828a = "gift")
    public C7505d gift = new C7505d();
    @C17952c(mo34828a = "guide_url")
    public String guideUrl;
    @C17952c(mo34828a = "icon")
    public ImageModel icon;
    @C17952c(mo34828a = "prop_def_id")

    /* renamed from: id */
    public long f20511id;
    @C17952c(mo34828a = "is_aweme_free_gift")
    public int isAwemeFreeGift;
    @C17952c(mo34828a = "label_icon")
    public ImageModel labelIcon;
    @C17952c(mo34828a = "manual")
    public String manual;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "next_expire")
    public long nextExpire;
    private long nowTimeDiff;
    @C17952c(mo34828a = "primary_effect_id")
    public int primaryEffectId;
    @C17952c(mo34828a = "prop_def_type")
    public long propType;
    @C17952c(mo34828a = "reddot_tip")
    public boolean reddotTip;

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.f20511id = prop.f20511id;
        prop2.manual = prop.manual;
        prop2.guideUrl = prop.guideUrl;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }
}
