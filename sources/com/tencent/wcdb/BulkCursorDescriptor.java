package com.tencent.wcdb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BulkCursorDescriptor implements Parcelable {
    public static final Creator<BulkCursorDescriptor> CREATOR = new Creator<BulkCursorDescriptor>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BulkCursorDescriptor[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C51781k kVar;
            BulkCursorDescriptor bulkCursorDescriptor = new BulkCursorDescriptor();
            IBinder readStrongBinder = parcel.readStrongBinder();
            String[] strArr = null;
            if (readStrongBinder == null) {
                kVar = null;
            } else {
                kVar = (C51781k) readStrongBinder.queryLocalInterface("android.content.IBulkCursor");
                if (kVar == null) {
                    kVar = new C51745c(readStrongBinder);
                }
            }
            bulkCursorDescriptor.f128984a = kVar;
            int readInt = parcel.readInt();
            boolean z = false;
            if (readInt >= 0) {
                strArr = new String[readInt];
                for (int i = 0; i < readInt; i++) {
                    strArr[i] = parcel.readString();
                }
            }
            bulkCursorDescriptor.f128985b = strArr;
            if (parcel.readInt() != 0) {
                z = true;
            }
            bulkCursorDescriptor.f128986c = z;
            bulkCursorDescriptor.f128987d = parcel.readInt();
            if (parcel.readInt() != 0) {
                bulkCursorDescriptor.f128988e = (CursorWindow) CursorWindow.CREATOR.createFromParcel(parcel);
            }
            return bulkCursorDescriptor;
        }
    };

    /* renamed from: a */
    public C51781k f128984a;

    /* renamed from: b */
    public String[] f128985b;

    /* renamed from: c */
    public boolean f128986c;

    /* renamed from: d */
    public int f128987d;

    /* renamed from: e */
    public CursorWindow f128988e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f128984a.asBinder());
        parcel.writeStringArray(this.f128985b);
        parcel.writeInt(this.f128986c ? 1 : 0);
        parcel.writeInt(this.f128987d);
        if (this.f128988e != null) {
            parcel.writeInt(1);
            this.f128988e.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
    }
}
