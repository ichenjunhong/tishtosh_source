package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public final class C15467a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C15468a extends RuntimeException {
        public C15468a(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m32142a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m32143a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m32144a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: b */
    public static void m32149b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m32144a(parcel, i));
    }

    /* renamed from: a */
    public static void m32146a(Parcel parcel, int i, int i2) {
        int a = m32144a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C15468a(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static void m32147a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C15468a(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m32148b(Parcel parcel) {
        int a = m32143a(parcel);
        int a2 = m32144a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m32142a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new C15468a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = a2 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C15468a(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static boolean m32152c(Parcel parcel, int i) {
        m32146a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static byte m32153d(Parcel parcel, int i) {
        m32146a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: e */
    public static int m32154e(Parcel parcel, int i) {
        m32146a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: f */
    public static Integer m32155f(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        if (a == 0) {
            return null;
        }
        m32147a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: g */
    public static long m32156g(Parcel parcel, int i) {
        m32146a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: h */
    public static Long m32157h(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        if (a == 0) {
            return null;
        }
        m32147a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: i */
    public static BigInteger m32158i(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    /* renamed from: j */
    public static float m32159j(Parcel parcel, int i) {
        m32146a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: k */
    public static Float m32160k(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        if (a == 0) {
            return null;
        }
        m32147a(parcel, i, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: l */
    public static double m32161l(Parcel parcel, int i) {
        m32146a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: m */
    public static BigDecimal m32162m(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: n */
    public static String m32163n(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: o */
    public static IBinder m32164o(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m32145a(Parcel parcel, int i, Creator<T> creator) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return t;
    }

    /* renamed from: p */
    public static Bundle m32165p(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: q */
    public static byte[] m32166q(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: r */
    public static BigInteger[] m32167r(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: s */
    public static BigDecimal[] m32168s(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    /* renamed from: t */
    public static String[] m32169t(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: u */
    public static ArrayList<String> m32170u(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: b */
    public static <T> T[] m32150b(Parcel parcel, int i, Creator<T> creator) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m32151c(Parcel parcel, int i, Creator<T> creator) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static Parcel m32171v(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(dataPosition + a);
        return obtain;
    }

    /* renamed from: w */
    public static Parcel[] m32172w(Parcel parcel, int i) {
        int a = m32144a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    /* renamed from: x */
    public static void m32173x(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C15468a(sb.toString(), parcel);
        }
    }
}
