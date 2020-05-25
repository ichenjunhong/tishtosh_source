package com.p683ss.android.ugc.aweme.net;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12701c;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12719u;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.CommonApi */
public interface CommonApi {
    @C12701c
    C12690b<String> doDelete(@C12699af String str);

    @C12701c
    C12690b<String> doDelete(@C12699af String str, @C12713o int i, @C12710l List<C12685b> list);

    @C12701c
    C12690b<String> doDelete(@C12699af String str, @C12710l List<C12685b> list);

    @C12701c
    C12690b<String> doDelete(@C12699af String str, @C12694aa Map<String, String> map);

    @C12706h
    C12690b<String> doGet(@C12699af String str);

    @C12706h
    C12690b<String> doGet(@C12699af String str, @C12713o int i);

    @C12706h
    C12690b<String> doGet(@C12699af String str, @C12713o int i, @C12694aa Map<String, String> map);

    @C12706h
    C12690b<String> doGet(@C12699af String str, @C12694aa Map<String, String> map);

    @C12706h
    C12690b<String> doGet(@C12699af String str, @C12694aa Map<String, String> map, @C12710l List<C12685b> list);

    @C12718t
    @C12705g
    C12690b<String> doPost(@C12699af String str, @C12713o int i, @C12704f Map<String, String> map);

    @C12718t
    @C12705g
    C12690b<String> doPost(@C12699af String str, @C12713o int i, @C12704f Map<String, String> map, @C12694aa Map<String, String> map2);

    @C12718t
    @C12705g
    C12690b<String> doPost(@C12699af String str, @C12704f Map<String, String> map);

    @C12718t
    @C12705g
    C12690b<String> doPost(@C12699af String str, @C12704f Map<String, String> map, @C12710l List<C12685b> list);

    @C12718t
    C12690b<String> postBody(@C12699af String str, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list);

    @C12719u
    C12690b<String> putBody(@C12699af String str, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list);
}
