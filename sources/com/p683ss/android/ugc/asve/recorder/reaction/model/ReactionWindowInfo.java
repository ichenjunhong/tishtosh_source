package com.p683ss.android.ugc.asve.recorder.reaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo */
public final class ReactionWindowInfo implements Parcelable, Serializable {
    public static final C20543a CREATOR = new C20543a(null);
    @C17952c(mo34828a = "react_width")

    /* renamed from: a */
    private final int f56304a;
    @C17952c(mo34828a = "react_height")

    /* renamed from: b */
    private final int f56305b;
    @C17952c(mo34828a = "react_angle")

    /* renamed from: c */
    private final float f56306c;
    @C17952c(mo34828a = "react_type")

    /* renamed from: d */
    private final int f56307d;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo$a */
    public static final class C20543a implements Creator<ReactionWindowInfo> {
        private C20543a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReactionWindowInfo[i];
        }

        public /* synthetic */ C20543a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m51566a(parcel);
        }

        /* renamed from: a */
        public static ReactionWindowInfo m51566a(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ReactionWindowInfo(parcel);
        }
    }

    public ReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ ReactionWindowInfo copy$default(ReactionWindowInfo reactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reactionWindowInfo.f56304a;
        }
        if ((i4 & 2) != 0) {
            i2 = reactionWindowInfo.f56305b;
        }
        if ((i4 & 4) != 0) {
            f = reactionWindowInfo.f56306c;
        }
        if ((i4 & 8) != 0) {
            i3 = reactionWindowInfo.f56307d;
        }
        return reactionWindowInfo.copy(i, i2, f, i3);
    }

    public final int component1() {
        return this.f56304a;
    }

    public final int component2() {
        return this.f56305b;
    }

    public final float component3() {
        return this.f56306c;
    }

    public final int component4() {
        return this.f56307d;
    }

    public final ReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new ReactionWindowInfo(i, i2, f, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReactionWindowInfo) {
                ReactionWindowInfo reactionWindowInfo = (ReactionWindowInfo) obj;
                if (this.f56304a == reactionWindowInfo.f56304a) {
                    if ((this.f56305b == reactionWindowInfo.f56305b) && Float.compare(this.f56306c, reactionWindowInfo.f56306c) == 0) {
                        if (this.f56307d == reactionWindowInfo.f56307d) {
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
        return this.f56306c;
    }

    public final int getHeight() {
        return this.f56305b;
    }

    public final int getType() {
        return this.f56307d;
    }

    public final int getWidth() {
        return this.f56304a;
    }

    public final int hashCode() {
        return (((((this.f56304a * 31) + this.f56305b) * 31) + Float.floatToIntBits(this.f56306c)) * 31) + this.f56307d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionWindowInfo(width=");
        sb.append(this.f56304a);
        sb.append(", height=");
        sb.append(this.f56305b);
        sb.append(", angle=");
        sb.append(this.f56306c);
        sb.append(", type=");
        sb.append(this.f56307d);
        sb.append(")");
        return sb.toString();
    }

    public ReactionWindowInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f56304a);
        parcel.writeInt(this.f56305b);
        parcel.writeFloat(this.f56306c);
        parcel.writeInt(this.f56307d);
    }

    public ReactionWindowInfo(int i, int i2, float f, int i3) {
        this.f56304a = i;
        this.f56305b = i2;
        this.f56306c = f;
        this.f56307d = i3;
    }

    public /* synthetic */ ReactionWindowInfo(int i, int i2, float f, int i3, int i4, C52707g gVar) {
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
