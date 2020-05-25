package com.p683ss.android.ugc.aweme.requesttask.p2117b;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a.C41212a;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a.C41213b;
import com.p683ss.android.ugc.aweme.requestcombine.api.SettingCombineApi;
import com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41216a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.update.UpdateHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.requesttask.b.d */
public final class C41246d implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.P0;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = C41211a.f104655c.keySet();
        C52711k.m112236a((Object) keySet, "mColdLaunchRequests.keys");
        int i = 0;
        for (String str : keySet) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(str);
            i++;
        }
        C39054d a = C36272l.m81897a(C11010c.m22280a()).mo75072a();
        if (a != null) {
            obj = Double.valueOf(a.longitude);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        if (a != null) {
            obj2 = Double.valueOf(a.latitude);
        } else {
            obj2 = null;
        }
        String valueOf2 = String.valueOf(obj2);
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            obj3 = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        } else {
            obj3 = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("longitude", valueOf);
        hashMap.put("latitude", valueOf2);
        hashMap.put("has_local_cache", String.valueOf(obj3));
        Collection<C41216a> values = C41211a.f104655c.values();
        C52711k.m112236a((Object) values, "mColdLaunchRequests.values");
        for (C41216a a2 : values) {
            Map a3 = a2.mo83709a(context);
            if (a3 != null) {
                hashMap.putAll(a3);
            }
        }
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(SettingCombineApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…ngCombineApi::class.java)");
        ((SettingCombineApi) create).request(hashMap).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C41212a.f104657a).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C41213b<Object>(context));
        String s = UpdateHelper.m102908s();
        C52711k.m112236a((Object) s, "UpdateHelper.getCpuAbi()");
        if (C52830p.m112456b((CharSequence) s, (CharSequence) "arm64-v8a", false, 2, (Object) null)) {
            C26890h.m65011a("android_64_launch", C23089d.m56640a().mo47829a("is_cold_launch", "true").f61491a);
        }
    }
}
