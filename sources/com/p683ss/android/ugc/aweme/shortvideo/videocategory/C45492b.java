package com.p683ss.android.ugc.aweme.shortvideo.videocategory;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PublishSettingItem;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45424bh.C45425a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.b */
public final class C45492b implements C45488a {

    /* renamed from: d */
    public static final C45494a f114948d = new C45494a(null);

    /* renamed from: a */
    public VideoCategoryParam f114949a;

    /* renamed from: b */
    public final Activity f114950b;

    /* renamed from: c */
    public final AVETParameter f114951c;

    /* renamed from: e */
    private final PublishSettingItem f114952e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.b$a */
    public static final class C45494a {
        private C45494a() {
        }

        public /* synthetic */ C45494a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m99122a(VideoPublishEditModel videoPublishEditModel) {
            C52711k.m112240b(videoPublishEditModel, "model");
            return C45425a.m98996a(videoPublishEditModel);
        }
    }

    /* renamed from: a */
    public static final boolean m99119a(VideoPublishEditModel videoPublishEditModel) {
        return C45494a.m99122a(videoPublishEditModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 == null) goto L_0x000c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91765a(com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam r3) {
        /*
            r2 = this;
            r2.f114949a = r3
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r0 = r2.f114952e
            if (r3 == 0) goto L_0x000c
            java.lang.String r3 = r3.getCategoryName()
            if (r3 != 0) goto L_0x0015
        L_0x000c:
            android.app.Activity r3 = r2.f114950b
            r1 = 2132542872(0x7f1c0598, float:2.0738861E38)
            java.lang.String r3 = r3.getString(r1)
        L_0x0015:
            r0.setSubtitle(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.C45492b.mo91765a(com.ss.android.ugc.aweme.draft.model.VideoCategoryParam):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00c8, code lost:
        if (r6 == null) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C45492b(android.app.Activity r5, com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam r6, com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter r7, android.view.View r8) {
        /*
            r4 = this;
            java.lang.String r0 = "host"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "mobParam"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r4.<init>()
            r4.f114950b = r5
            r4.f114951c = r7
            r5 = 2132024474(0x7f141c9a, float:1.9687425E38)
            android.view.View r5 = r8.findViewById(r5)
            java.lang.String r7 = "rootView.findViewById(R.id.video_category_item)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PublishSettingItem) r5
            r4.f114952e = r5
            r4.f114949a = r6
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2132542901(0x7f1c05b5, float:2.073892E38)
            java.lang.String r5 = r5.getString(r6)
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2132542902(0x7f1c05b6, float:2.0738922E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r0 = "（"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "）"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.text.SpannableString r7 = new android.text.SpannableString
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.<init>(r0)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            android.content.Context r1 = r8.getContext()
            r2 = 2132607986(0x7f1d03f2, float:2.0870928E38)
            r0.<init>(r1, r2)
            int r1 = r5.length()
            r2 = 17
            r3 = 0
            r7.setSpan(r0, r3, r1, r2)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            android.content.Context r8 = r8.getContext()
            r1 = 2132607985(0x7f1d03f1, float:2.0870926E38)
            r0.<init>(r8, r1)
            int r5 = r5.length()
            int r6 = r6.length()
            r7.setSpan(r0, r5, r6, r2)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            android.app.Activity r6 = r4.f114950b
            android.content.Context r6 = (android.content.Context) r6
            android.graphics.drawable.Drawable r6 = com.bytedance.ies.dmt.p664ui.common.C10678c.m21505e(r6)
            r5.setBackground(r6)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            r6 = 2131951843(0x7f1300e3, float:1.9540112E38)
            r5.setDrawableLeft(r6)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            r5.setTitleSpannable(r7)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r6 = r4.f114949a
            if (r6 == 0) goto L_0x00ca
            java.lang.String r6 = r6.getCategoryName()
            if (r6 != 0) goto L_0x00d8
        L_0x00ca:
            android.app.Activity r6 = r4.f114950b
            r7 = 2132542872(0x7f1c0598, float:2.0738861E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "host.getString(R.string.classify_choose)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
        L_0x00d8:
            r5.setSubtitle(r6)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            r5.setVisibility(r3)
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r5 = r4.f114952e
            com.ss.android.ugc.aweme.shortvideo.videocategory.b$1 r6 = new com.ss.android.ugc.aweme.shortvideo.videocategory.b$1
            r7 = 600(0x258, float:8.41E-43)
            r6.<init>(r4, r7)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.C45492b.<init>(android.app.Activity, com.ss.android.ugc.aweme.draft.model.VideoCategoryParam, com.ss.android.ugc.aweme.shortvideo.model.AVETParameter, android.view.View):void");
    }
}
