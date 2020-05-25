package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C15121b();

    /* renamed from: a */
    public final String f39054a;

    /* renamed from: b */
    public final String f39055b;

    /* renamed from: c */
    public final Uri f39056c;

    /* renamed from: d */
    public final List<IdToken> f39057d;

    /* renamed from: e */
    public final String f39058e;

    /* renamed from: f */
    public final String f39059f;

    /* renamed from: g */
    public final String f39060g;

    /* renamed from: h */
    public final String f39061h;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        String trim = ((String) C15464q.m32124a(str, (Object) "credential identifier cannot be null")).trim();
        C15464q.m32126a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(parse.getScheme()) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f39055b = str2;
                this.f39056c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f39057d = list2;
                this.f39054a = trim;
                this.f39058e = str3;
                this.f39059f = str4;
                this.f39060g = str5;
                this.f39061h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f39054a, false);
        C15469b.m32187a(parcel, 2, this.f39055b, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39056c, i, false);
        C15469b.m32196b(parcel, 4, this.f39057d, false);
        C15469b.m32187a(parcel, 5, this.f39058e, false);
        C15469b.m32187a(parcel, 6, this.f39059f, false);
        C15469b.m32187a(parcel, 9, this.f39060g, false);
        C15469b.m32187a(parcel, 10, this.f39061h, false);
        C15469b.m32197c(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f39054a, credential.f39054a) && TextUtils.equals(this.f39055b, credential.f39055b) && C15462p.m32120a(this.f39056c, credential.f39056c) && TextUtils.equals(this.f39058e, credential.f39058e) && TextUtils.equals(this.f39059f, credential.f39059f);
    }

    public int hashCode() {
        return C15462p.m32118a(this.f39054a, this.f39055b, this.f39056c, this.f39058e, this.f39059f);
    }
}
