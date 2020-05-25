package com.p683ss.android.ugc.aweme.miniapp.net;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12707i;
import com.bytedance.retrofit2.p831b.C12708j;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12716r;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12719u;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi */
public interface IAppbrandNetworkApi {
    @C12697ad
    @C12708j(mo23878a = "DELETE", mo23880c = true)
    C12690b<TypedInput> delete(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z);

    @C12706h
    @C12697ad
    C12690b<TypedInput> getRaw(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z2);

    @C12697ad
    @C12707i
    C12690b<TypedInput> head(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z);

    @C12697ad
    @C12716r
    C12690b<TypedInput> options(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z);

    @C12718t
    @C12697ad
    C12690b<TypedInput> post(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z);

    @C12718t
    C12690b<String> postBody(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12697ad
    @C12719u
    C12690b<TypedInput> put(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj, @C12691a boolean z);
}
