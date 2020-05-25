package com.p683ss.android.ugc.aweme.setting.serverpush.api;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager */
public final class PushSettingsApiManager {

    /* renamed from: a */
    private static PushUserSettingsApi f105511a = ((PushUserSettingsApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(PushUserSettingsApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager$PushUserSettingsApi */
    interface PushUserSettingsApi {
        @C53075f(mo110603a = "/maya/user/registered/")
        C17832m<Object> getRegisterDuoshanStatus();

        @C53075f(mo110603a = "/aweme/v1/user/settings/")
        C17832m<C41686c> getUserSettings(@C53089t(mo110619a = "last_settings_version") String str);

        @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
        C17832m<BaseResponse> setItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "value") int i);

        @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
        C17832m<BaseResponse> setPrivateItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "private_setting") int i);

        @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
        C17832m<BaseResponse> setPrivateItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "private_setting") int i, @C53089t(mo110619a = "aweme_id") String str2);

        @C53084o(mo110612a = "/aweme/v1/user/set/settings/")
        C17832m<BaseResponse> setResidenceItem(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "user_residence") String str2);
    }

    /* renamed from: a */
    public static C41686c m91544a() throws Exception {
        try {
            return (C41686c) f105511a.getUserSettings(C23859b.m58575b().mo49468b(C11010c.m22280a(), "last_user_setting_version", "")).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m91542a(String str, int i) throws Exception {
        try {
            return (BaseResponse) f105511a.setItem(str, i).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static BaseResponse m91545b(String str, int i) throws Exception {
        try {
            return (BaseResponse) f105511a.setPrivateItem(str, i).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m91543a(String str, int i, String str2) throws Exception {
        try {
            return (BaseResponse) f105511a.setPrivateItem(str, i, str2).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }
}
