package com.bytedance.android.livesdk.honor;

import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.honor.C7659a.C7660a;
import com.bytedance.android.livesdk.message.model.C7819ax;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class HonorUpgradeNotifyWidget extends LiveRecyclableWidget implements C7660a {

    /* renamed from: a */
    private C7659a f21091a;

    /* renamed from: b */
    private C7661b f21092b;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        if (this.f21091a != null) {
            this.f21091a.mo8247a();
        }
    }

    /* renamed from: a */
    public final void mo14021a(C7819ax axVar) {
        this.f21092b.mo14024a(axVar);
    }

    public void onLoad(Object[] objArr) {
        this.f21091a = new C7659a();
        this.f21091a.mo8520a((C7660a) this);
        this.f21092b = new C7661b(getContext(), false, this.f21091a);
        if (this.containerView != null) {
            this.containerView.addView(this.f21092b, new LayoutParams(-1, -1));
        }
    }
}
