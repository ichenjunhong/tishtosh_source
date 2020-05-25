package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.filter.C31417ar;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.C45893i;
import com.p683ss.android.ugc.aweme.sticker.C46073p;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45860c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46294c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46306b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46307a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46489c;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46489c.C46490a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46501a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46502b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46503c;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46505b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46508d;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46508d.C46511b;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.UrlPrefixViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter */
public class PixaloopARPresenter extends C46306b implements C0183j, C46190j, C46256q, C46294c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117224a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PixaloopARPresenter.class), "pixaloopManager", "getPixaloopManager()Lcom/ss/android/ugc/aweme/sticker/types/ar/pixelloop/PixaloopManager;"))};

    /* renamed from: b */
    public Effect f117225b;

    /* renamed from: c */
    public C46508d f117226c;

    /* renamed from: d */
    public final ArrayList<String> f117227d;

    /* renamed from: e */
    public String f117228e;

    /* renamed from: f */
    public long f117229f;

    /* renamed from: g */
    public int f117230g;

    /* renamed from: h */
    public final EffectStickerViewModel f117231h;

    /* renamed from: i */
    public final AppCompatActivity f117232i;

    /* renamed from: j */
    public final String f117233j;

    /* renamed from: k */
    public final C52682m<String, String, Integer> f117234k;

    /* renamed from: l */
    public ShortVideoContext f117235l;

    /* renamed from: m */
    private C46487b f117236m;

    /* renamed from: n */
    private boolean f117237n;

    /* renamed from: o */
    private boolean f117238o;

    /* renamed from: p */
    private boolean f117239p;

    /* renamed from: q */
    private final C52668f f117240q;

    /* renamed from: r */
    private final boolean f117241r;

    /* renamed from: s */
    private final C46501a f117242s;

    /* renamed from: t */
    private final C46307a f117243t;

    /* renamed from: u */
    private final C52671b<String, C52860x> f117244u;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$a */
    static final class C46468a extends C52712l implements C52686q<Integer, Integer, Intent, C52860x> {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f117246a;

        C46468a(PixaloopARPresenter pixaloopARPresenter) {
            this.f117246a = pixaloopARPresenter;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Intent intent = (Intent) obj3;
            if (intValue == C46476a.m100890a() && intent != null && intValue2 == -1) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
                C52711k.m112236a((Object) parcelableArrayListExtra, "selectMediaList");
                if (!parcelableArrayListExtra.isEmpty()) {
                    MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
                    C52711k.m112236a((Object) mediaModel, "mediaModel");
                    final String str = mediaModel.f95383b;
                    C45893i a = this.f117246a.f117231h.mo93416a();
                    C52711k.m112236a((Object) a, "effectStickerViewModel.recordStickerContext");
                    final LiveData a2 = a.mo91260a();
                    C45893i a3 = this.f117246a.f117231h.mo93416a();
                    C52711k.m112236a((Object) a3, "effectStickerViewModel.recordStickerContext");
                    LiveData a4 = a3.mo91260a();
                    C52711k.m112236a((Object) a4, "effectStickerViewModel.r…ickerContext.isNativeInit");
                    Boolean bool = (Boolean) a4.getValue();
                    if (bool == null || bool.booleanValue()) {
                        this.f117246a.mo93203b(str);
                    } else {
                        a2.observe(this.f117246a.f117232i, new C0199s<Boolean>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C46468a f117247a;

                            public final /* synthetic */ void onChanged(Object obj) {
                                Boolean bool = (Boolean) obj;
                                this.f117247a.f117246a.mo93203b(str);
                                a2.removeObserver(this);
                            }

                            {
                                this.f117247a = r1;
                            }
                        });
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$b */
    static final class C46470b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f117250a;

        C46470b(PixaloopARPresenter pixaloopARPresenter) {
            this.f117250a = pixaloopARPresenter;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f117250a.mo93205f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$c */
    static final class C46471c<T> implements C0199s<C46489c> {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f117251a;

        C46471c(PixaloopARPresenter pixaloopARPresenter) {
            this.f117251a = pixaloopARPresenter;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C46489c cVar = (C46489c) obj;
            if (cVar != null) {
                if (cVar.f117316a == C46490a.m100914a()) {
                    this.f117251a.f117229f = System.currentTimeMillis();
                    C46508d dVar = this.f117251a.f117226c;
                    if (dVar != null) {
                        Handler handler = this.f117251a.mo93204e().f117284c;
                        if (handler != null && dVar.mo93260i()) {
                            if (dVar.f117350c == null) {
                                Activity activity = dVar.f117352e;
                                if (activity == null) {
                                    C52711k.m112234a();
                                }
                                dVar.f117350c = new C46505b(activity);
                            }
                            C46505b bVar = dVar.f117350c;
                            if (bVar == null) {
                                C52711k.m112234a();
                            }
                            if (!bVar.isShowing()) {
                                handler.postDelayed(new C46511b(dVar), 300);
                            }
                        }
                    }
                    this.f117251a.f117228e = cVar.f117319d;
                    this.f117251a.mo93202a(true);
                }
                if (cVar.f117316a != C46490a.m100915b()) {
                    return;
                }
                if (TextUtils.isEmpty(this.f117251a.f117228e) || C52711k.m112239a((Object) this.f117251a.f117228e, (Object) cVar.f117319d)) {
                    C46508d dVar2 = this.f117251a.f117226c;
                    if (dVar2 != null) {
                        dVar2.mo93259h();
                    }
                    PixaloopARPresenter pixaloopARPresenter = this.f117251a;
                    Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f117251a.f117229f);
                    C39567as E = C39629l.m88232a().mo58567E();
                    String str2 = "pixaloop_loading_time";
                    C42437ay a = C42437ay.m93202a().mo86520a("duration", valueOf);
                    String str3 = "stickid";
                    Effect effect = pixaloopARPresenter.f117225b;
                    if (effect != null) {
                        str = effect.getEffectId();
                    } else {
                        str = null;
                    }
                    E.mo49426a(str2, 0, a.mo86521a(str3, str).mo86522b());
                    this.f117251a.mo93202a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$d */
    public static final class C46472d implements C46502b {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f117252a;

        /* renamed from: a */
        public final void mo93182a() {
            this.f117252a.f117230g = 1;
            PixaloopARPresenter pixaloopARPresenter = this.f117252a;
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            bundle.putInt("key_support_flag", 1);
            C45860c.m99704a(pixaloopARPresenter.f117232i, C46073p.m100128a().mo48311b(pixaloopARPresenter.f117232i, bundle, C46476a.m100890a(), C46476a.m100890a()), C46476a.m100890a(), new C46468a(pixaloopARPresenter));
        }

        C46472d(PixaloopARPresenter pixaloopARPresenter) {
            this.f117252a = pixaloopARPresenter;
        }

        /* renamed from: a */
        public final void mo93183a(C46487b bVar) {
            String str;
            if (bVar != null) {
                str = bVar.f117304a;
            } else {
                str = null;
            }
            if (str != null) {
                this.f117252a.mo93200a(bVar.f117304a);
                this.f117252a.f117230g = 2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$e */
    static final class C46473e extends C52712l implements C52670a<C46481b> {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f117253a;

        /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$e$a */
        public static final class C46474a implements C46503c {

            /* renamed from: a */
            final /* synthetic */ C46473e f117254a;

            C46474a(C46473e eVar) {
                this.f117254a = eVar;
            }

            /* renamed from: b */
            public final void mo93212b(List<C46487b> list) {
                C52711k.m112240b(list, "dataList");
                this.f117254a.f117253a.mo93206g();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
                if (r0 == null) goto L_0x0014;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo93210a(com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b r3) {
                /*
                    r2 = this;
                    if (r3 == 0) goto L_0x004d
                    boolean r0 = r3.f117306c
                    if (r0 == 0) goto L_0x004d
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$e r0 = r2.f117254a
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter r0 = r0.f117253a
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f117225b
                    if (r0 == 0) goto L_0x0014
                    java.lang.String r0 = r0.getEffectId()
                    if (r0 != 0) goto L_0x0016
                L_0x0014:
                    java.lang.String r0 = ""
                L_0x0016:
                    java.lang.String r1 = r3.f117307d
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x004d
                    java.lang.String r1 = r3.f117307d
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r0)
                    if (r0 == 0) goto L_0x004d
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter$e r0 = r2.f117254a
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.PixaloopARPresenter r0 = r0.f117253a
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.d r0 = r0.f117226c
                    if (r0 == 0) goto L_0x004d
                    if (r3 == 0) goto L_0x004c
                    com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a r0 = r0.f117349b
                    if (r0 != 0) goto L_0x0039
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x0039:
                    java.lang.String r1 = "pixaloopData"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r3, r1)
                    java.util.ArrayList<com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b> r1 = r0.f117269b
                    r1.add(r3)
                    int r3 = r0.getItemCount()
                    int r3 = r3 + -1
                    r0.notifyItemInserted(r3)
                L_0x004c:
                    return
                L_0x004d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.PixaloopARPresenter.C46473e.C46474a.mo93210a(com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b):void");
            }

            /* renamed from: a */
            public final void mo93211a(List<String> list) {
                List list2;
                int[] iArr;
                C52711k.m112240b(list, "imgList");
                Collection collection = list;
                if (!collection.isEmpty()) {
                    if (!(!collection.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        Iterable iterable = list;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            String str = (String) next;
                            PixaloopARPresenter pixaloopARPresenter = this.f117254a.f117253a;
                            boolean z = false;
                            if (!C50200d.m108346a(str)) {
                                iArr = new int[]{0, 0};
                            } else {
                                Options options = new Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str, options);
                                iArr = new int[]{options.outWidth, options.outHeight};
                            }
                            int i = iArr[0];
                            int i2 = iArr[1];
                            if (i >= 360 && i2 >= 480) {
                                z = true;
                            }
                            if (z) {
                                arrayList.add(next);
                            }
                        }
                        list2 = (List) arrayList;
                    } else {
                        list2 = new ArrayList();
                    }
                    this.f117254a.f117253a.f117227d.addAll(list2);
                    this.f117254a.f117253a.mo93201a(list2);
                    return;
                }
                this.f117254a.f117253a.mo93206g();
            }
        }

        C46473e(PixaloopARPresenter pixaloopARPresenter) {
            this.f117253a = pixaloopARPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46481b bVar = new C46481b();
            bVar.f117282a = this.f117253a.f117234k;
            C46503c aVar = new C46474a(this);
            C52711k.m112240b(aVar, "listener");
            bVar.f117289h = aVar;
            return bVar;
        }
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: b */
    public final boolean mo92899b() {
        return this.f117238o;
    }

    public final void cl_() {
    }

    /* renamed from: e */
    public final C46481b mo93204e() {
        return (C46481b) this.f117240q.getValue();
    }

    /* renamed from: c */
    public final void mo92900c() {
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            this.f117238o = true;
            dVar.mo93253b();
        }
    }

    /* renamed from: d */
    public final void mo92901d() {
        this.f117238o = false;
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            dVar.mo93254c();
        }
    }

    /* renamed from: g */
    public final void mo93206g() {
        this.f117237n = true;
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            dVar.mo93256e();
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            dVar.mo93259h();
            dVar.mo93255d();
        }
    }

    /* renamed from: a */
    public final void mo93028a() {
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            dVar.mo93255d();
        }
        this.f117238o = false;
        C46508d dVar2 = this.f117226c;
        if (dVar2 != null) {
            dVar2.mo93254c();
        }
        m100865h();
    }

    /* renamed from: f */
    public final void mo93205f() {
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            this.f117238o = true;
            dVar.mo93253b();
            if (C50201e.m108355a(this.f117227d)) {
                mo93204e().mo93227b();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f117227d);
                mo93201a((List<String>) arrayList);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        m100865h();
        this.f117227d.clear();
        C46481b e = mo93204e();
        if (VERSION.SDK_INT >= 18) {
            e.f117283b.quitSafely();
        }
        Handler handler = e.f117284c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C46476a.m100891a(false);
        C46476a.m100894b(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100865h() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b r0 = r4.mo93204e()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r4.f117225b
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r1.getEffectId()
            if (r1 == 0) goto L_0x0013
            long r1 = java.lang.Long.parseLong(r1)
            goto L_0x0015
        L_0x0013:
            r1 = 0
        L_0x0015:
            r0.mo93224a(r1)
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b r0 = r4.mo93204e()
            r0.mo93228c()
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r0 = r4.f117236m
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r0.mo93234c()
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b r0 = r4.mo93204e()
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r2 = r4.f117236m
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.mo93234c()
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            if (r2 != 0) goto L_0x003f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003f:
            java.lang.String r3 = ""
            r0.mo93225a(r2, r3)
        L_0x0044:
            r0 = 0
            r4.f117237n = r0
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.d r2 = r4.f117226c
            if (r2 == 0) goto L_0x0051
            r2.mo93256e()
            r2.mo93258g()
        L_0x0051:
            r4.f117236m = r1
            r4.f117225b = r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r4.f117235l
            if (r1 == 0) goto L_0x005c
            r1.f107102ba = r0
            return
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.PixaloopARPresenter.m100865h():void");
    }

    /* renamed from: i */
    private final void m100866i() {
        if (!C50201e.m108355a(this.f117227d)) {
            ArrayList arrayList = new ArrayList(this.f117227d.size());
            Iterator it = this.f117227d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132050j);
                arrayList.add(new C46487b(str, "", true));
            }
            C46508d dVar = this.f117226c;
            if (dVar != null) {
                dVar.mo93251a((List<C46487b>) arrayList);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46476a.m100892a(aVar.f116852a);
    }

    /* renamed from: b */
    public final void mo93203b(String str) {
        mo93200a(str);
        C46508d dVar = this.f117226c;
        if (dVar != null) {
            dVar.mo93255d();
            dVar.mo93250a(str);
        }
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.cuc);
        if (viewStubCompat != null) {
            this.f117226c = new C46508d(viewStubCompat, this.f117232i, this.f117241r, new C46472d(this));
        }
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        if (aVar == C46257a.AFTER_ANIMATE && this.f117225b != null && !mo92899b()) {
            mo93205f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo93200a(String str) {
        String str2;
        String str3;
        String str4;
        if (C50200d.m108346a(str) && this.f117236m != null) {
            C46501a aVar = this.f117242s;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            aVar.mo93243a(str2);
            C46481b e = mo93204e();
            C46487b bVar = this.f117236m;
            if (bVar != null) {
                str3 = bVar.mo93234c();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            e.mo93225a(str3, str4);
            if (str != null) {
                C52671b<String, C52860x> bVar2 = this.f117244u;
                if (bVar2 != null) {
                    bVar2.invoke(str);
                }
            }
            this.f117239p = true;
        }
    }

    /* renamed from: a */
    public final void mo93201a(List<String> list) {
        if (!this.f117237n && !C50201e.m108355a(list) && this.f117236m != null) {
            C46487b bVar = this.f117236m;
            if (bVar == null) {
                C52711k.m112234a();
            }
            if (C50201e.m108355a(bVar.mo93233b())) {
                C46508d dVar = this.f117226c;
                if (dVar != null && dVar.mo93248a() == 0) {
                    m100866i();
                }
                mo93206g();
                return;
            }
            C46508d dVar2 = this.f117226c;
            if (dVar2 != null) {
                dVar2.mo93257f();
            }
            mo93204e().mo93226a(list, this.f117236m);
        }
    }

    /* renamed from: a */
    public final void mo93202a(boolean z) {
        String str;
        String str2;
        if (this.f117239p) {
            ShortVideoContext shortVideoContext = this.f117235l;
            if (shortVideoContext != null) {
                shortVideoContext.f107102ba = 1;
            }
            str = "upload";
        } else {
            ShortVideoContext shortVideoContext2 = this.f117235l;
            if (shortVideoContext2 != null) {
                shortVideoContext2.f107102ba = 2;
            }
            str = "shoot";
        }
        switch (this.f117230g) {
            case 0:
                str2 = "click";
                break;
            case 1:
                str2 = "album";
                break;
            case 2:
                str2 = "photo";
                break;
            default:
                str2 = "click";
                break;
        }
        if (z) {
            Effect effect = this.f117225b;
            if (effect != null) {
                this.f117243t.mo93037a(effect, str, FaceStickerBean.sCurPropSource, str2);
            }
        } else {
            Effect effect2 = this.f117225b;
            if (effect2 != null) {
                this.f117243t.mo93038b(effect2, str, FaceStickerBean.sCurPropSource, str2);
            }
            this.f117239p = false;
            this.f117230g = 0;
        }
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        boolean z;
        Object obj;
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        if (C39629l.m88232a().mo58572c().mo49434a(this.f117232i) != 0) {
            C50275d.m108530a((Context) this.f117232i, (int) R.string.co0).mo98174a();
            return;
        }
        String str = null;
        boolean z2 = false;
        if (effect == null || this.f117225b == null) {
            z = false;
        } else {
            Effect effect2 = this.f117225b;
            if (effect2 != null) {
                obj = effect2.getEffectId();
            } else {
                obj = null;
            }
            z = C52711k.m112239a(obj, (Object) effect.getEffectId());
        }
        if (!z) {
            m100865h();
        }
        if (this.f117236m == null) {
            this.f117236m = new C46487b();
        }
        C46487b bVar2 = this.f117236m;
        if (bVar2 == null) {
            C52711k.m112234a();
        }
        if (!bVar2.mo93232a()) {
            C46487b bVar3 = this.f117236m;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            String sdkExtra = effect.getSdkExtra();
            C52711k.m112236a((Object) sdkExtra, "sticker.sdkExtra");
            bVar3.mo93231a(sdkExtra);
            C46487b bVar4 = this.f117236m;
            if (bVar4 == null) {
                C52711k.m112234a();
            }
            Boolean bool = bVar4.f117308e;
            if (bool == null) {
                C52711k.m112234a();
            }
            C46476a.f117260c = bool.booleanValue();
            C46487b bVar5 = this.f117236m;
            if (bVar5 == null) {
                C52711k.m112234a();
            }
            Boolean bool2 = bVar5.f117309f;
            if (bool2 == null) {
                C52711k.m112234a();
            }
            C46476a.m100894b(bool2.booleanValue());
        }
        C46476a.m100891a(true);
        C46487b bVar6 = this.f117236m;
        if (bVar6 == null) {
            C52711k.m112234a();
        }
        bVar6.f117307d = effect.getEffectId();
        this.f117225b = effect;
        C52711k.m112240b(effect, "sticker");
        String str2 = "direct_shoot";
        ShortVideoContext shortVideoContext = this.f117235l;
        if (shortVideoContext != null) {
            str = shortVideoContext.f107132y;
        }
        if (C52711k.m112239a((Object) str2, (Object) str)) {
            C46508d dVar = this.f117226c;
            if (dVar != null) {
                OnDismissListener bVar7 = new C46470b(this);
                Handler handler = mo93204e().f117284c;
                if (handler == null) {
                    C52711k.m112234a();
                }
                z2 = dVar.mo93252a(effect, bVar7, handler);
            }
            if (z2) {
                C46508d dVar2 = this.f117226c;
                if (dVar2 != null) {
                    dVar2.mo93254c();
                }
            } else {
                mo93205f();
            }
        } else {
            mo93205f();
        }
    }

    /* renamed from: a */
    public final void mo93021a(int i, int i2, int i3, String str) {
        boolean z;
        C46490a aVar = C46489c.f117315g;
        if (i == C46490a.m100915b() || i == C46490a.m100914a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0198r a = ((PixaloopMessageModule) C0214z.m440a((FragmentActivity) this.f117232i).mo359a(PixaloopMessageModule.class)).mo93213a();
            if (str == null) {
                C52711k.m112234a();
            }
            a.postValue(new C46489c(i, i2, i3, str));
        }
    }

    public PixaloopARPresenter(AppCompatActivity appCompatActivity, String str, boolean z, C52682m<? super String, ? super String, Integer> mVar, C46501a aVar, C46307a aVar2, C52671b<? super String, C52860x> bVar, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(mVar, "effectController");
        C52711k.m112240b(aVar, "pixaloopListener");
        C52711k.m112240b(aVar2, "mobHelper");
        this.f117232i = appCompatActivity;
        this.f117233j = str;
        this.f117241r = z;
        this.f117234k = mVar;
        this.f117242s = aVar;
        this.f117243t = aVar2;
        this.f117244u = bVar;
        this.f117235l = shortVideoContext;
        this.f117236m = new C46487b();
        this.f117227d = new ArrayList<>();
        this.f117229f = System.currentTimeMillis();
        C0209x a = C0214z.m440a((FragmentActivity) this.f117232i).mo359a(EffectStickerViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
        this.f117231h = (EffectStickerViewModel) a;
        this.f117240q = C52732g.m112285a(new C46473e(this));
        this.f117232i.getLifecycle().mo324a(this);
        if (C46476a.f117259b) {
            ((PixaloopMessageModule) C0214z.m440a((FragmentActivity) this.f117232i).mo359a(PixaloopMessageModule.class)).mo93213a().observe(this.f117232i, new C46471c(this));
        }
        ((UrlPrefixViewModel) C0214z.m440a((FragmentActivity) this.f117232i).mo359a(UrlPrefixViewModel.class)).f117619a.observe(this.f117232i, new C0199s<C31417ar<String, String>>(this) {

            /* renamed from: a */
            final /* synthetic */ PixaloopARPresenter f117245a;

            {
                this.f117245a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C31417ar arVar = (C31417ar) obj;
                if (arVar != null) {
                    List<String> list = arVar.get((Object) this.f117245a.f117233j);
                    if (list != null) {
                        C52711k.m112240b(list, "<set-?>");
                        C46476a.f117258a = list;
                    }
                }
            }
        });
    }

    public /* synthetic */ PixaloopARPresenter(AppCompatActivity appCompatActivity, String str, boolean z, C52682m mVar, C46501a aVar, C46307a aVar2, C52671b bVar, ShortVideoContext shortVideoContext, int i, C52707g gVar) {
        this(appCompatActivity, str, false, mVar, aVar, aVar2, null, null);
    }
}
