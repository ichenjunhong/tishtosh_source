package com.p683ss.android.ugc.aweme.framework.services;

import com.bytedance.retrofit2.p833c.C12727a;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IRetrofitService */
public interface IRetrofitService {
    IRetrofit createNewRetrofit(String str);

    IRetrofit createNewRetrofit(String str, List<C12727a> list);

    RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception;
}
