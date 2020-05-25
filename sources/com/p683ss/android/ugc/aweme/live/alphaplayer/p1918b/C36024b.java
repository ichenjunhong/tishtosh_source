package com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.Surface;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1917a.C36021a;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.b.b */
public class C36024b extends C36023a<C36024b> {

    /* renamed from: a */
    private MediaPlayer f92345a = new MediaPlayer();

    /* renamed from: b */
    private MediaMetadataRetriever f92346b = new MediaMetadataRetriever();

    /* renamed from: c */
    private String f92347c;

    /* renamed from: d */
    private OnCompletionListener f92348d = new OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (C36024b.this.f92341h != null) {
                C36024b.this.f92341h.mo74772a(C36024b.this.f92339f);
            }
        }
    };

    /* renamed from: e */
    private OnPreparedListener f92349e = new OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C36024b.this.f92342i != null) {
                C36024b.this.f92342i.mo74774a(C36024b.this.f92339f);
            }
        }
    };

    /* renamed from: l */
    private OnErrorListener f92350l = new OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (C36024b.this.f92343j != null) {
                C36024b.this.f92343j.mo74775a(C36024b.this.f92339f, i, i2, "");
            }
            return false;
        }
    };

    /* renamed from: m */
    private OnInfoListener f92351m = new OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3 && C36024b.this.f92344k != null) {
                C36024b.this.f92344k.mo74771a(C36024b.this.f92339f);
            }
            return false;
        }
    };

    /* renamed from: i */
    public final String mo13773i() {
        return "DefaultSystemPlayer";
    }

    /* renamed from: b */
    public final void mo13765b() {
        this.f92345a.prepareAsync();
    }

    /* renamed from: c */
    public final void mo13767c() {
        this.f92345a.start();
    }

    /* renamed from: d */
    public final void mo13768d() {
        this.f92345a.pause();
    }

    /* renamed from: e */
    public final void mo13769e() {
        this.f92345a.stop();
    }

    /* renamed from: f */
    public final void mo13770f() {
        this.f92345a.reset();
        this.f92347c = null;
    }

    /* renamed from: g */
    public final void mo13771g() {
        this.f92345a.release();
        this.f92347c = null;
    }

    public C36024b() {
        this.f92345a.setOnCompletionListener(this.f92348d);
        this.f92345a.setOnPreparedListener(this.f92349e);
        this.f92345a.setOnErrorListener(this.f92350l);
        this.f92345a.setOnInfoListener(this.f92351m);
    }

    /* renamed from: h */
    public final C36021a mo13772h() throws Exception {
        if (!TextUtils.isEmpty(this.f92347c)) {
            this.f92346b.setDataSource(this.f92347c);
            String extractMetadata = this.f92346b.extractMetadata(18);
            String extractMetadata2 = this.f92346b.extractMetadata(19);
            if (!TextUtils.isEmpty(extractMetadata) && !TextUtils.isEmpty(extractMetadata2)) {
                return new C36021a(Integer.parseInt(this.f92346b.extractMetadata(18)), Integer.parseInt(this.f92346b.extractMetadata(19)));
            }
            throw new Exception("retriever get metadata failure");
        }
        throw new Exception("dataSource is null, please set setDataSource firstly");
    }

    /* renamed from: a */
    public final void mo13762a(Surface surface) {
        this.f92345a.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo13763a(String str) throws IOException {
        this.f92347c = str;
        this.f92345a.setDataSource(str);
    }

    /* renamed from: b */
    public final void mo13766b(boolean z) {
        this.f92345a.setScreenOnWhilePlaying(z);
    }

    /* renamed from: a */
    public final void mo13764a(boolean z) {
        this.f92345a.setLooping(false);
    }
}
