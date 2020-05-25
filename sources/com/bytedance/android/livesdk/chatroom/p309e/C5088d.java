package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.d */
public final class C5088d extends C5084b<C8001m> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C8001m) this.f13643a).f21870c;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        return C5113y.m11753b(((C8001m) this.f13643a).f21870c, "：", ((C8001m) this.f13643a).f21869b, R.color.a_y, R.color.alt, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        C4514j.m10883j().mo10327h();
        C4514j.m10883j().mo10327h();
        String str = "：";
        char[] charArray = ((C8001m) this.f13643a).f21869b.toCharArray();
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char c = charArray[i];
            if (1536 <= c && c <= 1791) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("‏");
            str = sb.toString();
        }
        return C5113y.m11753b(((C8001m) this.f13643a).f21870c, str, ((C8001m) this.f13643a).f21869b, R.color.agf, R.color.agg, false);
    }

    public C5088d(C8001m mVar) {
        super(mVar);
    }
}
