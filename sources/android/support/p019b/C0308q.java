package android.support.p019b;

import android.animation.TimeInterpolator;
import android.support.p019b.C0296m.C0301b;
import android.support.p019b.C0296m.C0302c;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.b.q */
public class C0308q extends C0296m {

    /* renamed from: a */
    int f759a;

    /* renamed from: p */
    boolean f760p = false;

    /* renamed from: q */
    private ArrayList<C0296m> f761q = new ArrayList<>();

    /* renamed from: r */
    private boolean f762r = true;

    /* renamed from: s */
    private int f763s = 0;

    /* renamed from: android.support.b.q$a */
    static class C0310a extends C0303n {

        /* renamed from: a */
        C0308q f766a;

        C0310a(C0308q qVar) {
            this.f766a = qVar;
        }

        /* renamed from: a */
        public final void mo530a(C0296m mVar) {
            this.f766a.f759a--;
            if (this.f766a.f759a == 0) {
                this.f766a.f760p = false;
                this.f766a.mo610d();
            }
            mVar.mo602b((C0302c) this);
        }

        /* renamed from: d */
        public final void mo533d(C0296m mVar) {
            if (!this.f766a.f760p) {
                this.f766a.mo607c();
                this.f766a.f760p = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo596a(ViewGroup viewGroup, C0313t tVar, C0313t tVar2, ArrayList<C0312s> arrayList, ArrayList<C0312s> arrayList2) {
        long j = this.f721c;
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            C0296m mVar = (C0296m) this.f761q.get(i);
            if (j > 0 && (this.f762r || i == 0)) {
                long j2 = mVar.f721c;
                if (j2 > 0) {
                    mVar.mo601b(j2 + j);
                } else {
                    mVar.mo601b(j);
                }
            }
            mVar.mo596a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo524a(C0312s sVar) {
        if (mo599a(sVar.f771b)) {
            Iterator it = this.f761q.iterator();
            while (it.hasNext()) {
                C0296m mVar = (C0296m) it.next();
                if (mVar.mo599a(sVar.f771b)) {
                    mVar.mo524a(sVar);
                    sVar.f772c.add(mVar);
                }
            }
        }
    }

    /* renamed from: f */
    public final int mo626f() {
        return this.f761q.size();
    }

    /* renamed from: e */
    public final C0296m clone() {
        C0308q qVar = (C0308q) super.clone();
        qVar.f761q = new ArrayList<>();
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            qVar.mo622a(((C0296m) this.f761q.get(i)).clone());
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo605b() {
        if (this.f761q.isEmpty()) {
            mo607c();
            mo610d();
            return;
        }
        C0310a aVar = new C0310a(this);
        Iterator it = this.f761q.iterator();
        while (it.hasNext()) {
            ((C0296m) it.next()).mo589a((C0302c) aVar);
        }
        this.f759a = this.f761q.size();
        if (!this.f762r) {
            for (int i = 1; i < this.f761q.size(); i++) {
                final C0296m mVar = (C0296m) this.f761q.get(i);
                ((C0296m) this.f761q.get(i - 1)).mo589a((C0302c) new C0303n() {
                    /* renamed from: a */
                    public final void mo530a(C0296m mVar) {
                        mVar.mo605b();
                        mVar.mo602b((C0302c) this);
                    }
                });
            }
            C0296m mVar2 = (C0296m) this.f761q.get(0);
            if (mVar2 != null) {
                mVar2.mo605b();
            }
            return;
        }
        Iterator it2 = this.f761q.iterator();
        while (it2.hasNext()) {
            ((C0296m) it2.next()).mo605b();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C0296m mo601b(long j) {
        return (C0308q) super.mo601b(j);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C0296m mo602b(C0302c cVar) {
        return (C0308q) super.mo602b(cVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0296m mo589a(C0302c cVar) {
        return (C0308q) super.mo589a(cVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C0296m mo600b(int i) {
        for (int i2 = 0; i2 < this.f761q.size(); i2++) {
            ((C0296m) this.f761q.get(i2)).mo600b(i);
        }
        return (C0308q) super.mo600b(i);
    }

    /* renamed from: c */
    public final C0296m mo624c(int i) {
        if (i < 0 || i >= this.f761q.size()) {
            return null;
        }
        return (C0296m) this.f761q.get(i);
    }

    /* renamed from: d */
    public final void mo611d(View view) {
        super.mo611d(view);
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            ((C0296m) this.f761q.get(i)).mo611d(view);
        }
    }

    /* renamed from: e */
    public final void mo613e(View view) {
        super.mo613e(view);
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            ((C0296m) this.f761q.get(i)).mo613e(view);
        }
    }

    /* renamed from: a */
    public final C0308q mo621a(int i) {
        switch (i) {
            case 0:
                this.f762r = true;
                break;
            case 1:
                this.f762r = false;
                break;
            default:
                StringBuilder sb = new StringBuilder("Invalid parameter for TransitionSet ordering: ");
                sb.append(i);
                throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ C0296m mo603b(View view) {
        for (int i = 0; i < this.f761q.size(); i++) {
            ((C0296m) this.f761q.get(i)).mo603b(view);
        }
        return (C0308q) super.mo603b(view);
    }

    /* renamed from: c */
    public final /* synthetic */ C0296m mo606c(View view) {
        for (int i = 0; i < this.f761q.size(); i++) {
            ((C0296m) this.f761q.get(i)).mo606c(view);
        }
        return (C0308q) super.mo606c(view);
    }

    /* renamed from: a */
    public final C0308q mo622a(C0296m mVar) {
        this.f761q.add(mVar);
        mVar.f728j = this;
        if (this.f722d >= 0) {
            mVar.mo587a(this.f722d);
        }
        if ((this.f763s & 1) != 0) {
            mVar.mo588a(this.f723e);
        }
        if ((this.f763s & 2) != 0) {
            mVar.mo594a(this.f731m);
        }
        if ((this.f763s & 4) != 0) {
            mVar.mo592a(this.f733o);
        }
        if ((this.f763s & 8) != 0) {
            mVar.mo593a(this.f732n);
        }
        return this;
    }

    /* renamed from: b */
    public final C0308q mo588a(TimeInterpolator timeInterpolator) {
        this.f763s |= 1;
        if (this.f761q != null) {
            int size = this.f761q.size();
            for (int i = 0; i < size; i++) {
                ((C0296m) this.f761q.get(i)).mo588a(timeInterpolator);
            }
        }
        return (C0308q) super.mo588a(timeInterpolator);
    }

    /* renamed from: c */
    public final C0308q mo587a(long j) {
        super.mo587a(j);
        if (this.f722d >= 0) {
            int size = this.f761q.size();
            for (int i = 0; i < size; i++) {
                ((C0296m) this.f761q.get(i)).mo587a(j);
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo591a(String str) {
        String a = super.mo591a(str);
        for (int i = 0; i < this.f761q.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            C0296m mVar = (C0296m) this.f761q.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(mVar.mo591a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo608c(C0312s sVar) {
        super.mo608c(sVar);
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            ((C0296m) this.f761q.get(i)).mo608c(sVar);
        }
    }

    /* renamed from: a */
    public final void mo592a(C0281g gVar) {
        super.mo592a(gVar);
        this.f763s |= 4;
        for (int i = 0; i < this.f761q.size(); i++) {
            ((C0296m) this.f761q.get(i)).mo592a(gVar);
        }
    }

    /* renamed from: b */
    public final void mo528b(C0312s sVar) {
        if (mo599a(sVar.f771b)) {
            Iterator it = this.f761q.iterator();
            while (it.hasNext()) {
                C0296m mVar = (C0296m) it.next();
                if (mVar.mo599a(sVar.f771b)) {
                    mVar.mo528b(sVar);
                    sVar.f772c.add(mVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo593a(C0301b bVar) {
        super.mo593a(bVar);
        this.f763s |= 8;
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            ((C0296m) this.f761q.get(i)).mo593a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo594a(C0307p pVar) {
        super.mo594a(pVar);
        this.f763s |= 2;
        int size = this.f761q.size();
        for (int i = 0; i < size; i++) {
            ((C0296m) this.f761q.get(i)).mo594a(pVar);
        }
    }
}
