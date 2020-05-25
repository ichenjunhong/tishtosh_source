package com.p683ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.opensdk.share.share.C38526a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Response;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.e */
public final class C38525e {

    /* renamed from: a */
    public Request f98005a;

    /* renamed from: b */
    private Activity f98006b;

    /* renamed from: c */
    private C26855c f98007c;

    public C38525e(Activity activity, C26855c cVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.mClientKey)) {
            this.f98006b = activity;
            this.f98005a = C38526a.m85864a(cVar.getShareRequestBundle());
            this.f98007c = cVar;
        }
    }

    /* renamed from: a */
    public final void mo78432a(Request request, Response response) {
        String str;
        String str2 = "share_error_status";
        C23089d a = C23089d.m56640a().mo47829a("launch_from", this.f98005a.mClientKey);
        String str3 = "style_id";
        if (this.f98005a.extras != null) {
            str = this.f98005a.extras.getString("style_id", "");
        } else {
            str = "";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("error_code", response.subErrorCode).f61491a);
        mo78434b(request, response);
    }

    /* renamed from: a */
    public final void mo78433a(String str, int i) {
        String str2;
        if (this.f98005a != null) {
            Response response = new Response();
            response.subErrorCode = i;
            response.errorCode = C38515a.m85850a(i);
            response.state = this.f98005a.mState;
            response.errorMsg = str;
            String str3 = "share_error_status";
            C23089d a = C23089d.m56640a().mo47829a("launch_from", this.f98005a.mClientKey);
            String str4 = "style_id";
            if (this.f98005a.extras != null) {
                str2 = this.f98005a.extras.getString("style_id", "");
            } else {
                str2 = "";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47826a("error_code", i).f61491a);
            mo78434b(this.f98005a, response);
        }
    }

    /* renamed from: b */
    public final boolean mo78434b(Request request, Response response) {
        if (request == null) {
            return false;
        }
        String callerPackage = request.getCallerPackage();
        String str = request.callerLocalEntry;
        if (TextUtils.isEmpty(callerPackage) || response == null || this.f98006b == null || TextUtils.isEmpty(str) || !response.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        response.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, str));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            this.f98006b.startActivity(intent);
            this.f98006b.finish();
            return true;
        } catch (Exception unused) {
            this.f98006b.finish();
            return false;
        }
    }
}
