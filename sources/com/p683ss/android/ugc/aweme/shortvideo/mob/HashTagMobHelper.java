package com.p683ss.android.ugc.aweme.shortvideo.mob;

import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p683ss.android.ugc.aweme.video.hashtag.C48029c;
import com.p683ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mob.HashTagMobHelper */
public final class HashTagMobHelper extends C0209x {

    /* renamed from: h */
    public static final C43993a f111415h = new C43993a(null);

    /* renamed from: a */
    public String f111416a;

    /* renamed from: b */
    public LogPbBean f111417b;

    /* renamed from: c */
    public RecommendWordMob f111418c;

    /* renamed from: d */
    public String f111419d;

    /* renamed from: e */
    public BaseTitleHelper f111420e;

    /* renamed from: f */
    public List<? extends C48029c> f111421f;

    /* renamed from: g */
    public String f111422g;

    /* renamed from: i */
    private boolean f111423i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mob.HashTagMobHelper$a */
    public static final class C43993a {
        private C43993a() {
        }

        public /* synthetic */ C43993a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo89563a(String str) {
        String str2;
        if (C52711k.m112239a((Object) str, (Object) "click_tag_button")) {
            this.f111423i = true;
        } else if (this.f111423i) {
            this.f111423i = false;
            return;
        }
        BaseTitleHelper baseTitleHelper = this.f111420e;
        if (baseTitleHelper != null) {
            baseTitleHelper.mo95300a();
        }
        this.f111422g = str;
        String str3 = "show_tag";
        C26898j jVar = new C26898j();
        String str4 = "title";
        BaseTitleHelper baseTitleHelper2 = this.f111420e;
        if (baseTitleHelper2 != null) {
            str2 = baseTitleHelper2.f120716c;
        } else {
            str2 = null;
        }
        C26890h.m65012a(str3, jVar.mo54849a(str4, str2).mo54849a("creation_id", this.f111416a).mo54849a("enter_method", str).mo54850a());
    }

    /* renamed from: a */
    public final void mo89564a(String str, C48029c cVar, Integer num, String str2) {
        String str3;
        String str4;
        if (cVar != null && num != null) {
            num.intValue();
            String cid = cVar.f120707a.getCid();
            String str5 = "add_tag";
            C26898j a = new C26898j().mo54849a("enter_method", str);
            String str6 = "tag_id";
            if (cid == null) {
                cid = "";
            }
            C26898j a2 = a.mo54849a(str6, cid);
            String str7 = "tag_source";
            if (str2 == null) {
                str2 = cVar.f120712f;
            }
            C26898j a3 = a2.mo54849a(str7, str2).mo54849a("tag_content", cVar.f120707a.challengeName).mo54849a("rank", String.valueOf(num.intValue())).mo54849a("creation_id", this.f111416a);
            String str8 = "title";
            BaseTitleHelper baseTitleHelper = this.f111420e;
            if (baseTitleHelper != null) {
                str3 = baseTitleHelper.f120716c;
            } else {
                str3 = null;
            }
            C26898j a4 = a3.mo54849a(str8, str3);
            String str9 = "log_pb";
            if (this.f111417b == null) {
                str4 = "";
            } else {
                str4 = C39618d.f101161b.mo34889b(this.f111417b);
            }
            C26890h.m65012a(str5, a4.mo54849a(str9, str4).mo54850a());
        }
    }
}
