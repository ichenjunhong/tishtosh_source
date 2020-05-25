package com.p683ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.google.gson.C17971f;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.agegate.model.SetEmailResponse;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.api.Api */
public class Api {
    public static C0013i<SetEmailResponse> emailForExportVideo(@C53089t(mo110619a = "email") String str) {
        return C0013i.m16a((Callable<TResult>) new C20883a<TResult>(str));
    }

    static final /* synthetic */ SetEmailResponse lambda$emailForExportVideo$0$Api(@C53089t(mo110619a = "email") String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(C12998a.f34022a);
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v1/ftc/user/email/");
        C18922i iVar = new C18922i(sb.toString());
        iVar.mo38778a("email", str);
        return (SetEmailResponse) new C17971f().mo34884a(NetworkUtils.executeGet(Integer.MAX_VALUE, iVar.toString()), SetEmailResponse.class);
    }
}
