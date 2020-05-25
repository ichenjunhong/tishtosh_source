package com.google.android.play.core.p1051c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.c.az */
public abstract class C17277az extends C17274aw implements C17279ba {
    public C17277az() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33543a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo33511a((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 3:
                mo33512b((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
