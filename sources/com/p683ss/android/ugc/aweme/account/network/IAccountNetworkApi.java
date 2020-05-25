package com.p683ss.android.ugc.aweme.account.network;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.IAccountNetworkApi */
public interface IAccountNetworkApi {
    @C12706h
    C12690b<String> getResponse(@C12699af String str, @C12713o int i, @C12710l List<C12685b> list);

    @C12718t
    @C12705g
    C12690b<String> getResponse(@C12699af String str, @C12704f Map<String, String> map, @C12713o int i, @C12710l List<C12685b> list);
}
