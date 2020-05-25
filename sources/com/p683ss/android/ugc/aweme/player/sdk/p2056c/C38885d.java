package com.p683ss.android.ugc.aweme.player.sdk.p2056c;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.d */
final class C38885d implements C38883a {

    /* renamed from: a */
    List<HandlerThread> f99019a;

    /* renamed from: b */
    List<HandlerThread> f99020b;

    /* renamed from: c */
    List<C38878b> f99021c = new ArrayList();

    /* renamed from: d */
    List<C38878b> f99022d;

    /* renamed from: e */
    public C38878b f99023e;

    /* renamed from: f */
    boolean f99024f;

    /* renamed from: g */
    public C38858d f99025g;

    /* renamed from: h */
    C38884c f99026h;

    /* renamed from: i */
    private C50116c f99027i;

    /* renamed from: c */
    private boolean m86454c() {
        if (this.f99026h.f99016f - (this.f99019a.size() + this.f99020b.size()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m86451a() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("initThreadPool max:");
            sb.append(this.f99026h.f99016f);
            sb.append(", core:");
            sb.append(this.f99026h.f99017g);
            C38854a.m86290a("PlaySessionManager", sb.toString());
        }
        for (int i = 0; i < this.f99026h.f99017g; i++) {
            try {
                StringBuilder sb2 = new StringBuilder("play_thread_");
                sb2.append(i);
                HandlerThread handlerThread = new HandlerThread(sb2.toString(), 0);
                handlerThread.start();
                this.f99019a.add(handlerThread);
            } catch (Exception unused) {
                C9220a.m18312a((Throwable) new Exception(), "create init thread fail, may use main looper");
            }
        }
    }

    /* renamed from: b */
    private void m86453b() {
        if (C38854a.f98960a) {
            C38854a.m86290a("PlaySessionManager", "extendThreadPool");
        }
        if (m86454c()) {
            int size = this.f99019a.size() + this.f99020b.size();
            try {
                StringBuilder sb = new StringBuilder("play_thread_");
                sb.append(size);
                HandlerThread handlerThread = new HandlerThread(sb.toString(), 0);
                handlerThread.start();
                this.f99019a.add(handlerThread);
                if (C38854a.f98960a) {
                    StringBuilder sb2 = new StringBuilder("extendThreadPool index:");
                    sb2.append(size);
                    C38854a.m86290a("PlaySessionManager", sb2.toString());
                }
            } catch (Exception unused) {
                C9220a.m18312a((Throwable) new Exception(), "create extend thread fail, may use main looper");
            }
        }
    }

    /* renamed from: a */
    static void m86452a(C38878b bVar) {
        bVar.mo78944b();
        bVar.mo78935a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C38878b mo78950a(C50120i iVar) {
        if (this.f99024f) {
            m86451a();
            this.f99024f = false;
        }
        HandlerThread handlerThread = null;
        if (this.f99019a.size() > 0) {
            handlerThread = (HandlerThread) this.f99019a.remove(0);
            this.f99020b.add(handlerThread);
            if (C38854a.f98960a) {
                C38854a.m86290a("PlaySessionManager", "createSession from idle pool");
            }
        } else if (m86454c()) {
            m86453b();
            if (this.f99019a.size() > 0) {
                handlerThread = (HandlerThread) this.f99019a.remove(0);
                this.f99020b.add(handlerThread);
                if (C38854a.f98960a) {
                    C38854a.m86290a("PlaySessionManager", "createSession from extend idle pool");
                }
            } else if (this.f99020b.size() > 0) {
                handlerThread = (HandlerThread) this.f99020b.get(this.f99020b.size() - 1);
                if (C38854a.f98960a) {
                    C38854a.m86292b("PlaySessionManager", "createSession from working thread due to extend fail.");
                }
            } else {
                C9220a.m18312a((Throwable) new Exception(), "fail extend pool, no thread use, use main looper");
            }
        } else {
            handlerThread = (HandlerThread) this.f99020b.get(this.f99020b.size() - 1);
            if (C38854a.f98960a) {
                C38854a.m86292b("PlaySessionManager", "createSession from working thread.");
            }
        }
        C38878b bVar = new C38878b(this.f99027i, handlerThread, iVar, this, this.f99025g);
        return bVar;
    }

    public C38885d(C50116c cVar, C38884c cVar2) {
        this.f99027i = cVar;
        this.f99026h = cVar2;
        if (this.f99026h == null) {
            this.f99026h = new C38884c();
        }
        if (this.f99026h.f99015e && this.f99026h.f99018h > 0) {
            this.f99022d = new ArrayList(this.f99026h.f99018h);
        }
        if (this.f99026h.f99014d) {
            this.f99026h.f99016f = 1;
            this.f99026h.f99017g = 1;
        }
        if (this.f99026h.f99016f == 1 && this.f99026h.f99017g == 1 && this.f99026h.f99015e) {
            this.f99026h.f99018h = 0;
        }
        if (cVar2.f99016f <= 0) {
            cVar2.f99016f = C38884c.f99011a;
        }
        if (cVar2.f99017g > cVar2.f99016f || cVar2.f99017g <= 0) {
            cVar2.f99017g = cVar2.f99016f;
        }
        if (this.f99026h.f99015e && this.f99026h.f99018h > this.f99026h.f99017g) {
            this.f99026h.f99018h = this.f99026h.f99017g;
        }
        this.f99019a = new ArrayList(cVar2.f99016f);
        this.f99020b = new ArrayList(cVar2.f99016f);
        m86451a();
    }

    /* renamed from: a */
    public final void mo78949a(C38878b bVar, HandlerThread handlerThread) {
        Object obj;
        this.f99021c.remove(bVar);
        if (C38854a.f98960a) {
            String str = "PlaySessionManager";
            StringBuilder sb = new StringBuilder("onSessionRelease session:");
            sb.append(bVar);
            sb.append(", idle size:");
            sb.append(this.f99019a.size());
            sb.append(", working size:");
            sb.append(this.f99020b.size());
            sb.append(", session list size:");
            sb.append(this.f99021c.size());
            sb.append(", session pool size:");
            if (this.f99022d == null) {
                obj = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                obj = Integer.valueOf(this.f99022d.size());
            }
            sb.append(obj);
            C38854a.m86290a(str, sb.toString());
        }
        if (handlerThread.getLooper() == Looper.getMainLooper()) {
            this.f99020b.remove(handlerThread);
            this.f99019a.remove(handlerThread);
            if (C38854a.f98960a) {
                C38854a.m86292b("PlaySessionManager", "onSessionRelease main looper thread");
            }
        } else if (this.f99024f) {
            if (VERSION.SDK_INT >= 18) {
                handlerThread.quitSafely();
            } else {
                handlerThread.quit();
            }
            this.f99020b.clear();
            this.f99019a.clear();
        } else {
            boolean z = true;
            Iterator it = this.f99021c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C38878b) it.next()).f98993b == handlerThread) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                if (this.f99019a.size() < this.f99026h.f99017g) {
                    if (!this.f99019a.contains(handlerThread)) {
                        this.f99019a.add(handlerThread);
                    }
                    this.f99020b.remove(handlerThread);
                    if (C38854a.f98960a) {
                        C38854a.m86290a("PlaySessionManager", "onSessionRelease recycle to idle pool");
                    }
                } else {
                    if (VERSION.SDK_INT >= 18) {
                        handlerThread.quitSafely();
                    } else {
                        handlerThread.quit();
                    }
                    this.f99020b.remove(handlerThread);
                    this.f99019a.remove(handlerThread);
                    if (C38854a.f98960a) {
                        C38854a.m86290a("PlaySessionManager", "onSessionRelease quit thread");
                    }
                }
            }
        }
    }
}
