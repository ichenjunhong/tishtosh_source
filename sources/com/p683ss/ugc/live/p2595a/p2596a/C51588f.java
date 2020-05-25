package com.p683ss.ugc.live.p2595a.p2596a;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51585a;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51586b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.ugc.live.a.a.f */
public final class C51588f implements C51557a<String> {

    /* renamed from: a */
    public static C51588f f128855a;

    /* renamed from: b */
    public final Map<Long, C51593g> f128856b;

    /* renamed from: c */
    public final C51582e f128857c;

    /* renamed from: d */
    public final List<C51560b> f128858d = new ArrayList();

    /* renamed from: e */
    final Handler f128859e;

    /* renamed from: f */
    public int f128860f = 0;

    /* renamed from: g */
    public int f128861g = 0;

    /* renamed from: h */
    private final Deque<C51568c> f128862h = new ArrayDeque();

    /* renamed from: a */
    public static C51588f m110738a() {
        if (f128855a != null) {
            return f128855a;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    /* renamed from: b */
    public final void mo105508b() {
        if (this.f128860f < this.f128857c.f128845e && !this.f128862h.isEmpty()) {
            if (this.f128857c.f128846f <= 0 || this.f128861g < this.f128857c.f128846f) {
                this.f128860f++;
                mo105510c((C51568c) this.f128862h.poll());
                return;
            }
            m110739c();
            this.f128861g = 0;
        }
    }

    /* renamed from: c */
    private void m110739c() {
        this.f128862h.iterator();
        while (this.f128862h.peek() != null) {
            C51568c cVar = (C51568c) this.f128862h.poll();
            C51593g gVar = (C51593g) this.f128856b.get(Long.valueOf(cVar.f128817a));
            if (gVar != null) {
                for (C51574d a : gVar.f128874b) {
                    a.mo13435a(cVar.f128817a);
                }
                this.f128856b.remove(Long.valueOf(cVar.f128817a));
            }
        }
    }

    /* renamed from: a */
    public final void mo105506a(C51568c cVar) {
        mo105507a(cVar, (C51574d) null);
    }

    /* renamed from: c */
    public final void mo105510c(C51568c cVar) {
        this.f128857c.f128842b.mo13402a(cVar, this.f128857c).mo13398a(cVar, this);
    }

    public C51588f(C51582e eVar) {
        this.f128857c = eVar;
        this.f128856b = new HashMap();
        this.f128859e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: d */
    public String mo105511d(C51568c cVar) {
        String a = C51586b.m110734a(this.f128857c.f128841a.mo13424a(cVar));
        if (!cVar.f128821e) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(C51585a.m110731a(cVar.mo105497a()));
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: b */
    public final boolean mo105509b(C51568c cVar) {
        if (cVar == null) {
            return false;
        }
        String a = C51586b.m110734a(this.f128857c.f128841a.mo13424a(cVar));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".fetched");
        return new File(sb.toString()).exists();
    }

    /* renamed from: a */
    public final void mo105488a(final C51568c cVar, final int i) {
        this.f128859e.post(new Runnable() {
            public final void run() {
                C51593g gVar = (C51593g) C51588f.this.f128856b.get(Long.valueOf(cVar.f128817a));
                if (gVar != null) {
                    Iterator it = gVar.f128874b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo105489a(final C51568c cVar, final C51569a aVar) {
        this.f128859e.post(new Runnable() {
            public final void run() {
                C51593g gVar = (C51593g) C51588f.this.f128856b.get(Long.valueOf(cVar.f128817a));
                if (gVar != null) {
                    if (cVar.f128823g < Math.max(cVar.f128818b.length, C51588f.this.f128857c.f128843c) - 1) {
                        C51588f fVar = C51588f.this;
                        fVar.f128859e.postDelayed(new Runnable(cVar) {

                            /* renamed from: a */
                            final /* synthetic */ C51568c f128868a;

                            public final void run() {
                                this.f128868a.mo105499c();
                                C51588f.this.mo105510c(this.f128868a);
                            }

                            {
                                this.f128868a = r2;
                            }
                        }, (long) (fVar.f128857c.f128844d * 1000));
                        return;
                    }
                    for (C51574d a : gVar.f128874b) {
                        a.mo13437a((Throwable) aVar);
                    }
                }
                C51588f.this.f128856b.remove(Long.valueOf(cVar.f128817a));
                for (C51560b a2 : C51588f.this.f128858d) {
                    a2.mo13388a(aVar);
                }
                C51588f.this.f128860f--;
                C51588f.this.f128861g++;
                C51588f.this.mo105508b();
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ void mo105490a(final C51568c cVar, Object obj) {
        String str = (String) obj;
        String a = C51586b.m110734a(this.f128857c.f128841a.mo13424a(cVar));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".fetched");
        try {
            new File(sb.toString()).createNewFile();
        } catch (IOException unused) {
        }
        this.f128859e.post(new Runnable() {
            public final void run() {
                C51588f fVar = C51588f.this;
                C51568c cVar = cVar;
                long j = cVar.f128817a;
                String d = fVar.mo105511d(cVar);
                C51593g gVar = (C51593g) fVar.f128856b.get(Long.valueOf(j));
                if (gVar != null) {
                    for (C51574d a : gVar.f128874b) {
                        a.mo13436a(cVar.f128817a, d);
                    }
                }
                fVar.f128856b.remove(Long.valueOf(j));
                for (C51560b a2 : fVar.f128858d) {
                    a2.mo13387a(cVar.f128817a, cVar);
                }
                fVar.f128860f--;
                fVar.f128861g = 0;
                fVar.mo105508b();
            }
        });
    }

    /* renamed from: a */
    public final void mo105507a(C51568c cVar, C51574d dVar) {
        if (cVar != null) {
            if (!mo105509b(cVar)) {
                long j = cVar.f128817a;
                if (this.f128856b.containsKey(Long.valueOf(j))) {
                    if (cVar.f128822f) {
                        C51568c cVar2 = ((C51593g) this.f128856b.get(Long.valueOf(j))).f128873a;
                        if (cVar2 != null && this.f128862h.contains(cVar2)) {
                            this.f128862h.remove(cVar2);
                        }
                        cVar.mo105499c();
                        this.f128862h.addFirst(cVar);
                    }
                    if (dVar != null) {
                        ((C51593g) this.f128856b.get(Long.valueOf(j))).mo105516a(dVar);
                        return;
                    }
                    return;
                }
                C51593g gVar = new C51593g(cVar);
                if (dVar != null) {
                    gVar.mo105516a(dVar);
                }
                this.f128856b.put(Long.valueOf(j), gVar);
                cVar.mo105499c();
                if (cVar.f128822f) {
                    this.f128862h.addFirst(cVar);
                } else {
                    this.f128862h.add(cVar);
                }
                mo105508b();
            } else if (dVar != null) {
                dVar.mo13436a(cVar.f128817a, mo105511d(cVar));
            }
        }
    }
}
