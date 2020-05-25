package com.bytedance.android.livesdk.commonpop;

import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class CommonPopupMessageWidget extends LiveRecyclableWidget implements C6715b {

    /* renamed from: a */
    private C6714a f18301a;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public void onUnload() {
        this.f18301a.mo8247a();
    }

    public void onInit(Object[] objArr) {
        this.f18301a = new C6714a();
    }

    public void onLoad(Object[] objArr) {
        this.f18301a.mo8520a((C6715b) this);
    }

    /* renamed from: a */
    public final void mo12831a(String str) {
        C4514j.m10883j().mo10328i().handle(getContext(), str);
    }
}
