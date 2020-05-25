package com.p683ss.android.medialib.p1179a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.vesdk.C50792y;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.medialib.a.a */
public final class C19218a implements Runnable {

    /* renamed from: a */
    public volatile C19220b f53002a;

    /* renamed from: b */
    public final Object f53003b = new Object();

    /* renamed from: c */
    public boolean f53004c;

    /* renamed from: d */
    public boolean f53005d;

    /* renamed from: e */
    public C19219a f53006e;

    /* renamed from: f */
    AudioRecorderInterface f53007f;

    /* renamed from: g */
    public AtomicInteger f53008g = new AtomicInteger(0);

    /* renamed from: h */
    public boolean f53009h = false;

    /* renamed from: i */
    public boolean f53010i = true;

    /* renamed from: j */
    public final Object f53011j;

    /* renamed from: com.ss.android.medialib.a.a$a */
    public interface C19219a {
        int onProcessData(byte[] bArr, int i);
    }

    /* renamed from: com.ss.android.medialib.a.a$b */
    public static class C19220b extends Handler {

        /* renamed from: a */
        private WeakReference<C19218a> f53012a;

        public C19220b(C19218a aVar) {
            this.f53012a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            C19218a aVar = (C19218a) this.f53012a.get();
            if (aVar == null) {
                C50792y.m109914d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
                return;
            }
            switch (i) {
                case 0:
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    double doubleValue = ((Double) message.obj).doubleValue();
                    if (aVar.f53007f != null) {
                        StringBuilder sb = new StringBuilder("handleStartFeeding() called with: sampleRateInHz = [");
                        sb.append(i2);
                        sb.append("], channels = [");
                        sb.append(i3);
                        sb.append("], speed = [");
                        sb.append(doubleValue);
                        sb.append("]");
                        C50792y.m109909a("AudioDataProcessThread", sb.toString());
                        if (aVar.f53007f.initWavFile(i2, i3, doubleValue) != 0) {
                            C50792y.m109914d("AudioDataProcessThread", "init wav file failed");
                            break;
                        } else {
                            aVar.f53010i = false;
                        }
                    }
                    return;
                case 1:
                    aVar.mo39603c();
                    return;
                case 2:
                    C50792y.m109909a("AudioDataProcessThread", "Exit loop");
                    aVar.mo39603c();
                    removeMessages(3);
                    Looper.myLooper().quit();
                    return;
                case 3:
                    if (!aVar.f53010i) {
                        byte[] bArr = (byte[]) message.obj;
                        int i4 = message.arg1;
                        int decrementAndGet = aVar.f53008g.decrementAndGet();
                        if (aVar.f53006e != null) {
                            aVar.f53006e.onProcessData(bArr, i4);
                            StringBuilder sb2 = new StringBuilder("Buffer processed, size=");
                            sb2.append(i4);
                            sb2.append(", ");
                            sb2.append(decrementAndGet);
                            sb2.append(" buffers remaining");
                            C50792y.m109911b("AudioDataProcessThread", sb2.toString());
                            break;
                        }
                    } else {
                        C50792y.m109913c("AudioDataProcessThread", "Cannot feed() after stopFeeding.");
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r3.f53005d == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r3.f53010i != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0018, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1 = r3.f53011j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39601a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f53003b
            monitor-enter(r0)
            boolean r1 = r3.f53004c     // Catch:{ all -> 0x001c }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r3.f53011j
            monitor-enter(r1)
            boolean r0 = r3.f53005d     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3.f53010i     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            r2 = 1
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.p1179a.C19218a.mo39601a():boolean");
    }

    /* renamed from: b */
    public final void mo39602b() {
        synchronized (this.f53003b) {
            if (this.f53004c) {
                this.f53002a.sendMessage(this.f53002a.obtainMessage(2));
                C50792y.m109911b("AudioDataProcessThread", "stop()");
            }
        }
    }

    /* renamed from: c */
    public final void mo39603c() {
        synchronized (this.f53011j) {
            C50792y.m109909a("AudioDataProcessThread", "handleStopFeeding() called");
            if (!this.f53010i) {
                if (this.f53007f != null) {
                    this.f53007f.closeWavFile(this.f53009h);
                } else {
                    C50792y.m109914d("AudioDataProcessThread", "handleStop: Discard wav file");
                }
                this.f53010i = true;
                this.f53009h = false;
                this.f53011j.notify();
            }
        }
    }

    public final void run() {
        Looper.prepare();
        synchronized (this.f53003b) {
            this.f53002a = new C19220b(this);
            this.f53004c = true;
            this.f53003b.notify();
        }
        Looper.loop();
        C50792y.m109911b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f53003b) {
            this.f53005d = false;
            this.f53004c = false;
            this.f53002a = null;
        }
    }

    public C19218a(AudioRecorderInterface audioRecorderInterface, C19219a aVar) {
        Object obj;
        if (audioRecorderInterface != 0) {
            obj = audioRecorderInterface;
        } else {
            obj = new Object();
        }
        this.f53011j = obj;
        this.f53007f = audioRecorderInterface;
        this.f53006e = aVar;
    }

    /* renamed from: a */
    public final void mo39600a(byte[] bArr, int i) {
        synchronized (this.f53003b) {
            if (this.f53004c) {
                this.f53008g.incrementAndGet();
                this.f53002a.sendMessage(this.f53002a.obtainMessage(3, i, 0, Arrays.copyOf(bArr, i)));
                C50792y.m109911b("AudioDataProcessThread", "feed audioData");
            }
        }
    }

    /* renamed from: a */
    public final void mo39599a(int i, int i2, double d) {
        C50792y.m109913c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f53003b) {
            if (!this.f53004c) {
                C50792y.m109913c("AudioDataProcessThread", "startFeeding not ready");
                return;
            }
            this.f53008g.set(0);
            this.f53002a.sendMessage(this.f53002a.obtainMessage(0, i, i2, Double.valueOf(d)));
        }
    }
}
