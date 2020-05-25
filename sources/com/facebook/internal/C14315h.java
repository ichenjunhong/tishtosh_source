package com.facebook.internal;

import android.app.Activity;
import com.facebook.C14457k;
import com.facebook.C14533n;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.internal.h */
public abstract class C14315h<CONTENT, RESULT> {

    /* renamed from: a */
    protected static final Object f37254a = new Object();

    /* renamed from: b */
    public int f37255b;

    /* renamed from: c */
    private final Activity f37256c;

    /* renamed from: d */
    private final C14345q f37257d = null;

    /* renamed from: e */
    private List<C14316a> f37258e;

    /* renamed from: com.facebook.internal.h$a */
    public abstract class C14316a {
        /* renamed from: a */
        public abstract C14262a mo26532a(CONTENT content);

        /* renamed from: a */
        public abstract boolean mo26534a(CONTENT content, boolean z);

        /* renamed from: a */
        public Object mo26533a() {
            return C14315h.f37254a;
        }

        protected C14316a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C14316a> mo26529b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C14262a mo26531c();

    /* renamed from: d */
    private List<C14316a> mo26812d() {
        if (this.f37258e == null) {
            this.f37258e = mo26529b();
        }
        return this.f37258e;
    }

    /* renamed from: a */
    public final Activity mo26527a() {
        if (this.f37256c != null) {
            return this.f37256c;
        }
        if (this.f37257d != null) {
            return this.f37257d.mo26546a();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo26528a(CONTENT content) {
        boolean z;
        Object obj = f37254a;
        if (obj == f37254a) {
            z = true;
        } else {
            z = false;
        }
        for (C14316a aVar : mo26812d()) {
            if ((z || C14277aa.m29275a(aVar.mo26533a(), obj)) && aVar.mo26534a(content, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo26530b(CONTENT content) {
        C14262a a = m29361a(content, f37254a);
        if (a != null) {
            if (this.f37257d != null) {
                this.f37257d.mo26547a(a.f37174b, a.f37175c);
                a.mo26472a();
                return;
            }
            this.f37256c.startActivityForResult(a.f37174b, a.f37175c);
            a.mo26472a();
        } else if (C14533n.m29769c()) {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
    }

    protected C14315h(Activity activity, int i) {
        C14283ab.m29306a((Object) activity, "activity");
        this.f37256c = activity;
        this.f37255b = i;
    }

    /* renamed from: a */
    private C14262a m29361a(CONTENT content, Object obj) {
        boolean z;
        if (obj == f37254a) {
            z = true;
        } else {
            z = false;
        }
        C14262a aVar = null;
        Iterator it = mo26812d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C14316a aVar2 = (C14316a) it.next();
            if ((z || C14277aa.m29275a(aVar2.mo26533a(), obj)) && aVar2.mo26534a(content, true)) {
                try {
                    aVar = aVar2.mo26532a(content);
                    break;
                } catch (C14457k e) {
                    aVar = mo26531c();
                    C14313g.m29353a(aVar, e);
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        C14262a c = mo26531c();
        C14313g.m29353a(c, new C14457k("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        return c;
    }
}
