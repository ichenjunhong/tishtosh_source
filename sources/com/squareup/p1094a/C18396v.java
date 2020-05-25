package com.squareup.p1094a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.a.v */
public class C18396v {

    /* renamed from: a */
    static final Handler f50794a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            boolean z;
            int i = message.what;
            if (i != 3) {
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C18362c cVar = (C18362c) list.get(i2);
                        C18396v vVar = cVar.f50710b;
                        C18341a aVar = cVar.f50719k;
                        List<C18341a> list2 = cVar.f50720l;
                        boolean z2 = true;
                        if (list2 == null || list2.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (aVar == null && !z) {
                            z2 = false;
                        }
                        if (z2) {
                            Bitmap bitmap = cVar.f50721m;
                            C18402d dVar = cVar.f50723o;
                            if (aVar != null) {
                                vVar.mo36850a(bitmap, dVar, aVar);
                            }
                            if (z) {
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    vVar.mo36850a(bitmap, dVar, (C18341a) list2.get(i3));
                                }
                            }
                        }
                    }
                } else if (i == 13) {
                    List list3 = (List) message.obj;
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        C18341a aVar2 = (C18341a) list3.get(i4);
                        C18396v vVar2 = aVar2.f50649a;
                        Bitmap bitmap2 = null;
                        if (C18391r.shouldReadFromMemoryCache(aVar2.f50653e)) {
                            bitmap2 = vVar2.mo36856b(aVar2.f50657i);
                        }
                        if (bitmap2 != null) {
                            vVar2.mo36850a(bitmap2, C18402d.MEMORY, aVar2);
                            if (vVar2.f50806m) {
                                aVar2.f50650b.mo36869a();
                                new StringBuilder("from ").append(C18402d.MEMORY);
                            }
                        } else {
                            vVar2.mo36853a(aVar2);
                            if (vVar2.f50806m) {
                                aVar2.f50650b.mo36869a();
                            }
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                    sb.append(message.what);
                    throw new AssertionError(sb.toString());
                }
            } else {
                C18341a aVar3 = (C18341a) message.obj;
                if (aVar3.f50649a.f50806m) {
                    aVar3.f50650b.mo36869a();
                }
                aVar3.f50649a.mo36855a(aVar3.mo36784c());
            }
        }
    };

    /* renamed from: b */
    static volatile C18396v f50795b = null;

    /* renamed from: c */
    public final List<C18343aa> f50796c;

    /* renamed from: d */
    final Context f50797d;

    /* renamed from: e */
    final C18375i f50798e;

    /* renamed from: f */
    final C18369d f50799f;

    /* renamed from: g */
    final C18346ac f50800g;

    /* renamed from: h */
    final Map<Object, C18341a> f50801h;

    /* renamed from: i */
    final Map<ImageView, C18374h> f50802i;

    /* renamed from: j */
    final ReferenceQueue<Object> f50803j;

    /* renamed from: k */
    final Config f50804k;

    /* renamed from: l */
    public boolean f50805l;

    /* renamed from: m */
    public volatile boolean f50806m;

    /* renamed from: n */
    boolean f50807n;

    /* renamed from: o */
    private final C18401c f50808o;

    /* renamed from: p */
    private final C18404f f50809p;

    /* renamed from: q */
    private final C18399b f50810q;

    /* renamed from: com.squareup.a.v$a */
    public static class C18398a {

        /* renamed from: a */
        public C18369d f50811a;

        /* renamed from: b */
        private final Context f50812b;

        /* renamed from: c */
        private C18382l f50813c;

        /* renamed from: d */
        private ExecutorService f50814d;

        /* renamed from: e */
        private C18401c f50815e;

        /* renamed from: f */
        private C18404f f50816f;

        /* renamed from: g */
        private List<C18343aa> f50817g;

        /* renamed from: h */
        private Config f50818h;

        /* renamed from: i */
        private boolean f50819i;

        /* renamed from: j */
        private boolean f50820j;

        /* renamed from: a */
        public final C18396v mo36858a() {
            Context context = this.f50812b;
            if (this.f50813c == null) {
                this.f50813c = C18356aj.m44590a(context);
            }
            if (this.f50811a == null) {
                this.f50811a = new C18387o(context);
            }
            if (this.f50814d == null) {
                this.f50814d = new C18407x();
            }
            if (this.f50816f == null) {
                this.f50816f = C18404f.f50828a;
            }
            C18346ac acVar = new C18346ac(this.f50811a);
            Context context2 = context;
            C18375i iVar = new C18375i(context2, this.f50814d, C18396v.f50794a, this.f50813c, this.f50811a, acVar);
            C18396v vVar = new C18396v(context2, iVar, this.f50811a, this.f50815e, this.f50816f, this.f50817g, acVar, this.f50818h, this.f50819i, this.f50820j);
            return vVar;
        }

        public C18398a(Context context) {
            if (context != null) {
                this.f50812b = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* renamed from: com.squareup.a.v$b */
    static class C18399b extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f50821a;

        /* renamed from: b */
        private final Handler f50822b;

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C18342a aVar = (C18342a) this.f50821a.remove(1000);
                    Message obtainMessage = this.f50822b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f50661a;
                        this.f50822b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f50822b.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }

        C18399b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f50821a = referenceQueue;
            this.f50822b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    /* renamed from: com.squareup.a.v$c */
    public interface C18401c {
    }

    /* renamed from: com.squareup.a.v$d */
    public enum C18402d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: a */
        final int f50826a;

        private C18402d(int i) {
            this.f50826a = i;
        }
    }

    /* renamed from: com.squareup.a.v$e */
    public enum C18403e {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.a.v$f */
    public interface C18404f {

        /* renamed from: a */
        public static final C18404f f50828a = new C18404f() {
            /* renamed from: a */
            public final C18409y mo36861a(C18409y yVar) {
                return yVar;
            }
        };

        /* renamed from: a */
        C18409y mo36861a(C18409y yVar);
    }

    /* renamed from: a */
    public final void mo36851a(ImageView imageView) {
        mo36855a((Object) imageView);
    }

    /* renamed from: a */
    public final C18412z mo36848a(Uri uri) {
        return new C18412z(this, uri, 0);
    }

    /* renamed from: a */
    public static C18396v m44672a(Context context) {
        if (f50795b == null) {
            synchronized (C18396v.class) {
                if (f50795b == null) {
                    f50795b = new C18398a(context).mo36858a();
                }
            }
        }
        return f50795b;
    }

    /* renamed from: b */
    public final Bitmap mo36856b(String str) {
        Bitmap a = this.f50799f.mo36816a(str);
        if (a != null) {
            this.f50800g.mo36791a();
        } else {
            this.f50800g.f50669c.sendEmptyMessage(1);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18409y mo36847a(C18409y yVar) {
        C18409y a = this.f50809p.mo36861a(yVar);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Request transformer ");
        sb.append(this.f50809p.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(yVar);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final C18412z mo36849a(String str) {
        if (str == null) {
            return new C18412z(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return mo36848a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: a */
    public final void mo36853a(C18341a aVar) {
        Object c = aVar.mo36784c();
        if (!(c == null || this.f50801h.get(c) == aVar)) {
            mo36855a(c);
            this.f50801h.put(c, aVar);
        }
        C18375i iVar = this.f50798e;
        iVar.f50748i.sendMessage(iVar.f50748i.obtainMessage(1, aVar));
    }

    /* renamed from: a */
    public final void mo36854a(C18350ae aeVar) {
        mo36855a((Object) aeVar);
    }

    /* renamed from: a */
    public final void mo36855a(Object obj) {
        C18356aj.m44597a();
        C18341a aVar = (C18341a) this.f50801h.remove(obj);
        if (aVar != null) {
            aVar.mo36783b();
            this.f50798e.mo36825a(aVar);
        }
        if (obj instanceof ImageView) {
            C18374h hVar = (C18374h) this.f50802i.remove((ImageView) obj);
            if (hVar != null) {
                hVar.mo36822a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36852a(ImageView imageView, C18374h hVar) {
        this.f50802i.put(imageView, hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36850a(Bitmap bitmap, C18402d dVar, C18341a aVar) {
        if (!aVar.f50660l) {
            if (!aVar.f50659k) {
                this.f50801h.remove(aVar.mo36784c());
            }
            if (bitmap == null) {
                aVar.mo36781a();
                if (this.f50806m) {
                    aVar.f50650b.mo36869a();
                }
            } else if (dVar != null) {
                aVar.mo36782a(bitmap, dVar);
                if (this.f50806m) {
                    aVar.f50650b.mo36869a();
                    new StringBuilder("from ").append(dVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    C18396v(Context context, C18375i iVar, C18369d dVar, C18401c cVar, C18404f fVar, List<C18343aa> list, C18346ac acVar, Config config, boolean z, boolean z2) {
        int i;
        this.f50797d = context;
        this.f50798e = iVar;
        this.f50799f = dVar;
        this.f50808o = cVar;
        this.f50809p = fVar;
        this.f50804k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C18345ab(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C18372f(context));
        arrayList.add(new C18389q(context));
        arrayList.add(new C18373g(context));
        arrayList.add(new C18361b(context));
        arrayList.add(new C18385m(context));
        arrayList.add(new C18393t(iVar.f50743d, acVar));
        this.f50796c = Collections.unmodifiableList(arrayList);
        this.f50800g = acVar;
        this.f50801h = new WeakHashMap();
        this.f50802i = new WeakHashMap();
        this.f50805l = z;
        this.f50806m = z2;
        this.f50803j = new ReferenceQueue<>();
        this.f50810q = new C18399b(this.f50803j, f50794a);
        this.f50810q.start();
    }
}
