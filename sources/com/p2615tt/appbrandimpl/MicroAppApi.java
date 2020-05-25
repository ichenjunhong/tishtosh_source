package com.p2615tt.appbrandimpl;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36845b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36950a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36965d;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36967f;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36970i;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53093x;

/* renamed from: com.tt.appbrandimpl.MicroAppApi */
public final class MicroAppApi {

    /* renamed from: a */
    private static final IRetrofit f129563a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f129564b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.tt.appbrandimpl.MicroAppApi$RealApi */
    public interface RealApi {
        @C53075f
        C17832m<String> executeGet(int i, @C53093x String str);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/collect/list/")
        C17832m<C36845b> getCollectMicroAppList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/follow/relation/")
        C17832m<C36965d> getFollowRelation(@C53089t(mo110619a = "from_user_token") String str, @C53089t(mo110619a = "to_user_id") long j);

        @C53075f(mo110603a = "https://gate.snssdk.com/developer/api/get_gid/")
        C17832m<C36950a> getGid(@C53089t(mo110619a = "alias_id") String str);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/record/list/")
        C17832m<C36967f> getMicroAppList(@C53089t(mo110619a = "page") int i, @C53089t(mo110619a = "page_size") int i2, @C53089t(mo110619a = "list_type") int i3);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/mutual/follow/")
        C17832m<C36970i> mutualFollowUser(@C53089t(mo110619a = "from_user_id") long j, @C53089t(mo110619a = "to_user_id") long j2, @C53089t(mo110619a = "sec_from_user_id") String str);

        @C53084o(mo110612a = "https://aweme.snssdk.com/aweme/v1/microapp/collect/update/")
        C17832m<Object> updateCollectedMicroAppStatus(@C53089t(mo110619a = "micro_app_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/microapp/record/update/")
        C17832m<Object> updateMicroRecord(@C53089t(mo110619a = "schema") String str);
    }

    /* renamed from: a */
    public static C36950a m111316a(String str) throws Exception {
        try {
            return (C36950a) ((RealApi) f129563a.create(RealApi.class)).getGid(str).get();
        } catch (ExecutionException e) {
            throw f129564b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C36845b m111315a(int i, int i2) throws Exception {
        try {
            return (C36845b) ((RealApi) f129563a.create(RealApi.class)).getCollectMicroAppList(i, 20).get();
        } catch (ExecutionException e) {
            throw f129564b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C36965d m111317a(String str, long j) throws Exception {
        try {
            return (C36965d) ((RealApi) f129563a.create(RealApi.class)).getFollowRelation(str, j).get();
        } catch (ExecutionException e) {
            throw f129564b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C36970i m111319a(long j, long j2) throws Exception {
        try {
            return (C36970i) ((RealApi) f129563a.create(RealApi.class)).mutualFollowUser(j, j2, C47865ew.m103536a().mo95083c(String.valueOf(j))).get();
        } catch (ExecutionException e) {
            throw f129564b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C36967f m111318a(int i, int i2, int i3) throws Exception {
        try {
            return (C36967f) ((RealApi) f129563a.create(RealApi.class)).getMicroAppList(i, i2, 0).get();
        } catch (ExecutionException e) {
            throw f129564b.propagateCompatibleException(e);
        }
    }
}
