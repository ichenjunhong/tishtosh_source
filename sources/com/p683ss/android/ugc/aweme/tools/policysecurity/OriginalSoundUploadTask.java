package com.p683ss.android.ugc.aweme.tools.policysecurity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask */
public final class OriginalSoundUploadTask implements Parcelable {
    public static final C47331a CREATOR = new C47331a(null);

    /* renamed from: a */
    public String f119481a;

    /* renamed from: b */
    public final String f119482b;

    /* renamed from: c */
    public final String f119483c;

    /* renamed from: d */
    public final String f119484d;

    /* renamed from: e */
    public final long f119485e;

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask$a */
    public static final class C47331a implements Creator<OriginalSoundUploadTask> {
        private C47331a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OriginalSoundUploadTask[i];
        }

        public /* synthetic */ C47331a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new OriginalSoundUploadTask(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalSoundUploadTask) {
                OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
                if (C52711k.m112239a((Object) this.f119482b, (Object) originalSoundUploadTask.f119482b) && C52711k.m112239a((Object) this.f119483c, (Object) originalSoundUploadTask.f119483c) && C52711k.m112239a((Object) this.f119484d, (Object) originalSoundUploadTask.f119484d)) {
                    if (this.f119485e == originalSoundUploadTask.f119485e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f119482b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119483c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119484d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        long j = this.f119485e;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalSoundUploadTask(awemeId=");
        sb.append(this.f119482b);
        sb.append(", vid=");
        sb.append(this.f119483c);
        sb.append(", originalSoundPath=");
        sb.append(this.f119484d);
        sb.append(", updateTime=");
        sb.append(this.f119485e);
        sb.append(")");
        return sb.toString();
    }

    public OriginalSoundUploadTask(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C52711k.m112234a();
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            C52711k.m112234a();
        }
        String readString3 = parcel.readString();
        if (readString3 == null) {
            C52711k.m112234a();
        }
        this(readString, readString2, readString3, parcel.readLong());
        this.f119481a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f119482b);
        parcel.writeString(this.f119483c);
        parcel.writeString(this.f119484d);
        parcel.writeLong(this.f119485e);
        parcel.writeString(this.f119481a);
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j) {
        C52711k.m112240b(str, "awemeId");
        C52711k.m112240b(str2, "vid");
        C52711k.m112240b(str3, "originalSoundPath");
        this.f119482b = str;
        this.f119483c = str2;
        this.f119484d = str3;
        this.f119485e = j;
    }
}
