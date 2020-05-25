package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33684p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.C33719d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.C33720e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33456d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33463g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cx */
public class C33835cx extends C33805c<TextContent> {

    /* renamed from: u */
    private TextView f87787u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87787u = (TextView) mo71845a((int) R.id.bnh);
        this.f87708j = (View) mo71845a((int) R.id.ze);
        if (this.f87708j != null) {
            Drawable background = this.f87708j.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    public C33835cx(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, TextContent textContent, int i) {
        int i2;
        C33463g gVar;
        String str;
        super.mo71780a(pVar, pVar2, textContent, i);
        if (textContent != null && textContent.getText() != null) {
            long length = (long) textContent.getText().length();
            if (C34004b.m77717a().mo71949f().getIMSetting().f91143a != 1 || length > 1024) {
                this.f87787u.setText(textContent.getText());
            } else {
                C33684p.m77135a(this.f87787u, textContent.getText(), this.f87707i, C35197am.m79559a(pVar, (BaseContent) textContent), pVar.getMsgId(), pVar);
            }
            if (length <= 1024) {
                C29408b.m69342a(this.f87787u);
            }
            if (textContent.isDefault()) {
                if (C35279p.m79763a()) {
                    i2 = C11010c.m22280a().getResources().getColor(R.color.ao7);
                } else if (pVar.isSelf()) {
                    i2 = C11010c.m22280a().getResources().getColor(R.color.anu);
                } else {
                    i2 = C11010c.m22280a().getResources().getColor(R.color.aqt);
                }
                if (pVar.isSelf()) {
                    C33456d dVar = C33456d.f86709d;
                    gVar = (C33463g) C33456d.f86707b.getValue();
                } else {
                    C33456d dVar2 = C33456d.f86709d;
                    gVar = (C33463g) C33456d.f86708c.getValue();
                }
                if (!C35197am.m79567e(pVar)) {
                    if (gVar != null) {
                        i2 = C11010c.m22280a().getResources().getColor(gVar.f86726i);
                    }
                    TextView textView = this.f87787u;
                    String text = textContent.getText();
                    if (TextUtils.isEmpty(text)) {
                        textView.setText("");
                    } else {
                        SpannableString spannableString = new SpannableString(text);
                        String string = C11010c.m22280a().getString(R.string.bgq);
                        if (text.contains(string)) {
                            C33720e eVar = new C33720e(i2);
                            int indexOf = text.indexOf(string);
                            spannableString.setSpan(eVar, indexOf, string.length() + indexOf, 33);
                        }
                        textView.setText(spannableString);
                    }
                } else if (C35243bl.m79712b()) {
                    int color = C11010c.m22280a().getResources().getColor(R.color.r6);
                    if (gVar != null) {
                        color = C11010c.m22280a().getResources().getColor(gVar.f86726i);
                    }
                    String string2 = C11010c.m22280a().getString(R.string.bpj);
                    Context context = this.itemView.getContext();
                    TextView textView2 = this.f87787u;
                    String text2 = textContent.getText();
                    SpannableString spannableString2 = new SpannableString(text2);
                    if (text2.contains(string2)) {
                        C33719d dVar3 = new C33719d(context, color, pVar);
                        int indexOf2 = text2.indexOf(string2);
                        spannableString2.setSpan(dVar3, indexOf2, string2.length() + indexOf2, 33);
                    }
                    textView2.setText(spannableString2);
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    if (C35243bl.m79710a(context)) {
                        str = "open";
                    } else {
                        str = "install";
                    }
                    C35190af.m79445a(7, str, "duoshan_banner_show");
                } else {
                    this.f87787u.setText(textContent.getText());
                }
            }
            if (textContent.getHeartType() == 2 || textContent.getHeartType() == 1) {
                this.f87708j.setTag(50331648, Integer.valueOf(31));
            } else {
                this.f87708j.setTag(50331648, Integer.valueOf(1));
            }
            this.f87708j.setTag(50331649, Boolean.valueOf(C35197am.m79559a(pVar, (BaseContent) textContent)));
        }
    }
}
