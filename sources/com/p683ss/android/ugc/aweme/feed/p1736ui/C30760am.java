package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.am */
public final class C30760am {

    /* renamed from: a */
    public View f80599a;

    /* renamed from: b */
    public int f80600b;

    /* renamed from: c */
    public String f80601c;

    /* renamed from: d */
    public JSONObject f80602d;

    /* renamed from: e */
    public Aweme f80603e;

    public C30760am(TextView textView) {
        this.f80599a = textView;
    }

    /* renamed from: a */
    public static boolean m72129a(Aweme aweme) {
        if (aweme.getStickerEntranceInfo() == null || TextUtils.isEmpty(aweme.getStickerEntranceInfo().name) || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableStickerDetailsEntrance()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo63462a(LogPbBean logPbBean, Aweme aweme, String str) throws Exception {
        String str2;
        String str3;
        C26890h.m65014b("enter_prop_detail", new C26898j().mo54849a("log_pb", C29981aa.m70153a().mo60160a(logPbBean)).mo54849a("author_id", aweme.getAuthorUid()).mo54849a("group_id", aweme.getAid()).mo54849a("impr_type", C23198ae.m56883s(aweme)).mo54849a("prop_id", str).mo54849a("enter_from", this.f80601c).mo54850a());
        String str4 = "anchor_entrance_click";
        if (this.f80602d == null) {
            str2 = "";
        } else {
            str2 = this.f80602d.optString("request_id");
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.setImprId(str2);
        if (aweme.getStickerEntranceInfo() != null) {
            str3 = aweme.getStickerEntranceInfo().f116246id;
        } else {
            str3 = "";
        }
        C30763ao aoVar = new C30763ao(this, str4, logPbBean2, aweme, str3);
        C0013i.m18a((Callable<TResult>) aoVar, (Executor) C26890h.m65003a());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo63463a(String str, LogPbBean logPbBean, Aweme aweme, String str2) throws Exception {
        C26890h.m65012a(str, new C26898j().mo54849a("log_pb", C29981aa.m70153a().mo60160a(logPbBean)).mo54849a("author_id", aweme.getAuthorUid()).mo54849a("group_id", aweme.getAid()).mo54849a("enter_from", this.f80601c).mo54849a("prop_id", str2).mo54849a("anchor_type", "prop").mo54850a());
        return null;
    }
}
