package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo */
public final class CopiedReactionWindowInfo implements Parcelable, Serializable {
    public static final C44407a CREATOR = new C44407a(null);
    @C17952c(mo34828a = "react_width")

    /* renamed from: a */
    private final int f112344a;
    @C17952c(mo34828a = "react_height")

    /* renamed from: b */
    private final int f112345b;
    @C17952c(mo34828a = "react_angle")

    /* renamed from: c */
    private final float f112346c;
    @C17952c(mo34828a = "react_type")

    /* renamed from: d */
    private final int f112347d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo$a */
    public static final class C44407a implements Creator<CopiedReactionWindowInfo> {
        private C44407a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CopiedReactionWindowInfo[i];
        }

        public /* synthetic */ C44407a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new CopiedReactionWindowInfo(parcel);
        }
    }

    public CopiedReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ CopiedReactionWindowInfo copy$default(CopiedReactionWindowInfo copiedReactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = copiedReactionWindowInfo.f112344a;
        }
        if ((i4 & 2) != 0) {
            i2 = copiedReactionWindowInfo.f112345b;
        }
        if ((i4 & 4) != 0) {
            f = copiedReactionWindowInfo.f112346c;
        }
        if ((i4 & 8) != 0) {
            i3 = copiedReactionWindowInfo.f112347d;
        }
        return copiedReactionWindowInfo.copy(i, i2, f, i3);
    }

    public final int component1() {
        return this.f112344a;
    }

    public final int component2() {
        return this.f112345b;
    }

    public final float component3() {
        return this.f112346c;
    }

    public final int component4() {
        return this.f112347d;
    }

    public final CopiedReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new CopiedReactionWindowInfo(i, i2, f, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CopiedReactionWindowInfo) {
                CopiedReactionWindowInfo copiedReactionWindowInfo = (CopiedReactionWindowInfo) obj;
                if (this.f112344a == copiedReactionWindowInfo.f112344a) {
                    if ((this.f112345b == copiedReactionWindowInfo.f112345b) && Float.compare(this.f112346c, copiedReactionWindowInfo.f112346c) == 0) {
                        if (this.f112347d == copiedReactionWindowInfo.f112347d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final float getAngle() {
        return this.f112346c;
    }

    public final int getHeight() {
        return this.f112345b;
    }

    public final int getType() {
        return this.f112347d;
    }

    public final int getWidth() {
        return this.f112344a;
    }

    public final int hashCode() {
        return (((((this.f112344a * 31) + this.f112345b) * 31) + Float.floatToIntBits(this.f112346c)) * 31) + this.f112347d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopiedReactionWindowInfo(width=");
        sb.append(this.f112344a);
        sb.append(", height=");
        sb.append(this.f112345b);
        sb.append(", angle=");
        sb.append(this.f112346c);
        sb.append(", type=");
        sb.append(this.f112347d);
        sb.append(")");
        return sb.toString();
    }

    public CopiedReactionWindowInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f112344a);
        parcel.writeInt(this.f112345b);
        parcel.writeFloat(this.f112346c);
        parcel.writeInt(this.f112347d);
    }

    public CopiedReactionWindowInfo(int i, int i2, float f, int i3) {
        this.f112344a = i;
        this.f112345b = i2;
        this.f112346c = f;
        this.f112347d = i3;
    }

    public /* synthetic */ CopiedReactionWindowInfo(int i, int i2, float f, int i3, int i4, C52707g gVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            f = 0.0f;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        this(i, i2, f, i3);
    }
}
