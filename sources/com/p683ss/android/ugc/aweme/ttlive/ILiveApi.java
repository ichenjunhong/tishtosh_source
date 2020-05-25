package com.p683ss.android.ugc.aweme.ttlive;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12691a;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12713o;
import java.util.Map;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53079j;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53092w;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.ttlive.ILiveApi */
public interface ILiveApi {
    @C53092w
    @C53075f
    C12690b<TypedInput> downloadFile(@C12691a boolean z, @C12713o int i, @C53093x String str, @C53079j Map<String, String> map, @C12702d Object obj);

    @C53075f
    C12690b<TypedInput> get(@C53093x String str, @C53079j Map<String, String> map);

    @C53084o
    C12690b<TypedInput> post(@C53093x String str, @C12700b TypedByteArray typedByteArray, @C53079j Map<String, String> map);

    @C53084o
    C12690b<TypedInput> postMultiPart(@C12713o int i, @C53093x String str, @C53079j Map<String, String> map, @C12700b TypedOutput typedOutput);
}
