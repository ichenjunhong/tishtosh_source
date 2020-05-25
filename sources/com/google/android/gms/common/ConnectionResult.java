package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C15479l();

    /* renamed from: a */
    public static final ConnectionResult f39245a = new ConnectionResult(0);

    /* renamed from: b */
    public final int f39246b;

    /* renamed from: c */
    public final PendingIntent f39247c;

    /* renamed from: d */
    public final String f39248d;

    /* renamed from: e */
    private final int f39249e;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f39249e = i;
        this.f39246b = i2;
        this.f39247c = pendingIntent;
        this.f39248d = str;
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    /* renamed from: a */
    public final boolean mo28023a() {
        return (this.f39246b == 0 || this.f39247c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo28024b() {
        return this.f39246b == 0;
    }

    /* renamed from: a */
    static String m31443a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f39246b == connectionResult.f39246b && C15462p.m32120a(this.f39247c, connectionResult.f39247c) && C15462p.m32120a(this.f39248d, connectionResult.f39248d);
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f39246b), this.f39247c, this.f39248d);
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("statusCode", m31443a(this.f39246b)).mo28449a("resolution", this.f39247c).mo28449a("message", this.f39248d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39249e);
        C15469b.m32195b(parcel, 2, this.f39246b);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39247c, i, false);
        C15469b.m32187a(parcel, 4, this.f39248d, false);
        C15469b.m32197c(parcel, a);
    }
}
