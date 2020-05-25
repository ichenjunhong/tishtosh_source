package com.p683ss.android.ugc.aweme.shortvideo;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12719u;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.IUploadFileApi */
public interface IUploadFileApi {
    @C12706h
    C12690b<String> doGet(@C12691a boolean z, @C12713o int i, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12719u
    C12690b<String> doPut(@C12713o int i, @C12700b TypedOutput typedOutput, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);

    @C12718t
    C12690b<String> postBody(@C12713o int i, @C12700b TypedOutput typedOutput, @C12699af String str, @C12694aa(mo23869a = true) Map<String, String> map, @C12710l List<C12685b> list, @C12702d Object obj);
}
