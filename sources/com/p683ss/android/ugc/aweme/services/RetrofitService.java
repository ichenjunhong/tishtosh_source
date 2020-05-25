package com.p683ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.net.C37796n;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.RetrofitService */
public class RetrofitService implements IRetrofitService {
    private final HashMap<String, IRetrofit> mRetrofitHashMap = new HashMap<>();

    public static IRetrofitService createIRetrofitServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IRetrofitService.class);
        if (a != null) {
            return (IRetrofitService) a;
        }
        if (C27991b.f73465aV == null) {
            synchronized (IRetrofitService.class) {
                if (C27991b.f73465aV == null) {
                    C27991b.f73465aV = new RetrofitService();
                }
            }
        }
        return (RetrofitService) C27991b.f73465aV;
    }

    public RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception {
        throw C23453a.getCompatibleException(executionException);
    }

    public IRetrofit createNewRetrofit(String str) {
        IRetrofit iRetrofit = (IRetrofit) this.mRetrofitHashMap.get(str);
        if (iRetrofit == null) {
            synchronized (this) {
                iRetrofit = (IRetrofit) this.mRetrofitHashMap.get(str);
                if (iRetrofit == null) {
                    iRetrofit = new TTRetrofit(str);
                    this.mRetrofitHashMap.put(str, iRetrofit);
                }
            }
        }
        HashMap<String, IRetrofit> hashMap = this.mRetrofitHashMap;
        if (hashMap != null && hashMap.size() >= C37796n.f96263a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retrofit_map_size", hashMap.size());
            } catch (JSONException unused) {
            }
            C37796n.f96263a *= 2;
            C23569o.m57783b("retrofit_map_size", "", jSONObject);
        }
        return iRetrofit;
    }

    public IRetrofit createNewRetrofit(String str, List<C12727a> list) {
        return new TTRetrofit(str, list);
    }
}
