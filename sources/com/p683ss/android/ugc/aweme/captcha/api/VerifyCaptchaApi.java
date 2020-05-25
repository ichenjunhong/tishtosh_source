package com.p683ss.android.ugc.aweme.captcha.api;

import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.bytedance.retrofit2.p831b.C12718t;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.captcha.p1489a.C24486c;
import com.p683ss.android.ugc.aweme.captcha.p1489a.C24489e;
import com.p683ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi */
public final class VerifyCaptchaApi {

    /* renamed from: a */
    private static VerifyApi f64893a;

    /* renamed from: com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi$VerifyApi */
    interface VerifyApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);

        @C12706h
        C17832m<String> doGet(@C12699af String str, @C12710l List<C12685b> list);

        @C12718t
        @C12705g
        C17832m<String> doPost(@C12699af String str, @C12704f Map<String, String> map);
    }

    /* renamed from: a */
    public static C24486c m59877a(Boolean bool) throws Exception {
        C18922i iVar = new C18922i("https://api.tiktokv.com/ies/antispam/verification_code/get_pic_code/");
        iVar.mo38778a("refresh", String.valueOf(bool));
        if (C24492a.m59880a(C11010c.m22280a())) {
            if (f64893a == null) {
                f64893a = (VerifyApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(VerifyApi.class);
            }
            try {
                return (C24486c) m59879a((String) f64893a.doGet(iVar.toString()).get(), iVar.toString(), C24486c.class);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static C24489e m59878a(String str) throws Exception {
        ArrayList<C19180e> arrayList = new ArrayList<>();
        arrayList.add(new C19180e("verify_info", str));
        if (C24492a.m59880a(C11010c.m22280a())) {
            if (f64893a == null) {
                f64893a = (VerifyApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(VerifyApi.class);
            }
            HashMap hashMap = new HashMap();
            if (!C23715d.m58202a((Collection<T>) arrayList)) {
                for (C19180e eVar : arrayList) {
                    hashMap.put(eVar.mo39131a(), eVar.mo39132b());
                }
            }
            try {
                return (C24489e) m59879a((String) f64893a.doPost("https://api.tiktokv.com/ies/antispam/verification_code/verify_pic_code/", hashMap).get(), "https://api.tiktokv.com/ies/antispam/verification_code/verify_pic_code/", C24489e.class);
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        } else {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static <T> T m59879a(String str, String str2, Class<T> cls) throws JSONException {
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (Api.m56470a(jSONObject)) {
            return JSON.parseObject(jSONObject2.toString(), cls);
        }
        ApiMonitorService.Companion.getInstance().apiMonitor(str2, "", str);
        C23459a aVar = new C23459a(jSONObject.optInt("status_code"));
        if (jSONObject2 != null) {
            str3 = jSONObject2.optString("message", "");
        } else {
            str3 = "";
        }
        C23459a errorMsg = aVar.setErrorMsg(str3).setErrorMsg(jSONObject.optString("status_msg", ""));
        if (jSONObject2 != null) {
            str4 = jSONObject2.optString("prompts", "");
        } else {
            str4 = "";
        }
        throw errorMsg.setPrompt(str4).setUrl(str2);
    }
}
