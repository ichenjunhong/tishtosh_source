package com.p683ss.android.ugc.aweme.statistic;

import android.util.Pair;
import com.bytedance.common.utility.C9374b;
import com.bytedance.common.utility.C9423k;
import com.bytedance.common.utility.C9423k.C9424a;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient */
public final class AppLogNetworkClient extends C9423k {

    /* renamed from: a */
    private volatile AppLogGetApi f115548a;

    /* renamed from: b */
    private volatile AppLogPostApi f115549b;

    /* renamed from: c */
    private final int f115550c = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogGetApi */
    interface AppLogGetApi {
        @C12706h
        C17832m<String> getResponse(@C12699af String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogPostApi */
    interface AppLogPostApi {
        @C12718t
        C17832m<String> doPost(@C12699af String str, @C12700b TypedOutput typedOutput, @C12713o int i, @C12710l List<C12685b> list);

        @C12718t
        @C12705g
        C17832m<String> getResponse(@C12699af String str, @C12704f Map<String, String> map, @C12713o int i);
    }

    /* renamed from: b */
    private AppLogPostApi m99515b() {
        if (this.f115549b == null) {
            this.f115549b = (AppLogPostApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(AppLogPostApi.class);
        }
        return this.f115549b;
    }

    /* renamed from: a */
    public final String mo17022a(String str, Map<String, String> map, C9424a aVar) throws Exception {
        if (str == null) {
            return null;
        }
        try {
            if (this.f115548a == null) {
                this.f115548a = (AppLogGetApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(AppLogGetApi.class);
            }
            return (String) this.f115548a.getResponse(str).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C19174b) {
                throw new C9374b(((C19174b) e.getCause()).getStatusCode(), e.getMessage());
            }
            throw new C9374b(0, e.getMessage());
        } catch (Exception e2) {
            throw new C9374b(0, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final String mo17021a(String str, List<Pair<String, String>> list, Map<String, String> map, C9424a aVar) throws C9374b {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Pair pair : list) {
            hashMap.put(pair.first, pair.second);
        }
        NetUtil.putCommonParams(hashMap, true);
        try {
            return (String) m99515b().getResponse(str, hashMap, 204800).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C19174b) {
                throw new C9374b(((C19174b) e.getCause()).getStatusCode(), e.getMessage());
            } else if (e.getCause() instanceof C9872a) {
                C9872a aVar2 = (C9872a) e.getCause();
                throw new C9374b(aVar2.getStatusCode(), aVar2.getMessage());
            } else {
                throw new C9374b(0, e.getMessage());
            }
        } catch (Exception e2) {
            throw new C9374b(0, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final String mo17023a(String str, byte[] bArr, Map<String, String> map, C9424a aVar) throws C9374b {
        String filterUrl = NetworkUtils.filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        if (map != null) {
            try {
                String str2 = (String) map.get("Content-Encoding");
                String str3 = (String) map.get("Content-Type");
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    arrayList.add(new C12685b("Content-Encoding", str2));
                }
                if (str3 != null && str3.length() > 0) {
                    arrayList.add(new C12685b("Content-Type", str3));
                }
                for (Entry entry : map.entrySet()) {
                    arrayList.add(new C12685b((String) entry.getKey(), (String) entry.getValue()));
                }
                return (String) m99515b().doPost(filterUrl, new TypedByteArray(str3, bArr, new String[0]), 204800, arrayList).get();
            } catch (ExecutionException e) {
                if (e.getCause() instanceof C19174b) {
                    throw new C9374b(((C19174b) e.getCause()).getStatusCode(), e.getMessage());
                } else if (e.getCause() instanceof C9872a) {
                    C9872a aVar2 = (C9872a) e.getCause();
                    throw new C9374b(aVar2.getStatusCode(), aVar2.getMessage());
                } else {
                    throw new C9374b(0, e.getMessage());
                }
            } catch (Exception e2) {
                throw new C9374b(0, e2.getMessage());
            }
        } else {
            return (String) m99515b().doPost(filterUrl, new TypedByteArray(null, bArr, new String[0]), 204800, null).get();
        }
    }
}
