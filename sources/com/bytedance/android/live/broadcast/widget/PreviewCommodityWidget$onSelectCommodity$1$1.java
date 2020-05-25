package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.core.widget.C4104a;

public final class PreviewCommodityWidget$onSelectCommodity$1$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C3666f f10450a;

    /* renamed from: b */
    final /* synthetic */ C4104a f10451b;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$onSelectCommodity$1$1$a */
    static final class C3675a implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget$onSelectCommodity$1$1 f10452a;

        C3675a(PreviewCommodityWidget$onSelectCommodity$1$1 previewCommodityWidget$onSelectCommodity$1$1) {
            this.f10452a = previewCommodityWidget$onSelectCommodity$1$1;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f10452a.f10450a.f10440a.mo9050b();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        this.f10451b.getDialog().setOnDismissListener(new C3675a(this));
    }

    PreviewCommodityWidget$onSelectCommodity$1$1(C3666f fVar, C4104a aVar) {
        this.f10450a = fVar;
        this.f10451b = aVar;
    }
}
