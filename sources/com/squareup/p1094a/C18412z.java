package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.p1094a.C18396v.C18402d;
import com.squareup.p1094a.C18409y.C18411a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.a.z */
public final class C18412z {

    /* renamed from: l */
    private static final AtomicInteger f50872l = new AtomicInteger();

    /* renamed from: a */
    public final C18396v f50873a;

    /* renamed from: b */
    public final C18411a f50874b;

    /* renamed from: c */
    public boolean f50875c;

    /* renamed from: d */
    public boolean f50876d;

    /* renamed from: e */
    public int f50877e;

    /* renamed from: f */
    public int f50878f;

    /* renamed from: g */
    public int f50879g;

    /* renamed from: h */
    public int f50880h;

    /* renamed from: i */
    public Drawable f50881i;

    /* renamed from: j */
    public Drawable f50882j;

    /* renamed from: k */
    public Object f50883k;

    /* renamed from: m */
    private boolean f50884m;

    /* renamed from: a */
    public final C18412z mo36880a() {
        this.f50875c = true;
        return this;
    }

    C18412z() {
        this.f50876d = true;
        this.f50874b = new C18411a(null, 0, null);
    }

    /* renamed from: b */
    public final C18412z mo36887b() {
        C18411a aVar = this.f50874b;
        if (!aVar.f50858b) {
            aVar.f50857a = true;
            return this;
        }
        throw new IllegalStateException("Center crop can not be used after calling centerInside");
    }

    /* renamed from: c */
    public Drawable mo36888c() {
        if (this.f50877e != 0) {
            return this.f50873a.f50797d.getResources().getDrawable(this.f50877e);
        }
        return this.f50881i;
    }

    /* renamed from: a */
    public final void mo36885a(ImageView imageView) {
        mo36886a(imageView, (C18371e) null);
    }

    /* renamed from: a */
    public final C18412z mo36881a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.f50882j == null) {
            this.f50878f = i;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    /* renamed from: a */
    public C18409y mo36879a(long j) {
        int andIncrement = f50872l.getAndIncrement();
        C18409y c = this.f50874b.mo36878c();
        c.f50839a = andIncrement;
        c.f50840b = j;
        boolean z = this.f50873a.f50806m;
        if (z) {
            c.mo36870b();
        }
        C18409y a = this.f50873a.mo36847a(c);
        if (a != c) {
            a.f50839a = andIncrement;
            a.f50840b = j;
            if (z) {
                a.mo36869a();
                new StringBuilder("into ").append(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C18412z mo36882a(int i, int i2) {
        this.f50874b.mo36875a(i, i2);
        return this;
    }

    /* renamed from: a */
    public final C18412z mo36883a(C18391r rVar, C18391r... rVarArr) {
        if (rVar != null) {
            this.f50879g = rVar.f50788a | this.f50879g;
            int i = 0;
            while (i <= 0) {
                C18391r rVar2 = rVarArr[0];
                if (rVar2 != null) {
                    this.f50879g = rVar2.f50788a | this.f50879g;
                    i++;
                } else {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    /* renamed from: a */
    public final C18412z mo36884a(C18392s sVar, C18392s... sVarArr) {
        if (sVar != null) {
            this.f50880h = sVar.f50790a | this.f50880h;
            int i = 0;
            while (i <= 0) {
                C18392s sVar2 = sVarArr[0];
                if (sVar2 != null) {
                    this.f50880h = sVar2.f50790a | this.f50880h;
                    i++;
                } else {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    /* renamed from: a */
    public final void mo36886a(ImageView imageView, C18371e eVar) {
        ImageView imageView2 = imageView;
        C18371e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        C18356aj.m44597a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f50874b.mo36876a()) {
            this.f50873a.mo36851a(imageView2);
            if (this.f50876d) {
                C18406w.m44688a(imageView2, mo36888c());
            }
        } else {
            if (this.f50875c) {
                if (!this.f50874b.mo36877b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f50876d) {
                            C18406w.m44688a(imageView2, mo36888c());
                        }
                        this.f50873a.mo36852a(imageView2, new C18374h(this, imageView2, eVar2));
                        return;
                    }
                    this.f50874b.mo36875a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C18409y a = mo36879a(nanoTime);
            String a2 = C18356aj.m44595a(a);
            if (C18391r.shouldReadFromMemoryCache(this.f50879g)) {
                Bitmap b = this.f50873a.mo36856b(a2);
                if (b != null) {
                    this.f50873a.mo36851a(imageView2);
                    C18406w.m44687a(imageView, this.f50873a.f50797d, b, C18402d.MEMORY, this.f50884m, this.f50873a.f50805l);
                    if (this.f50873a.f50806m) {
                        a.mo36870b();
                        new StringBuilder("from ").append(C18402d.MEMORY);
                    }
                    if (eVar2 != null) {
                        eVar.mo36819a();
                    }
                    return;
                }
            }
            if (this.f50876d) {
                C18406w.m44688a(imageView2, mo36888c());
            }
            C18386n nVar = new C18386n(this.f50873a, imageView, a, this.f50879g, this.f50880h, this.f50878f, this.f50882j, a2, this.f50883k, eVar, this.f50884m);
            this.f50873a.mo36853a((C18341a) nVar);
        }
    }

    public C18412z(C18396v vVar, Uri uri, int i) {
        this.f50876d = true;
        if (!vVar.f50807n) {
            this.f50873a = vVar;
            this.f50874b = new C18411a(uri, i, vVar.f50804k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }
}
