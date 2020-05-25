package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.C16445b;
import com.google.android.gms.internal.auth-api.C16446c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.google.android.gms.auth.api.signin.internal.r */
public abstract class C15163r extends C16445b implements C15162q {
    public C15163r() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo27974a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case BaseNotice.HASHTAG /*101*/:
                mo27958a((GoogleSignInAccount) C16446c.m39309a(parcel, GoogleSignInAccount.CREATOR), (Status) C16446c.m39309a(parcel, Status.CREATOR));
                break;
            case 102:
                mo27959a((Status) C16446c.m39309a(parcel, Status.CREATOR));
                break;
            case 103:
                mo27960b((Status) C16446c.m39309a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
