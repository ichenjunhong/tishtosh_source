package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.tencent.wcdb.database.C51756c;

public class CursorWindow extends C51756c implements Parcelable {
    public static final Creator<CursorWindow> CREATOR = new Creator<CursorWindow>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CursorWindow[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CursorWindow(parcel);
        }
    };

    /* renamed from: d */
    private static int f128989d;

    /* renamed from: a */
    public long f128990a;

    /* renamed from: b */
    public int f128991b;

    /* renamed from: c */
    public final String f128992c;

    private static native boolean nativeAllocRow(long j);

    private static native void nativeClear(long j);

    static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    /* renamed from: c */
    public final void mo107088c() {
        m110876f();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    private void m110876f() {
        if (this.f128990a != 0) {
            nativeDispose(this.f128990a);
            this.f128990a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m110876f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: b */
    public final int mo107085b() {
        mo107205d();
        try {
            return nativeGetNumRows(this.f128990a);
        } finally {
            mo107206e();
        }
    }

    static {
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            f128989d = Resources.getSystem().getInteger(identifier) * PreloadTask.BYTE_UNIT_NUMBER;
        } else {
            f128989d = 2097152;
        }
    }

    /* renamed from: a */
    public final void mo107084a() {
        mo107205d();
        try {
            this.f128991b = 0;
            nativeClear(this.f128990a);
        } finally {
            mo107206e();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128992c);
        sb.append(" {");
        sb.append(Long.toHexString(this.f128990a));
        sb.append("}");
        return sb.toString();
    }

    private CursorWindow(Parcel parcel) {
        throw new UnsupportedOperationException();
    }

    public CursorWindow(String str) {
        if (str == null || str.length() == 0) {
            str = "<unnamed>";
        }
        this.f128992c = str;
        this.f128990a = nativeCreate(this.f128992c, f128989d);
        if (this.f128990a == 0) {
            StringBuilder sb = new StringBuilder("Cursor window allocation of ");
            sb.append(f128989d / PreloadTask.BYTE_UNIT_NUMBER);
            sb.append(" kb failed. ");
            throw new C51777g(sb.toString());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo107083a(int i, int i2) {
        mo107205d();
        try {
            return nativeGetType(this.f128990a, i - this.f128991b, i2);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: c */
    public final String mo107087c(int i, int i2) {
        mo107205d();
        try {
            return nativeGetString(this.f128990a, i - this.f128991b, i2);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: d */
    public final long mo107089d(int i, int i2) {
        mo107205d();
        try {
            return nativeGetLong(this.f128990a, i - this.f128991b, i2);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: e */
    public final double mo107091e(int i, int i2) {
        mo107205d();
        try {
            return nativeGetDouble(this.f128990a, i - this.f128991b, i2);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: b */
    public final byte[] mo107086b(int i, int i2) {
        mo107205d();
        try {
            return nativeGetBlob(this.f128990a, i - this.f128991b, i2);
        } finally {
            mo107206e();
        }
    }
}
