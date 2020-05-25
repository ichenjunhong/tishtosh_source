package com.p683ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.base.model.p189c.C2969a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.livesdkapi.p455i.C8817g;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.p753k.C12103a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.live.C36093g;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.ttlive.ILiveApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.l */
public final class C36119l implements IHostNetwork {

    /* renamed from: b */
    private static final String f92503b;

    /* renamed from: a */
    private volatile ILiveApi f92504a;

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.l$a */
    static class C36121a implements C8817g<C8815e> {

        /* renamed from: a */
        private C12690b<TypedInput> f92510a;

        /* renamed from: b */
        public final void mo15806b() {
            this.f92510a.cancel();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C8815e mo15805a() throws IOException {
            TypedInput typedInput;
            String str;
            try {
                C12799u execute = this.f92510a.execute();
                byte[] bArr = null;
                if (execute.f33552b != null) {
                    typedInput = (TypedInput) execute.f33552b;
                } else if (execute.f33553c != null) {
                    typedInput = (TypedInput) execute.f33552b;
                } else {
                    typedInput = null;
                }
                if (typedInput != null) {
                    if (typedInput instanceof TypedByteArray) {
                        bArr = ((TypedByteArray) typedInput).getBytes();
                    } else {
                        InputStream in = typedInput.mo9554in();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (in != null) {
                            byte[] bArr2 = new byte[4096];
                            while (true) {
                                int read = in.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                }
                String str2 = "";
                if (execute.f33551a != null) {
                    String str3 = execute.f33551a.f33348c;
                    str = str3;
                    str2 = execute.f33551a.f33346a;
                } else {
                    str = "no reason";
                }
                List<C12685b> b = execute.mo23959b();
                ArrayList arrayList = new ArrayList();
                for (C12685b bVar : b) {
                    arrayList.add(new C2977g(bVar.f33318a, bVar.f33319b));
                }
                C8815e eVar = new C8815e();
                eVar.f24062a = str2;
                eVar.f24063b = execute.mo23958a();
                eVar.f24067f = str;
                eVar.f24064c = arrayList;
                eVar.f24066e = bArr;
                if (typedInput != null) {
                    eVar.f24065d = typedInput.mimeType();
                }
                return eVar;
            } catch (Exception e) {
                if (e instanceof C9872a) {
                    C9872a aVar = (C9872a) e;
                    throw new C2969a(aVar.getStatusCode(), aVar.getMessage());
                } else if (e instanceof IOException) {
                    throw ((IOException) e);
                } else {
                    throw new IOException(e);
                }
            }
        }

        C36121a(C12690b<TypedInput> bVar) {
            this.f92510a = bVar;
        }
    }

    public final Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        return hashMap;
    }

    public final String getHostDomain() {
        return ((C36093g) C12103a.m10249a(C36093g.class)).mo74846b();
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C36148r.m81573a().getApiHost());
        f92503b = sb.toString();
    }

    /* renamed from: a */
    private ILiveApi m81523a() {
        if (this.f92504a == null) {
            this.f92504a = (ILiveApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f92503b).create(ILiveApi.class);
        }
        return this.f92504a;
    }

    public C36119l() {
        if (RetrofitService.createIRetrofitServicebyMonsterPlugin() != null) {
            this.f92504a = (ILiveApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f92503b).create(ILiveApi.class);
        }
        C4116c.m10251a(IHostNetwork.class, this);
    }

    /* renamed from: a */
    private static Map<String, String> m81524a(List<C2977g> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (C2977g gVar : list) {
                hashMap.put(gVar.getName(), gVar.getValue());
            }
        }
        return hashMap;
    }

    public final C8817g<C8815e> get(String str, List<C2977g> list) throws IOException {
        return new C36121a(m81523a().get(str, m81524a(list)));
    }

    public final C8817g<C8815e> post(String str, List<C2977g> list, String str2, byte[] bArr) throws IOException {
        return new C36121a(m81523a().post(str, new TypedByteArray(str2, bArr, new String[0]), m81524a(list)));
    }

    public final C8817g<C8815e> downloadFile(boolean z, int i, String str, List<C2977g> list, Object obj) throws IOException {
        return new C36121a(m81523a().downloadFile(z, i, str, m81524a(list), obj));
    }

    public final C8817g<C8815e> uploadFile(int i, String str, List<C2977g> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        Map a = m81524a(list);
        ILiveApi a2 = m81523a();
        final String str4 = str2;
        final long j2 = j;
        final byte[] bArr2 = bArr;
        final String str5 = str3;
        C361201 r2 = new TypedOutput() {
            public final String fileName() {
                return null;
            }

            public final long length() {
                return j2;
            }

            public final String md5Stub() {
                return str5;
            }

            public final String mimeType() {
                return str4;
            }

            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr2);
            }
        };
        int i2 = i;
        String str6 = str;
        return new C36121a(a2.postMultiPart(i, str, a, r2));
    }
}
