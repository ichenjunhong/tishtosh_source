package android.support.p030v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.p030v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.b */
final class C0883b {

    /* renamed from: android.support.v4.media.b$a */
    interface C0884a extends C0879c {
        /* renamed from: a */
        void mo2713a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0885b<T extends C0884a> extends C0880d<T> {
        C0885b(T t) {
            super(t);
        }

        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }

        public final void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            ((C0884a) this.f2952a).mo2713a(str, list, bundle);
        }
    }
}
