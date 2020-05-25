package android.support.p030v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
final class C0943c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0944a {
        /* renamed from: a */
        void mo2785a();

        /* renamed from: a */
        void mo2786a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo2787a(Bundle bundle);

        /* renamed from: a */
        void mo2788a(CharSequence charSequence);

        /* renamed from: a */
        void mo2789a(Object obj);

        /* renamed from: a */
        void mo2790a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2791a(List<?> list);

        /* renamed from: b */
        void mo2792b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0945b<T extends C0944a> extends Callback {

        /* renamed from: a */
        protected final T f3103a;

        public final void onSessionDestroyed() {
            this.f3103a.mo2785a();
        }

        public C0945b(T t) {
            this.f3103a = t;
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f3103a.mo2792b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f3103a.mo2789a((Object) playbackState);
        }

        public final void onQueueChanged(List<QueueItem> list) {
            this.f3103a.mo2791a(list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f3103a.mo2788a(charSequence);
        }

        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            this.f3103a.mo2787a(bundle);
        }

        public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            int i;
            T t = this.f3103a;
            int playbackType = playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if ((audioAttributes.getFlags() & 1) != 1) {
                if ((audioAttributes.getFlags() & 4) != 4) {
                    switch (audioAttributes.getUsage()) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 13:
                            i = 1;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
            t.mo2786a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            this.f3103a.mo2790a(str, bundle);
        }
    }
}
