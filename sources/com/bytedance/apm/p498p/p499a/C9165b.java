package com.bytedance.apm.p498p.p499a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p489l.C9111g;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p501q.C9190h;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.p.a.b */
public final class C9165b {

    /* renamed from: g */
    public static final Long f25095g = Long.valueOf(200);

    /* renamed from: h */
    public static final Long f25096h = Long.valueOf(1000);

    /* renamed from: m */
    private static HashSet<String> f25097m = new HashSet<>();

    /* renamed from: n */
    private static String f25098n = "";

    /* renamed from: o */
    private static boolean f25099o = true;

    /* renamed from: a */
    public final String f25100a;

    /* renamed from: b */
    public volatile boolean f25101b;

    /* renamed from: c */
    public C9170b f25102c;

    /* renamed from: d */
    LinkedList<Integer> f25103d;

    /* renamed from: e */
    public C9169a f25104e;

    /* renamed from: f */
    WindowManager f25105f;

    /* renamed from: i */
    public long f25106i;

    /* renamed from: j */
    public long f25107j;

    /* renamed from: k */
    public int f25108k;

    /* renamed from: l */
    private FrameCallback f25109l;

    /* renamed from: p */
    private final boolean f25110p;

    /* renamed from: com.bytedance.apm.p.a.b$a */
    class C9169a extends View {

        /* renamed from: a */
        public long f25115a = -1;

        /* renamed from: b */
        public int f25116b;

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            if (this.f25115a == -1) {
                this.f25115a = SystemClock.elapsedRealtime();
                this.f25116b = 0;
            } else {
                this.f25116b++;
            }
            if (C9165b.this.f25102c != null) {
                SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f25115a;
            if (elapsedRealtime > C9165b.f25095g.longValue()) {
                double d = (double) this.f25116b;
                double d2 = (double) elapsedRealtime;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double longValue = (double) C9165b.f25096h.longValue();
                Double.isNaN(longValue);
                C9161a.m18186a().mo16536a(C9165b.this.f25100a, (float) (d3 * longValue));
                C9165b bVar = C9165b.this;
                if (bVar.f25101b) {
                    try {
                        bVar.f25105f.removeView(bVar.f25104e);
                        bVar.f25104e.f25115a = -1;
                        bVar.f25104e.f25116b = 0;
                    } catch (Exception unused) {
                    }
                    bVar.f25101b = false;
                }
            }
        }

        public C9169a(Context context) {
            super(context);
        }
    }

    /* renamed from: com.bytedance.apm.p.a.b$b */
    public interface C9170b {
    }

