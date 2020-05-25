package com.bytedance.android.livesdk.chatroom.p307c;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5040a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.e */
public final class C5044e {

    /* renamed from: a */
    Set<C5038d> f13503a = new HashSet();

    /* renamed from: b */
    private View f13504b;

    /* renamed from: c */
    private DataCenter f13505c;

    /* renamed from: a */
    public final void mo10906a() {
        for (C5038d dVar : this.f13503a) {
            dVar.f13490a.removeObserver(dVar);
            dVar.f13492c.clear();
        }
        this.f13503a.clear();
    }

    /* renamed from: a */
    public final <V extends View> C5040a<V> mo10905a(int i) {
        if (this.f13504b != null) {
            return new C5040a<>(this.f13505c, this.f13504b.findViewById(i), this);
        }
        throw new IllegalStateException("Unable to find view by id due to null root view.");
    }

    public C5044e(DataCenter dataCenter, View view) {
        this.f13505c = dataCenter;
        this.f13504b = view;
    }
}
