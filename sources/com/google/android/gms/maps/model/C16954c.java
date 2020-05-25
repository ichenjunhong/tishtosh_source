package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1045f.C16498h;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C16954c {

    /* renamed from: a */
    private final C16498h f47844a;

    public C16954c(C16498h hVar) {
        this.f47844a = (C16498h) C15464q.m32123a(hVar);
    }

    /* renamed from: a */
    public final void mo32746a() {
        try {
            this.f47844a.mo31706M_();
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: b */
    public final void mo32747b() {
        try {
            this.f47844a.mo31708b();
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16954c)) {
            return false;
        }
        try {
            return this.f47844a.mo31707a(((C16954c) obj).f47844a);
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f47844a.mo31709c();
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }
}
