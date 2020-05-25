package com.bytedance.android.livesdk.browser.p290d;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;

/* renamed from: com.bytedance.android.livesdk.browser.d.b */
final /* synthetic */ class C4714b implements OnClickListener {

    /* renamed from: a */
    private final C4712a f12837a;

    C4714b(C4712a aVar) {
        this.f12837a = aVar;
    }

    public final void onClick(View view) {
        C4712a aVar = this.f12837a;
        C8049c.m15979a().mo14203a("click_withdraw_popup", new C8059j().mo14214b("video").mo14218f("show").mo14213a(aVar.f12825f).mo14215c("popup").mo14219g("close"));
        aVar.dismiss();
    }
}
