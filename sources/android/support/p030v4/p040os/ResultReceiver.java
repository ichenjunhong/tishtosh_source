package android.support.p030v4.p040os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p030v4.p040os.C0961c.C0962a;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResultReceiver[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };

    /* renamed from: a */
    final boolean f3105a;

    /* renamed from: b */
    final Handler f3106b;

    /* renamed from: c */
    C0961c f3107c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0956a extends C0962a {
        C0956a() {
        }

        /* renamed from: a */
        public final void mo2937a(int i, Bundle bundle) {
            if (ResultReceiver.this.f3106b != null) {
                ResultReceiver.this.f3106b.post(new C0957b(i, bundle));
            } else {
                ResultReceiver.this.mo2680a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0957b implements Runnable {

        /* renamed from: a */
        final int f3109a;

        /* renamed from: b */
        final Bundle f3110b;

        public final void run() {
            ResultReceiver.this.mo2680a(this.f3109a, this.f3110b);
        }

        C0957b(int i, Bundle bundle) {
            this.f3109a = i;
            this.f3110b = bundle;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2680a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    ResultReceiver(Parcel parcel) {
        C0961c cVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0961c)) {
                cVar = new C0963a(readStrongBinder);
            } else {
                cVar = (C0961c) queryLocalInterface;
            }
        }
        this.f3107c = cVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3107c == null) {
                this.f3107c = new C0956a();
            }
            parcel.writeStrongBinder(this.f3107c.asBinder());
        }
    }

    /* renamed from: b */
    public final void mo2932b(int i, Bundle bundle) {
        if (!this.f3105a) {
            if (this.f3107c != null) {
                try {
                    this.f3107c.mo2937a(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        } else if (this.f3106b != null) {
            this.f3106b.post(new C0957b(i, bundle));
        } else {
            mo2680a(i, bundle);
        }
    }
}
