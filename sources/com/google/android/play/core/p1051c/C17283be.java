package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import com.google.android.play.core.splitcompat.C17384b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.c.be */
public final class C17283be<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f48749l = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    final Context f48750a;
    /* access modifiers changed from: 0000 */

    /* renamed from: b */
    public final C17384b f48751b;

    /* renamed from: c */
    final String f48752c;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public final List<C17281bc> f48753d;
    /* access modifiers changed from: 0000 */

    /* renamed from: e */
    public boolean f48754e;

    /* renamed from: f */
    final Intent f48755f;

    /* renamed from: g */
    final C17286bh<T> f48756g;

    /* renamed from: h */
    final WeakReference<C17287bi> f48757h;

    /* renamed from: i */
    final DeathRecipient f48758i;

    /* renamed from: j */
    ServiceConnection f48759j;

    /* renamed from: k */
    public T f48760k;

    public C17283be(Context context, C17384b bVar, String str, Intent intent, C17286bh<T> bhVar) {
        this(context, bVar, str, intent, bhVar, null);
    }

    private C17283be(Context context, C17384b bVar, String str, Intent intent, C17286bh<T> bhVar, C17287bi biVar) {
        this.f48753d = new ArrayList();
        this.f48758i = new C17282bd(this);
        this.f48750a = context;
        this.f48751b = bVar;
        this.f48752c = str;
        this.f48755f = intent;
        this.f48756g = bhVar;
        this.f48757h = new WeakReference<>(null);
    }

    /* renamed from: b */
    private final Handler m42335b() {
        Handler handler;
        synchronized (f48749l) {
            if (!f48749l.containsKey(this.f48752c)) {
                HandlerThread handlerThread = new HandlerThread(this.f48752c, 10);
                handlerThread.start();
                f48749l.put(this.f48752c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) f48749l.get(this.f48752c);
        }
        return handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m42337b(C17281bc bcVar) {
        m42335b().post(bcVar);
    }

    /* renamed from: a */
    public final void mo33587a() {
        m42337b((C17281bc) new C17284bf(this));
    }

    /* renamed from: a */
    public final void mo33588a(C17281bc bcVar) {
        m42337b((C17281bc) new C17285bg(this, bcVar.f48747a, bcVar));
    }
}
