package com.p683ss.android.ugc.aweme.greenscreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2767k;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.C12932b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.views.C48219q;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.i */
public final class C32894i extends C49604i implements C22817e, C49548a {

    /* renamed from: w */
    public static final C32895a f85525w = new C32895a(null);

    /* renamed from: A */
    private View f85526A;

    /* renamed from: B */
    private TextView f85527B;

    /* renamed from: C */
    private ObjectAnimator f85528C;

    /* renamed from: D */
    private ObjectAnimator f85529D;

    /* renamed from: E */
    private RemoteImageView f85530E;

    /* renamed from: F */
    private RemoteImageView f85531F;

    /* renamed from: G */
    private View f85532G;

    /* renamed from: H */
    private boolean f85533H;

    /* renamed from: i */
    public Boolean f85534i;

    /* renamed from: j */
    int f85535j = C23728o.m58241a(40.0d);

    /* renamed from: k */
    int f85536k = C23728o.m58241a(132.0d);

    /* renamed from: l */
    public View f85537l;

    /* renamed from: m */
    public C32891g f85538m;

    /* renamed from: n */
    View f85539n;

    /* renamed from: o */
    View f85540o;

    /* renamed from: p */
    View f85541p;

    /* renamed from: q */
    public View f85542q;

    /* renamed from: r */
    public ShortVideoContextViewModel f85543r;

    /* renamed from: s */
    GreenScreenViewModel f85544s;

    /* renamed from: t */
    Dialog f85545t;

    /* renamed from: u */
    public boolean f85546u;

    /* renamed from: v */
    ShortVideoContext f85547v;

    /* renamed from: x */
    private RecyclerView f85548x;

    /* renamed from: y */
    private View f85549y;

    /* renamed from: z */
    private View f85550z;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$a */
    public static final class C32895a {
        private C32895a() {
        }

        public /* synthetic */ C32895a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$b */
    static final class C32896b extends C52712l implements C52686q<Integer, Integer, Intent, C52860x> {

        /* renamed from: a */
        final /* synthetic */ int f85551a = 10003;

        /* renamed from: b */
        final /* synthetic */ C32894i f85552b;

