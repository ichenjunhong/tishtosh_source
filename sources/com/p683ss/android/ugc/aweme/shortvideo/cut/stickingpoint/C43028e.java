package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C43092a.C43093a;
import com.p683ss.android.vesdk.VEListener.C50541e;
import java.util.HashSet;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e */
public final class C43028e {

    /* renamed from: n */
    public static final C43029a f108617n = new C43029a(null);

    /* renamed from: a */
    public C20347c f108618a;

    /* renamed from: b */
    public int f108619b;

    /* renamed from: c */
    public VideoSegment f108620c;

    /* renamed from: d */
    public int f108621d;

    /* renamed from: e */
    public List<? extends VideoSegment> f108622e;

    /* renamed from: f */
    public C43030b f108623f;

    /* renamed from: g */
    public C43092a f108624g;

    /* renamed from: h */
    public Activity f108625h;

    /* renamed from: i */
    public float f108626i;

    /* renamed from: j */
    public float f108627j;

    /* renamed from: k */
    public boolean f108628k;

    /* renamed from: l */
    final HashSet<String> f108629l = new HashSet<>();

    /* renamed from: m */
    public final C43033e f108630m = new C43033e(this, Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$a */
    public static final class C43029a {
        private C43029a() {
        }

        public /* synthetic */ C43029a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$b */
    public interface C43030b {
        /* renamed from: a */
        void mo87275a();

        /* renamed from: a */
        void mo87276a(boolean z, boolean z2, boolean z3);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$c */
    public static final class C43031c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C43028e f108631a;

        public C43031c(C43028e eVar) {
            this.f108631a = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f108631a.mo87409b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$d */
    public static final class C43032d implements C43093a {

        /* renamed from: a */
        final /* synthetic */ C43028e f108632a;

        /* renamed from: a */
        public final void mo87412a() {
            this.f108632a.mo87407a(false, true, false);
            if (!C9190h.m18253a(this.f108632a.f108622e)) {
                C43047h hVar = C43047h.f108667g;
                List<? extends VideoSegment> list = this.f108632a.f108622e;
                if (!C9190h.m18253a(list)) {
                    long j = 0;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    for (VideoSegment videoSegment : list) {
                        j += videoSegment.f107904c;
                    }
                    C26890h.m65011a("smart_sync_cancel", C43047h.m94328a().mo47827a("content_duration_ms", j).f61491a);
                }
            }
        }

        public C43032d(C43028e eVar) {
            this.f108632a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$e */
    public static final class C43033e extends Handler {

        /* renamed from: a */
        final /* synthetic */ C43028e f108633a;

        public final void handleMessage(Message message) {
            C52711k.m112240b(message, "msg");
            if (message.what == 1001) {
                C43028e eVar = this.f108633a;
                Object obj = message.obj;
                if (obj != null) {
                    float floatValue = ((Float) obj).floatValue();
                    if (floatValue >= 1.0f) {
                        if (eVar.f108620c != null) {
                            VideoSegment videoSegment = eVar.f108620c;
                            if (videoSegment == null) {
                                C52711k.m112234a();
                            }
                            videoSegment.f107919r = true;
                            HashSet<String> hashSet = eVar.f108629l;
                            VideoSegment videoSegment2 = eVar.f108620c;
                            if (videoSegment2 == null) {
                                C52711k.m112234a();
                            }
                            hashSet.add(videoSegment2.mo86941a(false));
                        }
                        eVar.f108619b++;
                        eVar.f108627j = eVar.f108626i * ((float) eVar.f108619b);
                        int i = eVar.f108619b;
                        List<? extends VideoSegment> list = eVar.f108622e;
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        if (i >= list.size()) {
                            eVar.mo87407a(true, false, true);
                        } else {
                            List<? extends VideoSegment> list2 = eVar.f108622e;
                            if (list2 == null) {
                                C52711k.m112234a();
                            }
                            eVar.f108620c = (VideoSegment) list2.get(eVar.f108619b);
                            if (eVar.f108620c == null) {
                                eVar.mo87407a(false, false, false);
                            } else {
                                VideoSegment videoSegment3 = eVar.f108620c;
                                if (videoSegment3 == null) {
                                    C52711k.m112234a();
                                }
                                eVar.f108621d = videoSegment3.f107902a;
                                eVar.mo87405a();
                            }
                        }
                    } else {
                        float f = (floatValue * eVar.f108626i) + eVar.f108627j;
                        if (eVar.f108623f != null && eVar.f108623f == null) {
                            C52711k.m112234a();
                        }
                        int i2 = (int) (f * 100.0f);
                        if (i2 >= 100) {
                            i2 = 100;
                        }
                        eVar.mo87406a(i2);
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            } else if (message.what == 1002) {
                C43028e eVar2 = this.f108633a;
                Object obj2 = message.obj;
                if (obj2 == null) {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                } else if (((Float) obj2).floatValue() >= 1.0f) {
                    if (eVar2.f108620c != null) {
                        VideoSegment videoSegment4 = eVar2.f108620c;
                        if (videoSegment4 == null) {
                            C52711k.m112234a();
                        }
                        videoSegment4.f107919r = true;
                    }
                    eVar2.f108619b++;
                    int i3 = eVar2.f108619b;
                    List<? extends VideoSegment> list3 = eVar2.f108622e;
                    if (list3 == null) {
                        C52711k.m112234a();
                    }
                    if (i3 < list3.size()) {
                        List<? extends VideoSegment> list4 = eVar2.f108622e;
                        if (list4 == null) {
                            C52711k.m112234a();
                        }
                        eVar2.f108620c = (VideoSegment) list4.get(eVar2.f108619b);
                        if (eVar2.f108620c != null) {
                            VideoSegment videoSegment5 = eVar2.f108620c;
                            if (videoSegment5 == null) {
                                C52711k.m112234a();
                            }
                            eVar2.f108621d = videoSegment5.f107902a;
                            C20347c cVar = eVar2.f108618a;
                            if (cVar == null) {
                                C52711k.m112234a();
                            }
                            cVar.mo42980a(eVar2.f108621d, 1, true, (C50541e) new C43035g(eVar2));
                        }
                    }
                }
            }
        }

        C43033e(C43028e eVar, Looper looper) {
            this.f108633a = eVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$f */
    static final class C43034f implements C50541e {

        /* renamed from: a */
        final /* synthetic */ C43028e f108634a;

        C43034f(C43028e eVar) {
            this.f108634a = eVar;
        }

        /* renamed from: a */
        public final void mo87414a(float f) {
            Message obtain = Message.obtain();
            obtain.what = 1001;
            obtain.obj = Float.valueOf(f);
            this.f108634a.f108630m.sendMessage(obtain);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e$g */
    static final class C43035g implements C50541e {

        /* renamed from: a */
        final /* synthetic */ C43028e f108635a;

        C43035g(C43028e eVar) {
            this.f108635a = eVar;
        }

        /* renamed from: a */
        public final void mo87414a(float f) {
            Message obtain = Message.obtain();
            obtain.what = BaseNotice.CHECK_PROFILE;
            obtain.obj = Float.valueOf(f);
            this.f108635a.f108630m.sendMessage(obtain);
        }
    }

    /* renamed from: d */
    private final void m94291d() {
        if (this.f108624g != null) {
            C43092a aVar = this.f108624g;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.isShowing()) {
                C43092a aVar2 = this.f108624g;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo87405a() {
        if (!this.f108628k) {
            C20347c cVar = this.f108618a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo42980a(this.f108621d, 1, true, (C50541e) new C43034f(this));
        }
    }

    /* renamed from: b */
    public final void mo87409b() {
        this.f108628k = true;
        if (this.f108618a != null) {
            C20347c cVar = this.f108618a;
            if (cVar == null) {
                C52711k.m112234a();
            }
            cVar.mo43072k(this.f108621d);
        }
        this.f108630m.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final void mo87410c() {
        if (this.f108625h != null) {
            Activity activity = this.f108625h;
            if (activity == null) {
                C52711k.m112234a();
            }
            if (!activity.isFinishing() && this.f108624g != null) {
                C43092a aVar = this.f108624g;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (!aVar.isShowing()) {
                    try {
                        C43092a aVar2 = this.f108624g;
                        if (aVar2 == null) {
                            C52711k.m112234a();
                        }
                        aVar2.show();
                        mo87406a(0);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo87408a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        return this.f108629l.contains(videoSegment.mo86941a(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87406a(int i) {
        if (this.f108624g != null) {
            C43092a aVar = this.f108624g;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.isShowing()) {
                C43092a aVar2 = this.f108624g;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo87485a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo87407a(boolean z, boolean z2, boolean z3) {
        m94291d();
        if (this.f108623f != null) {
            if (this.f108628k) {
                C43030b bVar = this.f108623f;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                bVar.mo87276a(false, z2, z3);
                return;
            }
            C43030b bVar2 = this.f108623f;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            bVar2.mo87276a(z, z2, z3);
        }
    }
}
