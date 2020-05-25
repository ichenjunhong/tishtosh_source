package p096cn.p097a.p098a.p099a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import p096cn.p097a.p098a.p099a.C2225c.C2226a;
import p096cn.p097a.p098a.p099a.C2225c.C2227b;
import p096cn.p097a.p098a.p099a.C2225c.C2228c;
import p096cn.p097a.p098a.p099a.C2225c.C2229d;
import p096cn.p097a.p098a.p099a.C2225c.C2230e;
import p096cn.p097a.p098a.p099a.C2225c.C2231f;
import p096cn.p097a.p098a.p099a.C2225c.C2232g;
import p096cn.p097a.p098a.p099a.C2225c.C2233h;

/* renamed from: cn.a.a.a.a */
public final class C2215a extends C2235e {

    /* renamed from: a */
    protected C2229d f7052a;

    /* renamed from: b */
    protected C2228c f7053b;

    /* renamed from: c */
    protected C2230e f7054c;

    /* renamed from: d */
    protected C2227b f7055d;

    /* renamed from: e */
    protected C2231f f7056e;

    /* renamed from: f */
    protected C2226a f7057f;

    /* renamed from: g */
    private MediaPlayer f7058g;

    /* renamed from: h */
    private C2225c f7059h;

    /* renamed from: cn.a.a.a.a$a */
    static class C2217a implements OnBufferingUpdateListener {

        /* renamed from: a */
        private C2226a f7061a;

        /* renamed from: b */
        private C2225c f7062b;

        public C2217a(C2226a aVar, C2225c cVar) {
            this.f7062b = cVar;
            this.f7061a = aVar;
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            this.f7061a.onBufferingUpdate(this.f7062b, i);
        }
    }

    /* renamed from: cn.a.a.a.a$b */
    static class C2218b implements OnCompletionListener {

        /* renamed from: a */
        private C2227b f7063a;

        /* renamed from: b */
        private C2225c f7064b;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f7063a.onCompletion(this.f7064b);
        }

