package com.p683ss.android.ugc.aweme.setting.api;

import com.google.gson.C18082l;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.SettingApi */
public interface SettingApi {
    @C53075f(mo110603a = "/aweme/v1/settings/")
    C17832m<C18082l> queryRawSetting(@C53089t(mo110619a = "cpu_model") String str, @C53089t(mo110619a = "oid") int i, @C53089t(mo110619a = "last_settings_version") String str2);

    @C53075f(mo110603a = "/aweme/v1/settings/")
    C17832m<IESSettings> querySetting(@C53089t(mo110619a = "cpu_model") String str, @C53089t(mo110619a = "oid") int i, @C53089t(mo110619a = "last_settings_version") String str2);

    @C53075f(mo110603a = "/passport/password/has_set/")
    C0013i<SettingUserHasSetPwd> queryUserHasSetPwd();
}
