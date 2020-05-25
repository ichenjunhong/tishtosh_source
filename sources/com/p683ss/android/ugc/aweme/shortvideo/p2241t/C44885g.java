package com.p683ss.android.ugc.aweme.shortvideo.p2241t;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.beauty.C23779c;
import com.p683ss.android.ugc.aweme.beauty.C23785h;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31453b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.t.g */
public final class C44885g implements C44882e {

    /* renamed from: a */
    public final C20489b f113586a;

    /* renamed from: b */
    public C44879b f113587b;

    /* renamed from: c */
    public C44878a f113588c = C44878a.f113579a;

    /* renamed from: d */
    public int f113589d;

    /* renamed from: e */
    String f113590e = "";

    /* renamed from: f */
    String f113591f;

    /* renamed from: g */
    private boolean f113592g;

    /* renamed from: h */
    private int f113593h = C44883f.f113583d;

    /* renamed from: i */
    private int f113594i = -1;

    /* renamed from: j */
    private float f113595j = 0.0f;

    /* renamed from: k */
    private float f113596k = 0.0f;

    /* renamed from: l */
    private float f113597l = 0.0f;

    /* renamed from: m */
    private float f113598m = 0.0f;

    /* renamed from: n */
    private float f113599n = 0.0f;

    /* renamed from: o */
    private float f113600o = 0.0f;

    /* renamed from: p */
    private boolean f113601p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.t.g$a */
    public static class C44886a {

        /* renamed from: a */
        public String f113602a;

        /* renamed from: b */
        public String f113603b;

        /* renamed from: c */
        public String f113604c;

        /* renamed from: d */
        public boolean f113605d;

        /* renamed from: e */
        public C20426a f113606e;

        /* renamed from: f */
        public boolean f113607f;
    }

    /* renamed from: c */
    public static int m98094c(float f) {
        return f < 0.0f ? -1 : 1;
    }

    /* renamed from: a */
    public final void mo91006a(String str, float f, float f2) {
        this.f113586a.mo43457a(3, str);
        this.f113586a.mo43525f(f, f2);
    }

    /* renamed from: a */
    public final void mo91007a(String str, String str2, float f) {
        if (this.f113586a != null) {
            C20501c e = this.f113586a.mo43518e();
            e.mo43553a(str, str2, f);
            e.mo43557a();
        }
    }

    /* renamed from: a */
    public final void mo91009a(boolean z) {
        if (this.f113586a != null) {
            this.f113586a.mo43537n(true);
        }
    }

    /* renamed from: a */
    public final int[] mo91010a(String str, String str2) {
        return this.f113586a.mo43507c(str, str2);
    }

    /* renamed from: a */
    public final void mo91029a(List<ComposerInfo> list, int i) {
        if (this.f113586a != null) {
            this.f113586a.mo43514d(list, 60000);
        }
    }

