package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

@C16299uq
public final class zzwr extends AbstractSafeParcelable {
    public static final Creator<zzwr> CREATOR = new bxo();

    /* renamed from: a */
    public final String f46307a;

    /* renamed from: b */
    public final boolean f46308b;

    /* renamed from: c */
    public long f46309c;

    /* renamed from: d */
    private final long f46310d;

    /* renamed from: e */
    private final String f46311e;

    /* renamed from: f */
    private final String f46312f;

    /* renamed from: g */
    private final String f46313g;

    /* renamed from: h */
    private final Bundle f46314h;

    /* renamed from: a */
    public static zzwr m39299a(String str) {
        return m39298a(Uri.parse(str));
    }

    /* renamed from: a */
    public static zzwr m39298a(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                abv.m32798e(sb.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            zzwr zzwr = new zzwr(queryParameter, j, host, str, str2, bundle, equals, 0);
            return zzwr;
        } catch (NullPointerException | NumberFormatException e) {
            abv.m32795c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    zzwr(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f46307a = str;
        this.f46310d = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f46311e = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f46312f = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f46313g = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f46314h = bundle;
        this.f46308b = z;
        this.f46309c = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46307a, false);
        C15469b.m32180a(parcel, 3, this.f46310d);
        C15469b.m32187a(parcel, 4, this.f46311e, false);
        C15469b.m32187a(parcel, 5, this.f46312f, false);
        C15469b.m32187a(parcel, 6, this.f46313g, false);
        C15469b.m32181a(parcel, 7, this.f46314h, false);
        C15469b.m32189a(parcel, 8, this.f46308b);
        C15469b.m32180a(parcel, 9, this.f46309c);
        C15469b.m32197c(parcel, a);
    }
}
