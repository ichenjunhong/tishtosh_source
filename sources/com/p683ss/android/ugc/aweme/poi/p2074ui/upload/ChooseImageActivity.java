package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23579a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.poi.p2074ui.upload.C39416a.C39419c;
import com.p683ss.android.ugc.aweme.views.AutoRTLTextView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity */
public final class ChooseImageActivity extends AmeBaseActivity implements C39419c {

    /* renamed from: a */
    C39416a f100799a;

    /* renamed from: b */
    List<String> f100800b = new ArrayList();

    /* renamed from: c */
    ArrayList<String> f100801c = new ArrayList<>();

    /* renamed from: d */
    String f100802d;

    /* renamed from: e */
    private HashMap f100803e;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$a */
    static final class C39410a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f100804a;

        C39410a(ChooseImageActivity chooseImageActivity) {
            this.f100804a = chooseImageActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100804a.mo80384c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$b */
    static final class C39411b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f100805a;

        C39411b(ChooseImageActivity chooseImageActivity) {
            this.f100805a = chooseImageActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity r7 = r6.f100805a
                com.ss.android.ugc.aweme.poi.ui.upload.a r0 = r7.f100799a
                r1 = 0
                if (r0 == 0) goto L_0x0013
                java.util.List<java.lang.Integer> r0 = r0.f100825c
                if (r0 == 0) goto L_0x0013
                int r0 = r0.size()
                goto L_0x0014
            L_0x0013:
                r0 = 0
            L_0x0014:
                java.util.ArrayList<java.lang.String> r2 = r7.f100801c
                r2.clear()
            L_0x0019:
                if (r1 >= r0) goto L_0x0046
                java.util.ArrayList<java.lang.String> r2 = r7.f100801c
                java.util.List<java.lang.String> r3 = r7.f100800b
                r4 = 0
                if (r3 == 0) goto L_0x0040
                com.ss.android.ugc.aweme.poi.ui.upload.a r5 = r7.f100799a
                if (r5 == 0) goto L_0x0030
                java.util.List<java.lang.Integer> r5 = r5.f100825c
                if (r5 == 0) goto L_0x0030
                java.lang.Object r4 = r5.get(r1)
                java.lang.Integer r4 = (java.lang.Integer) r4
            L_0x0030:
                if (r4 != 0) goto L_0x0035
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0035:
                int r4 = r4.intValue()
                java.lang.Object r3 = r3.get(r4)
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
            L_0x0040:
                r2.add(r4)
                int r1 = r1 + 1
                goto L_0x0019
            L_0x0046:
                java.lang.String r0 = r7.f100802d
                if (r0 != 0) goto L_0x004c
                java.lang.String r0 = ""
            L_0x004c:
                r1 = r7
                android.app.Activity r1 = (android.app.Activity) r1
                java.util.ArrayList<java.lang.String> r7 = r7.f100801c
                java.lang.String r2 = "poiId"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
                java.lang.String r2 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                java.lang.String r2 = "uriList"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r2)
                android.content.Intent r2 = new android.content.Intent
                r3 = r1
                android.content.Context r3 = (android.content.Context) r3
                java.lang.Class<com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity> r4 = com.p683ss.android.ugc.aweme.poi.p2074ui.upload.PoiUploadImagePreviewActivity.class
                r2.<init>(r3, r4)
                java.lang.String r3 = "poi_id"
                r2.putExtra(r3, r0)
                java.lang.String r0 = "upload_img_uri_list"
                java.io.Serializable r7 = (java.io.Serializable) r7
                r2.putExtra(r0, r7)
                r7 = 17
                r1.startActivityForResult(r2, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.upload.ChooseImageActivity.C39411b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$c */
    public static final class C39412c extends C23579a {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f100806a;

        /* renamed from: a */
        public final void mo48772a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
        }

        C39412c(ChooseImageActivity chooseImageActivity) {
            this.f100806a = chooseImageActivity;
        }

        /* renamed from: a */
        public final void mo48773a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 5) {
                this.f100806a.mo80384c();
            }
        }
    }

    /* renamed from: b */
    private View m87645b(int i) {
        if (this.f100803e == null) {
            this.f100803e = new HashMap();
        }
        View view = (View) this.f100803e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100803e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bmc;
    }

    public final void onBackPressed() {
        mo80384c();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* renamed from: c */
    public final void mo80384c() {
        finish();
        overridePendingTransition(0, R.anim.r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m87646d() {
        /*
            r9 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r7 = 0
            r3[r7] = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r6 = "date_added DESC"
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x004c }
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x004c }
            if (r1 != 0) goto L_0x0029
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            return r2
        L_0x0024:
            r0 = move-exception
            goto L_0x005a
        L_0x0026:
            r2 = move-exception
            r8 = r1
            goto L_0x004d
        L_0x0029:
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x0035
        L_0x0034:
            r2 = r8
        L_0x0035:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r1.getString(r7)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            r0.add(r2)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x0029
        L_0x0043:
            if (r1 == 0) goto L_0x0057
            r1.close()
            goto L_0x0057
        L_0x0049:
            r0 = move-exception
            r1 = r8
            goto L_0x005a
        L_0x004c:
            r2 = move-exception
        L_0x004d:
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0049 }
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r2)     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x0057
            r8.close()
        L_0x0057:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.upload.ChooseImageActivity.m87646d():java.util.List");
    }

    /* renamed from: b */
    public final void mo46325b() {
        super.mo46325b();
        this.f100802d = getIntent().getStringExtra("poi_id");
        if (VERSION.SDK_INT >= 19) {
            int a = C11065a.m22390a((Context) this);
            View b = m87645b(R.id.csm);
            C52711k.m112236a((Object) b, "status_bar");
            b.getLayoutParams().height = a;
        }
        if (C30433j.m71354a()) {
            new C39429f(this).show();
        }
        ((ImageView) m87645b(R.id.ik)).setOnClickListener(new C39410a(this));
        ((AutoRTLTextView) m87645b(R.id.d6l)).setOnClickListener(new C39411b(this));
        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.m57784a((LinearLayout) m87645b(R.id.a4q));
        a2.f62717k = new C39412c(this);
        C52711k.m112236a((Object) a2, "behavior");
        a2.f62710d = true;
        Context context = this;
        a2.mo48761a(C23724k.m58221a(context) + C23724k.m58228d(context));
        RecyclerView recyclerView = (RecyclerView) m87645b(R.id.arb);
        C52711k.m112236a((Object) recyclerView, "image_grid");
        recyclerView.setLayoutManager(new GridLayoutManager(null, 4));
        ((RecyclerView) m87645b(R.id.arb)).mo4798a((C1331h) new C23745a(4, (int) C9432q.m18687b(context, 1.0f), false));
        C39416a aVar = new C39416a(context, 4, 1.0d, 1.5f, 0, this);
        this.f100799a = aVar;
        RecyclerView recyclerView2 = (RecyclerView) m87645b(R.id.arb);
        C52711k.m112236a((Object) recyclerView2, "image_grid");
        recyclerView2.setAdapter(this.f100799a);
        this.f100800b.addAll(m87646d());
        C39416a aVar2 = this.f100799a;
        if (aVar2 != null) {
            List<String> list = this.f100800b;
            C52711k.m112240b(list, "filePaths");
            aVar2.f100823a.clear();
            aVar2.f100823a.addAll(list);
            int size = aVar2.f100823a.size();
            if (aVar2.f100825c == null) {
                aVar2.f100825c = new ArrayList();
            } else {
                List<Integer> list2 = aVar2.f100825c;
                if (list2 != null) {
                    list2.clear();
                }
            }
            if (aVar2.f100824b == null) {
                aVar2.f100824b = new ArrayList();
            } else {
                List<Integer> list3 = aVar2.f100824b;
                if (list3 != null) {
                    list3.clear();
                }
            }
            for (int i = 0; i < size; i++) {
                List<Integer> list4 = aVar2.f100824b;
                if (list4 != null) {
                    list4.add(Integer.valueOf(-1));
                }
            }
            aVar2.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo80383a(int i) {
        if (i > 0) {
            AutoRTLTextView autoRTLTextView = (AutoRTLTextView) m87645b(R.id.d6l);
            C52711k.m112236a((Object) autoRTLTextView, "tv_add");
            autoRTLTextView.setVisibility(0);
            AutoRTLTextView autoRTLTextView2 = (AutoRTLTextView) m87645b(R.id.d6l);
            C52711k.m112236a((Object) autoRTLTextView2, "tv_add");
            String string = getString(R.string.cgo);
            C52711k.m112236a((Object) string, "getString(R.string.next_step_with_count)");
            String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            autoRTLTextView2.setText(a);
            return;
        }
        AutoRTLTextView autoRTLTextView3 = (AutoRTLTextView) m87645b(R.id.d6l);
        C52711k.m112236a((Object) autoRTLTextView3, "tv_add");
        autoRTLTextView3.setVisibility(8);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 17) {
            finish();
        }
    }
}
