package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44149m;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47279b;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47284d;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47295f;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47249a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a */
public final class C47225a implements C44149m {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f119252a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47225a.class), "concatDialog", "getConcatDialog()Lcom/ss/android/ugc/aweme/tools/mvtemplate/net/MvNetDialog;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47225a.class), "mvNetModule", "getMvNetModule()Lcom/ss/android/ugc/aweme/tools/mvtemplate/net/MvNetModule;"))};

    /* renamed from: b */
    public MvThemeData f119253b;

    /* renamed from: c */
    public boolean f119254c;

    /* renamed from: d */
    public final Map<String, String> f119255d = new LinkedHashMap();

    /* renamed from: e */
    public final List<C23290c> f119256e = new ArrayList();

    /* renamed from: f */
    public final FragmentActivity f119257f;

    /* renamed from: g */
    private final C52668f f119258g = C52732g.m112285a(new C47226a(this));

    /* renamed from: h */
    private AVETParameter f119259h;

    /* renamed from: i */
    private ShortVideoContext f119260i;

    /* renamed from: j */
    private AVChallenge f119261j;

    /* renamed from: k */
    private long f119262k;

    /* renamed from: l */
    private final C52668f f119263l = C52732g.m112285a(C47227b.f119265a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$a */
    static final class C47226a extends C52712l implements C52670a<C47279b> {

        /* renamed from: a */
        final /* synthetic */ C47225a f119264a;

        C47226a(C47225a aVar) {
            this.f119264a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47279b(this.f119264a.f119257f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$b */
    static final class C47227b extends C52712l implements C52670a<C47284d> {

        /* renamed from: a */
        public static final C47227b f119265a = new C47227b();

        C47227b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47284d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$c */
    static final class C47228c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C47225a f119266a;

        C47228c(C47225a aVar) {
            this.f119266a = aVar;
        }

        public final /* synthetic */ Object call() {
            for (Entry entry : this.f119266a.f119255d.entrySet()) {
                if (C52830p.m112413c((String) entry.getValue(), ".bmp", false, 2, null)) {
                    C48016e.m103947c((String) entry.getValue());
                }
            }
            for (C23290c filePath : this.f119266a.f119256e) {
                C48016e.m103947c(filePath.getFilePath());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$d */
    static final class C47229d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C47225a f119267a;

        /* renamed from: b */
        final /* synthetic */ C23289b f119268b;

        /* renamed from: c */
        final /* synthetic */ C52725c f119269c;

        /* renamed from: d */
        final /* synthetic */ C52725c f119270d;

        /* renamed from: e */
        final /* synthetic */ C52725c f119271e;

        C47229d(C47225a aVar, C23289b bVar, C52725c cVar, C52725c cVar2, C52725c cVar3) {
            this.f119267a = aVar;
            this.f119268b = bVar;
            this.f119269c = cVar;
            this.f119270d = cVar2;
            this.f119271e = cVar3;
        }

        public final /* synthetic */ Object call() {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(C47251c.m102580a("resize_bitmap_tmp"));
            sb.append(File.separator);
            String sb2 = sb.toString();
            Iterator it = this.f119268b.selectMediaList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (C48016e.m103944b(str)) {
                    if (this.f119267a.f119255d.containsKey(str)) {
                        Object obj = this.f119267a.f119255d.get(str);
                        if (obj == null) {
                            C52711k.m112234a();
                        }
                        arrayList.add(obj);
                    } else if (C47249a.m102575a(str) == null) {
                        arrayList.add(str);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append(C47251c.m102591c(".bmp"));
                        String sb4 = sb3.toString();
                        if (C47251c.m102586a(str, sb4, this.f119269c.element, this.f119270d.element, this.f119271e.element)) {
                            Map<String, String> map = this.f119267a.f119255d;
                            C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132050j);
                            map.put(str, sb4);
                            arrayList.add(sb4);
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f119268b.selectMediaList.clear();
                this.f119268b.selectMediaList.addAll(arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$e */
    static final class C47230e<TTaskResult, TContinuationResult> implements C0011g<C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47225a f119272a;

        /* renamed from: b */
        final /* synthetic */ C23289b f119273b;

        /* renamed from: c */
        final /* synthetic */ long f119274c;

        C47230e(C47225a aVar, C23289b bVar, long j) {
            this.f119272a = aVar;
            this.f119273b = bVar;
            this.f119274c = j;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            String str;
            if (this.f119272a.f119254c) {
                C47225a aVar = this.f119272a;
                MvThemeData mvThemeData = this.f119272a.f119253b;
                if (mvThemeData == null) {
                    C52711k.m112234a();
                }
                String d = mvThemeData.mo94476d();
                if (d == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) d, "mSelectMvData!!.effectFileUnzipPath!!");
                ArrayList<String> arrayList = this.f119273b.selectMediaList;
                C52711k.m112236a((Object) arrayList, "videoData.selectMediaList");
                aVar.mo94497a(d, (List<String>) arrayList, this.f119273b);
            } else {
                this.f119272a.mo94498b().mo94571c();
                this.f119272a.mo94496a(this.f119273b);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f119274c;
            C23289b bVar = this.f119273b;
            MvThemeData mvThemeData2 = this.f119272a.f119253b;
            if (mvThemeData2 != null) {
                str = mvThemeData2.mo94472a();
            } else {
                str = null;
            }
            C52711k.m112240b(bVar, "videoData");
            if (!C23715d.m58202a((Collection<T>) bVar.selectMediaList) && str != null) {
                C23569o.m57776a("aweme_mv_generate_duration", 0, C42437ay.m93202a().mo86520a("duration", Long.valueOf(currentTimeMillis)).mo86519a("pictureCount", Integer.valueOf(bVar.selectMediaList.size())).mo86521a("mvID", str).mo86522b());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$f */
    public static final class C47231f implements C47295f {

        /* renamed from: a */
        final /* synthetic */ C47225a f119275a;

        /* renamed from: b */
        final /* synthetic */ C23289b f119276b;

        /* renamed from: a */
        public final void mo94501a(List<C23290c> list) {
            C52711k.m112240b(list, "result");
            for (C23290c cVar : list) {
                C47225a aVar = this.f119275a;
                C23289b bVar = this.f119276b;
                MvThemeData mvThemeData = aVar.f119253b;
                if (mvThemeData != null) {
                    List<String> list2 = mvThemeData.f119243n;
                    if (list2 != null && list2.contains(cVar.getAlgorithm()) && !C52830p.m112413c(cVar.getFilePath(), ".mp4", false, 2, null)) {
                        bVar.photoToSave.add(cVar.getFilePath());
                    }
                }
                bVar.newMaskFileData.add(cVar);
            }
            List<C23290c> list3 = this.f119275a.f119256e;
            list3.clear();
            ArrayList<C23290c> arrayList = this.f119276b.newMaskFileData;
            C52711k.m112236a((Object) arrayList, "videoData.newMaskFileData");
            list3.addAll(arrayList);
            this.f119275a.mo94498b().mo94571c();
            this.f119275a.mo94496a(this.f119276b);
        }

        C47231f(C47225a aVar, C23289b bVar) {
            this.f119275a = aVar;
            this.f119276b = bVar;
        }

        /* renamed from: a */
        public final void mo94502a(List<C23290c> list, String str) {
            boolean z;
            C52711k.m112240b(list, "result");
            C52711k.m112240b(str, "message");
            this.f119275a.f119256e.addAll(list);
            this.f119275a.mo94498b().mo94571c();
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10691a.m21551c((Context) this.f119275a.f119257f, str).mo19066a();
            } else {
                C10691a.m21551c((Context) this.f119275a.f119257f, this.f119275a.f119257f.getResources().getString(R.string.q)).mo19066a();
            }
        }
    }

    /* renamed from: b */
    public final C47279b mo94498b() {
        return (C47279b) this.f119258g.getValue();
    }

    /* renamed from: a */
    public final void mo78609a() {
        C0013i.m16a((Callable<TResult>) new C47228c<TResult>(this));
    }

    public C47225a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f119257f = fragmentActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035c, code lost:
        if (r4 == null) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x037a, code lost:
        if (r3 == null) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0223, code lost:
        if (r1.mo86367h() != false) goto L_0x0225;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94496a(com.p683ss.android.ugc.aweme.p1388at.C23289b r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = "upload_event_next"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "content_type"
            java.lang.String r5 = "photo"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.lang.String r4 = "upload_type"
            java.lang.String r5 = "mv"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r3)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r3 = r0.f119253b
            r4 = 0
            if (r3 == 0) goto L_0x002e
            java.util.List r3 = r3.mo94474b()
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            r1.musicIds = r3
            android.support.v4.app.FragmentActivity r3 = r0.f119257f
            android.content.Context r3 = (android.content.Context) r3
            com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r5 = r0.f119253b
            if (r5 == 0) goto L_0x003e
            java.lang.String r5 = r5.mo94472a()
            goto L_0x003f
        L_0x003e:
            r5 = r4
        L_0x003f:
            r6 = 2
            com.p683ss.android.ugc.aweme.utils.C47951r.m103761a(r3, r5, r6)
            com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r3 = r0.f119253b
            if (r3 == 0) goto L_0x00ba
            java.lang.String r5 = r3.mo94472a()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00ba
            com.ss.android.ugc.aweme.shortvideo.j r5 = new com.ss.android.ugc.aweme.shortvideo.j
            r5.<init>()
            java.lang.String r6 = r3.mo94472a()
            r5.mvThemeId = r6
            java.lang.String r6 = "av_upload_struct"
            java.io.Serializable r5 = (java.io.Serializable) r5
            r2.putExtra(r6, r5)
            java.util.List r5 = r3.mo94474b()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r5)
            if (r5 != 0) goto L_0x0083
            com.google.gson.f r5 = new com.google.gson.f
            r5.<init>()
            java.util.List r6 = r3.mo94474b()
            java.lang.String r5 = r5.mo34889b(r6)
            java.lang.String r6 = "first_sticker_music_ids"
            r2.putExtra(r6, r5)
        L_0x0083:
            java.lang.String r5 = r3.mo94472a()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f119260i
            if (r6 != 0) goto L_0x0092
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0092:
            java.lang.String r6 = r6.f107061aM
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 == 0) goto L_0x00ac
            java.lang.String r5 = "extra_bind_mv_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f119260i
            if (r6 != 0) goto L_0x00a7
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00a7:
            java.lang.String r6 = r6.f107061aM
            r2.putExtra(r5, r6)
        L_0x00ac:
            java.lang.String r5 = r3.mo94476d()
            r1.mvResUnzipPath = r5
            int r5 = r3.f119239j
            r1.mvType = r5
            java.lang.String r3 = r3.f119242m
            r1.mvAutoSaveToast = r3
        L_0x00ba:
            java.lang.String r3 = "contact_video"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c.m102580a(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = java.io.File.separator
            r5.append(r3)
            java.lang.String r3 = ".mp4"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c.m102591c(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r1.contactVideoPath = r3
            java.lang.String r3 = "key_mv_theme_data"
            r5 = r1
            java.io.Serializable r5 = (java.io.Serializable) r5
            r2.putExtra(r3, r5)
            java.lang.String r3 = "key_mv_theme_enter"
            r5 = 1
            r2.putExtra(r3, r5)
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r0.f119259h
            if (r3 == 0) goto L_0x03dc
            com.ss.android.ugc.aweme.shortvideo.dh r6 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r7 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r6 = r6.f109287b
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r7 = r0.f119261j
            if (r7 == 0) goto L_0x0110
            if (r6 != 0) goto L_0x0106
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
        L_0x0106:
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r7 = r0.f119261j
            if (r7 != 0) goto L_0x010d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x010d:
            r6.add(r7)
        L_0x0110:
            java.lang.String r7 = "extra_edit_preview_info"
            com.ss.android.ugc.aweme.shortvideo.edit.model.f r8 = new com.ss.android.ugc.aweme.shortvideo.edit.model.f
            r9 = 720(0x2d0, float:1.009E-42)
            r10 = 1280(0x500, float:1.794E-42)
            r8.<init>(r9, r10)
            java.lang.String r9 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r9)
            com.ss.android.ugc.aweme.shortvideo.edit.model.g r9 = new com.ss.android.ugc.aweme.shortvideo.edit.model.g
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 15
            r18 = 0
            r10 = r9
            r10.<init>(r11, r12, r13, r15, r17, r18)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r10 = new com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment
            java.lang.String r1 = r1.contactVideoPath
            java.lang.String r11 = "data.contactVideoPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r11)
            r21 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r22 = new com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo
            int r12 = r8.f110591a
            int r13 = r8.f110592b
            r14 = 0
            r16 = 30
            r17 = 0
            r18 = 16
            r19 = 0
            r11 = r22
            r11.<init>(r12, r13, r14, r16, r17, r18, r19)
            r23 = 2
            r24 = 0
            r19 = r10
            r20 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r1 = r9.mo89103a(r10)
            if (r1 == 0) goto L_0x03d4
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r2.putExtra(r7, r1)
            java.lang.String r1 = "challenge"
            if (r6 == 0) goto L_0x03cc
            java.io.Serializable r6 = (java.io.Serializable) r6
            r2.putExtra(r1, r6)
            java.lang.String r1 = "shoot_way"
            java.lang.String r6 = r3.getShootWay()
            r2.putExtra(r1, r6)
            java.lang.String r1 = "creation_id"
            java.lang.String r6 = r3.getCreationId()
            r2.putExtra(r1, r6)
            java.lang.String r1 = "shoot_mode"
            int r6 = r3.getShootMode()
            r2.putExtra(r1, r6)
            java.lang.String r1 = "draft_id"
            int r3 = r3.getDraftId()
            r2.putExtra(r1, r3)
            java.lang.String r1 = "origin"
            r2.putExtra(r1, r5)
            java.lang.String r1 = "content_type"
            java.lang.String r3 = "mv"
            r2.putExtra(r1, r3)
            java.lang.String r1 = "content_source"
            java.lang.String r3 = "upload"
            r2.putExtra(r1, r3)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x01b1
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01b1:
            java.lang.String r3 = r3.f107076ab
            r2.putExtra(r1, r3)
            java.lang.String r1 = "tag_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x01c1
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01c1:
            java.lang.String r3 = r3.f107080af
            r2.putExtra(r1, r3)
            java.lang.String r1 = "comment_video_model"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x01d1
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01d1:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r3 = r3.f107125r
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.putExtra(r1, r3)
            java.lang.String r1 = "extra_start_enter_edit_page"
            long r6 = r0.f119262k
            r2.putExtra(r1, r6)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f119260i
            if (r1 != 0) goto L_0x01e8
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01e8:
            java.util.ArrayList<java.lang.String> r1 = r1.f107077ac
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            if (r1 == 0) goto L_0x01f8
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r1 = 0
            goto L_0x01f9
        L_0x01f8:
            r1 = 1
        L_0x01f9:
            if (r1 == 0) goto L_0x0225
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f119260i
            if (r1 != 0) goto L_0x0204
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0204:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r1 = r1.f107078ad
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0213
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r1 = 0
            goto L_0x0214
        L_0x0213:
            r1 = 1
        L_0x0214:
            if (r1 == 0) goto L_0x0225
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f119260i
            if (r1 != 0) goto L_0x021f
            java.lang.String r6 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x021f:
            boolean r1 = r1.mo86367h()
            if (r1 == 0) goto L_0x03ab
        L_0x0225:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f119260i
            if (r6 != 0) goto L_0x0233
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0233:
            java.util.ArrayList<java.lang.String> r6 = r6.f107077ac
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x0242
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r6 = 0
            goto L_0x0243
        L_0x0242:
            r6 = 1
        L_0x0243:
            if (r6 != 0) goto L_0x026e
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f119260i
            if (r6 != 0) goto L_0x024e
            java.lang.String r7 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x024e:
            java.util.ArrayList<java.lang.String> r6 = r6.f107077ac
            java.util.Iterator r6 = r6.iterator()
        L_0x0254:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x026e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "#"
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = " "
            r1.append(r7)
            goto L_0x0254
        L_0x026e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r0.f119260i
            if (r7 != 0) goto L_0x027c
            java.lang.String r8 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x027c:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r7 = r7.f107078ad
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x028b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r7 = 0
            goto L_0x028c
        L_0x028b:
            r7 = 1
        L_0x028c:
            if (r7 != 0) goto L_0x0313
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r0.f119260i
            if (r7 != 0) goto L_0x0297
            java.lang.String r8 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x0297:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r7 = r7.f107078ad
            java.util.Iterator r7 = r7.iterator()
        L_0x029d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0313
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.discover.model.TaskMentionedUser r8 = (com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser) r8
            java.lang.String r9 = "taskMentionedUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.String r9 = r8.getNickname()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x02bf
            int r9 = r9.length()
            if (r9 != 0) goto L_0x02bd
            goto L_0x02bf
        L_0x02bd:
            r9 = 0
            goto L_0x02c0
        L_0x02bf:
            r9 = 1
        L_0x02c0:
            if (r9 != 0) goto L_0x029d
            java.lang.String r9 = r8.getUserId()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x02d3
            int r9 = r9.length()
            if (r9 != 0) goto L_0x02d1
            goto L_0x02d3
        L_0x02d1:
            r9 = 0
            goto L_0x02d4
        L_0x02d3:
            r9 = 1
        L_0x02d4:
            if (r9 != 0) goto L_0x029d
            java.lang.String r9 = "@"
            r1.append(r9)
            java.lang.String r9 = r8.getNickname()
            r1.append(r9)
            java.lang.String r9 = " "
            r1.append(r9)
            java.lang.String r9 = r8.getNickname()
            if (r9 != 0) goto L_0x02ef
            java.lang.String r9 = ""
        L_0x02ef:
            int r9 = r1.indexOf(r9)
            int r9 = r9 - r5
            int r10 = r9 + 1
            java.lang.String r11 = r8.getNickname()
            if (r11 == 0) goto L_0x0301
            int r11 = r11.length()
            goto L_0x0302
        L_0x0301:
            r11 = 0
        L_0x0302:
            int r10 = r10 + r11
            java.lang.String r8 = r8.getUserId()
            if (r8 != 0) goto L_0x030b
            java.lang.String r8 = "0"
        L_0x030b:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r8 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createAtStruct(r9, r10, r8)
            r6.add(r8)
            goto L_0x029d
        L_0x0313:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r0.f119260i
            if (r7 != 0) goto L_0x031c
            java.lang.String r8 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x031c:
            boolean r7 = r7.mo86367h()
            if (r7 == 0) goto L_0x0385
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r0.f119260i
            if (r7 != 0) goto L_0x032b
            java.lang.String r8 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)
        L_0x032b:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r7 = r7.f107125r
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "@"
            r8.<init>(r9)
            if (r7 == 0) goto L_0x033a
            java.lang.String r4 = r7.getUserName()
        L_0x033a:
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            android.support.v4.app.FragmentActivity r8 = r0.f119257f
            r9 = 2132543056(0x7f1c0650, float:2.0739234E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r3] = r4
            java.lang.String r4 = r8.getString(r9, r10)
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            if (r7 == 0) goto L_0x035e
            java.lang.String r4 = r7.getUserName()
            if (r4 != 0) goto L_0x0360
        L_0x035e:
            java.lang.String r4 = ""
        L_0x0360:
            int r4 = r1.indexOf(r4)
            int r4 = r4 - r5
            int r8 = r4 + 1
            if (r7 == 0) goto L_0x0373
            java.lang.String r9 = r7.getUserName()
            if (r9 == 0) goto L_0x0373
            int r3 = r9.length()
        L_0x0373:
            int r8 = r8 + r3
            if (r7 == 0) goto L_0x037c
            java.lang.String r3 = r7.getUserId()
            if (r3 != 0) goto L_0x037e
        L_0x037c:
            java.lang.String r3 = "0"
        L_0x037e:
            com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct r3 = com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper.createCommentStruct(r4, r8, r3)
            r6.add(r3)
        L_0x0385:
            java.lang.String r3 = "struct_list"
            java.io.Serializable r6 = (java.io.Serializable) r6
            r2.putExtra(r3, r6)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x0395
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0395:
            java.lang.String r1 = r1.toString()
            r3.f107041T = r1
            java.lang.String r1 = "video_title"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x03a6
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x03a6:
            java.lang.String r3 = r3.f107041T
            r2.putExtra(r1, r3)
        L_0x03ab:
            java.lang.String r1 = "poi_data_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x03b6
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x03b6:
            java.lang.String r3 = r3.f107034M
            r2.putExtra(r1, r3)
            java.lang.String r1 = "commerce_data_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.f119260i
            if (r3 != 0) goto L_0x03c6
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x03c6:
            java.lang.String r3 = r3.f107049aA
            r2.putExtra(r1, r3)
            goto L_0x03dc
        L_0x03cc:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type java.io.Serializable"
            r1.<init>(r2)
            throw r1
        L_0x03d4:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.os.Parcelable"
            r1.<init>(r2)
            throw r1
        L_0x03dc:
            android.support.v4.app.FragmentActivity r1 = r0.f119257f
            android.content.Context r1 = (android.content.Context) r1
            com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m95011a(r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a.C47225a.mo94496a(com.ss.android.ugc.aweme.at.b):void");
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        Serializable serializable;
        boolean z;
        C52711k.m112240b(intent, "data");
        if (i == 10001) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            Bundle bundleExtra = intent.getBundleExtra("key_extra_info");
            if (bundleExtra != null) {
                serializable = bundleExtra.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.f119261j = (AVChallenge) serializable;
            this.f119262k = intent.getLongExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            C23289b bVar = new C23289b();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                ArrayList<String> arrayList = bVar.selectMediaList;
                C52711k.m112236a((Object) mediaModel, "mediaModel");
                arrayList.add(mediaModel.f95383b);
            }
            this.f119253b = (MvThemeData) intent.getParcelableExtra("key_select_mv_data");
            MvThemeData mvThemeData = this.f119253b;
            boolean z2 = false;
            if (mvThemeData != null) {
                z = mvThemeData.f119240k;
            } else {
                z = false;
            }
            this.f119254c = z;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C52711k.m112236a((Object) parcelableExtra, "data.getParcelableExtra(KEY_SHORT_VIDEO_CONTEXT)");
            this.f119260i = (ShortVideoContext) parcelableExtra;
            ShortVideoContext shortVideoContext = this.f119260i;
            if (shortVideoContext == null) {
                C52711k.m112237a("shortVideoContext");
            }
            this.f119259h = shortVideoContext.mo86370k();
            if (!C23715d.m58202a((Collection<T>) bVar.selectMediaList)) {
                MvThemeData mvThemeData2 = this.f119253b;
                if (mvThemeData2 != null) {
                    String d = mvThemeData2.mo94476d();
                    if (d != null) {
                        if (d.length() > 0) {
                            z2 = true;
                        }
                        if (z2) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (this.f119254c) {
                                C47279b b = mo94498b();
                                String string = this.f119257f.getString(R.string.s);
                                C52711k.m112236a((Object) string, "activity.getString(R.string.Pic_video_loading)");
                                b.mo94570a(string);
                            } else {
                                C47279b b2 = mo94498b();
                                String string2 = this.f119257f.getString(R.string.dj9);
                                C52711k.m112236a((Object) string2, "activity.getString(R.str…g.short_video_processing)");
                                b2.mo94570a(string2);
                            }
                            C52725c cVar = new C52725c();
                            cVar.element = 720;
                            C52725c cVar2 = new C52725c();
                            cVar2.element = 1280;
                            C52725c cVar3 = new C52725c();
                            cVar3.element = 1;
                            MvThemeData mvThemeData3 = this.f119253b;
                            if (mvThemeData3 != null) {
                                if (!(mvThemeData3.f119236g == 0 || mvThemeData3.f119237h == 0)) {
                                    cVar.element = mvThemeData3.f119236g;
                                    cVar2.element = mvThemeData3.f119237h;
                                }
                                if (C52711k.m112239a((Object) "AspectFill", (Object) mvThemeData3.f119235f)) {
                                    cVar3.element = 1;
                                } else if (C52711k.m112239a((Object) "AspectFit", (Object) mvThemeData3.f119235f)) {
                                    cVar3.element = 3;
                                } else if (C52711k.m112239a((Object) "AspectWidth", (Object) mvThemeData3.f119235f)) {
                                    cVar3.element = 2;
                                } else if (C52711k.m112239a((Object) "FreeMode", (Object) mvThemeData3.f119235f)) {
                                    cVar3.element = 4;
                                } else if (C52711k.m112239a((Object) "CenterZoom", (Object) mvThemeData3.f119235f)) {
                                    cVar3.element = 5;
                                }
                            }
                            C47229d dVar = new C47229d(this, bVar, cVar, cVar2, cVar3);
                            C0013i.m16a((Callable<TResult>) dVar).mo20a((C0011g<TResult, TContinuationResult>) new C47230e<TResult,TContinuationResult>(this, bVar, currentTimeMillis), C0013i.f25b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94497a(java.lang.String r21, java.util.List<java.lang.String> r22, com.p683ss.android.ugc.aweme.p1388at.C23289b r23) {
        /*
            r20 = this;
            r0 = r20
            com.ss.android.vesdk.VEMVAlgorithmConfig r1 = com.p683ss.android.vesdk.VEUtils.getMVAlgorithmConfigs(r21, r22)
            if (r1 != 0) goto L_0x0028
            com.ss.android.ugc.aweme.tools.mvtemplate.net.b r1 = r20.mo94498b()
            r1.mo94571c()
            android.support.v4.app.FragmentActivity r1 = r0.f119257f
            android.content.Context r1 = (android.content.Context) r1
            android.support.v4.app.FragmentActivity r2 = r0.f119257f
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132541494(0x7f1c0036, float:2.0736066E38)
            java.lang.String r2 = r2.getString(r3)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r1, r2)
            r1.mo19066a()
            return
        L_0x0028:
            d.f r2 = r0.f119263l
            java.lang.Object r2 = r2.getValue()
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d r2 = (com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47284d) r2
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a$f r3 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a$f
            r4 = r23
            r3.<init>(r0, r4)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.f r3 = (com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47295f) r3
            java.lang.String r4 = "config"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            d.f.b.v$e r4 = new d.f.b.v$e
            r4.<init>()
            java.lang.String r5 = ""
            r4.element = r5
            d.f.b.v$c r5 = new d.f.b.v$c
            r5.<init>()
            r6 = 0
            r5.element = r6
            java.util.List<com.ss.android.ugc.aweme.at.c> r7 = r2.f119374c
            r7.clear()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r7 = (java.util.List) r7
            com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo[] r1 = r1.infos
            int r8 = r1.length
            r9 = 0
        L_0x0064:
            if (r9 >= r8) goto L_0x0166
            r10 = r1[r9]
            java.lang.String r11 = r10.photoPath
            if (r11 != 0) goto L_0x0071
            r7.clear()
            goto L_0x0166
        L_0x0071:
            java.lang.String r11 = r10.photoPath
            com.ss.android.ugc.aweme.tools.mvtemplate.net.a r12 = r2.mo94577b()
            java.lang.String r13 = "photoPath"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r13)
            java.lang.String r12 = r12.mo94567a(r11)
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo$AlgorithmItem[] r10 = r10.items
            java.lang.String r15 = "algorithmInfo.items"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r15)
            int r15 = r10.length
            r6 = r14
            r14 = r13
            r13 = 0
        L_0x008f:
            if (r13 >= r15) goto L_0x010d
            r0 = r10[r13]
            r16 = r1
            com.ss.android.vesdk.VEMVAlgorithmConfig$MV_REESULT_OUT_TYPE r1 = r0.result_out_type
            if (r1 != 0) goto L_0x009e
        L_0x0099:
            r18 = r8
            r19 = r10
            goto L_0x0102
        L_0x009e:
            int[] r17 = com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47294e.f119393a
            int r1 = r1.ordinal()
            r1 = r17[r1]
            switch(r1) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00aa;
                case 4: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x0099
        L_0x00aa:
            java.lang.String r1 = "item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r2.mo94575a(r11, r0, r7)
            goto L_0x0099
        L_0x00b3:
            boolean r1 = r0.isNeedServerExecute
            if (r1 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.tools.mvtemplate.net.a r1 = r2.mo94577b()
            r18 = r8
            java.lang.String r8 = r0.algorithmName
            r19 = r10
            java.lang.String r10 = "item.algorithmName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            com.ss.android.ugc.aweme.at.c r1 = r1.mo94566a(r12, r8)
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r8 = r0.algorithmName
            r1.append(r8)
            r8 = 44
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            com.ss.android.vesdk.VEMVAlgorithmConfig$MV_REESULT_OUT_TYPE r0 = r0.result_out_type
            int r0 = r0.ordinal()
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            r6 = r0
            r14 = r1
            goto L_0x0102
        L_0x00fd:
            java.util.List<com.ss.android.ugc.aweme.at.c> r0 = r2.f119374c
            r0.add(r1)
        L_0x0102:
            int r13 = r13 + 1
            r1 = r16
            r8 = r18
            r10 = r19
            r0 = r20
            goto L_0x008f
        L_0x010d:
            r16 = r1
            r18 = r8
            java.lang.String r0 = ","
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112432a(r14, r0)
            java.lang.String r1 = ","
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r1 = p2628d.p2650m.C52830p.m112432a(r6, r1)
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x012c
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 == 0) goto L_0x015b
            com.bytedance.retrofit2.mime.TypedFile r6 = new com.bytedance.retrofit2.mime.TypedFile
            java.lang.String r8 = "image/*"
            java.io.File r10 = new java.io.File
            r10.<init>(r11)
            r6.<init>(r8, r10)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrApi r8 = r2.mo94574a()
            c.a.v r0 = r8.getImageInfo(r0, r12, r1, r6)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$b r1 = com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47284d.C47286b.f119378a
            c.a.d.f r1 = (p064c.p065a.p071d.C1711f) r1
            c.a.v r0 = r0.mo6547f(r1)
            c.a.ac r1 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r0 = r0.mo6529b(r1)
            java.lang.String r1 = "api.getImageInfo(algorit…scribeOn(Schedulers.io())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r7.add(r0)
        L_0x015b:
            int r9 = r9 + 1
            r1 = r16
            r8 = r18
            r0 = r20
            r6 = 0
            goto L_0x0064
        L_0x0166:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0184
            java.util.List<com.ss.android.ugc.aweme.at.c> r0 = r2.f119374c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017e
            java.util.List<com.ss.android.ugc.aweme.at.c> r0 = r2.f119374c
            T r1 = r4.element
            java.lang.String r1 = (java.lang.String) r1
            r3.mo94502a(r0, r1)
            goto L_0x01d7
        L_0x017e:
            java.util.List<com.ss.android.ugc.aweme.at.c> r0 = r2.f119374c
            r3.mo94501a(r0)
            return
        L_0x0184:
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$e r0 = new com.ss.android.ugc.aweme.tools.mvtemplate.net.d$e
            r0.<init>(r5, r4)
            r9 = r0
            c.a.d.f r9 = (p064c.p065a.p071d.C1711f) r9
            java.lang.String r0 = "zipper is null"
            p064c.p065a.p072e.p074b.C1745b.m6050a(r9, r0)
            java.lang.String r0 = "sources is null"
            p064c.p065a.p072e.p074b.C1745b.m6050a(r8, r0)
            c.a.e.e.d.bf r0 = new c.a.e.e.d.bf
            r7 = 0
            int r10 = p064c.p065a.C2201v.m6590a()
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            c.a.v r0 = p064c.p065a.p090h.C2150a.m6486a(r0)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$f r1 = new com.ss.android.ugc.aweme.tools.mvtemplate.net.d$f
            r1.<init>(r2, r5)
            c.a.d.f r1 = (p064c.p065a.p071d.C1711f) r1
            c.a.v r0 = r0.mo6541d(r1)
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.v r0 = r0.mo6514a(r1)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$g r1 = new com.ss.android.ugc.aweme.tools.mvtemplate.net.d$g
            r1.<init>(r2, r5, r3, r4)
            c.a.d.e r1 = (p064c.p065a.p071d.C1710e) r1
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$h r5 = new com.ss.android.ugc.aweme.tools.mvtemplate.net.d$h
            r5.<init>(r2, r3, r4)
            c.a.d.e r5 = (p064c.p065a.p071d.C1710e) r5
            com.ss.android.ugc.aweme.tools.mvtemplate.net.d$i r3 = new com.ss.android.ugc.aweme.tools.mvtemplate.net.d$i
            r3.<init>(r2)
            c.a.d.a r3 = (p064c.p065a.p071d.C1706a) r3
            c.a.b.c r0 = r0.mo6506a(r1, r5, r3)
            r2.f119373b = r0
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2367a.C47225a.mo94497a(java.lang.String, java.util.List, com.ss.android.ugc.aweme.at.b):void");
    }
}
