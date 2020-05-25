package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4056e;
import com.bytedance.android.live.core.rxutils.C4059g;
import com.bytedance.android.live.core.rxutils.autodispose.C3991a;
import com.bytedance.android.live.core.rxutils.autodispose.C4004ae;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.rxutils.autodispose.C4034m;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.ies.p619a.C10176b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cl */
public abstract class C5868cl<T extends C6463ay> extends C10176b<T> {

    /* renamed from: a */
    private C4059g f15365a;

    /* renamed from: s */
    protected DataCenter f15366s;

    /* renamed from: t */
    protected IMessageManager f15367t;

    /* access modifiers changed from: protected */
    /* renamed from: h_ */
    public String mo11708h_() {
        return getClass().getName();
    }

    /* renamed from: q */
    public final <D> C4034m<D> mo11752q() {
        return C4021e.m10136a((C0184k) mo8518c());
    }

    /* renamed from: a */
    public void mo8247a() {
        if ((this instanceof OnMessageListener) && this.f15367t != null) {
            this.f15367t.removeMessageListener((OnMessageListener) this);
        }
        this.f15366s = null;
        super.mo8247a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final <D> C4034m<D> mo11753r() {
        if (this.f15365a == null) {
            this.f15365a = new C4059g();
        }
        return C4021e.m10142a((C4004ae) C3991a.m10107a((C0184k) mo8518c(), C0177a.ON_DESTROY), (C4056e<T>) this.f15365a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final <D> C4034m<D> mo11754s() {
        if (this.f15365a == null) {
            this.f15365a = new C4059g();
        }
        return C4021e.m10142a((C4004ae) C3991a.m10107a((C0184k) ((C6463ay) mo8518c()).getContext(), C0177a.ON_DESTROY), (C4056e<T>) this.f15365a);
    }

    /* renamed from: c */
    public final void mo11751c(Throwable th) {
        C3831a.m9706a(6, mo11708h_(), th.getStackTrace());
    }

    /* renamed from: a */
    public void mo8520a(T t) {
        super.mo8520a(t);
        if (t != null) {
            this.f15366s = t.getDataCenter();
            if (this.f15366s != null) {
                this.f15367t = (IMessageManager) this.f15366s.get("data_message_manager");
            }
        }
    }
}
