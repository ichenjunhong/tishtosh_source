package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupAnnouncementContent */
public final class GroupAnnouncementContent extends BaseContent {
    @C17952c(mo34828a = "notice_content")
    private String announcement = "";
    @C17952c(mo34828a = "notice_title")
    private String title = "";

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMsgHint() {
        String str = this.announcement;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setAnnouncement(String str) {
        this.announcement = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
