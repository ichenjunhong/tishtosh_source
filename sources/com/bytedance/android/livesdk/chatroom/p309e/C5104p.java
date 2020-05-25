package com.bytedance.android.livesdk.chatroom.p309e;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6227w;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.p */
public final class C5104p extends C5084b<C7835bj> {
    /* renamed from: e */
    public final User mo10980e() {
        return ((C7835bj) this.f13643a).f21634b;
    }

    /* renamed from: k */
    public final List<Integer> mo10988k() {
        if (this.f13643a == null || ((int) ((C7835bj) this.f13643a).mo14147a()) != 1) {
            return null;
        }
        return super.mo10988k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo10981f() {
        if (1 == ((C7835bj) this.f13643a).mo14147a() || 2 == ((C7835bj) this.f13643a).mo14147a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        switch ((int) ((C7835bj) this.f13643a).mo14147a()) {
            case 1:
                C4514j.m10883j().mo10327h();
                return C5113y.m11750a(((C7835bj) this.f13643a).f21634b, "  ", ((C7835bj) this.f13643a).mo14149c(), R.color.agf, R.color.a_1, false);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                User e = mo10980e();
                String c = ((C7835bj) this.f13643a).mo14149c();
                C4514j.m10883j().mo10327h();
                SpannableString spannableString = new SpannableString(c);
                spannableString.setSpan(new C6227w(e, C5113y.m11748a((int) R.color.aik)), 0, spannableString.length(), 18);
                return spannableString;
            case 8:
                StringBuilder sb = new StringBuilder("Top");
                sb.append(((C7835bj) this.f13643a).mo14148b());
                String sb2 = sb.toString();
                String c2 = ((C7835bj) this.f13643a).mo14149c();
                if (C4206c.m10426a(C3922z.m9915e())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((C7835bj) this.f13643a).mo14148b());
                    sb3.append("Top");
                    sb2 = sb3.toString();
                    c2 = new StringBuffer(c2).reverse().toString();
                }
                String[] split = c2.split(sb2);
                if (split[0].length() == ((C7835bj) this.f13643a).mo14149c().length()) {
                    return C5115z.f13664a;
                }
                SpannableString spannableString2 = new SpannableString(((C7835bj) this.f13643a).mo14149c());
                C4514j.m10883j().mo10327h();
                int a = C5113y.m11748a((int) R.color.aik);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(a);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(a);
                spannableString2.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan, split[0].length(), split[0].length() + sb2.length(), 18);
                spannableString2.setSpan(foregroundColorSpan3, split[0].length() + sb2.length(), ((C7835bj) this.f13643a).mo14149c().length(), 18);
                spannableString2.setSpan(new C6227w(mo10980e(), a), 0, spannableString2.length(), 18);
                return spannableString2;
            default:
                String c3 = ((C7835bj) this.f13643a).mo14149c();
                C4514j.m10883j().mo10327h();
                C4514j.m10883j().mo10327h();
                return C5113y.m11750a(((C7835bj) this.f13643a).f21634b, "  ", c3, R.color.agf, R.color.agk, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo10985m() {
        switch ((int) ((C7835bj) this.f13643a).mo14147a()) {
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
                return C5113y.m11751a(((C7835bj) this.f13643a).mo14149c(), (int) R.color.a_y);
            case 5:
            case 6:
                return C5113y.m11751a(((C7835bj) this.f13643a).mo14149c(), (int) R.color.a_y);
            case 8:
                StringBuilder sb = new StringBuilder("Top");
                sb.append(((C7835bj) this.f13643a).mo14148b());
                String sb2 = sb.toString();
                String c = ((C7835bj) this.f13643a).mo14149c();
                if (C4206c.m10426a(C3922z.m9915e())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((C7835bj) this.f13643a).mo14148b());
                    sb3.append("Top");
                    sb2 = sb3.toString();
                    c = new StringBuffer(c).reverse().toString();
                }
                String[] split = c.split(sb2);
                if (split[0].length() == ((C7835bj) this.f13643a).mo14149c().length()) {
                    return C5115z.f13664a;
                }
                SpannableString spannableString = new SpannableString(((C7835bj) this.f13643a).mo14149c());
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C5113y.m11748a((int) R.color.a_y));
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C5113y.m11748a((int) R.color.a_y));
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C5113y.m11748a((int) R.color.a_y));
                spannableString.setSpan(foregroundColorSpan, 0, split[0].length(), 18);
                spannableString.setSpan(foregroundColorSpan2, split[0].length(), split[0].length() + sb2.length(), 18);
                spannableString.setSpan(foregroundColorSpan3, split[0].length() + sb2.length(), ((C7835bj) this.f13643a).mo14149c().length(), 18);
                return spannableString;
            default:
                return C5113y.m11750a(((C7835bj) this.f13643a).f21634b, "  ", ((C7835bj) this.f13643a).mo14149c(), R.color.a_y, R.color.alt, false);
        }
    }

    public C5104p(C7835bj bjVar) {
        super(bjVar);
    }
}
