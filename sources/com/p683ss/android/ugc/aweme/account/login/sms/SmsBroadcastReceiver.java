package com.p683ss.android.ugc.aweme.account.login.sms;

import android.arch.lifecycle.C0198r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.SmsBroadcastReceiver */
public class SmsBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private Context f58214a;

    /* renamed from: b */
    private C0198r<String> f58215b;

    /* renamed from: b */
    public final void mo45636b() {
        try {
            this.f58214a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo45635a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        try {
            this.f58214a.registerReceiver(this, intentFilter);
        } catch (Exception unused) {
        }
    }

    public SmsBroadcastReceiver(Context context, C0198r<String> rVar) {
        this.f58214a = context;
        this.f58215b = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            java.lang.String r0 = r6.getAction()
            boolean r5 = android.text.TextUtils.equals(r5, r0)
            if (r5 == 0) goto L_0x007b
            android.os.Bundle r5 = r6.getExtras()
            r6 = 0
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.String r2 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
            java.lang.Object r2 = r5.get(r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            if (r2 == 0) goto L_0x0055
            int r6 = r2.f39272g
            if (r6 == 0) goto L_0x0024
            goto L_0x004d
        L_0x0024:
            java.lang.String r6 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "[0-9]{4,}"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x004d
            java.lang.String r5 = r5.group(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x004d
            android.arch.lifecycle.r<java.lang.String> r6 = r4.f58215b
            r6.setValue(r5)
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            int r6 = r2.f39272g
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            android.content.Context r2 = r4.f58214a
            boolean r2 = com.p683ss.android.ugc.aweme.account.util.C22276p.m55133a(r2)
            android.content.Context r3 = r4.f58214a
            int r3 = com.p683ss.android.ugc.aweme.account.utils.C22299f.m55186b(r3)
            if (r5 == 0) goto L_0x006a
            java.lang.String r5 = ""
            m54086a(r0, r5, r2, r3)
            return
        L_0x006a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to get SMS data from Broadcast Receiver, status code = "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            m54086a(r1, r5, r2, r3)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.sms.SmsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    private static void m54086a(boolean z, String str, boolean z2, int i) {
        C20994a.m53368b(z, str, z2, i);
        C22087a.m54863a(z, str, z2, i);
        C26890h.m65011a("sms_auto_fill", new C20856a().mo44774a("is_successful", z ? 1 : 0).mo44776a("error_desc", str).mo44774a("has_sim_card", z2 ? 1 : 0).mo44774a("google_availability", i).f56798a);
    }
}
