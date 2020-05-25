package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzlg implements Parcelable {
    public static final Creator<zzlg> CREATOR = new bmg();

    /* renamed from: A */
    private int f46250A;

    /* renamed from: a */
    public final int f46251a;

    /* renamed from: b */
    public final String f46252b;

    /* renamed from: c */
    public final String f46253c;

    /* renamed from: d */
    public final int f46254d;

    /* renamed from: e */
    public final List<byte[]> f46255e;

    /* renamed from: f */
    public final zznd f46256f;

    /* renamed from: g */
    public final int f46257g;

    /* renamed from: h */
    public final int f46258h;

    /* renamed from: i */
    public final float f46259i;

    /* renamed from: j */
    public final int f46260j;

    /* renamed from: k */
    public final float f46261k;

    /* renamed from: l */
    public final int f46262l;

    /* renamed from: m */
    public final int f46263m;

    /* renamed from: n */
    public final int f46264n;

    /* renamed from: o */
    public final long f46265o;

    /* renamed from: p */
    public final int f46266p;

    /* renamed from: q */
    public final String f46267q;

    /* renamed from: r */
    private final String f46268r;

    /* renamed from: s */
    private final zzpn f46269s;

    /* renamed from: t */
    private final String f46270t;

    /* renamed from: u */
    private final int f46271u;

    /* renamed from: v */
    private final byte[] f46272v;

    /* renamed from: w */
    private final zzta f46273w;

    /* renamed from: x */
    private final int f46274x;

    /* renamed from: y */
    private final int f46275y;

    /* renamed from: z */
    private final int f46276z;

    /* renamed from: a */
    public static zzlg m39281a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzta zzta, zznd zznd) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzta, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zznd, null);
        return zzlg;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static zzlg m39283a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zznd zznd, int i5, String str4) {
        return m39282a(str, str2, null, -1, -1, i3, i4, -1, null, null, 0, str4);
    }

    /* renamed from: a */
    public static zzlg m39282a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zznd zznd, int i6, String str4) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zznd, null);
        return zzlg;
    }

    /* renamed from: a */
    public static zzlg m39284a(String str, String str2, String str3, int i, int i2, String str4, int i3, zznd zznd, long j, List<byte[]> list) {
        zzlg zzlg = new zzlg(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zznd, null);
        return zzlg;
    }

    zzlg(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzta zzta, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zznd zznd, zzpn zzpn) {
        this.f46268r = str;
        this.f46270t = str2;
        this.f46253c = str3;
        this.f46252b = str4;
        this.f46251a = i;
        this.f46254d = i2;
        this.f46257g = i3;
        this.f46258h = i4;
        this.f46259i = f;
        this.f46260j = i5;
        this.f46261k = f2;
        this.f46272v = bArr;
        this.f46271u = i6;
        this.f46273w = zzta;
        this.f46262l = i7;
        this.f46263m = i8;
        this.f46264n = i9;
        this.f46274x = i10;
        this.f46275y = i11;
        this.f46266p = i12;
        this.f46267q = str5;
        this.f46276z = i13;
        this.f46265o = j;
        this.f46255e = list == null ? Collections.emptyList() : list;
        this.f46256f = zznd;
        this.f46269s = zzpn;
    }

    zzlg(Parcel parcel) {
        this.f46268r = parcel.readString();
        this.f46270t = parcel.readString();
        this.f46253c = parcel.readString();
        this.f46252b = parcel.readString();
        this.f46251a = parcel.readInt();
        this.f46254d = parcel.readInt();
        this.f46257g = parcel.readInt();
        this.f46258h = parcel.readInt();
        this.f46259i = parcel.readFloat();
        this.f46260j = parcel.readInt();
        this.f46261k = parcel.readFloat();
        this.f46272v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f46271u = parcel.readInt();
        this.f46273w = (zzta) parcel.readParcelable(zzta.class.getClassLoader());
        this.f46262l = parcel.readInt();
        this.f46263m = parcel.readInt();
        this.f46264n = parcel.readInt();
        this.f46274x = parcel.readInt();
        this.f46275y = parcel.readInt();
        this.f46266p = parcel.readInt();
        this.f46267q = parcel.readString();
        this.f46276z = parcel.readInt();
        this.f46265o = parcel.readLong();
        int readInt = parcel.readInt();
        this.f46255e = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f46255e.add(parcel.createByteArray());
        }
        this.f46256f = (zznd) parcel.readParcelable(zznd.class.getClassLoader());
        this.f46269s = (zzpn) parcel.readParcelable(zzpn.class.getClassLoader());
    }

    /* renamed from: a */
    public final zzlg mo31599a(int i) {
        int i2 = i;
        zzlg zzlg = new zzlg(this.f46268r, this.f46270t, this.f46253c, this.f46252b, this.f46251a, i2, this.f46257g, this.f46258h, this.f46259i, this.f46260j, this.f46261k, this.f46272v, this.f46271u, this.f46273w, this.f46262l, this.f46263m, this.f46264n, this.f46274x, this.f46275y, this.f46266p, this.f46267q, this.f46276z, this.f46265o, this.f46255e, this.f46256f, this.f46269s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo31601a(long j) {
        zzlg zzlg = new zzlg(this.f46268r, this.f46270t, this.f46253c, this.f46252b, this.f46251a, this.f46254d, this.f46257g, this.f46258h, this.f46259i, this.f46260j, this.f46261k, this.f46272v, this.f46271u, this.f46273w, this.f46262l, this.f46263m, this.f46264n, this.f46274x, this.f46275y, this.f46266p, this.f46267q, this.f46276z, j, this.f46255e, this.f46256f, this.f46269s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo31600a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        zzlg zzlg = new zzlg(this.f46268r, this.f46270t, this.f46253c, this.f46252b, this.f46251a, this.f46254d, this.f46257g, this.f46258h, this.f46259i, this.f46260j, this.f46261k, this.f46272v, this.f46271u, this.f46273w, this.f46262l, this.f46263m, this.f46264n, i3, i4, this.f46266p, this.f46267q, this.f46276z, this.f46265o, this.f46255e, this.f46256f, this.f46269s);
        return zzlg;
    }

    /* renamed from: a */
    public final zzlg mo31602a(zzpn zzpn) {
        zzpn zzpn2 = zzpn;
        zzlg zzlg = new zzlg(this.f46268r, this.f46270t, this.f46253c, this.f46252b, this.f46251a, this.f46254d, this.f46257g, this.f46258h, this.f46259i, this.f46260j, this.f46261k, this.f46272v, this.f46271u, this.f46273w, this.f46262l, this.f46263m, this.f46264n, this.f46274x, this.f46275y, this.f46266p, this.f46267q, this.f46276z, this.f46265o, this.f46255e, this.f46256f, zzpn2);
        return zzlg;
    }

    /* renamed from: a */
    public final int mo31598a() {
        if (this.f46257g == -1 || this.f46258h == -1) {
            return -1;
        }
        return this.f46257g * this.f46258h;
    }

    /* renamed from: b */
    public final MediaFormat mo31603b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f46253c);
        String str = "language";
        String str2 = this.f46267q;
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
        m39285a(mediaFormat, "max-input-size", this.f46254d);
        m39285a(mediaFormat, "width", this.f46257g);
        m39285a(mediaFormat, "height", this.f46258h);
        String str3 = "frame-rate";
        float f = this.f46259i;
        if (f != -1.0f) {
            mediaFormat.setFloat(str3, f);
        }
        m39285a(mediaFormat, "rotation-degrees", this.f46260j);
        m39285a(mediaFormat, "channel-count", this.f46262l);
        m39285a(mediaFormat, "sample-rate", this.f46263m);
        m39285a(mediaFormat, "encoder-delay", this.f46274x);
        m39285a(mediaFormat, "encoder-padding", this.f46275y);
        for (int i = 0; i < this.f46255e.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) this.f46255e.get(i)));
        }
        zzta zzta = this.f46273w;
        if (zzta != null) {
            m39285a(mediaFormat, "color-transfer", zzta.f46298c);
            m39285a(mediaFormat, "color-standard", zzta.f46296a);
            m39285a(mediaFormat, "color-range", zzta.f46297b);
            String str4 = "hdr-static-info";
            byte[] bArr = zzta.f46299d;
            if (bArr != null) {
                mediaFormat.setByteBuffer(str4, ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.f46268r;
        String str2 = this.f46270t;
        String str3 = this.f46253c;
        int i = this.f46251a;
        String str4 = this.f46267q;
        int i2 = this.f46257g;
        int i3 = this.f46258h;
        float f = this.f46259i;
        int i4 = this.f46262l;
        int i5 = this.f46263m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f46250A == 0) {
            int i = 0;
            int hashCode = ((((((((((((((((((((((((this.f46268r == null ? 0 : this.f46268r.hashCode()) + 527) * 31) + (this.f46270t == null ? 0 : this.f46270t.hashCode())) * 31) + (this.f46253c == null ? 0 : this.f46253c.hashCode())) * 31) + (this.f46252b == null ? 0 : this.f46252b.hashCode())) * 31) + this.f46251a) * 31) + this.f46257g) * 31) + this.f46258h) * 31) + this.f46262l) * 31) + this.f46263m) * 31) + (this.f46267q == null ? 0 : this.f46267q.hashCode())) * 31) + this.f46276z) * 31) + (this.f46256f == null ? 0 : this.f46256f.hashCode())) * 31;
            if (this.f46269s != null) {
                i = this.f46269s.hashCode();
            }
            this.f46250A = hashCode + i;
        }
        return this.f46250A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzlg zzlg = (zzlg) obj;
        if (this.f46251a != zzlg.f46251a || this.f46254d != zzlg.f46254d || this.f46257g != zzlg.f46257g || this.f46258h != zzlg.f46258h || this.f46259i != zzlg.f46259i || this.f46260j != zzlg.f46260j || this.f46261k != zzlg.f46261k || this.f46271u != zzlg.f46271u || this.f46262l != zzlg.f46262l || this.f46263m != zzlg.f46263m || this.f46264n != zzlg.f46264n || this.f46274x != zzlg.f46274x || this.f46275y != zzlg.f46275y || this.f46265o != zzlg.f46265o || this.f46266p != zzlg.f46266p || !btw.m36762a((Object) this.f46268r, (Object) zzlg.f46268r) || !btw.m36762a((Object) this.f46267q, (Object) zzlg.f46267q) || this.f46276z != zzlg.f46276z || !btw.m36762a((Object) this.f46270t, (Object) zzlg.f46270t) || !btw.m36762a((Object) this.f46253c, (Object) zzlg.f46253c) || !btw.m36762a((Object) this.f46252b, (Object) zzlg.f46252b) || !btw.m36762a((Object) this.f46256f, (Object) zzlg.f46256f) || !btw.m36762a((Object) this.f46269s, (Object) zzlg.f46269s) || !btw.m36762a((Object) this.f46273w, (Object) zzlg.f46273w) || !Arrays.equals(this.f46272v, zzlg.f46272v) || this.f46255e.size() != zzlg.f46255e.size()) {
            return false;
        }
        for (int i = 0; i < this.f46255e.size(); i++) {
            if (!Arrays.equals((byte[]) this.f46255e.get(i), (byte[]) zzlg.f46255e.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m39285a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46268r);
        parcel.writeString(this.f46270t);
        parcel.writeString(this.f46253c);
        parcel.writeString(this.f46252b);
        parcel.writeInt(this.f46251a);
        parcel.writeInt(this.f46254d);
        parcel.writeInt(this.f46257g);
        parcel.writeInt(this.f46258h);
        parcel.writeFloat(this.f46259i);
        parcel.writeInt(this.f46260j);
        parcel.writeFloat(this.f46261k);
        parcel.writeInt(this.f46272v != null ? 1 : 0);
        if (this.f46272v != null) {
            parcel.writeByteArray(this.f46272v);
        }
        parcel.writeInt(this.f46271u);
        parcel.writeParcelable(this.f46273w, i);
        parcel.writeInt(this.f46262l);
        parcel.writeInt(this.f46263m);
        parcel.writeInt(this.f46264n);
        parcel.writeInt(this.f46274x);
        parcel.writeInt(this.f46275y);
        parcel.writeInt(this.f46266p);
        parcel.writeString(this.f46267q);
        parcel.writeInt(this.f46276z);
        parcel.writeLong(this.f46265o);
        int size = this.f46255e.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f46255e.get(i2));
        }
        parcel.writeParcelable(this.f46256f, 0);
        parcel.writeParcelable(this.f46269s, 0);
    }
}
