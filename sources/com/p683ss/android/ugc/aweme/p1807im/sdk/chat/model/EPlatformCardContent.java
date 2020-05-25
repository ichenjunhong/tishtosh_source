package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent */
public class EPlatformCardContent extends BaseContent {
    @C17952c(mo34828a = "actions")
    public Map<String, LinkItem> actions;
    @C17952c(mo34828a = "content")
    public String content;
    @C17952c(mo34828a = "push_detail")
    public String pushDetail;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent$ExtraParams */
    public static class ExtraParams {
        @C17952c(mo34828a = "show_more_button")
        public String showMoreButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent$LinkItem */
    public static class LinkItem {
        @C17952c(mo34828a = "action_type")
        public int actionType;
        @C17952c(mo34828a = "ext_params")
        public ExtraParams extraParams;
        @C17952c(mo34828a = "name")
        public String name;
        @C17952c(mo34828a = "phone_encrypt_key")
        public String phoneEncryptKey;
        @C17952c(mo34828a = "phone_instance_id")
        public String phoneInstanceId;
        @C17952c(mo34828a = "phone_number")
        public String phoneNumber;
        @C17952c(mo34828a = "value")
        public String value;
    }

    public String getMsgHint() {
        return this.pushDetail;
    }
}
