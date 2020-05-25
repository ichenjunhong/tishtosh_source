package com.bytedance.p815p.p816a.p818b;

import android.util.SparseArray;
import com.bytedance.p815p.p816a.C12527a;
import com.bytedance.p815p.p816a.C12536b;
import com.bytedance.p815p.p816a.p820d.C12550a;
import com.bytedance.p815p.p816a.p820d.C12551b;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17339e;
import com.google.android.play.core.p1053e.C17340f;
import com.google.android.play.core.p1053e.C17342g;
import com.google.android.play.core.p1053e.C17343h;
import com.google.android.play.core.p1056f.C17362a;
import com.google.android.play.core.p1056f.C17363b;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.p.a.b.b */
public final class C12541b implements C12545c, C17343h {

    /* renamed from: c */
    public static volatile boolean f32920c;

    /* renamed from: a */
    C17338d f32921a;

    /* renamed from: b */
    public SparseArray<C12536b> f32922b = new SparseArray<>();

    /* renamed from: d */
    private ScheduledThreadPoolExecutor f32923d;

    /* renamed from: e */
    private Queue<C12536b> f32924e = new LinkedList();

    /* renamed from: f */
    private Object f32925f = new Object();

    /* renamed from: g */
    private C12550a f32926g;

    /* renamed from: com.bytedance.p.a.b.b$a */
    class C12544a implements Runnable {

        /* renamed from: b */
        private C12536b f32932b;

        public final void run() {
            C12541b bVar = C12541b.this;
            C12536b bVar2 = this.f32932b;
            if (bVar.f32921a != null && !bVar.mo23585b(null).contains(bVar2.f32909b)) {
                bVar.f32921a.mo33616a(C17340f.m42459a().mo33631a(bVar2.f32909b).mo33632a()).mo33657a((C17363b<? super ResultT>) new C17363b<Integer>(bVar2) {

                    /* renamed from: a */
                    final /* synthetic */ C12536b f32929a;

                    /* renamed from: a */
                    public final /* synthetic */ void mo23058a(Object obj) {
                        C12541b.this.f32922b.put(((Integer) obj).intValue(), this.f32929a);
                    }

                    {
                        this.f32929a = r2;
                    }
                }).mo33656a((C17362a) new C17362a(bVar2) {

                    /* renamed from: a */
                    final /* synthetic */ C12536b f32927a;

                    /* renamed from: a */
                    public final void mo23057a(Exception exc) {
                        C12541b.f32920c = false;
                        C12541b.this.mo23587a(this.f32927a.f32909b, 300000);
                        C12541b.this.mo23586a();
                    }

                    {
                        this.f32927a = r2;
                    }
                });
                bVar.mo23588a(bVar2.f32909b, "stage_start_install");
            }
        }

        public C12544a(C12536b bVar) {
            this.f32932b = bVar;
        }
    }

    /* renamed from: b */
    private void m25161b() {
        synchronized (this.f32925f) {
            if (this.f32923d.getQueue().isEmpty() && !f32920c) {
                mo23586a();
            }
        }
    }

    /* renamed from: a */
    public final void mo23586a() {
        synchronized (this.f32925f) {
            C12536b bVar = (C12536b) this.f32924e.poll();
            if (bVar != null) {
                f32920c = true;
                this.f32923d.schedule(new C12544a(bVar), bVar.f32911d, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public final Set<String> mo23585b(C12527a aVar) {
        if (this.f32921a == null) {
            this.f32921a = C17339e.m42458a(aVar.f32893b.getApplicationContext());
            this.f32921a.mo33618a((C17343h) this);
        }
        if (this.f32926g == null) {
            this.f32926g = new C12551b(aVar.f32893b.getApplicationContext());
        }
        return this.f32921a.mo33621b();
    }

    /* renamed from: a */
    public final void mo23584a(C12527a aVar) {
        if (this.f32923d == null) {
            this.f32923d = new ScheduledThreadPoolExecutor(1);
        }
        if (this.f32921a == null) {
            this.f32921a = C17339e.m42458a(aVar.f32893b.getApplicationContext());
            this.f32921a.mo33618a((C17343h) this);
        }
        if (this.f32926g == null) {
            this.f32926g = new C12551b(aVar.f32893b.getApplicationContext());
        }
        Set b = mo23585b(aVar);
        List<String> list = aVar.f32892a;
        if (list != null && !list.isEmpty()) {
            list.removeAll(b);
            if (!list.isEmpty()) {
                synchronized (this.f32925f) {
                    for (String a : list) {
                        mo23587a(a, 0);
                    }
                }
                m25161b();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23054a(Object obj) {
        String str;
        C17342g gVar = (C17342g) obj;
        int a = gVar.mo33633a();
        int b = gVar.mo33634b();
        List h = gVar.mo33640h();
        if (!h.isEmpty()) {
            str = (String) h.get(0);
        } else {
            str = null;
        }
        if (str != null) {
            if (b == 6) {
                f32920c = false;
                mo23587a(str, 300000);
                m25161b();
            } else if (b == 8) {
                f32920c = false;
                this.f32921a.mo33615a(a);
                mo23587a(str, 900000);
                m25161b();
            } else if (b == 5) {
                mo23588a(str, "stage_installed");
                f32920c = false;
                m25161b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23588a(String str, String str2) {
        if (this.f32926g != null) {
            this.f32926g.mo23591a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo23587a(String str, long j) {
        synchronized (this.f32925f) {
            C12536b bVar = new C12536b(str);
            bVar.f32911d = j;
            this.f32924e.add(bVar);
        }
    }
}
