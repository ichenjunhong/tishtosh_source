package com.p683ss.android.ugc.aweme.mix;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "awe_mix_cell_style")
/* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment */
public final class MixCellStyleExperiment {
    @C10179b(mo18165a = true)
    private static final int DOUBLE_ROW = 1;
    public static final MixCellStyleExperiment INSTANCE = new MixCellStyleExperiment();
    @C10179b
    private static final int SINGLE_ROW = 0;
    private static final boolean doubleRow;
    static final boolean singleRow;

    /* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment$a */
    static final class C36987a implements OnClickListener {

        /* renamed from: a */
        public static final C36987a f94478a = new C36987a();

        C36987a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    private MixCellStyleExperiment() {
    }

    static {
        boolean z;
        boolean z2 = true;
        if (C10181b.m20511a().mo18168a(MixCellStyleExperiment.class, true, "awe_mix_cell_style", 31744, 1) == SINGLE_ROW) {
            z = true;
        } else {
            z = false;
        }
        singleRow = z;
        if (C10181b.m20511a().mo18168a(MixCellStyleExperiment.class, true, "awe_mix_cell_style", 31744, 1) != DOUBLE_ROW) {
            z2 = false;
        }
        doubleRow = z2;
    }

    /* renamed from: a */
    public static long m83208a(Long l, long j) {
        if (l == null) {
            return j;
        }
        l.longValue();
        long longValue = (l.longValue() - j) + 1;
        if (singleRow && longValue <= 4) {
            return l.longValue() - 4;
        }
        if (!doubleRow || longValue > 3) {
            return j;
        }
        return l.longValue() - 3;
    }
}
