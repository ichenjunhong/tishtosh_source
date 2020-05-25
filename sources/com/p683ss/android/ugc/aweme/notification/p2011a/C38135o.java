package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.a.o */
public abstract class C38135o extends C38114b implements OnLongClickListener {

    /* renamed from: c */
    public Context f97110c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo78083a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo78097c();

    protected C38135o(View view) {
        super(view);
        this.f97110c = view.getContext();
        View findViewById = view.findViewById(mo78097c());
        if (findViewById != null && mo78083a()) {
            findViewById.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    public final void mo78107a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        m85235a(spannableStringBuilder, baseNotice, this.f97110c);
    }

    /* renamed from: a */
    public static void m85236a(String str, int i) {
        C26890h.m65011a("notification_message_inner_message", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("account_type", str).mo47829a("client_order", String.valueOf(i)).mo47831b().f61491a);
    }

    /* renamed from: a */
    public static String m85234a(BaseNotice baseNotice, Context context) {
        if (baseNotice.getCreateTime() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(" ");
        sb.append(C47903fw.m103626c(context, baseNotice.getCreateTime() * 1000));
        String replaceAll = sb.toString().replaceAll("(.)", "$1⁠");
        if (!C47918gj.m103682a(context)) {
            StringBuilder sb2 = new StringBuilder("‭");
            sb2.append(replaceAll);
            sb2.append(8237);
            replaceAll = sb2.toString();
        }
        return replaceAll;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo78109b(String str, String str2, String str3) {
        m85182a((Activity) null, str, str2, str3);
    }

    /* renamed from: a */
    public static void m85235a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context) {
        int i;
        int i2;
        String a = m85234a(baseNotice, context);
        if (a.indexOf(8237) >= 0) {
            i = 2;
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            if (MTNotificationTabMergeExperiment.m85061a()) {
                i2 = R.color.avo;
            } else {
                i2 = R.color.a81;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(i2)), (spannableStringBuilder.length() - a.length()) + i, spannableStringBuilder.length(), 17);
        }
    }

    /* renamed from: a */
    public final void mo78108a(String str, String str2, BaseNotice baseNotice, String str3, String str4) {
        mo78088a(str, str2, baseNotice.clientOrder, baseNotice, true, "", str4, str3);
    }
}
