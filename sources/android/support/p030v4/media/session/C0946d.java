package android.support.p030v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: android.support.v4.media.session.d */
final class C0946d {

    /* renamed from: android.support.v4.media.session.d$a */
    interface C0947a {
        /* renamed from: a */
        void mo2820a(Object obj);

        /* renamed from: a */
        void mo2821a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2822a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo2823a(Intent intent);
    }

    /* renamed from: android.support.v4.media.session.d$b */
    static class C0948b<T extends C0947a> extends Callback {

        /* renamed from: a */
        protected final T f3104a;

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public C0948b(T t) {
            this.f3104a = t;
        }

        public void onSetRating(Rating rating) {
            this.f3104a.mo2820a((Object) rating);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f3104a.mo2823a(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            this.f3104a.mo2821a(str, bundle);
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m2523a(bundle);
            this.f3104a.mo2822a(str, bundle, resultReceiver);
        }
    }

    /* renamed from: a */
    public static Object m2793a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
