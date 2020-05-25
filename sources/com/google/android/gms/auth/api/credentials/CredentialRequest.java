package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C15118a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new C15124e();

    /* renamed from: a */
    public final boolean f39070a;

    /* renamed from: b */
    public final String[] f39071b;

    /* renamed from: c */
    public final CredentialPickerConfig f39072c;

    /* renamed from: d */
    public final CredentialPickerConfig f39073d;

    /* renamed from: e */
    public final boolean f39074e;

    /* renamed from: f */
    public final String f39075f;

    /* renamed from: g */
    public final String f39076g;

    /* renamed from: h */
    private final int f39077h;

    /* renamed from: i */
    private final boolean f39078i;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f39077h = i;
        this.f39070a = z;
        this.f39071b = (String[]) C15464q.m32123a(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C15118a().mo27887a();
        }
        this.f39072c = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C15118a().mo27887a();
        }
        this.f39073d = credentialPickerConfig2;
        if (i < 3) {
            this.f39074e = true;
            this.f39075f = null;
            this.f39076g = null;
        } else {
            this.f39074e = z2;
            this.f39075f = str;
            this.f39076g = str2;
        }
        this.f39078i = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 1, this.f39070a);
        C15469b.m32192a(parcel, 2, this.f39071b, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39072c, i, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f39073d, i, false);
        C15469b.m32189a(parcel, 5, this.f39074e);
        C15469b.m32187a(parcel, 6, this.f39075f, false);
        C15469b.m32187a(parcel, 7, this.f39076g, false);
        C15469b.m32195b(parcel, 1000, this.f39077h);
        C15469b.m32189a(parcel, 8, this.f39078i);
        C15469b.m32197c(parcel, a);
    }
}
