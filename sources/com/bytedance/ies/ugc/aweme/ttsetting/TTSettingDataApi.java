package com.bytedance.ies.ugc.aweme.ttsetting;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C18082l;

public final class TTSettingDataApi {

    public interface SettingApi {
        @C12706h(mo23876a = "/service/settings/v2/")
        C12690b<C18082l> getResponse(@C12724z(mo23894a = "has_local_cache") boolean z, @C12724z(mo23894a = "app") int i, @C12724z(mo23894a = "default") int i2);
    }
}
