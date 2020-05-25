package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;
import okhttp3.C53664p.C53667a;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;

public class OkHttp3Instrumentation {
    public static C53682y init() {
        return new C53684a().mo111665a((C53676u) new AddHeaderInterceptor()).mo111663a((C53667a) new OkHttpEventFactory(null)).mo111667a();
    }

    public static C53682y build(C53684a aVar) {
        return aVar.mo111665a((C53676u) new AddHeaderInterceptor()).mo111663a((C53667a) new OkHttpEventFactory(aVar.mo111667a().f133198i)).mo111667a();
    }
}
