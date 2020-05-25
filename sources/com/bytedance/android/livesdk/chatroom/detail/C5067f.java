package com.bytedance.android.livesdk.chatroom.detail;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.f */
public final class C5067f {

    /* renamed from: a */
    public WeakReference<View> f13559a = new WeakReference<>(null);

    /* renamed from: b */
    public int f13560b;

    /* renamed from: c */
    public boolean f13561c;

    /* renamed from: d */
    public int f13562d = 1;

    /* renamed from: b */
    private View m11577b() {
        return (View) this.f13559a.get();
    }

    /* renamed from: a */
    public final void mo10942a() {
        int i;
        View b = m11577b();
        if (b != null) {
            if (!this.f13561c || this.f13562d != 1) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
            LayoutParams layoutParams = b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f13560b;
            }
        }
    }

    /* renamed from: a */
    public final void mo10943a(boolean z) {
        this.f13561c = z;
        mo10942a();
    }
}
