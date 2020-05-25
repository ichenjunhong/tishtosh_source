package com.bytedance.android.livesdk.gift.dialog.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.e */
final /* synthetic */ class C7263e implements OnClickListener {

    /* renamed from: a */
    private final C7250c f19751a;

    /* renamed from: b */
    private final C7248a f19752b;

    C7263e(C7250c cVar, C7248a aVar) {
        this.f19751a = cVar;
        this.f19752b = aVar;
    }

    public final void onClick(View view) {
        C7250c cVar = this.f19751a;
        int i = this.f19752b.f19701b;
        if (i != LiveGiftBottomWidget.this.f19689e) {
            LiveGiftBottomWidget.this.f19688d.mo13536a(new C7289a(5, Integer.valueOf(i)));
        }
    }
}
