package com.p683ss.android.ugc.aweme.shortvideo;

import android.graphics.Color;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49610c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.da */
public final class C43206da implements C49610c {

    /* renamed from: b */
    public static final C43207a f109259b = new C43207a(null);

    /* renamed from: f */
    private static final long f109260f = C39618d.f101151O.mo83119c(C40796a.LongVideoThreshold);

    /* renamed from: g */
    private static final long f109261g = f109261g;

    /* renamed from: a */
    public final FragmentActivity f109262a;

    /* renamed from: d */
    private ShortVideoContext f109263d;

    /* renamed from: e */
    private boolean f109264e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.da$a */
    public static final class C43207a {
        private C43207a() {
        }

        public /* synthetic */ C43207a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    private boolean m94802c() {
        return this.f109264e;
    }

    /* renamed from: b */
    public final C10660a mo87839b() {
        String string = this.f109262a.getString(R.string.dik);
        if (this.f109262a == null) {
            return null;
        }
        C10661a aVar = new C10661a(this.f109262a);
        C52711k.m112236a((Object) string, "tipString");
        return aVar.mo19012a(string).mo19009a(Color.parseColor("#E6FFFFFF")).mo19014a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.dmt.p664ui.bubbleview.C10660a mo87837a() {
        /*
            r19 = this;
            r0 = r19
            android.support.v4.app.FragmentActivity r1 = r0.f109262a
            r2 = 0
            if (r1 == 0) goto L_0x001b
            android.arch.lifecycle.y r1 = android.arch.lifecycle.C0214z.m440a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r3 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.x r1 = r1.mo359a(r3)
            java.lang.String r3 = "ViewModelProviders.of(it…extViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r1.f107134a
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            r0.f109263d = r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f109263d
            if (r1 == 0) goto L_0x01c7
            boolean r1 = r1.mo86361c()
            r3 = 1
            if (r1 != r3) goto L_0x01c7
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f109263d
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.f107089ao
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f109263d
            if (r5 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r5 = r5.f107036O
            goto L_0x0039
        L_0x0038:
            r5 = r2
        L_0x0039:
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 2132551712(0x7f1c2820, float:2.075679E38)
            if (r5 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.port.in.ab r9 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r10 = r0.f109263d
            if (r10 == 0) goto L_0x0049
            java.lang.String r10 = r10.f107112e
            goto L_0x004a
        L_0x0049:
            r10 = r2
        L_0x004a:
            int r9 = r9.mo80578b(r10)
            com.ss.android.ugc.aweme.shortvideo.dh r10 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r10 = r10.mo50201b()
            if (r10 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.shortvideo.dh r10 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r10 = r10.mo50201b()
            if (r10 != 0) goto L_0x0065
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0065:
            java.lang.String r11 = "PublishManager.inst().getCurMusic()!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            int r10 = r10.getPresenterDuration()
            if (r10 <= 0) goto L_0x007f
            com.ss.android.ugc.aweme.shortvideo.dh r10 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r10 = r10.mo50201b()
            if (r10 == 0) goto L_0x007f
            int r10 = r10.getPresenterDuration()
            goto L_0x0080
        L_0x007f:
            r10 = r9
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            long r11 = f109260f
            goto L_0x0087
        L_0x0085:
            long r11 = f109261g
        L_0x0087:
            long r13 = (long) r9
            long r9 = (long) r10
            long r15 = r5.getDuration()
            r17 = 0
            int r1 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a0
            int r1 = r5.getMusicStart()
            long r4 = (long) r1
            long r13 = r13 - r4
            long r13 = r13 - r15
            long r9 = r9 - r15
            long r4 = java.lang.Math.min(r13, r9)
            goto L_0x00a8
        L_0x00a0:
            int r1 = r5.getMusicStart()
            long r4 = (long) r1
            long r13 = r13 - r4
            long r4 = r13 - r15
        L_0x00a8:
            r1 = 0
            long r11 = r11 - r15
            r9 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x00e5
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e5
            android.support.v4.app.FragmentActivity r1 = r0.f109262a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            long r4 = r4 / r6
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r4 = 0
            r2[r4] = r3
            java.lang.String r1 = r1.getString(r8, r2)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r2 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r3 = r0.f109262a
            android.app.Activity r3 = (android.app.Activity) r3
            r2.<init>(r3)
            java.lang.String r3 = "tipString"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r2.mo19012a(r1)
            java.lang.String r2 = "#E6FFFFFF"
            int r2 = android.graphics.Color.parseColor(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r1.mo19009a(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a r1 = r1.mo19014a()
            return r1
        L_0x00e5:
            return r2
        L_0x00e6:
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 != 0) goto L_0x00fd
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00fd:
            java.lang.String r5 = "PublishManager.inst().getCurMusic()!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getPresenterDuration()
            if (r4 <= 0) goto L_0x0126
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 == 0) goto L_0x0117
            int r4 = r4.getPresenterDuration()
            goto L_0x0134
        L_0x0117:
            com.ss.android.ugc.aweme.port.in.ab r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f109263d
            if (r5 == 0) goto L_0x0120
            java.lang.String r5 = r5.f107112e
            goto L_0x0121
        L_0x0120:
            r5 = r2
        L_0x0121:
            int r4 = r4.mo80578b(r5)
            goto L_0x0134
        L_0x0126:
            com.ss.android.ugc.aweme.port.in.ab r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f109263d
            if (r5 == 0) goto L_0x012f
            java.lang.String r5 = r5.f107112e
            goto L_0x0130
        L_0x012f:
            r5 = r2
        L_0x0130:
            int r4 = r4.mo80578b(r5)
        L_0x0134:
            long r4 = (long) r4
            if (r1 == 0) goto L_0x013a
            long r9 = f109260f
            goto L_0x013c
        L_0x013a:
            long r9 = f109261g
        L_0x013c:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f109263d
            if (r1 == 0) goto L_0x0156
            java.lang.String r11 = "prop_reuse"
            java.lang.String r12 = r1.f107132y
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
            if (r11 != 0) goto L_0x0154
            java.lang.String r11 = "prop_page"
            java.lang.String r1 = r1.f107132y
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r1)
            if (r1 == 0) goto L_0x0156
        L_0x0154:
            r1 = 1
            goto L_0x0157
        L_0x0156:
            r1 = 0
        L_0x0157:
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x017c
            android.support.v4.app.FragmentActivity r9 = r0.f109262a
            if (r1 == 0) goto L_0x0168
            boolean r1 = r19.m94802c()
            if (r1 != 0) goto L_0x0168
            r8 = 2132551714(0x7f1c2822, float:2.0756795E38)
        L_0x0168:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            long r4 = r4 / r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r1[r5] = r4
            java.lang.String r1 = r9.getString(r8, r1)
            java.lang.String r4 = "activity.getString(if (i…ps, musicDuration / 1000)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            goto L_0x0196
        L_0x017c:
            r5 = 0
            if (r1 == 0) goto L_0x018f
            boolean r1 = r19.m94802c()
            if (r1 != 0) goto L_0x018f
            android.support.v4.app.FragmentActivity r1 = r0.f109262a
            r4 = 2132551715(0x7f1c2823, float:2.0756797E38)
            java.lang.String r1 = r1.getString(r4)
            goto L_0x0191
        L_0x018f:
            java.lang.String r1 = ""
        L_0x0191:
            java.lang.String r4 = "if (isFromUseSameSticker…rigin_music_tips) else \"\""
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
        L_0x0196:
            android.support.v4.app.FragmentActivity r4 = r0.f109262a
            if (r4 == 0) goto L_0x01c6
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x01a7
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01a6
            goto L_0x01a7
        L_0x01a6:
            r3 = 0
        L_0x01a7:
            if (r3 == 0) goto L_0x01aa
            goto L_0x01c6
        L_0x01aa:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r2 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r3 = r0.f109262a
            android.app.Activity r3 = (android.app.Activity) r3
            r2.<init>(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r2.mo19012a(r1)
            java.lang.String r2 = "#E6FFFFFF"
            int r2 = android.graphics.Color.parseColor(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r1.mo19009a(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a r2 = r1.mo19014a()
            goto L_0x01c7
        L_0x01c6:
            return r2
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C43206da.mo87837a():com.bytedance.ies.dmt.ui.bubbleview.a");
    }

    /* renamed from: a */
    public final void mo87838a(boolean z) {
        this.f109264e = true;
    }

    public C43206da(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f109262a = fragmentActivity;
    }
}
