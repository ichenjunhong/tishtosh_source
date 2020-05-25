package com.tencent.wcdb.repair;

import android.database.Cursor;
import com.tencent.wcdb.C51742a;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.C51787a.C51788a;

public class RepairKit implements C51788a {

    /* renamed from: a */
    public long f129178a;

    /* renamed from: b */
    public int f129179b;

    /* renamed from: c */
    public C51786b f129180c;

    /* renamed from: d */
    public C51785a f129181d;

    /* renamed from: e */
    public RepairCursor f129182e;

    static class RepairCursor extends C51742a {

        /* renamed from: i */
        long f129183i;

        private RepairCursor() {
        }

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        public int getColumnCount() {
            return nativeGetColumnCount(this.f129183i);
        }

        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        public int getCount() {
            throw new UnsupportedOperationException();
        }

        public byte[] getBlob(int i) {
            return nativeGetBlob(this.f129183i, i);
        }

        public double getDouble(int i) {
            return nativeGetDouble(this.f129183i, i);
        }

        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        public int getInt(int i) {
            return (int) getLong(i);
        }

        public long getLong(int i) {
            return nativeGetLong(this.f129183i, i);
        }

        public short getShort(int i) {
            return (short) ((int) getLong(i));
        }

        public String getString(int i) {
            return nativeGetString(this.f129183i, i);
        }

        public int getType(int i) {
            return nativeGetType(this.f129183i, i);
        }

        public boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$a */
    public interface C51785a {
        /* renamed from: a */
        int mo20986a(String str, int i, Cursor cursor);
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$b */
    public static class C51786b {

        /* renamed from: a */
        public long f129184a;

        /* renamed from: b */
        public byte[] f129185b;

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            mo107259a();
            super.finalize();
        }

        /* renamed from: a */
        public final void mo107259a() {
            if (this.f129184a != 0) {
                RepairKit.nativeFreeMaster(this.f129184a);
                this.f129184a = 0;
            }
        }

        public C51786b(long j, byte[] bArr) {
            this.f129184a = j;
            this.f129185b = bArr;
        }
    }

    private static native void nativeCancel(long j);

    private static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    public static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    public native int nativeOutput(long j, long j2, long j3, int i);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo107252a();
        super.finalize();
    }

    /* renamed from: b */
    public final void mo107159b() {
        if (this.f129178a != 0) {
            nativeCancel(this.f129178a);
        }
    }

    /* renamed from: a */
    public final void mo107252a() {
        if (this.f129180c != null) {
            this.f129180c.mo107259a();
            this.f129180c = null;
        }
        if (this.f129178a != 0) {
            nativeFini(this.f129178a);
            this.f129178a = 0;
        }
    }

    private int onProgress(String str, int i, long j) {
        if (this.f129181d == null) {
            return 0;
        }
        if (this.f129182e == null) {
            this.f129182e = new RepairCursor();
        }
        this.f129182e.f129183i = j;
        return this.f129181d.mo20986a(str, i, this.f129182e);
    }

    public RepairKit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C51786b bVar) {
        byte[] bArr2;
        if (str != null) {
            if (bVar == null) {
                bArr2 = null;
            } else {
                bArr2 = bVar.f129185b;
            }
            this.f129178a = nativeInit(str, bArr, null, bArr2);
            if (this.f129178a != 0) {
                this.f129179b = nativeIntegrityFlags(this.f129178a);
                this.f129180c = bVar;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }
}
