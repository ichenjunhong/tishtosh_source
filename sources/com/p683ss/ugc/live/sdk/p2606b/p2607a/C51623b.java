package com.p683ss.ugc.live.sdk.p2606b.p2607a;

import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.ttm.player.TTMediaPlayer;
import com.p683ss.ttm.player.TTPlayerConfiger;
import com.p683ss.ugc.live.sdk.p2606b.C51619a;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51628a;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.b.a.b */
final class C51623b extends C51619a {

    /* renamed from: a */
    private static final SparseIntArray f128930a;

    /* renamed from: b */
    private final Context f128931b;

    /* renamed from: c */
    private final TTMediaPlayer f128932c;

    /* renamed from: d */
    private final C51625d f128933d;

    /* renamed from: e */
    private C51628a f128934e;

    /* renamed from: e */
    public final void mo78962e() {
        this.f128932c.release();
    }

    /* renamed from: f */
    public final boolean mo78963f() {
        return this.f128932c.isPlaying();
    }

    /* renamed from: j */
    public final void mo105564j() {
        this.f128932c.start();
    }

    /* renamed from: k */
    public final void mo105565k() {
        this.f128932c.pause();
    }

    /* renamed from: l */
    public final void mo105566l() {
        this.f128932c.stop();
    }

    /* renamed from: g */
    public final long mo78964g() {
        return this.f128932c.getLongOption(72, 0);
    }

    /* renamed from: h */
    public final long mo78965h() {
        return this.f128932c.getLongOption(73, 0);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f128930a = sparseIntArray;
        sparseIntArray.put(0, 0);
        f128930a.put(1, 1);
        f128930a.put(2, 2);
        f128930a.put(3, 3);
    }

    /* renamed from: i */
    public final void mo105563i() {
        this.f128932c.setIntOption(38, 0);
        this.f128932c.setIntOption(87, 1);
        TTPlayerConfiger.setValue(11, true);
        this.f128932c.prepareAsync();
    }

    /* renamed from: a */
    public final void mo78955a(Surface surface) {
        this.f128932c.setSurface(surface);
        this.f128932c.setScreenOnWhilePlaying(true);
    }

    /* renamed from: b */
    public final void mo105562b(C51628a aVar) {
        if (this.f128933d != null) {
            this.f128933d.f128939a = aVar;
        } else {
            this.f128934e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo78956a(SurfaceHolder surfaceHolder) {
        this.f128932c.setDisplay(surfaceHolder);
        this.f128932c.setScreenOnWhilePlaying(true);
    }

    /* renamed from: a */
    public final void mo105561a(String str, Map<String, String> map) throws IOException {
        Uri uri;
        try {
            if (str.indexOf("://") <= 0) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                uri = Uri.parse(sb.toString());
            } else {
                uri = Uri.parse(str);
            }
            this.f128932c.setDataSource(this.f128931b, uri, map);
        } catch (IOException unused) {
        }
    }

    C51623b(C51624c cVar, TTMediaPlayer tTMediaPlayer) {
        super(new C51622a(cVar.f128937c, tTMediaPlayer));
        this.f128931b = cVar.f128935a;
        this.f128932c = tTMediaPlayer;
        this.f128933d = new C51625d(tTMediaPlayer);
        if (this.f128934e != null) {
            this.f128933d.f128939a = this.f128934e;
            this.f128934e = null;
        }
        tTMediaPlayer.setOnPreparedListener(this.f128933d);
        tTMediaPlayer.setOnErrorListener(this.f128933d);
        tTMediaPlayer.setOnInfoListener(this.f128933d);
        tTMediaPlayer.setOnLogListener(this.f128933d);
        tTMediaPlayer.setOnCompletionListener(this.f128933d);
        tTMediaPlayer.setOnVideoSizeChangedListener(this.f128933d);
        tTMediaPlayer.setOnExternInfoListener(this.f128933d);
        tTMediaPlayer.setIntOption(52, 1);
        tTMediaPlayer.setIntOption(24, 5);
    }
}
