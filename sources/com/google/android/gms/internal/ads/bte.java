package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.btf;
import java.io.IOException;

final class bte<T extends btf> extends Handler implements Runnable {

    /* renamed from: a */
    public final int f43834a;

    /* renamed from: b */
    private final T f43835b;

    /* renamed from: c */
    private final btd<T> f43836c;

    /* renamed from: d */
    private final long f43837d;

    /* renamed from: e */
    private IOException f43838e;

    /* renamed from: f */
    private int f43839f;

    /* renamed from: g */
    private volatile Thread f43840g;

    /* renamed from: h */
    private volatile boolean f43841h;

    /* renamed from: i */
    private final /* synthetic */ btc f43842i;

    public bte(btc btc, Looper looper, T t, btd<T> btd, int i, long j) {
        this.f43842i = btc;
        super(looper);
        this.f43835b = t;
        this.f43836c = btd;
        this.f43834a = i;
        this.f43837d = j;
    }

    /* renamed from: a */
    public final void mo30680a(long j) {
        bti.m36701b(this.f43842i.f43832b == null);
        this.f43842i.f43832b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m36687a();
        }
    }

    /* renamed from: a */
    public final void mo30681a(boolean z) {
        this.f43841h = z;
        this.f43838e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f43835b.mo30590a();
            if (this.f43840g != null) {
                this.f43840g.interrupt();
            }
        }
        if (z) {
            m36688b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f43836c.mo30579a(this.f43835b, elapsedRealtime, elapsedRealtime - this.f43837d, true);
        }
    }

    public final void run() {
        try {
            this.f43840g = Thread.currentThread();
            if (!this.f43835b.mo30592b()) {
                String str = "load:";
                String valueOf = String.valueOf(this.f43835b.getClass().getSimpleName());
                btv.m36752a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.f43835b.mo30593c();
                btv.m36751a();
            }
            if (!this.f43841h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f43841h) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            bti.m36701b(this.f43835b.mo30592b());
            if (!this.f43841h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            if (!this.f43841h) {
                obtainMessage(3, new btg(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f43841h) {
                obtainMessage(3, new btg(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f43841h) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            btv.m36751a();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f43841h) {
            if (message.what == 0) {
                m36687a();
            } else if (message.what != 4) {
                m36688b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f43837d;
                if (this.f43835b.mo30592b()) {
                    this.f43836c.mo30579a(this.f43835b, elapsedRealtime, j, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        this.f43836c.mo30579a(this.f43835b, elapsedRealtime, j, false);
                        return;
                    case 2:
                        this.f43836c.mo30578a(this.f43835b, elapsedRealtime, j);
                        return;
                    case 3:
                        this.f43838e = (IOException) message.obj;
                        int a = this.f43836c.mo30574a(this.f43835b, elapsedRealtime, j, this.f43838e);
                        if (a != 3) {
                            if (a != 2) {
                                this.f43839f = a == 1 ? 1 : this.f43839f + 1;
                                mo30680a((long) Math.min((this.f43839f - 1) * 1000, 5000));
                                break;
                            }
                        } else {
                            this.f43842i.f43833c = this.f43838e;
                            return;
                        }
                        break;
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    /* renamed from: a */
    private final void m36687a() {
        this.f43838e = null;
        this.f43842i.f43831a.execute(this.f43842i.f43832b);
    }

    /* renamed from: b */
    private final void m36688b() {
        this.f43842i.f43832b = null;
    }
}
