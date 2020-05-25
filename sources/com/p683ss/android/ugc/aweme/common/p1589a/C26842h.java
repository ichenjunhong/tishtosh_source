package com.p683ss.android.ugc.aweme.common.p1589a;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.common.a.h */
public abstract class C26842h<T> extends C26840g<T> {

    /* renamed from: a */
    public boolean f70673a;

    /* renamed from: g */
    public final void mo54786g() {
        mo50303a(new ArrayList());
        mo54798c(true);
        ao_();
        notifyItemChanged(0);
    }

    public int getItemCount() {
        if (mo48636c() != 0 || !this.f70673a) {
            return super.getItemCount();
        }
        return 1;
    }
}
