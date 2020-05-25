package com.bytedance.android.livesdk.gift.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

public class GiftPage {
    public static final int PAGE_TYPE_FANSCLUB = 2;
    public static final int PAGE_TYPE_GIFT = 1;
    public static final int PAGE_TYPE_HONOR_LEVEL = 3;
    public static final int PAGE_TYPE_NOBLE = 4;
    public static final int PAGE_TYPE_PROPERTY = 5;
    @C17952c(mo34828a = "display")
    public boolean display;
    @C17952c(mo34828a = "event_name")
    public String eventName;
    @C17952c(mo34828a = "gifts")
    public List<C7505d> gifts;
    @C17952c(mo34828a = "page_operation")
    public GiftOperation operation;
    @C17952c(mo34828a = "page_name")
    public String pageName;
    @C17952c(mo34828a = "page_type")
    public int pageType;
}
