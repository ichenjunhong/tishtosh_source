package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C15167v();

    /* renamed from: a */
    public GoogleSignInOptions f39174a;

    /* renamed from: b */
    private final String f39175b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f39175b = C15464q.m32125a(str);
        this.f39174a = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f39175b, false);
        C15469b.m32183a(parcel, 5, (Parcelable) this.f39174a, i, false);
        C15469b.m32197c(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.f39175b.equals(signInConfiguration.f39175b) || (this.f39174a != null ? !this.f39174a.equals(signInConfiguration.f39174a) : signInConfiguration.f39174a != null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return new C15146a().mo27949a((Object) this.f39175b).mo27949a((Object) this.f39174a).f39184a;
    }
}
