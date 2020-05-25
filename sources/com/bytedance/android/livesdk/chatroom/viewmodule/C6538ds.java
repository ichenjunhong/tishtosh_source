package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.p421v.C8374c.C8375a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ds */
final /* synthetic */ class C6538ds implements C8375a {

    /* renamed from: a */
    private final C6323a f17863a;

    /* renamed from: b */
    private final View f17864b;

    C6538ds(C6323a aVar, View view) {
        this.f17863a = aVar;
        this.f17864b = view;
    }

    /* renamed from: a */
    public final void mo12637a(View view, C8374c cVar) {
        view.setOnClickListener(new C6541dv(this.f17863a, cVar, this.f17864b));
    }
}
