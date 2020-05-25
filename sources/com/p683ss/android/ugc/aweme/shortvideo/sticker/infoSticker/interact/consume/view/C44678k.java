package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.commercialize.log.C26050aq;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi.C44584a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2235c.C44593a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView.C44642a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45885d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k */
public final class C44678k extends RelativeLayout implements C44659e {

    /* renamed from: l */
    public static final C44680b f113012l = new C44680b(null);

    /* renamed from: a */
    public final DispathTouchEventView f113013a;

    /* renamed from: b */
    public final DmtTextView f113014b;

    /* renamed from: c */
    public final DmtTextView f113015c;

    /* renamed from: d */
    public final DispathTouchEventView f113016d;

    /* renamed from: e */
    public final DmtTextView f113017e;

    /* renamed from: f */
    public final DmtTextView f113018f;

    /* renamed from: g */
    public String f113019g = "";

    /* renamed from: h */
    public final C1689b f113020h;

    /* renamed from: i */
    public long f113021i;

    /* renamed from: j */
    public VoteStruct f113022j;

    /* renamed from: k */
    public C45885d f113023k;

    /* renamed from: m */
    private final DmtTextView f113024m;

    /* renamed from: n */
    private final ViewGroup f113025n;

    /* renamed from: o */
    private final ViewGroup f113026o;

    /* renamed from: p */
    private boolean f113027p;

    /* renamed from: q */
    private final VoteApi f113028q;

    /* renamed from: r */
    private C46063m f113029r;

    /* renamed from: s */
    private int f113030s;

    /* renamed from: t */
    private float[] f113031t;

    /* renamed from: u */
    private final Paint f113032u;

    /* renamed from: v */
    private final Path f113033v;

    /* renamed from: w */
    private final FrameLayout f113034w;

    /* renamed from: x */
    private InteractStickerStruct f113035x;

    /* renamed from: y */
    private C44679a f113036y;

