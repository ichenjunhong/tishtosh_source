package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.lobby.C12322b;

public final class AuthResult implements Parcelable {
    public static final Creator<AuthResult> CREATOR = new Creator<AuthResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AuthResult[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AuthResult(parcel);
        }
    };

    /* renamed from: a */
    public boolean f32453a;

    /* renamed from: b */
    public transient boolean f32454b;

    /* renamed from: c */
    public C12322b f32455c;

    /* renamed from: d */
    public String f32456d;

    /* renamed from: e */
    public String f32457e;

    /* renamed from: f */
    public String f32458f;

    /* renamed from: g */
    public String f32459g;

    /* renamed from: h */
    public long f32460h;

    /* renamed from: i */
    public int f32461i;

    /* renamed from: j */
    public Bundle f32462j;

    /* renamed from: com.bytedance.lobby.auth.AuthResult$a */
    public static final class C12315a {

        /* renamed from: a */
        public boolean f32463a;

        /* renamed from: b */
        public C12322b f32464b;

        /* renamed from: c */
        public String f32465c;

        /* renamed from: d */
        public String f32466d = "";

        /* renamed from: e */
        public String f32467e = "";

        /* renamed from: f */
        public String f32468f = "";

        /* renamed from: g */
        public long f32469g;

        /* renamed from: h */
        public int f32470h;

        /* renamed from: i */
        public Bundle f32471i;

        /* renamed from: a */
        public final AuthResult mo23303a() {
            return new AuthResult(this);
        }

        /* renamed from: a */
        public final C12315a mo23298a(long j) {
            this.f32469g = j;
            return this;
        }

        /* renamed from: b */
        public final C12315a mo23304b(String str) {
            this.f32467e = str;
            return this;
        }

        /* renamed from: c */
        public final C12315a mo23305c(String str) {
            this.f32468f = str;
            return this;
        }

        /* renamed from: a */
        public final C12315a mo23299a(Bundle bundle) {
            this.f32471i = bundle;
            return this;
        }

        /* renamed from: a */
        public final C12315a mo23300a(C12322b bVar) {
            this.f32464b = bVar;
            return this;
        }

        /* renamed from: a */
        public final C12315a mo23301a(String str) {
            this.f32466d = str;
            return this;
        }

        /* renamed from: a */
        public final C12315a mo23302a(boolean z) {
            this.f32463a = z;
            return this;
        }

        public C12315a(String str, int i) {
            this.f32465c = str;
            this.f32470h = i;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return super.toString();
    }

    private AuthResult(Parcel parcel) {
        this.f32456d = "";
        this.f32457e = "";
        this.f32458f = "";
        this.f32459g = "";
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        C12322b bVar = (C12322b) parcel.readSerializable();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        new C12315a(readString, readInt).mo23302a(z).mo23300a(bVar).mo23301a(readString2).mo23304b(readString3).mo23305c(readString4).mo23298a(readLong).mo23299a(parcel.readBundle(getClass().getClassLoader())).mo23303a();
    }

    private AuthResult(C12315a aVar) {
        Bundle bundle;
        this.f32456d = "";
        this.f32457e = "";
        this.f32458f = "";
        this.f32459g = "";
        this.f32453a = aVar.f32463a;
        boolean z = true;
        if (!this.f32453a) {
            if (aVar.f32464b == null) {
                this.f32455c = new C12322b(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.f32455c = aVar.f32464b;
            }
        }
        if (this.f32455c == null || (!this.f32455c.isCancelled() && this.f32455c.getErrorCode() != 4)) {
            z = false;
        }
        this.f32454b = z;
        this.f32456d = aVar.f32465c;
        this.f32457e = aVar.f32466d;
        this.f32458f = aVar.f32467e;
        this.f32459g = aVar.f32468f;
        this.f32460h = aVar.f32469g;
        this.f32461i = aVar.f32470h;
        if (aVar.f32471i == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f32471i;
        }
        this.f32462j = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32453a ? 1 : 0);
        parcel.writeSerializable(this.f32455c);
        parcel.writeString(this.f32456d);
        parcel.writeString(this.f32459g);
        parcel.writeString(this.f32457e);
        parcel.writeString(this.f32458f);
        parcel.writeLong(this.f32460h);
        parcel.writeInt(this.f32461i);
        parcel.writeBundle(this.f32462j);
    }
}
