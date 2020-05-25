package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p831b.C12715q;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12720v;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C18082l;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi */
public interface AfrApi {
    @C12718t(mo23886a = "/media/api/pic/afr")
    @C12715q
    C2201v<ImageResponse> getImageInfo(@C12724z(mo23894a = "algorithms") String str, @C12724z(mo23894a = "key") String str2, @C12724z(mo23894a = "algorithm_type") String str3, @C12720v(mo23888a = "file") TypedFile typedFile);

    @C12718t(mo23886a = "/media/api/pic/video")
    @C12715q
    C2201v<VideoResponse> getVideoInfo(@C12724z(mo23894a = "algorithm") String str, @C12724z(mo23894a = "key") String str2, @C12724z(mo23894a = "algorithm_type") int i, @C12720v(mo23888a = "file") TypedFile typedFile, @C12720v(mo23888a = "conf") C18082l lVar);
}
