package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16480b;
import com.google.android.gms.internal.p1043d.C16481c;

/* renamed from: com.google.android.gms.common.internal.l */
public interface C15453l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class C15454a extends C16480b implements C15453l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a */
        public static class C15455a extends C16479a implements C15453l {
            C15455a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo28362a() throws RemoteException {
                Parcel a = mo31687a(2, mo31690c());
                Account account = (Account) C16481c.m39347a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C15453l m32109a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C15453l) {
                return (C15453l) queryLocalInterface;
            }
            return new C15455a(iBinder);
        }

        /* renamed from: a */
        public final boolean mo28389a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account a = mo28362a();
            parcel2.writeNoException();
            if (a == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                a.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }

    /* renamed from: a */
    Account mo28362a() throws RemoteException;
}
