package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.q */
public final class C23674q extends C23649b {

    /* renamed from: a */
    public final Activity f63117a;

    /* renamed from: b */
    public final String f63118b;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r3 == null) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49074a() {
        /*
            r8 = this;
            java.lang.String r0 = "show_anchor"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r8.f63118b
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_entry"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            r4 = 0
            if (r3 == 0) goto L_0x0049
            java.util.List r3 = r3.getAnchors()
            if (r3 == 0) goto L_0x0049
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0021:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r6
            int r6 = r6.getType()
            com.ss.android.ugc.aweme.commercialize.anchor.a r7 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.INDIA_MOVIE
            int r7 = r7.getTYPE()
            if (r6 != r7) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            if (r6 == 0) goto L_0x0021
            goto L_0x0041
        L_0x0040:
            r5 = r4
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            if (r5 == 0) goto L_0x0049
            java.lang.String r4 = r5.getKeyword()
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x005b
        L_0x0059:
            java.lang.String r3 = ""
        L_0x005b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_type"
            java.lang.String r3 = "movie"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23674q.mo49074a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r3 == null) goto L_0x0073;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49077b() {
        /*
            r8 = this;
            java.lang.String r0 = "enter_anchor_detail"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r8.f63118b
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_entry"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            r4 = 0
            if (r3 == 0) goto L_0x0049
            java.util.List r3 = r3.getAnchors()
            if (r3 == 0) goto L_0x0049
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0021:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r6
            int r6 = r6.getType()
            com.ss.android.ugc.aweme.commercialize.anchor.a r7 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.INDIA_MOVIE
            int r7 = r7.getTYPE()
            if (r6 != r7) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            if (r6 == 0) goto L_0x0021
            goto L_0x0041
        L_0x0040:
            r5 = r4
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            if (r5 == 0) goto L_0x0049
            java.lang.String r4 = r5.getKeyword()
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x005b
        L_0x0059:
            java.lang.String r3 = ""
        L_0x005b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_type"
            java.lang.String r3 = "movie"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f63071q
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23674q.mo49077b():void");
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        Object obj;
        boolean z;
        super.mo49075a(view);
        Aweme aweme = this.f63071q;
        if (aweme != null) {
            List anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator it = anchors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AnchorCommonStruct) obj).getType() == C25600a.INDIA_MOVIE.getTYPE()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
                if (anchorCommonStruct != null) {
                    C36983a b = C36983a.m83185b();
                    C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
                    b.mo76294a().openMiniApp((Context) this.f63117a, anchorCommonStruct.getUrl(), new C36961a().mo76222b(this.f63118b).mo76221a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        String str;
        Object obj;
        boolean z;
        super.mo49076a(aweme, jSONObject);
        if (aweme != null) {
            List anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator it = anchors.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AnchorCommonStruct) obj).getType() == C25600a.INDIA_MOVIE.getTYPE()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
                if (anchorCommonStruct != null) {
                    this.f63058d.setText(anchorCommonStruct.getKeyword());
                    UrlModel icon = anchorCommonStruct.getIcon();
                    if (icon != null) {
                        List urlList = icon.getUrlList();
                        if (urlList != null) {
                            str = (String) urlList.get(0);
                        }
                        if (str == null) {
                            str = "";
                        }
                        C12208t a = C12203q.m24646a(str);
                        a.f32228F = this.f63057c;
                        a.mo23121a();
                    } else {
                        this.f63057c.setImageResource(R.drawable.d0d);
                    }
                }
            }
        }
    }

    public C23674q(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f63117a = activity;
        this.f63118b = str;
    }
}
