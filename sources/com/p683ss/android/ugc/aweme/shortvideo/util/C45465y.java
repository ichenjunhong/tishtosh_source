package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.setting.FastImport1080pHigherFpsInBenchmarkWhiteList;
import com.p683ss.android.ugc.aweme.setting.FastImport1080pHigherLimitedFps;
import com.p683ss.android.ugc.aweme.setting.FastImport1080pLowerFpsInBenchmarkWhiteList;
import com.p683ss.android.ugc.aweme.setting.FastImport1080pLowerUseBenchmarkWhileList;
import com.p683ss.android.ugc.aweme.setting.FastImport720pHigherFpsInBenchmarkWhiteList;
import com.p683ss.android.ugc.aweme.setting.FastImport720pHigherLimitedFps;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y */
public final class C45465y {

    /* renamed from: a */
    public static final C45465y f114888a = new C45465y();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y$a */
    public interface C45466a {
        /* renamed from: a */
        C52847n<Boolean, C52847n<Integer, Boolean>> mo91750a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y$b */
    public static final class C45467b implements C45466a {

        /* renamed from: a */
        public final int f114889a = 721;

        /* renamed from: b */
        public final int f114890b;

        public C45467b(int i, int i2) {
            this.f114890b = i2;
        }

        /* renamed from: a */
        public final C52847n<Boolean, C52847n<Integer, Boolean>> mo91750a(int i, int i2, int i3) {
            boolean z;
            boolean z2;
            int a = C45465y.m99070a();
            int max = Math.max(FastImport1080pHigherLimitedFps.INSTANCE.getFastImport1080pHigherLimitedFps(), a);
            int i4 = this.f114889a;
            int i5 = this.f114890b;
            if (i4 > i || i5 < i) {
                return new C52847n<>(Boolean.valueOf(false), new C52847n(Integer.valueOf(-1), Boolean.valueOf(false)));
            }
            if (i3 <= a) {
                if (C10181b.m20511a().mo18168a(FastImport1080pLowerUseBenchmarkWhileList.class, true, "fast_import_1080p_lower_use_benchmark", 31744, 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = FastImport1080pLowerFpsInBenchmarkWhiteList.INSTANCE.enable();
                } else if (C39629l.m88232a().mo58574e().mo83118b(C40796a.Enable1080pFastImport) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return new C52847n<>(Boolean.valueOf(true), new C52847n(Integer.valueOf(0), Boolean.valueOf(false)));
                }
            }
            if (a + 1 <= i3 && max >= i3 && FastImport1080pHigherFpsInBenchmarkWhiteList.INSTANCE.enable()) {
                return new C52847n<>(Boolean.valueOf(true), new C52847n(Integer.valueOf(0), Boolean.valueOf(true)));
            }
            return new C52847n<>(Boolean.valueOf(true), new C52847n(Integer.valueOf(-11005), Boolean.valueOf(false)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y$c */
    public static final class C45468c implements C45466a {

        /* renamed from: a */
        public final int f114891a = 1;

        /* renamed from: b */
        public final int f114892b = 720;

        public C45468c(int i, int i2) {
        }

        /* renamed from: a */
        public final C52847n<Boolean, C52847n<Integer, Boolean>> mo91750a(int i, int i2, int i3) {
            int a = C45465y.m99070a();
            int max = Math.max(FastImport720pHigherLimitedFps.INSTANCE.getFastImport720pHigherLimitedFps(), a);
            int i4 = this.f114891a;
            int i5 = this.f114892b;
            if (i4 > i || i5 < i) {
                return new C52847n<>(Boolean.valueOf(false), new C52847n(Integer.valueOf(-1), Boolean.valueOf(false)));
            }
            if (i3 <= a || (a + 1 <= i3 && max >= i3 && FastImport720pHigherFpsInBenchmarkWhiteList.INSTANCE.enable())) {
                return new C52847n<>(Boolean.valueOf(true), new C52847n(Integer.valueOf(0), Boolean.valueOf(false)));
            }
            return new C52847n<>(Boolean.valueOf(true), new C52847n(Integer.valueOf(-11005), Boolean.valueOf(false)));
        }
    }

    private C45465y() {
    }

    /* renamed from: a */
    public static int m99070a() {
        return C39629l.m88232a().mo58583n().mo83104b(C40790a.FastImportFpsLimit);
    }

    /* renamed from: a */
    public final C52847n<Integer, Boolean> mo91749a(int i, int i2, int i3) {
        boolean z;
        C52847n nVar;
        boolean z2;
        String e = C39629l.m88232a().mo58583n().mo83107e(C40790a.FastImportResolutionLimit);
        C52711k.m112236a((Object) e, "resolution");
        CharSequence charSequence = e;
        if (TextUtils.isEmpty(charSequence)) {
            z = false;
        } else {
            z = new C52820l("[0-9]+\\*[0-9]*").matches(charSequence);
        }
        if (!z) {
            e = "720*1280";
        }
        List b = C52830p.m112452b((CharSequence) e, new String[]{"*"}, false, 0, 6, (Object) null);
        if (C52711k.m112239a((Object) (String) b.get(1), (Object) "")) {
            nVar = new C52847n(Integer.valueOf(Integer.parseInt((String) b.get(0))), Integer.valueOf(-1));
        } else {
            nVar = new C52847n(Integer.valueOf(Integer.parseInt((String) b.get(0))), Integer.valueOf(Integer.parseInt((String) b.get(1))));
        }
        C52847n nVar2 = new C52847n(Integer.valueOf(i), Integer.valueOf(i2));
        if (((Number) nVar.getSecond()).intValue() > 0 ? ((Number) nVar2.getFirst()).intValue() > ((Number) nVar.getFirst()).intValue() || ((Number) nVar2.getSecond()).intValue() > ((Number) nVar.getSecond()).intValue() : ((Number) nVar2.getFirst()).intValue() > ((Number) nVar.getFirst()).intValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return new C52847n<>(Integer.valueOf(-11004), Boolean.valueOf(false));
        }
        List<C45466a> arrayList = new ArrayList<>();
        arrayList.add(new C45468c(1, 720));
        arrayList.add(new C45467b(721, Math.max(721, ((Number) nVar.getFirst()).intValue())));
        if (true ^ arrayList.isEmpty()) {
            for (C45466a a : arrayList) {
                C52847n a2 = a.mo91750a(i, i2, i3);
                if (((Boolean) a2.getFirst()).booleanValue()) {
                    return (C52847n) a2.getSecond();
                }
            }
        }
        return new C52847n<>(Integer.valueOf(-1), Boolean.valueOf(false));
    }
}
