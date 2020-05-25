package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9431p;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43569g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.UUID;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b */
public final class C43588b extends C43560c {

    /* renamed from: y */
    public static final C43589a f110307y = new C43589a(null);

    /* renamed from: a */
    public C43592c f110308a;

    /* renamed from: b */
    public String f110309b;

    /* renamed from: x */
    public boolean f110310x;

    /* renamed from: z */
    private EditDonationStickerViewModel f110311z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$a */
    public static final class C43589a {
        private C43589a() {
        }

        public /* synthetic */ C43589a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$b */
    public static final class C43590b<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C43588b f110312a;

        public C43590b(C43588b bVar) {
            this.f110312a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo34e() == null) {
                return null;
            }
            InteractStickerBaseView interactStickerBaseView = this.f110312a.f110234k;
            if (interactStickerBaseView != null) {
                C43592c a = ((DonationStickerInteractView) interactStickerBaseView).f110284a.mo52072c();
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "it.result");
                return new C43587a(a, (C43569g) e);
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.b$c */
    static final class C43591c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43588b f110313a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f110314b;

        C43591c(C43588b bVar, InteractStickerStruct interactStickerStruct) {
            this.f110313a = bVar;
            this.f110314b = interactStickerStruct;
        }

        public final void run() {
            C43588b.super.mo88746a(this.f110314b);
            InteractStickerBaseView interactStickerBaseView = this.f110313a.f110234k;
            C52711k.m112236a((Object) interactStickerBaseView, "mStickerView");
            interactStickerBaseView.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final int mo88734g() {
        return R.string.alg;
    }

    /* renamed from: c */
    public final boolean mo88730c() {
        if (this.f110308a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo88732e() {
        this.f110308a = null;
        super.mo88732e();
    }

    /* renamed from: b */
    private static String m95756b() {
        StringBuilder sb = new StringBuilder("pi_start");
        sb.append(UUID.randomUUID().toString());
        sb.append("pi_end");
        return sb.toString();
    }

    /* renamed from: i */
    public final boolean mo88736i() {
        EditDonationStickerViewModel editDonationStickerViewModel = this.f110311z;
        if (editDonationStickerViewModel == null) {
            C52711k.m112237a("donationStickerViewModel");
        }
        Context context = this.f110242s;
        if (context != null) {
            return ((EditDonationStickerState) editDonationStickerViewModel.mo97464a((FragmentActivity) context)).getInTimeEditView();
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        if (r4 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (r4 == null) goto L_0x00e0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct mo88731d() {
        /*
            r7 = this;
            boolean r0 = r7.mo88730c()
            r1 = 0
            if (r0 == 0) goto L_0x0100
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r0 = r7.f110234k
            if (r0 == 0) goto L_0x0100
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = new com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct
            r0.<init>()
            r2 = 6
            r0.setType(r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp r3 = new com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            java.lang.String r5 = "mStickerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            float r4 = r4.getRotateAngle()
            float r4 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c.m95657b(r4)
            r3.setRotation(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            java.lang.String r5 = "mStickerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            float r4 = r4.getScale()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.setScale(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            com.ss.android.vesdk.VESize r5 = r7.f110238o
            android.graphics.PointF r4 = r4.mo88863a(r5)
            android.graphics.PointF r4 = r7.mo88740a(r4)
            float r5 = r4.x
            r3.setX(r5)
            float r4 = r4.y
            r3.setY(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView
            if (r5 != 0) goto L_0x0061
            r4 = r1
        L_0x0061:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView r4 = (com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView) r4
            r5 = 0
            if (r4 == 0) goto L_0x006b
            float r4 = r4.getStartTime()
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            r3.setStartTime(r4)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            boolean r6 = r4 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView
            if (r6 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r4
        L_0x0077:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView) r1
            if (r1 == 0) goto L_0x007f
            float r5 = r1.getEndTime()
        L_0x007f:
            r3.setEndTime(r5)
            android.graphics.PointF r1 = new android.graphics.PointF
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r4 = r7.f110234k
            java.lang.String r5 = "mStickerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getContentViewWidth()
            float r4 = (float) r4
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView r5 = r7.f110234k
            java.lang.String r6 = "mStickerView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            int r5 = r5.getContentViewHeight()
            float r5 = (float) r5
            r1.<init>(r4, r5)
            android.graphics.PointF r1 = r7.mo88740a(r1)
            float r4 = r1.x
            r3.setWidth(r4)
            float r1 = r1.y
            r3.setHeight(r1)
            r2.add(r3)
            com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43568f.m95713a(r0, r2)
            r1 = 2
            d.n[] r1 = new p2628d.C52847n[r1]
            r2 = 0
            java.lang.String r3 = "donation_name"
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r4 = r7.f110308a
            if (r4 == 0) goto L_0x00c7
            com.ss.android.ugc.gamora.editor.sticker.donation.b.b r4 = r4.f110315a
            if (r4 == 0) goto L_0x00c7
            java.lang.String r4 = r4.getName()
            if (r4 != 0) goto L_0x00c9
        L_0x00c7:
            java.lang.String r4 = ""
        L_0x00c9:
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = "donation_url"
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c r4 = r7.f110308a
            if (r4 == 0) goto L_0x00e0
            com.ss.android.ugc.gamora.editor.sticker.donation.b.b r4 = r4.f110315a
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = r4.getDonateLink()
            if (r4 != 0) goto L_0x00e2
        L_0x00e0:
            java.lang.String r4 = ""
        L_0x00e2:
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r1[r2] = r3
            java.util.HashMap r1 = p2628d.p2629a.C52550ab.m112057c(r1)
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.ax r2 = r2.mo58595z()
            com.google.gson.f r2 = r2.getRetrofitFactoryGson()
            java.lang.String r1 = r2.mo34889b(r1)
            r0.setAttr(r1)
            return r0
        L_0x0100:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.C43588b.mo88731d():com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct");
    }

    /* renamed from: a */
    public final boolean mo88728a(InteractStickerBaseView interactStickerBaseView) {
        if (!(interactStickerBaseView instanceof DonationStickerInteractView)) {
            return false;
        }
        this.f110308a = null;
        return super.mo88728a(interactStickerBaseView);
    }

    /* renamed from: a */
    public final void mo88746a(InteractStickerStruct interactStickerStruct) {
        if (this.f110234k != null) {
            this.f110234k.postDelayed(new C43591c(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo88721a(Context context) {
        C52711k.m112240b(context, "context");
        DonationStickerInteractView donationStickerInteractView = new DonationStickerInteractView(context, null, 0, 6, null);
        donationStickerInteractView.setLayoutParams(new LayoutParams(-1, -1));
        donationStickerInteractView.setController(this);
        donationStickerInteractView.setLockMode(true);
        return donationStickerInteractView;
    }

    /* renamed from: a */
    public final void mo88726a(String str) {
        if (!C9431p.m18664a(str)) {
            if (str == null) {
                C52711k.m112234a();
            }
            CharSequence charSequence = str;
            if (!C52830p.m112456b(charSequence, (CharSequence) "pi_start", false, 2, (Object) null) || !C52830p.m112456b(charSequence, (CharSequence) "pi_end", false, 2, (Object) null)) {
                String str2 = File.separator;
                C52711k.m112236a((Object) str2, "File.separator");
                if (C52830p.m112413c(str, str2, false, 2, null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(m95756b());
                    super.mo88726a(sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m95756b());
                super.mo88726a(sb2.toString());
            } else {
                super.mo88726a(new C52820l("pi_start(.*?)pi_end").replace(charSequence, m95756b()));
            }
        }
    }

    /* renamed from: a */
    public final void mo88723a(Context context, C46723c cVar, FrameLayout frameLayout) {
        super.mo88723a(context, cVar, frameLayout);
        Context context2 = this.f110242s;
        if (context2 != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) context2).mo96760a(EditDonationStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f110311z = (EditDonationStickerViewModel) a;
            this.f110310x = false;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo88799a(C43592c cVar, boolean z, boolean z2) {
        C52711k.m112240b(cVar, "data");
        this.f110308a = cVar;
        mo88727a(z2);
        InteractStickerBaseView interactStickerBaseView = this.f110234k;
        if (!(interactStickerBaseView instanceof DonationStickerInteractView)) {
            interactStickerBaseView = null;
        }
        DonationStickerInteractView donationStickerInteractView = (DonationStickerInteractView) interactStickerBaseView;
        if (donationStickerInteractView != null) {
            C52711k.m112240b(cVar, "stickerData");
            donationStickerInteractView.setVisibility(4);
            donationStickerInteractView.f110284a.setDonationStickerData(cVar);
            if (z) {
                donationStickerInteractView.post(new C43581b(donationStickerInteractView));
            }
        }
    }
}
