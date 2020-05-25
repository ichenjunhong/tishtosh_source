package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.qq */
public class C16191qq {
    /* renamed from: a */
    public static C16186ql m38684a(String str) throws RemoteException {
        try {
            return new C16192qr((aoh) Class.forName(str, false, C16191qq.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
