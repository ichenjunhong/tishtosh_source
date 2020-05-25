package com.p683ss.android.ugc.aweme.services;

import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12792q.C12794a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.ugc.aweme.app.api.C23009n;
import com.p683ss.android.ugc.aweme.app.api.C23012q;
import com.p683ss.android.ugc.aweme.app.api.p1365a.C22963a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.services.TTRetrofit */
public final class TTRetrofit implements IRetrofit {
    private final IRetrofit retrofit;

    /* renamed from: com.ss.android.ugc.aweme.services.TTRetrofit$RetrofitDelegateImpl */
    static class RetrofitDelegateImpl implements IRetrofit {
        private String baseUrl;
        private List<C12727a> interceptors;
        private AtomicReference<C12792q> retrofit = new AtomicReference<>(null);

        public C12792q getRetrofit() {
            if (this.retrofit.get() == null) {
                synchronized (this) {
                    if (this.retrofit.get() == null) {
                        this.retrofit.set(createTTNetRetrofit(this.baseUrl, this.interceptors));
                    }
                }
            }
            return (C12792q) this.retrofit.get();
        }

        public <T> T create(final Class<T> cls) {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                private volatile T retrofitService;

                private T getRetrofitService() {
                    if (this.retrofitService == null) {
                        synchronized (this) {
                            if (this.retrofitService == null) {
                                this.retrofitService = RetrofitDelegateImpl.this.getRetrofit().mo23937a(cls);
                            }
                        }
                    }
                    return this.retrofitService;
                }

                private Method getRetrofitMethod(T t, Method method) throws NoSuchMethodException {
                    return t.getClass().getMethod(method.getName(), method.getParameterTypes());
                }

                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    Object retrofitService2 = getRetrofitService();
                    return getRetrofitMethod(retrofitService2, method).invoke(retrofitService2, objArr);
                }
            });
        }

        RetrofitDelegateImpl(String str, List<C12727a> list) {
            this.baseUrl = str;
            this.interceptors = list;
        }

        private static C12792q createTTNetRetrofit(String str, List<C12727a> list) {
            return createRetrofit(str, RetrofitFactory.allCommonConvertFactories(), RetrofitFactory.allCommonCallAdapters(), RetrofitFactory.allCommonInterceptor(list));
        }

        private static C12792q createRetrofit(String str, List<C12745a> list, List<C12726a> list2, List<C12727a> list3) {
            C12794a aVar = new C12794a();
            List<C12745a> sortConverterFactory = RetrofitFactory.sortConverterFactory(RetrofitFactory.sortConverterFactory(list, C23012q.class), C22963a.class);
            if (!C23715d.m58202a((Collection<T>) sortConverterFactory)) {
                for (C12745a a : sortConverterFactory) {
                    aVar.mo23944a(a);
                }
            }
            if (!C23715d.m58202a((Collection<T>) list2)) {
                for (C12726a a2 : list2) {
                    aVar.mo23942a(a2);
                }
            }
            aVar.mo23946a((Executor) new C9919a());
            aVar.mo23945a(str);
            if (!C23715d.m58202a((Collection<T>) list3)) {
                for (C12727a a3 : list3) {
                    aVar.mo23943a(a3);
                }
            }
            aVar.mo23941a((C12684a) new C23009n());
            return aVar.mo23947a();
        }
    }

    public final <T> T create(Class<T> cls) {
        return this.retrofit.create(cls);
    }

    public TTRetrofit(String str) {
        this.retrofit = new RetrofitDelegateImpl(str, null);
    }

    public TTRetrofit(String str, List<C12727a> list) {
        this.retrofit = new RetrofitDelegateImpl(str, list);
    }
}
