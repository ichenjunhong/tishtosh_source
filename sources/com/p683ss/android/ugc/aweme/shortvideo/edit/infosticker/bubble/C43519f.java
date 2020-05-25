package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.os.Build.VERSION;
import android.view.View;
import com.bef.effectsdk.message.MessageCenter;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.f */
public final class C43519f implements C43526m {

    /* renamed from: a */
    private boolean f110087a;

    /* renamed from: b */
    private final C43514c f110088b;

    /* renamed from: m */
    public final void mo88573m() {
        if (this.f110087a) {
            if (VERSION.SDK_INT < 19) {
                View contentView = this.f110088b.getContentView();
                C52711k.m112236a((Object) contentView, "popupWindow.contentView");
                contentView.setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                View contentView2 = this.f110088b.getContentView();
                C52711k.m112236a((Object) contentView2, "popupWindow.contentView");
                contentView2.setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: d */
    public final void mo88565d(boolean z) {
        this.f110087a = z;
    }

    public C43519f(C43514c cVar) {
        C52711k.m112240b(cVar, "popupWindow");
        this.f110088b = cVar;
    }
}
