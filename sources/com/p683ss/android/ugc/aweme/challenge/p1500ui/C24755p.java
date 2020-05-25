package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.res.Resources;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.p */
public final class C24755p {
    /* renamed from: a */
    public static int m60284a(boolean z) {
        return z ? R.drawable.cr_ : R.drawable.dg_;
    }

    /* renamed from: a */
    public static boolean m60287a() {
        return C31357a.m73095a();
    }

    /* renamed from: a */
    public static void m60285a(ImageView imageView, Resources resources) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.cra));
    }

    /* renamed from: a */
    public static void m60286a(String str, String str2) {
        C26890h.m65011a("tag_detail_click_icon", C23089d.m56640a().mo47829a("process_id", str).mo47829a("tag_id", str2).f61491a);
    }
}
