package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ao */
public final class C42076ao implements C42357g {

    /* renamed from: a */
    private final Aweme f106490a;

    /* renamed from: b */
    private final String f106491b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.d34;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.hja;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "stitch";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.d35;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (((java.lang.Boolean) r0.mo47782d()).booleanValue() == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49957f() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106490a
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47935p.m103710c(r0)
            com.ss.android.ugc.aweme.shortvideo.k.n r1 = com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43931n.f111232a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f106490a
            boolean r1 = r1.mo89486b(r2)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106490a
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 != 0) goto L_0x001c
            if (r1 == 0) goto L_0x0057
        L_0x001c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106490a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r1 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106490a
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0057
        L_0x0035:
            boolean r0 = com.p683ss.android.ugc.aweme.language.C35837h.m80977b()
            if (r0 == 0) goto L_0x0055
            com.ss.android.ugc.aweme.app.v r0 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            com.ss.android.ugc.aweme.app.bf r0 = r0.mo47890A()
            java.lang.String r1 = "CommonSharePrefCache.inst().canDuet()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r0 = 0
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            return r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42076ao.mo49957f():boolean");
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    public C42076ao(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106490a = aweme;
        this.f106491b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49950a(android.content.Context r8, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            com.ss.android.ugc.aweme.shortvideo.k.o r9 = new com.ss.android.ugc.aweme.shortvideo.k.o
            r9.<init>()
            boolean r0 = r7.mo49957f()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f106490a
            android.app.Activity r8 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r8)
            java.lang.String r3 = r7.f106491b
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r4)
            java.lang.String r4 = "from"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            r4 = r8
            android.content.Context r4 = (android.content.Context) r4
            r9.f111235b = r4
            r9.f111237d = r0
            r9.f111236c = r3
            com.ss.android.ugc.aweme.services.IExternalService r4 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            java.lang.String r5 = "ServiceManager.get().get…ernalService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.services.IExternalService r4 = (com.p683ss.android.ugc.aweme.services.IExternalService) r4
            com.ss.android.ugc.aweme.services.external.IConfigService r4 = r4.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r4 = r4.avsettingsConfig()
            boolean r4 = r4.needLoginBeforeRecord()
            if (r4 == 0) goto L_0x006a
            r9 = 2132549143(0x7f1c1e17, float:2.075158E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r0 = "click_stitch_button"
            com.ss.android.ugc.aweme.utils.ab r1 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r2 = "login_title"
            com.ss.android.ugc.aweme.utils.ab r9 = r1.mo94972a(r2, r9)
            android.os.Bundle r9 = r9.f120139a
            com.p683ss.android.ugc.aweme.login.C27965f.m66720a(r8, r3, r0, r9)
            goto L_0x0181
        L_0x006a:
            com.ss.android.ugc.aweme.services.IExternalService r8 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r8 = (com.p683ss.android.ugc.aweme.services.IExternalService) r8
            com.ss.android.ugc.aweme.services.video.IAVPublishService r8 = r8.publishService()
            boolean r8 = r8.isPublishable()
            if (r8 != 0) goto L_0x0086
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132541874(0x7f1c01b2, float:2.0736837E38)
            com.bytedance.common.utility.C9432q.m18689b(r8, r9, r2)
            goto L_0x0181
        L_0x0086:
            com.ss.android.ugc.aweme.profile.model.User r8 = r0.getAuthor()
            if (r8 == 0) goto L_0x0181
            boolean r8 = com.p683ss.android.ugc.aweme.video.C48016e.m103957g()
            if (r8 != 0) goto L_0x00a2
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132548602(0x7f1c1bfa, float:2.0750483E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
            r8.mo19066a()
        L_0x00a0:
            r1 = 0
            goto L_0x00bc
        L_0x00a2:
            long r3 = com.p683ss.android.ugc.aweme.video.C48016e.m103958h()
            r5 = 20971520(0x1400000, double:1.03613076E-316)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x00bc
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132548603(0x7f1c1bfb, float:2.0750485E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r1)
            r8.mo19066a()
            goto L_0x00a0
        L_0x00bc:
            if (r1 != 0) goto L_0x00c0
            goto L_0x0181
        L_0x00c0:
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r8 = com.p683ss.android.ugc.aweme.utils.C47810dh.m103451a(r8)
            if (r8 != 0) goto L_0x00da
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132546922(0x7f1c156a, float:2.0747076E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r9)
            r8.mo19066a()
            goto L_0x0181
        L_0x00da:
            com.ss.android.ugc.aweme.shortvideo.view.d r8 = r9.f111238e
            if (r8 != 0) goto L_0x00f9
            android.content.Context r8 = r9.f111235b
            android.content.Context r1 = r9.f111235b
            if (r1 == 0) goto L_0x00f2
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x00f2
            r3 = 2132544233(0x7f1c0ae9, float:2.0741622E38)
            java.lang.String r1 = r1.getString(r3)
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            com.ss.android.ugc.aweme.shortvideo.view.d r8 = com.p683ss.android.ugc.aweme.shortvideo.view.C45547d.m99208b(r8, r1)
            r9.f111238e = r8
        L_0x00f9:
            com.ss.android.ugc.aweme.shortvideo.view.d r8 = r9.f111238e
            if (r8 == 0) goto L_0x0100
            r8.setIndeterminate(r2)
        L_0x0100:
            com.ss.android.ugc.aweme.shortvideo.view.d r8 = r9.f111238e
            if (r8 == 0) goto L_0x0107
            r8.setProgress(r2)
        L_0x0107:
            com.ss.android.ugc.aweme.shortvideo.k.o$d r8 = new com.ss.android.ugc.aweme.shortvideo.k.o$d
            r8.<init>(r0)
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
            a.i r8 = p001a.C0013i.m16a(r8)
            com.ss.android.ugc.aweme.shortvideo.k.o$e r0 = new com.ss.android.ugc.aweme.shortvideo.k.o$e
            r0.<init>(r9)
            a.g r0 = (p001a.C0011g) r0
            java.util.concurrent.Executor r9 = p001a.C0013i.f25b
            r8.mo20a(r0, r9)
            return
        L_0x011f:
            com.ss.android.ugc.aweme.shortvideo.k.n r8 = com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43931n.f111232a
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f106490a
            java.lang.String r9 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r9)
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.getAuthor()
            if (r9 != 0) goto L_0x013d
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132545110(0x7f1c0e56, float:2.07434E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r8, r9, r2)
            r8.mo19066a()
            return
        L_0x013d:
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.getAuthor()
            java.lang.String r0 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            boolean r9 = r9.isSecret()
            if (r9 == 0) goto L_0x0161
            boolean r9 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r8)
            if (r9 != 0) goto L_0x0161
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132549506(0x7f1c1f82, float:2.0752317E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r8, r9, r2)
            r8.mo19066a()
            return
        L_0x0161:
            com.ss.android.ugc.aweme.profile.model.User r9 = r8.getAuthor()
            java.lang.String r0 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            int r9 = r9.getDuetSetting()
            if (r9 == r1) goto L_0x018e
            r8 = 3
            r0 = 2132549505(0x7f1c1f81, float:2.0752314E38)
            if (r9 == r8) goto L_0x0182
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r8, r0, r1)
            r8.mo19066a()
        L_0x0181:
            return
        L_0x0182:
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r8, r0, r1)
            r8.mo19066a()
            return
        L_0x018e:
            boolean r8 = com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43931n.m96463a(r8)
            if (r8 != 0) goto L_0x01a2
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132545108(0x7f1c0e54, float:2.0743396E38)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21549c(r8, r9, r2)
            r8.mo19066a()
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42076ao.mo49950a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
