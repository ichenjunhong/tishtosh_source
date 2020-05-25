package com.p683ss.android.ugc.aweme.net;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12701c;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12715q;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12719u;
import com.bytedance.retrofit2.p831b.C12721w;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.IIESNetworkApi */
public interface IIESNetworkApi {
    @C12701c
    C12690b<String> doDetete(@C12713o int i, @C12699af String str, @C12694aa Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12706h
    C12690b<String> doGet(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12718t
    @C12705g
    C12690b<String> doPost(@C12713o int i, @C12699af String str, @C12694aa Map<String, String> map, @C12704f(mo23875a = true) Map<String, String> map2, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12705g
    @C12719u
    C12690b<String> doPut(@C12713o int i, @C12699af String str, @C12694aa Map<String, String> map, @C12704f(mo23875a = true) Map<String, String> map2, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12706h
    @C12697ad
    C12690b<TypedInput> downloadFile(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map);

    @C12706h
    @C12697ad
    C12690b<TypedInput> downloadFile(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list);

    @C12706h
    @C12697ad
    C12690b<TypedInput> downloadFile(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12718t
    C12690b<String> postBody(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12718t
    @C12715q
    C12690b<String> postMultiPart(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12721w Map<String, TypedOutput> map2, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12719u
    C12690b<String> putBody(@C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12700b TypedOutput typedOutput, @C12710l List<C12685b> list, @C12702d Object obj);
}
