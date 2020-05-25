package com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay;

import android.content.Context;
import android.view.Surface;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.SeekCompletionListener;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.VideoEngineListener;
import com.p683ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.b */
public final class C35322b implements SeekCompletionListener, VideoEngineListener {

    /* renamed from: a */
    public int f90687a;

    /* renamed from: b */
    public int f90688b;

    /* renamed from: c */
    private TTVideoEngine f90689c;

    /* renamed from: d */
    private List<C35323a> f90690d;

    /* renamed from: e */
    private Context f90691e;

    /* renamed from: f */
    private boolean f90692f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.b$a */
    public interface C35323a {
        /* renamed from: a */
        void mo73486a(C35322b bVar);

        /* renamed from: a */
        void mo73487a(C35322b bVar, int i);

        /* renamed from: a */
        void mo73488a(String str);

        /* renamed from: b */
        void mo73489b(C35322b bVar);

        /* renamed from: b */
        void mo73490b(C35322b bVar, int i);

        /* renamed from: c */
        void mo73491c(C35322b bVar);

        /* renamed from: d */
        void mo73492d(C35322b bVar);
    }

    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    /* renamed from: b */
    public final void mo73479b() {
        this.f90689c.pause();
    }

    /* renamed from: c */
    public final void mo73481c() {
        this.f90689c.stop();
    }

    /* renamed from: a */
    public final void mo73475a() {
        this.f90689c.play();
        this.f90692f = true;
    }

    /* renamed from: d */
    public final void mo73483d() {
        if (this.f90692f) {
            this.f90689c.release();
        }
    }

    /* renamed from: e */
    public final boolean mo73484e() {
        if (this.f90689c.getPlaybackState() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73476a(Surface surface) {
        this.f90689c.setSurface(surface);
    }

    /* renamed from: b */
    public final void mo73480b(String str) {
        this.f90689c.setDirectURL(str);
    }

    /* renamed from: c */
    public final void mo73482c(String str) {
        this.f90689c.setLocalURL(str);
    }

    /* renamed from: a */
    public final void mo73477a(C35323a aVar) {
        this.f90690d.add(aVar);
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73492d(this);
            }
        }
    }

    public final void onError(Error error) {
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73488a(error.description);
            }
        }
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73486a(this);
            }
        }
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73489b(this);
            }
        }
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73491c(this);
            }
        }
    }

    public final void onVideoStatusException(int i) {
        Iterator it = this.f90690d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo73478a(String str) {
        this.f90689c.setDecryptionKey(str);
    }

    public final void onCompletion(boolean z) {
        Iterator it = this.f90690d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C35322b(Context context) {
        Resolution resolution;
        if (context != null) {
            this.f90691e = context;
            this.f90689c = new TTVideoEngine(this.f90691e.getApplicationContext(), 0);
            this.f90689c.setIntOption(4, 1);
            TTVideoEngine tTVideoEngine = this.f90689c;
            switch (2) {
                case 0:
                    resolution = Resolution.Standard;
                    break;
                case 1:
                    resolution = Resolution.High;
                    break;
                case 2:
                    resolution = Resolution.SuperHigh;
                    break;
                default:
                    resolution = Resolution.Standard;
                    break;
            }
            tTVideoEngine.configResolution(resolution);
            this.f90689c.setListener(this);
            this.f90690d = new ArrayList();
            return;
        }
        throw new RuntimeException("context can not be null!");
    }

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        Iterator it = this.f90690d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        switch (i) {
            case 0:
                this.f90688b = 0;
                break;
            case 1:
                this.f90688b = 1;
                break;
            case 2:
                this.f90688b = 2;
                break;
            case 3:
                this.f90688b = 3;
                break;
        }
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73490b(this, this.f90688b);
            }
        }
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        switch (i) {
            case 0:
                this.f90687a = 0;
                break;
            case 1:
                this.f90687a = 1;
                break;
            case 2:
                this.f90687a = 2;
                break;
            case 3:
                this.f90687a = 3;
                break;
        }
        for (C35323a aVar : this.f90690d) {
            if (aVar != null) {
                aVar.mo73487a(this, this.f90687a);
            }
        }
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        Iterator it = this.f90690d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
