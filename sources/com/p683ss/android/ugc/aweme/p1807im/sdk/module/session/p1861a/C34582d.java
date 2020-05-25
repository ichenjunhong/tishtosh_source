package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.d */
public final class C34582d extends C34587e {

    /* renamed from: a */
    public int f89126a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.d$a */
    static final class C34583a implements C35457c {

        /* renamed from: a */
        final /* synthetic */ C34582d f89127a;

        C34583a(C34582d dVar) {
            this.f89127a = dVar;
        }

        /* renamed from: a */
        public final void mo72636a(final Context context, final C35456b bVar, int i) {
            final boolean z;
            String str;
            if (i == 1 || i == 2) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 3);
                ChatRoomActivity.m76454a(context, this.f89127a.bm_(), 3, bundle);
                C35190af.m79442a();
                C35190af.m79468a(this.f89127a.bm_(), "", "group", "click_message", "message", ChatRoomActivity.m76444a());
                return;
            }
            if (i == 0) {
                C52711k.m112236a((Object) bVar, "session");
                final C11190e eVar = new C11190e(bVar.bm_());
                C11180b a = eVar.mo20685a();
                if (a != null) {
                    z = a.isStickTop();
                } else {
                    z = false;
                }
                C26891a aVar = new C26891a(context);
                String[] strArr = new String[2];
                if (z) {
                    str = context.getString(R.string.bfa);
                } else {
                    str = context.getString(R.string.bo9);
                }
                strArr[0] = str;
                strArr[1] = context.getString(R.string.bge);
                aVar.mo54844a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case 0:
                                eVar.mo20694a(!z, (C11162b<C11180b>) new C11162b<C11180b>(this) {

                                    /* renamed from: a */
                                    final /* synthetic */ C345841 f89132a;

                                    {
                                        this.f89132a = r1;
                                    }

                                    /* renamed from: a */
                                    public final /* synthetic */ void mo20506a(Object obj) {
                                        C52711k.m112240b((C11180b) obj, "result");
                                    }

                                    /* renamed from: a */
                                    public final void mo20508a(C11202k kVar) {
                                        int i;
                                        C52711k.m112240b(kVar, "error");
                                        if (z) {
                                            i = R.string.bfb;
                                        } else {
                                            i = R.string.bo_;
                                        }
                                        C10691a.m21542b(context, i).mo19066a();
                                    }
                                });
                                break;
                            case 1:
                                C11182d.m22641a();
                                C35456b bVar = bVar;
                                C52711k.m112236a((Object) bVar, "session");
                                C11182d.m22643a(bVar.bm_(), (C11162b<String>) new C11162b<String>(this) {

                                    /* renamed from: a */
                                    final /* synthetic */ C345841 f89133a;

                                    {
                                        this.f89133a = r1;
                                    }

                                    /* renamed from: a */
                                    public final /* synthetic */ void mo20506a(Object obj) {
                                        C52711k.m112240b((String) obj, "result");
                                    }

                                    /* renamed from: a */
                                    public final void mo20508a(C11202k kVar) {
                                        Object obj;
                                        StringBuilder sb = new StringBuilder("GroupSession delete conversation failed: ");
                                        C35456b bVar = bVar;
                                        C52711k.m112236a((Object) bVar, "session");
                                        sb.append(bVar.bm_());
                                        sb.append(", ");
                                        String str = null;
                                        if (kVar != null) {
                                            obj = Integer.valueOf(kVar.f30203a);
                                        } else {
                                            obj = null;
                                        }
                                        sb.append(obj);
                                        sb.append(", ");
                                        if (kVar != null) {
                                            str = kVar.f30205c;
                                        }
                                        sb.append(str);
                                        C32458a.m75144a(sb.toString());
                                        C10691a.m21548c(C11010c.m22280a(), (int) R.string.bh3).mo19066a();
                                    }
                                });
                                C35190af.m79442a();
                                C35456b bVar2 = bVar;
                                C52711k.m112236a((Object) bVar2, "session");
                                C35190af.m79482b(bVar2.bm_());
                                break;
                        }
                        dialogInterface.dismiss();
                    }
                });
                aVar.mo54845b();
            }
        }
    }

    /* renamed from: b */
    public final int mo72634b() {
        return 20;
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C34583a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder mo72645e() {
        /*
            r12 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            com.bytedance.im.core.c.d r1 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r2 = r12.f91114e
            com.bytedance.im.core.c.b r1 = r1.mo20658a(r2)
            if (r1 != 0) goto L_0x0012
            return r0
        L_0x0012:
            boolean r2 = r12.mo73754h()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0022
            boolean r2 = r1.isMute()
            if (r2 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.String r5 = r12.f91117h
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01ce
            java.lang.String r6 = r12.f91117h
            java.lang.String r5 = "content"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r5)
            r7 = 10
            r8 = 32
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r5 = p2628d.p2650m.C52830p.m112399a(r6, r7, r8, r9, r10, r11)
            r12.f91117h = r5
            com.ss.android.ugc.aweme.im.sdk.group.d r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            java.lang.String r5 = r5.mo72234c(r1)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0056
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r5 = 0
            goto L_0x0057
        L_0x0056:
            r5 = 1
        L_0x0057:
            if (r5 != 0) goto L_0x0080
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2132542698(0x7f1c04ea, float:2.0738508E38)
            java.lang.String r6 = r6.getString(r7)
            r5.append(r6)
            r6 = 93
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
        L_0x0080:
            com.bytedance.im.core.c.p r5 = r1.getLastMessage()
            r6 = 2131822942(0x7f11095e, float:1.927867E38)
            r7 = 33
            if (r5 == 0) goto L_0x0093
            int r5 = r5.getMsgType()
            r8 = 1004(0x3ec, float:1.407E-42)
            if (r5 == r8) goto L_0x017f
        L_0x0093:
            java.util.List r5 = r1.getMentionMessages()
            if (r5 == 0) goto L_0x00c5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r5 = r5.iterator()
        L_0x00a6:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00c2
            java.lang.Object r9 = r5.next()
            r10 = r9
            com.bytedance.im.core.c.p r10 = (com.bytedance.p702im.core.p706c.C11207p) r10
            java.lang.String r11 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            boolean r10 = r10.isRecalled()
            if (r10 != 0) goto L_0x00a6
            r8.add(r9)
            goto L_0x00a6
        L_0x00c2:
            java.util.List r8 = (java.util.List) r8
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x00d3
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r5 = 0
            goto L_0x00d4
        L_0x00d3:
            r5 = 1
        L_0x00d4:
            if (r5 != 0) goto L_0x0123
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132545383(0x7f1c0f67, float:2.0743954E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            int r1 = r0.length()
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76329a()
            if (r2 == 0) goto L_0x010a
            int r2 = r12.f91119j
            if (r2 <= 0) goto L_0x010a
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76332d()
            r2.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r2, r4, r5, r7)
            goto L_0x0180
        L_0x010a:
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r6)
            r2.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r2, r4, r5, r7)
            goto L_0x0180
        L_0x0123:
            long r8 = r1.getUnreadCount()
            r10 = 1
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            com.bytedance.im.core.c.p r2 = r1.getLastMessage()
            if (r2 == 0) goto L_0x017f
            boolean r2 = r2.isSelf()
            if (r2 != 0) goto L_0x017f
            long r1 = r1.getUnreadCount()
            r8 = 999(0x3e7, double:4.936E-321)
            r5 = 2132545384(0x7f1c0f68, float:2.0743956E38)
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0164
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r8 = 999(0x3e7, float:1.4E-42)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r4] = r8
            java.lang.String r1 = r1.getString(r5, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            goto L_0x017f
        L_0x0164:
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r8 = r12.f91119j
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r4] = r8
            java.lang.String r1 = r1.getString(r5, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
        L_0x017f:
            r1 = 0
        L_0x0180:
            java.lang.String r2 = r12.f91117h
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76329a()
            if (r2 == 0) goto L_0x01ce
            int r2 = r12.f91119j
            if (r2 <= 0) goto L_0x01ce
            if (r1 <= 0) goto L_0x01ac
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r6)
            r2.<init>(r4)
            int r4 = r0.length()
            r0.setSpan(r2, r1, r4, r7)
            goto L_0x01bc
        L_0x01ac:
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            int r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76331c()
            r2.<init>(r4)
            int r4 = r0.length()
            r0.setSpan(r2, r1, r4, r7)
        L_0x01bc:
            boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImUnreadMessageEnhanceExperiment.m76330b()
            if (r2 == 0) goto L_0x01ce
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r3)
            int r3 = r0.length()
            r0.setSpan(r2, r1, r3, r7)
        L_0x01ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d.mo72645e():android.text.SpannableStringBuilder");
    }
}
