package com.p683ss.android.ugc.aweme.effectplatform;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI */
public interface EffectNetworkAPI {
    @C12706h
    @C12697ad
    C12690b<TypedInput> doGet(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map);

    @C12718t
    @C12697ad
    C12690b<TypedInput> doPost(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12700b Map<String, Object> map);
}
