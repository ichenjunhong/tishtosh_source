package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C15118a;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new C15126g();

    /* renamed from: a */
    public final CredentialPickerConfig f39079a;

    /* renamed from: b */
    public final boolean f39080b;

    /* renamed from: c */
    public final String[] f39081c;

    /* renamed from: d */
    public final boolean f39082d;

    /* renamed from: e */
    public final String f39083e;

    /* renamed from: f */
    public final String f39084f;

    /* renamed from: g */
    private final int f39085g;

    /* renamed from: h */
    private final boolean f39086h;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C15119a {

        /* renamed from: a */
        boolean f39087a;

        /* renamed from: b */
        boolean f39088b;

        /* renamed from: c */
        String[] f39089c;

        /* renamed from: d */
        CredentialPickerConfig f39090d = new C15118a().mo27887a();

        /* renamed from: e */
        boolean f39091e = false;

        /* renamed from: f */
        String f39092f;

        /* renamed from: g */
        String f39093g;

        /* renamed from: a */
        public final C15119a mo27891a(boolean z) {
            this.f39088b = true;
            return this;
        }

        /* renamed from: a */
        public final C15119a mo27890a(CredentialPickerConfig credentialPickerConfig) {
            this.f39090d = (CredentialPickerConfig) C15464q.m32123a(credentialPickerConfig);
            return this;
        }

        /* renamed from: a */
        public final HintRequest mo27892a() {
            if (this.f39089c == null) {
                this.f39089c = new String[0];
            }
            if (this.f39087a || this.f39088b || this.f39089c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f39085g = i;
        this.f39079a = (CredentialPickerConfig) C15464q.m32123a(credentialPickerConfig);
        this.f39080b = z;
        this.f39086h = z2;
        this.f39081c = (String[]) C15464q.m32123a(strArr);
        if (this.f39085g < 2) {
            this.f39082d = true;
            this.f39083e = null;
            this.f39084f = null;
            return;
        }
        this.f39082d = z3;
        this.f39083e = str;
        this.f39084f = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) this.f39079a, i, false);
        C15469b.m32189a(parcel, 2, this.f39080b);
        C15469b.m32189a(parcel, 3, this.f39086h);
        C15469b.m32192a(parcel, 4, this.f39081c, false);
        C15469b.m32189a(parcel, 5, this.f39082d);
        C15469b.m32187a(parcel, 6, this.f39083e, false);
        C15469b.m32187a(parcel, 7, this.f39084f, false);
        C15469b.m32195b(parcel, 1000, this.f39085g);
        C15469b.m32197c(parcel, a);
    }

    private HintRequest(C15119a aVar) {
        this(2, aVar.f39090d, aVar.f39087a, aVar.f39088b, aVar.f39089c, aVar.f39091e, aVar.f39092f, aVar.f39093g);
    }
}
