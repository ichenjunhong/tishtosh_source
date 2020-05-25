package com.p683ss.android.ugc.aweme.dfbase;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p764a.C12148f;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17340f;
import com.google.android.play.core.p1053e.C17340f.C17341a;
import com.google.android.play.core.p1056f.C17362a;
import com.google.android.play.core.p1056f.C17363b;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import com.p683ss.android.ugc.aweme.p2402x.C48411b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import p001a.C0013i;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.dfbase.b */
public class C27536b implements Callback {

    /* renamed from: a */
    static volatile boolean f72386a;

    /* renamed from: b */
    static volatile boolean f72387b;

    /* renamed from: c */
    static volatile NetworkConnectionReceiver f72388c;

    /* renamed from: d */
    static volatile C1690c f72389d;

    /* renamed from: g */
    private static volatile C27536b f72390g;

    /* renamed from: e */
    ConcurrentLinkedDeque<C27538a> f72391e = new ConcurrentLinkedDeque<>();

    /* renamed from: f */
    Handler f72392f;

    /* renamed from: h */
    private ConcurrentLinkedQueue<C27538a> f72393h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    private ConcurrentHashMap<String, C27562q> f72394i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private volatile C27538a f72395j;

    /* renamed from: e */
    private static boolean m66181e() {
        return NetworkUtils.isWifi(C11010c.m22280a());
    }

    /* renamed from: c */
    public final synchronized void mo55977c() {
        this.f72395j = null;
    }

    /* renamed from: a */
    public static C27536b m66176a() {
        if (f72390g == null) {
            synchronized (C27536b.class) {
                if (f72390g == null) {
                    f72390g = new C27536b();
                }
            }
        }
        return f72390g;
    }

    /* renamed from: b */
    public final void mo55976b() {
        C0013i.m16a((Callable<TResult>) new C27549d<TResult>(this));
    }

    private C27536b() {
        HandlerThread handlerThread = new HandlerThread("df_download_thread");
        handlerThread.start();
        this.f72392f = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: d */
    private void m66180d() {
        if (!f72386a) {
            synchronized (C27536b.class) {
                if (!f72386a) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    f72388c = new NetworkConnectionReceiver();
                    C11010c.m22280a().registerReceiver(f72388c, intentFilter);
                    f72386a = true;
                    C11016e.m22310e().mo6545f((C1710e<? super T>) new C27554i<Object>(this));
                }
            }
        }
    }

    /* renamed from: f */
    private static void m66182f() {
        StringBuilder sb = new StringBuilder("downloadQueue：[");
        Iterator it = f72390g.f72391e.iterator();
        while (it.hasNext()) {
            sb.append(((C27538a) it.next()).f72397a);
            sb.append(",");
        }
        sb.append("]\ndeferredQueue：[");
        Iterator it2 = f72390g.f72393h.iterator();
        while (it2.hasNext()) {
            sb.append(((C27538a) it2.next()).f72397a);
            sb.append(",");
        }
        sb.append("]\n");
    }

    /* renamed from: a */
    public final void mo55971a(C27538a aVar) {
        C0013i.m16a((Callable<TResult>) new C27542c<TResult>(this, aVar));
    }

    /* renamed from: b */
    public final C27562q mo55975b(String str) {
        return (C27562q) this.f72394i.get(str);
    }

    /* renamed from: f */
    private void m66183f(C27538a aVar) {
        if (aVar != null) {
            aVar.mo55982a();
            C27547c.m66214a(aVar, 2, "retry immediately");
            m66178a(aVar, (AbstractCollection<C27538a>) this.f72391e);
        }
    }

    /* renamed from: g */
    private void m66184g(C27538a aVar) {
        m66182f();
        if (aVar != null) {
            m66178a(aVar, (AbstractCollection<C27538a>) this.f72393h);
            if (aVar.f72404h) {
                m66180d();
            }
        }
    }

    /* renamed from: c */
    public final void mo55978c(C27538a aVar) {
        m66182f();
        if (aVar != null) {
            long j = aVar.f72407k;
            if (j == 0) {
                m66183f(aVar);
            } else {
                mo55972a(aVar, j);
            }
        }
    }

