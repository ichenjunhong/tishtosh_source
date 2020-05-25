package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C15469b {
    /* renamed from: a */
    public static void m32179a(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: a */
    public static int m32175a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    public static void m32194b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static int m32174a(Parcel parcel) {
        return m32175a(parcel, 20293);
    }

    /* renamed from: c */
    public static void m32197c(Parcel parcel, int i) {
        m32194b(parcel, i);
    }

    /* renamed from: a */
    public static void m32189a(Parcel parcel, int i, boolean z) {
        m32179a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m32176a(Parcel parcel, int i, byte b) {
        m32179a(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: b */
    public static void m32195b(Parcel parcel, int i, int i2) {
        m32179a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m32185a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m32179a(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: a */
    public static void m32180a(Parcel parcel, int i, long j) {
        m32179a(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m32186a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m32179a(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: a */
    public static void m32178a(Parcel parcel, int i, float f) {
        m32179a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m32184a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m32179a(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    /* renamed from: a */
    public static void m32177a(Parcel parcel, int i, double d) {
        m32179a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m32187a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m32179a(parcel, i, 0);
            }
            return;
        }
        int a = m32175a(parcel, i);
        parcel.writeString(str);
        m32194b(parcel, a);
    }

    /* renamed from: a */
    public static void m32182a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int a = m32175a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m32194b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m32183a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m32179a(parcel, i, 0);
            }
            return;
        }
        int a = m32175a(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m32194b(parcel, a);
    }

    /* renamed from: a */
    public static void m32181a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int a = m32175a(parcel, i);
            parcel.writeBundle(bundle);
            m32194b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m32190a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m32179a(parcel, i, 0);
            }
            return;
        }
        int a = m32175a(parcel, i);
        parcel.writeByteArray(bArr);
        m32194b(parcel, a);
    }

    /* renamed from: a */
    public static void m32192a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int a = m32175a(parcel, i);
            parcel.writeStringArray(strArr);
            m32194b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m32188a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int a = m32175a(parcel, i);
            parcel.writeStringList(list);
            m32194b(parcel, a);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m32191a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int a = m32175a(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m32193a(parcel, t, i2);
                }
            }
            m32194b(parcel, a);
        }
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m32196b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m32179a(parcel, i, 0);
            }
            return;
        }
        int a = m32175a(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m32193a(parcel, (T) parcelable, 0);
            }
        }
        m32194b(parcel, a);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m32193a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
