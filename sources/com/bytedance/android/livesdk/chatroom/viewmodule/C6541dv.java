package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p421v.C8374c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dv */
final /* synthetic */ class C6541dv implements OnClickListener {

    /* renamed from: a */
    private final C6323a f17867a;

    /* renamed from: b */
    private final C8374c f17868b;

    /* renamed from: c */
    private final View f17869c;

    C6541dv(C6323a aVar, C8374c cVar, View view) {
        this.f17867a = aVar;
        this.f17868b = cVar;
        this.f17869c = view;
    }

    public final void onClick(View view) {
        C6323a aVar = this.f17867a;
        C8374c cVar = this.f17868b;
        View view2 = this.f17869c;
        cVar.dismiss();
        aVar.onClick(view2);
    }
}
