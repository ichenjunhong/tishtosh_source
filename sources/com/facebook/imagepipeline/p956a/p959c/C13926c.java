package com.facebook.imagepipeline.p956a.p959c;

import android.net.Uri;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13690j;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p964d.C13971h.C13976c;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p914c.p915a.C13619c;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.facebook.imagepipeline.a.c.c */
public final class C13926c {

    /* renamed from: a */
    public final C13619c f36332a;

    /* renamed from: b */
    public final C13971h<C13619c, C14042c> f36333b;

    /* renamed from: c */
    private final C13976c<C13619c> f36334c = new C13976c<C13619c>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo26098a(Object obj, boolean z) {
            C13926c.this.mo26096a((C13619c) obj, z);
        }
    };

    /* renamed from: d */
    private final LinkedHashSet<C13619c> f36335d = new LinkedHashSet<>();

    /* renamed from: com.facebook.imagepipeline.a.c.c$a */
    static class C13929a implements C13619c {

        /* renamed from: a */
        private final C13619c f36339a;

        /* renamed from: b */
        private final int f36340b;

        /* renamed from: a */
        public final String mo25470a() {
            return null;
        }

        public final int hashCode() {
            return (this.f36339a.hashCode() * 1013) + this.f36340b;
        }

        public final String toString() {
            return C13685h.m27644a(this).mo25581a("imageCacheKey", (Object) this.f36339a).mo25580a("frameIndex", this.f36340b).toString();
        }

        /* renamed from: a */
        public final boolean mo25471a(Uri uri) {
            return this.f36339a.mo25471a(uri);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C13929a)) {
                return false;
            }
            C13929a aVar = (C13929a) obj;
            if (this.f36340b != aVar.f36340b || !this.f36339a.equals(aVar.f36339a)) {
                return false;
            }
            return true;
        }

        public C13929a(C13619c cVar, int i) {
            this.f36339a = cVar;
            this.f36340b = i;
        }
    }

    /* renamed from: a */
    public synchronized C13619c mo26093a() {
        C13619c cVar;
        cVar = null;
        Iterator it = this.f36335d.iterator();
        if (it.hasNext()) {
            cVar = (C13619c) it.next();
            it.remove();
        }
        return cVar;
    }

    /* renamed from: a */
    public C13929a mo26095a(int i) {
        return new C13929a(this.f36332a, i);
    }

    /* renamed from: b */
    public final void mo26097b(final int i) {
        if (i != -1) {
            this.f36333b.mo26164b((C13690j<K>) new C13690j<C13619c>() {
                /* renamed from: a */
                public final /* synthetic */ boolean mo25584a(Object obj) {
                    if (new C13929a(C13926c.this.f36332a, i).equals((C13619c) obj)) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public final C13715a<C14042c> mo26094a(int i, C13715a<C14042c> aVar) {
        return this.f36333b.mo26161a(mo26095a(i), aVar, this.f36334c);
    }

    public C13926c(C13619c cVar, C13971h<C13619c, C14042c> hVar) {
        this.f36332a = cVar;
        this.f36333b = hVar;
    }

    /* renamed from: a */
    public final synchronized void mo26096a(C13619c cVar, boolean z) {
        if (z) {
            this.f36335d.add(cVar);
        } else {
            this.f36335d.remove(cVar);
        }
    }
}
