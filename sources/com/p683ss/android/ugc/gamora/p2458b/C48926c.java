package com.p683ss.android.ugc.gamora.p2458b;

import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: com.ss.android.ugc.gamora.b.c */
public final class C48926c {

    /* renamed from: a */
    private final C0210y f123100a;

    /* renamed from: a */
    public final <T extends JediViewModel> T mo96760a(Class<T> cls) {
        if (cls.getCanonicalName() != null) {
            return m105734a(cls.getName(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C48926c(C0159aa aaVar, C0212b bVar) {
        this.f123100a = new C0210y(aaVar, bVar);
    }

    /* renamed from: a */
    private <T extends JediViewModel> T m105734a(String str, Class<T> cls) {
        return (JediViewModel) this.f123100a.mo360a(str, cls);
    }
}
