package com.p683ss.android.ugc.aweme.player.sdk.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38855a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38864e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import com.p683ss.ttvideoengine.Resolution;
import p064c.p065a.C1675ac;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.c */
public final class C38893c implements C38869h {

    /* renamed from: a */
    public C38869h f99043a;

    /* renamed from: b */
    public C38871j f99044b;

    /* renamed from: c */
    public Handler f99045c;

    /* renamed from: d */
    public boolean f99046d;

    /* renamed from: e */
    private HandlerThread f99047e;

    /* renamed from: f */
    private C38898a f99048f;

    /* renamed from: g */
    private String f99049g;

    /* renamed from: h */
    private C1675ac f99050h;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.c$a */
    static class C38898a extends Handler {

        /* renamed from: a */
        private C38869h f99058a;

        /* renamed from: b */
        private volatile int f99059b = 300;

        /* renamed from: c */
        private C38899a f99060c;

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.c$a$a */
        interface C38899a {
            /* renamed from: a */
            void mo78968a();
        }

        /* renamed from: a */
        public final void mo78971a(int i) {
            if (i > 0) {
                this.f99059b = i;
            }
        }

        public final void handleMessage(Message message) {
            if (this.f99058a != null) {
                switch (message.what) {
                    case 0:
                        return;
                    case 1:
                        this.f99058a.mo78899a((C50120i) message.obj);
                        return;
                    case 3:
                        this.f99058a.mo78907c();
                        return;
                    case 4:
                        this.f99058a.mo78900a((String) message.obj);
                        return;
                    case 5:
                        this.f99058a.mo78909e();
                        return;
                    case 6:
                        this.f99058a.mo78908d();
                        return;
                    case 7:
                        this.f99058a.mo78910f();
                        return;
                    case 8:
                        this.f99058a.mo78902b();
                        return;
                    case 9:
                        Pair pair = (Pair) message.obj;
                        if (pair != null) {
                            this.f99058a.mo78889a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            return;
                        }
                        break;
                    case 10:
                        removeMessages(12);
                        Looper looper = getLooper();
                        if (!(looper == null || looper == Looper.getMainLooper())) {
                            looper.quit();
                        }
                        if (this.f99060c != null) {
                            this.f99060c.mo78968a();
                            return;
                        }
                        break;
                    case 11:
                        this.f99058a.mo78888a(((Float) message.obj).floatValue());
                        return;
                    case 12:
                        this.f99058a.mo78920p();
                        sendEmptyMessageDelayed(12, (long) this.f99059b);
                        return;
                    case 13:
                        Pair pair2 = (Pair) message.obj;
                        if (pair2 != null) {
                            this.f99058a.mo78890a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                            return;
                        }
                        break;
                    case 14:
                        this.f99058a.mo78892a((SurfaceHolder) message.obj);
                        break;
                    case 16:
                        this.f99058a.mo78887a();
                        return;
                }
            }
        }

        public C38898a(C38899a aVar, Looper looper, C38869h hVar) {
            super(looper);
            this.f99058a = hVar;
            this.f99060c = aVar;
        }
    }

    /* renamed from: p */
    public final void mo78920p() {
    }

