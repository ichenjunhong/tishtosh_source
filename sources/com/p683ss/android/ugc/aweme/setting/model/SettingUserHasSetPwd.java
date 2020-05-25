package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd */
public class SettingUserHasSetPwd {
    @C17952c(mo34828a = "data")
    public Data data;
    @C17952c(mo34828a = "message")
    public String message;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd$Data */
    public static class Data {
        @C17952c(mo34828a = "captcha")
        public String captcha;
        @C17952c(mo34828a = "description")
        public String description;
        @C17952c(mo34828a = "error_code")
        public int errorCode;
        @C17952c(mo34828a = "has_set")
        public boolean hasSet;
    }
}
