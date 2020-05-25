package com.p683ss.android.ugc.aweme.freeflowcard;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;
import com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C53199ae;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52634f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity */
public final class FreeFlowDataTestActivity extends AmeActivity implements C53199ae {

    /* renamed from: a */
    private final C52628e f84549a;

    /* renamed from: b */
    private HashMap f84550b;

    public FreeFlowDataTestActivity() {
        this(null, 1, null);
    }

    /* renamed from: a */
    private View m75178a(int i) {
        if (this.f84550b == null) {
            this.f84550b = new HashMap();
        }
        View view = (View) this.f84550b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f84550b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C52628e mo65786a() {
        return this.f84549a;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FreeFlowDataTestActivity(C52628e eVar) {
        C52711k.m112240b(eVar, "coroutineContext");
        this.f84549a = eVar;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bf);
        long[] a = C32470a.m75181a();
        List a2 = C32474a.m75189a().mo65789a(a[0], a[1]);
        C52711k.m112236a((Object) a2, "lastMonthData");
        Iterable<C32488a> iterable = a2;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            i = 0;
            for (C32488a aVar : iterable) {
                if (aVar.mode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                    if (i < 0) {
                        C52575l.m112102c();
                    }
                }
            }
        } else {
            i = 0;
        }
        int size = a2.size() - i;
        DmtTextView dmtTextView = (DmtTextView) m75178a(R.id.b6i);
        C52711k.m112236a((Object) dmtTextView, "last_no_wifi");
        dmtTextView.setText(String.valueOf(size));
        DmtTextView dmtTextView2 = (DmtTextView) m75178a(R.id.b6l);
        C52711k.m112236a((Object) dmtTextView2, "last_wifi");
        dmtTextView2.setText(String.valueOf(i));
        C52847n a3 = m75179a(1, 7);
        DmtTextView dmtTextView3 = (DmtTextView) m75178a(R.id.dv9);
        C52711k.m112236a((Object) dmtTextView3, "wifi_1");
        StringBuilder sb = new StringBuilder("1-7\n\n");
        sb.append(((Number) a3.getFirst()).intValue());
        dmtTextView3.setText(sb.toString());
        DmtTextView dmtTextView4 = (DmtTextView) m75178a(R.id.br6);
        C52711k.m112236a((Object) dmtTextView4, "no_wifi_1");
        StringBuilder sb2 = new StringBuilder("1-7\n\n");
        sb2.append(((Number) a3.getSecond()).intValue());
        dmtTextView4.setText(sb2.toString());
        C52847n a4 = m75179a(8, 18);
        DmtTextView dmtTextView5 = (DmtTextView) m75178a(R.id.dv_);
        C52711k.m112236a((Object) dmtTextView5, "wifi_2");
        StringBuilder sb3 = new StringBuilder("8-18\n\n");
        sb3.append(((Number) a4.getFirst()).intValue());
        dmtTextView5.setText(sb3.toString());
        DmtTextView dmtTextView6 = (DmtTextView) m75178a(R.id.br7);
        C52711k.m112236a((Object) dmtTextView6, "no_wifi_2");
        StringBuilder sb4 = new StringBuilder("8-18\n\n");
        sb4.append(((Number) a4.getSecond()).intValue());
        dmtTextView6.setText(sb4.toString());
        C52847n a5 = m75179a(19, 25);
        DmtTextView dmtTextView7 = (DmtTextView) m75178a(R.id.dva);
        C52711k.m112236a((Object) dmtTextView7, "wifi_3");
        StringBuilder sb5 = new StringBuilder("19-25\n\n");
        sb5.append(((Number) a5.getFirst()).intValue());
        dmtTextView7.setText(sb5.toString());
        DmtTextView dmtTextView8 = (DmtTextView) m75178a(R.id.br8);
        C52711k.m112236a((Object) dmtTextView8, "no_wifi_3");
        StringBuilder sb6 = new StringBuilder("19-25\n\n");
        sb6.append(((Number) a5.getSecond()).intValue());
        dmtTextView8.setText(sb6.toString());
        C52847n a6 = m75179a(26, Calendar.getInstance().getMaximum(5));
        DmtTextView dmtTextView9 = (DmtTextView) m75178a(R.id.dvb);
        C52711k.m112236a((Object) dmtTextView9, "wifi_4");
        StringBuilder sb7 = new StringBuilder("26-31\n\n");
        sb7.append(((Number) a6.getFirst()).intValue());
        dmtTextView9.setText(sb7.toString());
        DmtTextView dmtTextView10 = (DmtTextView) m75178a(R.id.br9);
        C52711k.m112236a((Object) dmtTextView10, "no_wifi_4");
        StringBuilder sb8 = new StringBuilder("26-31\n\n");
        sb8.append(((Number) a6.getSecond()).intValue());
        dmtTextView10.setText(sb8.toString());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static C52847n<Integer, Integer> m75179a(int i, int i2) {
        int i3;
        boolean z;
        long[] a = C32470a.m75183a(i, i2);
        int i4 = 0;
        List a2 = C32474a.m75189a().mo65789a(a[0], a[1]);
        if (C9376b.m18558a((Collection<T>) a2)) {
            i3 = 0;
        } else {
            C52711k.m112236a((Object) a2, "data");
            Iterable<C32488a> iterable = a2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                int i5 = 0;
                for (C32488a aVar : iterable) {
                    if (aVar.mode == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i5++;
                        if (i5 < 0) {
                            C52575l.m112102c();
                        }
                    }
                }
                i4 = i5;
            }
            i3 = a2.size() - i4;
        }
        return new C52847n<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public /* synthetic */ FreeFlowDataTestActivity(C52628e eVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            eVar = C52634f.INSTANCE;
        }
        this(eVar);
    }
}
