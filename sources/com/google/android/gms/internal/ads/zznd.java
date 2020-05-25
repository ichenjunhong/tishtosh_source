package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

public final class zznd implements Parcelable, Comparator<zza> {
    public static final Creator<zznd> CREATOR = new bod();

    /* renamed from: a */
    final zza[] f46277a;

    /* renamed from: b */
    public final int f46278b;

    /* renamed from: c */
    private int f46279c;

    public static final class zza implements Parcelable {
        public static final Creator<zza> CREATOR = new C15730boe();

        /* renamed from: a */
        public final boolean f46280a;

        /* renamed from: b */
        private int f46281b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final UUID f46282c;

        /* renamed from: d */
        private final String f46283d;

        /* renamed from: e */
        private final byte[] f46284e;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f46282c = (UUID) bti.m36697a(uuid);
            this.f46283d = (String) bti.m36697a(str);
            this.f46284e = (byte[]) bti.m36697a(bArr);
            this.f46280a = false;
        }

        zza(Parcel parcel) {
            this.f46282c = new UUID(parcel.readLong(), parcel.readLong());
            this.f46283d = parcel.readString();
            this.f46284e = parcel.createByteArray();
            this.f46280a = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.f46283d.equals(zza.f46283d) && btw.m36762a((Object) this.f46282c, (Object) zza.f46282c) && Arrays.equals(this.f46284e, zza.f46284e);
        }

        public final int hashCode() {
            if (this.f46281b == 0) {
                this.f46281b = (((this.f46282c.hashCode() * 31) + this.f46283d.hashCode()) * 31) + Arrays.hashCode(this.f46284e);
            }
            return this.f46281b;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f46282c.getMostSignificantBits());
            parcel.writeLong(this.f46282c.getLeastSignificantBits());
            parcel.writeString(this.f46283d);
            parcel.writeByteArray(this.f46284e);
            parcel.writeByte(this.f46280a ? (byte) 1 : 0);
        }
    }

    public zznd(zza... zzaArr) {
        this(true, zzaArr);
    }

    public final int describeContents() {
        return 0;
    }

    private zznd(boolean z, zza... zzaArr) {
        zza[] zzaArr2 = (zza[]) zzaArr.clone();
        Arrays.sort(zzaArr2, this);
        int i = 1;
        while (i < zzaArr2.length) {
            if (!zzaArr2[i - 1].f46282c.equals(zzaArr2[i].f46282c)) {
                i++;
            } else {
                String valueOf = String.valueOf(zzaArr2[i].f46282c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f46277a = zzaArr2;
        this.f46278b = zzaArr2.length;
    }

    zznd(Parcel parcel) {
        this.f46277a = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f46278b = this.f46277a.length;
    }

    public final int hashCode() {
        if (this.f46279c == 0) {
            this.f46279c = Arrays.hashCode(this.f46277a);
        }
        return this.f46279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46277a, ((zznd) obj).f46277a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f46277a, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (bls.f42867b.equals(zza2.f46282c)) {
            return bls.f42867b.equals(zza3.f46282c) ? 0 : 1;
        }
        return zza2.f46282c.compareTo(zza3.f46282c);
    }
}
