package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.utils.C47865ew.C47867a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.SecUidDependServiceImpl */
public final class SecUidDependServiceImpl implements ISecUidDependService {
    public static ISecUidDependService createISecUidDependServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ISecUidDependService.class);
        if (a != null) {
            return (ISecUidDependService) a;
        }
        if (C27991b.f73464aU == null) {
            synchronized (ISecUidDependService.class) {
                if (C27991b.f73464aU == null) {
                    C27991b.f73464aU = new SecUidDependServiceImpl();
                }
            }
        }
        return (SecUidDependServiceImpl) C27991b.f73464aU;
    }

    public final void checkLarkEmail(String str, C47867a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "callback");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && aVar != null) {
            aVar.mo95085b();
        }
        C0013i.m16a((Callable<TResult>) new C47772a<TResult>(str)).mo20a((C0011g<TResult, TContinuationResult>) new C47773b<TResult,TContinuationResult>(aVar), C0013i.f25b);
    }

    public final void reportToChat(String str, String str2, String str3, String str4, String str5, String str6) {
        C47771cl clVar = C47771cl.f120290a;
        C52711k.m112236a((Object) C47955u.m103766a(), "BoeUtils.inst()");
        boolean b = C41623i.m91496b();
        int j = C11010c.m22289j();
        String o = C11010c.m22294o();
        String c = C19034d.m46323c();
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        String str7 = C11010c.f29568q;
        String str8 = C11010c.f29569r;
        StringBuilder sb = new StringBuilder("AppID:");
        sb.append(j);
        sb.append(" Version:");
        sb.append(o);
        sb.append(" BoeEnv:");
        sb.append(b);
        sb.append("\n\nDID:");
        sb.append(c);
        sb.append(" UID:");
        sb.append(curUserId);
        sb.append(10);
        sb.append("GitUsername:");
        sb.append(str7);
        sb.append(" GitUserEmail:");
        sb.append(str8);
        sb.append("\n\nPath:");
        sb.append(str2);
        sb.append("\n\nPages:\n");
        sb.append(str3);
        sb.append("\n\nBacktrace:\n");
        sb.append(str4);
        String sb2 = sb.toString();
        if (C47891fl.m103593a(str5)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("\n\nErrorReason:\n");
            sb3.append(str5);
            sb2 = sb3.toString();
        }
        if (C47891fl.m103593a(str6)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("\n\nRecentJSUrl:\n");
            sb4.append(str6);
            sb2 = sb4.toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", "oc_885554e5880dd761e6e56c99b47def40");
        C47771cl.m103401a(jSONObject, "from_email", str);
        C47771cl.m103401a(jSONObject, "to_email", "river.li");
        C47771cl.m103401a(jSONObject, "msg_title", "SecUid异常问题反馈");
        C47771cl.m103401a(jSONObject, "msg", sb2);
        int j2 = C11010c.m22289j();
        String o2 = C11010c.m22294o();
        jSONObject.put("app_id", j2);
        jSONObject.put("version_name", o2);
        String c2 = C19034d.m46323c();
        IAccountUserService g2 = C20854a.m53167g();
        C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
        String curUserId2 = g2.getCurUserId();
        jSONObject.put("device_id", c2);
        jSONObject.put("user_id", curUserId2);
        C0013i.m16a((Callable<TResult>) new C47774c<TResult>("https://awemelark.bytedance.com/api/invoke/reportProblemToChat", jSONObject));
    }
}
