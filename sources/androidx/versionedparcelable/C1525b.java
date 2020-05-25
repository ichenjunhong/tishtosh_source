package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.b */
final class C1525b extends C1524a {

    /* renamed from: a */
    private final SparseIntArray f5477a;

    /* renamed from: b */
    private final Parcel f5478b;

    /* renamed from: c */
    private final int f5479c;

    /* renamed from: d */
    private final int f5480d;

    /* renamed from: e */
    private final String f5481e;

    /* renamed from: f */
    private int f5482f;

    /* renamed from: g */
    private int f5483g;

    /* renamed from: c */
    public final int mo5895c() {
        return this.f5478b.readInt();
    }

    /* renamed from: d */
    public final String mo5897d() {
        return this.f5478b.readString();
    }

    /* renamed from: f */
    public final <T extends Parcelable> T mo5899f() {
        return this.f5478b.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: e */
    public final byte[] mo5898e() {
        int readInt = this.f5478b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5478b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: a */
    public final void mo5877a() {
        if (this.f5482f >= 0) {
            int i = this.f5477a.get(this.f5482f);
            int dataPosition = this.f5478b.dataPosition();
            int i2 = dataPosition - i;
            this.f5478b.setDataPosition(i);
            this.f5478b.writeInt(i2);
            this.f5478b.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C1524a mo5890b() {
        int i;
        Parcel parcel = this.f5478b;
        int dataPosition = this.f5478b.dataPosition();
        if (this.f5483g == this.f5479c) {
            i = this.f5480d;
        } else {
            i = this.f5483g;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5481e);
        sb.append("  ");
        return new C1525b(parcel, dataPosition, i, sb.toString());
    }

    /* renamed from: a */
    public final void mo5878a(int i) {
        this.f5478b.writeInt(i);
    }

    C1525b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    /* renamed from: a */
    public final void mo5880a(Parcelable parcelable) {
        this.f5478b.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public final void mo5884a(String str) {
        this.f5478b.writeString(str);
    }

    /* renamed from: c */
    public final void mo5896c(int i) {
        mo5877a();
        this.f5482f = i;
        this.f5477a.put(i, this.f5478b.dataPosition());
        mo5878a(0);
        mo5878a(i);
    }

    /* renamed from: a */
    public final void mo5886a(byte[] bArr) {
        if (bArr != null) {
            this.f5478b.writeInt(bArr.length);
            this.f5478b.writeByteArray(bArr);
            return;
        }
        this.f5478b.writeInt(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5893b(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.f5483g
            int r1 = r4.f5480d
            r2 = -1
            if (r0 >= r1) goto L_0x0028
            android.os.Parcel r0 = r4.f5478b
            int r1 = r4.f5483g
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.f5478b
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.f5478b
            int r1 = r1.readInt()
            int r3 = r4.f5483g
            int r3 = r3 + r0
            r4.f5483g = r3
            if (r1 != r5) goto L_0x0000
            android.os.Parcel r5 = r4.f5478b
            int r5 = r5.dataPosition()
            goto L_0x0029
        L_0x0028:
            r5 = -1
        L_0x0029:
            if (r5 != r2) goto L_0x002d
            r5 = 0
            return r5
        L_0x002d:
            android.os.Parcel r0 = r4.f5478b
            r0.setDataPosition(r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.versionedparcelable.C1525b.mo5893b(int):boolean");
    }

    private C1525b(Parcel parcel, int i, int i2, String str) {
        this.f5477a = new SparseIntArray();
        this.f5482f = -1;
        this.f5483g = 0;
        this.f5478b = parcel;
        this.f5479c = i;
        this.f5480d = i2;
        this.f5483g = this.f5479c;
        this.f5481e = str;
    }
}
