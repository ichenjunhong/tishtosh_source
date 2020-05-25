package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cp */
public class C33823cp extends C33805c<StoryPictureContent> {

    /* renamed from: u */
    private final int f87763u = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.in);

    /* renamed from: v */
    private RemoteImageView f87764v;

    /* renamed from: c */
    public final View mo71804c() {
        return this.f87764v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87764v = (RemoteImageView) this.itemView.findViewById(R.id.by0);
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87708j);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
    }

    public C33823cp(View view, int i) {
        super(view, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0071, code lost:
        if (com.bytedance.common.utility.p524d.C9396a.m18583b(r4) != false) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71780a(com.bytedance.p702im.core.p706c.C11207p r4, com.bytedance.p702im.core.p706c.C11207p r5, com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent r6, int r7) {
        /*
            r3 = this;
            super.mo71780a(r4, r5, r6, r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f87764v
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r7 = r3.f87709k
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r7 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent) r7
            int r7 = r7.getWidth()
            float r7 = (float) r7
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r0 = r3.f87709k
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent) r0
            int r0 = r0.getHeight()
            float r0 = (float) r0
            java.lang.Integer[] r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35196al.m79551a(r5, r7, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r3.f87764v
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            r0 = 0
            r1 = r5[r0]
            int r1 = r1.intValue()
            r7.width = r1
            r1 = 1
            r5 = r5[r1]
            int r5 = r5.intValue()
            r7.height = r5
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f87764v
            r5.setLayoutParams(r7)
            int r5 = r3.f87763u
            float r5 = (float) r5
            int r7 = r3.f87763u
            float r7 = (float) r7
            int r1 = r3.f87763u
            float r1 = (float) r1
            int r2 = r3.f87763u
            float r2 = (float) r2
            com.facebook.drawee.f.e r5 = com.facebook.drawee.p940f.C13837e.m28114b(r5, r7, r1, r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r3.f87764v
            com.facebook.drawee.h.b r7 = r7.getHierarchy()
            com.facebook.drawee.f.a r7 = (com.facebook.drawee.p940f.C13833a) r7
            r7.mo25899a(r5)
            java.lang.String r5 = r6.getPicturePath()
            java.util.List r4 = r4.getAttachments()
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r7 != 0) goto L_0x0074
            java.lang.Object r4 = r4.get(r0)
            com.bytedance.im.core.c.a r4 = (com.bytedance.p702im.core.p706c.C11178a) r4
            java.lang.String r4 = r4.getLocalPath()
            boolean r7 = com.bytedance.common.utility.p524d.C9396a.m18583b(r4)
            if (r7 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r3.f87764v
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r6.getUrl()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33455c.m76688a(r7, r4)
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r4)
            int r4 = r6.getType()
            com.bytedance.im.core.c.p r5 = r3.f87712n
            boolean r5 = r5.isSelf()
            r6 = 50331648(0x3000000, float:3.761582E-37)
            if (r5 != 0) goto L_0x00a1
            r5 = 2700(0xa8c, float:3.784E-42)
            if (r4 != r5) goto L_0x0095
            goto L_0x00a1
        L_0x0095:
            android.view.View r4 = r3.f87708j
            r5 = 27
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setTag(r6, r5)
            goto L_0x00ac
        L_0x00a1:
            android.view.View r4 = r3.f87708j
            r5 = 26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setTag(r6, r5)
        L_0x00ac:
            android.view.View r4 = r3.f87708j
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            com.bytedance.im.core.c.p r6 = r3.f87712n
            r4.setTag(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33823cp.mo71780a(com.bytedance.im.core.c.p, com.bytedance.im.core.c.p, com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent, int):void");
    }
}
