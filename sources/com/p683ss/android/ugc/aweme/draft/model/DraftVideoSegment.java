package com.p683ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment */
public final class DraftVideoSegment implements Parcelable {
    public static final Creator CREATOR = new C29055a();
    @C17952c(mo34828a = "width")

    /* renamed from: a */
    public int f76015a;
    @C17952c(mo34828a = "height")

    /* renamed from: b */
    public int f76016b;
    @C17952c(mo34828a = "start")

    /* renamed from: c */
    public int f76017c;
    @C17952c(mo34828a = "end")

    /* renamed from: d */
    public int f76018d;
    @C17952c(mo34828a = "duration")

    /* renamed from: e */
    public int f76019e;
    @C17952c(mo34828a = "speed")

    /* renamed from: f */
    public float f76020f;
    @C17952c(mo34828a = "roatete")

    /* renamed from: g */
    public int f76021g;
    @C17952c(mo34828a = "video_path")

    /* renamed from: h */
    public String f76022h;
    @C17952c(mo34828a = "audio_path")

    /* renamed from: i */
    public String f76023i;
    @C17952c(mo34828a = "reverse_path")

    /* renamed from: j */
    public String f76024j;
    @C17952c(mo34828a = "temp_path")

    /* renamed from: k */
    public String f76025k;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment$a */
    public static class C29055a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            DraftVideoSegment draftVideoSegment = new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return draftVideoSegment;
        }

        public final Object[] newArray(int i) {
            return new DraftVideoSegment[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DraftVideoSegment) {
                DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
                if (this.f76015a == draftVideoSegment.f76015a) {
                    if (this.f76016b == draftVideoSegment.f76016b) {
                        if (this.f76017c == draftVideoSegment.f76017c) {
                            if (this.f76018d == draftVideoSegment.f76018d) {
                                if ((this.f76019e == draftVideoSegment.f76019e) && Float.compare(this.f76020f, draftVideoSegment.f76020f) == 0) {
                                    if (!(this.f76021g == draftVideoSegment.f76021g) || !C52711k.m112239a((Object) this.f76022h, (Object) draftVideoSegment.f76022h) || !C52711k.m112239a((Object) this.f76023i, (Object) draftVideoSegment.f76023i) || !C52711k.m112239a((Object) this.f76024j, (Object) draftVideoSegment.f76024j) || !C52711k.m112239a((Object) this.f76025k, (Object) draftVideoSegment.f76025k)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = ((((((((((((this.f76015a * 31) + this.f76016b) * 31) + this.f76017c) * 31) + this.f76018d) * 31) + this.f76019e) * 31) + Float.floatToIntBits(this.f76020f)) * 31) + this.f76021g) * 31;
        String str = this.f76022h;
        int i = 0;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76023i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76024j;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f76025k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftVideoSegment(width=");
        sb.append(this.f76015a);
        sb.append(", height=");
        sb.append(this.f76016b);
        sb.append(", start=");
        sb.append(this.f76017c);
        sb.append(", end=");
        sb.append(this.f76018d);
        sb.append(", duration=");
        sb.append(this.f76019e);
        sb.append(", speed=");
        sb.append(this.f76020f);
        sb.append(", rotate=");
        sb.append(this.f76021g);
        sb.append(", videoPath=");
        sb.append(this.f76022h);
        sb.append(", audioPath=");
        sb.append(this.f76023i);
        sb.append(", reversePath=");
        sb.append(this.f76024j);
        sb.append(", tempVideoPath=");
        sb.append(this.f76025k);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f76015a);
        parcel.writeInt(this.f76016b);
        parcel.writeInt(this.f76017c);
        parcel.writeInt(this.f76018d);
        parcel.writeInt(this.f76019e);
        parcel.writeFloat(this.f76020f);
        parcel.writeInt(this.f76021g);
        parcel.writeString(this.f76022h);
        parcel.writeString(this.f76023i);
        parcel.writeString(this.f76024j);
        parcel.writeString(this.f76025k);
    }

    public DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "videoPath");
        this.f76015a = i;
        this.f76016b = i2;
        this.f76017c = i3;
        this.f76018d = i4;
        this.f76019e = i5;
        this.f76020f = f;
        this.f76021g = i6;
        this.f76022h = str;
        this.f76023i = str2;
        this.f76024j = str3;
        this.f76025k = str4;
    }
}
