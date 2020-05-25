package com.bytedance.android.livesdk.chatroom.p325ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b.C5086b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.em */
final /* synthetic */ class C6152em implements C5086b {

    /* renamed from: a */
    private final C6146d f16506a;

    C6152em(C6146d dVar) {
        this.f16506a = dVar;
    }

    /* renamed from: a */
    public final void mo10993a(Spannable spannable) {
        C6146d dVar = this.f16506a;
        if (spannable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dVar.f16486a.getText());
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(spannable);
            dVar.f16486a.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dVar.f16489e);
            spannableStringBuilder2.append(" ");
            dVar.f16489e = spannableStringBuilder2.append(spannable);
        }
    }
}
