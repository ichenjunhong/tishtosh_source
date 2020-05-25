package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import com.p683ss.android.ugc.aweme.router.C41312z;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.b */
public final class C40924b extends C40922a {
    public C40924b(C40923a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        List a = C41312z.m91070a(str);
        if (a.size() != 2 || !TextUtils.equals((CharSequence) a.get(0), "share") || !TextUtils.equals((CharSequence) a.get(1), "billboard")) {
            return false;
        }
        String b = C41312z.m91072b(str, "id");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        switch (Integer.parseInt(b)) {
            case 0:
                this.f104146a = "hot_search_board";
                break;
            case 1:
                this.f104146a = "hot_search_video_board";
                break;
            case 2:
                this.f104146a = "hot_search_music_board";
                break;
        }
        return this.f104147b.mo83411a(10, null, str, i, null);
    }
}
