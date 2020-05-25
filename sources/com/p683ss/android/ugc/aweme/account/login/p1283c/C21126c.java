package com.p683ss.android.ugc.aweme.account.login.p1283c;

import android.content.Context;
import android.os.Message;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.mobilelib.model.MobileStateModel;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.mobilelib.view.CommonView;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.c */
public abstract class C21126c extends CommonPresent {

    /* renamed from: b */
    protected final MobileStateModel f57397b = MobileStateModel.INSTANCE;

    /* renamed from: a */
    public abstract void mo45237a(String str, String str2, C13139p pVar);

    /* renamed from: b */
    public abstract void mo45238b(String str, String str2, C13139p pVar);

    public void destroy() {
        super.destroy();
        this.f57397b.setRetryTime(-1);
        this.f57397b.setLastSendTime(0);
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C21126c(Context context, CommonView commonView) {
        super(context, commonView);
    }
}
