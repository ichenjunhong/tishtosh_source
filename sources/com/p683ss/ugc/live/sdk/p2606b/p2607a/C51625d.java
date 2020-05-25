package com.p683ss.ugc.live.sdk.p2606b.p2607a;

import com.bytedance.common.utility.C9415i;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnLogListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p683ss.ttm.player.TTMediaPlayer;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51628a;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51629b;

/* renamed from: com.ss.ugc.live.sdk.b.a.d */
final class C51625d implements OnCompletionListener, OnErrorListener, OnExternInfoListener, OnInfoListener, OnLogListener, OnPreparedListener, OnVideoSizeChangedListener {

    /* renamed from: a */
    public C51628a f128939a;

    /* renamed from: b */
    private final TTMediaPlayer f128940b;

    /* renamed from: c */
    private final boolean f128941c = C9415i.m18635b();

    public final void onLogInfo(MediaPlayer mediaPlayer, String str) {
    }

    C51625d(TTMediaPlayer tTMediaPlayer) {
        this.f128940b = tTMediaPlayer;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        m110834a(C51629b.PLAY_COMPLETED, 0, "play complete");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        m110834a(C51629b.PREPARED, 0, "player is prepared");
    }

    /* renamed from: a */
    private void m110834a(C51629b bVar, int i, String str) {
        if (this.f128939a != null) {
            this.f128939a.mo78953a(bVar, i, str);
        }
    }

    public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
        if (19 == i) {
            m110834a(C51629b.SEI_UPDATE, 0, str);
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        C51629b bVar = C51629b.VIDEO_SIZE_CHANGED;
        int i3 = (i2 << 16) | i;
        StringBuilder sb = new StringBuilder("videoSizeChanged, width: ");
        sb.append(i);
        sb.append(", height: ");
        sb.append(i2);
        m110834a(bVar, i3, sb.toString());
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C51629b bVar = C51629b.MEDIA_ERROR;
        StringBuilder sb = new StringBuilder("play error.code:");
        sb.append(i2);
        m110834a(bVar, i, sb.toString());
        if (i != 0) {
            C51629b bVar2 = C51629b.PREPARE_FAILED;
            StringBuilder sb2 = new StringBuilder("prepare failed.code:");
            sb2.append(i2);
            m110834a(bVar2, i, sb2.toString());
            if (this.f128941c) {
                this.f128940b.getStringOption(5002);
            }
        }
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            switch (i) {
                case 701:
                    m110834a(C51629b.BUFFERING_START, 0, "player start buffer");
                    break;
                case 702:
                    m110834a(C51629b.BUFFERING_END, 0, "player end buffer");
                    break;
            }
        } else {
            m110834a(C51629b.RENDERING_START, 0, "player start render");
        }
        return false;
    }
}
