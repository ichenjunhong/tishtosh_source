package com.p683ss.android.ugc.aweme.p1382aq;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.utils.C47689aw;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.aq.o */
public final class C23245o extends C23231d {

    /* renamed from: A */
    private Aweme f62059A;

    /* renamed from: B */
    private String f62060B;

    /* renamed from: a */
    private String f62061a;

    /* renamed from: b */
    private String f62062b;

    /* renamed from: c */
    private String f62063c;

    /* renamed from: d */
    private String f62064d;

    /* renamed from: e */
    private String f62065e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("group_id", this.f62061a, C23232a.f62006b);
        mo48072a("author_id", this.f62062b, C23232a.f62006b);
        Context a = C11010c.m22280a();
        if (a != null) {
            this.f62065e = String.valueOf(C47689aw.m103223e(a) / PreloadTask.BYTE_UNIT_NUMBER);
        }
        mo48069a("memory_usage", this.f62065e);
        mo48069a("local_time_ms", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.f62063c)) {
            mo48072a("enter_method", this.f62063c, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61985g)) {
            String str = this.f61985g;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode != 2614219) {
                    if (hashCode != 482617583) {
                        if (hashCode == 1055811561 && str.equals("DISCOVER")) {
                            c = 2;
                        }
                    } else if (str.equals("PUBLISH")) {
                        c = 3;
                    }
                } else if (str.equals("USER")) {
                    c = 1;
                }
            } else if (str.equals("NOTIFICATION")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.f61985g = "notice";
                    break;
                case 1:
                    this.f61985g = "profile";
                    break;
                case 2:
                    this.f61985g = "discover";
                    break;
                case 3:
                    this.f61985g = "shoot";
                    break;
            }
            mo48069a("enter_from", this.f61985g);
        }
        if (!TextUtils.isEmpty(this.f62060B)) {
            mo48069a("follow_status", this.f62060B);
        }
        if (!TextUtils.isEmpty(this.f62064d)) {
            mo48069a("notice_type", this.f62064d);
        }
    }

    /* renamed from: a */
    public final C23245o mo48115a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23245o mo48116b(String str) {
        this.f62063c = str;
        return this;
    }

    /* renamed from: c */
    public final C23245o mo48117c(String str) {
        this.f62064d = str;
        return this;
    }

    public C23245o(String str) {
        super(str);
    }

    /* renamed from: e */
    public final C23245o mo48118e(Aweme aweme) {
        if (aweme != null) {
            this.f62059A = aweme;
            this.f62061a = aweme.getAid();
            this.f62062b = aweme.getAuthorUid();
            this.f62060B = C23198ae.m56885u(aweme);
        }
        return this;
    }
}
