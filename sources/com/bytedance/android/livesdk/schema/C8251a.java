package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.browser.C4672a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.schema.a */
public final class C8251a implements C8252b {

    /* renamed from: a */
    private IHostAction f22567a;

    public C8251a(IHostAction iHostAction) {
        this.f22567a = iHostAction;
    }

    /* renamed from: a */
    public final boolean mo14431a(String str) {
        return this.f22567a.tryShowKoiRedPackageInLive(str);
    }

    /* renamed from: a */
    public final void mo14425a(long j, Map<String, String> map) {
        this.f22567a.openUserProfilePage(j, map);
    }

    /* renamed from: a */
    public final void mo14426a(String str, Context context) {
        this.f22567a.openFeedBack(str, context);
    }

    /* renamed from: b */
    public final void mo14432b(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        this.f22567a.openSignActivity(context, intent);
    }

    /* renamed from: a */
    public final void mo14428a(String str, String str2) {
        this.f22567a.openVideoDetailPage(str, str2);
    }

    /* renamed from: a */
    public final boolean mo14429a(Context context, String str) {
        return this.f22567a.handleSchema(context, str, new Bundle());
    }

    /* renamed from: a */
    public final void mo14427a(String str, Bundle bundle, Context context) {
        this.f22567a.openLiveBrowser(str, bundle, context);
        C4672a.m11155a(str);
    }

    /* renamed from: a */
    public final boolean mo14430a(Context context, String str, Bundle bundle) {
        return this.f22567a.handleSchema(context, str, bundle);
    }
}