    /* renamed from: a */
    public final void mo91008a(List<String> list, List<String> list2, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            arrayList.add(new ComposerInfo((String) list.get(i2), i2 < list2.size() ? (String) list2.get(i2) : "", ""));
            i2++;
        }
        if (this.f113586a != null) {
            this.f113586a.mo43505c(arrayList, 10000);
        }
    }

    /* renamed from: f */
    private int m98095f() {
        String str;
        if (this.f113592g) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23785h.m58373a(str, "1")) {
            return 3;
        }
        int b = C39618d.f101151O.mo83118b(C40796a.BeautyModel);
        if (b == 0) {
            b = 1;
        }
        return b;
    }

    /* renamed from: a */
    public final float mo90999a() {
        int i;
        if (C23785h.m58373a("2", "3")) {
            i = C39618d.f101151O.mo83118b(C40796a.UserLipLevel);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    /* renamed from: b */
    public final float mo91011b() {
        int i;
        if (C23785h.m58373a("2", "3")) {
            i = C39618d.f101151O.mo83118b(C40796a.UserBlushLevel);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    /* renamed from: c */
    public final float mo91014c() {
        return (((float) C39618d.f101151O.mo83118b(C40796a.UserBigEyeLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: d */
    public final float mo91016d() {
        return (((float) C39618d.f101151O.mo83118b(C40796a.UserShapeLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: e */
    public final float mo91018e() {
        return (((float) C39618d.f101151O.mo83118b(C40796a.UserSmoothSkinLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: a */
    public final void mo91000a(float f) {
        this.f113586a.mo43441a(9, f);
    }

    /* renamed from: b */
    public final float mo91030b(String str) {
        return this.f113586a.mo43530h(str);
    }

    /* renamed from: b */
    public final void mo91031b(float f) {
        this.f113586a.mo43489b(f);
    }

    public C44885g(C20489b bVar) {
        this.f113586a = bVar;
        this.f113601p = C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust);
    }

    /* renamed from: b */
    public final void mo91032b(boolean z) {
        int i;
        if (z) {
            i = C44883f.f113581b;
        } else {
            i = C44883f.f113582c;
        }
        this.f113593h = i;
        if (this.f113592g != z) {
            this.f113592g = z;
            if (this.f113594i != -1) {
                boolean z2 = true;
                if (this.f113594i != 1) {
                    z2 = false;
                }
                mo91033c(z2);
            }
            if (!(this.f113595j == 0.0f && this.f113596k == 0.0f)) {
                mo91012b(this.f113595j, this.f113596k);
            }
            if (this.f113597l != 0.0f || this.f113598m != 0.0f) {
                mo91015c(this.f113597l, this.f113598m);
            }
        }
    }

    /* renamed from: a */
    public final void mo91003a(int i) {
        C44878a aVar = new C44878a(i);
        this.f113588c = aVar;
        if (aVar.f113580b == 0 && this.f113589d == 2) {
            C31453b b = C39618d.f101144H.mo58584o().mo64332b();
            if (I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isKorean()) {
                C20489b bVar = this.f113586a;
                StringBuilder sb = new StringBuilder();
                sb.append(b.mo64342c());
                sb.append("beautify_filter_korean/");
                bVar.mo43528g(sb.toString());
            } else {
                C20489b bVar2 = this.f113586a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(b.mo64342c());
                sb2.append("beautify_filter/");
                bVar2.mo43528g(sb2.toString());
            }
        } else {
            this.f113586a.mo43528g(C39618d.f101144H.mo58584o().mo64333c().mo64349c(aVar.f113580b));
        }
    }

    /* renamed from: c */
    public final void mo91033c(boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        this.f113594i = z ? 1 : 0;
        int f = m98095f();
        if (z) {
            i = f;
        } else {
            i = 0;
        }
        this.f113589d = i;
        C31453b b = C39618d.f101144H.mo58584o().mo64332b();
        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
        if (VERSION.SDK_INT > 18) {
            if (this.f113592g) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            if (C23785h.m58373a(str2, "1")) {
                if (this.f113592g) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                this.f113590e = C23785h.m58374b(str3, "1");
                this.f113586a.mo43525f(this.f113599n, this.f113600o);
            } else if (createI18nManagerServicebyMonsterPlugin != null && createI18nManagerServicebyMonsterPlugin.isIndonesiaByMcc()) {
                this.f113590e = b.mo64339a(f);
                this.f113586a.mo43525f(0.35f, 0.75f);
            } else if (createI18nManagerServicebyMonsterPlugin == null || !createI18nManagerServicebyMonsterPlugin.isKorean()) {
                this.f113590e = b.mo64339a(f);
                this.f113586a.mo43525f(0.35f, 0.35f);
            } else {
                this.f113590e = b.mo64340b(f);
                this.f113586a.mo43525f(0.35f, 0.45f);
            }
        }
        this.f113586a.mo43457a(i, this.f113590e);
        if (C39618d.f101151O.mo83118b(C40796a.FaceDetectInterval) > 0) {
            this.f113586a.mo43503c(C39618d.f101151O.mo83118b(C40796a.FaceDetectInterval));
        }
        if (createI18nManagerServicebyMonsterPlugin != null && createI18nManagerServicebyMonsterPlugin.isKorean()) {
            if (this.f113592g) {
                str = "1";
            } else {
                str = "2";
            }
            if (!C23785h.m58373a(str, "1")) {
                if (z) {
                    C20489b bVar = this.f113586a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b.mo64343d());
                    sb.append("facereshape_v2/");
                    bVar.mo43445a(sb.toString(), 0.2f, 0.2f);
                    return;
                }
                mo91012b(0.0f, 0.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo91005a(String str) {
        this.f113586a.mo43528g(str);
        this.f113591f = str;
    }

    /* renamed from: d */
    public final void mo91017d(float f, float f2) {
        if (this.f113586a != null) {
            this.f113586a.mo43452a(f, f2);
        }
    }

    /* renamed from: e */
    public final void mo91019e(float f, float f2) {
        if (this.f113586a != null) {
            this.f113586a.mo43490b(f, f2);
        }
    }

    /* renamed from: f */
    public final void mo91020f(float f, float f2) {
        if (this.f113586a != null) {
            this.f113586a.mo43502c(f, 3.0f);
        }
    }

    /* renamed from: g */
    public final void mo91021g(float f, float f2) {
        if (this.f113586a != null) {
            this.f113586a.mo43511d(f, 6.0f);
        }
    }

    /* renamed from: h */
    public final void mo91022h(float f, float f2) {
        if (this.f113586a != null) {
            this.f113586a.mo43519e(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo91001a(float f, float f2) {
        String str;
        String str2;
        this.f113599n = f;
        this.f113600o = f2;
        if (this.f113592g) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23785h.m58373a(str, "1")) {
            if (this.f113592g) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            float b = C23779c.m58360b(0, str2);
            if (b >= 0.0f) {
                f *= b;
            }
        }
        this.f113586a.mo43525f(f, f2);
        if (f - 0.0f < 0.001f) {
            this.f113586a.mo43457a(0, "");
        } else {
            this.f113586a.mo43457a(m98095f(), this.f113590e);
        }
    }

    /* renamed from: c */
    public final void mo91015c(float f, float f2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f113597l = f;
        this.f113598m = f2;
        String str5 = "";
        if (this.f113592g) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23785h.m58373a(str, "3")) {
            if (this.f113592g) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            str5 = C23785h.m58374b(str2, "3");
            if (this.f113592g) {
                str3 = "1";
            } else {
                str3 = "2";
            }
            float b = C23779c.m58360b(3, str3);
            if (b >= 0.0f) {
                f *= b;
            }
            if (this.f113592g) {
                str4 = "1";
            } else {
                str4 = "2";
            }
            float b2 = C23779c.m58360b(4, str4);
            if (b >= 0.0f) {
                f2 *= b2;
            }
        }
        this.f113586a.mo43485b(str5, f, f2);
    }

    /* renamed from: b */
    public final void mo91012b(float f, float f2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f113595j = f;
        this.f113596k = f2;
        if (f - 0.0f >= 0.001f || f2 - 0.0f >= 0.001f) {
            if (this.f113592g) {
                str = "1";
            } else {
                str = "2";
            }
            if (C23785h.m58373a(str, "2")) {
                if (this.f113592g) {
                    str2 = "1";
                } else {
                    str2 = "2";
                }
                String b = C23785h.m58374b(str2, "2");
                if (this.f113592g) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                float b2 = C23779c.m58360b(1, str3);
                if (b2 >= 0.0f) {
                    f2 *= b2;
                }
                if (this.f113592g) {
                    str4 = "1";
                } else {
                    str4 = "2";
                }
                float b3 = C23779c.m58360b(2, str4);
                if (b3 >= 0.0f) {
                    f *= b3;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(Integer.valueOf(4), Float.valueOf(f));
                hashMap.put(Integer.valueOf(5), Float.valueOf(f2));
                hashMap.put(Integer.valueOf(30), Float.valueOf(f2));
                hashMap.put(Integer.valueOf(21), Float.valueOf(f2));
                hashMap.put(Integer.valueOf(24), Float.valueOf(f2));
                hashMap.put(Integer.valueOf(26), Float.valueOf(f2));
                hashMap.put(Integer.valueOf(29), Float.valueOf(f2));
                this.f113586a.mo43475a(b, (Map<Integer, Float>) hashMap);
                return;
            }
            this.f113586a.mo43445a(C39618d.f101144H.mo58584o().mo64332b().mo64338a(), f, f2);
            return;
        }
        this.f113586a.mo43445a("", 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo91028a(String str, float f) {
        this.f113586a.mo43496b(str, f);
        this.f113591f = str;
    }

    /* renamed from: b */
    public final void mo91013b(String str, float f, float f2) {
        this.f113586a.mo43445a(str, f, f2);
    }

    /* renamed from: a */
    public final void mo91027a(int i, List<C31459g> list, float f) {
        int i2;
        float f2;
        if (m98094c(f) == -1) {
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i3;
            i2 = i;
            i = i4;
        } else {
            i2 = i + 1;
            if (i2 >= list.size()) {
                i2 = list.size() - 1;
            }
        }
        String a = C31460h.m73281a((C31459g) list.get(i));
        String a2 = C31460h.m73281a((C31459g) list.get(i2));
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        C20489b bVar = this.f113586a;
        C31459g gVar = (C31459g) list.get(i);
        C20489b bVar2 = this.f113586a;
        bVar2.getClass();
        float b = C31460h.m73283b(gVar, new C44889j(bVar2));
        C31459g gVar2 = (C31459g) list.get(i2);
        C20489b bVar3 = this.f113586a;
        bVar3.getClass();
        bVar.mo43474a(a, a2, f2, b, C31460h.m73283b(gVar2, new C44890k(bVar3)));
    }

    /* renamed from: a */
    public final void mo91004a(int i, float f, float f2, int i2) {
        if (this.f113586a != null) {
            this.f113586a.mo43455a(i, f, f2, i2);
        }
    }

    /* renamed from: a */
    public final void mo91026a(int i, String str, String str2, float f) {
        if (this.f113586a != null) {
            C20501c e = this.f113586a.mo43518e();
            e.mo43551a(60000, str, str2, f);
            e.mo43557a();
        }
    }

    /* renamed from: a */
    public final void mo91002a(float f, float f2, float f3, float f4, float f5) {
        if (this.f113586a != null) {
            this.f113586a.mo43453a(f, f2, f3, f4, 1.0f);
        }
    }
}
