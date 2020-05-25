package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity */
public final class ImageChooseUploadActivity extends AmeActivity {

    /* renamed from: i */
    public static C29941b f78095i;

    /* renamed from: j */
    public static final C29926a f78096j = new C29926a(null);

    /* renamed from: a */
    public C48191h f78097a;

    /* renamed from: b */
    public RecyclerView f78098b;

    /* renamed from: c */
    public DmtTextView f78099c;

    /* renamed from: d */
    public DmtTextView f78100d;

    /* renamed from: e */
    public C29944c f78101e;

    /* renamed from: f */
    public List<String> f78102f;

    /* renamed from: g */
    public final C52682m<View, String, C52860x> f78103g = new C29932g(this);

    /* renamed from: h */
    public final C52671b<List<String>, C52860x> f78104h = new C29931f(this);

    /* renamed from: k */
    private DmtTextView f78105k;

    /* renamed from: l */
    private Boolean f78106l = Boolean.valueOf(true);

    /* renamed from: m */
    private int f78107m = 1;

    /* renamed from: n */
    private final int f78108n = 4;

    /* renamed from: o */
    private String f78109o = "";

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$a */
    public static final class C29926a {
        private C29926a() {
        }

        public /* synthetic */ C29926a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$b */
    static final class C29927b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78110a;

        C29927b(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78110a = imageChooseUploadActivity;
        }

