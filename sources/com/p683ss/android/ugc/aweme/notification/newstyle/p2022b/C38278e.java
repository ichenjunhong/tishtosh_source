package com.p683ss.android.ugc.aweme.notification.newstyle.p2022b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38087b;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38135o;
import com.p683ss.android.ugc.aweme.notification.util.C38432d;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.e */
public final class C38278e extends C38135o implements OnClickListener {

    /* renamed from: d */
    private final View f97418d;

    /* renamed from: e */
    private final AvatarImageView f97419e;

    /* renamed from: f */
    private final TextView f97420f;

    /* renamed from: g */
    private final RemoteImageView f97421g;

    /* renamed from: h */
    private BaseNotice f97422h;

    /* renamed from: i */
    private C38087b f97423i;

    /* renamed from: j */
    private Context f97424j;

    /* renamed from: c */
    public final int mo78097c() {
        return R.id.bu1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m85524d() {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "notice_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r1 = r7.f97422h
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r1.getNid()
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            r6.put(r0, r1)
            java.lang.String r0 = "aid"
            int r1 = com.p683ss.android.ugc.aweme.notice.api.C38042c.C38043a.f96819a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6.put(r0, r1)
            java.lang.String r0 = "channel"
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r1
            java.lang.String r1 = r1.getChannel()
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = com.p683ss.android.ugc.aweme.utils.C47862et.m103534a()
            r1 = r0
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r1 = (com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r1
            android.content.Context r2 = r7.f97424j
            com.ss.android.ugc.aweme.notice.repo.list.bean.b r0 = r7.f97423i
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r0.f96892d
        L_0x0042:
            r3 = r0
            goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0042
        L_0x0046:
            android.content.Context r0 = r7.f97424j
            r4 = 2132545534(0x7f1c0ffe, float:2.074426E38)
            java.lang.String r0 = r0.getString(r4)
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            r4 = r0
            r5 = 1
            boolean r0 = r1.openAdWebUrl(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38278e.m85524d():boolean");
    }

    public C38278e(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97418d = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97419e = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f97420f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.eb_);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.ic_cover)");
        this.f97421g = (RemoteImageView) findViewById4;
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f97424j = context;
        C38432d.m85745a(this.f97418d);
        C38446k.m85764a(this.f97421g);
        C38446k.m85764a(this.f97419e);
        OnClickListener onClickListener = this;
        this.f97421g.setOnClickListener(onClickListener);
        this.f97418d.setOnClickListener(onClickListener);
        this.f97419e.setOnClickListener(onClickListener);
        this.f97004b = C47842ed.m103485a(this.f97424j);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C38279f.m85527a(this.f97424j)) {
            C10691a.m21542b(this.f97424j, (int) R.string.cg1).mo19066a();
        } else if (view != null) {
            int id = view.getId();
            String str = null;
            if (id == R.id.bu1 || id == R.id.bt7) {
                if (!m85524d()) {
                    C41302w a = C41302w.m91042a();
                    C38087b bVar = this.f97423i;
                    if (bVar != null) {
                        str = bVar.f96891c;
                    }
                    a.mo83861a(str);
                }
            } else if (id == R.id.eb_) {
                C41302w a2 = C41302w.m91042a();
                C38087b bVar2 = this.f97423i;
                if (bVar2 != null) {
                    str = bVar2.f96891c;
                }
                if (!a2.mo83861a(str)) {
                    m85524d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78252a(BaseNotice baseNotice, boolean z) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        C52711k.m112240b(baseNotice, "notice");
        if (baseNotice.getAdHelperNotice() != null) {
            this.f97422h = baseNotice;
            this.f97423i = baseNotice.getAdHelperNotice();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f97004b) {
                spannableStringBuilder.append(8296);
            }
            C38087b bVar = this.f97423i;
            UrlModel urlModel = null;
            if (bVar != null) {
                charSequence = bVar.f96890b;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C38087b bVar2 = this.f97423i;
                if (bVar2 != null) {
                    charSequence4 = bVar2.f96890b;
                } else {
                    charSequence4 = null;
                }
                spannableStringBuilder.append(charSequence4);
                C38087b bVar3 = this.f97423i;
                if (bVar3 != null) {
                    charSequence5 = bVar3.f96889a;
                } else {
                    charSequence5 = null;
                }
                if (!TextUtils.isEmpty(charSequence5)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            C38087b bVar4 = this.f97423i;
            if (bVar4 != null) {
                charSequence2 = bVar4.f96889a;
            } else {
                charSequence2 = null;
            }
            if (!TextUtils.isEmpty(charSequence2)) {
                C38087b bVar5 = this.f97423i;
                if (bVar5 != null) {
                    charSequence3 = bVar5.f96889a;
                } else {
                    charSequence3 = null;
                }
                spannableStringBuilder.append(charSequence3);
            }
            if (this.f97004b) {
                spannableStringBuilder.append(8297);
            }
            this.f97419e.setImageURI(C13731f.m27775a((int) R.drawable.clp));
            mo78107a(spannableStringBuilder, baseNotice);
            this.f97420f.setText(spannableStringBuilder);
            RemoteImageView remoteImageView = this.f97421g;
            C38087b bVar6 = this.f97423i;
            if (bVar6 != null) {
                urlModel = bVar6.f96894f;
            }
            C23515d.m57669a(remoteImageView, urlModel);
        }
    }
}
