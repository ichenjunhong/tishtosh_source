package com.bytedance.android.livesdkapi.host;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.livesdkapi.host.p451a.C8785h;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.livesdkapi.p455i.C8817g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IHostNetwork extends C2952b, C8785h {
    C8817g<C8815e> downloadFile(boolean z, int i, String str, List<C2977g> list, Object obj) throws IOException;

    C8817g<C8815e> get(String str, List<C2977g> list) throws IOException;

    Map<String, String> getCommonParams();

    String getHostDomain();

    C8817g<C8815e> post(String str, List<C2977g> list, String str2, byte[] bArr) throws IOException;

    C8817g<C8815e> uploadFile(int i, String str, List<C2977g> list, String str2, byte[] bArr, long j, String str3) throws IOException;
}
