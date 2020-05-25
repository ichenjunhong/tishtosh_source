package com.bytedance.android.livesdk.chatroom.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.C5174at;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.h */
final /* synthetic */ class C6677h implements OnClickListener {

    /* renamed from: a */
    private final C8719s f18224a;

    C6677h(C8719s sVar) {
        this.f18224a = sVar;
    }

    public final void onClick(View view) {
        C8719s sVar = this.f18224a;
        if (!TextUtils.isEmpty(sVar.f23933e)) {
            C4495a.m10823a().mo10301a((Object) new C5174at(sVar.f23933e, true));
        }
    }
}