    /* renamed from: z */
    private final C44681c f113037z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$a */
    public final class C44679a implements C44642a {
        public C44679a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (r0 == null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
            if (r0 == null) goto L_0x01a8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0291  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo90603a(int r14) {
            /*
                r13 = this;
                r0 = 1
                r2 = 0
                r3 = 1120403456(0x42c80000, float:100.0)
                r4 = 0
                r6 = 0
                r7 = 1
                r8 = 2132024633(0x7f141d39, float:1.9687748E38)
                if (r14 != r8) goto L_0x017a
                com.ss.android.ugc.aweme.IAccountUserService r14 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r14, r8)
                boolean r14 = r14.isLogin()
                if (r14 != 0) goto L_0x0047
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                android.content.Context r14 = r14.getContext()
                if (r14 == 0) goto L_0x003f
                android.app.Activity r14 = (android.app.Activity) r14
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.m r0 = r0.getInteractStickerParams()
                if (r0 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.sticker.l r0 = r0.f116231p
                if (r0 == 0) goto L_0x0037
                java.lang.String r0 = r0.f116212b
                if (r0 != 0) goto L_0x0039
            L_0x0037:
                java.lang.String r0 = ""
            L_0x0039:
                java.lang.String r1 = ""
                com.p683ss.android.ugc.aweme.login.C27965f.m66719a(r14, r0, r1)
                return
            L_0x003f:
                d.u r14 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
                r14.<init>(r0)
                throw r14
            L_0x0047:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.f113022j
                if (r8 == 0) goto L_0x0062
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x0062
                java.lang.Object r8 = r8.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x0062
                long r8 = r8.getOptionId()
                goto L_0x0063
            L_0x0062:
                r8 = r4
            L_0x0063:
                r14.f113021i = r8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                float r14 = r14.mo90629a(r6, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113015c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                java.lang.Float r12 = java.lang.Float.valueOf(r14)
                r11[r6] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r10 = com.C2240a.m6772a(r10, r11)
                java.lang.String r11 = "java.lang.String.format(format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
                r9.append(r10)
                java.lang.String r10 = "%"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r8.setText(r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113018f
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                float r3 = r3 - r14
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r11[r6] = r3
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r3 = com.C2240a.m6772a(r10, r3)
                java.lang.String r10 = "java.lang.String.format(format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r10)
                r9.append(r3)
                java.lang.String r3 = "%"
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setText(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f113013a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r9 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f113014b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r10 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f113015c
                int r14 = (int) r14
                r3.mo90631a(r8, r9, r10, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f113016d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r9 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f113017e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r10 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f113018f
                int r14 = 100 - r14
                r3.mo90636b(r8, r9, r10, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                r14.setStatus(r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.f113022j
                if (r3 == 0) goto L_0x0116
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0116
                java.lang.Object r3 = r3.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0116
                long r2 = r3.getOptionId()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
            L_0x0116:
                r14.mo90633a(r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f113022j
                if (r14 == 0) goto L_0x013c
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f113022j
                if (r2 == 0) goto L_0x0138
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0138
                java.lang.Object r2 = r2.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0138
                long r2 = r2.getOptionId()
                goto L_0x0139
            L_0x0138:
                r2 = r4
            L_0x0139:
                r14.setSelectOptionId(r2)
            L_0x013c:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f113022j
                if (r14 == 0) goto L_0x016d
                java.util.List r14 = r14.getOptions()
                if (r14 == 0) goto L_0x016d
                java.lang.Object r14 = r14.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r14 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r14
                if (r14 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f113022j
                if (r2 == 0) goto L_0x0168
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0168
                java.lang.Object r2 = r2.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0168
                long r4 = r2.getVoteCount()
            L_0x0168:
                r2 = 0
                long r4 = r4 + r0
                r14.setVoteCount(r4)
            L_0x016d:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                java.lang.String r0 = "A"
                r14.mo90634a(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                r14.mo90630a()
                return
            L_0x017a:
                r8 = 2132024634(0x7f141d3a, float:1.968775E38)
                if (r14 != r8) goto L_0x02eb
                com.ss.android.ugc.aweme.IAccountUserService r14 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r14, r8)
                boolean r14 = r14.isLogin()
                if (r14 != 0) goto L_0x01b8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                android.content.Context r14 = r14.getContext()
                if (r14 == 0) goto L_0x01b0
                android.app.Activity r14 = (android.app.Activity) r14
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.m r0 = r0.getInteractStickerParams()
                if (r0 == 0) goto L_0x01a8
                com.ss.android.ugc.aweme.sticker.l r0 = r0.f116231p
                if (r0 == 0) goto L_0x01a8
                java.lang.String r0 = r0.f116212b
                if (r0 != 0) goto L_0x01aa
            L_0x01a8:
                java.lang.String r0 = ""
            L_0x01aa:
                java.lang.String r1 = ""
                com.p683ss.android.ugc.aweme.login.C27965f.m66719a(r14, r0, r1)
                return
            L_0x01b0:
                d.u r14 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
                r14.<init>(r0)
                throw r14
            L_0x01b8:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.f113022j
                if (r8 == 0) goto L_0x01d3
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x01d3
                java.lang.Object r8 = r8.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x01d3
                long r8 = r8.getOptionId()
                goto L_0x01d4
            L_0x01d3:
                r8 = r4
            L_0x01d4:
                r14.f113021i = r8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                float r14 = r14.mo90629a(r7, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113018f
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                java.lang.Float r12 = java.lang.Float.valueOf(r14)
                r11[r6] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r10 = com.C2240a.m6772a(r10, r11)
                java.lang.String r11 = "java.lang.String.format(format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
                r9.append(r10)
                java.lang.String r10 = "%"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r8.setText(r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113015c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                float r3 = r3 - r14
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r11[r6] = r3
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r3 = com.C2240a.m6772a(r10, r3)
                java.lang.String r6 = "java.lang.String.format(format, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                r9.append(r3)
                java.lang.String r3 = "%"
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setText(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r6 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r6 = r6.f113016d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113017e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r9 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f113018f
                int r14 = (int) r14
                r3.mo90631a(r6, r8, r9, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r6 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r6 = r6.f113013a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r8 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f113014b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r9 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f113015c
                int r14 = 100 - r14
                r3.mo90636b(r6, r8, r9, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                r3 = 2
                r14.setStatus(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.f113022j
                if (r3 == 0) goto L_0x0288
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0288
                java.lang.Object r3 = r3.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0288
                long r2 = r3.getOptionId()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
            L_0x0288:
                r14.mo90633a(r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f113022j
                if (r14 == 0) goto L_0x02ae
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f113022j
                if (r2 == 0) goto L_0x02aa
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x02aa
                java.lang.Object r2 = r2.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x02aa
                long r2 = r2.getOptionId()
                goto L_0x02ab
            L_0x02aa:
                r2 = r4
            L_0x02ab:
                r14.setSelectOptionId(r2)
            L_0x02ae:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f113022j
                if (r14 == 0) goto L_0x02df
                java.util.List r14 = r14.getOptions()
                if (r14 == 0) goto L_0x02df
                java.lang.Object r14 = r14.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r14 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r14
                if (r14 == 0) goto L_0x02df
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r2 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f113022j
                if (r2 == 0) goto L_0x02da
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x02da
                java.lang.Object r2 = r2.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x02da
                long r4 = r2.getVoteCount()
            L_0x02da:
                r2 = 0
                long r4 = r4 + r0
                r14.setVoteCount(r4)
            L_0x02df:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                java.lang.String r0 = "B"
                r14.mo90634a(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r14 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.this
                r14.mo90630a()
            L_0x02eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.C44679a.mo90603a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$b */
    public static final class C44680b {
        private C44680b() {
        }

        public /* synthetic */ C44680b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$c */
    public interface C44681c {
        /* renamed from: a */
        void mo90654a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$d */
    public static final class C44682d implements C44681c {

        /* renamed from: a */
        final /* synthetic */ C44678k f113039a;

        /* renamed from: a */
        public final void mo90654a() {
            String str = this.f113039a.f113019g;
            if (str == null) {
                C52711k.m112234a();
            }
            C47718bf.m103288a(new C44593a(str, this.f113039a.f113021i));
        }

        C44682d(C44678k kVar) {
            this.f113039a = kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$e */
    public static final class C44683e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C44678k f113040a;

        /* renamed from: b */
        final /* synthetic */ boolean f113041b;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f113041b) {
                C45885d dVar = this.f113040a.f113023k;
                if (dVar != null) {
                    dVar.mo60276b();
                }
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f113041b) {
                C45885d dVar = this.f113040a.f113023k;
                if (dVar != null) {
                    dVar.mo60277c();
                }
                C44681c animEndListener = this.f113040a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo90654a();
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f113041b) {
                C45885d dVar = this.f113040a.f113023k;
                if (dVar != null) {
                    dVar.mo60277c();
                }
                C44681c animEndListener = this.f113040a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo90654a();
                }
            }
        }

        C44683e(C44678k kVar, boolean z) {
            this.f113040a = kVar;
            this.f113041b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$f */
    static final class C44684f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44678k f113042a;

        /* renamed from: b */
        final /* synthetic */ VoteStruct f113043b;

        /* renamed from: c */
        final /* synthetic */ C45885d f113044c;

        C44684f(C44678k kVar, VoteStruct voteStruct, C45885d dVar) {
            this.f113042a = kVar;
            this.f113043b = voteStruct;
            this.f113044c = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f113014b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r1 = r5.f113042a
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r5.f113043b
                r3 = 0
                if (r2 == 0) goto L_0x001f
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x001f
                r4 = 0
                java.lang.Object r2 = r2.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = r2.getOptionText()
                goto L_0x0020
            L_0x001f:
                r2 = r3
            L_0x0020:
                java.lang.String r1 = r1.mo90635b(r2)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f113017e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r1 = r5.f113042a
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r5.f113043b
                if (r2 == 0) goto L_0x0046
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0046
                r4 = 1
                java.lang.Object r2 = r2.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0046
                java.lang.String r3 = r2.getOptionText()
            L_0x0046:
                java.lang.String r1 = r1.mo90635b(r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f113013a
                if (r0 == 0) goto L_0x005a
                com.ss.android.ugc.aweme.sticker.f.d r1 = r5.f113044c
                r0.setListener(r1)
            L_0x005a:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f113016d
                if (r0 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.sticker.f.d r1 = r5.f113044c
                r0.setListener(r1)
            L_0x0065:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r1 = r5.f113042a
                int r1 = r1.getVoteStatus()
                r0.setStatus(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k r0 = r5.f113042a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$f$1 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$f$1
                r1.<init>(r5)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.C44684f.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.k$g */
    public static final class C44686g implements C1674ab<VoteResponse> {

        /* renamed from: a */
        final /* synthetic */ C44678k f113046a;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        C44686g(C44678k kVar) {
            this.f113046a = kVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((VoteResponse) obj, "t");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            this.f113046a.f113020h.mo6181a(cVar);
        }
    }

    public final C44681c getAnimEndListener() {
        return this.f113037z;
    }

    public final C46063m getInteractStickerParams() {
        return this.f113029r;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        return this.f113035x;
    }

    public final Path getPath() {
        return this.f113033v;
    }

    public final C44679a getPbListener() {
        return this.f113036y;
    }

    public final float[] getPoints() {
        return this.f113031t;
    }

    public final int getStatus() {
        return this.f113030s;
    }

    public final FrameLayout getVoteView() {
        return this.f113034w;
    }

    /* renamed from: getStatus reason: collision with other method in class */
    public final Integer m114618getStatus() {
        return Integer.valueOf(this.f113030s);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f113020h.dispose();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getVoteStatus() {
        /*
            r6 = this;
            boolean r0 = r6.f113027p
            if (r0 == 0) goto L_0x0006
            r0 = 3
            return r0
        L_0x0006:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r6.f113022j
            r1 = 0
            if (r0 == 0) goto L_0x0014
            long r2 = r0.getSelectOptionId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r6.f113022j
            r3 = 0
            if (r2 == 0) goto L_0x0031
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0031
            long r4 = r2.getOptionId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x003a
            return r2
        L_0x003a:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r6.f113022j
            if (r0 == 0) goto L_0x0047
            long r4 = r0.getSelectOptionId()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r6.f113022j
            if (r4 == 0) goto L_0x0062
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r2 = r4.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0062
            long r1 = r2.getOptionId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0062:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x006a
            r0 = 2
            return r0
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.getVoteStatus():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90630a() {
        /*
            r5 = this;
            java.lang.String r0 = "guest_poll_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f113029r
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
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f113029r
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
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f113029r
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
            com.ss.android.ugc.aweme.sticker.m r3 = r5.f113029r
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.l r3 = r3.f116231p
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f116212b
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.f113035x
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97546c(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.mo90630a():void");
    }

    public final void setInteractStickerParams(C46063m mVar) {
        this.f113029r = mVar;
    }

    public final void setInteractStickerStruct(InteractStickerStruct interactStickerStruct) {
        this.f113035x = interactStickerStruct;
    }

    public final void setPoints(float[] fArr) {
        this.f113031t = fArr;
    }

    public final void setStatus(int i) {
        this.f113030s = i;
    }

    public final void setPbListener(C44679a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f113036y = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f113027p) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final String mo90635b(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C9432q.m18669a(getContext(), 15.0f));
        int length = str.length() - 1;
        int length2 = str.length();
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (C9432q.m18687b(getContext(), 20.0f) + ((float) rect.width()) + C9432q.m18687b(getContext(), 49.0f) < ((float) this.f113013a.getWidth())) {
                length = length2;
                break;
            }
        }
        if (length < str.length() - 1) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, length);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        if (C44588c.m97541a(context) && this.f113031t != null) {
            this.f113033v.reset();
            Path path = this.f113033v;
            float[] fArr = this.f113031t;
            if (fArr == null) {
                C52711k.m112234a();
            }
            float f = fArr[0];
            float[] fArr2 = this.f113031t;
            if (fArr2 == null) {
                C52711k.m112234a();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f113033v;
            float[] fArr3 = this.f113031t;
            if (fArr3 == null) {
                C52711k.m112234a();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f113031t;
            if (fArr4 == null) {
                C52711k.m112234a();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f113033v;
            float[] fArr5 = this.f113031t;
            if (fArr5 == null) {
                C52711k.m112234a();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f113031t;
            if (fArr6 == null) {
                C52711k.m112234a();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f113033v;
            float[] fArr7 = this.f113031t;
            if (fArr7 == null) {
                C52711k.m112234a();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f113031t;
            if (fArr8 == null) {
                C52711k.m112234a();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f113033v.close();
            if (canvas != null) {
                canvas.drawPath(this.f113033v, this.f113032u);
            }
        }
    }

    public C44678k(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        Object create = C44584a.f112799a.createNewRetrofit(Api.f61282b).create(VoteApi.class);
        C52711k.m112236a(create, "retrofitService.createNe…eate(VoteApi::class.java)");
        this.f113028q = (VoteApi) create;
        this.f113020h = new C1689b();
        this.f113032u = new Paint();
        this.f113033v = new Path();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awg, this, false);
        if (inflate != null) {
            this.f113034w = (FrameLayout) inflate;
            this.f113036y = new C44679a();
            View findViewById = this.f113034w.findViewById(R.id.dsq);
            C52711k.m112236a((Object) findViewById, "voteView.findViewById(R.id.vote_title)");
            this.f113024m = (DmtTextView) findViewById;
            View findViewById2 = this.f113034w.findViewById(R.id.cdo);
            C52711k.m112236a((Object) findViewById2, "voteView.findViewById(R.id.rl_question1)");
            this.f113025n = (ViewGroup) findViewById2;
            View findViewById3 = this.f113034w.findViewById(R.id.dso);
            C52711k.m112236a((Object) findViewById3, "voteView.findViewById(R.id.vote_question_1)");
            this.f113013a = (DispathTouchEventView) findViewById3;
            View findViewById4 = this.f113034w.findViewById(R.id.cz1);
            C52711k.m112236a((Object) findViewById4, "voteView.findViewById(R.id.text_question_1)");
            this.f113014b = (DmtTextView) findViewById4;
            View findViewById5 = this.f113034w.findViewById(R.id.bx3);
            C52711k.m112236a((Object) findViewById5, "voteView.findViewById(R.id.percent_question_1)");
            this.f113015c = (DmtTextView) findViewById5;
            View findViewById6 = this.f113034w.findViewById(R.id.cdp);
            C52711k.m112236a((Object) findViewById6, "voteView.findViewById(R.id.rl_question2)");
            this.f113026o = (ViewGroup) findViewById6;
            View findViewById7 = this.f113034w.findViewById(R.id.dsp);
            C52711k.m112236a((Object) findViewById7, "voteView.findViewById(R.id.vote_question_2)");
            this.f113016d = (DispathTouchEventView) findViewById7;
            View findViewById8 = this.f113034w.findViewById(R.id.cz2);
            C52711k.m112236a((Object) findViewById8, "voteView.findViewById(R.id.text_question_2)");
            this.f113017e = (DmtTextView) findViewById8;
            View findViewById9 = this.f113034w.findViewById(R.id.bx4);
            C52711k.m112236a((Object) findViewById9, "voteView.findViewById(R.id.percent_question_2)");
            this.f113018f = (DmtTextView) findViewById9;
            this.f113015c.setAlpha(0.0f);
            this.f113018f.setAlpha(0.0f);
            C44659e eVar = this;
            this.f113013a.setStatusView(eVar);
            this.f113016d.setStatusView(eVar);
            this.f113013a.setClickListener(this.f113036y);
            this.f113016d.setClickListener(this.f113036y);
            C1056u.m3048c((View) this.f113025n, C9432q.m18687b(getContext(), 4.0f));
            C1056u.m3048c((View) this.f113026o, C9432q.m18687b(getContext(), 4.0f));
            Typeface typefaceByFontName = AVExternalServiceImpl.getAVServiceImpl_Monster().typeFaceService().getTypefaceByFontName("方正兰亭特黑简体");
            if (typefaceByFontName != null) {
                this.f113024m.setTypeface(typefaceByFontName);
            }
            if (VERSION.SDK_INT >= 17) {
                FrameLayout frameLayout = this.f113034w;
                if (frameLayout != null) {
                    frameLayout.setLayoutDirection(3);
                }
                if (C47918gj.m103682a(getContext())) {
                    this.f113025n.setLayoutDirection(1);
                    this.f113026o.setLayoutDirection(1);
                } else {
                    this.f113025n.setLayoutDirection(0);
                    this.f113026o.setLayoutDirection(0);
                }
            }
            addView(this.f113034w);
            this.f113037z = new C44682d(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: a */
    public final void mo90633a(Long l) {
        Long l2;
        long j;
        if (l != null) {
            VoteStruct voteStruct = this.f113022j;
            if (voteStruct != null) {
                l2 = Long.valueOf(voteStruct.getVoteId());
            } else {
                l2 = null;
            }
            if (l2 != null) {
                VoteApi voteApi = this.f113028q;
                VoteStruct voteStruct2 = this.f113022j;
                if (voteStruct2 != null) {
                    j = voteStruct2.getVoteId();
                } else {
                    j = 0;
                }
                voteApi.vote(j, l.longValue()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C44686g<Object>(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo90634a(String str) {
        CharSequence charSequence;
        boolean z;
        String str2;
        String str3;
        Object obj;
        C46063m mVar = this.f113029r;
        Long l = null;
        if (mVar != null) {
            charSequence = mVar.f116221f;
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        boolean z2 = false;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            C46063m mVar2 = this.f113029r;
            if (mVar2 != null) {
                str2 = mVar2.f116221f;
            } else {
                str2 = null;
            }
            C46063m mVar3 = this.f113029r;
            if (mVar3 != null) {
                str3 = mVar3.f116222g;
            } else {
                str3 = null;
            }
            C46063m mVar4 = this.f113029r;
            if (mVar4 != null) {
                obj = Long.valueOf(mVar4.f116223h);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            C46063m mVar5 = this.f113029r;
            if (mVar5 != null) {
                l = Long.valueOf(mVar5.f116224i);
            }
            if (l == null) {
                C52711k.m112234a();
            }
            long longValue = l.longValue();
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "area");
            C52711k.m112240b(valueOf, "cid");
            CharSequence charSequence3 = str2;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder("ad vote click event : ");
                sb.append(str);
                C26050aq.m63102a(context, "draw_ad", "poll_sticker_click", C26050aq.m63103b(C26050aq.m63098a(context, str2, sb.toString()), str), str3, valueOf, longValue);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo90629a(int r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r4.f113022j
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto L_0x001a
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
            if (r0 == 0) goto L_0x001a
            long r2 = r0.getVoteCount()
            float r0 = (float) r2
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r4.f113022j
            if (r2 == 0) goto L_0x0034
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x0034
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0034
            long r2 = r2.getVoteCount()
            float r2 = (float) r2
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            float r0 = r0 + r2
            float r6 = (float) r6
            float r0 = r0 + r6
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x0046
            boolean r5 = r4.f113027p
            if (r5 == 0) goto L_0x0043
            r5 = 1120534528(0x42ca0000, float:101.0)
            return r5
        L_0x0043:
            r5 = 1112014848(0x42480000, float:50.0)
            return r5
        L_0x0046:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r4.f113022j
            if (r2 == 0) goto L_0x005d
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r5 = r2.get(r5)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x005d
            long r1 = r5.getVoteCount()
            float r1 = (float) r1
        L_0x005d:
            float r1 = r1 + r6
            float r1 = r1 / r0
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44678k.mo90629a(int, int):float");
    }

    /* renamed from: a */
    static void m97722a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2) {
        dispathTouchEventView.setProgress(0);
        dmtTextView2.setAlpha(0.0f);
        dmtTextView.setTranslationX(0.0f);
    }

    /* renamed from: a */
    public final void mo90631a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        dispathTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.cbp));
        m97723a(dispathTouchEventView, dmtTextView, dmtTextView2, i, true);
    }

    /* renamed from: b */
    public final void mo90636b(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        dispathTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.cbr));
        m97723a(dispathTouchEventView, dmtTextView, dmtTextView2, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo90637c(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - C9432q.m18687b(getContext(), 20.0f);
        if (C47918gj.m103682a(getContext())) {
            width = -width;
        }
        dispathTouchEventView.setProgress(i);
        dmtTextView2.setAlpha(1.0f);
        dmtTextView.setTranslationX(-width);
    }

    /* renamed from: a */
    private final void m97723a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i, boolean z) {
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - C9432q.m18687b(getContext(), 20.0f);
        if (C47918gj.m103682a(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dispathTouchEventView, "progress", new int[]{0, i});
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView2, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView, "translationX", new float[]{0.0f, -width});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C44683e(this, z));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo90632a(VoteStruct voteStruct, boolean z, String str, C45885d dVar, InteractStickerStruct interactStickerStruct) {
        CharSequence charSequence;
        this.f113022j = voteStruct;
        this.f113027p = z;
        if (str == null) {
            str = "";
        }
        this.f113019g = str;
        this.f113023k = dVar;
        this.f113035x = interactStickerStruct;
        String str2 = null;
        if (voteStruct != null) {
            charSequence = voteStruct.getQuestion();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f113024m.setVisibility(8);
        } else {
            this.f113024m.setVisibility(0);
            DmtTextView dmtTextView = this.f113024m;
            if (voteStruct != null) {
                str2 = voteStruct.getQuestion();
            }
            dmtTextView.setText(str2);
        }
        this.f113014b.post(new C44684f(this, voteStruct, dVar));
    }
}
