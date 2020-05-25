package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PreviewBoxView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.SwitchModeFrameLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.SwitchModeFrameLayout.C40420a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.util.C40567r;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity */
public final class CropActivity extends AmeSSActivity implements C39978l, C39985s {

    /* renamed from: k */
    public static final C40055a f102052k = new C40055a(null);

    /* renamed from: a */
    public PinchImageView f102053a;

    /* renamed from: b */
    public PreviewBoxView f102054b;

    /* renamed from: c */
    public String f102055c;

    /* renamed from: d */
    C39948a f102056d;

    /* renamed from: e */
    public UrlModel f102057e;

    /* renamed from: f */
    Bitmap f102058f;

    /* renamed from: g */
    public Rect f102059g;

    /* renamed from: h */
    C41047a f102060h;

    /* renamed from: i */
    int f102061i;

    /* renamed from: j */
    int f102062j;

    /* renamed from: l */
    private SwitchModeFrameLayout f102063l;

    /* renamed from: m */
    private DmtTextView f102064m;

    /* renamed from: n */
    private DmtTextView f102065n;

    /* renamed from: o */
    private TextTitleBar f102066o;

    /* renamed from: p */
    private View f102067p;

    /* renamed from: q */
    private DmtStatusView f102068q;

    /* renamed from: r */
    private C39718ad f102069r;

    /* renamed from: s */
    private C39954ad f102070s;

    /* renamed from: t */
    private HashMap f102071t;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$a */
    public static final class C40055a {
        private C40055a() {
        }

