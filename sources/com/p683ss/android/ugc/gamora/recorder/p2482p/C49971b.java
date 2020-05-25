package com.p683ss.android.ugc.gamora.recorder.p2482p;

import android.view.View;
import com.p683ss.android.ugc.aweme.base.C23550k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.b */
public final class C49971b implements Cloneable, Comparable<C49971b> {

    /* renamed from: a */
    public final int f125188a;

    /* renamed from: b */
    public int f125189b;

    /* renamed from: c */
    public C23550k f125190c;

    /* renamed from: d */
    public boolean f125191d;

    /* renamed from: e */
    public C49940a f125192e;

    /* renamed from: f */
    public boolean f125193f;

    /* renamed from: g */
    public boolean f125194g;

    /* renamed from: h */
    public int f125195h;

    /* renamed from: i */
    public C49972a f125196i;

    /* renamed from: j */
    public boolean f125197j;

    /* renamed from: k */
    public boolean f125198k;

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.b$a */
    public interface C49972a {
        /* renamed from: a */
        void mo50183a(View view);
    }

    /* renamed from: a */
    public final void mo97765a() {
        this.f125194g = false;
    }

    public final int hashCode() {
        return this.f125188a;
    }

    /* renamed from: b */
    public final C49971b clone() {
        C49971b bVar = new C49971b(this.f125188a, this.f125189b, this.f125192e, this.f125195h);
        bVar.f125190c = this.f125190c;
        bVar.f125191d = this.f125191d;
        bVar.f125193f = this.f125193f;
        bVar.f125194g = this.f125194g;
        bVar.f125197j = this.f125197j;
        bVar.f125196i = this.f125196i;
        return bVar;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f125188a, ((C49971b) obj).f125188a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C49971b)) {
            return false;
        }
        C49971b bVar = (C49971b) obj;
        if (this.f125188a == bVar.f125188a && this.f125189b == bVar.f125189b && this.f125195h == bVar.f125195h && this.f125191d == bVar.f125191d && this.f125190c == bVar.f125190c) {
            return true;
        }
        return false;
    }

    public C49971b(int i, int i2, C49940a aVar, int i3) {
        this(i, i2, aVar, i3, true);
    }

    public C49971b(int i, int i2, C49940a aVar, int i3, boolean z) {
        this.f125191d = true;
        this.f125197j = true;
        this.f125188a = i;
        this.f125189b = i2;
        this.f125192e = aVar;
        this.f125195h = i3;
        this.f125191d = z;
    }
}
