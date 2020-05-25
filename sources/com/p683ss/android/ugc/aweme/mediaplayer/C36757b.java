package com.p683ss.android.ugc.aweme.mediaplayer;

import android.content.Context;
import android.view.Surface;
import com.p683ss.android.medialib.player.IESMediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.b */
public final class C36757b implements C36756a {

    /* renamed from: a */
    private IESMediaPlayer f93936a;

    /* renamed from: b */
    private Context f93937b;

    /* renamed from: d */
    public final void mo75884d() {
        if (this.f93936a != null) {
            this.f93936a.release();
            this.f93936a = null;
        }
    }

    /* renamed from: e */
    public final long mo75885e() {
        if (this.f93936a != null) {
            return this.f93936a.getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo75886f() {
        if (this.f93936a != null) {
            return this.f93936a.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo75880b() {
        if (this.f93936a != null) {
            this.f93936a.resume();
        }
    }

    /* renamed from: c */
    public final void mo75883c() {
        if (this.f93936a != null) {
            this.f93936a.stop();
        }
    }

    /* renamed from: a */
    public final void mo75874a() {
        if (this.f93936a != null) {
            this.f93936a.pause();
        }
    }

    public C36757b(Context context) {
        this.f93937b = context;
        this.f93936a = new IESMediaPlayer(context);
    }

    /* renamed from: a */
    public final int mo75872a(long j) {
        if (this.f93936a != null) {
            return this.f93936a.seek(j);
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo75879b(long j) {
        if (this.f93936a != null) {
            return this.f93936a.seekLeft(j);
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo75882c(long j) {
        if (this.f93936a != null) {
            return this.f93936a.seekRight(j);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo75873a(String str) {
        if (this.f93936a == null) {
            this.f93936a = new IESMediaPlayer(this.f93937b);
        }
        return this.f93936a.prepare(str);
    }

    /* renamed from: b */
    public final void mo75881b(double d) {
        if (this.f93936a != null) {
            this.f93936a.setSpeed(d);
        }
    }

    /* renamed from: a */
    public final void mo75875a(double d) {
        if (this.f93936a != null) {
            this.f93936a.setVolume(d);
        }
    }

    /* renamed from: a */
    public final void mo75877a(boolean z) {
        if (this.f93936a != null) {
            this.f93936a.setLoop(z);
        }
    }

    /* renamed from: a */
    public final boolean mo75878a(Surface surface) {
        if (this.f93936a == null) {
            return false;
        }
        this.f93936a.start(surface);
        return true;
    }

    /* renamed from: a */
    public final void mo75876a(long j, long j2) {
        if (this.f93936a != null) {
            this.f93936a.setBoundary(j, j2);
        }
    }
}
