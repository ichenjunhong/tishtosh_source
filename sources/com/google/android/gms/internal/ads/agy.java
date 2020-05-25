package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14963ax;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@C16299uq
public final class agy extends ahk implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {

    /* renamed from: d */
    private static final Map<Integer, String> f40452d = new HashMap();
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public ahi f40453a;

    /* renamed from: e */
    private final aic f40454e;

    /* renamed from: f */
    private final boolean f40455f;

    /* renamed from: g */
    private int f40456g;

    /* renamed from: h */
    private int f40457h;

    /* renamed from: i */
    private MediaPlayer f40458i;

    /* renamed from: j */
    private Uri f40459j;

    /* renamed from: k */
    private int f40460k;

    /* renamed from: l */
    private int f40461l;

    /* renamed from: m */
    private int f40462m;

    /* renamed from: n */
    private int f40463n;

    /* renamed from: o */
    private int f40464o;

    /* renamed from: p */
    private ahz f40465p;

    /* renamed from: q */
    private boolean f40466q;

    /* renamed from: r */
    private int f40467r;

    public agy(Context context, boolean z, boolean z2, aia aia, aic aic) {
        super(context);
        setSurfaceTextureListener(this);
        this.f40454e = aic;
        this.f40466q = z;
        this.f40455f = z2;
        this.f40454e.mo28950a(this);
    }

