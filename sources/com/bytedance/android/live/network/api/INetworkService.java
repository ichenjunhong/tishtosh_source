package com.bytedance.android.live.network.api;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import java.util.Map;

public interface INetworkService extends C2952b, IHostNetwork {
    <T> C2888b<T> getProtoDecoder(Class<T> cls);

    void injectProtoDecoders(Map<Class, C2888b> map);
}
