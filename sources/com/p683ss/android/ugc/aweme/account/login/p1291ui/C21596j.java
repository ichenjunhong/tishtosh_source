package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.C2240a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36703x;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.j */
final /* synthetic */ class C21596j implements OnClickListener {

    /* renamed from: a */
    static final OnClickListener f58568a = new C21596j();

    private C21596j() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a((Context) C23826bi.m58460b(), C2240a.m6772a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
    }
}
