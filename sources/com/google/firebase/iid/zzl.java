package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new C17904ao();

    /* renamed from: a */
    private Messenger f49829a;

    /* renamed from: b */
    private C17913ax f49830b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C17943a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m43846f();
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f49829a = new Messenger(iBinder);
        } else {
            this.f49830b = new C17914ay(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo34802a(Message message) throws RemoteException {
        if (this.f49829a != null) {
            this.f49829a.send(message);
        } else {
            this.f49830b.mo34756a(message);
        }
    }

    /* renamed from: a */
    private final IBinder m43983a() {
        return this.f49829a != null ? this.f49829a.getBinder() : this.f49830b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m43983a().equals(((zzl) obj).m43983a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m43983a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f49829a != null) {
            parcel.writeStrongBinder(this.f49829a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f49830b.asBinder());
        }
    }
}
