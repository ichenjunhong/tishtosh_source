package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag */
public final class C42061ag implements C42357g {

    /* renamed from: a */
    private final Challenge f106462a;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ao3;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d75;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "report_hashtag";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    public C42061ag(Challenge challenge) {
        this.f106462a = challenge;
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49950a(android.content.Context r12, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r13) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            android.net.Uri$Builder r13 = new android.net.Uri$Builder
            r13.<init>()
            java.lang.String r0 = "report_type"
            java.lang.String r1 = "hashtag"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r1)
            java.lang.String r0 = "object_id"
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r11.f106462a
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r1.getCid()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r1)
            java.lang.String r0 = "owner_id"
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r11.f106462a
            if (r1 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = r1.getUid()
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r0, r1)
            com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r0 = com.p683ss.android.ugc.aweme.compliance.api.C27013a.m65227a()
            android.app.Activity r12 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r12)
            r0.report(r12, r13)
            com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r3 = com.p683ss.android.ugc.aweme.compliance.api.C27013a.m65227a()
            java.lang.String r4 = "challenge_detail"
            java.lang.String r5 = "hashtag"
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.discover.model.Challenge r12 = r11.f106462a
            if (r12 == 0) goto L_0x005d
            java.lang.String r12 = r12.getCid()
            r7 = r12
            goto L_0x005e
        L_0x005d:
            r7 = r2
        L_0x005e:
            com.ss.android.ugc.aweme.discover.model.Challenge r12 = r11.f106462a
            if (r12 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.profile.model.User r12 = r12.getAuthor()
            if (r12 == 0) goto L_0x006c
            java.lang.String r2 = r12.getUid()
        L_0x006c:
            r8 = r2
            java.lang.String r9 = ""
            java.lang.String r10 = "click_share_button"
            r3.sendReportEvent(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42061ag.mo49950a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }
}
