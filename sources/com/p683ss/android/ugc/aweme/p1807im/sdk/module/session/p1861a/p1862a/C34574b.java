package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.p1862a;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34587e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34595h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35220bb;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.a.b */
public final class C34574b implements C34573a {

    /* renamed from: a */
    private C35456b f89119a;

    /* renamed from: c */
    public final String mo72640c() {
        return C35220bb.m79611b(C11010c.m22280a(), this.f89119a.f91118i);
    }

    /* renamed from: a */
    public final String mo72638a() {
        String str;
        int b = this.f89119a.mo72634b();
        if (b == 0) {
            IMUser b2 = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(((C34567a) this.f89119a).bm_())));
            if (b2 != null) {
                String displayName = b2.getDisplayName();
                if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                    str = b2.getDisplayId();
                } else {
                    str = displayName;
                }
            } else {
                str = null;
            }
        } else if (b == 2) {
            return C11010c.m22280a().getString(R.string.bns);
        } else {
            str = this.f89119a.f91116g;
        }
        return str;
    }

    /* renamed from: b */
    public final String mo72639b() {
        if (this.f89119a.mo72634b() != 2) {
            return this.f89119a.f91117h;
        }
        C34595h hVar = (C34595h) this.f89119a;
        StringBuilder sb = new StringBuilder();
        String str = hVar.f91116g;
        if (!TextUtils.isEmpty(str) && str.length() > 6) {
            String substring = str.substring(0, 6);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(substring);
            sb2.append("...");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("：");
        sb.append(hVar.f91117h);
        return sb.toString();
    }

    /* renamed from: d */
    public final Drawable mo72641d() {
        int b = this.f89119a.mo72634b();
        Drawable drawable = null;
        if (b == 0 || b == 20) {
            C34587e eVar = (C34587e) this.f89119a;
            switch (eVar.f89134c) {
                case FAILED:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.dad);
                    break;
                case SENDING:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.dae);
                    break;
            }
            return drawable;
        } else if (this.f89119a.f91120k == 1) {
            return C11010c.m22280a().getResources().getDrawable(R.drawable.da5);
        } else {
            return null;
        }
    }

    public C34574b(C35456b bVar) {
        this.f89119a = bVar;
    }
}
