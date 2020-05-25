package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.a.ac */
final class C18346ac {

    /* renamed from: a */
    final HandlerThread f50667a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b */
    final C18369d f50668b;

    /* renamed from: c */
    final Handler f50669c;

    /* renamed from: d */
    long f50670d;

    /* renamed from: e */
    long f50671e;

    /* renamed from: f */
    long f50672f;

    /* renamed from: g */
    long f50673g;

    /* renamed from: h */
    long f50674h;

    /* renamed from: i */
    long f50675i;

    /* renamed from: j */
    long f50676j;

    /* renamed from: k */
    long f50677k;

    /* renamed from: l */
    int f50678l;

    /* renamed from: m */
    int f50679m;

    /* renamed from: n */
    int f50680n;

    /* renamed from: com.squareup.a.ac$a */
    static class C18347a extends Handler {

        /* renamed from: a */
        private final C18346ac f50681a;

        public final void handleMessage(final Message message) {
            switch (message.what) {
                case 0:
                    this.f50681a.f50670d++;
                    return;
                case 1:
                    this.f50681a.f50671e++;
                    return;
                case 2:
                    C18346ac acVar = this.f50681a;
                    long j = (long) message.arg1;
                    acVar.f50679m++;
                    acVar.f50673g += j;
                    acVar.f50676j = C18346ac.m44574a(acVar.f50679m, acVar.f50673g);
                    return;
                case 3:
                    C18346ac acVar2 = this.f50681a;
                    long j2 = (long) message.arg1;
                    acVar2.f50680n++;
                    acVar2.f50674h += j2;
                    acVar2.f50677k = C18346ac.m44574a(acVar2.f50679m, acVar2.f50674h);
                    return;
                case 4:
                    C18346ac acVar3 = this.f50681a;
                    Long l = (Long) message.obj;
                    acVar3.f50678l++;
                    acVar3.f50672f += l.longValue();
                    acVar3.f50675i = C18346ac.m44574a(acVar3.f50678l, acVar3.f50672f);
                    return;
                default:
                    C18396v.f50794a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unhandled stats message.");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }

        public C18347a(Looper looper, C18346ac acVar) {
            super(looper);
            this.f50681a = acVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36791a() {
        this.f50669c.sendEmptyMessage(0);
    }

    C18346ac(C18369d dVar) {
        this.f50668b = dVar;
        this.f50667a.start();
        C18356aj.m44598a(this.f50667a.getLooper());
        this.f50669c = new C18347a(this.f50667a.getLooper(), this);
    }

    /* renamed from: a */
    static long m44574a(int i, long j) {
        return j / ((long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36792a(Bitmap bitmap, int i) {
        this.f50669c.sendMessage(this.f50669c.obtainMessage(i, C18356aj.m44587a(bitmap), 0));
    }
}
