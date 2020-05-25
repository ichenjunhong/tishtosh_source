package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse */
public class ActivityLinkResponse extends BaseResponse {
    @C17952c(mo34828a = "link_info")
    public LinkInfo linkInfo;

    /* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse$LinkInfo */
    public class LinkInfo {
        @C17952c(mo34828a = "background_style")
        public String backgroundUrl;
        @C17952c(mo34828a = "close_after")
        public int closeAfter;
        @C17952c(mo34828a = "days_no_show")
        public int daysNotShow;
        @C17952c(mo34828a = "days_window")
        public int daysWindow;
        @C17952c(mo34828a = "click_disappear")
        public boolean disappearAfterClicked;
        @C17952c(mo34828a = "font_color")
        public String fontColor;
        @C17952c(mo34828a = "max_close")
        public int maxClose;
        @C17952c(mo34828a = "teenager_mode_enable")
        public boolean teenagerModeEnable;
        @C17952c(mo34828a = "text")
        public String text;
        @C17952c(mo34828a = "h5_url")
        public String url;

        public LinkInfo() {
        }
    }
}
