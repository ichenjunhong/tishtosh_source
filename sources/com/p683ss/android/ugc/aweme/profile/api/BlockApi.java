package com.p683ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi */
public final class BlockApi {

    /* renamed from: a */
    private static final BlockService f101550a = ((BlockService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(BlockService.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi$BlockService */
    public interface BlockService {
        @C12706h(mo23876a = "/aweme/v1/user/block/")
        C12690b<BlockStruct> block(@C12724z(mo23894a = "user_id") String str, @C12724z(mo23894a = "sec_user_id") String str2, @C12724z(mo23894a = "block_type") int i, @C12724z(mo23894a = "source") int i2);
    }

    /* renamed from: a */
    public static BlockStruct m88496a(String str, String str2, int i, int i2) throws Exception {
        return (BlockStruct) f101550a.block(str, str2, i, i2).execute().f33552b;
    }

    /* renamed from: a */
    public static void m88497a(Handler handler, final String str, final String str2, final int i) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                return BlockApi.m88496a(str, str2, i, 0);
            }
        }, 30);
    }

    /* renamed from: a */
    public static void m88498a(Handler handler, String str, String str2, int i, int i2) {
        int i3;
        C23566n a = C23566n.m57766a();
        C39789b bVar = new C39789b(str, str2, i, i2);
        if (i2 == 1) {
            i3 = 32;
        } else {
            i3 = 31;
        }
        a.mo48750a(handler, bVar, i3);
    }
}
