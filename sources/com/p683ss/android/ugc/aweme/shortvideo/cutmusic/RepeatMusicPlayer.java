package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.util.C47625i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer */
public class RepeatMusicPlayer implements C0183j {

    /* renamed from: a */
    public MediaPlayer f109186a;

    /* renamed from: b */
    public int f109187b;

    /* renamed from: c */
    public Handler f109188c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public Runnable f109189d = new Runnable() {
        public final void run() {
            if (RepeatMusicPlayer.this.f109186a != null && RepeatMusicPlayer.this.f109186a.isPlaying()) {
                int currentPosition = RepeatMusicPlayer.this.f109186a.getCurrentPosition();
                if (currentPosition <= RepeatMusicPlayer.this.f109186a.getDuration()) {
                    if (RepeatMusicPlayer.this.f109190e != null) {
                        RepeatMusicPlayer.this.f109190e.mo87784c(currentPosition);
                    }
                    RepeatMusicPlayer.this.f109188c.post(RepeatMusicPlayer.this.f109189d);
                }
            }
        }
    };

    /* renamed from: e */
    public C43185a f109190e;

    /* renamed from: f */
    private int f109191f;

    /* renamed from: g */
    private Runnable f109192g;

    /* renamed from: h */
    private Handler f109193h = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer$a */
    public interface C43185a {
        /* renamed from: c */
        void mo87784c(int i);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f109193h.removeCallbacksAndMessages(null);
        this.f109188c.removeCallbacksAndMessages(null);
        mo87777a();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void pause() {
        if (this.f109186a != null && this.f109186a.isPlaying()) {
            this.f109186a.pause();
        }
        this.f109188c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo87777a() {
        C47625i.m103103a("stopMusic() called");
        if (this.f109186a != null) {
            if (this.f109186a.isPlaying()) {
                this.f109186a.pause();
            }
            this.f109186a.stop();
            this.f109186a.release();
            this.f109186a = null;
        }
        this.f109188c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo87778a(final int i) {
        this.f109187b = i;
        C47625i.m103103a("playMusic() called");
        if (this.f109186a != null) {
            if (this.f109186a.isPlaying()) {
                this.f109186a.pause();
            }
            if (this.f109192g != null) {
                this.f109193h.removeCallbacks(this.f109192g);
            }
            this.f109192g = new Runnable() {
                public final void run() {
                    if (RepeatMusicPlayer.this.f109186a != null) {
                        if (RepeatMusicPlayer.this.f109186a.isPlaying()) {
                            RepeatMusicPlayer.this.f109186a.pause();
                        }
                        RepeatMusicPlayer.this.mo87778a(i);
                    }
                }
            };
            this.f109186a.seekTo(i);
            this.f109193h.postDelayed(this.f109192g, (long) this.f109191f);
            this.f109186a.start();
            if (this.f109189d != null) {
                this.f109188c.removeCallbacks(this.f109189d);
            }
            this.f109188c.post(this.f109189d);
        }
    }

    public RepeatMusicPlayer(AmeActivity ameActivity, String str, int i) {
        this.f109191f = i;
        ameActivity.getLifecycle().mo324a(this);
        this.f109186a = MediaPlayer.create(ameActivity, Uri.parse(str));
        if (this.f109186a != null) {
            this.f109186a.setAudioStreamType(3);
            this.f109186a.setDisplay(null);
            this.f109186a.setOnCompletionListener(new OnCompletionListener() {
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    RepeatMusicPlayer.this.mo87778a(RepeatMusicPlayer.this.f109187b);
                }
            });
        }
    }
}
