package com.bytedance.android.livesdk.gift.effect.doodle;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.n */
public final /* synthetic */ class C7362n implements OnClickListener {

    /* renamed from: a */
    private final C7361m f20077a;

    /* renamed from: b */
    private final C7495f f20078b;

    public C7362n(C7361m mVar, C7495f fVar) {
        this.f20077a = mVar;
        this.f20078b = fVar;
    }

    public final void onClick(View view) {
        C7361m mVar = this.f20077a;
        C7495f fVar = this.f20078b;
        if (mVar.f20075f != null) {
            mVar.f20075f.mo13613a(mVar, fVar);
        }
    }
}
