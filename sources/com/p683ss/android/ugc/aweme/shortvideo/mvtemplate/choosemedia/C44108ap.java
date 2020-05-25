package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43049j;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43026j;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44293g;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47926h;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52726d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap */
public final class C44108ap implements C44149m {

    /* renamed from: h */
    public static final C44109a f111744h = new C44109a(null);

    /* renamed from: a */
    public ShortVideoContext f111745a;

    /* renamed from: b */
    public List<? extends C42482c> f111746b;

    /* renamed from: c */
    public long f111747c;

    /* renamed from: d */
    public long f111748d;

    /* renamed from: e */
    public final Activity f111749e;

    /* renamed from: f */
    public final long f111750f;

    /* renamed from: g */
    public final long f111751g;

    /* renamed from: i */
    private int f111752i;

    /* renamed from: j */
    private boolean f111753j;

    /* renamed from: k */
    private C45547d f111754k;

    /* renamed from: l */
    private long f111755l = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$a */
    public static final class C44109a {
        private C44109a() {
        }

        public /* synthetic */ C44109a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m96754a(int i, int i2) {
            switch (i) {
                case -6:
                    i = 2;
                    break;
                case -5:
                    i = 0;
                    break;
                case -2:
                    i = 3;
                    break;
                case -1:
                    i = 1;
                    break;
            }
            C47702b.f120193a.mo94984a("tool_performance_asset_unavailable", C23089d.m56640a().mo47826a("type", i2).mo47826a("code", i).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$b */
    public static final class C44110b implements C44293g {

        /* renamed from: a */
        final /* synthetic */ C44108ap f111756a;

        /* renamed from: b */
        final /* synthetic */ List f111757b;

        /* renamed from: a */
        public final void mo90014a(boolean z) {
            this.f111756a.mo90012b();
            this.f111756a.mo90013b(this.f111757b);
        }

        C44110b(C44108ap apVar, List list) {
            this.f111756a = apVar;
            this.f111757b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$c */
    public static final class C44111c implements C44293g {

        /* renamed from: a */
        final /* synthetic */ C44108ap f111758a;

        C44111c(C44108ap apVar) {
            this.f111758a = apVar;
        }

        /* renamed from: a */
        public final void mo90014a(boolean z) {
            this.f111758a.mo90012b();
            this.f111758a.mo90010a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$d */
    public static final class C44112d implements C44293g {

        /* renamed from: a */
        final /* synthetic */ C44108ap f111759a;

        /* renamed from: b */
        final /* synthetic */ int f111760b;

        /* renamed from: c */
        final /* synthetic */ StringBuilder f111761c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$d$a */
        public static final class C44113a implements C43026j {

            /* renamed from: a */
            final /* synthetic */ C44112d f111762a;

            /* renamed from: b */
            final /* synthetic */ C52726d f111763b;

            /* renamed from: c */
            final /* synthetic */ long f111764c;

            /* renamed from: a */
            public final void mo87396a() {
                this.f111763b.element = System.currentTimeMillis();
                this.f111762a.f111759a.f111747c = this.f111763b.element - this.f111764c;
            }

            /* renamed from: a */
            public final void mo87400a(List<? extends C42482c> list) {
                this.f111762a.f111759a.f111746b = list;
            }

            /* renamed from: a */
            public final void mo87399a(Exception exc) {
                this.f111762a.f111759a.mo90012b();
                this.f111762a.f111759a.mo90010a(null);
            }

            /* renamed from: b */
            public final void mo87402b(Exception exc) {
                this.f111762a.f111759a.mo90012b();
                this.f111762a.f111759a.mo90010a(null);
            }

            /* renamed from: a */
            public final void mo87397a(C42482c cVar) {
                this.f111762a.f111759a.f111748d = System.currentTimeMillis() - this.f111763b.element;
                this.f111762a.f111759a.mo90012b();
                this.f111762a.f111759a.mo90010a(this.f111762a.f111759a.f111746b);
            }

            /* renamed from: b */
            public final void mo87401b(C42482c cVar, Exception exc) {
                this.f111762a.f111759a.mo90012b();
                this.f111762a.f111759a.mo90010a(this.f111762a.f111759a.f111746b);
            }

            /* renamed from: a */
            public final void mo87398a(C42482c cVar, Exception exc) {
                this.f111762a.f111759a.mo90012b();
                this.f111762a.f111759a.mo90010a(this.f111762a.f111759a.f111746b);
            }

            C44113a(C44112d dVar, C52726d dVar2, long j) {
                this.f111762a = dVar;
                this.f111763b = dVar2;
                this.f111764c = j;
            }
        }

        /* renamed from: a */
        public final void mo90014a(boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            C52726d dVar = new C52726d();
            dVar.element = 0;
            C43049j.m94342a().mo87378a(this.f111759a.f111749e.getApplicationContext(), this.f111760b, this.f111761c.toString(), new C44113a(this, dVar, currentTimeMillis));
        }

        C44112d(C44108ap apVar, int i, StringBuilder sb) {
            this.f111759a = apVar;
            this.f111760b = i;
            this.f111761c = sb;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$e */
    static final class C44114e<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ C44108ap f111765a;

        /* renamed from: b */
        final /* synthetic */ List f111766b;

        C44114e(C44108ap apVar, List list) {
            this.f111765a = apVar;
            this.f111766b = list;
        }

        public final /* synthetic */ Object call() {
            int i;
            List list = this.f111766b;
            if (list == null) {
                C52711k.m112234a();
            }
            Iterator it = list.iterator();
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    break;
                }
                MediaModel mediaModel = (MediaModel) it.next();
                if (mediaModel.f95385d == 4) {
                    String str = mediaModel.f95383b;
                    if (C48016e.m103944b(str)) {
                        int[] iArr = new int[10];
                        C39629l.m88232a().mo58586q();
                        if (str == null) {
                            C52711k.m112234a();
                        }
                        if (VEUtils.getVideoFileInfo(C47926h.m103696a(str, C47804db.VIDEO), iArr) == 0) {
                            i = iArr[7];
                        }
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap$f */
    static final class C44115f<TTaskResult, TContinuationResult> implements C0011g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C44108ap f111767a;

        /* renamed from: b */
        final /* synthetic */ List f111768b;

        /* renamed from: c */
        final /* synthetic */ int f111769c;

        /* renamed from: d */
        final /* synthetic */ int f111770d;

        C44115f(C44108ap apVar, List list, int i, int i2) {
            this.f111767a = apVar;
            this.f111768b = list;
            this.f111769c = i;
            this.f111770d = i2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || iVar.mo34e() == null) {
                this.f111767a.mo90011a(this.f111768b, this.f111769c, this.f111770d, -1);
            } else {
                C44108ap apVar = this.f111767a;
                List list = this.f111768b;
                int i = this.f111769c;
                int i2 = this.f111770d;
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "it.result");
                apVar.mo90011a(list, i, i2, ((Number) e).intValue());
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final void m96742a(int i, int i2) {
        C44109a.m96754a(i, i2);
    }

    /* renamed from: a */
    public final void mo78609a() {
    }

    /* renamed from: d */
    private long m96745d() {
        if (this.f111747c > 60000) {
            return 0;
        }
        return this.f111747c;
    }

    /* renamed from: e */
    private long m96746e() {
        if (this.f111748d > 60000) {
            return 0;
        }
        return this.f111748d;
    }

    /* renamed from: c */
    private final void m96743c() {
        C47702b.f120193a.mo94984a("tool_performance_ai_clip", C23089d.m56640a().mo47827a("fetch_music", m96745d()).mo47827a("fetch_algorithm", m96746e()).f61491a);
    }

    /* renamed from: f */
    private final void m96747f() {
        if (this.f111749e != null && !this.f111749e.isFinishing()) {
            this.f111754k = C45547d.m99208b(this.f111749e, this.f111749e.getString(R.string.dnt));
            C45547d dVar = this.f111754k;
            if (dVar != null) {
                dVar.setIndeterminate(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo90012b() {
        Boolean bool;
        if (this.f111754k != null) {
            C45547d dVar = this.f111754k;
            if (dVar != null) {
                bool = Boolean.valueOf(dVar.isShowing());
            } else {
                bool = null;
            }
            if (bool == null) {
                C52711k.m112234a();
            }
            if (bool.booleanValue()) {
                C45547d dVar2 = this.f111754k;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo90013b(List<? extends MediaModel> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("key_choose_media_data", new ArrayList(list));
        this.f111749e.setResult(-1, intent);
        if (this.f111749e instanceof MvChoosePhotoActivity) {
            ((MvChoosePhotoActivity) this.f111749e).mo89928b();
        } else {
            this.f111749e.finish();
        }
    }

    /* renamed from: c */
    private final void m96744c(List<? extends MediaModel> list) {
        String str;
        String str2;
        String str3;
        List<? extends MediaModel> list2 = list;
        int size = list2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (((long) ((int) ((MediaModel) list2.get(i4)).f95386e)) <= this.f111750f) {
                C9432q.m18676a(this.f111749e, this.f111749e.getString(R.string.f85, new Object[]{Long.valueOf(this.f111750f / 1000)}));
                C44109a.m96754a(1, 0);
                return;
            }
            i2 += (int) ((MediaModel) list2.get(i4)).f95386e;
            if (((MediaModel) list2.get(i4)).f95385d == 4) {
                i3++;
            }
        }
        long j = (long) i2;
        if (j <= this.f111750f) {
            C9432q.m18676a(this.f111749e, this.f111749e.getString(R.string.f85, new Object[]{Long.valueOf(this.f111750f / 1000)}));
            C44109a.m96754a(1, 0);
            return;
        }
        long j2 = this.f111751g;
        if (1 <= j2 && j > j2) {
            C9432q.m18672a((Context) this.f111749e, (int) R.string.c89);
            C44109a.m96754a(2, 0);
            return;
        }
        C23089d a = C23089d.m56640a().mo47829a("content_type", "video");
        String str4 = "upload_type";
        if (list.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        C23089d a2 = a.mo47829a(str4, str).mo47829a("content_source", "upload").mo47826a("video_cnt", list.size()).mo47826a("video_cnt", i3).mo47826a("pic_cnt", list.size() - i3).mo47826a("duration_ms", i2).mo47829a("creation_id", C43047h.f108662b);
        String str5 = "is_multi_content";
        if (list.size() > 1) {
            i = 1;
        }
        C23089d a3 = a2.mo47826a(str5, i).mo47826a("is_add_more", 1).mo47829a("mix_type", C45624b.m99356a(i3, list.size() - i3));
        if (this.f111745a != null) {
            ShortVideoContext shortVideoContext = this.f111745a;
            if (shortVideoContext == null) {
                C52711k.m112237a("shortVideoContext");
            }
            CommentVideoModel commentVideoModel = shortVideoContext.f107125r;
            String str6 = "shoot_way";
            ShortVideoContext shortVideoContext2 = this.f111745a;
            if (shortVideoContext2 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            C23089d a4 = a3.mo47829a(str6, shortVideoContext2.f107132y);
            String str7 = "creation_id";
            ShortVideoContext shortVideoContext3 = this.f111745a;
            if (shortVideoContext3 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            C23089d a5 = a4.mo47829a(str7, shortVideoContext3.f107131x);
            String str8 = "reply_comment_id";
            ShortVideoContext shortVideoContext4 = this.f111745a;
            if (shortVideoContext4 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            if (!CommentUtils.needMob(shortVideoContext4)) {
                str2 = "";
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getCommentId();
            } else {
                str2 = null;
            }
            C23089d a6 = a5.mo47829a(str8, str2);
            String str9 = "reply_user_id";
            ShortVideoContext shortVideoContext5 = this.f111745a;
            if (shortVideoContext5 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            if (!CommentUtils.needMob(shortVideoContext5)) {
                str3 = "";
            } else if (commentVideoModel != null) {
                str3 = commentVideoModel.getUserId();
            } else {
                str3 = null;
            }
            a6.mo47829a(str9, str3);
        }
        C26890h.m65011a("upload_content_next", a3.f61491a);
        if (C44300e.m97041c()) {
            m96747f();
            C44300e.m97038a(list2, (C44293g) new C44110b(this, list2));
            return;
        }
        mo90013b(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90010a(java.util.List<? extends com.p683ss.android.ugc.aweme.shortvideo.C42482c> r7) {
        /*
            r6 = this;
            r0 = r6
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ap r0 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44108ap) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f111745a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "extra_start_enter_cut_page"
            long r2 = r6.f111755l
            r0.putExtra(r1, r2)
            java.lang.String r1 = "from_music_detail"
            java.lang.String r2 = "single_song"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r6.f111745a
            if (r3 != 0) goto L_0x0021
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0021:
            java.lang.String r3 = r3.f107132y
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "task_platform"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r6.f111745a
            if (r4 != 0) goto L_0x0035
            java.lang.String r5 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0035:
            java.lang.String r4 = r4.f107079ae
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r4)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "challenge"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r6.f111745a
            if (r4 != 0) goto L_0x0048
            java.lang.String r5 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0048:
            java.lang.String r4 = r4.f107079ae
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r4)
            if (r2 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            r0.putExtra(r1, r2)
            java.lang.String r1 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0062
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0062:
            java.lang.String r2 = r2.f107131x
            r0.putExtra(r1, r2)
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0072
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0072:
            java.lang.String r2 = r2.f107132y
            r0.putExtra(r1, r2)
            java.lang.String r1 = "task_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0082
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0082:
            java.lang.String r2 = r2.f107076ab
            r0.putExtra(r1, r2)
            java.lang.String r1 = "challenge_names"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0092
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0092:
            java.util.ArrayList<java.lang.String> r2 = r2.f107077ac
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r1, r2)
            java.lang.String r1 = "extra_stick_point_type"
            int r2 = r6.f111752i
            r0.putExtra(r1, r2)
            java.lang.String r1 = "comment_video_model"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x00ab
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00ab:
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r2 = r2.f107125r
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f111745a
            if (r1 != 0) goto L_0x00bb
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00bb:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r1 = r1.f107078ad
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = "task_mentioned_users"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x00d0
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00d0:
            java.util.List<com.ss.android.ugc.aweme.discover.model.TaskMentionedUser> r2 = r2.f107078ad
            if (r2 == 0) goto L_0x00da
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r1, r2)
            goto L_0x00e2
        L_0x00da:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type java.io.Serializable"
            r7.<init>(r0)
            throw r7
        L_0x00e2:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f111745a
            if (r1 != 0) goto L_0x00eb
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00eb:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r1 = r1.f107118k
            java.lang.String r2 = "shortVideoContext.mWorkspace"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.io.File r1 = r1.mo86458e()
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = "path"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0103
            java.lang.String r4 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0103:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r2 = r2.f107118k
            java.lang.String r4 = "shortVideoContext.mWorkspace"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.io.File r2 = r2.mo86458e()
            java.lang.String r4 = "shortVideoContext.mWorkspace.musicFile"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.String r2 = r2.getAbsolutePath()
            r0.putExtra(r1, r2)
        L_0x011a:
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r2 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r1 = r1.f109287b
            boolean r2 = com.bytedance.common.utility.C9414h.m18630a(r1)
            if (r2 != 0) goto L_0x013b
            java.lang.String r2 = "av_challenge"
            java.lang.Object r1 = r1.get(r3)
            boolean r3 = r1 instanceof java.io.Serializable
            if (r3 != 0) goto L_0x0136
            r1 = 0
        L_0x0136:
            java.io.Serializable r1 = (java.io.Serializable) r1
            r0.putExtra(r2, r1)
        L_0x013b:
            java.lang.String r1 = "poi_struct_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0146
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0146:
            java.lang.String r2 = r2.f107034M
            r0.putExtra(r1, r2)
            java.lang.String r1 = "micro_app_info"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x0156
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0156:
            com.ss.android.ugc.aweme.shortvideo.edit.o r2 = r2.f107054aF
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f111745a
            if (r1 != 0) goto L_0x0166
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0166:
            com.ss.android.ugc.aweme.tools.a.b r1 = com.p683ss.android.ugc.aweme.shortvideo.C44309n.m97061b(r1)
            com.ss.android.ugc.aweme.tools.a.e r2 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.RECORD
            com.ss.android.ugc.aweme.tools.a.e r3 = com.p683ss.android.ugc.aweme.tools.p2346a.C46804e.CUT
            com.p683ss.android.ugc.aweme.tools.p2346a.C46806g.m101652a(r0, r1, r2, r3)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f111745a
            if (r1 != 0) goto L_0x017a
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x017a:
            boolean r1 = r1.f107055aG
            if (r1 == 0) goto L_0x0181
            r1 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0182
        L_0x0181:
            r1 = -1
        L_0x0182:
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r2)
            if (r2 != 0) goto L_0x01a2
            java.lang.String r2 = "extra_stickpoint_music_list"
            if (r7 == 0) goto L_0x019a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.io.Serializable r7 = (java.io.Serializable) r7
            r0.putExtra(r2, r7)
            r6.m96743c()
            goto L_0x01a2
        L_0x019a:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic>"
            r7.<init>(r0)
            throw r7
        L_0x01a2:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r6.f111745a
            if (r7 != 0) goto L_0x01ab
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x01ab:
            java.lang.String r7 = r7.f107133z
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r2 = "douplus"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r7 = android.text.TextUtils.equals(r7, r2)
            if (r7 == 0) goto L_0x01d2
            java.lang.String r7 = "extra_mention_user_model"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r6.f111745a
            if (r2 != 0) goto L_0x01c4
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01c4:
            com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel r2 = r2.f107063aO
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putExtra(r7, r2)
            java.lang.String r7 = "enter_from"
            java.lang.String r2 = "douplus"
            r0.putExtra(r7, r2)
        L_0x01d2:
            com.ss.android.ugc.aweme.shortvideo.q.b r7 = com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a.m97196a()
            android.app.Activity r2 = r6.f111749e
            android.content.Context r2 = (android.content.Context) r2
            r7.mo48302a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44108ap.mo90010a(java.util.List):void");
    }

    public C44108ap(Activity activity, long j, long j2) {
        C52711k.m112240b(activity, "activity");
        this.f111749e = activity;
        this.f111750f = j;
        this.f111751g = j2;
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        C52711k.m112240b(intent2, "data");
        if (i3 == 1 || i3 == 2) {
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data");
            C52711k.m112236a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List list = parcelableArrayListExtra;
            if (i3 == 1) {
                Parcelable parcelableExtra = intent2.getParcelableExtra("key_short_video_context");
                C52711k.m112236a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
                this.f111745a = (ShortVideoContext) parcelableExtra;
                int i4 = 0;
                this.f111752i = intent2.getIntExtra("extra_stick_point_type", 0);
                this.f111753j = intent2.getBooleanExtra("extra_stickpoint_mode", false);
                this.f111755l = intent2.getLongExtra("extra_start_enter_edit_page", -1);
                Collection collection = list;
                int size = collection.size();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i5 < size) {
                        if (((long) ((int) ((MediaModel) list.get(i5)).f95386e)) <= this.f111750f) {
                            C9432q.m18676a(this.f111749e, this.f111749e.getString(R.string.f85, new Object[]{Long.valueOf(this.f111750f / 1000)}));
                            C44109a.m96754a(1, 0);
                            break;
                        }
                        i6 += (int) ((MediaModel) list.get(i5)).f95386e;
                        if (((MediaModel) list.get(i5)).f95385d == 4) {
                            i7++;
                        }
                        i5++;
                    } else if (((long) i6) <= this.f111750f) {
                        C9432q.m18676a(this.f111749e, this.f111749e.getString(R.string.f85, new Object[]{Long.valueOf(this.f111750f / 1000)}));
                        C44109a.m96754a(1, 0);
                    } else if (i6 > 3600000) {
                        C9432q.m18672a((Context) this.f111749e, (int) R.string.c89);
                        C44109a.m96754a(2, 0);
                    } else {
                        C22795c.m56156a().mo47276c();
                        int size2 = collection.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            C22795c.m56156a().mo47271a((MediaModel) list.get(i8));
                        }
                        if (!C23715d.m58202a(collection)) {
                            C0013i.m16a((Callable<TResult>) new C44114e<TResult>(this, list)).mo20a((C0011g<TResult, TContinuationResult>) new C44115f<TResult,TContinuationResult>(this, list, i7, i6), C0013i.f25b);
                        }
                        if (this.f111745a != null) {
                            ShortVideoContext shortVideoContext = this.f111745a;
                            if (shortVideoContext == null) {
                                C52711k.m112237a("shortVideoContext");
                            }
                            String str = shortVideoContext.f107132y;
                            ShortVideoContext shortVideoContext2 = this.f111745a;
                            if (shortVideoContext2 == null) {
                                C52711k.m112237a("shortVideoContext");
                            }
                            C43047h.m94332a(str, shortVideoContext2.f107131x);
                        }
                        if (C43036f.m94312e() && list.size() > 1) {
                            m96747f();
                            int size3 = list.size();
                            StringBuilder sb = new StringBuilder();
                            for (Object next : list) {
                                int i9 = i4 + 1;
                                if (i4 < 0) {
                                    C52575l.m112100b();
                                }
                                sb.append(((MediaModel) next).f95386e);
                                if (i4 < size3 - 1) {
                                    sb.append(",");
                                }
                                i4 = i9;
                            }
                            C44300e.m97038a(list, (C44293g) new C44112d(this, size3, sb));
                        } else if (list.size() <= 1 || !C44300e.m97041c()) {
                            mo90010a(null);
                            return;
                        } else {
                            m96747f();
                            C44300e.m97038a(list, (C44293g) new C44111c(this));
                        }
                    }
                }
            } else if (i3 == 2) {
                m96744c(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo90011a(List<? extends MediaModel> list, int i, int i2, int i3) {
        String str;
        String str2;
        C23089d a = C23089d.m56640a().mo47829a("content_type", "video").mo47829a("content_source", "upload");
        String str3 = "upload_type";
        if (list == null) {
            C52711k.m112234a();
        }
        int i4 = 1;
        if (list.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        C23089d a2 = a.mo47829a(str3, str).mo47826a("video_cnt", i).mo47826a("pic_cnt", list.size() - i).mo47826a("duration_ms", i2);
        String str4 = "fps";
        if (i3 < 0) {
            str2 = "";
        } else {
            str2 = String.valueOf(i3);
        }
        C23089d a3 = a2.mo47829a(str4, str2);
        String str5 = "is_multi_content";
        if (list.size() <= 1) {
            i4 = 0;
        }
        C23089d a4 = a3.mo47826a(str5, i4).mo47829a("mix_type", C45624b.m99356a(i, list.size() - i)).mo47826a("is_add_more", 0);
        if (this.f111745a != null) {
            String str6 = "";
            String str7 = "";
            ShortVideoContext shortVideoContext = this.f111745a;
            if (shortVideoContext == null) {
                C52711k.m112237a("shortVideoContext");
            }
            if (CommentUtils.needMob(shortVideoContext)) {
                ShortVideoContext shortVideoContext2 = this.f111745a;
                if (shortVideoContext2 == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                str6 = shortVideoContext2.f107125r.getCommentId();
                ShortVideoContext shortVideoContext3 = this.f111745a;
                if (shortVideoContext3 == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                str7 = shortVideoContext3.f107125r.getUserId();
            }
            String str8 = "creation_id";
            ShortVideoContext shortVideoContext4 = this.f111745a;
            if (shortVideoContext4 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            C23089d a5 = a4.mo47829a(str8, shortVideoContext4.f107131x);
            String str9 = "shoot_way";
            ShortVideoContext shortVideoContext5 = this.f111745a;
            if (shortVideoContext5 == null) {
                C52711k.m112237a("shortVideoContext");
            }
            a5.mo47829a(str9, shortVideoContext5.f107132y).mo47829a("reply_comment_id", str6).mo47829a("reply_user_id", str7);
        }
        C26890h.m65011a("upload_content_next", a4.f61491a);
    }
}
