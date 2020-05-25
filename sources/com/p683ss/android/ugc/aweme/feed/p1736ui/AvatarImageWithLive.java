package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.widget.AppCompatTextView;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive */
public class AvatarImageWithLive extends RelativeLayout {

    /* renamed from: a */
    private SmartAvatarBorderView f80338a;

    /* renamed from: b */
    private TextView f80339b;

    public SmartAvatarBorderView getAvatarImageView() {
        return this.f80338a;
    }

    private LayoutParams getAvatarLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    private String m71980a() {
        try {
            return C36173w.m81665a().getLive().mo15061n().mo15022a(this.f80339b.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m71982b() {
        try {
            return C36173w.m81665a().getLive().mo15062o().mo15065a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private void m71983c() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "homepage_hot");
            String str2 = "is_english";
            if ("LIVE".equals(m71980a())) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            C36173w.m81665a().getLive().mo15061n().mo15023a("livesdk_live_show_language", hashMap, new Object[0]);
        } catch (Exception unused) {
        }
    }

    private LayoutParams getLiveLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(m71979a(29), m71979a(12));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        layoutParams.topMargin = m71979a(1);
        return layoutParams;
    }

    public AvatarImageWithLive(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m71979a(int i) {
        return (int) C9432q.m18687b(getContext(), (float) i);
    }

    public void setBorderColor(int i) {
        if (this.f80338a != null) {
            this.f80338a.setBorderColor(i);
        }
    }

    /* renamed from: b */
    private void m71981b(boolean z) {
        if (z) {
            this.f80339b.setText(m71980a());
            this.f80339b.setTextColor(-1);
            this.f80339b.setMaxLines(1);
            this.f80339b.setEllipsize(TruncateAt.END);
            this.f80339b.setPadding(m71979a(2), 0, m71979a(2), 0);
            this.f80339b.setGravity(17);
            C1115o.m3260b(this.f80339b, 1);
            C1115o.m3257a(this.f80339b, 6, 9, 1, 2);
            m71983c();
            return;
        }
        C1115o.m3260b(this.f80339b, 0);
        this.f80339b.setText("");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ NotFoundException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[Catch:{ NotFoundException -> 0x004b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63283a(boolean r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x000a
            android.widget.TextView r9 = r8.f80339b
            r0 = 8
            r9.setVisibility(r0)
            return
        L_0x000a:
            android.widget.TextView r9 = r8.f80339b
            r0 = 0
            r9.setVisibility(r0)
            boolean r9 = m71982b()     // Catch:{ NotFoundException -> 0x004b }
            r1 = 1
            if (r9 == 0) goto L_0x0030
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ NotFoundException -> 0x004b }
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment> r3 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.class
            r4 = 1
            java.lang.String r5 = "feed_avatar_title_redesign_style"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            int r9 = r2.mo18168a(r3, r4, r5, r6, r7)     // Catch:{ NotFoundException -> 0x004b }
            if (r9 != 0) goto L_0x002b
            r9 = 1
            goto L_0x002c
        L_0x002b:
            r9 = 0
        L_0x002c:
            if (r9 == 0) goto L_0x0030
            r9 = 1
            goto L_0x0031
        L_0x0030:
            r9 = 0
        L_0x0031:
            if (r9 == 0) goto L_0x003f
            r8.m71981b(r1)     // Catch:{ NotFoundException -> 0x004b }
            android.widget.TextView r9 = r8.f80339b     // Catch:{ NotFoundException -> 0x004b }
            r0 = 2131952575(0x7f1303bf, float:1.9541597E38)
            r9.setBackgroundResource(r0)     // Catch:{ NotFoundException -> 0x004b }
            goto L_0x004b
        L_0x003f:
            r8.m71981b(r0)     // Catch:{ NotFoundException -> 0x004b }
            android.widget.TextView r9 = r8.f80339b     // Catch:{ NotFoundException -> 0x004b }
            r0 = 2131952711(0x7f130447, float:1.9541872E38)
            r9.setBackgroundResource(r0)     // Catch:{ NotFoundException -> 0x004b }
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.AvatarImageWithLive.mo63283a(boolean):void");
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80338a = new SmartAvatarBorderView(getContext());
        ((C13833a) this.f80338a.getHierarchy()).mo25892a((int) R.color.a1x, C13818b.f36067g);
        addView(this.f80338a, getAvatarLayoutParams());
        this.f80339b = new AppCompatTextView(getContext());
        this.f80339b.setVisibility(8);
        addView(this.f80339b, getLiveLayoutParams());
    }
}
