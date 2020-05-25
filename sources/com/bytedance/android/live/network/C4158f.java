package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.p253a.C4173a;
import com.bytedance.android.live.network.response.p253a.C4174b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.p173d.p174a.p175a.C2890d;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a.C9920a;
import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.network.f */
public final class C4158f extends C12745a {

    /* renamed from: a */
    private ThreadLocal<C2895g> f11337a = new ThreadLocal<>();

    /* renamed from: b */
    private C9920a f11338b;

    C4158f(C9920a aVar) {
        this.f11338b = aVar;
    }

    /* renamed from: a */
    private static RequestError m10324a(C4173a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f11369b;
        requestError.prompts = aVar.f11370c;
        requestError.alert = aVar.f11371d;
        return requestError;
    }

    /* renamed from: a */
    private static void m10328a(Extra extra, C4173a aVar) {
        extra.now = aVar.f11372e;
    }

    /* renamed from: e */
    private C12744f<TypedInput, ?> m10331e(Type type, Annotation[] annotationArr, C12792q qVar) {
        return this.f11338b.mo9551a(type, annotationArr, qVar);
    }

    /* renamed from: a */
    private static C4177d m10326a(Class cls, C2895g gVar, C4173a aVar) throws Exception {
        C4177d dVar = new C4177d();
        dVar.statusCode = aVar.f11368a;
        Extra extra = new Extra();
        m10328a(extra, aVar);
        dVar.extra = extra;
        if (aVar.f11368a == 0) {
            long a = gVar.mo7514a();
            while (true) {
                int b = gVar.mo7517b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    dVar.data = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls).decode(gVar);
                } else {
                    C2896h.m8236g(gVar);
                }
            }
            gVar.mo7516a(a);
        } else {
            dVar.error = m10324a(aVar);
        }
        return dVar;
    }

    /* renamed from: b */
    private static C4176c m10330b(Class cls, C2895g gVar, C4173a aVar) throws Exception {
        C4176c cVar = new C4176c();
        cVar.f11364a = aVar.f11368a;
        Extra extra = new Extra();
        m10328a(extra, aVar);
        cVar.f11366c = extra;
        cVar.f11365b = new ArrayList();
        if (aVar.f11368a == 0) {
            long a = gVar.mo7514a();
            while (true) {
                int b = gVar.mo7517b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    cVar.f11365b.add(((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls).decode(gVar));
                } else {
                    C2896h.m8236g(gVar);
                }
            }
            gVar.mo7516a(a);
        } else {
            cVar.f11367d = m10324a(aVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (!(type instanceof ParameterizedType)) {
            return m10331e(type, annotationArr, qVar);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return m10331e(type, annotationArr, qVar);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        int i = 0;
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                return m10331e(type, annotationArr, qVar);
            }
            clsArr[0] = (Class) actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                return m10331e(type, annotationArr, qVar);
            }
            clsArr[1] = (Class) actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            return m10331e(type, annotationArr, qVar);
        }
        Class<C4172a> cls = (Class) rawType;
        if (cls != C4177d.class && cls != C4176c.class && cls != C4175b.class && cls != C4172a.class) {
            return m10331e(type, annotationArr, qVar);
        }
        String str = null;
        int length = annotationArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            C12718t tVar = annotationArr[i];
            if (tVar instanceof C12706h) {
                str = ((C12706h) tVar).mo23876a();
                break;
            } else if (tVar instanceof C12718t) {
                str = tVar.mo23886a();
                break;
            } else {
                i++;
            }
        }
        C4160g gVar = new C4160g(this, cls, clsArr, str, type, annotationArr, qVar);
        return gVar;
    }

    /* renamed from: a */
    public final C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
        return this.f11338b.mo9552a(type, annotationArr, annotationArr2, qVar);
    }

    /* renamed from: a */
    private static C4175b m10325a(Class cls, Class cls2, C2895g gVar, C4173a aVar) throws Exception {
        C4175b bVar = new C4175b();
        bVar.statusCode = aVar.f11368a;
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.data = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls).decode(gVar);
                        break;
                    case 2:
                        bVar.extra = (Extra) ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls2).decode(gVar);
                        m10328a(bVar.extra, aVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                if (aVar.f11368a != 0) {
                    bVar.error = m10324a(aVar);
                }
                return bVar;
            }
        }
    }

    /* renamed from: b */
    private static C4172a m10329b(Class cls, Class cls2, C2895g gVar, C4173a aVar) throws Exception {
        C4172a aVar2 = new C4172a();
        aVar2.f11364a = aVar.f11368a;
        aVar2.f11365b = new ArrayList();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar2.f11365b.add(((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls).decode(gVar));
                        break;
                    case 2:
                        aVar2.f11366c = (Extra) ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(cls2).decode(gVar);
                        m10328a(aVar2.f11366c, aVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                if (aVar.f11368a != 0) {
                    aVar2.f11367d = m10324a(aVar);
                }
                return aVar2;
            }
        }
    }

    /* renamed from: a */
    private <T, S> Object m10327a(int i, T t, S s, String str, Type type, Annotation[] annotationArr, C12792q qVar) throws Exception {
        C18085o oVar = new C18085o();
        oVar.mo35019a("status_code", (Number) Integer.valueOf(i));
        oVar.mo35017a("data", C4161h.f11350b.mo9558a().mo34875a((Object) t));
        oVar.mo35017a("extra", C4161h.f11350b.mo9558a().mo34875a((Object) s));
        INetworkService iNetworkService = (INetworkService) C4116c.m10249a(INetworkService.class);
        StringBuilder sb = new StringBuilder("https://board.bytedance.net/api/json/");
        sb.append(str);
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new String(((C8815e) iNetworkService.post(sb.toString(), new ArrayList(), "application/json", C4161h.f11350b.mo9558a().mo34886a((C18082l) oVar).getBytes()).mo15805a()).f24066e).getBytes(Charset.forName("UTF-8")));
        return m10331e(type, annotationArr, qVar).mo9557a(new TypedInput() {
            /* renamed from: in */
            public final InputStream mo9554in() {
                return byteArrayInputStream;
            }

            public final String mimeType() {
                return "application/json";
            }

            public final long length() throws IOException {
                return (long) byteArrayInputStream.available();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo9553a(Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, C12792q qVar, TypedInput typedInput) throws IOException {
        C4175b bVar;
        C4172a b;
        Class cls2 = cls;
        if (!TextUtils.equals(typedInput.mimeType(), "application/x-protobuf")) {
            return m10331e(type, annotationArr, qVar).mo9557a(typedInput);
        }
        InputStream in = typedInput.mo9554in();
        C2895g gVar = (C2895g) this.f11337a.get();
        if (gVar == null) {
            gVar = new C2895g();
            this.f11337a.set(gVar);
        }
        gVar.mo7515a(C2890d.m8203a(in));
        C4174b bVar2 = new C4174b();
        long a = gVar.mo7514a();
        while (true) {
            int b2 = gVar.mo7517b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        C4173a aVar = new C4173a();
                        long a2 = gVar.mo7514a();
                        while (true) {
                            int b3 = gVar.mo7517b();
                            if (b3 != -1) {
                                switch (b3) {
                                    case 1:
                                        aVar.f11368a = (int) C2896h.m8232c(gVar);
                                        break;
                                    case 2:
                                        aVar.f11369b = C2896h.m8234e(gVar);
                                        break;
                                    case 3:
                                        aVar.f11370c = C2896h.m8234e(gVar);
                                        break;
                                    case 4:
                                        aVar.f11371d = C2896h.m8234e(gVar);
                                        break;
                                    case 5:
                                        aVar.f11372e = C2896h.m8232c(gVar);
                                        break;
                                    default:
                                        C2896h.m8236g(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (aVar.f11368a == -1) {
                                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                                } else if (aVar.f11372e != -1) {
                                    bVar2.f11373a = aVar;
                                    break;
                                } else {
                                    throw new IOException("Invalid protobuf data: missing header.now!");
                                }
                            }
                        }
                    case 2:
                        bVar2.f11374b = C2896h.m8235f(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                if (bVar2.f11373a == null || (bVar2.f11373a.f11368a == 0 && bVar2.f11374b == null)) {
                    throw new IOException("Invalid protobuf data: response.body is null!");
                }
                gVar.mo7515a(C2890d.m8204a(bVar2.f11374b));
                C4172a aVar2 = null;
                if (cls2 == C4177d.class) {
                    try {
                        bVar = m10326a(clsArr[0], gVar, bVar2.f11373a);
                    } catch (IOException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new IOException(e2);
                    }
                } else {
                    if (cls2 == C4176c.class) {
                        b = m10330b(clsArr[0], gVar, bVar2.f11373a);
                    } else if (cls2 == C4175b.class) {
                        bVar = m10325a(clsArr[0], clsArr[1], gVar, bVar2.f11373a);
                    } else {
                        b = m10329b(clsArr[0], clsArr[1], gVar, bVar2.f11373a);
                    }
                    aVar2 = b;
                    bVar = null;
                }
                if (bVar != null) {
                    if (!((Boolean) C4163i.f11354b.mo9431a()).booleanValue()) {
                        return bVar;
                    }
                    return m10327a(bVar.statusCode, bVar.data, (S) bVar.extra, str, type, annotationArr, qVar);
                } else if (!((Boolean) C4163i.f11354b.mo9431a()).booleanValue()) {
                    return aVar2;
                } else {
                    return m10327a(aVar2.f11364a, (T) aVar2.f11365b, (S) aVar2.f11366c, str, type, annotationArr, qVar);
                }
            }
        }
    }
}
