package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2338a.C46665a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46678b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2344b.C46745a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditTypeLayout */
public final class SubtitleEditTypeLayout extends TextStickerInputLayout {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditTypeLayout$a */
    public static final class C44768a implements C46745a {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditTypeLayout f113307a;

        /* renamed from: a */
        public final void mo90860a(TextStickerTextWrap textStickerTextWrap) {
            C52711k.m112240b(textStickerTextWrap, "wrap");
        }

        /* renamed from: a */
        public final void mo90861a(String str) {
            C52711k.m112240b(str, "alignStr");
        }

        C44768a(SubtitleEditTypeLayout subtitleEditTypeLayout) {
            this.f113307a = subtitleEditTypeLayout;
        }

        /* renamed from: a */
        public final void mo90858a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(i));
            C47702b.f120193a.mo94984a("select_text_color", C46665a.m101262a(this.f113307a.f117941m, this.f113307a.f117942n, this.f113307a.f117943o, this.f113307a.f117944p, this.f113307a.f117945q).mo47829a("color", sb.toString()).mo47826a("is_subtitle", 1).f61491a);
        }

        /* renamed from: b */
        public final void mo90862b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            C47702b.f120193a.mo94984a("select_text_style", C46665a.m101262a(this.f113307a.f117941m, this.f113307a.f117942n, this.f113307a.f117943o, this.f113307a.f117944p, this.f113307a.f117945q).mo47829a("text_style", sb.toString()).mo47826a("is_subtitle", 1).f61491a);
        }

        /* renamed from: a */
        public final void mo90859a(C46678b bVar) {
            C52711k.m112240b(bVar, "type");
            C47702b.f120193a.mo94984a("select_text_font", C46665a.m101262a(this.f113307a.f117941m, this.f113307a.f117942n, this.f113307a.f117943o, this.f113307a.f117944p, this.f113307a.f117945q).mo47829a(" font", bVar.f117744b).mo47826a("is_subtitle", 1).f61491a);
        }
    }

    public final int getLayoutRes() {
        return R.layout.afd;
    }

    public final int getScene() {
        return 1;
    }

    public final int getTopMargin() {
        return 0;
    }

    /* renamed from: a */
    public final C46745a mo90852a() {
        return new C44768a(this);
    }

    public SubtitleEditTypeLayout(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    /* renamed from: a */
    public final void mo90853a(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this.f117951w = 0;
    }

    public SubtitleEditTypeLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attributes");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo90854a(String str, int i, int i2, int i3, String str2, boolean z) {
        this.f117932d = -1;
        mo93845g();
        this.f117930b.mo93806a(z, i2);
        if (z) {
            C46679c.m101291a().mo93623a(getScene());
            mo93843e();
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.f117929a.mo93819a(str, str.length());
            }
            this.f117930b.setSelectColorView(i2);
            this.f117931c = i;
            this.f117933e = i3;
            this.f117934f = i2;
            C46679c.m101291a().mo93625a(str2, getScene());
        }
        mo93841d();
        this.f117929a.setFontType(C46679c.m101291a().mo93631c(getScene()));
        this.f117929a.mo90950a(i, i2);
        this.f117929a.setAligin(this.f117933e);
        this.f117938j.mo93607a();
        mo93838b();
        mo93836a(C46679c.m101291a().mo93636d(getScene()));
    }
}
