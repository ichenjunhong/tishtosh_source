package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C15521l;
import java.io.DataInputStream;
import java.io.IOException;

@C16299uq
public final class zzaxu extends AbstractSafeParcelable {
    public static final Creator<zzaxu> CREATOR = new C16339wc();

    /* renamed from: a */
    private ParcelFileDescriptor f46211a;

    /* renamed from: b */
    private Parcelable f46212b;

    /* renamed from: c */
    private boolean f46213c;

    public zzaxu(ParcelFileDescriptor parcelFileDescriptor) {
        this.f46211a = parcelFileDescriptor;
        this.f46213c = true;
    }

    public zzaxu(SafeParcelable safeParcelable) {
        this.f46212b = safeParcelable;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo31582a(Creator<T> creator) {
        if (this.f46213c) {
            if (this.f46211a == null) {
                abv.m32794c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f46211a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C15521l.m32290a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f46212b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f46213c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                abv.m32793b("Could not read from parcel file descriptor", e);
                C15521l.m32290a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C15521l.m32290a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f46212b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m39272a();
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f46211a, i, false);
        C15469b.m32197c(parcel, a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final ParcelFileDescriptor m39272a() {
        if (this.f46211a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f46212b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f46211a = m39273a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f46211a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m39273a(byte[] bArr) {
        AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C16338wb(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                abv.m32793b("Error transporting the ad response", e);
                C14963ax.m30834d().mo28588a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C15521l.m32290a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            abv.m32793b("Error transporting the ad response", e);
            C14963ax.m30834d().mo28588a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C15521l.m32290a(autoCloseOutputStream);
            return null;
        }
    }
}
