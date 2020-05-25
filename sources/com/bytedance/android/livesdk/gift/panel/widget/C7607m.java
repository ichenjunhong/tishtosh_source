package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0199s;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.m */
final /* synthetic */ class C7607m implements C0199s {

    /* renamed from: a */
    private final GiftPanelDoodleWidget f20944a;

    C7607m(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f20944a = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f20944a;
        C7525b bVar = (C7525b) obj;
        if (bVar == null || bVar.f20670a.isEmpty()) {
            giftPanelDoodleWidget.f20828b.setVisibility(8);
            giftPanelDoodleWidget.f20829c.setVisibility(8);
            giftPanelDoodleWidget.f20831e.setVisibility(8);
            giftPanelDoodleWidget.f20830d.setVisibility(0);
            return;
        }
        giftPanelDoodleWidget.f20828b.setVisibility(0);
        giftPanelDoodleWidget.f20829c.setVisibility(0);
        giftPanelDoodleWidget.f20831e.setVisibility(0);
        giftPanelDoodleWidget.f20830d.setVisibility(8);
        if (bVar.f20670a.size() < ((Integer) C6718b.f18308E.mo9431a()).intValue()) {
            giftPanelDoodleWidget.f20831e.setText(C4604n.m11050a(giftPanelDoodleWidget.context.getString(R.string.ebx), C6718b.f18308E.mo9431a()));
            return;
        }
        giftPanelDoodleWidget.f20831e.setTextColor(giftPanelDoodleWidget.context.getResources().getColor(R.color.ab9));
        String a = C4604n.m11050a(giftPanelDoodleWidget.context.getString(R.string.ebz), Integer.valueOf(bVar.f20673d));
        String valueOf = String.valueOf(bVar.f20673d);
        int indexOf = a.indexOf(valueOf);
        int length = valueOf.length() + indexOf;
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ForegroundColorSpan(giftPanelDoodleWidget.context.getResources().getColor(R.color.abh)), indexOf, length, 18);
        giftPanelDoodleWidget.f20831e.setText(spannableString);
    }
}