        public C2218b(C2227b bVar, C2225c cVar) {
            this.f7064b = cVar;
            this.f7063a = bVar;
        }
    }

    /* renamed from: cn.a.a.a.a$c */
    static class C2219c implements OnErrorListener {

        /* renamed from: a */
        private C2228c f7065a;

        /* renamed from: b */
        private C2225c f7066b;

        public C2219c(C2228c cVar, C2225c cVar2) {
            this.f7066b = cVar2;
            this.f7065a = cVar;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f7065a.onError(this.f7066b, i, i2);
        }
    }

    /* renamed from: cn.a.a.a.a$d */
    static class C2220d implements OnInfoListener {

        /* renamed from: a */
        private C2229d f7067a;

        /* renamed from: b */
        private C2225c f7068b;

        public C2220d(C2229d dVar, C2225c cVar) {
            this.f7068b = cVar;
            this.f7067a = dVar;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f7067a.onInfo(this.f7068b, i, i2);
        }
    }

    /* renamed from: cn.a.a.a.a$e */
    static class C2221e implements OnPreparedListener {

        /* renamed from: a */
        private C2230e f7069a;

        /* renamed from: b */
        private C2225c f7070b;

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f7069a.onPrepared(this.f7070b);
        }

        public C2221e(C2230e eVar, C2225c cVar) {
            this.f7069a = eVar;
            this.f7070b = cVar;
        }
    }

    /* renamed from: cn.a.a.a.a$f */
    static class C2222f implements OnSeekCompleteListener {

        /* renamed from: a */
        private C2231f f7071a;

        /* renamed from: b */
        private C2225c f7072b;

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            this.f7071a.onSeekComplete(this.f7072b);
        }

        public C2222f(C2231f fVar, C2225c cVar) {
            this.f7071a = fVar;
            this.f7072b = cVar;
        }
    }

    /* renamed from: cn.a.a.a.a$g */
    static class C2223g implements OnVideoSizeChangedListener {

        /* renamed from: a */
        private C2232g f7073a;

        /* renamed from: b */
        private C2225c f7074b;

        public C2223g(C2232g gVar, C2225c cVar) {
            this.f7073a = gVar;
            this.f7074b = cVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f7073a.onVideoSizeChanged(this.f7074b, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo6588a(boolean z) {
        if (this.f7058g != null) {
            this.f7058g.setLooping(z);
        }
    }

    /* renamed from: a */
    public final void mo6579a(C2226a aVar) {
        this.f7057f = aVar;
        this.f7058g.setOnBufferingUpdateListener(new C2217a(aVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6580a(C2227b bVar) {
        this.f7055d = bVar;
        this.f7058g.setOnCompletionListener(new C2218b(bVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6581a(C2228c cVar) {
        this.f7053b = cVar;
        this.f7058g.setOnErrorListener(new C2219c(cVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6582a(C2229d dVar) {
        this.f7052a = dVar;
        this.f7058g.setOnInfoListener(new C2220d(dVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6583a(C2230e eVar) {
        this.f7054c = eVar;
        this.f7058g.setOnPreparedListener(new C2221e(eVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6584a(C2231f fVar) {
        this.f7056e = fVar;
        this.f7058g.setOnSeekCompleteListener(new C2222f(fVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6585a(C2232g gVar) {
        this.f7058g.setOnVideoSizeChangedListener(new C2223g(gVar, this.f7059h));
    }

    /* renamed from: a */
    public final void mo6587a(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f7058g.setDataSource(str);
    }

    /* renamed from: a */
    public final void mo6586a(C2234d dVar) {
        PlaybackParams playbackParams = new PlaybackParams();
        dVar.mo6626b(dVar.f7082d);
        dVar.mo6625a(dVar.f7080b);
        dVar.mo6624a(dVar.f7081c);
        if (this.f7058g != null) {
            this.f7058g.setPlaybackParams(playbackParams);
        }
    }

    /* renamed from: a */
    public final void mo6571a() {
        if (this.f7058g != null) {
            this.f7058g.release();
        }
    }

    /* renamed from: b */
    public final void mo6589b() {
        if (this.f7058g != null) {
            this.f7058g.start();
        }
    }

    /* renamed from: c */
    public final void mo6592c() {
        if (this.f7058g != null) {
            this.f7058g.pause();
        }
    }

    /* renamed from: e */
    public final void mo6596e() {
        if (this.f7058g != null) {
            this.f7058g.stop();
        }
    }

    /* renamed from: f */
    public final void mo6597f() {
        if (this.f7058g != null) {
            try {
                this.f7058g.prepare();
            } catch (IllegalStateException unused) {
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: g */
    public final void mo6598g() {
        if (this.f7058g != null) {
            this.f7058g.prepareAsync();
        }
    }

    /* renamed from: h */
    public final int mo6599h() {
        if (this.f7058g != null) {
            return this.f7058g.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo6600i() {
        if (this.f7058g != null) {
            return this.f7058g.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo6601j() {
        if (this.f7058g != null) {
            return this.f7058g.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo6602k() {
        if (this.f7058g != null) {
            return this.f7058g.getDuration();
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean mo6603l() {
        if (this.f7058g != null) {
            return this.f7058g.isPlaying();
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo6604m() {
        if (this.f7058g != null) {
            return this.f7058g.isLooping();
        }
        return false;
    }

    /* renamed from: n */
    public final void mo6605n() {
        new Thread(new Runnable() {
            public final void run() {
                C2215a.this.mo6571a();
            }
        }).start();
    }

    /* renamed from: d */
    public final void mo6595d() {
        if (this.f7058g != null) {
            this.f7058g.reset();
        }
    }

    /* renamed from: o */
    public final C2233h[] mo6606o() {
        if (this.f7058g != null) {
            TrackInfo[] trackInfo = this.f7058g.getTrackInfo();
            if (trackInfo != null) {
                C2233h[] hVarArr = new C2233h[trackInfo.length];
                int length = trackInfo.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    hVarArr[i2] = new C2233h(trackInfo[i]);
                    i++;
                    i2 = i3;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo6594d(int i) {
        if (this.f7058g != null) {
            return this.f7058g.getSelectedTrack(i);
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo6590b(int i) {
        if (this.f7058g != null) {
            this.f7058g.selectTrack(i);
        }
    }

    /* renamed from: c */
    public final void mo6593c(int i) {
        if (this.f7058g != null) {
            this.f7058g.deselectTrack(i);
        }
    }

    /* renamed from: b */
    public final void mo6591b(boolean z) {
        if (this.f7058g != null) {
            this.f7058g.setScreenOnWhilePlaying(z);
        }
    }

    /* renamed from: a */
    public final void mo6573a(int i) {
        if (this.f7058g != null) {
            this.f7058g.seekTo(i);
        }
    }

    /* renamed from: a */
    public final void mo6577a(Surface surface) {
        this.f7058g.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo6578a(SurfaceHolder surfaceHolder) {
        if (this.f7058g != null && surfaceHolder != null && surfaceHolder.getSurface().isValid()) {
            try {
                this.f7058g.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo6574a(Context context, int i) {
        this.f7058g.setWakeMode(context, i);
    }

    /* renamed from: a */
    public static final synchronized C2215a m6688a(C2225c cVar, Context context) {
        C2215a aVar;
        synchronized (C2215a.class) {
            aVar = new C2215a();
            aVar.f7058g = new MediaPlayer();
            aVar.f7059h = null;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo6572a(float f, float f2) {
        if (this.f7058g != null) {
            this.f7058g.setVolume(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo6575a(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f7058g.setDataSource(context, uri);
    }

    /* renamed from: a */
    public final void mo6576a(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f7058g.setDataSource(context, uri, map);
    }
}
