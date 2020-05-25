package com.p683ss.android.ugc.aweme.gecko;

import android.content.Context;
import com.bytedance.geckox.buffer.p597a.C10055b;
import com.bytedance.geckox.p612j.C10120b;
import com.bytedance.geckox.p612j.C10121c;
import com.bytedance.geckox.utils.C10152b;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12697ad;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12718t;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl */
public final class GeckoXNetImpl implements C10120b {

    /* renamed from: a */
    private File f85402a;

    /* renamed from: b */
    private GeckoXNetApi f85403b = ((GeckoXNetApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19926b(true).mo19925a().mo19930a(GeckoXNetApi.class));

    /* renamed from: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl$GeckoXNetApi */
    public interface GeckoXNetApi {
        @C12706h
        C12690b<String> doGet(@C12699af String str);

        @C12718t
        @C12705g
        C12690b<String> doPost(@C12699af String str, @C12704f Map<String, String> map);

        @C12706h
        @C12697ad
        C12690b<TypedInput> downloadFile(@C12699af String str, @C12710l List<C12685b> list);

        @C12718t
        C12690b<String> postBody(@C12699af String str, @C12700b TypedOutput typedOutput);
    }

    public GeckoXNetImpl(Context context) {
        this.f85402a = new File(context.getFilesDir(), "gecko-resume-net-work");
        this.f85402a.mkdirs();
    }

    /* renamed from: a */
    private static Map<String, String> m75682a(List<C12685b> list) {
        HashMap hashMap = new HashMap();
        if (!C23715d.m58202a((Collection<T>) list)) {
            for (C12685b bVar : list) {
                hashMap.put(bVar.f33318a, bVar.f33319b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final C10121c mo18094a(String str, String str2) throws Exception {
        C12799u execute = this.f85403b.postBody(str, new TypedByteArray("application/json", str2.getBytes(Charset.forName("UTF-8")), new String[0])).execute();
        return new C10121c(m75682a(execute.mo23959b()), (String) execute.f33552b);
    }

    /* renamed from: a */
    public final void mo18095a(String str, long j, C10055b bVar) throws Exception {
        Exception e;
        int i;
        BufferedInputStream bufferedInputStream = null;
        try {
            C12799u execute = this.f85403b.downloadFile(str, null).execute();
            i = execute.mo23958a();
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(((TypedInput) execute.f33552b).mo9554in());
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = bufferedInputStream2.read(bArr, 0, 2048);
                        if (read != -1) {
                            bVar.write(bArr, 0, read);
                        } else {
                            C10152b.m20477a((Closeable) bufferedInputStream2);
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        StringBuilder sb = new StringBuilder("downloadFile failed, code: ");
                        sb.append(i);
                        sb.append(", url:");
                        sb.append(str);
                        sb.append(", caused by:");
                        sb.append(e.getMessage());
                        throw new RuntimeException(sb.toString(), e);
                    } catch (Throwable th) {
                        th = th;
                        C10152b.m20477a((Closeable) bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    C10152b.m20477a((Closeable) bufferedInputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder("downloadFile failed, code: ");
                sb2.append(i);
                sb2.append(", url:");
                sb2.append(str);
                sb2.append(", caused by:");
                sb2.append(e.getMessage());
                throw new RuntimeException(sb2.toString(), e);
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
            StringBuilder sb22 = new StringBuilder("downloadFile failed, code: ");
            sb22.append(i);
            sb22.append(", url:");
            sb22.append(str);
            sb22.append(", caused by:");
            sb22.append(e.getMessage());
            throw new RuntimeException(sb22.toString(), e);
        }
    }
}
