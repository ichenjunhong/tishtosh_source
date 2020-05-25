package com.bytedance.android.live.broadcast.p201c;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.p201c.C3150a.C3153b;

/* renamed from: com.bytedance.android.live.broadcast.c.f */
final /* synthetic */ class C3159f implements OnClickListener {

    /* renamed from: a */
    private final C3153b f9192a;

    /* renamed from: b */
    private final Game f9193b;

    C3159f(C3153b bVar, Game game) {
        this.f9192a = bVar;
        this.f9193b = game;
    }

    public final void onClick(View view) {
        C3153b bVar = this.f9192a;
        bVar.f9186b.mo8492a(this.f9193b);
    }
}
