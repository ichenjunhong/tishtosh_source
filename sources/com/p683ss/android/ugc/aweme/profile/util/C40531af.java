package com.p683ss.android.ugc.aweme.profile.util;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.api.UsedPhoneApi;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.util.af */
public final class C40531af {

    /* renamed from: com.ss.android.ugc.aweme.profile.util.af$a */
    public static final class C40532a implements C1683ag<BaseResponse> {
        C40532a() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            C52711k.m112240b((BaseResponse) obj, "response");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0 == null) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m89936a(android.app.Activity r2, com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r3, com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r4) {
        /*
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "noticeBar"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "noticeMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = r4.scheme
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r4.scheme
            goto L_0x0041
        L_0x0025:
            java.util.List<com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight> r0 = r4.highlight
            if (r0 == 0) goto L_0x002d
            int r1 = r0.size()
        L_0x002d:
            if (r1 <= 0) goto L_0x003f
            java.util.List<com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight> r0 = r4.highlight
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight r0 = (com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsgHighlight) r0
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.scheme
            if (r0 != 0) goto L_0x0041
        L_0x003f:
            java.lang.String r0 = ""
        L_0x0041:
            m89937a(r0, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.util.C40531af.m89936a(android.app.Activity, com.ss.android.ugc.aweme.discover.ui.NoticeView, com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg):void");
    }

    /* renamed from: a */
    public static final void m89935a(long j, String str, String str2, String str3) {
        C52711k.m112240b(str, "noticeType");
        C52711k.m112240b(str2, "noticeTag");
        C52711k.m112240b(str3, "behavior");
        ((UsedPhoneApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(UsedPhoneApi.class)).confirmSafeInfoNotice(j, str, str2, str3).mo6155b(C2168a.m6521b()).mo6148a(C2168a.m6521b()).mo6159b((C1683ag<? super T>) new C40532a<Object>());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r0 == null) goto L_0x0068;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m89937a(java.lang.String r3, android.app.Activity r4, com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r5, com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg r6) {
        /*
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "noticeBar"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "noticeMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = r6.noticeType
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "mno_mobile"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x002b
            android.content.Intent r0 = new android.content.Intent
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmActivity> r2 = com.p683ss.android.ugc.aweme.profile.p2090ui.UsedPhoneConfirmActivity.class
            r0.<init>(r1, r2)
            r4.startActivity(r0)
            goto L_0x0043
        L_0x002b:
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0039
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 != 0) goto L_0x0043
            com.ss.android.ugc.aweme.profile.service.s r0 = com.p683ss.android.ugc.aweme.profile.service.C40026s.f101964a
            android.content.Context r4 = (android.content.Context) r4
            r0.startAdsAppActivity(r4, r3)
        L_0x0043:
            r4 = 8
            r5.setVisibility(r4)
            java.lang.String r4 = "security_alert_click"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r0 = "click_button"
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            com.ss.android.ugc.aweme.app.f.d r3 = r5.mo47829a(r0, r3)
            java.lang.String r5 = "notice_id"
            java.lang.Long r0 = r6.noticeId
            if (r0 == 0) goto L_0x0068
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            java.lang.String r0 = ""
        L_0x006a:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r5, r0)
            java.lang.String r5 = "notice_type"
            java.lang.String r0 = r6.noticeType
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = ""
        L_0x0076:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r5, r0)
            java.lang.String r5 = "notice_model"
            java.lang.String r0 = r6.noticeModel
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = ""
        L_0x0082:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r5, r0)
            java.lang.String r5 = "notice_tag"
            java.lang.String r0 = r6.noticeTag
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = ""
        L_0x008e:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r5, r0)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r3)
            java.lang.Long r3 = r6.noticeId
            if (r3 == 0) goto L_0x00a0
            long r3 = r3.longValue()
            goto L_0x00a2
        L_0x00a0:
            r3 = 0
        L_0x00a2:
            java.lang.String r5 = r6.noticeType
            if (r5 != 0) goto L_0x00a8
            java.lang.String r5 = ""
        L_0x00a8:
            java.lang.String r6 = r6.noticeTag
            if (r6 != 0) goto L_0x00ae
            java.lang.String r6 = ""
        L_0x00ae:
            java.lang.String r0 = "confirm"
            m89935a(r3, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.util.C40531af.m89937a(java.lang.String, android.app.Activity, com.ss.android.ugc.aweme.discover.ui.NoticeView, com.ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg):void");
    }
}
