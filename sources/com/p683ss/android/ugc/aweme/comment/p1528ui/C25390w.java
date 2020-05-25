package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.w */
final /* synthetic */ class C25390w implements C23505g {

    /* renamed from: a */
    private final C25367g f67165a;

    /* renamed from: b */
    private final C25265n f67166b;

    /* renamed from: c */
    private final Comment f67167c;

    C25390w(C25367g gVar, C25265n nVar, Comment comment) {
        this.f67165a = gVar;
        this.f67166b = nVar;
        this.f67167c = comment;
    }

    /* renamed from: a */
    public final void mo46280a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo46279a() {
        new Handler(Looper.getMainLooper()).postDelayed(new C25381n(this.f67165a, this.f67166b, this.f67167c), 500);
    }
}