    /* renamed from: b */
    public static void m66179b(C27538a aVar) {
        int i;
        m66182f();
        if (aVar != null) {
            if (!C27558m.m66230d(aVar.f72398b) || aVar.f72410n == null) {
                i = C12148f.m24584a().mo23061a(aVar.f72398b);
            } else {
                Integer num = (Integer) C48411b.f121771b.get(aVar.f72410n.getLanguage());
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
            }
            StringBuilder sb = new StringBuilder("sessionId:");
            sb.append(i);
            C27547c.m66214a(aVar, 4, sb.toString());
            C27558m.m66226b().mo33615a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Boolean mo55980e(C27538a aVar) throws Exception {
        m66182f();
        if (aVar == null) {
            return Boolean.valueOf(false);
        }
        C27547c.m66214a(aVar, 0, (String) null);
        Keva repo = Keva.getRepo("dynamic_task_triggered", 0);
        if (repo != null) {
            if (C27558m.m66230d(aVar.f72398b)) {
                String language = aVar.f72410n.getLanguage();
                if (language != null) {
                    repo.storeString(language, aVar.f72398b);
                }
            } else {
                repo.storeString(aVar.f72397a, aVar.f72398b);
            }
        }
        if (aVar.f72405i == 2) {
            return Boolean.valueOf(mo55979d(aVar));
        }
        m66178a(aVar, (AbstractCollection<C27538a>) this.f72391e);
        mo55976b();
        return Boolean.valueOf(false);
    }

    public boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 1024) {
            m66182f();
            Iterator it = this.f72393h.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C27538a aVar = (C27538a) it.next();
                if (aVar.f72406j <= System.currentTimeMillis()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (!aVar.f72404h || m66181e())) {
                    m66178a(aVar, (AbstractCollection<C27538a>) this.f72391e);
                    this.f72393h.remove(aVar);
                    m66182f();
                    z2 = true;
                }
            }
            if (z2) {
                mo55976b();
            }
        }
        return true;
    }

    /* renamed from: h */
    private void m66185h(C27538a aVar) {
        m66182f();
        this.f72395j = aVar;
        C27547c.m66214a(aVar, 5, (String) null);
        String str = aVar.f72398b;
        C17338d b = C27558m.m66226b();
        if (C27558m.m66230d(str)) {
            Locale locale = aVar.f72410n;
            C17341a a = C17340f.m42459a();
            a.f48849b.add(locale);
            b.mo33616a(a.mo33632a()).mo33657a((C17363b<? super ResultT>) new C27550e<Object>(locale)).mo33656a((C17362a) new C27551f(this, aVar, str));
        } else if (aVar.mo55985c()) {
            if (C12152c.f32079b) {
                C12152c.f32078a.mo23051a(str);
            }
        } else {
            C17341a a2 = C17340f.m42459a().mo33631a(aVar.f72397a);
            if (aVar.f72413q != null) {
                for (String a3 : aVar.f72413q) {
                    a2.mo33631a(a3);
                }
            }
            b.mo33616a(a2.mo33632a()).mo33657a((C17363b<? super ResultT>) new C27552g<Object>(str)).mo33656a((C17362a) new C27553h(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo55973a(String str) {
        C27562q b = mo55975b(str);
        if (b != null) {
            b.mo56008b();
            this.f72394i.remove(str);
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo55979d(C27538a aVar) {
        String str;
        String str2;
        String str3;
        m66182f();
        StringBuilder sb = new StringBuilder("executeTask: ");
        sb.append(aVar.f72397a);
        sb.append("  cur: ");
        if (this.f72395j == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = this.f72395j.f72397a;
        }
        sb.append(str);
        C27562q b = mo55975b(aVar.f72397a);
        if (b == null) {
            return false;
        }
        if (this.f72395j != null) {
            if (this.f72395j.f72411o != C27541b.UNKNOWN) {
                StringBuilder sb2 = new StringBuilder("Failed because other module is currently executing:");
                sb2.append(this.f72395j.f72397a);
                str2 = sb2.toString();
                if (aVar.f72405i == 2) {
                    if (aVar.equals(this.f72391e.peek())) {
                        this.f72391e.poll();
                    }
                    this.f72391e.addFirst(aVar);
                    m66182f();
                    m66179b(this.f72395j);
                } else {
                    m66183f(aVar);
                    if (this.f72395j.f72411o == C27541b.PENDING) {
                        m66179b(this.f72395j);
                    }
                }
                C27547c.m66214a(aVar, 1, str2);
                return false;
            }
        }
        b.mo56006a(aVar);
        if (aVar.f72404h && !m66181e()) {
            str3 = "failed because required wifi";
            b.mo56002a((int) R.string.g_o);
            if (aVar.f72400d) {
                mo55972a(aVar, 0);
            }
        } else if (!C27557l.m66222a(C11010c.m22280a())) {
            str3 = "failed because no network";
            b.mo56002a((int) R.string.cg1);
            if (aVar.f72400d) {
                m66180d();
                m66183f(aVar);
            }
        } else if (C11016e.m22313h()) {
            str2 = "failed because app is background";
            synchronized (C27536b.class) {
                if (!f72387b) {
                    f72389d = C11016e.m22309d().mo6545f((C1710e<? super T>) new C27555j<Object>(this));
                    f72387b = true;
                }
            }
            m66183f(aVar);
            C27547c.m66214a(aVar, 1, str2);
            return false;
        } else {
            C27547c.m66214a(aVar, 1, "start to execute");
            m66185h(aVar);
            return true;
        }
        str2 = str3;
        C27547c.m66214a(aVar, 1, str2);
        return false;
    }

    /* renamed from: a */
    private static void m66178a(C27538a aVar, AbstractCollection<C27538a> abstractCollection) {
        if (abstractCollection.contains(aVar)) {
            switch (aVar.f72409m) {
                case REPLACE:
                    abstractCollection.remove(aVar);
                    break;
                case KEEP:
                    return;
            }
        }
        abstractCollection.add(aVar);
        m66182f();
    }

    /* renamed from: a */
    public final void mo55972a(C27538a aVar, long j) {
        m66182f();
        if (aVar != null) {
            aVar.mo55982a();
            if (j == 0) {
                aVar.mo55983a(j);
                m66184g(aVar);
                StringBuilder sb = new StringBuilder("delay:");
                sb.append(j);
                C27547c.m66214a(aVar, 2, sb.toString());
                return;
            }
            long j2 = aVar.f72408l + j;
            StringBuilder sb2 = new StringBuilder("delay:");
            sb2.append(j2);
            C27547c.m66214a(aVar, 2, sb2.toString());
            if (j2 / j <= 5) {
                aVar.mo55983a(j2);
                m66184g(aVar);
                this.f72392f.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, j2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo55974a(String str, C27562q qVar) {
        if (((C27562q) this.f72394i.get(str)) == null) {
            this.f72394i.put(str, qVar);
            qVar.mo56001a();
        }
    }
}
