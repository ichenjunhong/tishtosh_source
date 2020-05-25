package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.message.model.C8016y;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.widget.C8546g;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.h */
public final class C5094h extends C5084b<C8016y> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        return true;
    }

    /* renamed from: e */
    public final User mo10980e() {
        return ((C8016y) this.f13643a).f21942d;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        Bitmap a = C8546g.m16856a(C3922z.m9915e(), ((C8016y) this.f13643a).f21943e);
        String a2 = C8016y.m15917a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("  ");
            a2 = sb.toString();
        }
        String str = a2;
        C4514j.m10883j().mo10327h();
        return C5113y.m11749a(C5113y.m11753b(((C8016y) this.f13643a).f21942d, " ", str, R.color.agf, R.color.agk, false), a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        Context e = C3922z.m9915e();
        Bitmap a = C8546g.m16855a(e, Color.parseColor(C4604n.m11050a("#%06X", Integer.valueOf(((C8016y) this.f13643a).f21941c & 16777215))), e.getResources().getDimensionPixelSize(R.dimen.qp), e.getResources().getDimensionPixelSize(R.dimen.qo));
        String a2 = C8016y.m15917a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("  ");
            a2 = sb.toString();
        }
        return C5113y.m11749a(C5113y.m11753b(((C8016y) this.f13643a).f21942d, "：", a2, R.color.a_y, R.color.alt, false), a);
    }

    public C5094h(C8016y yVar) {
        super(yVar);
    }
}
