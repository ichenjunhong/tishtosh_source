package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cr */
final /* synthetic */ class C6510cr implements C5042b {

    /* renamed from: a */
    private final LinkPKStealTowerWidget f17822a;

    C6510cr(LinkPKStealTowerWidget linkPKStealTowerWidget) {
        this.f17822a = linkPKStealTowerWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        int i;
        String str;
        int i2;
        LinkPKStealTowerWidget linkPKStealTowerWidget = this.f17822a;
        TextView textView = (TextView) view;
        Integer num = (Integer) obj;
        int i3 = linkPKStealTowerWidget.f17152a.f12610E.f12646e - linkPKStealTowerWidget.f17152a.f12610E.f12645d;
        if (linkPKStealTowerWidget.f17152a.f12610E.f12643b) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(num));
            sb.append("/");
            sb.append(String.valueOf(i3));
            str = sb.toString();
            i2 = 0;
            i = String.valueOf(num).length() + 1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(i3));
            sb2.append("/");
            sb2.append(String.valueOf(num));
            String sb3 = sb2.toString();
            i2 = String.valueOf(i3).length();
            String str2 = sb3;
            i = sb3.length();
            str = str2;
        }
        if (linkPKStealTowerWidget.f17204g == null) {
            linkPKStealTowerWidget.f17204g = new ForegroundColorSpan(LinkPKStealTowerWidget.f17201d);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(linkPKStealTowerWidget.f17204g, i2, i, 33);
        ((TextView) linkPKStealTowerWidget.f17205h.f13491b).setText(spannableString);
    }
}
