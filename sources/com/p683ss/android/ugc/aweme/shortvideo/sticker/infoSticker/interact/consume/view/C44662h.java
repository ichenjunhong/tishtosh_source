package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25628h;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44631d;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45881a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h */
public final class C44662h extends C44643a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f112981a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44662h.class), "view", "getView()Landroid/widget/FrameLayout;"))};

    /* renamed from: b */
    private final C44631d f112982b;

    /* renamed from: k */
    private final C52668f f112983k;

    /* renamed from: l */
    private C25628h f112984l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$a */
    static final class C44663a extends C52712l implements C52671b<WikipediaInfo, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44662h f112985a;

        C44663a(C44662h hVar) {
            this.f112985a = hVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            if (r2 == null) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r2 == null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
            if (r3 == null) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.feed.model.WikipediaInfo r5 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r5
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "enter_wiki_detail"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "enter_from"
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = r4.f112985a
                com.ss.android.ugc.aweme.sticker.m r3 = r3.f112939j
                if (r3 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
                if (r3 == 0) goto L_0x001d
                java.lang.String r3 = r3.f116212b
                if (r3 != 0) goto L_0x001f
            L_0x001d:
                java.lang.String r3 = ""
            L_0x001f:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "language"
                java.lang.String r3 = r5.getLang()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "wiki_entry"
                java.lang.String r5 = r5.getKeyword()
                com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = r4.f112985a
                com.ss.android.ugc.aweme.sticker.m r2 = r2.f112939j
                if (r2 == 0) goto L_0x0047
                com.ss.android.ugc.aweme.sticker.l r2 = r2.f116231p
                if (r2 == 0) goto L_0x0047
                java.lang.String r2 = r2.f116213c
                if (r2 != 0) goto L_0x0049
            L_0x0047:
                java.lang.String r2 = ""
            L_0x0049:
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = r4.f112985a
                com.ss.android.ugc.aweme.sticker.m r2 = r2.f112939j
                if (r2 == 0) goto L_0x005d
                com.ss.android.ugc.aweme.sticker.l r2 = r2.f116231p
                if (r2 == 0) goto L_0x005d
                java.lang.String r2 = r2.f116214d
                if (r2 != 0) goto L_0x005f
            L_0x005d:
                java.lang.String r2 = ""
            L_0x005f:
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h.C44663a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$b */
    static final class C44664b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C44662h f112986a;

        C44664b(C44662h hVar) {
            this.f112986a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46063m mVar = this.f112986a.f112939j;
            if (mVar != null) {
                C45881a aVar = mVar.f116230o;
                if (aVar != null) {
                    aVar.mo60269a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$c */
    static final class C44665c extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ Context f112987a;

        C44665c(Context context) {
            this.f112987a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FrameLayout frameLayout = new FrameLayout(this.f112987a);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    /* renamed from: a */
    public final int mo90484a() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90489b() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r0.<init>()
            com.ss.android.ugc.aweme.sticker.m r1 = r6.f112939j
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.f116225j
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            java.lang.String r1 = ""
        L_0x000f:
            r0.setImprId(r1)
            java.lang.String r1 = "sticker_click"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r4 = r6.f112939j
            r5 = 0
            if (r4 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = r4.f116212b
            goto L_0x0027
        L_0x0026:
            r4 = r5
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r6.f112939j
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = r4.f116214d
            goto L_0x0039
        L_0x0038:
            r4 = r5
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r6.f112939j
            if (r4 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x0049
            java.lang.String r5 = r4.f116213c
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r5)
            java.lang.String r3 = "sticker_type"
            java.lang.String r4 = "wiki"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = r4.mo60160a(r0)
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h.mo90489b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo90490c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112937h);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f112937h);
        dmtTextView.setTextColor(this.f112937h.getResources().getColor(R.color.auk));
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f112937h.getString(R.string.gil));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f112937h);
        autoRTLImageView.setImageResource(R.drawable.b6i);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r5 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r5 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r5 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        if (r6 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012a, code lost:
        if (r4 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        if (r0 == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90491d() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.d r0 = r7.f112982b
            com.ss.android.ugc.aweme.sticker.data.TextStruct r1 = r0.mo90584a()
            if (r1 == 0) goto L_0x015e
            com.ss.android.ugc.aweme.sticker.data.TextStruct r1 = r0.mo90584a()
            java.util.List r1 = r1.getAnchors()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0018
            goto L_0x015e
        L_0x0018:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            com.ss.android.ugc.aweme.sticker.m r2 = r0.f112904f
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = r2.f116225j
            if (r2 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r2 = ""
        L_0x0027:
            r1.setImprId(r2)
            java.lang.String r2 = "sticker_toast_click"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x003e
            java.lang.String r5 = r5.f116214d
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            java.lang.String r5 = ""
        L_0x0040:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0052
            java.lang.String r5 = r5.f116213c
            if (r5 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r5 = ""
        L_0x0054:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r5 = r0.f112904f
            if (r5 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.sticker.l r5 = r5.f116231p
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = r5.f116212b
            if (r5 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String r5 = ""
        L_0x0068:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "sticker_type"
            java.lang.String r5 = "wiki"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r1 = r5.mo60160a(r1)
            com.ss.android.ugc.aweme.app.f.d r1 = r3.mo47829a(r4, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r1)
            com.ss.android.ugc.aweme.sticker.data.TextStruct r1 = r0.mo90584a()
            java.util.List r1 = r1.getAnchors()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p2628d.p2629a.C52575l.m112104a(r1, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r3 = (com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo) r3
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r4 = new com.ss.android.ugc.aweme.feed.model.WikipediaInfo
            r4.<init>()
            java.lang.String r5 = r3.getKeyword()
            r4.setKeyword(r5)
            java.lang.String r3 = r3.getLanguage()
            r4.setLang(r3)
            r2.add(r4)
            goto L_0x00a2
        L_0x00c5:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = p2628d.p2629a.C52575l.m112143g(r2)
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L_0x014c
            android.content.Context r2 = r0.f112901c
            r3 = 0
            java.lang.Object r4 = r1.get(r3)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r4 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r4
            java.util.Map r5 = r0.mo90585b()
            com.p683ss.android.ugc.aweme.commercialize.anchor.C25625f.m62154a(r2, r4, r5)
            java.lang.String r2 = "enter_wiki_detail"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r6 = r0.f112904f
            if (r6 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.sticker.l r6 = r6.f116231p
            if (r6 == 0) goto L_0x00f8
            java.lang.String r6 = r6.f116212b
            if (r6 != 0) goto L_0x00fa
        L_0x00f8:
            java.lang.String r6 = ""
        L_0x00fa:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "language"
            java.lang.Object r6 = r1.get(r3)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r6 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r6
            java.lang.String r6 = r6.getLang()
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "wiki_entry"
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r1 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r1
            java.lang.String r1 = r1.getKeyword()
            com.ss.android.ugc.aweme.app.f.d r1 = r4.mo47829a(r5, r1)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r0.f112904f
            if (r4 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = r4.f116213c
            if (r4 != 0) goto L_0x012e
        L_0x012c:
            java.lang.String r4 = ""
        L_0x012e:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r0 = r0.f112904f
            if (r0 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.sticker.l r0 = r0.f116231p
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r0.f116214d
            if (r0 != 0) goto L_0x0142
        L_0x0140:
            java.lang.String r0 = ""
        L_0x0142:
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
            return
        L_0x014c:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r2 = r0.f112902d
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h
            if (r2 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r2 = r0.f112902d
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h) r2
            java.util.Map r0 = r0.mo90585b()
            r2.mo90623a(r1, r0)
        L_0x015d:
            return
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h.mo90491d():void");
    }

    /* renamed from: a */
    public final View mo90485a(int i) {
        return (FrameLayout) this.f112983k.getValue();
    }

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        super.mo90486a(mVar);
        this.f112982b.mo90486a(mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        if (r1 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r4 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r4 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (r3 == null) goto L_0x00c0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90623a(java.util.List<com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo> r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "infos"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            com.ss.android.ugc.aweme.commercialize.anchor.h r0 = r7.f112984l
            if (r0 != 0) goto L_0x002a
            com.ss.android.ugc.aweme.commercialize.anchor.h r0 = new com.ss.android.ugc.aweme.commercialize.anchor.h
            android.content.Context r2 = r7.f112937h
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$a
            r1.<init>(r7)
            r5 = r1
            d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$b
            r1.<init>(r7)
            r6 = r1
            d.f.a.a r6 = (p2628d.p2639f.p2640a.C52670a) r6
            r1 = r0
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f112984l = r0
        L_0x002a:
            com.ss.android.ugc.aweme.commercialize.anchor.h r9 = r7.f112984l
            if (r9 == 0) goto L_0x0031
            r9.show()
        L_0x0031:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = ""
            r9.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0045:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r1 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r1
            java.lang.String r2 = "wiki,"
            r9.append(r2)
            java.lang.String r1 = r1.getKeyword()
            java.lang.String r2 = ","
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r2)
            r0.append(r1)
            goto L_0x0045
        L_0x0064:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r8 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r8.<init>()
            com.ss.android.ugc.aweme.sticker.m r1 = r7.f112939j
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = r1.f116225j
            if (r1 != 0) goto L_0x0073
        L_0x0071:
            java.lang.String r1 = ""
        L_0x0073:
            r8.setImprId(r1)
            java.lang.String r1 = "anchor_multiple_show"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r4 = r7.f112939j
            if (r4 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x008a
            java.lang.String r4 = r4.f116212b
            if (r4 != 0) goto L_0x008c
        L_0x008a:
            java.lang.String r4 = ""
        L_0x008c:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r4 = r7.f112939j
            if (r4 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.sticker.l r4 = r4.f116231p
            if (r4 == 0) goto L_0x009e
            java.lang.String r4 = r4.f116214d
            if (r4 != 0) goto L_0x00a0
        L_0x009e:
            java.lang.String r4 = ""
        L_0x00a0:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r8 = r4.mo60160a(r8)
            com.ss.android.ugc.aweme.app.f.d r8 = r2.mo47829a(r3, r8)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r7.f112939j
            if (r3 == 0) goto L_0x00c0
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r3.f116213c
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            java.lang.String r3 = ""
        L_0x00c2:
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r3)
            java.lang.String r2 = "sticker_type"
            java.lang.String r3 = "wiki"
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_types"
            java.lang.String r9 = r9.toString()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r9)
            java.lang.String r9 = "anchor_names"
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r9, r0)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44662h.mo90623a(java.util.List, java.util.Map):void");
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return this.f112982b.mo90487a(j, i, f, f2);
    }

    public C44662h(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(i, context, view, interactStickerStruct, mVar);
        this.f112982b = new C44631d(context, this, interactStickerStruct, mVar);
        this.f112983k = C52732g.m112285a(new C44665c(context));
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return this.f112982b.mo90488a(j, i, f, f2, eVar);
    }
}
