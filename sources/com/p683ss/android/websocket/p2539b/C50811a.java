package com.p683ss.android.websocket.p2539b;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.websocket.internal.WebSocketService;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import com.p683ss.android.websocket.p2539b.p2543d.C50830a;
import com.p683ss.android.websocket.p2539b.p2543d.C50833d;
import com.p683ss.android.websocket.p2539b.p2543d.C50834e;
import com.p683ss.android.websocket.p2539b.p2543d.C50835f;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.websocket.b.a */
public final class C50811a {

    /* renamed from: c */
    private static volatile C50811a f127664c;

    /* renamed from: a */
    public final C50812a f127665a;

    /* renamed from: b */
    private Context f127666b;

    /* renamed from: d */
    private final Map<String, C50820a> f127667d = new HashMap();

    /* renamed from: com.ss.android.websocket.b.a$a */
    public static class C50812a {

        /* renamed from: a */
        public C50834e f127668a;

        /* renamed from: b */
        public C50835f f127669b;

        /* renamed from: c */
        public C50834e f127670c;

        /* renamed from: d */
        public C50834e f127671d;

        /* renamed from: a */
        public final C50834e mo99520a() {
            if (this.f127668a == null) {
                return this.f127671d;
            }
            return this.f127668a;
        }
    }

    /* renamed from: b */
    public final C50834e mo99518b() {
        return this.f127665a.mo99520a();
    }

    /* renamed from: a */
    public final void mo99517a() {
        try {
            Context context = this.f127666b;
            Intent intent = new Intent(this.f127666b, WebSocketService.class);
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                context.startService(intent);
            }
        } catch (Throwable unused) {
        }
    }

    @C53771m
    public final void onEvent(C50827g gVar) {
        if (gVar.f127711b != null) {
            this.f127667d.put(gVar.f127710a, gVar.f127711b);
        } else {
            this.f127667d.remove(gVar.f127710a);
        }
    }

    /* renamed from: a */
    public static C50811a m109960a(Context context) {
        if (f127664c != null) {
            return f127664c;
        }
        synchronized (C50811a.class) {
            if (f127664c == null) {
                C50812a aVar = new C50812a();
                aVar.f127671d = new C50830a(context);
                aVar.f127670c = new C50833d(context);
                f127664c = new C50811a(context, aVar);
            }
        }
        return f127664c;
    }

    private C50811a(Context context, C50812a aVar) {
        this.f127666b = context;
        this.f127665a = aVar;
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
    }
}
