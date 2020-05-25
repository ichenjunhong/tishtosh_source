package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "list_optimize")
/* renamed from: com.ss.android.ugc.aweme.experiment.ListParamOptExperiment */
public final class ListParamOptExperiment {
    @C10179b(mo18165a = true)
    public static final int DEFAULT_GROUP = 0;
    @C10179b
    public static final int GROUP1 = 1;
    @C10179b
    public static final int GROUP2 = 2;
    @C10179b
    public static final int GROUP3 = 3;
    public static final ListParamOptExperiment INSTANCE = new ListParamOptExperiment();

    private ListParamOptExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69615a() {
        if (m69616b() == 1 || m69616b() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m69616b() {
        return C10181b.m20511a().mo18168a(ListParamOptExperiment.class, true, "list_optimize", 31744, 0);
    }
}
