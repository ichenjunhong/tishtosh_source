package com.bytedance.android.livesdk.gift.effect.video.p374a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1917a.C36021a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b.C36023a;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.TTPlayerConfiger;
import java.io.IOException;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.a */
public class C7435a extends C36023a<C7435a> {

    /* renamed from: l */
    private static final String f20398l = "a";

    /* renamed from: a */
    MediaPlayer f20399a;

    /* renamed from: b */
    OnPreparedListener f20400b = new OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C7435a.this.f92342i != null) {
                C7435a.this.f92342i.mo74774a(C7435a.this.f92339f);
            }
        }
    };

    /* renamed from: c */
    OnErrorListener f20401c = new OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C7435a.this.f92343j != null) {
                C7435a.this.f92343j.mo74775a(C7435a.this.f92339f, i, i2, "TTMediaPlayer on error");
            }
            return false;
        }
    };

    /* renamed from: d */
    OnCompletionListener f20402d = new OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (C7435a.this.f92341h != null) {
                C7435a.this.f92341h.mo74772a(C7435a.this.f92339f);
            }
        }
    };

    /* renamed from: e */
    OnInfoListener f20403e = new OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3 && C7435a.this.f92344k != null) {
                C7435a.this.f92344k.mo74771a(C7435a.this.f92339f);
            }
            return false;
        }
    };

    /* renamed from: m */
    private final Context f20404m;

    /* renamed from: i */
    public final String mo13773i() {
        return "TTMediaPlayer";
    }

    /* renamed from: c */
    public final void mo13767c() {
        this.f20399a.start();
    }

    /* renamed from: d */
    public final void mo13768d() {
        this.f20399a.pause();
    }

    /* renamed from: e */
    public final void mo13769e() {
        this.f20399a.stop();
    }

    /* renamed from: f */
    public final void mo13770f() {
        this.f20399a.reset();
    }

    /* renamed from: g */
    public final void mo13771g() {
        this.f20399a.release();
    }

    /* renamed from: b */
    public final void mo13765b() {
        super.mo13765b();
        this.f20399a.prepareAsync();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public MediaPlayer mo13761a() {
        TTPlayerConfiger.setValue(2, false);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return C7445d.m15380a(this.f20404m);
    }

    /* renamed from: h */
    public final C36021a mo13772h() throws Exception {
        return new C36021a(this.f20399a.getVideoWidth(), this.f20399a.getVideoHeight());
    }

    /* renamed from: a */
    public final void mo13762a(Surface surface) {
        this.f20399a.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo13764a(boolean z) {
        this.f20399a.setLooping(false);
    }

    /* renamed from: b */
    public final void mo13766b(boolean z) {
        super.mo13766b(z);
        this.f20399a.setScreenOnWhilePlaying(true);
    }

    public C7435a(Context context) {
        super(context);
        this.f20404m = context;
    }

    /* renamed from: a */
    public final void mo13763a(String str) throws IOException {
        super.mo13763a(str);
        if (this.f20399a.isPlaying()) {
            this.f20399a.stop();
        }
        this.f20399a.reset();
        this.f20399a.setDataSource(this.f20404m, Uri.parse(str));
    }
}