    /* renamed from: a */
    public final void mo78899a(C50120i iVar) {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "prepare()");
        }
        if (iVar != null) {
            if (this.f99046d) {
                C9220a.m18312a((Throwable) new Exception(), "mIsLastPlayThreadQuiting when prepare");
                return;
            }
            if (iVar.f125585q) {
                if (this.f99048f == null) {
                    m86549w();
                }
                this.f99048f.obtainMessage(1, iVar).sendToTarget();
            }
            this.f99049g = iVar.f125572d;
            if (iVar.f125586r) {
                mo78966a(9, (Object) iVar.f125572d);
            }
        }
    }

    /* renamed from: a */
    public final void mo78900a(String str) {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "resume()");
        }
        if (this.f99048f != null) {
            this.f99048f.obtainMessage(4, str).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78896a(C38868g gVar) {
        this.f99043a.mo78896a(gVar);
    }

    /* renamed from: a */
    public final void mo78894a(C38857c cVar) {
        this.f99043a.mo78894a(cVar);
    }

    /* renamed from: a */
    public final void mo78898a(C50101a aVar) {
        this.f99043a.mo78898a(aVar);
    }

    /* renamed from: a */
    public final void mo78893a(C38856b bVar) {
        this.f99043a.mo78893a(bVar);
    }

    /* renamed from: a */
    public final boolean mo78901a(String str, String str2) {
        return TextUtils.equals(str, this.f99049g);
    }

    /* renamed from: a */
    public final void mo78895a(C38858d dVar) {
        this.f99043a.mo78895a(dVar);
    }

    /* renamed from: a */
    public final void mo78897a(C38871j jVar) {
        this.f99044b = jVar;
        this.f99043a.mo78897a((C38871j) new C38855a() {
            /* renamed from: a */
            public final void mo53524a(C50112d dVar) {
                C38893c.this.mo78966a(2, (Object) dVar);
            }

            /* renamed from: b */
            public final void mo53530b(C50112d dVar) {
                C38893c.this.mo78966a(8, (Object) dVar);
            }

            /* renamed from: c */
            public final void mo53533c(String str) {
                C38893c.this.mo78966a(6, (Object) str);
            }

            /* renamed from: d */
            public final void mo53534d(String str) {
                C38893c.this.mo78966a(4, (Object) str);
            }

            /* renamed from: e */
            public final void mo53535e(String str) {
                C38893c.this.mo78966a(9, (Object) str);
            }

            /* renamed from: a */
            public final void mo53523a(float f) {
                C38893c.this.mo78966a(10, (Object) Float.valueOf(f));
            }

            /* renamed from: b */
            public final void mo53531b(String str) {
                C38893c.this.mo78966a(3, (Object) str);
            }

            /* renamed from: a */
            public final void mo78829a(long j) {
                C38893c.this.mo78966a(12, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public final void mo53532b(boolean z) {
                C38893c.this.mo78966a(5, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo53525a(C50117f fVar) {
                C38893c.this.mo78966a(0, (Object) fVar);
            }

            /* renamed from: a */
            public final void mo53526a(C50118g gVar) {
                C38893c.this.mo78966a(7, (Object) gVar);
            }

            /* renamed from: a */
            public final void mo53527a(String str) {
                C38893c.this.mo78966a(1, (Object) str);
            }

            /* renamed from: a */
            public final void mo53529a(boolean z) {
                C38893c.this.mo78966a(11, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo78830a(Resolution resolution, int i) {
                C38893c.this.mo78966a(13, (Object) new C38864e(resolution, i));
            }

            /* renamed from: a */
            public final void mo53528a(String str, boolean z) {
                C38893c.this.mo78967a(14, new Object[]{str, Boolean.valueOf(z)}, null);
            }
        });
    }

    /* renamed from: g */
    public final boolean mo78911g() {
        return this.f99043a.mo78911g();
    }

    /* renamed from: h */
    public final long mo78912h() {
        return this.f99043a.mo78912h();
    }

    /* renamed from: i */
    public final long mo78913i() {
        return this.f99043a.mo78913i();
    }

    /* renamed from: j */
    public final boolean mo78914j() {
        return this.f99043a.mo78914j();
    }

    /* renamed from: k */
    public final String mo78915k() {
        return this.f99043a.mo78915k();
    }

    /* renamed from: l */
    public final int mo78916l() {
        return this.f99043a.mo78916l();
    }

    /* renamed from: m */
    public final void mo78917m() {
        this.f99043a.mo78917m();
    }

    /* renamed from: q */
    public final C50116c mo78921q() {
        return this.f99043a.mo78921q();
    }

    /* renamed from: r */
    public final boolean mo78922r() {
        return this.f99043a.mo78922r();
    }

    /* renamed from: v */
    public final boolean mo78926v() {
        return this.f99043a.mo78926v();
    }

    /* renamed from: a */
    public final void mo78887a() {
        if (this.f99048f != null) {
            this.f99048f.sendEmptyMessage(16);
        }
    }

    /* renamed from: o */
    public final void mo78919o() {
        if (this.f99048f != null) {
            this.f99048f.removeMessages(12);
        }
    }

    /* renamed from: s */
    public final C38866g mo78923s() {
        if (this.f99043a != null) {
            return this.f99043a.mo78923s();
        }
        return null;
    }

    /* renamed from: t */
    public final C38865f mo78924t() {
        if (this.f99043a != null) {
            return this.f99043a.mo78924t();
        }
        return null;
    }

    /* renamed from: u */
    public final String mo78925u() {
        if (this.f99043a != null) {
            return this.f99043a.mo78925u();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo78902b() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "render()");
        }
        if (this.f99048f != null) {
            this.f99048f.sendEmptyMessage(8);
        }
    }

    /* renamed from: c */
    public final void mo78907c() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "start()");
        }
        if (this.f99048f != null) {
            this.f99048f.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    public final void mo78908d() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "stop()");
        }
        if (this.f99048f != null) {
            this.f99048f.sendEmptyMessage(6);
        }
    }

    /* renamed from: e */
    public final void mo78909e() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "pause()");
        }
        if (this.f99048f != null) {
            this.f99048f.sendEmptyMessage(5);
        }
    }

    /* renamed from: n */
    public final void mo78918n() {
        if (this.f99048f != null) {
            this.f99048f.mo78971a(300);
            this.f99048f.sendEmptyMessage(12);
        }
    }

    /* renamed from: f */
    public final void mo78910f() {
        if (C38854a.f98960a) {
            C38854a.m86290a("SimplifyAsyncPlayer", "release()");
        }
        if (this.f99048f != null) {
            this.f99048f.removeCallbacksAndMessages(null);
            this.f99048f.sendEmptyMessage(7);
            this.f99048f.sendEmptyMessage(10);
            this.f99046d = true;
            this.f99048f = null;
            this.f99050h = null;
        }
        if (this.f99047e != null) {
            this.f99047e = null;
        }
        this.f99049g = null;
    }

    /* renamed from: w */
    private void m86549w() {
        Looper looper;
        Looper looper2;
        try {
            this.f99047e = new HandlerThread("play_thread", 0);
            this.f99047e.start();
        } catch (Exception unused) {
            this.f99047e = null;
        }
        this.f99045c = new Handler(Looper.getMainLooper());
        C388941 r1 = new C38899a() {
            /* renamed from: a */
            public final void mo78968a() {
                C38893c.this.f99045c.post(new Runnable() {
                    public final void run() {
                        C38893c.this.f99046d = false;
                    }
                });
            }
        };
        if (this.f99047e == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = this.f99047e.getLooper();
        }
        this.f99048f = new C38898a(r1, looper, this.f99043a);
        if (this.f99047e == null) {
            looper2 = Looper.getMainLooper();
        } else {
            looper2 = this.f99047e.getLooper();
        }
        this.f99050h = C1667a.m5941a(looper2);
    }

    /* renamed from: a */
    public final float mo78886a(int i) {
        return this.f99043a.mo78886a(i);
    }

    /* renamed from: b */
    public final void mo78904b(Surface surface) {
        this.f99043a.mo78904b(surface);
    }

    public C38893c(C38869h hVar) {
        this.f99043a = hVar;
        m86549w();
    }

    /* renamed from: b */
    public final void mo78905b(String str) {
        this.f99043a.mo78905b(str);
    }

    /* renamed from: a */
    public final void mo78888a(float f) {
        if (this.f99048f != null) {
            this.f99048f.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    /* renamed from: b */
    public final void mo78903b(int i) {
        if (this.f99048f != null) {
            this.f99048f.mo78971a(i);
            this.f99048f.sendEmptyMessage(12);
        }
    }

    /* renamed from: b */
    public final boolean mo78906b(C38871j jVar) {
        if (this.f99044b == jVar) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo78891a(Surface surface) {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("setSurface(), surface = ");
            sb.append(surface);
            sb.append(", mSimplifyPlayer = ");
            sb.append(this.f99043a);
            C38854a.m86290a("SimplifyAsyncPlayer", sb.toString());
        }
        this.f99043a.mo78891a(surface);
    }

    /* renamed from: a */
    public final void mo78892a(SurfaceHolder surfaceHolder) {
        if (this.f99048f != null) {
            this.f99048f.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78889a(float f, float f2) {
        if (this.f99048f != null) {
            this.f99048f.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78890a(int i, int i2) {
        if (this.f99048f != null) {
            this.f99048f.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo78966a(int i, Object obj) {
        mo78967a(i, null, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo78967a(final int i, final Object[] objArr, final Object obj) {
        this.f99045c.post(new Runnable() {
            public final void run() {
                if (C38893c.this.f99044b == null) {
                    String str = "SimplifyAsyncPlayer";
                    StringBuilder sb = new StringBuilder("SimplifyAsyncPlayer handleCallback mUIPlayListener is null type = ");
                    String str2 = "UNKNOWN";
                    switch (i) {
                        case 0:
                            str2 = "ISimplifyPlayer.MSG_RENDER_READY";
                            break;
                        case 1:
                            str2 = "ISimplifyPlayer.MSG_PLAY_RESUME";
                            break;
                        case 2:
                            str2 = "ISimplifyPlayer.MSG_PLAY_FAILED";
                            break;
                        case 3:
                            str2 = "ISimplifyPlayer.MSG_PLAY_PAUSED";
                            break;
                        case 4:
                            str2 = "ISimplifyPlayer.MSG_PLAY_COMPLETED_FIRST_TIME";
                            break;
                        case 5:
                            str2 = "ISimplifyPlayer.MSG_PLAY_BUFFERING";
                            break;
                        case 6:
                            str2 = "ISimplifyPlayer.MSG_PLAY_COMPLETED";
                            break;
                        case 7:
                            str2 = "ISimplifyPlayer.MSG_RENDER_FIRST_FRAME";
                            break;
                        case 8:
                            str2 = "ISimplifyPlayer.MSG_RETRY_ON_ERROR";
                            break;
                        case 9:
                            str2 = "ISimplifyPlayer.MSG_PLAY_PREPARE";
                            break;
                        case 10:
                            str2 = "ISimplifyPlayer.MSG_PLAY_PROGRESS_CHANGE";
                            break;
                        case 11:
                            str2 = "ISimplifyPlayer.MSG_PLAY_DECODER_BUFFERING";
                            break;
                    }
                    sb.append(str2);
                    C38854a.m86292b(str, sb.toString());
                    return;
                }
                Object obj = obj;
                switch (i) {
                    case 0:
                        C38893c.this.f99044b.mo53525a((C50117f) obj);
                        return;
                    case 1:
                        C38893c.this.f99044b.mo53527a((String) obj);
                        return;
                    case 2:
                        C38893c.this.f99044b.mo53524a((C50112d) obj);
                        return;
                    case 3:
                        C38893c.this.f99044b.mo53531b((String) obj);
                        return;
                    case 4:
                        C38893c.this.f99044b.mo53534d((String) obj);
                        return;
                    case 5:
                        C38893c.this.f99044b.mo53532b(((Boolean) obj).booleanValue());
                        return;
                    case 6:
                        C38893c.this.f99044b.mo53533c((String) obj);
                        return;
                    case 7:
                        C38893c.this.f99044b.mo53526a((C50118g) obj);
                        return;
                    case 8:
                        C38893c.this.f99044b.mo53530b((C50112d) obj);
                        return;
                    case 9:
                        C38893c.this.f99044b.mo53535e((String) obj);
                        return;
                    case 10:
                        C38893c.this.f99044b.mo53523a(((Float) obj).floatValue());
                        return;
                    case 11:
                        C38893c.this.f99044b.mo53529a(((Boolean) obj).booleanValue());
                        return;
                    case 12:
                        if (C38893c.this.f99044b instanceof C38855a) {
                            ((C38855a) C38893c.this.f99044b).mo78829a(((Long) obj).longValue());
                            return;
                        }
                        break;
                    case 13:
                        if ((C38893c.this.f99044b instanceof C38855a) && (obj instanceof C38864e)) {
                            C38864e eVar = (C38864e) obj;
                            ((C38855a) C38893c.this.f99044b).mo78830a(eVar.f98968a, eVar.f98969b);
                            return;
                        }
                    case 14:
                        if (!(C38893c.this.f99044b == null || objArr == null || objArr.length != 2)) {
                            C38893c.this.f99044b.mo53528a(String.valueOf(objArr[0]), ((Boolean) objArr[1]).booleanValue());
                            break;
                        }
                }
            }
        });
    }
}
