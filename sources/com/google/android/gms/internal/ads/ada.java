package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.List;

@C16299uq
public final class ada {

    /* renamed from: a */
    final Context f40270a;

    /* renamed from: b */
    public String f40271b;

    /* renamed from: c */
    public String f40272c;

    /* renamed from: d */
    public String f40273d;

    /* renamed from: e */
    public String f40274e;

    /* renamed from: f */
    int f40275f;

    /* renamed from: g */
    private int f40276g;

    /* renamed from: h */
    private PointF f40277h;

    /* renamed from: i */
    private PointF f40278i;

    /* renamed from: j */
    private Handler f40279j;

    /* renamed from: k */
    private Runnable f40280k;

    public ada(Context context) {
        this.f40280k = new adb(this);
        this.f40270a = context;
        this.f40276g = ViewConfiguration.get(context).getScaledTouchSlop();
        C14963ax.m30844n().mo28747a();
        this.f40279j = C14963ax.m30844n().f40344a;
    }

    public ada(Context context, String str) {
        this(context);
        this.f40271b = str;
    }

    /* renamed from: a */
    public final void mo28705a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f40275f = 0;
            this.f40277h = new PointF(motionEvent.getX(0), motionEvent.getY(0));
        } else if (this.f40275f != -1) {
            boolean z = true;
            if (this.f40275f == 0 && actionMasked == 5) {
                this.f40275f = 5;
                this.f40278i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f40279j.postDelayed(this.f40280k, ((Long) caf.m37099d().mo30717a(C15740bx.f44367cv)).longValue());
                return;
            }
            if (this.f40275f == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z2 = false;
                        for (int i = 0; i < historySize; i++) {
                            if (!m32681a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                                z2 = true;
                            }
                        }
                        if (m32681a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f40275f = -1;
                    this.f40279j.removeCallbacks(this.f40280k);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m32681a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f40277h.x - f) < ((float) this.f40276g) && Math.abs(this.f40277h.y - f2) < ((float) this.f40276g) && Math.abs(this.f40278i.x - f3) < ((float) this.f40276g) && Math.abs(this.f40278i.y - f4) < ((float) this.f40276g);
    }

    /* renamed from: a */
    public final void mo28704a() {
        try {
            if (!(this.f40270a instanceof Activity)) {
                abv.m32796d("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(C14963ax.m30839i().mo28717a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = C14963ax.m30839i().mo28721b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m32680a(arrayList, "Ad Information", true);
            int a2 = m32680a(arrayList, str, true);
            int a3 = m32680a(arrayList, str2, true);
            Builder builder = new Builder(this.f40270a, C14963ax.m30832b().mo28697d());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new adc(this, a, a2, a3));
            builder.create().show();
        } catch (BadTokenException unused) {
            abv.m32495a();
        }
    }

    /* renamed from: a */
    private static int m32680a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f40271b);
        sb.append(",DebugSignal: ");
        sb.append(this.f40274e);
        sb.append(",AFMA Version: ");
        sb.append(this.f40273d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f40272c);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo28706b() {
        adi i = C14963ax.m30839i();
        Context context = this.f40270a;
        String str = this.f40272c;
        String str2 = this.f40273d;
        String str3 = this.f40274e;
        boolean b = i.mo28721b();
        if (i.mo28722b(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                i.mo28718a(context, str2, str3, str);
            }
            abv.m32792b("Device is linked for debug signals.");
            i.mo28719a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        i.mo28723c(context, str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo28707c() {
        adi i = C14963ax.m30839i();
        Context context = this.f40270a;
        String str = this.f40272c;
        String str2 = this.f40273d;
        if (!i.mo28720a(context, str, str2)) {
            i.mo28719a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(i.f40305a)) {
            abv.m32792b("Creative is not pushed for this device.");
            i.mo28719a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(i.f40305a)) {
            abv.m32792b("The app is not linked for creative preview.");
            i.mo28723c(context, str, str2);
        } else {
            if ("0".equals(i.f40305a)) {
                abv.m32792b("Device is linked for in app preview.");
                i.mo28719a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }
}
