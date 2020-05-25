package com.p683ss.android.ugc.aweme.account.agegate.model;

import android.content.SharedPreferences.Editor;
import android.os.Message;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22268j;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.a */
public final class C20887a extends C26832a<AgeGateResponse> {

    /* renamed from: a */
    private static final String f56857a;

    /* renamed from: b */
    private int f56858b;

    /* renamed from: c */
    private int f56859c;

    /* renamed from: d */
    private int f56860d;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v3/verification/age/");
        f56857a = sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo44828b() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f56858b);
        if (this.f56859c < 10) {
            StringBuilder sb = new StringBuilder("0");
            sb.append(this.f56859c);
            str = sb.toString();
        } else {
            str = String.valueOf(this.f56859c);
        }
        if (this.f56860d < 10) {
            StringBuilder sb2 = new StringBuilder("0");
            sb2.append(this.f56860d);
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(this.f56860d);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(valueOf);
        sb3.append("-");
        sb3.append(str);
        sb3.append("-");
        sb3.append(str2);
        return sb3.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo44827a() {
        if (this.mData != null && ((AgeGateResponse) this.mData).getStatus_code() == 0 && ((AgeGateResponse) this.mData).getAgeGatePostAction() == 0 && ((AgeGateResponse) this.mData).getRegisterAgeGatePostAction() == 0) {
            return true;
        }
        return false;
    }

    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public final boolean sendRequest(Object... objArr) {
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            String valueOf = String.valueOf(objArr[0]);
            boolean z = true;
            if (C23826bi.m58449a().isLogin() && (objArr.length <= 1 || !objArr[1].booleanValue())) {
                z = false;
            }
            if (!z) {
                C0013i.m16a((Callable<TResult>) new C20888b<TResult>(this, valueOf)).mo29c(new C20889c(this)).mo30c(new C20890d(this), C0013i.f25b).mo19a((C0011g<TResult, TContinuationResult>) new C22268j<TResult,TContinuationResult>(this.mHandler, 0));
            } else {
                C0013i.m16a((Callable<TResult>) new C20891e<TResult>(this, valueOf)).mo19a((C0011g<TResult, TContinuationResult>) new C22268j<TResult,TContinuationResult>(this.mHandler, 0));
            }
        }
        return sendRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(AgeGateResponse ageGateResponse) {
        super.handleData(ageGateResponse);
        C22282t.m55151f().edit().putInt("ftc_age_gate_response_mode", ageGateResponse.getAgeGatePostAction()).apply();
        C22282t.m55151f().edit().putBoolean("ftc_age_gate_response_prompt", ageGateResponse.is_prompt()).apply();
        ((C22475af) C23826bi.m58450a(C22475af.class)).mo46772a(ageGateResponse.getAgeGatePostAction(), ageGateResponse.getRegisterAgeGatePostAction());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ User mo44825a(C0013i iVar) throws Exception {
        String str;
        if (!C47957v.m103770a(iVar)) {
            return null;
        }
        handleData((AgeGateResponse) iVar.mo34e());
        if (((AgeGateResponse) iVar.mo34e()).getStatus_code() == 0) {
            User queryUser = C23826bi.m58449a().queryUser(((C36679a) C23826bi.m58450a(C36679a.class)).mo47860a(), false);
            if (((AgeGateResponse) iVar.mo34e()).getAgeGatePostAction() == 0) {
                queryUser.setUserMode(1);
            } else {
                queryUser.setUserMode(2);
            }
            String uid = queryUser.getUid();
            int userMode = queryUser.getUserMode();
            Editor edit = C35807d.m80935a(C20842a.f56783a, "aweme_user", 0).edit();
            StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
            sb.append(uid);
            edit.putInt(sb.toString(), userMode).apply();
            m53211a(0, -1);
            return queryUser;
        }
        m53211a(1, ((AgeGateResponse) iVar.mo34e()).getStatus_code());
        int status_code = ((AgeGateResponse) iVar.mo34e()).getStatus_code();
        Integer valueOf = Integer.valueOf(status_code);
        if (((AgeGateResponse) iVar.mo34e()).getStatus_msg() != null) {
            str = ((AgeGateResponse) iVar.mo34e()).getStatus_msg();
        } else {
            str = "";
        }
        throw new C23459a(status_code).setErrorMsg(C22275o.m55131a(valueOf, str));
    }

    /* renamed from: a */
    private static void m53211a(int i, int i2) {
        C23088c a = C23088c.m56631a();
        a.mo47822a("status", Integer.valueOf(i)).mo47824a("type", "/aweme/v3/verification/age/");
        if (i == 1) {
            a.mo47822a("error_message", Integer.valueOf(i2));
        }
        C22089b.m54869a("compliance_api_status", "", a.mo47825b());
    }

    /* renamed from: a */
    static AgeGateResponse m53210a(String str, boolean z) throws Exception {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(C12998a.f34022a);
        sb.append(f56857a);
        String sb2 = sb.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("birthday", str);
        String str2 = "session_registered";
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        hashMap.put(str2, String.valueOf(i));
        return (AgeGateResponse) new C17971f().mo34884a(NetworkProxyAccount.f59579c.mo46188a(Integer.MAX_VALUE, sb2, (Map<String, String>) hashMap), AgeGateResponse.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44826a(int i, int i2, int i3) {
        this.f56858b = i;
        this.f56859c = i2;
        this.f56860d = i3;
    }
}
