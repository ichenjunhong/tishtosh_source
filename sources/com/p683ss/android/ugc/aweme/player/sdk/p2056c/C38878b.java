package com.p683ss.android.ugc.aweme.player.sdk.p2056c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.C2240a;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38855a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38864e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
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

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.b */
final class C38878b {

    /* renamed from: a */
    public String f98992a;

    /* renamed from: b */
    public HandlerThread f98993b;

    /* renamed from: c */
    C38876a f98994c;

    /* renamed from: d */
    public C38887f f98995d;

    /* renamed from: e */
    public Handler f98996e;

    /* renamed from: f */
    C50120i f98997f;

    /* renamed from: g */
    public boolean f98998g;

    /* renamed from: h */
    public boolean f98999h;

    /* renamed from: i */
    public C38871j f99000i;

    /* renamed from: j */
    private C1675ac f99001j;

    /* renamed from: k */
    private C50116c f99002k;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.c.b$a */
    interface C38883a {
        /* renamed from: a */
        void mo78949a(C38878b bVar, HandlerThread handlerThread);
    }

    /* renamed from: a */
    public final void mo78935a() {
        this.f98994c.removeMessages(12);
    }

    /* renamed from: b */
    public final void mo78944b() {
        this.f98994c.sendEmptyMessage(6);
    }

    /* renamed from: c */
    public final void mo78945c() {
        this.f98994c.removeCallbacksAndMessages(null);
        this.f98994c.sendEmptyMessage(7);
        this.f98998g = true;
    }

    public final String toString() {
        return C2240a.m6772a("PlaySession{this=%s, key=%s, mIsReleasing=%s, mIsReleased=%s}", new Object[]{super.toString(), this.f98992a, Boolean.valueOf(this.f98998g), Boolean.valueOf(this.f98999h)});
    }

    /* renamed from: a */
    public final void mo78938a(Surface surface) {
        this.f98995d.mo78891a(surface);
    }

    /* renamed from: a */
    public final void mo78939a(C38856b bVar) {
        this.f98995d.mo78893a(bVar);
    }

    /* renamed from: a */
    public final void mo78940a(C38857c cVar) {
        this.f98995d.mo78894a(cVar);
    }

    /* renamed from: a */
    public final void mo78941a(C38868g gVar) {
        this.f98995d.mo78896a(gVar);
    }