        public /* synthetic */ C40055a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m89042a(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(str, "originalUrl");
            Intent intent = new Intent(activity, CropActivity.class);
            intent.putExtra("original_url", str);
            intent.putExtra("is_oval", z);
            intent.putExtra("rect_ratio", f);
            intent.putExtra("rect_margin", i);
            intent.putExtra("extra_min_width", i3);
            intent.putExtra("extra_min_height", i4);
            activity.startActivityForResult(intent, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$b */
    static final class C40056b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102072a;

        C40056b(CropActivity cropActivity) {
            this.f102072a = cropActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CropActivity.m89031a(this.f102072a).getPinchMode() == 0) {
                this.f102072a.setResult(0);
                this.f102072a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$c */
    static final class C40057c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102073a;

        C40057c(CropActivity cropActivity) {
            this.f102073a = cropActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CropActivity.m89031a(this.f102073a).getPinchMode() == 0) {
                C0013i.m16a((Callable<TResult>) new Callable<String>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40057c f102074a;

                    {
                        this.f102074a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        String str;
                        CropActivity cropActivity = this.f102074a.f102073a;
                        File a = C40567r.m89999a();
                        PinchImageView pinchImageView = cropActivity.f102053a;
                        if (pinchImageView == null) {
                            C52711k.m112237a("mCoverImage");
                        }
                        Bitmap bitmap = cropActivity.f102058f;
                        if (bitmap == null) {
                            C52711k.m112237a("originalBitmap");
                        }
                        RectF a2 = pinchImageView.mo82659a((RectF) null);
                        Rect rect = cropActivity.f102059g;
                        if (rect != null) {
                            float width = ((float) bitmap.getWidth()) / a2.width();
                            float height = ((float) bitmap.getHeight()) / a2.height();
                            int c = C52753d.m112321c((int) ((((float) rect.left) - a2.left) * width), 0);
                            int c2 = C52753d.m112321c((int) ((((float) rect.top) - a2.top) * height), 0);
                            int d = C52753d.m112322d((int) (((float) rect.width()) * width), bitmap.getWidth() - c);
                            int d2 = C52753d.m112322d((int) (((float) rect.height()) * height), bitmap.getHeight() - c2);
                            if (d < cropActivity.f102061i || d2 < cropActivity.f102062j) {
                                C0013i.m18a((Callable<TResult>) new C40060d<TResult>(cropActivity), C0013i.f25b);
                                bitmap = null;
                            } else {
                                bitmap = Bitmap.createBitmap(bitmap, c, c2, d, d2);
                            }
                        }
                        if (bitmap != null) {
                            C52711k.m112236a((Object) a, "file");
                            String parent = a.getParent();
                            C52711k.m112236a((Object) parent, "file.parent");
                            String name = a.getName();
                            C52711k.m112236a((Object) name, "file.name");
                            boolean a3 = CropActivity.m89032a(bitmap, parent, name);
                            StringBuilder sb = new StringBuilder("saveToFile:");
                            if (a3) {
                                str = a.getAbsolutePath();
                            } else {
                                str = TEVideoRecorder.FACE_BEAUTY_NULL;
                            }
                            sb.append(str);
                            if (a3) {
                                return a.getAbsolutePath();
                            }
                        }
                        return null;
                    }
                }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<String, Void>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40057c f102075a;

                    {
                        this.f102075a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        C52711k.m112236a((Object) iVar, "task");
                        if (!iVar.mo26b() || TextUtils.isEmpty((CharSequence) iVar.mo34e())) {
                            C10691a.m21545b((Context) this.f102075a.f102073a, "裁剪失败，请重试").mo19066a();
                        } else {
                            CropActivity cropActivity = this.f102075a.f102073a;
                            Object e = iVar.mo34e();
                            C52711k.m112236a(e, "task.result");
                            String str = (String) e;
                            if (cropActivity.f102060h == null) {
                                cropActivity.f102060h = C41047a.m90709a(cropActivity, cropActivity.getString(R.string.fcg));
                                C41047a aVar = cropActivity.f102060h;
                                if (aVar != null) {
                                    aVar.setIndeterminate(false);
                                }
                                C41047a aVar2 = cropActivity.f102060h;
                                if (aVar2 != null) {
                                    aVar2.mo83563a(cropActivity.getResources().getDrawable(R.drawable.dms));
                                }
                            } else {
                                C41047a aVar3 = cropActivity.f102060h;
                                if (aVar3 == null) {
                                    C52711k.m112234a();
                                }
                                if (!aVar3.isShowing()) {
                                    C41047a aVar4 = cropActivity.f102060h;
                                    if (aVar4 != null) {
                                        aVar4.show();
                                    }
                                    C41047a aVar5 = cropActivity.f102060h;
                                    if (aVar5 != null) {
                                        aVar5.mo83562a();
                                    }
                                }
                            }
                            cropActivity.f102055c = str;
                            C39948a aVar6 = cropActivity.f102056d;
                            if (aVar6 != null) {
                                aVar6.mo53276a(str);
                            }
                            C39948a aVar7 = cropActivity.f102056d;
                            if (aVar7 != null) {
                                aVar7.mo81847d();
                            }
                        }
                        return null;
                    }
                }, C0013i.f25b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$d */
    static final class C40060d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102076a;

        C40060d(CropActivity cropActivity) {
            this.f102076a = cropActivity;
        }

        public final /* synthetic */ Object call() {
            C10691a.m21542b((Context) this.f102076a, (int) R.string.cp3).mo19066a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$e */
    static final class C40061e implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102077a;

        C40061e(CropActivity cropActivity) {
            this.f102077a = cropActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f102077a.f102059g == null) {
                this.f102077a.f102059g = CropActivity.m89033b(this.f102077a).getVisibleRect();
                CropActivity.m89031a(this.f102077a).setDisplayWindowRect(this.f102077a.f102059g);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$f */
    public static final class C40062f extends C40420a {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102078a;

        C40062f(CropActivity cropActivity) {
            this.f102078a = cropActivity;
        }

        /* renamed from: a */
        public final void mo82114a(MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 0) {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    if (this.f102078a.f102059g == null) {
                        this.f102078a.f102059g = CropActivity.m89033b(this.f102078a).getVisibleRect();
                    }
                    CropActivity.m89033b(this.f102078a).mo82686a();
                }
                return;
            }
            CropActivity.m89033b(this.f102078a).mo82687b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$g */
    static final class C40063g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102079a;

        C40063g(CropActivity cropActivity) {
            this.f102079a = cropActivity;
        }

        public final void run() {
            CropActivity.m89033b(this.f102079a).mo82686a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$h */
    static final class C40064h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f102080a;

        C40064h(CropActivity cropActivity) {
            this.f102080a = cropActivity;
        }

        public final void run() {
            this.f102080a.mo82107a();
            Intent intent = new Intent();
            intent.setData(Uri.fromFile(new File(this.f102080a.f102055c)));
            intent.putExtra(LeakCanaryFileProvider.f132050j, this.f102080a.f102057e);
            this.f102080a.setResult(-1, intent);
            this.f102080a.finish();
        }
    }

    /* renamed from: a */
    private View m89030a(int i) {
        if (this.f102071t == null) {
            this.f102071t = new HashMap();
        }
        View view = (View) this.f102071t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102071t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
        if (z) {
            DmtStatusView dmtStatusView = this.f102068q;
            if (dmtStatusView == null) {
                C52711k.m112237a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            if (this.f102060h != null) {
                C41047a aVar = this.f102060h;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                if (aVar.isShowing()) {
                    C41047a aVar2 = this.f102060h;
                    if (aVar2 != null) {
                        aVar2.setMessage(getString(R.string.fbt));
                    }
                    C41047a aVar3 = this.f102060h;
                    if (aVar3 != null) {
                        aVar3.mo83564b();
                    }
                    new Handler().postDelayed(new C40064h(this), 500);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C10691a.m21545b((Context) this, str).mo19066a();
        }
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        C41047a aVar = this.f102060h;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f102060h = null;
    }

    /* renamed from: a */
    public final void mo82107a() {
        if (this.f102060h != null) {
            C41047a aVar = this.f102060h;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.isShowing()) {
                try {
                    C41047a aVar2 = this.f102060h;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PinchImageView m89031a(CropActivity cropActivity) {
        PinchImageView pinchImageView = cropActivity.f102053a;
        if (pinchImageView == null) {
            C52711k.m112237a("mCoverImage");
        }
        return pinchImageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ PreviewBoxView m89033b(CropActivity cropActivity) {
        PreviewBoxView previewBoxView = cropActivity.f102054b;
        if (previewBoxView == null) {
            C52711k.m112237a("mCoverWindow");
        }
        return previewBoxView;
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        String str;
        C39718ad adVar = this.f102069r;
        Map map = null;
        if (adVar != null) {
            if (avatarUri != null) {
                str = avatarUri.uri;
            } else {
                str = null;
            }
            adVar.f101359d = str;
        }
        C39954ad adVar2 = this.f102070s;
        if (adVar2 != null) {
            C39718ad adVar3 = this.f102069r;
            if (adVar3 != null) {
                map = adVar3.mo80822a();
            }
            adVar2.mo81853a(map);
        }
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        C22971a.m56493a((Context) this, (Throwable) exc);
        DmtStatusView dmtStatusView = this.f102068q;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo82107a();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bod);
        ConstraintLayout constraintLayout = (ConstraintLayout) m89030a((int) R.id.cfg);
        C52711k.m112236a((Object) constraintLayout, "root_layout");
        this.f102067p = constraintLayout;
        SwitchModeFrameLayout switchModeFrameLayout = (SwitchModeFrameLayout) m89030a((int) R.id.a2h);
        C52711k.m112236a((Object) switchModeFrameLayout, "crop_container");
        this.f102063l = switchModeFrameLayout;
        PinchImageView pinchImageView = (PinchImageView) m89030a((int) R.id.azj);
        C52711k.m112236a((Object) pinchImageView, "iv_cover");
        this.f102053a = pinchImageView;
        PreviewBoxView previewBoxView = (PreviewBoxView) m89030a((int) R.id.azq);
        C52711k.m112236a((Object) previewBoxView, "iv_cover_window");
        this.f102054b = previewBoxView;
        DmtTextView dmtTextView = (DmtTextView) m89030a((int) R.id.d7e);
        C52711k.m112236a((Object) dmtTextView, "tv_cancel");
        this.f102064m = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) m89030a((int) R.id.d8c);
        C52711k.m112236a((Object) dmtTextView2, "tv_confirm");
        this.f102065n = dmtTextView2;
        TextTitleBar textTitleBar = (TextTitleBar) m89030a((int) R.id.d10);
        C52711k.m112236a((Object) textTitleBar, "title_bar");
        this.f102066o = textTitleBar;
        DmtStatusView dmtStatusView = (DmtStatusView) m89030a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        this.f102068q = dmtStatusView;
        this.f102056d = new C39948a();
        C39948a aVar = this.f102056d;
        if (aVar != null) {
            aVar.mo80925b(this, null);
        }
        C39948a aVar2 = this.f102056d;
        if (aVar2 != null) {
            aVar2.f101827c = this;
        }
        this.f102069r = new C39718ad();
        this.f102070s = new C39954ad();
        C39954ad adVar = this.f102070s;
        if (adVar != null) {
            adVar.mo81850a((C39985s) this);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("is_oval", false);
        this.f102061i = getIntent().getIntExtra("extra_min_width", 0);
        if (this.f102061i == 0) {
            this.f102061i = NormalSplashDelayExperiment.GROUP1;
        }
        this.f102062j = getIntent().getIntExtra("extra_min_height", 0);
        if (this.f102062j == 0) {
            this.f102062j = NormalSplashDelayExperiment.GROUP1;
        }
        PreviewBoxView previewBoxView2 = this.f102054b;
        if (previewBoxView2 == null) {
            C52711k.m112237a("mCoverWindow");
        }
        previewBoxView2.f103144c = booleanExtra ? 1 : 0;
        previewBoxView2.f103145d = getIntent().getFloatExtra("rect_ratio", 1.0f);
        previewBoxView2.f103143b = getIntent().getIntExtra("rect_margin", 0);
        DmtTextView dmtTextView3 = this.f102064m;
        if (dmtTextView3 == null) {
            C52711k.m112237a("mCancel");
        }
        dmtTextView3.setOnClickListener(new C40056b(this));
        DmtTextView dmtTextView4 = this.f102065n;
        if (dmtTextView4 == null) {
            C52711k.m112237a("mConfirm");
        }
        dmtTextView4.setText(getString(R.string.avl));
        View view = this.f102067p;
        if (view == null) {
            C52711k.m112237a("mRootView");
        }
        view.setBackgroundColor(getResources().getColor(R.color.ji));
        DmtTextView dmtTextView5 = this.f102064m;
        if (dmtTextView5 == null) {
            C52711k.m112237a("mCancel");
        }
        dmtTextView5.setTextColor(getResources().getColor(R.color.jf));
        TextTitleBar textTitleBar2 = this.f102066o;
        if (textTitleBar2 == null) {
            C52711k.m112237a("mTitleBar");
        }
        textTitleBar2.setTitleColor(getResources().getColor(R.color.jf));
        DmtTextView dmtTextView6 = this.f102065n;
        if (dmtTextView6 == null) {
            C52711k.m112237a("mConfirm");
        }
        dmtTextView6.setOnClickListener(new C40057c(this));
        String stringExtra = getIntent().getStringExtra("original_url");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            setResult(0);
        } else {
            int readPictureDegree = BitmapUtils.readPictureDegree(stringExtra);
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080);
            if (bitmapFromSD == null) {
                finish();
                setResult(0);
            } else {
                Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmapFromSD, readPictureDegree);
                C52711k.m112236a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(bitmap, degree)");
                this.f102058f = rotateBitmap;
                PinchImageView pinchImageView2 = this.f102053a;
                if (pinchImageView2 == null) {
                    C52711k.m112237a("mCoverImage");
                }
                Bitmap bitmap = this.f102058f;
                if (bitmap == null) {
                    C52711k.m112237a("originalBitmap");
                }
                pinchImageView2.setImageBitmap(bitmap);
                PreviewBoxView previewBoxView3 = this.f102054b;
                if (previewBoxView3 == null) {
                    C52711k.m112237a("mCoverWindow");
                }
                previewBoxView3.addOnLayoutChangeListener(new C40061e(this));
                SwitchModeFrameLayout switchModeFrameLayout2 = this.f102063l;
                if (switchModeFrameLayout2 == null) {
                    C52711k.m112237a("mCropContainer");
                }
                switchModeFrameLayout2.setIntercepter(new C40062f(this));
                PreviewBoxView previewBoxView4 = this.f102054b;
                if (previewBoxView4 == null) {
                    C52711k.m112237a("mCoverWindow");
                }
                previewBoxView4.postDelayed(new C40063g(this), 1000);
            }
        }
        if (VERSION.SDK_INT >= 19) {
            int a = C11065a.m22390a((Context) this);
            TextTitleBar textTitleBar3 = this.f102066o;
            if (textTitleBar3 == null) {
                C52711k.m112237a("mTitleBar");
            }
            LayoutParams layoutParams = textTitleBar3.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = a;
                TextTitleBar textTitleBar4 = this.f102066o;
                if (textTitleBar4 == null) {
                    C52711k.m112237a("mTitleBar");
                }
                textTitleBar4.requestLayout();
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        this.f102057e = urlModel;
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        C22971a.m56493a((Context) this, (Throwable) exc);
        DmtStatusView dmtStatusView = this.f102068q;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo82107a();
    }

    /* renamed from: a */
    public static boolean m89032a(Bitmap bitmap, String str, String str2) {
        C52711k.m112240b(bitmap, "bitmap");
        C52711k.m112240b(str, "dirPath");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        if (!C52711k.m112239a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            C32458a.m75141a(6, "saveBitmapToSD", "not mounted");
            return false;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append("/");
            sb.append(str2);
            File file2 = new File(sb.toString());
            try {
                if (file2.exists() || file2.createNewFile()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        boolean compress = bitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                        if (!compress) {
                            C32458a.m75141a(6, "saveBitmapToSD", "compress fails");
                        }
                        fileOutputStream.flush();
                        try {
                        } catch (Exception e) {
                            C32458a.m75143a(e);
                        }
                        return compress;
                    } catch (Exception e2) {
                        C32458a.m75143a(e2);
                        try {
                        } catch (Exception e3) {
                            C32458a.m75143a(e3);
                        }
                        return false;
                    } finally {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            C32458a.m75143a(e4);
                        }
                    }
                } else {
                    C32458a.m75141a(6, "saveBitmapToSD", "createNewFile fails");
                    return false;
                }
            } catch (Exception e5) {
                C32458a.m75143a(e5);
                return false;
            }
        } else {
            C32458a.m75141a(6, "saveBitmapToSD", "mkdirs fails");
            return false;
        }
    }
}