    /* renamed from: a */
    public final String mo28841a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f40466q ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo28844a(ahi ahi) {
        this.f40453a = ahi;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzwr a = zzwr.m39298a(parse);
        if (a == null || a.f46307a != null) {
            if (a != null) {
                parse = Uri.parse(a.f46307a);
            }
            this.f40459j = parse;
            this.f40467r = 0;
            m32874f();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo28845b() {
        abv.m32494a("AdMediaPlayerView stop");
        if (this.f40458i != null) {
            this.f40458i.stop();
            this.f40458i.release();
            this.f40458i = null;
            m32876g(0);
            this.f40457h = 0;
        }
        this.f40454e.mo28951b();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        abv.m32494a(sb.toString());
        this.f40460k = mediaPlayer.getVideoWidth();
        this.f40461l = mediaPlayer.getVideoHeight();
        if (this.f40460k != 0 && this.f40461l != 0) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        abv.m32494a("AdMediaPlayerView prepared");
        m32876g(2);
        this.f40454e.mo28949a();
        acd.f40245a.post(new aha(this));
        this.f40460k = mediaPlayer.getVideoWidth();
        this.f40461l = mediaPlayer.getVideoHeight();
        if (this.f40467r != 0) {
            mo28843a(this.f40467r);
        }
        m32875g();
        int i = this.f40460k;
        int i2 = this.f40461l;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        abv.m32796d(sb.toString());
        if (this.f40457h == 3) {
            mo28846c();
        }
        mo28848e();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        abv.m32494a("AdMediaPlayerView completion");
        m32876g(5);
        this.f40457h = 5;
        acd.f40245a.post(new ahb(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f40452d.get(Integer.valueOf(i));
        String str2 = (String) f40452d.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        abv.m32494a(sb.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f40452d.get(Integer.valueOf(i));
        String str2 = (String) f40452d.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        abv.m32798e(sb.toString());
        m32876g(-1);
        this.f40457h = -1;
        acd.f40245a.post(new ahc(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f40462m = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        abv.m32494a("AdMediaPlayerView surface created");
        m32874f();
        acd.f40245a.post(new ahd(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        abv.m32494a("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.f40457h == 3;
        if (this.f40460k == i && this.f40461l == i2) {
            z = true;
        }
        if (this.f40458i != null && z2 && z) {
            if (this.f40467r != 0) {
                mo28843a(this.f40467r);
            }
            mo28846c();
        }
        if (this.f40465p != null) {
            this.f40465p.mo28924a(i, i2);
        }
        acd.f40245a.post(new ahe(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        abv.m32494a("AdMediaPlayerView surface destroyed");
        if (this.f40458i != null && this.f40467r == 0) {
            this.f40467r = this.f40458i.getCurrentPosition();
        }
        if (this.f40465p != null) {
            this.f40465p.mo28926b();
        }
        acd.f40245a.post(new ahf(this));
        m32873a(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40454e.mo28952b(this);
        this.f40482b.mo28915a(surfaceTexture, this.f40453a);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        abv.m32494a(sb.toString());
        acd.f40245a.post(new agz(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r1 > r6) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f40460k
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f40461l
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f40460k
            if (r2 <= 0) goto L_0x0096
            int r2 = r5.f40461l
            if (r2 <= 0) goto L_0x0096
            com.google.android.gms.internal.ads.ahz r2 = r5.f40465p
            if (r2 != 0) goto L_0x0096
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0055
            if (r1 != r2) goto L_0x0055
            int r0 = r5.f40460k
            int r0 = r0 * r7
            int r1 = r5.f40461l
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x0042
            int r6 = r5.f40460k
            int r6 = r6 * r7
            int r0 = r5.f40461l
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0098
        L_0x0042:
            int r0 = r5.f40460k
            int r0 = r0 * r7
            int r1 = r5.f40461l
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0098
            int r7 = r5.f40461l
            int r7 = r7 * r6
            int r0 = r5.f40460k
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0055:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0067
            int r0 = r5.f40461l
            int r0 = r0 * r6
            int r2 = r5.f40460k
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0065
            if (r0 <= r7) goto L_0x0065
            goto L_0x0098
        L_0x0065:
            r7 = r0
            goto L_0x0098
        L_0x0067:
            if (r1 != r2) goto L_0x0077
            int r1 = r5.f40460k
            int r1 = r1 * r7
            int r2 = r5.f40461l
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            r6 = r1
            goto L_0x0098
        L_0x0077:
            int r2 = r5.f40460k
            int r4 = r5.f40461l
            if (r1 != r3) goto L_0x0087
            if (r4 <= r7) goto L_0x0087
            int r1 = r5.f40460k
            int r1 = r1 * r7
            int r2 = r5.f40461l
            int r1 = r1 / r2
            goto L_0x0089
        L_0x0087:
            r1 = r2
            r7 = r4
        L_0x0089:
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            int r7 = r5.f40461l
            int r7 = r7 * r6
            int r0 = r5.f40460k
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            r7 = r1
        L_0x0098:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.ahz r0 = r5.f40465p
            if (r0 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.ahz r0 = r5.f40465p
            r0.mo28924a(r6, r7)
        L_0x00a4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00c1
            int r0 = r5.f40463n
            if (r0 <= 0) goto L_0x00b2
            int r0 = r5.f40463n
            if (r0 != r6) goto L_0x00ba
        L_0x00b2:
            int r0 = r5.f40464o
            if (r0 <= 0) goto L_0x00bd
            int r0 = r5.f40464o
            if (r0 == r7) goto L_0x00bd
        L_0x00ba:
            r5.m32875g()
        L_0x00bd:
            r5.f40463n = r6
            r5.f40464o = r7
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.agy.onMeasure(int, int):void");
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: f */
    private final void m32874f() {
        abv.m32494a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f40459j != null && surfaceTexture != null) {
            m32873a(false);
            try {
                this.f40458i = new MediaPlayer();
                this.f40458i.setOnBufferingUpdateListener(this);
                this.f40458i.setOnCompletionListener(this);
                this.f40458i.setOnErrorListener(this);
                this.f40458i.setOnInfoListener(this);
                this.f40458i.setOnPreparedListener(this);
                this.f40458i.setOnVideoSizeChangedListener(this);
                this.f40462m = 0;
                if (this.f40466q) {
                    this.f40465p = new ahz(getContext());
                    this.f40465p.mo28925a(surfaceTexture, getWidth(), getHeight());
                    this.f40465p.start();
                    SurfaceTexture c = this.f40465p.mo28927c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f40465p.mo28926b();
                        this.f40465p = null;
                    }
                }
                this.f40458i.setDataSource(getContext(), this.f40459j);
                this.f40458i.setSurface(new Surface(surfaceTexture));
                this.f40458i.setAudioStreamType(3);
                this.f40458i.setScreenOnWhilePlaying(true);
                this.f40458i.prepareAsync();
                m32876g(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f40459j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                abv.m32795c(sb.toString(), e);
                onError(this.f40458i, 1, 0);
            }
        }
    }

    /* renamed from: g */
    private final void m32875g() {
        if (this.f40455f && m32877h() && this.f40458i.getCurrentPosition() > 0 && this.f40457h != 3) {
            abv.m32494a("AdMediaPlayerView nudging MediaPlayer");
            m32872a(0.0f);
            this.f40458i.start();
            int currentPosition = this.f40458i.getCurrentPosition();
            long a = C14963ax.m30837g().mo28523a();
            while (m32877h() && this.f40458i.getCurrentPosition() == currentPosition) {
                if (C14963ax.m30837g().mo28523a() - a > 250) {
                    break;
                }
            }
            this.f40458i.pause();
            mo28848e();
        }
    }

    /* renamed from: a */
    private final void m32873a(boolean z) {
        abv.m32494a("AdMediaPlayerView release");
        if (this.f40465p != null) {
            this.f40465p.mo28926b();
            this.f40465p = null;
        }
        if (this.f40458i != null) {
            this.f40458i.reset();
            this.f40458i.release();
            this.f40458i = null;
            m32876g(0);
            if (z) {
                this.f40457h = 0;
                this.f40457h = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo28846c() {
        abv.m32494a("AdMediaPlayerView play");
        if (m32877h()) {
            this.f40458i.start();
            m32876g(3);
            this.f40482b.mo28914a();
            acd.f40245a.post(new ahg(this));
        }
        this.f40457h = 3;
    }

    /* renamed from: d */
    public final void mo28847d() {
        abv.m32494a("AdMediaPlayerView pause");
        if (m32877h() && this.f40458i.isPlaying()) {
            this.f40458i.pause();
            m32876g(4);
            acd.f40245a.post(new ahh(this));
        }
        this.f40457h = 4;
    }

    public final int getDuration() {
        if (m32877h()) {
            return this.f40458i.getDuration();
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (m32877h()) {
            return this.f40458i.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo28843a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        abv.m32494a(sb.toString());
        if (m32877h()) {
            this.f40458i.seekTo(i);
            this.f40467r = 0;
            return;
        }
        this.f40467r = i;
    }

    /* renamed from: h */
    private final boolean m32877h() {
        return (this.f40458i == null || this.f40456g == -1 || this.f40456g == 0 || this.f40456g == 1) ? false : true;
    }

    /* renamed from: a */
    public final void mo28842a(float f, float f2) {
        if (this.f40465p != null) {
            this.f40465p.mo28923a(f, f2);
        }
    }

    public final int getVideoWidth() {
        if (this.f40458i != null) {
            return this.f40458i.getVideoWidth();
        }
        return 0;
    }

    public final int getVideoHeight() {
        if (this.f40458i != null) {
            return this.f40458i.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo28848e() {
        m32872a(this.f40483c.mo28958a());
    }

    /* renamed from: a */
    private final void m32872a(float f) {
        if (this.f40458i != null) {
            try {
                this.f40458i.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            abv.m32798e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: g */
    private final void m32876g(int i) {
        if (i == 3) {
            this.f40454e.mo28953c();
            this.f40483c.mo28960b();
        } else if (this.f40456g == 3) {
            this.f40454e.mo28954d();
            this.f40483c.mo28961c();
        }
        this.f40456g = i;
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f40452d.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f40452d.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f40452d.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f40452d.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f40452d.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f40452d.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f40452d.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f40452d.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f40452d.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f40452d.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f40452d.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f40452d.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f40452d.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f40452d.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f40452d.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f40452d.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
