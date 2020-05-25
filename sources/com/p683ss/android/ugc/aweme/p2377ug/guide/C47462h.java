package com.p683ss.android.ugc.aweme.p2377ug.guide;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.experiment.SharePanelGuideConditionExperiment;
import com.p683ss.android.ugc.aweme.experiment.SharePanelGuideFrequencyExperiment;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.h */
public final class C47462h {

    /* renamed from: a */
    public static final C47462h f119724a = new C47462h();

    private C47462h() {
    }

    /* renamed from: e */
    public static Keva m102819e() {
        Keva repo = Keva.getRepo("share_panel_keva");
        C52711k.m112236a((Object) repo, "Keva.getRepo(SHARE_PANEL_KEVA)");
        return repo;
    }

    /* renamed from: f */
    public final boolean mo94743f() {
        return m102819e().getBoolean("key_user_shared", false);
    }

    /* renamed from: c */
    public final boolean mo94741c() {
        if (m102819e().getBoolean("digged", false)) {
            return false;
        }
        m102819e().storeBoolean("digged", true);
        return true;
    }

    /* renamed from: d */
    public final boolean mo94742d() {
        boolean z;
        String[] stringArray = m102819e().getStringArray("key_share_guide_shown_record", new String[0]);
        C52711k.m112236a((Object) stringArray, "records");
        if (stringArray.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (stringArray.length >= SharePanelGuideFrequencyExperiment.m69628a()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object b = C52568f.m112080b(stringArray);
        C52711k.m112236a(b, "records.last()");
        return mo94739a(currentTimeMillis, Long.parseLong((String) b));
    }

    /* renamed from: a */
    public final boolean mo94738a() {
        if (!SharePanelGuideConditionExperiment.INSTANCE.mo59614a()) {
            return true;
        }
        String[] stringArray = m102819e().getStringArray("key_user_active_record", new String[0]);
        C52711k.m112236a((Object) stringArray, "keva().getStringArray(KE…ACTIVE_RECORD, arrayOf())");
        if (C52568f.m112085f(stringArray).size() >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo94740b() {
        String[] stringArray = m102819e().getStringArray("key_share_guide_shown_record", new String[0]);
        C52711k.m112236a((Object) stringArray, "keva().getStringArray(KEY_SHOWN_RECORD, arrayOf())");
        List f = C52568f.m112085f(stringArray);
        if (f.size() < SharePanelGuideFrequencyExperiment.m69628a()) {
            f.add(String.valueOf(System.currentTimeMillis()));
            Keva e = m102819e();
            String str = "key_share_guide_shown_record";
            Object[] array = f.toArray(new String[0]);
            if (array != null) {
                e.storeStringArray(str, (String[]) array);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    private static long m102818a(long j) {
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "calendar");
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Date time = instance.getTime();
        C52711k.m112236a((Object) time, "calendar.time");
        return time.getTime();
    }

    /* renamed from: a */
    public final boolean mo94739a(long j, long j2) {
        if (m102818a(j) - m102818a(j2) > 0) {
            return true;
        }
        return false;
    }
}