    /* renamed from: a */
    public final void mo78942a(C38871j jVar) {
        this.f99000i = jVar;
        this.f98995d.mo78897a((C38871j) new C38855a() {
            /* renamed from: a */
            public final void mo53524a(C50112d dVar) {
                C38878b.this.mo78936a(2, dVar);
            }

            /* renamed from: b */
            public final void mo53530b(C50112d dVar) {
                C38878b.this.mo78936a(8, dVar);
            }

            /* renamed from: c */
            public final void mo53533c(String str) {
                C38878b.this.mo78936a(6, str);
            }

            /* renamed from: d */
            public final void mo53534d(String str) {
                C38878b.this.mo78936a(4, str);
            }

            /* renamed from: e */
            public final void mo53535e(String str) {
                C38878b.this.mo78936a(9, str);
            }

            /* renamed from: a */
            public final void mo53523a(float f) {
                C38878b.this.mo78936a(10, Float.valueOf(f));
            }

            /* renamed from: b */
            public final void mo53531b(String str) {
                C38878b.this.mo78936a(3, str);
            }

            /* renamed from: a */
            public final void mo78829a(long j) {
                C38878b.this.mo78936a(12, Long.valueOf(j));
            }

            /* renamed from: b */
            public final void mo53532b(boolean z) {
                C38878b.this.mo78936a(5, Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo53525a(C50117f fVar) {
                C38878b.this.mo78936a(0, fVar);
            }

            /* renamed from: a */
            public final void mo53526a(C50118g gVar) {
                C38878b.this.mo78936a(7, gVar);
            }

            /* renamed from: a */
            public final void mo53527a(String str) {
                C38878b.this.mo78936a(1, str);
            }

            /* renamed from: a */
            public final void mo53529a(boolean z) {
                C38878b.this.mo78936a(11, Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo78830a(Resolution resolution, int i) {
                C38878b.this.mo78936a(13, new C38864e(resolution, i));
            }

            /* renamed from: a */
            public final void mo53528a(String str, boolean z) {
                C38878b.this.mo78937a(14, new Object[]{str, Boolean.valueOf(z)}, null);
            }
        });
    }

    /* renamed from: a */
    public final void mo78943a(C50101a aVar) {
        this.f98995d.mo78898a(aVar);
    }

    /* renamed from: a */
    public final void mo78936a(int i, Object obj) {
        mo78937a(i, null, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo78937a(final int i, final Object[] objArr, final Object obj) {
        this.f98996e.post(new Runnable() {
            public final void run() {
                if (C38878b.this.f99000i == null) {
                    String str = "PlaySession";
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
                        C38878b.this.f99000i.mo53525a((C50117f) obj);
                        return;
                    case 1:
                        C38878b.this.f99000i.mo53527a((String) obj);
                        return;
                    case 2:
                        C38878b.this.f99000i.mo53524a((C50112d) obj);
                        return;
                    case 3:
                        C38878b.this.f99000i.mo53531b((String) obj);
                        return;
                    case 4:
                        C38878b.this.f99000i.mo53534d((String) obj);
                        return;
                    case 5:
                        C38878b.this.f99000i.mo53532b(((Boolean) obj).booleanValue());
                        return;
                    case 6:
                        C38878b.this.f99000i.mo53533c((String) obj);
                        return;
                    case 7:
                        C38878b.this.f99000i.mo53526a((C50118g) obj);
                        return;
                    case 8:
                        C38878b.this.f99000i.mo53530b((C50112d) obj);
                        return;
                    case 9:
                        C38878b.this.f99000i.mo53535e((String) obj);
                        return;
                    case 10:
                        C38878b.this.f99000i.mo53523a(((Float) obj).floatValue());
                        return;
                    case 11:
                        C38878b.this.f99000i.mo53529a(((Boolean) obj).booleanValue());
                        return;
                    case 12:
                        if (C38878b.this.f99000i instanceof C38855a) {
                            ((C38855a) C38878b.this.f99000i).mo78829a(((Long) obj).longValue());
                            return;
                        }
                        break;
                    case 13:
                        if ((C38878b.this.f99000i instanceof C38855a) && (obj instanceof C38864e)) {
                            C38864e eVar = (C38864e) obj;
                            ((C38855a) C38878b.this.f99000i).mo78830a(eVar.f98968a, eVar.f98969b);
                            return;
                        }
                    case 14:
                        if (!(C38878b.this.f99000i == null || objArr == null || objArr.length != 2)) {
                            C38878b.this.f99000i.mo53528a(String.valueOf(objArr[0]), ((Boolean) objArr[1]).booleanValue());
                            break;
                        }
                }
            }
        });
    }

    public C38878b(C50116c cVar, HandlerThread handlerThread, C50120i iVar, final C38883a aVar, C38858d dVar) {
        Looper looper;
        Looper looper2;
        this.f99002k = cVar;
        this.f98995d = new C38887f(cVar);
        this.f98995d.mo78895a(dVar);
        this.f98993b = handlerThread;
        this.f98997f = iVar;
        if (iVar != null) {
            this.f98992a = iVar.f125572d;
        }
        this.f98996e = new Handler(Looper.getMainLooper());
        C388791 r4 = new C38877a() {
            /* renamed from: a */
            public final void mo78934a() {
                C38878b.this.f98996e.post(new Runnable() {
                    public final void run() {
                        C38878b.this.f98998g = false;
                        C38878b.this.f98999h = true;
                        C38878b.this.f99000i = null;
                        if (aVar != null) {
                            aVar.mo78949a(C38878b.this, C38878b.this.f98993b);
                        }
                    }
                });
            }
        };
        if (handlerThread == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handlerThread.getLooper();
        }
        this.f98994c = new C38876a(r4, looper, this.f98995d);
        if (this.f98993b == null) {
            looper2 = Looper.getMainLooper();
        } else {
            looper2 = this.f98993b.getLooper();
        }
        this.f99001j = C1667a.m5941a(looper2);
    }
}
