package com.p683ss.android.ugc.aweme.live.alphaplayer;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36031d.C36032a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36031d.C36033b;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36031d.C36034c;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36031d.C36035d;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1917a.C36021a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b.C36023a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b.C36024b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.PlayerController */
public class PlayerController implements C0183j, Callback, C36037f {

    /* renamed from: a */
    public long f92311a;

    /* renamed from: b */
    public C36040h f92312b = C36040h.NOT_PREPARED;

    /* renamed from: c */
    public C36036e f92313c;

    /* renamed from: d */
    public C36020a f92314d;

    /* renamed from: e */
    public AlphaVideoView f92315e;

    /* renamed from: f */
    private boolean f92316f;

    /* renamed from: g */
    private Context f92317g;

    /* renamed from: h */
    private C36031d<C36023a<C36023a>> f92318h;

    /* renamed from: i */
    private Handler f92319i;

    /* renamed from: j */
    private Handler f92320j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private HandlerThread f92321k;

    /* renamed from: l */
    private C36035d<C36023a<C36023a>> f92322l = new C36035d<C36023a<C36023a>>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo74774a(Object obj) {
            C36023a aVar = (C36023a) obj;
            PlayerController.this.mo74759a(PlayerController.m81220a(2, (Object) null));
        }
    };

    /* renamed from: m */
    private C36033b<C36023a<C36023a>> f92323m = new C36033b<C36023a<C36023a>>() {
        /* renamed from: a */
        public final /* synthetic */ void mo74775a(Object obj, int i, int i2, String str) {
            C36023a aVar = (C36023a) obj;
            PlayerController playerController = PlayerController.this;
            StringBuilder sb = new StringBuilder("mediaPlayer error, info:");
            sb.append(str);
            playerController.mo74761a(false, i, i2, sb.toString());
            PlayerController.this.mo74764c();
        }
    };

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        mo74758a();
    }

    /* renamed from: b */
    public final void mo74763b() {
        mo74759a(m81220a(6, (Object) null));
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        mo74759a(m81220a(6, (Object) null));
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        mo74759a(m81220a(3, (Object) null));
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
        mo74759a(m81220a(5, (Object) null));
    }

    /* renamed from: c */
    public final void mo74764c() {
        this.f92316f = false;
        this.f92311a = 0;
        this.f92320j.post(new Runnable() {
            public final void run() {
                if (PlayerController.this.f92314d != null) {
                    PlayerController.this.f92314d.mo13791b();
                }
            }
        });
    }

    /* renamed from: d */
    private void m81223d() {
        if (this.f92318h != null) {
            if (this.f92312b == C36040h.NOT_PREPARED || this.f92312b == C36040h.STOPPED) {
                this.f92318h.mo74780a(this.f92322l);
                this.f92318h.mo74778a(this.f92323m);
                this.f92318h.mo13765b();
            }
        }
    }

    /* renamed from: e */
    private void m81224e() {
        if (this.f92318h != null) {
            switch (this.f92312b) {
                case PREPARED:
                    this.f92318h.mo13767c();
                    this.f92316f = true;
                    this.f92312b = C36040h.STARTED;
                    this.f92320j.post(new Runnable() {
                        public final void run() {
                            if (PlayerController.this.f92314d != null) {
                                PlayerController.this.f92314d.mo13789a();
                            }
                        }
                    });
                    return;
                case PAUSED:
                    this.f92318h.mo13767c();
                    this.f92312b = C36040h.STARTED;
                    return;
                case NOT_PREPARED:
                case STOPPED:
                    try {
                        m81223d();
                        return;
                    } catch (Exception unused) {
                        mo74762a(false, "prepare and start MediaPlayer failure.");
                        mo74764c();
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo74758a() {
        mo74759a(m81220a(4, (Object) null));
    }

    /* renamed from: a */
    public final C36037f mo74757a(C36020a aVar) {
        this.f92314d = aVar;
        return this;
    }

    /* renamed from: a */
    public final void mo74759a(Message message) {
        m81222a(message, 0);
    }

    /* renamed from: a */
    public final void mo74760a(Surface surface) {
        mo74759a(m81220a(7, (Object) surface));
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f92319i != null) {
                    this.f92319i.removeMessages(8);
                }
                C36029c cVar = (C36029c) message.obj;
                try {
                    this.f92318h.mo13770f();
                    this.f92312b = C36040h.NOT_PREPARED;
                    int i = this.f92317g.getResources().getConfiguration().orientation;
                    String a = cVar.mo74786a(i);
                    C36030a b = cVar.mo74787b(i);
                    if (!TextUtils.isEmpty(a)) {
                        if (new File(a).exists()) {
                            this.f92315e.setScaleType(b);
                            this.f92318h.mo13763a(a);
                            if (this.f92315e.f92297a) {
                                m81223d();
                                break;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("dataPath is empty or File is not exists. path: ");
                    sb.append(a);
                    mo74762a(false, sb.toString());
                    mo74764c();
                    break;
                } catch (Exception e) {
                    mo74764c();
                    StringBuilder sb2 = new StringBuilder("alphaVideoView set dataSource failure:");
                    sb2.append(Log.getStackTraceString(e));
                    mo74762a(false, sb2.toString());
                    break;
                }
                break;
            case 2:
                try {
                    final C36021a h = this.f92318h.mo13772h();
                    this.f92315e.mo74748a((float) (h.f92335a / 2), (float) h.f92336b);
                    final C36030a scaleType = this.f92315e.getScaleType();
                    this.f92320j.post(new Runnable() {
                        public final void run() {
                            if (PlayerController.this.f92314d != null) {
                                PlayerController.this.f92314d.mo13790a(h.f92335a / 2, h.f92336b, scaleType);
                            }
                        }
                    });
                    this.f92312b = C36040h.PREPARED;
                    m81224e();
                    break;
                } catch (Exception e2) {
                    mo74764c();
                    StringBuilder sb3 = new StringBuilder("start video failure:");
                    sb3.append(Log.getStackTraceString(e2));
                    mo74762a(false, sb3.toString());
                    break;
                }
            case 3:
                if (this.f92318h != null && this.f92312b == C36040h.STARTED) {
                    this.f92318h.mo13768d();
                    this.f92312b = C36040h.PAUSED;
                    break;
                }
            case 4:
                if (this.f92316f) {
                    m81224e();
                    break;
                }
                break;
            case 5:
                if (this.f92318h != null && (this.f92312b == C36040h.STARTED || this.f92312b == C36040h.PAUSED)) {
                    this.f92318h.mo13768d();
                    this.f92312b = C36040h.PAUSED;
                    break;
                }
            case 6:
                this.f92315e.onPause();
                if (this.f92318h != null) {
                    if (this.f92312b == C36040h.STARTED) {
                        this.f92318h.mo13768d();
                        this.f92312b = C36040h.PAUSED;
                    }
                    if (this.f92312b == C36040h.PAUSED) {
                        this.f92318h.mo13769e();
                        this.f92312b = C36040h.STOPPED;
                    }
                    this.f92318h.mo13771g();
                    AlphaVideoView alphaVideoView = this.f92315e;
                    if (alphaVideoView.f92301e != null) {
                        alphaVideoView.f92301e.mo74755a();
                    }
                    this.f92312b = C36040h.RELEASE;
                    if (this.f92321k != null) {
                        this.f92321k.quit();
                        this.f92321k.interrupt();
                        break;
                    }
                } else {
                    this.f92312b = C36040h.NOT_PREPARED;
                    return true;
                }
                break;
            case 7:
                this.f92318h.mo13762a((Surface) message.obj);
                break;
            case 9:
                if (this.f92318h != null) {
                    this.f92318h.mo13770f();
                    this.f92312b = C36040h.NOT_PREPARED;
                    this.f92316f = false;
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public static Message m81220a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    public static PlayerController m81221a(C36022b bVar, C36031d dVar) {
        return new PlayerController(bVar.f92337a, bVar.f92338b, dVar);
    }

    /* renamed from: a */
    private void m81222a(Message message, long j) {
        if (this.f92321k != null && this.f92321k.isAlive() && !this.f92321k.isInterrupted()) {
            if (this.f92319i == null) {
                this.f92319i = new Handler(this.f92321k.getLooper(), this);
            }
            this.f92319i.sendMessageDelayed(message, 0);
        }
    }

    /* renamed from: a */
    public final void mo74762a(boolean z, String str) {
        mo74761a(z, 0, 0, str);
    }

    private PlayerController(Context context, C0184k kVar, C36031d<C36023a<C36023a>> dVar) {
        this.f92317g = context;
        kVar.getLifecycle().mo324a(this);
        this.f92321k = new HandlerThread("alpha-play-thread", 10);
        this.f92321k.start();
        this.f92319i = new Handler(this.f92321k.getLooper(), this);
        this.f92318h = new C36024b();
        this.f92315e = new AlphaVideoView(this.f92317g, null);
        this.f92315e.setLayoutParams(new LayoutParams(-1, -1));
        this.f92315e.setPlayerController(this);
        this.f92315e.setVideoRenderer(new C36041i(this.f92315e));
        this.f92318h = dVar;
        dVar.mo13766b(true);
        dVar.mo13764a(false);
        this.f92318h.mo74779a((C36034c<T>) new C36034c<C36023a<C36023a>>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo74771a(Object obj) {
                C36023a aVar = (C36023a) obj;
                PlayerController.this.f92315e.f92298b.mo74788a();
            }
        });
        this.f92318h.mo74777a((C36032a<T>) new C36032a<C36023a<C36023a>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo74772a(Object obj) {
                C36023a aVar = (C36023a) obj;
                PlayerController.this.f92315e.f92298b.mo74793b();
                PlayerController.this.f92312b = C36040h.PAUSED;
                PlayerController.this.mo74762a(true, (String) null);
                PlayerController.this.mo74764c();
            }
        });
    }

    /* renamed from: a */
    public final void mo74761a(boolean z, int i, int i2, String str) {
        String str2;
        if (this.f92313c != null) {
            C36036e eVar = this.f92313c;
            if (this.f92318h != null) {
                str2 = this.f92318h.mo13773i();
            } else {
                str2 = "unknown";
            }
            String str3 = str2;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", messageId: ");
            sb.append(this.f92311a);
            eVar.mo13792a(z, str3, i, i2, sb.toString());
        }
    }
}
