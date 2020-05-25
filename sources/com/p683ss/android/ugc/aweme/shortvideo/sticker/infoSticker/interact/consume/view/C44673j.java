package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44636f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.C44668b;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j */
public final class C44673j extends C44643a {

    /* renamed from: l */
    public static final C44674a f113002l = new C44674a(null);

    /* renamed from: a */
    public C44678k f113003a;

    /* renamed from: b */
    public final C44636f f113004b;

    /* renamed from: k */
    public final C44627g f113005k;

    /* renamed from: m */
    private C44666i f113006m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$a */
    public static final class C44674a {
        private C44674a() {
        }

        public /* synthetic */ C44674a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$b */
    static final class C44675b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44673j f113007a;

        C44675b(C44673j jVar) {
            this.f113007a = jVar;
        }

        public final void run() {
            float f;
            C44636f fVar = this.f113007a.f113004b;
            C44678k kVar = this.f113007a.f113003a;
            if (kVar == null) {
                C52711k.m112234a();
            }
            View voteView = kVar.getVoteView();
            List a = C44588c.m97540a(this.f113007a.f112934e);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f = scale.floatValue();
                        fVar.mo90590a(voteView, f);
                    }
                }
            }
            f = 1.0f;
            fVar.mo90590a(voteView, f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$c */
    public static final class C44676c implements C44668b {

        /* renamed from: a */
        final /* synthetic */ C44673j f113008a;

        C44676c(C44673j jVar) {
            this.f113008a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$d */
    static final class C44677d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44673j f113009a;

        /* renamed from: b */
        final /* synthetic */ C44678k f113010b;

        /* renamed from: c */
        final /* synthetic */ C46063m f113011c;

        C44677d(C44673j jVar, C44678k kVar, C46063m mVar) {
            this.f113009a = jVar;
            this.f113010b = kVar;
            this.f113011c = mVar;
        }

        public final void run() {
            VoteStruct voteStruct;
            float f;
            C44678k kVar = this.f113010b;
            InteractStickerStruct interactStickerStruct = this.f113009a.f112934e;
            if (interactStickerStruct != null) {
                voteStruct = interactStickerStruct.getVoteStruct();
            } else {
                voteStruct = null;
            }
            boolean m = C47915gg.m103664m(this.f113011c.f116218c);
            String str = this.f113011c.f116219d;
            if (str == null) {
                str = "";
            }
            kVar.mo90632a(voteStruct, m, str, this.f113011c.f116229n, this.f113009a.mo90578g());
            C44636f fVar = this.f113009a.f113004b;
            View voteView = this.f113010b.getVoteView();
            List a = C44588c.m97540a(this.f113009a.f112934e);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f = scale.floatValue();
                        fVar.mo90590a(voteView, f);
                        this.f113010b.postInvalidate();
                    }
                }
            }
            f = 1.0f;
            fVar.mo90590a(voteView, f);
            this.f113010b.postInvalidate();
        }
    }

    /* renamed from: a */
    public final int mo90484a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90489b() {
        /*
            r5 = this;
            java.lang.String r0 = "poll_prop_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f116214d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f116213c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f116215e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f116212b
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo90578g()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44673j.mo90489b():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90491d() {
        /*
            r5 = this;
            java.lang.String r0 = "poll_prop_label_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f116214d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f116213c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f116215e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f116212b
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo90578g()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            r5.m97712i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44673j.mo90491d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r3 == null) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m97712i() {
        /*
            r5 = this;
            java.lang.String r0 = "enter_poll_detail"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f116214d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f116213c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f116215e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f112939j
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.f116212b
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo90578g()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r3)
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            java.lang.String r3 = ""
        L_0x0063:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 != 0) goto L_0x007e
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r5.f112934e
            if (r0 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r0.getVoteStruct()
        L_0x0078:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.C44667a.m97708a(r4)
            r5.f113006m = r0
        L_0x007e:
            android.content.Context r0 = r5.f112937h
            if (r0 == 0) goto L_0x00f0
            android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
            android.support.v4.app.k r0 = r0.getSupportFragmentManager()
            r0.mo2234b()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            r1 = 1
            if (r0 == 0) goto L_0x0096
            boolean r0 = r0.isAdded()
            if (r0 == r1) goto L_0x00a1
        L_0x0096:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.isVisible()
            if (r0 == r1) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            return
        L_0x00a2:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.isRemoving()
            if (r0 != r1) goto L_0x00ad
            return
        L_0x00ad:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r1 = r5.f113005k
            r0.f112993e = r1
        L_0x00b5:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 == 0) goto L_0x00d6
            android.content.Context r1 = r5.f112937h
            if (r1 == 0) goto L_0x00ce
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            android.support.v4.app.k r1 = r1.getSupportFragmentManager()
            java.lang.String r2 = "(context as FragmentActi…y).supportFragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r2 = "VoteBottomSheetDialogFragment"
            r0.show(r1, r2)
            goto L_0x00d6
        L_0x00ce:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r5.f113006m
            if (r0 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$c r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$c
            r1.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$b r1 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.C44668b) r1
            r0.f112992d = r1
        L_0x00e3:
            com.ss.android.ugc.aweme.sticker.m r0 = r5.f112939j
            if (r0 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.sticker.f.d r0 = r0.f116229n
            if (r0 == 0) goto L_0x00ef
            r0.mo60274a()
            return
        L_0x00ef:
            return
        L_0x00f0:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44673j.m97712i():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo90490c() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112937h);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f112937h);
        dmtTextView.setTextColor(this.f112937h.getResources().getColor(R.color.aso));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) C9432q.m18687b(this.f112937h, 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f112937h.getString(R.string.dce));
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

    /* renamed from: a */
    public final void mo90577a(InteractStickerStruct interactStickerStruct) {
        super.mo90577a(interactStickerStruct);
        mo90485a(mo90484a());
    }

    /* renamed from: a */
    public final void mo90486a(C46063m mVar) {
        C52711k.m112240b(mVar, "interactStickerParams");
        super.mo90486a(mVar);
        this.f113004b.mo90486a(mVar);
        C44678k d = mo90485a(mo90484a());
        if (d != null) {
            d.post(new C44677d(this, d, mVar));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r8 == null) goto L_0x007e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k mo90485a(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 != 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k
            android.content.Context r0 = r7.f112937h
            r8.<init>(r0)
            r7.f113003a = r8
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.sticker.m r0 = r7.f112939j
            r8.setInteractStickerParams(r0)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r8.<init>(r0, r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r7.f113003a
            if (r0 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r0.setLayoutParams(r8)
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 == 0) goto L_0x0033
            android.widget.FrameLayout r8 = r8.getVoteView()
            if (r8 == 0) goto L_0x0033
            r0 = 4
            r8.setVisibility(r0)
        L_0x0033:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.f r0 = r7.f113004b
            float[] r0 = r0.mo90591a()
            r8.setPoints(r0)
        L_0x0040:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$b r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$b
            r0.<init>(r7)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r8.post(r0)
            goto L_0x0057
        L_0x004f:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteStickerView"
            r8.<init>(r0)
            throw r8
        L_0x0057:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r1 = r7.f113003a
            if (r1 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r8 = r7.f112934e
            r0 = 0
            if (r8 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.getVoteStruct()
            r2 = r8
            goto L_0x0067
        L_0x0066:
            r2 = r0
        L_0x0067:
            com.ss.android.ugc.aweme.sticker.m r8 = r7.f112939j
            if (r8 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.f116218c
            goto L_0x006f
        L_0x006e:
            r8 = r0
        L_0x006f:
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103664m(r8)
            com.ss.android.ugc.aweme.sticker.m r8 = r7.f112939j
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = r8.f116219d
            if (r8 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r4 = r8
            goto L_0x0081
        L_0x007e:
            java.lang.String r8 = ""
            goto L_0x007c
        L_0x0081:
            com.ss.android.ugc.aweme.sticker.m r8 = r7.f112939j
            if (r8 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.sticker.f.d r8 = r8.f116229n
            r5 = r8
            goto L_0x008a
        L_0x0089:
            r5 = r0
        L_0x008a:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r6 = r7.mo90578g()
            r1.mo90632a(r2, r3, r4, r5, r6)
        L_0x0091:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            if (r8 == 0) goto L_0x0098
            r8.postInvalidate()
        L_0x0098:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = r7.f113003a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44673j.mo90485a(int):com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k");
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return this.f113004b.mo90487a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return this.f113004b.mo90488a(j, i, f, f2, eVar);
    }

    public C44673j(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar, C44627g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        C52711k.m112240b(gVar, "iVoteDetailSaveData");
        super(i, context, view, interactStickerStruct, mVar);
        this.f113005k = gVar;
        this.f113004b = new C44636f(context, this, interactStickerStruct, mVar);
        if (mVar != null && mVar.f116220e) {
            m97712i();
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().typeFaceService().prefetch(context);
    }
}
