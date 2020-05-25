package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.l */
final class C17928l {

    /* renamed from: a */
    final Messenger f49793a;

    /* renamed from: b */
    final zzl f49794b;

    C17928l(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f49793a = new Messenger(iBinder);
            this.f49794b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f49794b = new zzl(iBinder);
            this.f49793a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            throw new RemoteException();
        }
    }
}
