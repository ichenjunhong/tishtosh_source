package com.bytedance.apm.p489l.p492b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.ttm.player.MediaPlayer;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.b.a */
public class C9097a {

    /* renamed from: m */
    private static volatile C9097a f24845m;

    /* renamed from: a */
    Map<Long, C9100a> f24846a;

    /* renamed from: b */
    Set<Long> f24847b;

    /* renamed from: c */
    List<Thread> f24848c;

    /* renamed from: d */
    public int f24849d;

    /* renamed from: e */
    public boolean f24850e;

    /* renamed from: f */
    public Handler f24851f;

    /* renamed from: g */
    private long f24852g;

    /* renamed from: h */
    private byte[] f24853h;

    /* renamed from: i */
    private int f24854i;

    /* renamed from: j */
    private HashMap<StackTraceElement, Integer> f24855j;

    /* renamed from: k */
    private JSONObject f24856k;

    /* renamed from: l */
    private HandlerThread f24857l;

    /* renamed from: n */
    private Runnable f24858n = new Runnable() {
        public final void run() {
            C9100a aVar;
            try {
                C9097a.this.f24849d--;
                if (C9097a.this.f24849d == 0) {
                    C9097a.this.mo16469b();
                    return;
                }
                C9097a aVar2 = C9097a.this;
                HashSet hashSet = new HashSet();
                for (Thread thread : aVar2.f24848c) {
                    if (thread != null && thread.isAlive()) {
                        long id = thread.getId();
                        C9100a aVar3 = (C9100a) aVar2.f24846a.get(Long.valueOf(id));
                        if (aVar3 == null) {
                            C9100a aVar4 = new C9100a(thread.getName(), SystemClock.uptimeMillis() * 1000, null);
                            aVar2.f24846a.put(Long.valueOf(thread.getId()), aVar4);
                            aVar = aVar4;
                        } else {
                            aVar = aVar3;
                        }
                        aVar2.mo16467a(id, aVar, thread.getStackTrace(), SystemClock.uptimeMillis() * 1000);
                        aVar2.f24847b.remove(Long.valueOf(id));
                        hashSet.add(Long.valueOf(id));
                    }
                }
                for (Long longValue : aVar2.f24847b) {
                    aVar2.mo16466a(longValue.longValue());
                }
                aVar2.f24847b = hashSet;
                C9097a.this.f24851f.postDelayed(this, 5);
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: com.bytedance.apm.l.b.a$a */
    class C9100a {

        /* renamed from: a */
        String f24861a;

        /* renamed from: b */
        long f24862b;

        /* renamed from: c */
        StackTraceElement[] f24863c = null;

        C9100a(String str, long j, StackTraceElement[] stackTraceElementArr) {
            this.f24861a = str;
            this.f24862b = j;
        }
    }

    /* renamed from: a */
    private static byte m18020a(int i, int i2) {
        return (byte) ((i >> i2) & NormalGiftView.ALPHA_255);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=long, for r4v0, types: [int, long] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m18021a(long r2, long r4) {
        /*
            long r2 = r2 >> r4
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p489l.p492b.C9097a.m18021a(long, int):byte");
    }

    /* renamed from: a */
    public static C9097a m18023a() {
        if (f24845m == null) {
            synchronized (C9097a.class) {
                if (f24845m == null) {
                    f24845m = new C9097a();
                }
            }
        }
        return f24845m;
    }

    /* renamed from: c */
    private void m18028c() {
        this.f24853h = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        this.f24854i = 0;
        m18026b(1464814675);
        m18024a(3);
        m18024a(18);
        m18027b(this.f24852g);
        m18024a(14);
    }

    /* renamed from: b */
    public final void mo16469b() {
        if (this.f24850e) {
            this.f24850e = false;
            this.f24851f.removeCallbacks(this.f24858n);
            if (VERSION.SDK_INT >= 18) {
                this.f24857l.quitSafely();
            } else {
                this.f24857l.quit();
            }
            for (Long longValue : this.f24847b) {
                mo16466a(longValue.longValue());
            }
            if (this.f24854i > 18) {
                StringBuilder sb = new StringBuilder(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
                sb.append("*version\n3\n");
                sb.append("data-file-overflow=false\nclock=dual\n");
                sb.append("elapsed-time-usec=");
                sb.append((SystemClock.uptimeMillis() * 1000) - this.f24852g);
                sb.append("\n");
                sb.append("num-method-calls=");
                sb.append(this.f24855j.size());
                sb.append("\n");
                sb.append("clock-call-overhead-nsec=zzz");
                sb.append("\n");
                sb.append("vm=art\npid=");
                sb.append(Process.myPid());
                sb.append("\n");
                sb.append("*threads\n");
                for (Entry entry : this.f24846a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("\t");
                    sb.append(((C9100a) entry.getValue()).f24861a);
                    sb.append("\n");
                }
                sb.append("*methods\n");
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                for (Entry entry2 : this.f24855j.entrySet()) {
                    StackTraceElement stackTraceElement = (StackTraceElement) entry2.getKey();
                    Integer num = (Integer) entry2.getValue();
                    sb2.append("\t0x");
                    sb2.append(Integer.toHexString(num.intValue() << 2));
                    sb3.append("\tat ");
                    sb3.append(stackTraceElement.getClassName());
                    sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb3.append(stackTraceElement.getMethodName());
                    sb3.append("(");
                    sb3.append(stackTraceElement.getFileName());
                    sb3.append(":");
                    sb3.append(stackTraceElement.getLineNumber());
                    sb3.append(")\n");
                }
                sb.append(sb2);
                sb.append("\n");
                sb.append(sb3);
                sb.append("*end\n");
                sb.append(Base64.encodeToString(this.f24853h, 0, this.f24854i, 2));
                try {
                    this.f24856k.put("trace_data", sb.toString());
                    C9014a.m17825a().mo16336a(new C9022d("cpu_trace", this.f24856k));
                } catch (JSONException unused) {
                }
            }
            this.f24857l = null;
        }
    }

    /* renamed from: a */
    private int m18022a(StackTraceElement stackTraceElement) {
        Integer num = (Integer) this.f24855j.get(stackTraceElement);
        if (num == null) {
            num = Integer.valueOf(this.f24855j.size());
            this.f24855j.put(stackTraceElement, Integer.valueOf(this.f24855j.size()));
        }
        return num.intValue();
    }

    /* renamed from: b */
    private void m18026b(int i) {
        m18024a(i);
        byte[] bArr = this.f24853h;
        int i2 = this.f24854i;
        this.f24854i = i2 + 1;
        bArr[i2] = m18020a(i, 16);
        byte[] bArr2 = this.f24853h;
        int i3 = this.f24854i;
        this.f24854i = i3 + 1;
        bArr2[i3] = m18020a(i, 24);
    }

    /* renamed from: a */
    private void m18024a(int i) {
        byte[] bArr = this.f24853h;
        int i2 = this.f24854i;
        this.f24854i = i2 + 1;
        bArr[i2] = m18020a(i, 0);
        byte[] bArr2 = this.f24853h;
        int i3 = this.f24854i;
        this.f24854i = i3 + 1;
        bArr2[i3] = m18020a(i, 8);
    }

    /* renamed from: b */
    private void m18027b(long j) {
        m18026b((int) j);
        byte[] bArr = this.f24853h;
        int i = this.f24854i;
        this.f24854i = i + 1;
        bArr[i] = m18021a(j, 32);
        byte[] bArr2 = this.f24853h;
        int i2 = this.f24854i;
        this.f24854i = i2 + 1;
        bArr2[i2] = m18021a(j, 40);
        byte[] bArr3 = this.f24853h;
        int i3 = this.f24854i;
        this.f24854i = i3 + 1;
        bArr3[i3] = m18021a(j, 48);
        byte[] bArr4 = this.f24853h;
        int i4 = this.f24854i;
        this.f24854i = i4 + 1;
        bArr4[i4] = m18021a(j, 56);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16466a(long j) {
        C9100a aVar = (C9100a) this.f24846a.get(Long.valueOf(j));
        if (aVar != null) {
            long uptimeMillis = SystemClock.uptimeMillis() * 1000;
            int i = (int) (uptimeMillis - this.f24852g);
            int i2 = (int) (uptimeMillis - aVar.f24862b);
            for (StackTraceElement a : aVar.f24863c) {
                m18025a(j, i2, i, a, 1);
            }
            aVar.f24863c = null;
        }
    }

    /* renamed from: a */
    public final void mo16468a(List<Thread> list, JSONObject jSONObject) {
        if (!this.f24850e) {
            this.f24848c = list;
            this.f24856k = jSONObject;
            this.f24846a = new HashMap();
            this.f24852g = SystemClock.uptimeMillis() * 1000;
            this.f24855j = new HashMap<>();
            this.f24847b = new HashSet();
            this.f24850e = true;
            m18028c();
            this.f24857l = new HandlerThread("Trace Sampling Thread", 10);
            this.f24857l.start();
            this.f24851f = new Handler(this.f24857l.getLooper());
            this.f24849d = 200;
            this.f24851f.post(this.f24858n);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16467a(long j, C9100a aVar, StackTraceElement[] stackTraceElementArr, long j2) {
        C9100a aVar2 = aVar;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        int i = (int) (j2 - this.f24852g);
        int i2 = (int) (j2 - aVar2.f24862b);
        if (aVar2.f24863c == null || aVar2.f24863c.length == 0) {
            for (int length = stackTraceElementArr2.length - 1; length >= 0; length--) {
                m18025a(j, i2, i, stackTraceElementArr2[length], 0);
            }
            aVar2.f24863c = stackTraceElementArr2;
            this.f24846a.put(Long.valueOf(j), aVar2);
            return;
        }
        int length2 = aVar2.f24863c.length - 1;
        int length3 = stackTraceElementArr2.length - 1;
        while (length2 >= 0 && length3 >= 0 && aVar2.f24863c[length2].equals(stackTraceElementArr2[length3])) {
            length2--;
            length3--;
        }
        for (int i3 = 0; i3 <= length2; i3++) {
            m18025a(j, i2, i, aVar2.f24863c[i3], 1);
        }
        while (length3 >= 0) {
            m18025a(j, i2, i, stackTraceElementArr2[length3], 0);
            length3--;
        }
        aVar2.f24863c = stackTraceElementArr2;
        this.f24846a.put(Long.valueOf(j), aVar2);
    }

    /* renamed from: a */
    private void m18025a(long j, int i, int i2, StackTraceElement stackTraceElement, int i3) {
        if (this.f24854i + 14 >= this.f24853h.length) {
            byte[] bArr = new byte[(this.f24853h.length + VideoCacheReadBuffersizeExperiment.DEFAULT)];
            System.arraycopy(this.f24853h, 0, bArr, 0, this.f24854i);
            this.f24853h = bArr;
        }
        m18024a((int) j);
        m18026b((m18022a(stackTraceElement) << 2) | i3);
        m18026b(i);
        m18026b(i2);
    }
}
