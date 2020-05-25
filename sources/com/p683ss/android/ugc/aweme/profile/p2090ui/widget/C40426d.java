package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnClickListener;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32943c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.d */
public final class C40426d {

    /* renamed from: a */
    public NoticeView f103208a;

    /* renamed from: b */
    public OnClickListener f103209b;

    /* renamed from: c */
    public OnClickListener f103210c;

    /* renamed from: d */
    private Context f103211d;

    /* renamed from: a */
    public final void mo82733a() {
        this.f103208a.setVisibility(8);
    }

    /* renamed from: b */
    private void m89838b() {
        HashMap hashMap;
        int i;
        HashMap hashMap2;
        C17971f fVar = new C17971f();
        try {
            hashMap = (HashMap) new C17971f().mo34885a((String) C23183v.m56778a().mo47924t().mo47782d(), new C17956a<HashMap<String, Integer>>() {
            }.f49843c);
        } catch (C18091u unused) {
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (hashMap.containsKey(C20902b.m53242a().getCurUserId())) {
            i = ((Integer) hashMap.get(C20902b.m53242a().getCurUserId())).intValue();
        } else {
            i = 0;
        }
        hashMap.put(C20902b.m53242a().getCurUserId(), Integer.valueOf(i + 1));
        C23183v.m56778a().mo47924t().mo47776a(fVar.mo34889b(hashMap));
        try {
            hashMap2 = (HashMap) new C17971f().mo34885a((String) C23183v.m56778a().mo47923s().mo47782d(), new C17956a<HashMap<String, Long>>() {
            }.f49843c);
        } catch (C18091u unused2) {
            hashMap2 = null;
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        hashMap2.put(C20902b.m53242a().getCurUserId(), Long.valueOf(System.currentTimeMillis()));
        C23183v.m56778a().mo47923s().mo47776a(fVar.mo34889b(hashMap2));
    }

    public C40426d(NoticeView noticeView, Context context, C32943c cVar, OnClickListener onClickListener) {
        this(noticeView, context, cVar, onClickListener, null);
    }

    public C40426d(NoticeView noticeView, Context context, C32943c cVar, OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.f103208a = noticeView;
        this.f103211d = context;
        this.f103209b = onClickListener;
        this.f103210c = onClickListener2;
        this.f103208a.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (cVar.f85616c == 2) {
            spannableStringBuilder.append(this.f103211d.getString(R.string.f9t, new Object[]{Integer.valueOf((int) cVar.f85615b)}));
        } else if (cVar.f85616c == 1) {
            spannableStringBuilder.append(this.f103211d.getString(R.string.f9s, new Object[]{Integer.valueOf((int) cVar.f85615b)}));
        } else {
            this.f103208a.setVisibility(8);
        }
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f103211d.getString(R.string.b91));
        spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(this.f103211d, R.color.a10)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f103208a.setTitleText((CharSequence) spannableStringBuilder);
        this.f103208a.setOnInternalClickListener(new C28448a() {
            /* renamed from: a */
            public final void mo51945a() {
                if (C40426d.this.f103209b != null) {
                    C40426d.this.f103209b.onClick(C40426d.this.f103208a);
                }
                C40426d.this.mo82733a();
            }

            /* renamed from: b */
            public final void mo51946b() {
                C26890h.m65011a("close_profile_alert_show", C23089d.m56640a().f61491a);
                C40426d.this.mo82733a();
                if (C40426d.this.f103210c != null) {
                    C40426d.this.f103210c.onClick(C40426d.this.f103208a);
                }
            }
        });
        m89838b();
    }
}