        public final /* synthetic */ Object call() {
            return AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().getMediaLoaderImages(this.f78110a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$c */
    static final class C29928c<TTaskResult, TContinuationResult> implements C0011g<List<? extends MediaModel>, Object> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78111a;

        C29928c(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78111a = imageChooseUploadActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C1327f fVar;
            C52711k.m112236a((Object) iVar, "it");
            if (C23715d.m58202a((Collection) iVar.mo34e())) {
                C48191h hVar = this.f78111a.f78097a;
                if (hVar != null) {
                    hVar.dismiss();
                }
                DmtTextView dmtTextView = this.f78111a.f78100d;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(0);
                }
                DmtTextView dmtTextView2 = this.f78111a.f78100d;
                if (dmtTextView2 != null) {
                    dmtTextView2.setText(this.f78111a.getResources().getString(R.string.chd));
                }
            } else {
                DmtTextView dmtTextView3 = this.f78111a.f78100d;
                if (dmtTextView3 != null) {
                    dmtTextView3.setVisibility(8);
                }
                C48191h hVar2 = this.f78111a.f78097a;
                if (hVar2 != null) {
                    hVar2.dismiss();
                }
                C29944c cVar = this.f78111a.f78101e;
                if (cVar != null) {
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "it.result");
                    Collection collection = (Collection) e;
                    C52711k.m112240b(collection, "mediaTotal");
                    cVar.f78146a.clear();
                    cVar.f78146a.addAll(collection);
                    int size = cVar.f78146a.size();
                    if (cVar.f78148c == null) {
                        cVar.f78148c = new ArrayList();
                    } else {
                        List<Integer> list = cVar.f78148c;
                        if (list != null) {
                            list.clear();
                        }
                    }
                    if (cVar.f78147b == null) {
                        cVar.f78147b = new ArrayList();
                    } else {
                        List<Integer> list2 = cVar.f78147b;
                        if (list2 != null) {
                            list2.clear();
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        List<Integer> list3 = cVar.f78147b;
                        if (list3 != null) {
                            list3.add(Integer.valueOf(-1));
                        }
                    }
                    cVar.notifyDataSetChanged();
                }
                RecyclerView recyclerView = this.f78111a.f78098b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f78111a.f78101e);
                }
                RecyclerView recyclerView2 = this.f78111a.f78098b;
                if (recyclerView2 != null) {
                    fVar = recyclerView2.getItemAnimator();
                } else {
                    fVar = null;
                }
                if (!(fVar instanceof C1440au)) {
                    fVar = null;
                }
                C1440au auVar = (C1440au) fVar;
                if (auVar != null) {
                    auVar.f5184m = false;
                }
                C29944c cVar2 = this.f78111a.f78101e;
                if (cVar2 != null) {
                    cVar2.f78151f = this.f78111a.f78103g;
                }
                C29944c cVar3 = this.f78111a.f78101e;
                if (cVar3 != null) {
                    cVar3.f78152g = this.f78111a.f78104h;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$d */
    static final class C29929d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78112a;

        C29929d(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78112a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C29941b bVar = ImageChooseUploadActivity.f78095i;
            if (bVar != null) {
                bVar.mo49931j();
            }
            this.f78112a.finish();
            this.f78112a.mo60119a("cancel_image_choose");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$e */
    static final class C29930e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78113a;

        C29930e(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78113a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ImageChooseUploadActivity imageChooseUploadActivity = this.f78113a;
            if (!C23715d.m58202a((Collection<T>) imageChooseUploadActivity.f78102f)) {
                C29944c cVar = imageChooseUploadActivity.f78101e;
                if (cVar == null || !cVar.f78150e) {
                    C29944c cVar2 = imageChooseUploadActivity.f78101e;
                    if (cVar2 != null) {
                        cVar2.f78150e = true;
                    }
                    C48191h hVar = imageChooseUploadActivity.f78097a;
                    if (hVar != null) {
                        hVar.dismiss();
                    }
                    imageChooseUploadActivity.f78097a = new C48191h(imageChooseUploadActivity, imageChooseUploadActivity.getString(R.string.f8d));
                    C48191h hVar2 = imageChooseUploadActivity.f78097a;
                    if (hVar2 != null) {
                        hVar2.show();
                    }
                    C0013i.m16a((Callable<TResult>) new C29933h<TResult>(imageChooseUploadActivity));
                    imageChooseUploadActivity.mo60119a("upload_image_choose");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$f */
    static final class C29931f extends C52712l implements C52671b<List<? extends String>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78114a;

        C29931f(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78114a = imageChooseUploadActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Integer num;
            List<String> list = (List) obj;
            if (C23715d.m58204b(list)) {
                DmtTextView dmtTextView = this.f78114a.f78099c;
                if (dmtTextView != null) {
                    ImageChooseUploadActivity imageChooseUploadActivity = this.f78114a;
                    Object[] objArr = new Object[1];
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    } else {
                        num = Integer.valueOf(0);
                    }
                    objArr[0] = num;
                    dmtTextView.setText(imageChooseUploadActivity.getString(R.string.vr, objArr));
                }
                DmtTextView dmtTextView2 = this.f78114a.f78099c;
                if (dmtTextView2 != null) {
                    dmtTextView2.setVisibility(0);
                }
            } else {
                DmtTextView dmtTextView3 = this.f78114a.f78099c;
                if (dmtTextView3 != null) {
                    dmtTextView3.setVisibility(8);
                }
            }
            this.f78114a.f78102f = list;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$g */
    static final class C29932g extends C52712l implements C52682m<View, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78115a;

        C29932g(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78115a = imageChooseUploadActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            String str = (String) obj2;
            C52711k.m112240b(view, "v");
            if (!TextUtils.isEmpty(str)) {
                C23794bh.m58383I().startHeaderDetailActivity(this.f78115a, view, (((float) C9432q.m18670a((Context) this.f78115a)) * 1.0f) / ((float) C9432q.m18688b(this.f78115a)), null, false, null, str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$h */
    static final class C29933h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f78116a;

        C29933h(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f78116a = imageChooseUploadActivity;
        }

        public final /* synthetic */ Object call() {
            C29941b bVar = ImageChooseUploadActivity.f78095i;
            if (bVar == null) {
                return null;
            }
            bVar.mo49930a(this.f78116a.f78102f, new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C29933h f78117a;

                {
                    this.f78117a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    C48191h hVar = this.f78117a.f78116a.f78097a;
                    if (hVar != null) {
                        hVar.dismiss();
                    }
                    this.f78117a.f78116a.finish();
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C29941b bVar = f78095i;
        if (bVar != null) {
            bVar.mo49932k();
        }
        f78095i = null;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        mo60119a("cancel_image_choose");
        C29941b bVar = f78095i;
        if (bVar != null) {
            bVar.mo49931j();
        }
    }

    /* renamed from: a */
    public final void mo60119a(String str) {
        C26890h.m65011a(str, new C23089d().mo47829a("enter_from", this.f78109o).f61491a);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b7y);
        Context context = this;
        this.f78097a = new C48191h(context);
        this.f78098b = (RecyclerView) findViewById(R.id.cg6);
        RecyclerView recyclerView = this.f78098b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager(null, this.f78108n));
        }
        RecyclerView recyclerView2 = this.f78098b;
        if (recyclerView2 != null) {
            recyclerView2.mo4798a((C1331h) new C23745a(this.f78108n, (int) C9432q.m18687b(context, 1.0f), false));
        }
        this.f78100d = (DmtTextView) findViewById(R.id.dct);
        this.f78099c = (DmtTextView) findViewById(R.id.dgx);
        this.f78105k = (DmtTextView) findViewById(R.id.d7e);
        DmtTextView dmtTextView = this.f78105k;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C29929d(this));
        }
        DmtTextView dmtTextView2 = this.f78099c;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(new C29930e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f78106l = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.f78107m = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            String stringExtra = getIntent().getStringExtra("enter_from");
            C52711k.m112236a((Object) stringExtra, "intent.getStringExtra(ENTER_FROM)");
            this.f78109o = stringExtra;
        }
        C29944c cVar = new C29944c(context, this.f78108n, this.f78107m, this.f78106l, 1.0d, 1.5f, 0);
        this.f78101e = cVar;
        C48191h hVar = this.f78097a;
        if (hVar != null) {
            hVar.show();
        }
        C0013i.m16a((Callable<TResult>) new C29927b<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C29928c<TResult,TContinuationResult>(this), C0013i.f25b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", false);
    }
}
