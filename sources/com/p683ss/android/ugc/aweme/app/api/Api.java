package com.p683ss.android.ugc.aweme.app.api;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.C23454a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23456b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23458d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.Api */
public final class Api {

    /* renamed from: a */
    public static final String f61281a = C11010c.m22282b().f29547a;

    /* renamed from: b */
    public static final String f61282b;

    /* renamed from: c */
    public static final String f61283c;

    /* renamed from: d */
    public static final String f61284d;

    /* renamed from: e */
    public static final String f61285e;

    /* renamed from: f */
    public static final String f61286f;

    /* renamed from: g */
    private static NetApi f61287g;

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$NetApi */
    interface NetApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str, @C12710l List<C12685b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$a */
    static class C22958a<T> implements C22960c<List<T>> {

        /* renamed from: a */
        public Class<T> f61288a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<T> mo47744a(Object obj) throws Exception {
            if (obj instanceof JSONArray) {
                try {
                    return JSON.parseArray(obj.toString(), this.f61288a);
                } catch (Throwable th) {
                    throw new C23457c(th);
                }
            } else {
                throw new C23458d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$b */
    public static class C22959b<T> implements C22960c<T> {

        /* renamed from: b */
        static final C17971f f61289b;

        /* renamed from: a */
        Class<T> f61290a;

        static {
            C17978g createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.mo34894a((C18097x) new MusicTypeAdapterFactory());
            createAdapterGsonBuilder.mo34894a((C18097x) new UserTypeAdapterFactory());
            f61289b = createAdapterGsonBuilder.mo34900d();
        }

        public C22959b(Class<T> cls) {
            this.f61290a = cls;
        }

        /* renamed from: a */
        public final T mo47744a(Object obj) throws Exception {
            BaseResponse.class.isAssignableFrom(this.f61290a);
            try {
                T a = f61289b.mo34884a(obj.toString(), this.f61290a);
                if (!(a instanceof BaseResponse)) {
                    return a;
                }
                try {
                    return ((BaseResponse) a).checkValid();
                } catch (C23459a e) {
                    throw e;
                } catch (Throwable th) {
                    throw new C23454a(-1, th);
                }
            } catch (Throwable th2) {
                throw new C23457c(th2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$c */
    public interface C22960c<T> {
        /* renamed from: a */
        T mo47744a(Object obj) throws Exception;
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.Api$d */
    public static class C22961d implements C22960c<String> {

        /* renamed from: a */
        static final C22961d f61291a = new C22961d();

        private C22961d() {
        }

        /* renamed from: a */
        public static C22961d m56475a() {
            return f61291a;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo47744a(Object obj) throws Exception {
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f61281a);
        f61282b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f61282b);
        sb2.append("/aweme/v1/upload/image/");
        f61283c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f61282b);
        sb3.append("/aweme/v1/upload/image/");
        f61284d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f61282b);
        sb4.append("/aweme/v1/weibo/bind/");
        f61285e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f61282b);
        sb5.append("/aweme/v1/friend/register/notice/");
        f61286f = sb5.toString();
    }

    /* renamed from: a */
    public static boolean m56470a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
                return true;
            }
            if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
                return true;
            }
            if (jSONObject.has("message") && TextUtils.equals("success", jSONObject.optString("message"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m56468a(String str, String str2) throws Exception {
        if (!C9431p.m18664a(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (!m56470a(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        throw new C23459a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
                    }
                }
                C23459a url = new C23459a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
                url.setBlockCode(jSONObject.optInt("block_code"));
                throw url;
            }
            return;
        }
        throw new C23456b();
    }

    /* renamed from: a */
    public static void m56469a(JSONObject jSONObject, String str, String str2) throws Exception {
        if (C9431p.m18664a(str)) {
            throw new C23456b();
        } else if (!m56470a(jSONObject)) {
            if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    throw new C23459a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str2);
                }
            }
            C23459a url = new C23459a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str2);
            url.setBlockCode(jSONObject.optInt("block_code"));
            throw url;
        }
    }

    /* renamed from: a */
    public static <T> T m56467a(String str, C22960c<T> cVar, String str2, String str3) throws Exception {
        if (cVar == null) {
            throw new IllegalArgumentException("Parser can't be null");
        } else if (!C9431p.m18664a(str)) {
            T jSONObject = new JSONObject(str);
            if (!m56470a(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                        throw new C23459a(optJSONObject.optInt("error_code")).setErrorMsg(optJSONObject.optString("description", "")).setResponse(str).setUrl(str3);
                    }
                }
                C23459a url = new C23459a(jSONObject.optInt("status_code")).setErrorMsg(jSONObject.optString("message", "")).setErrorMsg(jSONObject.optString("status_msg", "")).setPrompt(jSONObject.optString("prompts", "")).setResponse(str).setUrl(str3);
                url.setBlockCode(jSONObject.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw url;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return cVar.mo47744a(jSONObject.opt(str2));
                }
                if ((cVar instanceof C22959b) && ((C22959b) cVar).f61290a == null) {
                    return jSONObject;
                }
                if (!(cVar instanceof C22958a) || ((C22958a) cVar).f61288a != null) {
                    return cVar.mo47744a(str);
                }
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new C23456b();
        }
    }

    /* renamed from: a */
    public static <T> T m56465a(int i, String str, Class<T> cls, String str2, C19181f fVar) throws Exception {
        if (String.class.equals(cls)) {
            return m56464a(i, str, (C22960c<T>) C22961d.m56475a(), str2, fVar);
        }
        return m56464a(i, str, (C22960c<T>) new C22959b<T>(cls), str2, fVar);
    }

    /* renamed from: a */
    public static <T> T m56466a(String str, int i, String str2, C22960c<T> cVar, String str3) throws Exception {
        if (C22962a.m56477a(C11010c.m22280a())) {
            return m56467a(NetworkUtils.postFile(i, str, "file", str2), cVar, str3, str);
        }
        throw new IOException();
    }

    /* renamed from: a */
    private static <T> T m56464a(int i, String str, C22960c<T> cVar, String str2, C19181f fVar) throws Exception {
        C19170a[] aVarArr;
        if (C22962a.m56477a(C11010c.m22280a()) || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (f61287g == null) {
                f61287g = (NetApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (fVar != null) {
                for (C19170a aVar : (C19170a[]) fVar.f52878a.toArray(new C19170a[fVar.f52878a.size()])) {
                    arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
                }
            }
            try {
                return m56467a((String) f61287g.doGet(str, arrayList).get(), cVar, str2, str);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }
}
