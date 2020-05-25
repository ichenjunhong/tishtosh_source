package com.p683ss.android.ugc.effectmanager;

import android.content.Context;
import android.content.res.AssetManager;
import com.p683ss.android.ugc.effectmanager.C48580c.C48586a;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48678n;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.b */
public final class C48566b {

    /* renamed from: a */
    public final AssetManager f122048a;

    /* renamed from: b */
    public final String f122049b;

    /* renamed from: c */
    public final C48640a f122050c;

    /* renamed from: d */
    public final List<Host> f122051d;

    /* renamed from: e */
    public final C48641b f122052e;

    /* renamed from: f */
    public final Executor f122053f;

    /* renamed from: g */
    public final String f122054g;

    /* renamed from: h */
    public final String f122055h;

    /* renamed from: i */
    public final Pattern f122056i;

    /* renamed from: j */
    public final C48586a f122057j;

    /* renamed from: k */
    public final C48890g f122058k;

    /* renamed from: l */
    public final C48569b f122059l;

    /* renamed from: m */
    public final String f122060m;

    /* renamed from: n */
    public final String f122061n;

    /* renamed from: o */
    public final C48642c f122062o;

    /* renamed from: p */
    public final C48901i f122063p;

    /* renamed from: q */
    public final C48631g f122064q;

    /* renamed from: r */
    public final Context f122065r;

    /* renamed from: com.ss.android.ugc.effectmanager.b$a */
    public static final class C48568a {

        /* renamed from: a */
        AssetManager f122066a;

        /* renamed from: b */
        String f122067b;

        /* renamed from: c */
        C48640a f122068c;

        /* renamed from: d */
        List<Host> f122069d = new ArrayList();

        /* renamed from: e */
        C48641b f122070e;

        /* renamed from: f */
        Executor f122071f;

        /* renamed from: g */
        String f122072g;

        /* renamed from: h */
        String f122073h;

        /* renamed from: i */
        String f122074i;

        /* renamed from: j */
        String f122075j;

        /* renamed from: k */
        C48642c f122076k;

        /* renamed from: l */
        Pattern f122077l;

        /* renamed from: m */
        C48586a f122078m;

        /* renamed from: n */
        C48569b f122079n;

        /* renamed from: o */
        C48901i f122080o;

        /* renamed from: p */
        C48890g f122081p;

        /* renamed from: q */
        C48631g f122082q;

        /* renamed from: r */
        Context f122083r;

        /* renamed from: a */
        public final C48566b mo96097a() {
            return new C48566b(this);
        }

        /* renamed from: a */
        public final C48568a mo96086a(AssetManager assetManager) {
            this.f122066a = assetManager;
            return this;
        }

        /* renamed from: b */
        public final C48568a mo96098b(String str) {
            this.f122072g = str;
            return this;
        }

        /* renamed from: c */
        public final C48568a mo96099c(String str) {
            this.f122073h = str;
            return this;
        }

        /* renamed from: d */
        public final C48568a mo96100d(String str) {
            this.f122074i = str;
            return this;
        }

        /* renamed from: e */
        public final C48568a mo96101e(String str) {
            this.f122075j = str;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96087a(C48569b bVar) {
            this.f122079n = bVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96088a(C48586a aVar) {
            this.f122078m = aVar;
            return this;
        }

        /* renamed from: f */
        public final C48568a mo96102f(String str) {
            if (str == null) {
                this.f122077l = null;
            } else {
                this.f122077l = Pattern.compile(str);
            }
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96089a(C48640a aVar) {
            this.f122068c = aVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96090a(C48641b bVar) {
            this.f122070e = bVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96091a(C48642c cVar) {
            this.f122076k = cVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96092a(C48890g gVar) {
            this.f122081p = gVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96093a(C48901i iVar) {
            this.f122080o = iVar;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96094a(String str) {
            this.f122067b = str;
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96095a(List<Host> list) {
            this.f122069d.addAll(list);
            return this;
        }

        /* renamed from: a */
        public final C48568a mo96096a(Executor executor) {
            this.f122071f = executor;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b$b */
    public enum C48569b {
        TEST,
        ONLINE
    }

    private C48566b(C48568a aVar) {
        C48569b bVar;
        C48901i iVar;
        this.f122048a = (AssetManager) C48678n.m105349a(aVar.f122066a);
        this.f122049b = (String) C48678n.m105349a(aVar.f122067b);
        this.f122050c = (C48640a) C48678n.m105349a(aVar.f122068c);
        this.f122051d = Collections.unmodifiableList(aVar.f122069d);
        this.f122052e = (C48641b) C48678n.m105349a(aVar.f122070e);
        this.f122053f = (Executor) C48678n.m105349a(aVar.f122071f);
        this.f122054g = (String) C48678n.m105349a(aVar.f122072g);
        this.f122055h = (String) C48678n.m105349a(aVar.f122073h);
        this.f122060m = (String) C48678n.m105349a(aVar.f122074i);
        this.f122061n = (String) C48678n.m105349a(aVar.f122075j);
        this.f122062o = aVar.f122076k;
        this.f122056i = aVar.f122077l;
        this.f122057j = aVar.f122078m;
        if (aVar.f122079n == null) {
            bVar = C48569b.ONLINE;
        } else {
            bVar = aVar.f122079n;
        }
        this.f122059l = bVar;
        if (aVar.f122080o == null) {
            iVar = C48901i.ORIGIN;
        } else {
            iVar = aVar.f122080o;
        }
        this.f122063p = iVar;
        this.f122064q = aVar.f122082q;
        this.f122058k = aVar.f122081p;
        this.f122065r = aVar.f122083r;
    }
}