    /* renamed from: c */
    public static String m18189c() {
        if (f25099o) {
            try {
                f25098n = C9190h.m18251a(f25097m, ",");
                f25099o = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return f25098n;
    }

    /* renamed from: d */
    private void m18190d() {
        this.f25106i = -1;
        this.f25107j = -1;
        this.f25108k = 0;
        this.f25109l = new FrameCallback() {
            public final void doFrame(long j) {
                if (C9165b.this.f25106i == -1) {
                    C9165b.this.f25106i = j;
                }
                C9165b.this.f25108k++;
                if (C9165b.this.f25101b) {
                    Choreographer.getInstance().postFrameCallback(this);
                }
                C9165b bVar = C9165b.this;
                long j2 = C9165b.this.f25107j;
                if (bVar.f25107j > 0) {
                    long j3 = j - j2;
                    if (j3 / 1000000 > 0) {
                        synchronized (bVar) {
                            if (bVar.f25103d.size() > 20000) {
                                bVar.f25103d.poll();
                            }
                            bVar.f25103d.add(Integer.valueOf(((int) j3) / 10000));
                        }
                    }
                }
                C9165b.this.f25107j = j;
            }
        };
        try {
            Choreographer.getInstance().postFrameCallback(this.f25109l);
        } catch (Exception unused) {
            this.f25101b = false;
            this.f25106i = -1;
            this.f25107j = -1;
            this.f25108k = 0;
            this.f25109l = null;
        }
    }

    /* renamed from: e */
    private void m18191e() {
        synchronized (this) {
            if (!this.f25103d.isEmpty()) {
                final LinkedList<Integer> linkedList = this.f25103d;
                this.f25103d = new LinkedList<>();
                C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                    public final void run() {
                        try {
                            if (!C9190h.m18253a(linkedList)) {
                                int[] iArr = new int[60];
                                int i = 0;
                                for (Integer num : linkedList) {
                                    int max = Math.max(Math.min(((num.intValue() + 1665) / 1666) - 1, 59), 0);
                                    iArr[max] = iArr[max] + 1;
                                    i += num.intValue() / 100;
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (int i2 = 0; i2 <= 59; i2++) {
                                    if (iArr[i2] > 0) {
                                        jSONObject.put(String.valueOf(i2), iArr[i2]);
                                    }
                                }
                                JSONObject c = ApmDelegate.m17947a().mo16434c("fps");
                                c.put("scene", C9165b.this.f25100a);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("total_scroll_time", i);
                                jSONObject2.put("drop_time_rate", (double) (1.0f - ((((float) linkedList.size()) * 1.0f) / ((float) ((int) (((float) i) / 16.666668f))))));
                                C9014a a = C9014a.m17825a();
                                C9024f fVar = new C9024f("fps_drop", C9165b.this.f25100a, jSONObject, c, jSONObject2);
                                a.mo16336a(fVar);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo16538a() {
        if (!this.f25101b) {
            if (this.f25110p || C9111g.m18066a().mo16478a("fps", this.f25100a)) {
                if (VERSION.SDK_INT < 16) {
                    this.f25104e.f25115a = -1;
                    LayoutParams layoutParams = new LayoutParams(-2, -2, 2005, 0, -3);
                    layoutParams.gravity = 51;
                    layoutParams.flags = 24;
                    layoutParams.height = 1;
                    layoutParams.width = 1;
                    try {
                        this.f25105f.removeView(this.f25104e);
                    } catch (Exception unused) {
                    }
                    this.f25105f.addView(this.f25104e, layoutParams);
                    this.f25104e.postDelayed(new Runnable() {
                        public final void run() {
                            if (C9165b.this.f25101b) {
                                C9165b.this.f25104e.invalidate();
                                C9165b.this.f25104e.postDelayed(this, 10);
                            }
                        }
                    }, 10);
                } else {
                    synchronized (this) {
                        this.f25103d.clear();
                    }
                    m18190d();
                    String str = this.f25100a;
                    f25099o = true;
                    f25097m.add(str);
                }
                this.f25101b = true;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo16539b() {
        if (VERSION.SDK_INT >= 16) {
            if (this.f25101b) {
                long j = this.f25107j - this.f25106i;
                if (j > 0) {
                    if (this.f25108k > 1) {
                        C9161a.m18186a().mo16536a(this.f25100a, (float) ((((((long) (this.f25108k - 1)) * 1000) * 1000) * 1000) / j));
                    }
                }
                if (this.f25109l != null) {
                    Choreographer.getInstance().removeFrameCallback(this.f25109l);
                }
                m18191e();
                this.f25101b = false;
            }
            String str = this.f25100a;
            f25099o = true;
            f25097m.remove(str);
        }
    }

    public C9165b(String str) {
        this(str, true);
    }

    private C9165b(String str, boolean z) {
        this.f25106i = -1;
        this.f25107j = -1;
        this.f25100a = str;
        this.f25110p = true;
        this.f25103d = new LinkedList<>();
        if (VERSION.SDK_INT < 16) {
            this.f25105f = (WindowManager) C8976c.m17736a().getSystemService("window");
            this.f25104e = new C9169a(C8976c.m17736a());
        }
    }
}
