package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34044o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.b */
public class C34135b extends C33298c<C33368b> {

    /* renamed from: b */
    protected TextView f88225b;

    /* renamed from: c */
    String f88226c;

    /* renamed from: d */
    public C33367a f88227d;

    /* renamed from: e */
    private RemoteImageView f88228e;

    /* renamed from: f */
    private C35225a f88229f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.b$a */
    static final class C34136a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34135b f88230a;

        C34136a(C34135b bVar) {
            this.f88230a = bVar;
        }

        public final void onClick(View view) {
            IMUser iMUser;
            ClickInstrumentation.onClick(view);
            C33367a aVar = this.f88230a.f88227d;
            IMUser iMUser2 = null;
            if (aVar != null) {
                iMUser = aVar.getUser();
            } else {
                iMUser = null;
            }
            if (iMUser != null) {
                View view2 = this.f88230a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                Context context = view2.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                C33367a aVar2 = this.f88230a.f88227d;
                if (aVar2 != null) {
                    iMUser2 = aVar2.getUser();
                }
                if (iMUser2 == null) {
                    C52711k.m112234a();
                }
                C34008d.m77746a(context, (IMContact) iMUser2, "group_setting");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final TextView mo72080e() {
        TextView textView = this.f88225b;
        if (textView == null) {
            C52711k.m112237a("mNameView");
        }
        return textView;
    }

    /* renamed from: b */
    public void mo70628b() {
        super.mo70628b();
        View findViewById = this.itemView.findViewById(R.id.b2g);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_member_avatar)");
        this.f88228e = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dbu);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_member_name)");
        this.f88225b = (TextView) findViewById2;
    }

    /* renamed from: c */
    public final void mo70629c() {
        C35225a l = C35225a.m79617l();
        C52711k.m112236a((Object) l, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f88229f = l;
        C35225a aVar = this.f88229f;
        if (aVar == null) {
            C52711k.m112237a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        RemoteImageView remoteImageView = this.f88228e;
        if (remoteImageView == null) {
            C52711k.m112237a("mAvatarView");
        }
        viewArr[0] = remoteImageView;
        aVar.mo73331a(viewArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77954a(com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.f88228e
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mAvatarView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            r1 = 0
            if (r4 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r4.getUser()
            if (r2 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getDisplayAvatar()
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
            android.widget.TextView r0 = r3.f88225b
            if (r0 != 0) goto L_0x0024
            java.lang.String r2 = "mNameView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0024:
            if (r4 == 0) goto L_0x002a
            java.lang.String r1 = r4.getMemberDisplayName()
        L_0x002a:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a.C34135b.m77954a(com.ss.android.ugc.aweme.im.sdk.chat.b.a.a):void");
    }

    @C53771m
    public final void onUserUpdate(C34044o oVar) {
        C52711k.m112240b(oVar, "event");
        if (TextUtils.equals(this.f88226c, oVar.f88009a)) {
            IMUser b = C34010e.m77748a().mo71964b(oVar.f88009a);
            if (b != null) {
                C33367a aVar = this.f88227d;
                if (aVar != null) {
                    IMUser user = aVar.getUser();
                    if (user != null) {
                        user.copy(b);
                    }
                }
                m77954a(this.f88227d);
            }
        }
    }

    public C34135b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup, i);
    }

    /* renamed from: a */
    public void mo70627a(C33368b bVar, int i) {
        Long l;
        super.mo70627a(bVar, i);
        if (bVar instanceof C33367a) {
            C33367a aVar = (C33367a) bVar;
            this.f88227d = aVar;
            RemoteImageView remoteImageView = this.f88228e;
            if (remoteImageView == null) {
                C52711k.m112237a("mAvatarView");
            }
            C23515d.m57668a(remoteImageView, 2131953301);
            if (aVar.getUser() == null) {
                C11206o member = aVar.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                IMUser a = C34010e.m77748a().mo71956a(valueOf, false);
                if (a != null) {
                    aVar.setUser(a);
                } else {
                    this.f88226c = valueOf;
                }
            }
            m77954a(aVar);
            RemoteImageView remoteImageView2 = this.f88228e;
            if (remoteImageView2 == null) {
                C52711k.m112237a("mAvatarView");
            }
            remoteImageView2.setOnClickListener(new C34136a(this));
        }
    }
}
