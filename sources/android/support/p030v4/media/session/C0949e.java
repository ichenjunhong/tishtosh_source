package android.support.p030v4.media.session;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.session.e */
final class C0949e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface C0950a extends C0947a {
    }

    /* renamed from: android.support.v4.media.session.e$b */
    static class C0951b<T extends C0950a> extends C0948b<T> {
        public C0951b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }
    }
}
