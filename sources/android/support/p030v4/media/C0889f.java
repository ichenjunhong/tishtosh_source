package android.support.p030v4.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: android.support.v4.media.f */
public final class C0889f {

    /* renamed from: a */
    static final boolean f2957a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b */
    private static final Object f2958b = new Object();

    /* renamed from: android.support.v4.media.f$a */
    public static final class C0890a {

        /* renamed from: a */
        C0891b f2959a;

        public final int hashCode() {
            return this.f2959a.hashCode();
        }

        public C0890a(RemoteUserInfo remoteUserInfo) {
            this.f2959a = new C0894a(remoteUserInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0890a)) {
                return false;
            }
            return this.f2959a.equals(((C0890a) obj).f2959a);
        }

        public C0890a(String str, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f2959a = new C0894a(str, i, i2);
            } else {
                this.f2959a = new C0896a(str, i, i2);
            }
        }
    }

    /* renamed from: android.support.v4.media.f$b */
    interface C0891b {
    }
}