        C32896b(int i, C32894i iVar) {
            this.f85552b = iVar;
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
            if (r6 == null) goto L_0x00bb;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            /*
                r4 = this;
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                android.content.Intent r7 = (android.content.Intent) r7
                int r0 = r4.f85551a
                if (r5 != r0) goto L_0x00f3
                if (r7 == 0) goto L_0x00f3
                r5 = -1
                if (r6 != r5) goto L_0x00f3
                java.lang.String r5 = "key_choose_media_data"
                java.util.ArrayList r5 = r7.getParcelableArrayListExtra(r5)
                boolean r6 = com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b.m58625a(r5)
                if (r6 == 0) goto L_0x00f3
                r6 = r5
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r7 = 1
                r6 = r6 ^ r7
                if (r6 == 0) goto L_0x00f3
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r5 = (com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel) r5
                java.lang.String r0 = "mediaModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                java.lang.String r0 = r5.f95383b
                java.lang.String r5 = r5.f95397p
                com.ss.android.ugc.aweme.greenscreen.i r1 = r4.f85552b
                com.ss.android.ugc.aweme.greenscreen.g r1 = com.p683ss.android.ugc.aweme.greenscreen.C32894i.m75784a(r1)
                r2 = r0
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x0070
                java.util.ArrayList<java.lang.String> r2 = r1.f85518b
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                boolean r2 = p2628d.p2629a.C52575l.m112125a(r2, r0)
                if (r2 == 0) goto L_0x005b
                r1.mo69804a(r0)
                goto L_0x0070
            L_0x005b:
                java.util.ArrayList<java.lang.String> r2 = r1.f85518b
                if (r0 != 0) goto L_0x0062
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0062:
                r2.add(r6, r0)
                r1.notifyItemInserted(r6)
                int r6 = r1.f85519c
                int r6 = r6 + r7
                r1.f85519c = r6
                r1.mo69804a(r0)
            L_0x0070:
                com.ss.android.ugc.aweme.greenscreen.i r6 = r4.f85552b
                android.view.View r1 = r6.f85539n
                if (r1 != 0) goto L_0x007b
                java.lang.String r2 = "loadingLayout"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x007b:
                r2 = 4
                r1.setVisibility(r2)
                android.view.View r1 = r6.f85540o
                if (r1 != 0) goto L_0x0088
                java.lang.String r3 = "selectShadow"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0088:
                r1.setVisibility(r2)
                android.view.View r6 = r6.f85541p
                if (r6 != 0) goto L_0x0094
                java.lang.String r1 = "unSelectShadow"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0094:
                r6.setVisibility(r2)
                com.ss.android.ugc.aweme.greenscreen.i r6 = r4.f85552b
                java.lang.String r1 = "imgPath"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r6.mo69810a(r0, r5)
                com.ss.android.ugc.aweme.greenscreen.i r6 = r4.f85552b
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                java.lang.String r2 = r6.mo69808L()
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r6.f85547v
                if (r6 == 0) goto L_0x00bb
                java.lang.String r6 = r6.f107132y
                if (r6 != 0) goto L_0x00bd
            L_0x00bb:
                java.lang.String r6 = ""
            L_0x00bd:
                com.ss.android.ugc.aweme.app.f.d r6 = r0.mo47829a(r1, r6)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "album_page"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r0, r1)
                java.lang.String r0 = "is_greenscreen"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47826a(r0, r7)
                r7 = r5
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x00e5
                java.lang.String r7 = "background_type"
                java.lang.String r0 = "library"
                r6.mo47829a(r7, r0)
                java.lang.String r7 = "background_id"
                r6.mo47829a(r7, r5)
                goto L_0x00ec
            L_0x00e5:
                java.lang.String r5 = "background_type"
                java.lang.String r7 = "original"
                r6.mo47829a(r5, r7)
            L_0x00ec:
                java.lang.String r5 = "background_click"
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r6)
            L_0x00f3:
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32894i.C32896b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$c */
    public static final class C32897c extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C32894i f85553a;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
            if (r6 == null) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59929a(android.view.View r6) {
            /*
                r5 = this;
                java.lang.String r0 = "v"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                com.ss.android.ugc.aweme.greenscreen.i r6 = r5.f85553a
                java.lang.String r0 = "click_upload_entrance"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r6.mo69808L()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r6.f85547v
                if (r6 == 0) goto L_0x0021
                java.lang.String r6 = r6.f107132y
                if (r6 != 0) goto L_0x0023
            L_0x0021:
                java.lang.String r6 = ""
            L_0x0023:
                com.ss.android.ugc.aweme.app.f.d r6 = r1.mo47829a(r2, r6)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "green_screen"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r1, r2)
                java.lang.String r1 = "is_greenscreen"
                r2 = 1
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r6)
                com.ss.android.ugc.aweme.greenscreen.i r6 = r5.f85553a
                android.app.Activity r0 = r6.f33840g_
                if (r0 == 0) goto L_0x00a7
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r3 = "key_choose_scene"
                r4 = 5
                r1.putInt(r3, r4)
                java.lang.String r3 = "key_photo_select_min_count"
                r1.putInt(r3, r2)
                java.lang.String r3 = "key_photo_select_max_count"
                r1.putInt(r3, r2)
                java.lang.String r2 = "upload_photo_min_height"
                r3 = 480(0x1e0, float:6.73E-43)
                r1.putInt(r2, r3)
                java.lang.String r2 = "upload_photo_min_width"
                r3 = 360(0x168, float:5.04E-43)
                r1.putInt(r2, r3)
                java.lang.String r2 = "key_support_flag"
                r3 = 9
                r1.putInt(r2, r3)
                java.lang.String r2 = "key_short_video_context"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r3 = r6.f85543r
                if (r3 != 0) goto L_0x0076
                java.lang.String r4 = "shortVideoContextViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0076:
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r3.f107134a
                android.os.Parcelable r3 = (android.os.Parcelable) r3
                r1.putParcelable(r2, r3)
                android.content.Intent r2 = new android.content.Intent
                android.app.Activity r3 = r6.f33840g_
                android.content.Context r3 = (android.content.Context) r3
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity> r4 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.class
                r2.<init>(r3, r4)
                r2.putExtras(r1)
                java.lang.String r1 = "key_choose_request_code"
                r3 = 10003(0x2713, float:1.4017E-41)
                r2.putExtra(r1, r3)
                java.lang.String r1 = "key_start_activity_request_code"
                r2.putExtra(r1, r3)
                java.lang.String r1 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.greenscreen.i$b r1 = new com.ss.android.ugc.aweme.greenscreen.i$b
                r1.<init>(r3, r6)
                d.f.a.q r1 = (p2628d.p2639f.p2640a.C52686q) r1
                com.p683ss.android.ugc.aweme.sticker.p2280d.C45860c.m99704a(r0, r2, r3, r1)
                return
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32894i.C32897c.mo59929a(android.view.View):void");
        }

        C32897c(C32894i iVar, long j) {
            this.f85553a = iVar;
            super(500);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$d */
    static final class C32898d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32894i f85554a;

        C32898d(C32894i iVar) {
            this.f85554a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
            if (r5 == null) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                com.ss.android.ugc.aweme.greenscreen.i r5 = r4.f85554a
                com.ss.android.ugc.aweme.greenscreen.g r5 = com.p683ss.android.ugc.aweme.greenscreen.C32894i.m75784a(r5)
                r5.mo69803a()
                com.ss.android.ugc.aweme.greenscreen.i r5 = r4.f85554a
                r5.mo69805I()
                com.ss.android.ugc.aweme.greenscreen.i r5 = r4.f85554a
                java.lang.String r0 = "background_click"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r5.mo69808L()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r5.f85547v
                if (r5 == 0) goto L_0x002d
                java.lang.String r5 = r5.f107132y
                if (r5 != 0) goto L_0x002f
            L_0x002d:
                java.lang.String r5 = ""
            L_0x002f:
                com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_shoot_page"
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.lang.String r1 = "background_type"
                java.lang.String r2 = "empty"
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.lang.String r1 = "is_greenscreen"
                r2 = 1
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32894i.C32898d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$e */
    public static final class C32899e implements C32926v {

        /* renamed from: a */
        final /* synthetic */ C32894i f85555a;

        /* renamed from: a */
        public final void mo69814a() {
            this.f85555a.mo69812b(true);
            this.f85555a.mo69805I();
        }

        C32899e(C32894i iVar) {
            this.f85555a = iVar;
        }

        /* renamed from: a */
        public final void mo69815a(String str) {
            this.f85555a.mo69812b(false);
            C32894i iVar = this.f85555a;
            if (str == null) {
                str = "";
            }
            iVar.mo69810a(str, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$f */
    static final class C32900f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32894i f85556a;

        C32900f(C32894i iVar) {
            this.f85556a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
            if (r5 == null) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                com.ss.android.ugc.aweme.greenscreen.i r5 = r4.f85556a
                java.lang.String r0 = "click_background_entrance"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r5.mo69808L()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r5.f85547v
                if (r5 == 0) goto L_0x001f
                java.lang.String r5 = r5.f107132y
                if (r5 != 0) goto L_0x0021
            L_0x001f:
                java.lang.String r5 = ""
            L_0x0021:
                com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_shoot_page"
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.lang.String r1 = "is_greenscreen"
                r2 = 1
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
                com.ss.android.ugc.aweme.greenscreen.i r5 = r4.f85556a
                boolean r0 = r5.f85546u
                if (r0 != 0) goto L_0x0043
                r5.mo69807K()
                return
            L_0x0043:
                android.app.Activity r0 = r5.f33840g_
                if (r0 != 0) goto L_0x004a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x004a:
                java.lang.String r1 = "activity!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.content.Context r0 = (android.content.Context) r0
                boolean r0 = com.p683ss.android.ugc.aweme.greenscreen.C32889e.m75775a(r0)
                if (r0 == 0) goto L_0x0080
                android.view.View r0 = r5.f85537l
                if (r0 != 0) goto L_0x0060
                java.lang.String r1 = "panelContainer"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0060:
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0074
                com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel r5 = r5.f85544s
                if (r5 != 0) goto L_0x006f
                java.lang.String r0 = "greenScreenViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x006f:
                r0 = 0
                r5.mo69765a(r0)
                return
            L_0x0074:
                com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel r5 = r5.f85544s
                if (r5 != 0) goto L_0x007d
                java.lang.String r0 = "greenScreenViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x007d:
                r5.mo69765a(r2)
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32894i.C32900f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$g */
    static final class C32901g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85557a;

        C32901g(C32894i iVar) {
            this.f85557a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View b = C32894i.m75785b(this.f85557a);
            int i2 = 4;
            boolean z = false;
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            b.setVisibility(i);
            if (booleanValue) {
                Boolean bool = this.f85557a.f85534i;
                if (bool != null) {
                    boolean booleanValue2 = bool.booleanValue();
                    View c = C32894i.m75787c(this.f85557a);
                    if (booleanValue2) {
                        i2 = 0;
                    }
                    c.setVisibility(i2);
                }
            } else {
                C32894i iVar = this.f85557a;
                if (C32894i.m75787c(this.f85557a).getVisibility() == 0) {
                    z = true;
                }
                iVar.f85534i = Boolean.valueOf(z);
                C32894i.m75787c(this.f85557a).setVisibility(4);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$h */
    static final class C32902h extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85558a;

        C32902h(C32894i iVar) {
            this.f85558a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View c = C32894i.m75787c(this.f85558a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            c.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$i */
    static final class C32903i<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85559a;

        C32903i(C32894i iVar) {
            this.f85559a = iVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Boolean bool = (Boolean) obj;
            C32894i iVar = this.f85559a;
            C52711k.m112236a((Object) bool, "it");
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                i = C23728o.m58241a(33.0d) + iVar.f85535j;
            } else {
                i = iVar.f85535j;
            }
            View view = iVar.f85542q;
            if (view == null) {
                C52711k.m112237a("thumbContainer");
            }
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i;
                View view2 = iVar.f85542q;
                if (view2 == null) {
                    C52711k.m112237a("thumbContainer");
                }
                view2.setLayoutParams(layoutParams2);
                if (booleanValue) {
                    i2 = C23728o.m58241a(33.0d) + iVar.f85536k;
                } else {
                    i2 = iVar.f85536k;
                }
                View view3 = iVar.f85537l;
                if (view3 == null) {
                    C52711k.m112237a("panelContainer");
                }
                LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin = i2;
                    View view4 = iVar.f85537l;
                    if (view4 == null) {
                        C52711k.m112237a("panelContainer");
                    }
                    view4.setLayoutParams(layoutParams4);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$j */
    static final class C32904j extends C52712l implements C52682m<C49548a, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85560a;

        C32904j(C32894i iVar) {
            this.f85560a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            if (!TextUtils.isEmpty(str)) {
                ShortVideoContextViewModel shortVideoContextViewModel = this.f85560a.f85543r;
                if (shortVideoContextViewModel == null) {
                    C52711k.m112237a("shortVideoContextViewModel");
                }
                shortVideoContextViewModel.f107134a.f107107bf = str;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$k */
    static final class C32905k extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85561a;

        C32905k(C32894i iVar) {
            this.f85561a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f85561a.mo69811a(booleanValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$l */
    static final class C32906l extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85562a;

        C32906l(C32894i iVar) {
            this.f85562a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            View b = C32894i.m75785b(this.f85562a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            b.setVisibility(i);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$m */
    static final class C32907m extends C52712l implements C52682m<C49548a, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85563a;

        C32907m(C32894i iVar) {
            this.f85563a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(str, "it");
            this.f85563a.mo69809a(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$n */
    static final class C32908n extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32894i f85564a;

        C32908n(C32894i iVar) {
            this.f85564a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            switch (intValue) {
                case 0:
                    C32894i iVar = this.f85564a;
                    Activity activity = iVar.f33840g_;
                    if (activity != null) {
                        C52711k.m112236a((Object) activity, "it");
                        if (!activity.isFinishing()) {
                            Activity activity2 = iVar.f33840g_;
                            if (activity2 == null) {
                                C52711k.m112234a();
                            }
                            C52711k.m112236a((Object) activity2, "activity!!");
                            iVar.f85545t = new C48219q(activity2);
                            Dialog dialog = iVar.f85545t;
                            if (dialog != null) {
                                dialog.show();
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    this.f85564a.mo69806J();
                    this.f85564a.f85546u = true;
                    break;
                case 2:
                    this.f85564a.mo69806J();
                    this.f85564a.f85546u = false;
                    C50275d.m108530a((Context) this.f85564a.f33840g_, (int) R.string.gh8).mo98174a();
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$o */
    public static final class C32909o extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C32894i f85565a;

        C32909o(C32894i iVar) {
            this.f85565a = iVar;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C32894i.m75787c(this.f85565a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.i$p */
    public static final class C32910p extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C32894i f85566a;

        C32910p(C32894i iVar) {
            this.f85566a = iVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C32894i.m75787c(this.f85566a).setVisibility(4);
        }
    }

    /* renamed from: F */
    public final String mo49446F() {
        return "GreenScreenTabScene";
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo69809a(String str) {
        if (C48016e.m103944b(str)) {
            String uri = Uri.fromFile(new File(str)).toString();
            C52711k.m112236a((Object) uri, "Uri.fromFile(File(path)).toString()");
            RemoteImageView remoteImageView = this.f85531F;
            if (remoteImageView == null) {
                C52711k.m112237a("uploadView");
            }
            C50181a.m108292a((SimpleDraweeView) remoteImageView, uri);
            RemoteImageView remoteImageView2 = this.f85531F;
            if (remoteImageView2 == null) {
                C52711k.m112237a("uploadView");
            }
            remoteImageView2.setVisibility(0);
            View view = this.f85532G;
            if (view == null) {
                C52711k.m112237a("thumbBackground");
            }
            view.setVisibility(0);
            RemoteImageView remoteImageView3 = this.f85530E;
            if (remoteImageView3 == null) {
                C52711k.m112237a("thumbView");
            }
            remoteImageView3.setVisibility(4);
            return;
        }
        RemoteImageView remoteImageView4 = this.f85530E;
        if (remoteImageView4 == null) {
            C52711k.m112237a("thumbView");
        }
        C50181a.m108286a((SimpleDraweeView) remoteImageView4, (int) R.drawable.ccq);
        RemoteImageView remoteImageView5 = this.f85531F;
        if (remoteImageView5 == null) {
            C52711k.m112237a("uploadView");
        }
        remoteImageView5.setVisibility(4);
        View view2 = this.f85532G;
        if (view2 == null) {
            C52711k.m112237a("thumbBackground");
        }
        view2.setVisibility(4);
        RemoteImageView remoteImageView6 = this.f85530E;
        if (remoteImageView6 == null) {
            C52711k.m112237a("thumbView");
        }
        remoteImageView6.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo69811a(boolean z) {
        View view = this.f85537l;
        if (view == null) {
            C52711k.m112237a("panelContainer");
        }
        if ((view.getVisibility() == 0) != z) {
            ObjectAnimator objectAnimator = this.f85529D;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                if (z) {
                    View view2 = this.f85537l;
                    if (view2 == null) {
                        C52711k.m112237a("panelContainer");
                    }
                    this.f85529D = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
                    ObjectAnimator objectAnimator2 = this.f85529D;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setDuration(200);
                    }
                    ObjectAnimator objectAnimator3 = this.f85529D;
                    if (objectAnimator3 != null) {
                        objectAnimator3.addListener(new C32909o(this));
                    }
                    ObjectAnimator objectAnimator4 = this.f85529D;
                    if (objectAnimator4 != null) {
                        objectAnimator4.start();
                    }
                } else {
                    View view3 = this.f85537l;
                    if (view3 == null) {
                        C52711k.m112237a("panelContainer");
                    }
                    this.f85529D = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
                    ObjectAnimator objectAnimator5 = this.f85529D;
                    if (objectAnimator5 != null) {
                        objectAnimator5.setDuration(200);
                    }
                    ObjectAnimator objectAnimator6 = this.f85529D;
                    if (objectAnimator6 != null) {
                        objectAnimator6.addListener(new C32910p(this));
                    }
                    ObjectAnimator objectAnimator7 = this.f85529D;
                    if (objectAnimator7 != null) {
                        objectAnimator7.start();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69810a(String str, String str2) {
        mo69811a(false);
        mo69809a(str);
        m75786b(str, str2);
    }

    /* renamed from: a */
    public final void mo47292a(boolean z, int i, List<MediaModel> list) {
        int[] iArr;
        if (this.f85528C != null) {
            ObjectAnimator objectAnimator = this.f85528C;
            if (objectAnimator == null) {
                C52711k.m112234a();
            }
            objectAnimator.cancel();
            this.f85528C = null;
        }
        View view = this.f85539n;
        if (view == null) {
            C52711k.m112237a("loadingLayout");
        }
        view.setVisibility(4);
        View view2 = this.f85540o;
        if (view2 == null) {
            C52711k.m112237a("selectShadow");
        }
        view2.setVisibility(4);
        View view3 = this.f85541p;
        if (view3 == null) {
            C52711k.m112237a("unSelectShadow");
        }
        view3.setVisibility(4);
        this.f85533H = true;
        ArrayList arrayList = new ArrayList();
        if (z && list != null) {
            Iterable iterable = list;
            Collection arrayList2 = new ArrayList();
            for (Object next : iterable) {
                String str = ((MediaModel) next).f95383b;
                C52711k.m112236a((Object) str, "it.filePath");
                if (!C50200d.m108346a(str)) {
                    iArr = new int[]{0, 0};
                } else {
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    iArr = new int[]{options.outWidth, options.outHeight};
                }
                if (iArr[0] >= 360 && iArr[1] >= 480) {
                    arrayList2.add(next);
                }
            }
            Iterable<MediaModel> iterable2 = (List) arrayList2;
            Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (MediaModel mediaModel : iterable2) {
                arrayList.add(mediaModel.f95383b);
                String str2 = mediaModel.f95383b;
                C52711k.m112236a((Object) str2, "it.filePath");
                arrayList3.add(new C46487b(str2, "", false));
            }
            C32891g gVar = this.f85538m;
            if (gVar == null) {
                C52711k.m112237a("adapter");
            }
            List list2 = arrayList;
            C52711k.m112240b(list2, "images");
            gVar.f85518b.clear();
            gVar.f85518b.addAll(list2);
            gVar.notifyDataSetChanged();
        }
        if (arrayList.isEmpty()) {
            View view4 = this.f85539n;
            if (view4 == null) {
                C52711k.m112237a("loadingLayout");
            }
            view4.setVisibility(0);
            View view5 = this.f85526A;
            if (view5 == null) {
                C52711k.m112237a("loadingImage");
            }
            view5.setVisibility(4);
            TextView textView = this.f85527B;
            if (textView == null) {
                C52711k.m112237a("loadingText");
            }
            textView.setText(R.string.ghc);
            View view6 = this.f85540o;
            if (view6 == null) {
                C52711k.m112237a("selectShadow");
            }
            view6.setVisibility(0);
            View view7 = this.f85541p;
            if (view7 == null) {
                C52711k.m112237a("unSelectShadow");
            }
            view7.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: I */
    public final void mo69805I() {
        mo69809a("");
        m75786b("", "");
    }

    /* renamed from: H */
    public final void mo49448H() {
        this.f85534i = null;
        mo69809a("");
        C32891g gVar = this.f85538m;
        if (gVar == null) {
            C52711k.m112237a("adapter");
        }
        gVar.mo69803a();
    }

    /* renamed from: J */
    public final void mo69806J() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            C52711k.m112236a((Object) activity, "it");
            if (!activity.isFinishing()) {
                Dialog dialog = this.f85545t;
                if (dialog != null) {
                    C32911j.m75820a(dialog);
                }
                this.f85545t = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public final String mo69808L() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.f85543r;
        if (shortVideoContextViewModel == null) {
            C52711k.m112237a("shortVideoContextViewModel");
        }
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
        if (shortVideoContext != null) {
            return shortVideoContext.f107131x;
        }
        return null;
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        ObjectAnimator objectAnimator = this.f85529D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f85528C;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    /* renamed from: G */
    public final void mo49447G() {
        this.f85534i = null;
        View view = this.f85542q;
        if (view == null) {
            C52711k.m112237a("thumbContainer");
        }
        view.setVisibility(0);
        View view2 = this.f85537l;
        if (view2 == null) {
            C52711k.m112237a("panelContainer");
        }
        view2.setVisibility(4);
        mo69807K();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public final void mo69807K() {
        String str;
        ShortVideoContext shortVideoContext = this.f85547v;
        if (shortVideoContext != null) {
            str = shortVideoContext.f107107bf;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C32888d.m75772a(C32893h.m75781a(str));
        }
        Activity activity = this.f33840g_;
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        if (C32889e.m75775a((Context) activity)) {
            if (!C32911j.m75821a((Context) this.f33840g_)) {
                C50275d.m108530a((Context) this.f33840g_, (int) R.string.gh8).mo98174a();
                return;
            }
            GreenScreenViewModel greenScreenViewModel = this.f85544s;
            if (greenScreenViewModel == null) {
                C52711k.m112237a("greenScreenViewModel");
            }
            greenScreenViewModel.mo69766f();
            if (!this.f85533H) {
                m75783N();
                C22795c.m56156a().mo47268a(3, 100, 0, this);
            }
        }
    }

    /* renamed from: N */
    private final void m75783N() {
        View view = this.f85539n;
        if (view == null) {
            C52711k.m112237a("loadingLayout");
        }
        view.setVisibility(0);
        View view2 = this.f85526A;
        if (view2 == null) {
            C52711k.m112237a("loadingImage");
        }
        view2.setVisibility(0);
        TextView textView = this.f85527B;
        if (textView == null) {
            C52711k.m112237a("loadingText");
        }
        textView.setText(R.string.dnt);
        View view3 = this.f85526A;
        if (view3 == null) {
            C52711k.m112237a("loadingImage");
        }
        this.f85528C = ObjectAnimator.ofFloat(view3, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.f85528C;
        if (objectAnimator == null) {
            C52711k.m112234a();
        }
        objectAnimator.setDuration(800);
        ObjectAnimator objectAnimator2 = this.f85528C;
        if (objectAnimator2 == null) {
            C52711k.m112234a();
        }
        objectAnimator2.setRepeatMode(1);
        ObjectAnimator objectAnimator3 = this.f85528C;
        if (objectAnimator3 == null) {
            C52711k.m112234a();
        }
        objectAnimator3.setRepeatCount(-1);
        ObjectAnimator objectAnimator4 = this.f85528C;
        if (objectAnimator4 == null) {
            C52711k.m112234a();
        }
        objectAnimator4.start();
        View view4 = this.f85540o;
        if (view4 == null) {
            C52711k.m112237a("selectShadow");
        }
        view4.setVisibility(0);
        View view5 = this.f85541p;
        if (view5 == null) {
            C52711k.m112237a("unSelectShadow");
        }
        view5.setVisibility(0);
    }

    /* renamed from: a */
    public static final /* synthetic */ C32891g m75784a(C32894i iVar) {
        C32891g gVar = iVar.f85538m;
        if (gVar == null) {
            C52711k.m112237a("adapter");
        }
        return gVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m75785b(C32894i iVar) {
        View view = iVar.f85542q;
        if (view == null) {
            C52711k.m112237a("thumbContainer");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m75787c(C32894i iVar) {
        View view = iVar.f85537l;
        if (view == null) {
            C52711k.m112237a("panelContainer");
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69812b(boolean r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "creation_id"
            java.lang.String r2 = r3.mo69808L()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r3.f85547v
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.f107132y
            if (r2 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r2 = ""
        L_0x001a:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "is_greenscreen"
            r2 = 1
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
            if (r4 == 0) goto L_0x0036
            java.lang.String r4 = "background_type"
            java.lang.String r1 = "empty"
            r0.mo47829a(r4, r1)
        L_0x0036:
            java.lang.String r4 = "background_click"
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.greenscreen.C32894i.mo69812b(boolean):void");
    }

    /* renamed from: b */
    private final void m75786b(String str, String str2) {
        GreenScreenViewModel greenScreenViewModel = this.f85544s;
        if (greenScreenViewModel == null) {
            C52711k.m112237a("greenScreenViewModel");
        }
        greenScreenViewModel.mo69764a(str, str2);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bro, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.b9g);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.layout_rv_face_matting)");
        this.f85548x = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f85548x;
        if (recyclerView == null) {
            C52711k.m112237a("mRecyclerView");
        }
        RecyclerView recyclerView2 = this.f85548x;
        if (recyclerView2 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        View findViewById2 = inflate.findViewById(R.id.b41);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.iv_select)");
        this.f85549y = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.eg6);
        C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.iv_un_select)");
        this.f85550z = findViewById3;
        View view = this.f85549y;
        if (view == null) {
            C52711k.m112237a("selectPhotoView");
        }
        view.setOnClickListener(new C32897c(this, 500));
        View view2 = this.f85550z;
        if (view2 == null) {
            C52711k.m112237a("unselectedView");
        }
        view2.setOnClickListener(new C32898d(this));
        this.f85538m = new C32891g(new C32899e(this));
        RecyclerView recyclerView3 = this.f85548x;
        if (recyclerView3 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C32891g gVar = this.f85538m;
        if (gVar == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView3.setAdapter(gVar);
        RecyclerView recyclerView4 = this.f85548x;
        if (recyclerView4 == null) {
            C52711k.m112237a("mRecyclerView");
        }
        C1327f itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            View findViewById4 = inflate.findViewById(R.id.ek4);
            C52711k.m112236a((Object) findViewById4, "rootView.findViewById(R.id.ll_load)");
            this.f85539n = findViewById4;
            View findViewById5 = inflate.findViewById(R.id.b25);
            C52711k.m112236a((Object) findViewById5, "rootView.findViewById(R.id.iv_loading)");
            this.f85526A = findViewById5;
            View findViewById6 = inflate.findViewById(R.id.f37);
            C52711k.m112236a((Object) findViewById6, "rootView.findViewById(R.id.tv_loading_msg)");
            this.f85527B = (TextView) findViewById6;
            View findViewById7 = inflate.findViewById(R.id.efs);
            C52711k.m112236a((Object) findViewById7, "rootView.findViewById(R.id.iv_select_shadow)");
            this.f85540o = findViewById7;
            View findViewById8 = inflate.findViewById(R.id.eg7);
            C52711k.m112236a((Object) findViewById8, "rootView.findViewById(R.id.iv_un_select_shadow)");
            this.f85541p = findViewById8;
            View findViewById9 = inflate.findViewById(R.id.ea2);
            C52711k.m112236a((Object) findViewById9, "rootView.findViewById(R.….greenscreen_effect_icon)");
            this.f85530E = (RemoteImageView) findViewById9;
            View findViewById10 = inflate.findViewById(R.id.ea4);
            C52711k.m112236a((Object) findViewById10, "rootView.findViewById(R.….greenscreen_upload_icon)");
            this.f85531F = (RemoteImageView) findViewById10;
            View findViewById11 = inflate.findViewById(R.id.dqv);
            C52711k.m112236a((Object) findViewById11, "rootView.findViewById(R.id.view_bg)");
            this.f85532G = findViewById11;
            View findViewById12 = inflate.findViewById(R.id.ezy);
            C52711k.m112236a((Object) findViewById12, "rootView.findViewById(R.id.thumb_container)");
            this.f85542q = findViewById12;
            View findViewById13 = inflate.findViewById(R.id.bw1);
            C52711k.m112236a((Object) findViewById13, "rootView.findViewById(R.id.panel_container)");
            this.f85537l = findViewById13;
            inflate.findViewById(R.id.ea3).setOnClickListener(new C32900f(this));
            Activity activity = this.f33840g_;
            if (activity != null) {
                C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                this.f85543r = (ShortVideoContextViewModel) a;
                ShortVideoContextViewModel shortVideoContextViewModel = this.f85543r;
                if (shortVideoContextViewModel == null) {
                    C52711k.m112237a("shortVideoContextViewModel");
                }
                this.f85547v = shortVideoContextViewModel.f107134a;
                Activity activity2 = this.f33840g_;
                if (activity2 != null) {
                    JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(GreenScreenViewModel.class);
                    C52711k.m112236a((Object) a2, "JediViewModelProviders.o…eenViewModel::class.java]");
                    this.f85544s = (GreenScreenViewModel) a2;
                    GreenScreenViewModel greenScreenViewModel = this.f85544s;
                    if (greenScreenViewModel == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    Activity activity3 = this.f33840g_;
                    if (activity3 == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) activity3, "activity!!");
                    C29252f a3 = C29242c.m68869a(activity3, null);
                    C52711k.m112240b(a3, "effectPlatform");
                    greenScreenViewModel.f85466d = a3;
                    GreenScreenViewModel greenScreenViewModel2 = this.f85544s;
                    if (greenScreenViewModel2 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49445d(greenScreenViewModel2, C32912k.f85567a, new C11934u(), new C32905k(this));
                    GreenScreenViewModel greenScreenViewModel3 = this.f85544s;
                    if (greenScreenViewModel3 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49443b(greenScreenViewModel3, C32915n.f85570a, new C11934u(), new C32906l(this));
                    GreenScreenViewModel greenScreenViewModel4 = this.f85544s;
                    if (greenScreenViewModel4 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49443b(greenScreenViewModel4, C32916o.f85571a, new C11934u(), new C32907m(this));
                    GreenScreenViewModel greenScreenViewModel5 = this.f85544s;
                    if (greenScreenViewModel5 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49444c(greenScreenViewModel5, C32917p.f85572a, new C11934u(), new C32908n(this));
                    GreenScreenViewModel greenScreenViewModel6 = this.f85544s;
                    if (greenScreenViewModel6 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49443b(greenScreenViewModel6, C32918q.f85573a, new C11934u(), new C32901g(this));
                    GreenScreenViewModel greenScreenViewModel7 = this.f85544s;
                    if (greenScreenViewModel7 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49444c(greenScreenViewModel7, C32913l.f85568a, new C11934u(), new C32902h(this));
                    FragmentActivity a4 = C12932b.m25976a(this);
                    if (a4 == null) {
                        C52711k.m112234a();
                    }
                    ((C43859a) C2755a.m7851a(a4).mo7339a(C43859a.class)).mo89401d().mo7352a(this, new C32903i(this));
                    GreenScreenViewModel greenScreenViewModel8 = this.f85544s;
                    if (greenScreenViewModel8 == null) {
                        C52711k.m112237a("greenScreenViewModel");
                    }
                    mo49444c(greenScreenViewModel8, C32914m.f85569a, new C11934u(), new C32904j(this));
                    C52711k.m112236a((Object) inflate, "rootView");
                    return inflate;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
