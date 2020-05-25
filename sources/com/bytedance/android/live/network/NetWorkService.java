package com.bytedance.android.live.network;

import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.network.C4154c.C4155a;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.livesdkapi.p455i.C8817g;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NetWorkService implements INetworkService {
    private C4154c mCommonParamsInterceptor;
    private IHostNetwork mIHostNetwork;
    private Map<Class, C2888b> protoDecoderMap = new ConcurrentHashMap();

    public String getHostDomain() {
        return this.mIHostNetwork.getHostDomain();
    }

    public Map<String, String> getCommonParams() {
        Map<String, String> commonParams = this.mIHostNetwork.getCommonParams();
        if (this.mCommonParamsInterceptor != null) {
            this.mCommonParamsInterceptor.mo9547a(commonParams);
        }
        return commonParams;
    }

    public void injectProtoDecoders(Map<Class, C2888b> map) {
        this.protoDecoderMap.putAll(map);
    }

    public <T> C2888b<T> getProtoDecoder(Class<T> cls) {
        return (C2888b) this.protoDecoderMap.get(cls);
    }

    public NetWorkService(IHostNetwork iHostNetwork) {
        if (C4116c.m10249a(INetworkService.class) == null) {
            C4116c.m10251a(INetworkService.class, this);
            C4116c.m10251a(IHostNetwork.class, this);
            this.mIHostNetwork = iHostNetwork;
            this.mCommonParamsInterceptor = C4152b.m10314a();
        }
    }

    public C8817g<C8815e> get(String str, List<C2977g> list) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.get(str, list);
        }
        C4155a a = this.mCommonParamsInterceptor.mo9546a(new C4155a(str, list));
        return this.mIHostNetwork.get(a.f11332a, a.f11333b);
    }

    public C8817g<C8815e> post(String str, List<C2977g> list, String str2, byte[] bArr) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.post(str, list, str2, bArr);
        }
        C4155a a = this.mCommonParamsInterceptor.mo9546a(new C4155a(str, list));
        return this.mIHostNetwork.post(a.f11332a, a.f11333b, str2, bArr);
    }

    public C8817g<C8815e> downloadFile(boolean z, int i, String str, List<C2977g> list, Object obj) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.downloadFile(z, i, str, list, obj);
        }
        C4155a a = this.mCommonParamsInterceptor.mo9546a(new C4155a(str, list));
        return this.mIHostNetwork.downloadFile(z, i, a.f11332a, a.f11333b, obj);
    }

    public C8817g<C8815e> uploadFile(int i, String str, List<C2977g> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        if (this.mCommonParamsInterceptor != null) {
            String str4 = str;
            List<C2977g> list2 = list;
            C4155a a = this.mCommonParamsInterceptor.mo9546a(new C4155a(str, list));
            return this.mIHostNetwork.uploadFile(i, a.f11332a, a.f11333b, str2, bArr, j, str3);
        }
        return this.mIHostNetwork.uploadFile(i, str, list, str2, bArr, j, str3);
    }
}
