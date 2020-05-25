package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24440i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43458e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52859w;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.ca */
public final class C49340ca {

    /* renamed from: a */
    C10660a f123887a;

    /* renamed from: b */
    public C10660a f123888b;

    /* renamed from: c */
    public final FragmentActivity f123889c;

    /* renamed from: d */
    public final EditViewModel f123890d;

    /* renamed from: e */
    public final EditToolbarViewModel f123891e;

    /* renamed from: f */
    final C12896b f123892f;

    /* renamed from: g */
    private final C1689b f123893g = new C1689b();

    /* renamed from: h */
    private final List<C52847n<LiveData<Object>, C0199s<Object>>> f123894h = new ArrayList();

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$a */
    public static final class C49341a implements C24440i {

        /* renamed from: a */
        final /* synthetic */ C49340ca f123895a;

        /* renamed from: b */
        final /* synthetic */ View f123896b;

        /* renamed from: com.ss.android.ugc.gamora.editor.ca$a$a */
        static final class C49342a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C49341a f123897a;

            C49342a(C49341a aVar) {
                this.f123897a = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
                if (r2.mo323a() != android.arch.lifecycle.C0176h.C0178b.RESUMED) goto L_0x0095;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.ss.android.ugc.gamora.editor.ca$a r0 = r4.f123897a
                    com.ss.android.ugc.gamora.editor.ca r0 = r0.f123895a
                    com.ss.android.ugc.gamora.editor.ca$a r1 = r4.f123897a
                    android.view.View r1 = r1.f123896b
                    com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f123890d
                    boolean r2 = r2.mo97046p()
                    if (r2 != 0) goto L_0x0018
                    com.ss.android.ugc.gamora.editor.EditToolbarViewModel r2 = r0.f123891e
                    com.ss.android.ugc.gamora.editor.c r2 = r2.f123208e
                    boolean r2 = r2.f123884d
                    if (r2 == 0) goto L_0x009e
                L_0x0018:
                    com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f123890d
                    boolean r2 = r2.mo97046p()
                    if (r2 == 0) goto L_0x0036
                    com.ss.android.ugc.gamora.editor.EditToolbarViewModel r2 = r0.f123891e
                    com.ss.android.ugc.gamora.editor.c r2 = r2.f123208e
                    boolean r2 = r2.f123882b
                    if (r2 == 0) goto L_0x0036
                    com.ss.android.ugc.aweme.port.in.ak r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                    com.ss.android.ugc.aweme.port.in.ab r2 = r2.mo58604b()
                    boolean r2 = r2.mo80583e()
                    if (r2 == 0) goto L_0x0091
                L_0x0036:
                    com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f123890d
                    boolean r2 = r2.mo97046p()
                    if (r2 != 0) goto L_0x009e
                    com.ss.android.ugc.aweme.port.in.ak r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                    com.ss.android.ugc.aweme.port.in.ab r2 = r2.mo58604b()
                    boolean r2 = r2.mo80583e()
                    if (r2 != 0) goto L_0x009d
                    com.ss.android.ugc.gamora.editor.EditToolbarViewModel r2 = r0.f123891e
                    com.ss.android.ugc.gamora.editor.c r2 = r2.f123208e
                    boolean r2 = r2.f123885e
                    if (r2 == 0) goto L_0x005f
                    com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f123890d
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo97035e()
                    int r2 = r2.mOrigin
                    if (r2 != 0) goto L_0x005f
                    goto L_0x009d
                L_0x005f:
                    com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                    com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
                    if (r2 != 0) goto L_0x009e
                    com.bytedance.scene.group.b r2 = r0.f123892f
                    java.lang.String r3 = "MusicScene"
                    com.bytedance.scene.i r2 = r2.mo24388a(r3)
                    com.ss.android.ugc.gamora.editor.am r2 = (com.p683ss.android.ugc.gamora.editor.C49115am) r2
                    if (r2 == 0) goto L_0x007a
                    boolean r2 = r2.mo97140I()
                    goto L_0x007b
                L_0x007a:
                    r2 = 0
                L_0x007b:
                    if (r2 != 0) goto L_0x0095
                    android.support.v4.app.FragmentActivity r2 = r0.f123889c
                    android.arch.lifecycle.h r2 = r2.getLifecycle()
                    java.lang.String r3 = "activity.lifecycle"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                    android.arch.lifecycle.h$b r2 = r2.mo323a()
                    android.arch.lifecycle.h$b r3 = android.arch.lifecycle.C0176h.C0178b.RESUMED
                    if (r2 == r3) goto L_0x0091
                    goto L_0x0095
                L_0x0091:
                    r0.mo97283a(r1)
                    goto L_0x009e
                L_0x0095:
                    com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r0.f123891e
                    com.ss.android.ugc.gamora.editor.c r0 = r0.f123208e
                    r1 = 1
                    r0.f123883c = r1
                    return
                L_0x009d:
                    return
                L_0x009e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49340ca.C49341a.C49342a.run():void");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50206a() {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.port.in.ak r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
                com.ss.android.ugc.aweme.port.in.ab r0 = r0.mo58604b()
                com.ss.android.ugc.aweme.port.in.ab$b r0 = r0.mo80585g()
                com.ss.android.ugc.aweme.bw.a.e r0 = r0.mo80587a()
                com.ss.android.ugc.gamora.editor.ca r1 = r8.f123895a
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r1.f123891e
                com.ss.android.ugc.gamora.editor.c r1 = r1.f123208e
                boolean r2 = r0.mo50196a()
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L_0x002e
                java.lang.Integer r2 = r0.mo50197b()
                if (r2 != 0) goto L_0x0025
                goto L_0x002c
            L_0x0025:
                int r2 = r2.intValue()
                r5 = 3
                if (r2 == r5) goto L_0x002e
            L_0x002c:
                r2 = 1
                goto L_0x002f
            L_0x002e:
                r2 = 0
            L_0x002f:
                r1.f123884d = r2
                com.ss.android.ugc.gamora.editor.ca r1 = r8.f123895a
                android.support.v4.app.FragmentActivity r1 = r1.f123889c
                com.ss.android.ugc.gamora.editor.ca$a$a r2 = new com.ss.android.ugc.gamora.editor.ca$a$a
                r2.<init>(r8)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r1.runOnUiThread(r2)
                com.ss.android.ugc.gamora.editor.ca r1 = r8.f123895a
                com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r1.f123891e
                com.ss.android.ugc.gamora.editor.c r1 = r1.f123208e
                boolean r1 = r1.f123884d
                if (r1 != 0) goto L_0x004a
                return
            L_0x004a:
                long r1 = r0.mo50198c()
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 >= 0) goto L_0x0055
                return
            L_0x0055:
                com.ss.android.ugc.gamora.editor.ca r1 = r8.f123895a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r1.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                java.lang.String r2 = "model"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                java.lang.String r2 = "aiChooseMusicResult"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                boolean r5 = r0.mo50196a()
                if (r5 != 0) goto L_0x009c
                java.util.List r5 = r0.mo50199d()
                if (r5 != 0) goto L_0x007b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x007b:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L_0x0082:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x009c
                java.lang.Object r7 = r5.next()
                com.ss.android.ugc.aweme.shortvideo.c r7 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r7
                if (r6 == 0) goto L_0x0095
                java.lang.String r6 = ","
                r2.append(r6)
            L_0x0095:
                java.lang.String r6 = r7.mid
                r2.append(r6)
                r6 = 1
                goto L_0x0082
            L_0x009c:
                java.lang.String r3 = "music_upload_done"
                com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r6 = "creation_id"
                java.lang.String r1 = r1.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r5.mo47829a(r6, r1)
                java.lang.String r5 = "enter_from"
                java.lang.String r6 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
                java.lang.String r5 = "music_upload_num"
                java.util.List r6 = r0.mo50199d()
                if (r6 == 0) goto L_0x00be
                int r4 = r6.size()
            L_0x00be:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r5, r4)
                java.lang.String r4 = "music_upload_duration"
                long r5 = r0.mo50198c()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47827a(r4, r5)
                java.lang.String r4 = "music_id_list"
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r2)
                java.lang.String r2 = "music_rec_type"
                java.lang.Integer r4 = r0.mo50197b()
                if (r4 == 0) goto L_0x00e3
                int r4 = r4.intValue()
                goto L_0x00e4
            L_0x00e3:
                r4 = 2
            L_0x00e4:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r1)
                r1 = -1
                r0.mo50195a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49340ca.C49341a.mo50206a():void");
        }

        C49341a(C49340ca caVar, View view) {
            this.f123895a = caVar;
            this.f123896b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$b */
    static final class C49343b extends C52712l implements C52671b<Drawable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43458e f123898a;

        C49343b(C43458e eVar) {
            this.f123898a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Drawable drawable = (Drawable) obj;
            C52711k.m112240b(drawable, "it");
            this.f123898a.setIcon(drawable);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$c */
    static final class C49344c extends C52712l implements C52671b<C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49340ca f123899a;

        /* renamed from: b */
        final /* synthetic */ C43458e f123900b;

        C49344c(C49340ca caVar, C43458e eVar) {
            this.f123899a = caVar;
            this.f123900b = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C52860x) obj, "it");
            this.f123900b.animate().setStartDelay(50).scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C49344c f123901a;

                {
                    this.f123901a = r1;
                }

                public final void run() {
                    this.f123901a.f123900b.setIcon((int) R.drawable.e4);
                    this.f123901a.f123900b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C493451 f123902a;

                        {
                            this.f123902a = r1;
                        }

                        public final void run() {
                            JediViewModel a = C48927d.m105736a(this.f123902a.f123901a.f123899a.f123889c).mo96760a(EditAutoEnhanceViewModel.class);
                            C52711k.m112236a((Object) a, "JediViewModelProviders.o…nceViewModel::class.java)");
                            ((EditAutoEnhanceViewModel) a).mo22530c(C48934a.f123105a);
                        }
                    }).start();
                }
            }).start();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$d */
    static final class C49347d extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43458e f123903a;

        C49347d(C43458e eVar) {
            this.f123903a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            this.f123903a.setText(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$e */
    static final class C49348e extends C52712l implements C52671b<Drawable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43458e f123904a;

        C49348e(C43458e eVar) {
            this.f123904a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Drawable drawable = (Drawable) obj;
            C52711k.m112240b(drawable, "it");
            this.f123904a.setIcon(drawable);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$f */
    static final class C49349f<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f123905a;

        C49349f(View view) {
            this.f123905a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f123905a;
                C52711k.m112236a((Object) bool, "it");
                view.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    this.f123905a.setAlpha(1.0f);
                } else {
                    this.f123905a.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$g */
    static final class C49350g<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49340ca f123906a;

        /* renamed from: b */
        final /* synthetic */ int f123907b;

        /* renamed from: c */
        final /* synthetic */ View f123908c;

        /* renamed from: d */
        final /* synthetic */ int f123909d;

        C49350g(C49340ca caVar, int i, View view, int i2) {
            this.f123906a = caVar;
            this.f123907b = i;
            this.f123908c = view;
            this.f123909d = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x03a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                if (r14 == 0) goto L_0x0407
                com.ss.android.ugc.gamora.editor.ca r0 = r13.f123906a
                int r1 = r13.f123907b
                java.lang.String r2 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r14, r2)
                boolean r14 = r14.booleanValue()
                android.view.View r2 = r13.f123908c
                int r3 = r13.f123909d
                r3 = 6
                r4 = 5000(0x1388, double:2.4703E-320)
                r6 = 1
                if (r1 == r3) goto L_0x036d
                r3 = 9
                r7 = 3000(0xbb8, double:1.482E-320)
                if (r1 == r3) goto L_0x032d
                r3 = 12
                r9 = 1082130432(0x40800000, float:4.0)
                r10 = 1090519040(0x41000000, float:8.0)
                r11 = 1077936128(0x40400000, float:3.0)
                r12 = 48
                if (r1 == r3) goto L_0x02cd
                r3 = 0
                switch(r1) {
                    case 1: goto L_0x0212;
                    case 2: goto L_0x0145;
                    case 3: goto L_0x011a;
                    case 4: goto L_0x0033;
                    default: goto L_0x0031;
                }
            L_0x0031:
                goto L_0x0406
            L_0x0033:
                if (r14 == 0) goto L_0x0406
                boolean r14 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96183a()
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                boolean r1 = r1.isReviewVideo()
                boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96186b(r1)
                if (r1 != 0) goto L_0x0059
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                boolean r1 = r1.isReviewVideo()
                boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96187c(r1)
                if (r1 == 0) goto L_0x005a
            L_0x0059:
                r3 = 1
            L_0x005a:
                if (r14 == 0) goto L_0x0060
                r1 = 2132544120(0x7f1c0a78, float:2.0741392E38)
                goto L_0x0069
            L_0x0060:
                if (r3 == 0) goto L_0x0066
                r1 = 2132543548(0x7f1c083c, float:2.0740232E38)
                goto L_0x0069
            L_0x0066:
                r1 = 2132544294(0x7f1c0b26, float:2.0741745E38)
            L_0x0069:
                com.bytedance.ies.dmt.ui.bubbleview.a$a r9 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r10 = r0.f123889c
                android.app.Activity r10 = (android.app.Activity) r10
                r9.<init>(r10)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r9.mo19015b(r1)
                if (r3 == 0) goto L_0x0079
                r4 = r7
            L_0x0079:
                com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r1.mo19010a(r4)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r1 = r1.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r1 = r1.mo19014a()
                r1.mo18999a(r2, r12, r6)
                boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96183a()
                if (r1 == 0) goto L_0x0094
                java.lang.String r1 = "sticker_donation"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r1, r6)
                goto L_0x00c5
            L_0x0094:
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                boolean r1 = r1.isReviewVideo()
                boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96186b(r1)
                if (r1 == 0) goto L_0x00aa
                java.lang.String r1 = "sticker_lyric_music"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r1, r6)
                goto L_0x00c5
            L_0x00aa:
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo97035e()
                boolean r1 = r1.isReviewVideo()
                boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96187c(r1)
                if (r1 == 0) goto L_0x00c0
                java.lang.String r1 = "sticker_lyric_no_music"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r1, r6)
                goto L_0x00c5
            L_0x00c0:
                java.lang.String r1 = "sticker"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r1, r6)
            L_0x00c5:
                if (r14 == 0) goto L_0x00ca
                java.lang.String r14 = "donation_sticker"
                goto L_0x00d1
            L_0x00ca:
                if (r3 == 0) goto L_0x00cf
                java.lang.String r14 = "lyrics_sticker"
                goto L_0x00d1
            L_0x00cf:
                java.lang.String r14 = "info_sticker"
            L_0x00d1:
                java.lang.String r1 = "function_toast_show"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "creation_id"
                com.ss.android.ugc.gamora.editor.EditViewModel r4 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r4.mo97035e()
                java.lang.String r4 = r4.creationId
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "content_type"
                com.ss.android.ugc.gamora.editor.EditViewModel r4 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r4.mo97035e()
                java.lang.String r4 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r4)
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "content_source"
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47829a(r3, r0)
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
                java.lang.String r2 = "type"
                com.ss.android.ugc.aweme.app.f.d r14 = r0.mo47829a(r2, r14)
                java.util.Map<java.lang.String, java.lang.String> r14 = r14.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r14)
                goto L_0x0407
            L_0x011a:
                if (r14 == 0) goto L_0x0406
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                r1 = 2132543572(0x7f1c0854, float:2.074028E38)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r4)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r14.mo19014a()
                r14.mo18999a(r2, r12, r6)
                java.lang.String r14 = "text"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                r0.mo97291c()
                goto L_0x0407
            L_0x0145:
                if (r14 == 0) goto L_0x020d
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = r0.f123890d
                boolean r14 = r14.mo97046p()
                if (r14 != 0) goto L_0x0169
                com.ss.android.ugc.aweme.port.in.u r14 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r14 = r14.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CombinedShootModeTipShown
                boolean r14 = r14.mo83117a(r1)
                if (r14 == 0) goto L_0x0407
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r14.mo97035e()
                int r14 = r14.mOrigin
                if (r14 != 0) goto L_0x0407
            L_0x0169:
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r0.f123887a
                if (r14 != 0) goto L_0x0197
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r0.f123890d
                boolean r1 = r1.mo97046p()
                if (r1 == 0) goto L_0x0182
                r1 = 2132544291(0x7f1c0b23, float:2.074174E38)
                goto L_0x0185
            L_0x0182:
                r1 = 2132544328(0x7f1c0b48, float:2.0741814E38)
            L_0x0185:
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r4)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r14.mo19014a()
                r0.f123887a = r14
            L_0x0197:
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r0.f123887a
                if (r14 == 0) goto L_0x0407
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.content.Context r1 = (android.content.Context) r1
                float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r11)
                r14.mo18997a(r2, r12, r1, r3)
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = r0.f123890d
                boolean r14 = r14.mo97046p()
                if (r14 == 0) goto L_0x01fe
                java.lang.String r14 = "effect"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                java.lang.String r14 = "function_toast_show"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = r3.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_type"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r3)
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_source"
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "type"
                java.lang.String r2 = "effect"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
                goto L_0x0407
            L_0x01fe:
                com.ss.android.ugc.aweme.port.in.u r14 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.property.l r14 = r14.mo58574e()
                com.ss.android.ugc.aweme.property.l$a r0 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CombinedShootModeTipShown
                r14.mo83116a(r0, r3)
                goto L_0x0406
            L_0x020d:
                r0.mo97288b()
                goto L_0x0407
            L_0x0212:
                if (r14 == 0) goto L_0x02b8
                boolean r14 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
                if (r14 == 0) goto L_0x021f
                r0.mo97283a(r2)
                goto L_0x0406
            L_0x021f:
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                r1 = 2132544292(0x7f1c0b24, float:2.0741741E38)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r4)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r14.mo19014a()
                int r1 = r14.mo19005e()
                int r4 = r2.getMeasuredWidth()
                int r1 = r1 - r4
                float r1 = (float) r1
                android.support.v4.app.FragmentActivity r4 = r0.f123889c
                android.content.Context r4 = (android.content.Context) r4
                float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r10)
                float r1 = r1 + r4
                android.support.v4.app.FragmentActivity r4 = r0.f123889c
                android.content.Context r4 = (android.content.Context) r4
                float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r11)
                float r1 = r1 + r4
                android.support.v4.app.FragmentActivity r4 = r0.f123889c
                android.content.Context r4 = (android.content.Context) r4
                boolean r4 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r4)
                if (r4 == 0) goto L_0x0265
                r14.mo18997a(r2, r12, r1, r3)
                goto L_0x0268
            L_0x0265:
                r14.mo18997a(r2, r12, r9, r3)
            L_0x0268:
                java.lang.String r14 = "music"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                java.lang.String r14 = "function_toast_show"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = r3.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_type"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r3)
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_source"
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "type"
                java.lang.String r2 = "music"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
                goto L_0x0407
            L_0x02b8:
                boolean r14 = com.p683ss.android.ugc.gamora.editor.EditViewModel.m105818D()
                if (r14 == 0) goto L_0x0407
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r0.f123888b
                if (r14 == 0) goto L_0x0407
                boolean r0 = r14.isShowing()
                if (r0 == 0) goto L_0x0406
                r14.dismiss()
                goto L_0x0406
            L_0x02cd:
                if (r14 == 0) goto L_0x0406
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                r1 = 2132543535(0x7f1c082f, float:2.0740206E38)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r7)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r14.mo19014a()
                int r1 = r14.mo19005e()
                int r3 = r2.getMeasuredWidth()
                int r1 = r1 - r3
                float r1 = (float) r1
                android.support.v4.app.FragmentActivity r3 = r0.f123889c
                android.content.Context r3 = (android.content.Context) r3
                float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r10)
                float r1 = r1 + r3
                android.support.v4.app.FragmentActivity r3 = r0.f123889c
                android.content.Context r3 = (android.content.Context) r3
                float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r11)
                float r3 = r3 + r1
                android.support.v4.app.FragmentActivity r4 = r0.f123889c
                android.content.Context r4 = (android.content.Context) r4
                boolean r4 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r4)
                if (r4 == 0) goto L_0x0317
                int r0 = (int) r1
                int r0 = -r0
                r14.mo18997a(r2, r12, r3, r0)
                goto L_0x0326
            L_0x0317:
                android.support.v4.app.FragmentActivity r0 = r0.f123889c
                android.content.Context r0 = (android.content.Context) r0
                r1 = 1094713344(0x41400000, float:12.0)
                float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
                int r0 = (int) r0
                int r0 = -r0
                r14.mo18997a(r2, r12, r9, r0)
            L_0x0326:
                java.lang.String r14 = "status_background"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                goto L_0x0406
            L_0x032d:
                if (r14 == 0) goto L_0x0406
                com.ss.android.ugc.gamora.editor.EditViewModel r14 = r0.f123890d
                boolean r14 = r14.mo97047q()
                if (r14 != 0) goto L_0x0407
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                r1 = 2132542167(0x7f1c02d7, float:2.0737431E38)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r7)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                com.bytedance.ies.dmt.ui.bubbleview.a r14 = r14.mo19014a()
                r14.update()
                android.support.v4.app.FragmentActivity r0 = r0.f123889c
                android.content.Context r0 = (android.content.Context) r0
                boolean r0 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r0)
                if (r0 == 0) goto L_0x0362
                r0 = 5
                goto L_0x0363
            L_0x0362:
                r0 = 3
            L_0x0363:
                r14.mo18999a(r2, r0, r6)
                java.lang.String r14 = "auto_enhance"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                goto L_0x0407
            L_0x036d:
                if (r14 == 0) goto L_0x0406
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
                android.support.v4.app.FragmentActivity r1 = r0.f123889c
                android.app.Activity r1 = (android.app.Activity) r1
                r14.<init>(r1)
                r1 = 2132544295(0x7f1c0b27, float:2.0741747E38)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19015b(r1)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19010a(r4)
                com.bytedance.ies.dmt.ui.bubbleview.a$a r14 = r14.mo19013a(r6)
                int r1 = r2.getHeight()
                if (r1 != 0) goto L_0x03a7
                com.bytedance.scene.group.b r1 = r0.f123892f
                java.lang.String r2 = "EditTitleBarScene"
                com.bytedance.scene.i r1 = r1.mo24388a(r2)
                com.ss.android.ugc.gamora.editor.bu r1 = (com.p683ss.android.ugc.gamora.editor.C49321bu) r1
                if (r1 == 0) goto L_0x03a0
                com.ss.android.ugc.aweme.shortvideo.edit.g r1 = r1.f123858o
                if (r1 == 0) goto L_0x03a0
                android.view.View r1 = r1.f109874b
                goto L_0x03a1
            L_0x03a0:
                r1 = 0
            L_0x03a1:
                if (r1 == 0) goto L_0x0406
                r0.mo97284a(r14, r1)
                goto L_0x03b7
            L_0x03a7:
                r1 = 2132017874(0x7f1402d2, float:1.9674039E38)
                android.view.View r1 = r2.findViewById(r1)
                if (r1 == 0) goto L_0x03b4
                r0.mo97284a(r14, r1)
                goto L_0x03b7
            L_0x03b4:
                r0.mo97284a(r14, r2)
            L_0x03b7:
                java.lang.String r14 = "voice"
                com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r.m96180a(r14, r6)
                java.lang.String r14 = "function_toast_show"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = r3.creationId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_type"
                com.ss.android.ugc.gamora.editor.EditViewModel r3 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo97035e()
                java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95202a(r3)
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "content_source"
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = r0.f123890d
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo97035e()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95207b(r0)
                com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r2, r0)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "video_edit_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "type"
                java.lang.String r2 = "voice"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
                goto L_0x0407
            L_0x0406:
                return
            L_0x0407:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49340ca.C49350g.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$h */
    static final class C49351h<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f123910a;

        C49351h(View view) {
            this.f123910a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    this.f123910a.setAlpha(1.0f);
                } else {
                    this.f123910a.setAlpha(0.5f);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$i */
    static final class C49352i<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f123911a;

        C49352i(View view) {
            this.f123911a = view;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                View view = this.f123911a;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$j */
    static final class C49353j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49340ca f123912a;

        /* renamed from: b */
        final /* synthetic */ View f123913b;

        /* renamed from: c */
        final /* synthetic */ boolean f123914c;

        C49353j(C49340ca caVar, View view, boolean z) {
            this.f123912a = caVar;
            this.f123913b = view;
            this.f123914c = z;
        }

        public final void run() {
            if (this.f123913b.getVisibility() == 0) {
                C10660a aVar = this.f123912a.f123888b;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                float e = ((float) (aVar.mo19005e() - this.f123913b.getMeasuredWidth())) + C9432q.m18687b((Context) this.f123912a.f123889c, 8.0f);
                float b = C9432q.m18687b((Context) this.f123912a.f123889c, 3.0f) + e;
                if (this.f123914c) {
                    C10660a aVar2 = this.f123912a.f123888b;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.mo18997a(this.f123913b, 48, b, -((int) e));
                } else {
                    int b2 = (int) C9432q.m18687b((Context) this.f123912a.f123889c, 12.0f);
                    C10660a aVar3 = this.f123912a.f123888b;
                    if (aVar3 == null) {
                        C52711k.m112234a();
                    }
                    aVar3.mo18997a(this.f123913b, 48, ((float) b2) + C9432q.m18687b((Context) this.f123912a.f123889c, 3.0f), -b2);
                }
                if (this.f123912a.f123890d.mo97046p()) {
                    C39630m.m88234a().mo58604b().mo80576a(true);
                    C26890h.m65011a("function_toast_show", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("type", "music").f61491a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ca$k */
    static final class C49354k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49340ca f123915a;

        C49354k(C49340ca caVar) {
            this.f123915a = caVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f123915a.f123890d.mo97031a(1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo97288b() {
        C10660a aVar = this.f123887a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo97282a() {
        this.f123893g.mo6180a();
        for (C52847n nVar : this.f123894h) {
            ((LiveData) nVar.getFirst()).removeObserver((C0199s) nVar.getSecond());
        }
        this.f123894h.clear();
        mo97288b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo97291c() {
        try {
            C26890h.m65011a("function_toast_show", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("type", "text").mo47829a("creation_id", this.f123890d.mo97035e().creationId).mo47829a("content_type", C43434az.m95202a(this.f123890d.mo97035e())).mo47829a("content_source", C43434az.m95207b(this.f123890d.mo97035e())).f61491a);
        } catch (C52859w e) {
            StringBuilder sb = new StringBuilder("Publish Edit Model late init exception:");
            sb.append(e.getMessage());
            C45407ay.m98971b(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m106428a(C1690c cVar) {
        this.f123893g.mo6181a(cVar);
    }

    /* renamed from: b */
    public final void mo97289b(C43458e eVar) {
        C52711k.m112240b(eVar, "item");
        m106428a(this.f123891e.m106895a(this.f123889c, C49357cd.f123918a, new C11934u(), new C49347d(eVar)));
        m106428a(this.f123891e.m106895a(this.f123889c, C49358ce.f123919a, new C11934u(), new C49348e(eVar)));
    }

    /* renamed from: b */
    public final void mo97290b(Map<Integer, ? extends View> map) {
        C52711k.m112240b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData a = this.f123891e.mo97007a(intValue);
            if (a != null) {
                m106427a(a, this.f123889c, new C49349f(view));
            }
        }
    }

    /* renamed from: a */
    public final void mo97285a(C43458e eVar) {
        C52711k.m112240b(eVar, "item");
        m106428a(this.f123891e.m106895a(this.f123889c, C49355cb.f123916a, new C11934u(), new C49343b(eVar)));
        m106428a(this.f123891e.m106897b(this.f123889c, C49356cc.f123917a, new C11934u(), new C49344c(this, eVar)));
    }

    /* renamed from: c */
    public final void mo97292c(Map<Integer, ? extends View> map) {
        C52711k.m112240b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData c = this.f123891e.mo97014c(intValue);
            if (c != null) {
                m106427a(c, this.f123889c, new C49351h(view));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97283a(android.view.View r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r10.f123890d
            boolean r0 = r0.mo97046p()
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00ad
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r10.f123891e
            com.ss.android.ugc.gamora.editor.c r0 = r0.f123208e
            boolean r0 = r0.f123884d
            if (r0 == 0) goto L_0x00ad
            android.support.v4.app.FragmentActivity r0 = r10.f123889c
            android.content.Context r0 = (android.content.Context) r0
            r5 = 2132215643(0x7f17075b, float:2.0075162E38)
            r6 = 0
            android.view.View r0 = android.view.View.inflate(r0, r5, r6)
            java.lang.String r5 = "View.inflate(activity, R…ut.prompt_ai_music, null)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            r5 = 2132024232(0x7f141ba8, float:1.9686934E38)
            android.view.View r5 = r0.findViewById(r5)
            java.lang.String r7 = "bubbleView.findViewById(R.id.tvw_music_title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2132020272(0x7f140c30, float:1.9678902E38)
            android.view.View r7 = r0.findViewById(r7)
            java.lang.String r8 = "bubbleView.findViewById(R.id.ivw_cover)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.facebook.drawee.view.SimpleDraweeView r7 = (com.facebook.drawee.view.SimpleDraweeView) r7
            com.ss.android.ugc.aweme.port.in.ak r8 = com.p683ss.android.ugc.aweme.port.p2082in.C39630m.m88234a()
            com.ss.android.ugc.aweme.port.in.ab r8 = r8.mo58604b()
            com.ss.android.ugc.aweme.port.in.ab$b r8 = r8.mo80585g()
            com.ss.android.ugc.aweme.bw.a.e r8 = r8.mo80587a()
            java.util.List r8 = r8.mo50199d()
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = com.bytedance.common.utility.p522b.C9376b.m18558a(r9)
            if (r9 != 0) goto L_0x0087
            if (r8 == 0) goto L_0x0070
            java.lang.Object r9 = r8.get(r4)
            com.ss.android.ugc.aweme.shortvideo.c r9 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r9
            if (r9 == 0) goto L_0x0070
            java.lang.String r9 = r9.getName()
            goto L_0x0071
        L_0x0070:
            r9 = r6
        L_0x0071:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r5.setText(r9)
            if (r8 == 0) goto L_0x0084
            java.lang.Object r5 = r8.get(r4)
            com.ss.android.ugc.aweme.shortvideo.c r5 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r5
            if (r5 == 0) goto L_0x0084
            java.lang.String r6 = r5.getPicMedium()
        L_0x0084:
            r7.setImageURI(r6)
        L_0x0087:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r6 = r10.f123889c
            android.app.Activity r6 = (android.app.Activity) r6
            r5.<init>(r6)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r5 = r5.mo19018d(r4)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r5.mo19011a(r0)
            r5 = 1090519040(0x41000000, float:8.0)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19008a(r5)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19010a(r1)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19013a(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r0.mo19014a()
            r10.f123888b = r0
            goto L_0x00d7
        L_0x00ad:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = new com.bytedance.ies.dmt.ui.bubbleview.a$a
            android.support.v4.app.FragmentActivity r5 = r10.f123889c
            android.app.Activity r5 = (android.app.Activity) r5
            r0.<init>(r5)
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r10.f123890d
            boolean r5 = r5.mo97046p()
            if (r5 == 0) goto L_0x00c2
            r5 = 2132544292(0x7f1c0b24, float:2.0741741E38)
            goto L_0x00c5
        L_0x00c2:
            r5 = 2132542195(0x7f1c02f3, float:2.0737488E38)
        L_0x00c5:
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19015b(r5)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19010a(r1)
            com.bytedance.ies.dmt.ui.bubbleview.a$a r0 = r0.mo19013a(r3)
            com.bytedance.ies.dmt.ui.bubbleview.a r0 = r0.mo19014a()
            r10.f123888b = r0
        L_0x00d7:
            android.support.v4.app.FragmentActivity r0 = r10.f123889c
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r0)
            com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler r1 = new com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler
            android.support.v4.app.FragmentActivity r2 = r10.f123889c
            android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
            r1.<init>(r2)
            com.ss.android.ugc.gamora.editor.ca$j r2 = new com.ss.android.ugc.gamora.editor.ca$j
            r2.<init>(r10, r11, r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
            com.bytedance.ies.dmt.ui.bubbleview.a r11 = r10.f123888b
            if (r11 != 0) goto L_0x00f9
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f9:
            android.view.View r11 = r11.getContentView()
            com.ss.android.ugc.gamora.editor.ca$k r0 = new com.ss.android.ugc.gamora.editor.ca$k
            r0.<init>(r10)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r11.setOnClickListener(r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123890d
            boolean r11 = r11.mo97046p()
            if (r11 == 0) goto L_0x0116
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123891e
            com.ss.android.ugc.gamora.editor.c r11 = r11.f123208e
            r11.f123882b = r4
            goto L_0x0122
        L_0x0116:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123891e
            com.ss.android.ugc.gamora.editor.c r11 = r11.f123208e
            r11.f123883c = r4
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r11 = r10.f123891e
            com.ss.android.ugc.gamora.editor.c r11 = r11.f123208e
            r11.f123881a = r3
        L_0x0122:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f123890d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r11.mo97035e()
            com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az.m95210d(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49340ca.mo97283a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo97286a(Map<Integer, ? extends View> map) {
        C52711k.m112240b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData d = this.f123891e.mo97016d(intValue);
            if (d != null) {
                m106427a(d, this.f123889c, new C49352i(view));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97284a(C10661a aVar, View view) {
        int i;
        C10660a a = aVar.mo19014a();
        if (C47918gj.m103682a(this.f123889c)) {
            i = 5;
        } else {
            i = 3;
        }
        a.mo18999a(view, i, true);
    }

    /* renamed from: a */
    public final void mo97287a(Map<Integer, ? extends View> map, int i) {
        C52711k.m112240b(map, "map");
        for (Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData b = this.f123891e.mo97011b(intValue);
            if (b != null) {
                m106427a(b, this.f123889c, new C49350g(this, intValue, view, i));
            }
        }
    }

    /* renamed from: a */
    private final <T> void m106427a(LiveData<T> liveData, C0184k kVar, C0199s<T> sVar) {
        liveData.observe(kVar, sVar);
        List<C52847n<LiveData<Object>, C0199s<Object>>> list = this.f123894h;
        if (liveData != null) {
            list.add(new C52847n(liveData, sVar));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LiveData<kotlin.Any>");
    }

    public C49340ca(FragmentActivity fragmentActivity, EditViewModel editViewModel, EditToolbarViewModel editToolbarViewModel, C12896b bVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(editViewModel, "editViewModel");
        C52711k.m112240b(editToolbarViewModel, "editToolbarViewModel");
        C52711k.m112240b(bVar, "parentScene");
        this.f123889c = fragmentActivity;
        this.f123890d = editViewModel;
        this.f123891e = editToolbarViewModel;
        this.f123892f = bVar;
    }
}
