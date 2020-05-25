package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.b */
public final class C11978b {

    /* renamed from: a */
    public final List<Boolean> f31695a = new ArrayList();

    /* renamed from: a */
    public final void mo22717a() {
        if (this.f31695a.size() != 0) {
            this.f31695a.clear();
        }
    }

    /* renamed from: b */
    private final void m24376b(int i) {
        this.f31695a.add(i, Boolean.valueOf(false));
    }

    /* renamed from: a */
    private final void m24375a(int i) {
        if (i < this.f31695a.size()) {
            this.f31695a.set(i, Boolean.valueOf(true));
        } else {
            this.f31695a.add(i, Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo22718a(int i, boolean z) {
        if (i >= 0 && i <= this.f31695a.size()) {
            if (z) {
                m24375a(i);
            } else {
                m24376b(i);
            }
        }
    }
}
