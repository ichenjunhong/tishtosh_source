package com.p683ss.android.ugc.aweme.effect.p1671b;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.p683ss.android.ugc.aweme.effect.EffectModel;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29139b.C29140a;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29136a;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29137b;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29138c;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.b.a */
public final class C29126a {

    /* renamed from: g */
    public static C29252f f76355g;

    /* renamed from: h */
    public static final C29127a f76356h = new C29127a(null);

    /* renamed from: a */
    public Queue<Effect> f76357a;

    /* renamed from: b */
    public Queue<Effect> f76358b;

    /* renamed from: c */
    public final List<C29137b> f76359c;

    /* renamed from: d */
    public final AtomicBoolean f76360d;

    /* renamed from: e */
    public final AtomicInteger f76361e;

    /* renamed from: f */
    public final Handler f76362f;

    /* renamed from: i */
    private Queue<Effect> f76363i;

    /* renamed from: j */
    private final AtomicBoolean f76364j;

    /* renamed from: k */
    private final C29138c f76365k;

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$a */
    public static final class C29127a {
        private C29127a() {
        }

        /* renamed from: a */
        public static C29252f m68628a() {
            if (C29126a.f76355g == null) {
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                C29126a.f76355g = C29242c.m68869a(b, null);
            }
            return C29126a.f76355g;
        }

        public /* synthetic */ C29127a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$b */
    public static final class C29128b {

        /* renamed from: a */
        public static final C29129a f76366a = new C29129a(null);

        /* renamed from: b */
        private Integer f76367b = Integer.valueOf(0);

        /* renamed from: c */
        private C29138c f76368c;

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$b$a */
        public static final class C29129a {
            private C29129a() {
            }

            public /* synthetic */ C29129a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public final C29126a mo59005a() {
            int i;
            Integer num = this.f76367b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            C29138c cVar = this.f76368c;
            if (cVar == null) {
                cVar = new C29136a();
            }
            return new C29126a(i, cVar, null);
        }

        /* renamed from: a */
        public final C29128b mo59003a(C29138c cVar) {
            this.f76368c = cVar;
            return this;
        }

