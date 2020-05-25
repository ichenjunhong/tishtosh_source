package android.support.p030v4.media;

import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import java.util.List;

/* renamed from: android.support.v4.media.a */
final class C0876a {

    /* renamed from: android.support.v4.media.a$a */
    interface C0877a {
        /* renamed from: a */
        void mo2693a();

        /* renamed from: b */
        void mo2694b();

        /* renamed from: c */
        void mo2695c();
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0878b<T extends C0877a> extends ConnectionCallback {

        /* renamed from: a */
        protected final T f2951a;

        public final void onConnected() {
            this.f2951a.mo2693a();
        }

        public final void onConnectionFailed() {
            this.f2951a.mo2695c();
        }

        public final void onConnectionSuspended() {
            this.f2951a.mo2694b();
        }

        public C0878b(T t) {
            this.f2951a = t;
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    interface C0879c {
        /* renamed from: a */
        void mo2712a(String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$d */
    static class C0880d<T extends C0879c> extends SubscriptionCallback {

        /* renamed from: a */
        protected final T f2952a;

        public void onError(String str) {
        }

        public C0880d(T t) {
            this.f2952a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f2952a.mo2712a(str, list);
        }
    }

    /* renamed from: a */
    public static Object m2467a(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }
}
