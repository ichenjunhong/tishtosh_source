package android.support.p030v4.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.support.p030v4.p038f.C0793j;

/* renamed from: android.support.v4.media.h */
final class C0893h extends C0892g {

    /* renamed from: android.support.v4.media.h$a */
    static final class C0894a implements C0891b {

        /* renamed from: a */
        final RemoteUserInfo f2960a;

        public final int hashCode() {
            return C0793j.m2263a(this.f2960a);
        }

        C0894a(RemoteUserInfo remoteUserInfo) {
            this.f2960a = remoteUserInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0894a)) {
                return false;
            }
            return this.f2960a.equals(((C0894a) obj).f2960a);
        }

        C0894a(String str, int i, int i2) {
            this.f2960a = new RemoteUserInfo(str, i, i2);
        }
    }
}
