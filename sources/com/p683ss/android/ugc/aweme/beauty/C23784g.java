package com.p683ss.android.ugc.aweme.beauty;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.beauty.g */
public final class C23784g {

    /* renamed from: a */
    public static final String[] f63385a = {"磨皮", "瘦脸", "大脸", "口红", "腮红"};

    /* renamed from: b */
    public static final float[] f63386b = {0.6f, 0.5f, 0.3f, 0.3f, 0.3f};

    /* renamed from: d */
    public static final float[] f63387d = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: c */
    public int[] f63388c = new int[5];

    public C23784g() {
    }

    /* renamed from: a */
    public final void mo49368a() {
        C40795l e = C39629l.m88232a().mo58574e();
        if (e.mo83117a(C40796a.UlikeBeautyDownloadEnable)) {
            boolean a = C23785h.m58373a("2", "3");
            boolean a2 = C23785h.m58373a("0", "1");
            boolean a3 = C23785h.m58373a("0", "2");
            float a4 = C23779c.m58358a(0, "0");
            float b = C23779c.m58360b(0, "0");
            if (!(!a2 || a4 == -1.0f || b == -1.0f)) {
                f63386b[0] = a4;
                f63387d[0] = b;
            }
            float a5 = C23779c.m58358a(1, "0");
            float b2 = C23779c.m58360b(1, "0");
            if (!(!a3 || a5 == -1.0f || b2 == -1.0f)) {
                f63386b[1] = a5;
                f63387d[1] = b2;
            }
            float a6 = C23779c.m58358a(2, "0");
            float b3 = C23779c.m58360b(2, "0");
            if (!(!a3 || a6 == -1.0f || b3 == -1.0f)) {
                f63386b[2] = a6;
                f63387d[2] = b3;
            }
            float a7 = C23779c.m58358a(3, "0");
            float b4 = C23779c.m58360b(3, "0");
            if (!(!a || a7 == -1.0f || b4 == -1.0f)) {
                f63386b[3] = a7;
                f63387d[3] = b4;
            }
            float a8 = C23779c.m58358a(4, "0");
            float b5 = C23779c.m58360b(4, "0");
            if (!(!a || a8 == -1.0f || b5 == -1.0f)) {
                f63386b[4] = a8;
                f63387d[4] = b5;
            }
        }
        if (e.mo83117a(C40796a.LoadOldUserLevel)) {
            this.f63388c[0] = e.mo83118b(C40796a.UserUlikeSmoothSkinLevel);
            this.f63388c[1] = e.mo83118b(C40796a.UserUlikeShapeLevel);
            this.f63388c[2] = e.mo83118b(C40796a.UserUlikeBigEyeLevel);
            this.f63388c[3] = e.mo83118b(C40796a.UserUlikeLipLevel);
            this.f63388c[4] = e.mo83118b(C40796a.UserUlikeBlushLevel);
        } else {
            this.f63388c[0] = e.mo83118b(C40796a.UserSmoothSkinLevel);
            this.f63388c[1] = e.mo83118b(C40796a.UserShapeLevel);
            this.f63388c[2] = e.mo83118b(C40796a.UserBigEyeLevel);
            this.f63388c[3] = e.mo83118b(C40796a.UserLipLevel);
            this.f63388c[4] = e.mo83118b(C40796a.UserBlushLevel);
        }
        e.mo83116a(C40796a.LoadOldUserLevel, false);
        for (int i = 0; i < 5; i++) {
            if (this.f63388c[i] == -1 && f63387d[i] != 0.0f) {
                this.f63388c[i] = (int) ((f63386b[i] / f63387d[i]) * 100.0f);
            }
        }
    }

    public C23784g(int i, int i2, int i3, int i4, int i5) {
        this.f63388c[0] = i;
        this.f63388c[1] = i2;
        this.f63388c[2] = i3;
        this.f63388c[3] = i4;
        this.f63388c[4] = i5;
    }
}