        /* renamed from: a */
        public final C29128b mo59004a(Integer num) {
            this.f76367b = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$c */
    static final class C29130c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29126a f76369a;

        /* renamed from: b */
        final /* synthetic */ Effect f76370b;

        /* renamed from: c */
        final /* synthetic */ C48649d f76371c;

        C29130c(C29126a aVar, Effect effect, C48649d dVar) {
            this.f76369a = aVar;
            this.f76370b = effect;
            this.f76371c = dVar;
        }

        public final void run() {
            List<C29137b> list = this.f76369a.f76359c;
            C52711k.m112236a((Object) list, "mCallbacks");
            for (C29137b a : list) {
                a.mo59014a(this.f76370b, this.f76371c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$d */
    static final class C29131d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29126a f76372a;

        /* renamed from: b */
        final /* synthetic */ Effect f76373b;

        /* renamed from: c */
        final /* synthetic */ Effect f76374c;

        /* renamed from: d */
        final /* synthetic */ boolean f76375d;

        C29131d(C29126a aVar, Effect effect, Effect effect2, boolean z) {
            this.f76372a = aVar;
            this.f76373b = effect;
            this.f76374c = effect2;
            this.f76375d = z;
        }

        public final void run() {
            List<C29137b> list = this.f76372a.f76359c;
            C52711k.m112236a((Object) list, "mCallbacks");
            for (C29137b a : list) {
                a.mo59015a(this.f76373b, this.f76374c, this.f76375d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$e */
    static final class C29132e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29126a f76376a;

        /* renamed from: b */
        final /* synthetic */ Effect f76377b;

        C29132e(C29126a aVar, Effect effect) {
            this.f76376a = aVar;
            this.f76377b = effect;
        }

        public final void run() {
            List<C29137b> list = this.f76376a.f76359c;
            C52711k.m112236a((Object) list, "mCallbacks");
            for (C29137b a : list) {
                a.mo59013a(this.f76377b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$f */
    static final class C29133f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29126a f76378a;

        C29133f(C29126a aVar) {
            this.f76378a = aVar;
        }

        public final void run() {
            this.f76378a.f76360d.set(true);
            this.f76378a.mo59001b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$g */
    public static final class C29134g implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C29126a f76379a;

        /* renamed from: b */
        final /* synthetic */ Effect f76380b;

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$g$a */
        static final class C29135a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C29134g f76381a;

            C29135a(C29134g gVar) {
                this.f76381a = gVar;
            }

            public final void run() {
                this.f76381a.f76379a.mo59001b();
            }
        }

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            this.f76379a.f76357a.remove(this.f76380b);
            this.f76379a.f76361e.incrementAndGet();
            this.f76379a.mo58998a(this.f76380b, effect, true);
            this.f76379a.f76360d.set(true);
            this.f76379a.f76362f.post(new C29135a(this));
        }

        C29134g(C29126a aVar, Effect effect) {
            this.f76379a = aVar;
            this.f76380b = effect;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            String str;
            C52711k.m112240b(dVar, "e");
            this.f76379a.f76357a.remove(this.f76380b);
            this.f76379a.f76361e.incrementAndGet();
            C29126a aVar = this.f76379a;
            if (C29126a.m68619c()) {
                aVar.f76362f.post(new C29130c(aVar, effect, dVar));
            } else {
                List<C29137b> list = aVar.f76359c;
                C52711k.m112236a((Object) list, "mCallbacks");
                for (C29137b a : list) {
                    a.mo59014a(effect, dVar);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C52711k.m112239a((Object) this.f76380b, (Object) effect));
            sb.append(", name: ");
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", download failed, reason: ");
            sb.append(dVar.f122280b);
            sb.append(", ");
            sb.append(Log.getStackTraceString(dVar.f122281c));
            this.f76379a.f76360d.set(!this.f76379a.f76357a.isEmpty());
        }
    }

    /* renamed from: a */
    public static C29252f m68614a() {
        return C29127a.m68628a();
    }

    /* renamed from: c */
    static boolean m68619c() {
        return !C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo59001b() {
        Effect effect;
        boolean z = true;
        while (this.f76360d.get() && this.f76361e.get() > 0 && z) {
            if (!this.f76358b.isEmpty()) {
                effect = (Effect) this.f76358b.poll();
            } else if (!this.f76363i.isEmpty()) {
                if (this.f76365k.mo59012a()) {
                    effect = this.f76365k.mo59011a(this.f76357a);
                } else {
                    effect = (Effect) this.f76363i.poll();
                }
            } else if (this.f76365k.mo59012a()) {
                effect = this.f76365k.mo59011a(this.f76357a);
            } else {
                effect = null;
            }
            if (effect != null && m68617b(effect)) {
                m68618c(effect);
            }
            if (effect != null) {
                z = true;
            } else {
                z = false;
            }
            this.f76360d.set(!this.f76357a.isEmpty());
        }
    }

    /* renamed from: b */
    private final boolean m68617b(Effect effect) {
        if (this.f76357a.contains(effect)) {
            return false;
        }
        this.f76357a.add(effect);
        return true;
    }

    /* renamed from: a */
    public final void mo58996a(C29137b bVar) {
        this.f76359c.add(bVar);
    }

    /* renamed from: b */
    private final void m68616b(List<? extends Effect> list) {
        for (Effect effect : list) {
            if (!this.f76363i.contains(effect)) {
                this.f76363i.add(effect);
            }
        }
    }

    /* renamed from: c */
    private final void m68618c(Effect effect) {
        this.f76361e.decrementAndGet();
        m68620d(effect);
        C29252f a = C29127a.m68628a();
        if (a != null) {
            a.mo59123a(effect, C29140a.m68645a("edit_effect_download_error_rate", "edit_effect", new C29134g(this, effect)));
        }
    }

    /* renamed from: d */
    private final void m68620d(Effect effect) {
        if (m68619c()) {
            this.f76362f.post(new C29132e(this, effect));
            return;
        }
        List<C29137b> list = this.f76359c;
        C52711k.m112236a((Object) list, "mCallbacks");
        for (C29137b a : list) {
            a.mo59013a(effect);
        }
    }

    /* renamed from: a */
    public final void mo58997a(Effect effect) {
        if (effect != null) {
            if (!this.f76358b.contains(effect) && !this.f76357a.contains(effect)) {
                this.f76358b.add(effect);
            }
            m68620d(effect);
            if (!this.f76360d.get()) {
                this.f76362f.post(new C29133f(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo58999a(List<? extends Effect> list) {
        C52711k.m112240b(list, "effects");
        m68616b(list);
        this.f76360d.set(true);
        this.f76364j.set(true);
        mo59001b();
    }

    /* renamed from: b */
    public final boolean mo59002b(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.f76358b) {
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo59000a(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.f76357a) {
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    private C29126a(int i, C29138c cVar) {
        this.f76365k = cVar;
        this.f76357a = new ConcurrentLinkedQueue();
        this.f76358b = new ConcurrentLinkedQueue();
        this.f76363i = new ConcurrentLinkedQueue();
        this.f76359c = Collections.synchronizedList(new ArrayList());
        this.f76364j = new AtomicBoolean(false);
        this.f76360d = new AtomicBoolean(false);
        this.f76361e = new AtomicInteger(i);
        this.f76362f = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C29126a(int i, C29138c cVar, C52707g gVar) {
        this(i, cVar);
    }

    /* renamed from: a */
    public final void mo58998a(Effect effect, Effect effect2, boolean z) {
        C52711k.m112240b(effect, "rawEffect");
        if (m68619c()) {
            this.f76362f.post(new C29131d(this, effect, effect2, z));
            return;
        }
        List<C29137b> list = this.f76359c;
        C52711k.m112236a((Object) list, "mCallbacks");
        for (C29137b a : list) {
            a.mo59015a(effect, effect2, z);
        }
    }
}
