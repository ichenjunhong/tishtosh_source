package com.p683ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult */
public final class RecorderConcatResult implements Parcelable {
    public static final C20405a CREATOR = new C20405a(null);

    /* renamed from: a */
    public final int f55947a;

    /* renamed from: b */
    public final String f55948b;

    /* renamed from: c */
    public final String f55949c;

    /* renamed from: com.ss.android.ugc.asve.recorder.RecorderConcatResult$a */
    public static final class C20405a implements Creator<RecorderConcatResult> {
        private C20405a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecorderConcatResult[i];
        }

        public /* synthetic */ C20405a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m50613a(parcel);
        }

        /* renamed from: a */
        public static RecorderConcatResult m50613a(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new RecorderConcatResult(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecorderConcatResult) {
                RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
                if (!(this.f55947a == recorderConcatResult.f55947a) || !C52711k.m112239a((Object) this.f55948b, (Object) recorderConcatResult.f55948b) || !C52711k.m112239a((Object) this.f55949c, (Object) recorderConcatResult.f55949c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f55947a * 31;
        String str = this.f55948b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55949c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecorderConcatResult(ret=");
        sb.append(this.f55947a);
        sb.append(", videoPath=");
        sb.append(this.f55948b);
        sb.append(", audioPath=");
        sb.append(this.f55949c);
        sb.append(")");
        return sb.toString();
    }

    public RecorderConcatResult(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        C52711k.m112236a((Object) readString, "parcel.readString()");
        String readString2 = parcel.readString();
        C52711k.m112236a((Object) readString2, "parcel.readString()");
        this(readInt, readString, readString2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f55947a);
        parcel.writeString(this.f55948b);
        parcel.writeString(this.f55949c);
    }

    public RecorderConcatResult(int i, String str, String str2) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        this.f55947a = i;
        this.f55948b = str;
        this.f55949c = str2;
    }
}
