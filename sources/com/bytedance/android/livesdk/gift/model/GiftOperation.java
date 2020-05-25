package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

public class GiftOperation {
    public static final int OPERATION_TYPE_PANEL = 1;
    public static final int OPERATION_TYPE_TAB = 0;
    @C17952c(mo34828a = "event_name")
    public String eventName;
    @C17952c(mo34828a = "left_image")
    public ImageModel leftImage;
    @C17952c(mo34828a = "right_image")
    public ImageModel rightImage;
    @C17952c(mo34828a = "scheme_url")
    public String schemeUrl;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "title_color")
    public String titleColor;
    @C17952c(mo34828a = "title_size")
    public int titleSize;
}
