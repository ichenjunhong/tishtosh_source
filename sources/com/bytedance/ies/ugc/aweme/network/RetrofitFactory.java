package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.frameworks.baselib.network.http.retrofit.C9919a;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12792q.C12794a;
import com.bytedance.retrofit2.p830a.C12683a.C12684a;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p834d.p835a.C12742h;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.p683ss.android.account.token.AuthTokenInterceptor;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.api.C22966b;
import com.p683ss.android.ugc.aweme.app.api.C22979d;
import com.p683ss.android.ugc.aweme.app.api.C22983f;
import com.p683ss.android.ugc.aweme.app.api.C22986g;
import com.p683ss.android.ugc.aweme.app.api.C23009n;
import com.p683ss.android.ugc.aweme.app.api.C23012q;
import com.p683ss.android.ugc.aweme.app.api.p1365a.C22963a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.net.cache.IesCacheInterceptpr;
import com.p683ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.ApiOkInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import com.p683ss.android.ugc.aweme.setting.boe.C41588a;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2641b.C52711k;

public class RetrofitFactory implements IRetrofitFactory {
    public static List<C12726a> allCommonCallAdapters() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22966b());
        arrayList.add(new C22986g());
        arrayList.add(new C22983f());
        arrayList.add(new C12742h(null, false));
        return arrayList;
    }

    public static List<C12745a> allCommonConvertFactories() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22963a());
        arrayList.add(new C23012q(GsonHolder.createGsonProviderbyMonsterPlugin().getGson()));
        arrayList.add(new C11026b(GsonHolder.createGsonProviderbyMonsterPlugin().getGson()));
        return arrayList;
    }

    public static IRetrofitFactory createIRetrofitFactorybyMonsterPlugin() {
        Object a = C27991b.m66756a(IRetrofitFactory.class);
        if (a != null) {
            return (IRetrofitFactory) a;
        }
        if (C27991b.f73471ab == null) {
            synchronized (IRetrofitFactory.class) {
                if (C27991b.f73471ab == null) {
                    C27991b.f73471ab = new RetrofitFactory();
                }
            }
        }
        return (RetrofitFactory) C27991b.f73471ab;
    }

    public C11029e createBuilder(String str) {
        return new C11025a(str);
    }

    public C11030f create(String str) {
        return createBuilder(str).mo19925a();
    }

    public static List allCommonInterceptor(List list) {
        List allCommonInterceptor$___twin___ = allCommonInterceptor$___twin___(list);
        C41588a a = C41588a.m91426a();
        C52711k.m112236a((Object) a, "BoeManager.inst()");
        C12727a aVar = a.f105318a;
        if (aVar != null) {
            allCommonInterceptor$___twin___.add(aVar);
        }
        return allCommonInterceptor$___twin___;
    }

    public static List<C12727a> allCommonInterceptor$___twin___(List<C12727a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SsInterceptor());
        arrayList.add(new IesCacheInterceptpr());
        arrayList.add(new ApiAlisgInterceptorTTNet());
        arrayList.add(new ApiOkInterceptorTTNet());
        arrayList.add(new DevicesNullInterceptorTTNet());
        if (C11031g.m22343a() != null && !C23715d.m58202a((Collection<T>) C11031g.m22343a().f96294j)) {
            arrayList.addAll(C11031g.m22343a().f96294j);
        }
        arrayList.add(new CommonParamsInterceptorTTNet());
        arrayList.add(new AuthTokenInterceptor());
        arrayList.add(new TTNetInitInterceptor());
        if (!C23715d.m58202a((Collection<T>) list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    static C12792q createRetrofit(C11025a aVar) {
        if (aVar == null) {
            return null;
        }
        C12794a aVar2 = new C12794a();
        List<C12745a> sortConverterFactory = sortConverterFactory(sortConverterFactory(aVar.f29623f, C23012q.class), C22963a.class);
        if (!C23715d.m58202a((Collection<T>) sortConverterFactory)) {
            for (C12745a a : sortConverterFactory) {
                aVar2.mo23944a(a);
            }
        }
        if (!C23715d.m58202a((Collection<T>) aVar.f29624g)) {
            for (C12726a a2 : aVar.f29624g) {
                aVar2.mo23942a(a2);
            }
        }
        aVar2.mo23946a((Executor) new C9919a());
        aVar2.mo23945a(aVar.f29618a);
        if (!aVar.f29621d || C23715d.m58202a((Collection<T>) aVar.f29622e)) {
            aVar2.mo23943a((C12727a) new SsInterceptor());
            aVar2.mo23943a((C12727a) new TTNetInitInterceptor());
        } else {
            for (C12727a aVar3 : aVar.f29622e) {
                if (!(aVar3 instanceof CommonParamsInterceptorTTNet) || aVar.f29620c) {
                    aVar2.mo23943a(aVar3);
                }
            }
        }
        if (aVar.f29619b) {
            aVar2.mo23941a((C12684a) new C22979d());
        } else {
            aVar2.mo23941a((C12684a) new C23009n());
        }
        return aVar2.mo23947a();
    }

    public static List<C12745a> sortConverterFactory(List<C12745a> list, Class cls) {
        if (C23715d.m58202a((Collection<T>) list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        for (C12745a aVar : list) {
            if (cls.isInstance(aVar)) {
                obj = aVar;
            } else if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (obj != null) {
            arrayList.add(0, obj);
        }
        return arrayList;
    }
}
