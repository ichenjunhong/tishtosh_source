package com.p683ss.android.ugc.aweme.sensitiveserver;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p831b.C12715q;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12720v;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi */
final class SensitiveFileUploadApi {

    /* renamed from: a */
    private static final String f105152a;

    /* renamed from: b */
    private static final SensitiveFileService f105153b = ((SensitiveFileService) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(f105152a).mo19925a().mo19930a(SensitiveFileService.class));

    /* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi$SensitiveFileService */
    interface SensitiveFileService {
        @C12718t(mo23886a = "/pssresource/external/upload")
        @C12715q
        C0013i<String> uploadSensitiveFile(@C12720v(mo23888a = "file") TypedFile typedFile, @C12720v(mo23888a = "app_id") Integer num, @C12720v(mo23888a = "channel_key") TypedString typedString, @C12720v(mo23888a = "ftype") Integer num2);
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C11010c.m22282b().f29547a);
        f105152a = sb.toString();
    }

    /* renamed from: a */
    static C0013i<String> m91307a(TypedFile typedFile, Integer num, TypedString typedString, Integer num2) {
        return f105153b.uploadSensitiveFile(typedFile, num, typedString, num2);
    }
}
