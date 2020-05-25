package com.p683ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p684l.C10909a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.i */
public class C30385i {

    /* renamed from: a */
    private static final int f79438a = 2132022804;

    /* renamed from: b */
    private static volatile C30385i f79439b;

    /* renamed from: c */
    private C10909a f79440c;

    /* renamed from: d */
    private Context f79441d = C11010c.m22280a();

    /* renamed from: a */
    private static String m71300a(int i) {
        String str = "";
        switch (i) {
            case 0:
                return "like_highlight_click";
            case 1:
                return "comment_highlight_click";
            case 2:
                return "share_highlight_click";
            default:
                return str;
        }
    }

    private C30385i() {
    }

    /* renamed from: b */
    private String m71303b() {
        if (this.f79440c == null) {
            return "";
        }
        return this.f79440c.f29281a;
    }

    /* renamed from: a */
    public static C30385i m71299a() {
        if (f79439b == null) {
            synchronized (C30385i.class) {
                if (f79439b == null) {
                    f79439b = new C30385i();
                }
            }
        }
        return f79439b;
    }

    /* renamed from: a */
    private static boolean m71302a(ImageView imageView) {
        Boolean bool = (Boolean) imageView.getTag(f79438a);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public final void mo60807b(ImageView imageView, String str, String str2, String str3) {
        m71301a(imageView, 1, str, str2, str3, null);
    }

    /* renamed from: a */
    public final void mo60806a(ImageView imageView, String str, String str2, String str3) {
        View findViewById = imageView.getRootView().findViewById(R.id.b0m);
        boolean z = false;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            z = true;
        }
        m71301a(imageView, 2, str, str2, str3, Boolean.valueOf(z));
        if (z) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m71301a(ImageView imageView, int i, String str, String str2, String str3, Boolean bool) {
        if (m71302a(imageView)) {
            C23089d a = C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", str2).mo47829a("author_id", str3).mo47829a("show_content", m71303b());
            if (i == 2) {
                a.mo47826a("is_pop_up", bool.booleanValue() ? 1 : 0);
            }
            C26890h.m65011a(m71300a(i), a.f61491a);
        }
    }
}
