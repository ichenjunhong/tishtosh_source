package com.benchmark;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.benchmark.C2651i.C2652a;
import com.benchmark.C2659m.C2660a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p001a.C0013i;

/* renamed from: com.benchmark.b */
public final class C2627b {

    /* renamed from: c */
    public static C2627b f8037c;

    /* renamed from: g */
    static volatile boolean f8038g = false;

    /* renamed from: a */
    public Context f8039a;

    /* renamed from: b */
    public C2657k f8040b;

    /* renamed from: d */
    public C2631c f8041d = null;

    /* renamed from: e */
    public C2654j f8042e;

    /* renamed from: f */
    public C2662n f8043f;

    /* renamed from: h */
    Handler f8044h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private boolean f8045i;

    /* renamed from: j */
    private C2629a f8046j = new C2629a();

    /* renamed from: k */
    private C2632d f8047k = null;

    /* renamed from: l */
    private C2630b f8048l = null;

    /* renamed from: com.benchmark.b$a */
    class C2629a extends C2652a {

        /* renamed from: a */
        Benchmark f8049a;

        private C2629a() {
        }

        /* renamed from: a */
        public final void mo7178a(Benchmark benchmark) {
            C2627b.this.mo7176a((Runnable) new C2649g(this, benchmark));
        }

        /* renamed from: b */
        public final void mo7180b(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            C2627b.this.mo7176a((Runnable) new C2648f(this, benchmark, benchmarkResult));
        }

        /* renamed from: a */
        public final void mo7179a(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            C2627b.this.mo7176a((Runnable) new C2647e(this, benchmark, benchmarkResult));
        }
    }

    /* renamed from: com.benchmark.b$b */
    class C2630b implements ServiceConnection {

        /* renamed from: a */
        List<Benchmark> f8051a = new ArrayList();

        /* renamed from: b */
        public C2629a f8052b;

        public final void onServiceDisconnected(ComponentName componentName) {
            C2627b.this.f8042e = null;
            if (C2627b.this.f8040b != null) {
                if (this.f8052b.f8049a != null) {
                    C2657k kVar = C2627b.this.f8040b;
                    Benchmark benchmark = this.f8052b.f8049a;
                    BenchmarkResult benchmarkResult = new BenchmarkResult(this.f8052b.f8049a, 10001, "ServiceDisconnected", null, null);
                    kVar.mo7194b(benchmark, benchmarkResult);
                }
                C2627b.this.f8040b.mo7187a();
            }
        }

        C2630b(C2629a aVar) {
            this.f8052b = aVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2654j jVar;
            C2627b bVar = C2627b.this;
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBMManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C2654j)) {
                    jVar = new C2656a(iBinder);
                } else {
                    jVar = (C2654j) queryLocalInterface;
                }
            }
            bVar.f8042e = jVar;
            if (C2627b.this.f8042e != null) {
                try {
                    C2627b.this.f8042e.mo7168a(this.f8051a, this.f8052b);
                } catch (Throwable th) {
                    C2605a.m7549a(th);
                }
            }
        }
    }

    /* renamed from: com.benchmark.b$c */
    class C2631c implements ServiceConnection {

        /* renamed from: a */
        C2632d f8054a;

        /* renamed from: b */
        final /* synthetic */ C2627b f8055b;

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f8055b.f8043f = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C2662n nVar;
            C2627b bVar = this.f8055b;
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IProxyManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C2662n)) {
                    nVar = new C2664a(iBinder);
                } else {
                    nVar = (C2662n) queryLocalInterface;
                }
            }
            bVar.f8043f = nVar;
            if (this.f8055b.f8043f != null) {
                try {
                    this.f8055b.f8043f.mo7167a(this.f8054a);
                } catch (Throwable th) {
                    C2605a.m7549a(th);
                }
            }
        }
    }

    /* renamed from: com.benchmark.b$d */
    class C2632d extends C2660a {

        /* renamed from: a */
        final /* synthetic */ C2627b f8056a;

        /* renamed from: a */
        public final void mo7185a(Map map) {
            this.f8056a.f8039a.unbindService(this.f8056a.f8041d);
            this.f8056a.f8043f = null;
        }
    }

    static {
        if (AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74199a()) {
        } else {
            C0013i.m16a(C2646d.f8083a);
        }
    }

    /* renamed from: a */
    public final void mo7175a() {
        try {
            if (this.f8045i) {
                this.f8039a.unbindService(this.f8048l);
                this.f8042e = null;
                this.f8045i = false;
            }
        } catch (Throwable th) {
            C2605a.m7549a(th);
        }
    }

    /* renamed from: a */
    public final void mo7176a(Runnable runnable) {
        this.f8044h.post(runnable);
    }

    public C2627b(Context context) {
        this.f8039a = context;
    }

    /* renamed from: a */
    public final boolean mo7177a(List<Benchmark> list) throws RemoteException {
        boolean z;
        if (!f8038g) {
            return false;
        }
        if (this.f8042e == null) {
            if (this.f8048l == null) {
                this.f8048l = new C2630b(this.f8046j);
            }
            C2630b bVar = this.f8048l;
            bVar.f8051a.clear();
            bVar.f8051a.addAll(list);
            C2630b bVar2 = this.f8048l;
            try {
                Intent intent = new Intent(this.f8039a, BenchmarkService.class);
                intent.setPackage(this.f8039a.getPackageName());
                intent.putExtra("bind_type", 0);
                Context context = this.f8039a;
                if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                    z = context.bindService(intent, bVar2, 1);
                } else {
                    z = true;
                }
                if (z) {
                    this.f8045i = true;
                }
            } catch (Throwable th) {
                C2605a.m7549a(th);
            }
            return true;
        }
        this.f8042e.mo7168a(list, this.f8046j);
        return true;
    }
}
