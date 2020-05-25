package android.support.p043v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.view.menu.n */
public class C1260n {

    /* renamed from: a */
    public View f4285a;

    /* renamed from: b */
    public int f4286b = 8388613;

    /* renamed from: c */
    public OnDismissListener f4287c;

    /* renamed from: d */
    private final Context f4288d;

    /* renamed from: e */
    private final C1246h f4289e;

    /* renamed from: f */
    private final boolean f4290f;

    /* renamed from: g */
    private final int f4291g;

    /* renamed from: h */
    private final int f4292h;

    /* renamed from: i */
    private boolean f4293i;

    /* renamed from: j */
    private C1263a f4294j;

    /* renamed from: k */
    private C1259m f4295k;

    /* renamed from: l */
    private final OnDismissListener f4296l;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4278c() {
        this.f4295k = null;
        if (this.f4287c != null) {
            this.f4287c.onDismiss();
        }
    }

    /* renamed from: d */
    public final boolean mo4279d() {
        if (this.f4295k == null || !this.f4295k.mo4077e()) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        if (mo4279d()) {
            this.f4295k.dismiss();
        }
    }

    /* renamed from: b */
    public final boolean mo4277b() {
        if (mo4279d()) {
            return true;
        }
        if (this.f4285a == null) {
            return false;
        }
        mo4274a(0, 0, false, false);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.support.v7.view.menu.m] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [android.support.v7.view.menu.t]
      assigns: [android.support.v7.view.menu.t, android.support.v7.view.menu.e]
      uses: [android.support.v7.view.menu.t, android.support.v7.view.menu.m, android.support.v7.view.menu.e]
      mth insns count: 52
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p043v7.view.menu.C1259m mo4273a() {
        /*
            r14 = this;
            android.support.v7.view.menu.m r0 = r14.f4295k
            if (r0 != 0) goto L_0x0083
            android.content.Context r0 = r14.f4288d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f4288d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131886105(0x7f120019, float:1.940678E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0051
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f4288d
            android.view.View r3 = r14.f4285a
            int r4 = r14.f4291g
            int r5 = r14.f4292h
            boolean r6 = r14.f4290f
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0051:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f4288d
            android.support.v7.view.menu.h r9 = r14.f4289e
            android.view.View r10 = r14.f4285a
            int r11 = r14.f4291g
            int r12 = r14.f4292h
            boolean r13 = r14.f4290f
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0063:
            android.support.v7.view.menu.h r1 = r14.f4289e
            r0.mo4068a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f4296l
            r0.mo4070a(r1)
            android.view.View r1 = r14.f4285a
            r0.mo4069a(r1)
            android.support.v7.view.menu.o$a r1 = r14.f4294j
            r0.mo1085a(r1)
            boolean r1 = r14.f4293i
            r0.mo4072b(r1)
            int r1 = r14.f4286b
            r0.mo4067a(r1)
            r14.f4295k = r0
        L_0x0083:
            android.support.v7.view.menu.m r0 = r14.f4295k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.view.menu.C1260n.mo4273a():android.support.v7.view.menu.m");
    }

    /* renamed from: a */
    public final void mo4275a(C1263a aVar) {
        this.f4294j = aVar;
        if (this.f4295k != null) {
            this.f4295k.mo1085a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo4276a(boolean z) {
        this.f4293i = z;
        if (this.f4295k != null) {
            this.f4295k.mo4072b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4274a(int i, int i2, boolean z, boolean z2) {
        C1259m a = mo4273a();
        a.mo4074c(z2);
        if (z) {
            if ((C1039e.m2968a(this.f4286b, C1056u.m3055f(this.f4285a)) & 7) == 5) {
                i -= this.f4285a.getWidth();
            }
            a.mo4071b(i);
            a.mo4073c(i2);
            int i3 = (int) ((this.f4288d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f4284g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo4075d();
    }

    public C1260n(Context context, C1246h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, R.attr.a4, 0);
    }

    public C1260n(Context context, C1246h hVar, View view, boolean z, int i, int i2) {
        this.f4286b = 8388611;
        this.f4296l = new OnDismissListener() {
            public final void onDismiss() {
                C1260n.this.mo4278c();
            }
        };
        this.f4288d = context;
        this.f4289e = hVar;
        this.f4285a = view;
        this.f4290f = z;
        this.f4291g = i;
        this.f4292h = i2;
    }
}
