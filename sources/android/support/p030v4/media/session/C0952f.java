package android.support.p030v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.media.session.C0949e.C0950a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.media.session.f */
final class C0952f {

    /* renamed from: android.support.v4.media.session.f$a */
    public interface C0953a extends C0950a {
    }

    /* renamed from: android.support.v4.media.session.f$b */
    static class C0954b<T extends C0953a> extends C0951b<T> {
        public final void onPrepare() {
        }

        public C0954b(T t) {
            super(t);
        }

        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }

        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }

        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }
    }

    /* renamed from: a */
    public static String m2798a(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
