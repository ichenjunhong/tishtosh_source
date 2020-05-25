package com.p683ss.android.ugc.aweme.base;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.base.c */
public final class C23479c {

    /* renamed from: a */
    public static final C23479c f62548a = new C23479c();

    /* renamed from: com.ss.android.ugc.aweme.base.c$a */
    public static final class C23480a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Intent f62549a;

        /* renamed from: b */
        final /* synthetic */ Context f62550b;

        /* renamed from: c */
        final /* synthetic */ View f62551c;

        /* renamed from: d */
        final /* synthetic */ Intent f62552d;

        public C23480a(Intent intent, Context context, View view, Intent intent2) {
            this.f62549a = intent;
            this.f62550b = context;
            this.f62551c = view;
            this.f62552d = intent2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62552d.putExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", true);
            this.f62552d.removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            this.f62550b.startActivity(this.f62549a);
        }
    }

    private C23479c() {
    }
}
