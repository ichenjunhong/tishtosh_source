package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.p2345t.C46773d;
import com.p683ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ep */
public final class C47858ep {

    /* renamed from: a */
    public static boolean f120420a = true;

    /* renamed from: b */
    public static boolean f120421b = true;

    /* renamed from: c */
    public static boolean f120422c = true;

    /* renamed from: d */
    public static final C47858ep f120423d = new C47858ep();

    private C47858ep() {
    }

    /* renamed from: a */
    public static final void m103511a(String str, String str2) {
        m103514a(str, str2, null, null, 12, null);
    }

    /* renamed from: a */
    public static final void m103512a(String str, String str2, String str3) {
        m103514a(str, str2, str3, null, 8, null);
    }

    /* renamed from: a */
    public static boolean m103515a() {
        return f120420a;
    }

    /* renamed from: b */
    public static final void m103516b() {
        m103506a(f120423d, "-2", BehaviorType.EVENT, "CP", null, null, 24, null);
    }

    /* renamed from: b */
    public static final void m103517b(String str) {
        C52711k.m112240b(str, "type");
        m103528g(str);
    }

    /* renamed from: a */
    public static final void m103507a(String str) {
        C52711k.m112240b(str, "type");
        m103528g(str);
    }

    /* renamed from: c */
    public static final void m103521c(String str) {
        C52711k.m112240b(str, "errorCode");
        m103506a(f120423d, "-1", BehaviorType.FAILED, "CK", str, null, 16, null);
    }

    /* renamed from: d */
    public static final void m103524d(String str) {
        C52711k.m112240b(str, "publishId");
        m103506a(f120423d, str, BehaviorType.SUCCESS, "UP", null, null, 24, null);
    }

    /* renamed from: e */
    public static final void m103526e(String str) {
        C52711k.m112240b(str, "publishId");
        m103506a(f120423d, str, BehaviorType.SUCCESS, "CA", null, null, 24, null);
    }

    /* renamed from: f */
    public static final void m103527f(String str) {
        C52711k.m112240b(str, "publishId");
        m103506a(f120423d, str, BehaviorType.EVENT, "CP", null, null, 24, null);
    }

    /* renamed from: g */
    private static void m103528g(String str) {
        try {
            C31300c.m73020d().mo64182a(str);
            StringBuilder sb = new StringBuilder("RuntimeBehaviorManager---> EventType : ");
            sb.append(str);
            C50203g.m108358a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m103508a(String str, int i) {
        C52711k.m112240b(str, "publishId");
        m103506a(f120423d, str, BehaviorType.FAILED, "SN", String.valueOf(i), null, 16, null);
    }

    /* renamed from: d */
    public static final void m103525d(String str, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "uploadParams");
        m103510a(str, BehaviorType.SUCCESS, "AK", "", str2);
    }

    /* renamed from: b */
    public static final void m103519b(String str, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "videoAndSynthesisInfo");
        m103510a(str, BehaviorType.START, "SN", "", str2);
    }

    /* renamed from: c */
    public static final void m103523c(String str, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "resultInfo");
        m103510a(str, BehaviorType.SUCCESS, "SN", "", str2);
    }

    /* renamed from: b */
    public static final void m103518b(String str, int i, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "info");
        m103510a(str, BehaviorType.FAILED, "UP", String.valueOf(i), str2);
    }

    /* renamed from: c */
    public static final void m103522c(String str, int i, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "serverLogId");
        m103506a(f120423d, str, BehaviorType.FAILED, "CA", C46773d.m101578a(i), null, 16, null);
    }

    /* renamed from: a */
    public static final void m103509a(String str, int i, String str2) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(str2, "serverLogId");
        m103506a(f120423d, str, BehaviorType.FAILED, "AK", String.valueOf(i), null, 16, null);
    }

    /* renamed from: b */
    private static void m103520b(String str, String str2, String str3) {
        try {
            C31300c.m73020d().mo64183a(str, str2);
            StringBuilder sb = new StringBuilder("RuntimeBehaviorManager---> EventType : ");
            sb.append(str);
            sb.append(" , code : ");
            sb.append(str2);
            sb.append(" , msg : ");
            sb.append(str3);
            C50203g.m108358a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m103513a(String str, String str2, String str3, String str4) {
        boolean z;
        C52711k.m112240b(str, "type");
        C52711k.m112240b(str2, "code");
        C52711k.m112240b(str3, "msg");
        CharSequence charSequence = str4;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m103520b(str, str2, str3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('-');
        sb.append(str4);
        m103520b(str, sb.toString(), str3);
    }

    /* renamed from: a */
    private static void m103510a(String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        try {
            PublishBehaviorModel publishBehaviorModel = new PublishBehaviorModel(System.currentTimeMillis(), str, behaviorType, str2, str3, str4);
            String a = C47760cd.m103385a(publishBehaviorModel);
            C52711k.m112236a((Object) a, "GsonUtil.toJson(PublishB…type, stage, code, info))");
            C31300c.m73020d().mo64183a("publish", a);
            StringBuilder sb = new StringBuilder("RuntimeBehaviorManager|id:");
            sb.append(str);
            sb.append(" type:");
            sb.append(behaviorType);
            sb.append(" stage:");
            sb.append(str2);
            sb.append(" code:");
            sb.append(str3);
            sb.append(" info:");
            sb.append(str4);
            C50203g.m108358a(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m103514a(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "-1";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        m103513a(str, str2, str3, str4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m103506a(C47858ep epVar, String str, BehaviorType behaviorType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        m103510a(str, behaviorType, str2, str3, str4);
    }
}
