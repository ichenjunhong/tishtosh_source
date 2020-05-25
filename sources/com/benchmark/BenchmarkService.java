package com.benchmark;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.benchmark.C2654j.C2655a;
import com.benchmark.C2662n.C2663a;
import com.benchmark.p123a.C2606a;
import com.benchmark.p123a.C2607b;
import com.benchmark.p123a.C2608c;
import com.benchmark.p123a.C2609d;
import com.benchmark.p123a.C2610e;
import com.benchmark.p123a.C2611f;
import com.benchmark.p123a.C2612g;
import com.benchmark.p123a.C2613h;
import com.benchmark.p123a.C2614i;
import com.benchmark.p123a.C2615j;
import com.benchmark.p123a.C2616k;
import com.benchmark.p123a.C2617l;
import com.benchmark.p123a.C2618m;
import com.benchmark.p123a.C2619n;
import com.benchmark.p123a.C2620o;
import com.benchmark.p123a.C2622q;
import com.benchmark.p123a.C2623r;
import com.benchmark.p123a.C2624s;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.vesdk.VEBenchmark;
import java.util.List;

public class BenchmarkService extends Service {

    /* renamed from: a */
    volatile C2604a f8020a;

    /* renamed from: b */
    private volatile Looper f8021b;

    /* renamed from: c */
    private final C2663a f8022c = new C2663a() {
        /* renamed from: a */
        public final void mo7167a(C2659m mVar) {
            BenchmarkService benchmarkService = BenchmarkService.this;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = mVar;
            benchmarkService.f8020a.sendMessage(obtain);
        }
    };

    /* renamed from: d */
    private final C2655a f8023d = new C2655a() {
        /* renamed from: a */
        public final void mo7168a(List list, C2651i iVar) {
            C2658l lVar;
            C2658l lVar2;
            BenchmarkService benchmarkService = BenchmarkService.this;
            if (!C9414h.m18630a(list)) {
                for (int i = 0; i < list.size(); i++) {
                    Benchmark benchmark = (Benchmark) list.get(i);
                    Context applicationContext = benchmarkService.getApplicationContext();
                    switch (benchmark.f8014id) {
                        case 1:
                            lVar = new C2612g(benchmark);
                            break;
                        case 2:
                            lVar = new C2608c(benchmark);
                            break;
                        case 3:
                            lVar = new C2611f(benchmark);
                            break;
                        case 4:
                            lVar = new C2615j(benchmark);
                            break;
                        case 5:
                            lVar = new C2619n(benchmark);
                            break;
                        case 6:
                            lVar = new C2622q(benchmark);
                            break;
                        case 7:
                            lVar = new C2606a(benchmark);
                            break;
                        case 8:
                            lVar = new C2607b(benchmark);
                            break;
                        case 9:
                            lVar = new C2610e(benchmark);
                            break;
                        case 10:
                            lVar = new C2614i(benchmark);
                            break;
                        case 11:
                            lVar = new C2623r(benchmark);
                            break;
                        case 12:
                            lVar2 = new C2620o(applicationContext, benchmark, true);
                            break;
                        case 13:
                            lVar2 = new C2620o(applicationContext, benchmark, false);
                            break;
                        case 14:
                            lVar = new C2616k(benchmark);
                            break;
                        case 15:
                            lVar = new C2609d(benchmark);
                            break;
                        case 18:
                            lVar = new C2618m(benchmark);
                            break;
                        case 19:
                            lVar = new C2617l(benchmark);
                            break;
                        case 20:
                            lVar = new C2613h(benchmark);
                            break;
                        default:
                            lVar = new C2624s(benchmark);
                            break;
                    }
                    lVar = lVar2;
                    C2650h hVar = new C2650h(benchmark, lVar, iVar);
                    if (i == list.size() - 1) {
                        hVar.f8095d = true;
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = hVar;
                    benchmarkService.f8020a.sendMessage(obtain);
                }
            }
        }
    };

    /* renamed from: com.benchmark.BenchmarkService$a */
    final class C2604a extends Handler {
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                C2650h hVar = (C2650h) message.obj;
                int b = hVar.f8093b.mo7170b();
                if (b == 0) {
                    hVar.run();
                } else {
                    try {
                        C2651i iVar = hVar.f8094c;
                        Benchmark benchmark = hVar.f8092a;
                        BenchmarkResult benchmarkResult = new BenchmarkResult(hVar.f8092a, b, "depend runtime is not ready", null, null);
                        iVar.mo7180b(benchmark, benchmarkResult);
                    } catch (RemoteException e) {
                        C2605a.m7549a((Throwable) e);
                    }
                }
                try {
                    hVar.f8093b.mo7171c();
                } catch (Throwable th) {
                    C2605a.m7549a(th);
                }
                if (hVar.f8095d) {
                    C2665o.m7657a().mo7219c();
                }
                return;
            }
            if (1 == message.what) {
                C2659m mVar = (C2659m) message.obj;
                if (C2665o.m7657a().mo7218b() == 0) {
                    try {
                        mVar.mo7185a(VEBenchmark.m108870a().mo98477c());
                    } catch (RemoteException e2) {
                        C2605a.m7549a((Throwable) e2);
                    }
                    C2665o.m7657a().mo7219c();
                }
            }
        }

        C2604a(Looper looper) {
            super(looper);
        }
    }

    public void onDestroy() {
        this.f8021b.quit();
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("com/benchmark");
        handlerThread.start();
        this.f8021b = handlerThread.getLooper();
        this.f8020a = new C2604a(this.f8021b);
    }

    public IBinder onBind(Intent intent) {
        if (1 == intent.getIntExtra("bind_type", 0)) {
            return this.f8022c.asBinder();
        }
        return this.f8023d.asBinder();
    }
}
