package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.poi.model.C39115au;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity */
public final class PoiUploadImagePreviewActivity extends AmeBaseActivity implements OnClickListener, C39432g {

    /* renamed from: t */
    public static final C39413a f100807t = new C39413a(null);

    /* renamed from: a */
    boolean f100808a = true;

    /* renamed from: b */
    String f100809b;

    /* renamed from: c */
    public SparseArray<AvatarUri> f100810c;

    /* renamed from: d */
    public List<String> f100811d;

    /* renamed from: e */
    public AtomicInteger f100812e;

    /* renamed from: f */
    public AtomicInteger f100813f;

    /* renamed from: r */
    ArrayList<String> f100814r;

    /* renamed from: s */
    C39426d f100815s;

    /* renamed from: u */
    private C39427e f100816u;

    /* renamed from: v */
    private List<C9382a> f100817v;

    /* renamed from: w */
    private HashMap f100818w;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$a */
    public static final class C39413a {
        private C39413a() {
        }

        public /* synthetic */ C39413a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$b */
    public static final class C39414b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ PoiUploadImagePreviewActivity f100819a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C39414b(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity) {
            this.f100819a = poiUploadImagePreviewActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f100819a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$c */
    static final class C39415c implements C9382a {

        /* renamed from: a */
        final /* synthetic */ PoiUploadImagePreviewActivity f100820a;

        /* renamed from: b */
        final /* synthetic */ int f100821b;

        C39415c(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity, int i) {
            this.f100820a = poiUploadImagePreviewActivity;
            this.f100821b = i;
        }

        public final void handleMsg(Message message) {
            String str;
            if (this.f100820a.f100810c != null && this.f100820a.f100813f != null && this.f100820a.f100812e != null && this.f100820a.f100811d != null) {
                if (message.obj instanceof C23459a) {
                    Context context = this.f100820a;
                    Object obj = message.obj;
                    if (obj != null) {
                        C10691a.m21545b(context, ((C23459a) obj).getErrorMsg()).mo19066a();
                        SparseArray<AvatarUri> sparseArray = this.f100820a.f100810c;
                        if (sparseArray != null) {
                            sparseArray.put(this.f100821b, new AvatarUri());
                        }
                        AtomicInteger atomicInteger = this.f100820a.f100813f;
                        if (atomicInteger != null) {
                            atomicInteger.incrementAndGet();
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    }
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (C23715d.m58204b(avatarUri.urlList)) {
                            SparseArray<AvatarUri> sparseArray2 = this.f100820a.f100810c;
                            if (sparseArray2 == null) {
                                C52711k.m112234a();
                            }
                            sparseArray2.put(this.f100821b, avatarUri);
                            AtomicInteger atomicInteger2 = this.f100820a.f100812e;
                            if (atomicInteger2 == null) {
                                C52711k.m112234a();
                            }
                            atomicInteger2.incrementAndGet();
                        } else {
                            SparseArray<AvatarUri> sparseArray3 = this.f100820a.f100810c;
                            if (sparseArray3 == null) {
                                C52711k.m112234a();
                            }
                            sparseArray3.put(this.f100821b, new AvatarUri());
                            AtomicInteger atomicInteger3 = this.f100820a.f100813f;
                            if (atomicInteger3 == null) {
                                C52711k.m112234a();
                            }
                            atomicInteger3.incrementAndGet();
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    }
                } else {
                    SparseArray<AvatarUri> sparseArray4 = this.f100820a.f100810c;
                    if (sparseArray4 == null) {
                        C52711k.m112234a();
                    }
                    sparseArray4.put(this.f100821b, new AvatarUri());
                    AtomicInteger atomicInteger4 = this.f100820a.f100813f;
                    if (atomicInteger4 == null) {
                        C52711k.m112234a();
                    }
                    atomicInteger4.incrementAndGet();
                }
                AtomicInteger atomicInteger5 = this.f100820a.f100813f;
                if (atomicInteger5 == null) {
                    C52711k.m112234a();
                }
                int i = atomicInteger5.get();
                AtomicInteger atomicInteger6 = this.f100820a.f100812e;
                if (atomicInteger6 == null) {
                    C52711k.m112234a();
                }
                int i2 = i + atomicInteger6.get();
                List<String> list = this.f100820a.f100811d;
                if (list != null && i2 == list.size()) {
                    AtomicInteger atomicInteger7 = this.f100820a.f100812e;
                    if (atomicInteger7 == null) {
                        C52711k.m112234a();
                    }
                    int i3 = atomicInteger7.get();
                    List<String> list2 = this.f100820a.f100811d;
                    if (list2 == null) {
                        C52711k.m112234a();
                    }
                    if (i3 == list2.size()) {
                        PoiUploadImagePreviewActivity poiUploadImagePreviewActivity = this.f100820a;
                        if (poiUploadImagePreviewActivity.f100810c != null) {
                            poiUploadImagePreviewActivity.f100814r = new ArrayList<>();
                            SparseArray<AvatarUri> sparseArray5 = poiUploadImagePreviewActivity.f100810c;
                            if (sparseArray5 == null) {
                                C52711k.m112234a();
                            }
                            int size = sparseArray5.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                SparseArray<AvatarUri> sparseArray6 = poiUploadImagePreviewActivity.f100810c;
                                if (sparseArray6 == null) {
                                    C52711k.m112234a();
                                }
                                AvatarUri avatarUri2 = (AvatarUri) sparseArray6.valueAt(i4);
                                C52711k.m112236a((Object) avatarUri2, "avatarUri");
                                if (!TextUtils.isEmpty(avatarUri2.uri)) {
                                    ArrayList<String> arrayList = poiUploadImagePreviewActivity.f100814r;
                                    if (arrayList == null) {
                                        C52711k.m112234a();
                                    }
                                    arrayList.add(avatarUri2.uri);
                                }
                            }
                            poiUploadImagePreviewActivity.f100815s = new C39426d();
                            C39426d dVar = poiUploadImagePreviewActivity.f100815s;
                            if (dVar == null) {
                                C52711k.m112234a();
                            }
                            dVar.mo54800a(poiUploadImagePreviewActivity);
                            C39426d dVar2 = poiUploadImagePreviewActivity.f100815s;
                            if (dVar2 == null) {
                                C52711k.m112234a();
                            }
                            dVar2.mo54799a(new C39424b());
                            if (poiUploadImagePreviewActivity.f100808a) {
                                String string = poiUploadImagePreviewActivity.getString(R.string.b70);
                                C52711k.m112236a((Object) string, "getString(R.string.friends_nickname)");
                                IAccountUserService g = C20854a.m53167g();
                                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                                User curUser = g.getCurUser();
                                C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
                                str = C2240a.m6772a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                                C52711k.m112236a((Object) str, "java.lang.String.format(format, *args)");
                            } else {
                                str = "";
                            }
                            ArrayList<String> arrayList2 = poiUploadImagePreviewActivity.f100814r;
                            if (arrayList2 == null) {
                                C52711k.m112234a();
                            }
                            String a = C52575l.m112120a(arrayList2, ",", null, null, 0, null, null, 62, null);
                            C39426d dVar3 = poiUploadImagePreviewActivity.f100815s;
                            if (dVar3 == null) {
                                C52711k.m112234a();
                            }
                            dVar3.mo44934a_(poiUploadImagePreviewActivity.f100809b, a, str);
                        }
                        return;
                    }
                    this.f100820a.mo80390c();
                }
            }
        }
    }

    /* renamed from: b */
    private View m87654b(int i) {
        if (this.f100818w == null) {
            this.f100818w = new HashMap();
        }
        View view = (View) this.f100818w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100818w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bmf;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo80390c() {
        ((DmtStatusView) m87654b(R.id.csv)).mo19209d();
        Toast toast = new Toast(C11010c.m22280a());
        toast.setView(LayoutInflater.from(this).inflate(R.layout.bo6, null));
        toast.setDuration(0);
        toast.setGravity(17, 0, 0);
        C39425c.m87670a(toast);
    }

    /* renamed from: d */
    private final void m87655d() {
        if (!C9376b.m18558a((Collection<T>) this.f100811d)) {
            ((DmtStatusView) m87654b(R.id.csv)).mo19212f();
            this.f100812e = new AtomicInteger(0);
            this.f100813f = new AtomicInteger(0);
            this.f100810c = new SparseArray<>();
            List<String> list = this.f100811d;
            if (list == null) {
                C52711k.m112234a();
            }
            m87653a(list.size());
            List<String> list2 = this.f100811d;
            if (list2 == null) {
                C52711k.m112234a();
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<String> list3 = this.f100811d;
                if (list3 == null) {
                    C52711k.m112234a();
                }
                String str = (String) list3.get(i);
                if (C9431p.m18664a(str)) {
                    SparseArray<AvatarUri> sparseArray = this.f100810c;
                    if (sparseArray == null) {
                        C52711k.m112234a();
                    }
                    sparseArray.put(i, new AvatarUri());
                    AtomicInteger atomicInteger = this.f100813f;
                    if (atomicInteger == null) {
                        C52711k.m112234a();
                    }
                    atomicInteger.incrementAndGet();
                } else if (!new File(str).exists()) {
                    SparseArray<AvatarUri> sparseArray2 = this.f100810c;
                    if (sparseArray2 == null) {
                        C52711k.m112234a();
                    }
                    sparseArray2.put(i, new AvatarUri());
                    AtomicInteger atomicInteger2 = this.f100813f;
                    if (atomicInteger2 == null) {
                        C52711k.m112234a();
                    }
                    atomicInteger2.incrementAndGet();
                } else {
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(C11010c.m22282b().f29547a);
                    sb.append("/aweme/v1/upload/image/");
                    String sb2 = sb.toString();
                    IAccountUserService g = C20854a.m53167g();
                    List<C9382a> list4 = this.f100817v;
                    if (list4 == null) {
                        C52711k.m112234a();
                    }
                    g.uploadAvatar(new C9381g((C9382a) list4.get(i)), sb2, 4194304, str, null);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo46325b() {
        super.mo46325b();
        ((TextTitleBar) m87654b(R.id.d10)).setTitle((int) R.string.cth);
        ((TextTitleBar) m87654b(R.id.d10)).setOnTitleBarClickListener(new C39414b(this));
        Context context = this;
        ((DmtStatusView) m87654b(R.id.csv)).setBuilder(C10719a.m21676a(context).mo19223a());
        this.f100811d = getIntent().getStringArrayListExtra("upload_img_uri_list");
        String stringExtra = getIntent().getStringExtra("poi_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f100809b = stringExtra;
        List<String> list = this.f100811d;
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) m87654b(R.id.c38);
            C52711k.m112236a((Object) recyclerView, "poi_upload_img_recycler");
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f100816u = new C39427e(list);
            RecyclerView recyclerView2 = (RecyclerView) m87654b(R.id.c38);
            C52711k.m112236a((Object) recyclerView2, "poi_upload_img_recycler");
            recyclerView2.setAdapter(this.f100816u);
        }
        ((ImageView) m87654b(R.id.aq9)).setImageResource(R.drawable.dkc);
        OnClickListener onClickListener = this;
        ((LinearLayout) m87654b(R.id.eq)).setOnClickListener(onClickListener);
        ((LinearLayout) m87654b(R.id.c6s)).setOnClickListener(onClickListener);
        ((DmtTextView) m87654b(R.id.cur)).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo80389a(Exception exc) {
        mo80390c();
    }

    /* renamed from: a */
    private final void m87653a(int i) {
        this.f100817v = new ArrayList();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C9382a cVar = new C39415c(this, i2);
                List<C9382a> list = this.f100817v;
                if (list == null) {
                    C52711k.m112234a();
                }
                list.add(cVar);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80388a(C39115au auVar) {
        C52711k.m112240b(auVar, "response");
        if (auVar.f99783a) {
            ((DmtStatusView) m87654b(R.id.csv)).mo19209d();
            C10691a.m21542b(C11010c.m22280a(), (int) R.string.du8).mo19066a();
            setResult(-1);
            finish();
            return;
        }
        mo80390c();
    }

    public final void onClick(View view) {
        int i;
        ClickInstrumentation.onClick(view);
        if (C52711k.m112239a((Object) view, (Object) (LinearLayout) m87654b(R.id.eq))) {
            if (this.f100808a) {
                this.f100808a = false;
                C39427e eVar = this.f100816u;
                if (eVar != null) {
                    eVar.f100845a = this.f100808a;
                }
                ((ImageView) m87654b(R.id.aq9)).setImageResource(R.drawable.dkd);
            } else {
                this.f100808a = true;
                C39427e eVar2 = this.f100816u;
                if (eVar2 != null) {
                    eVar2.f100845a = this.f100808a;
                }
                ((ImageView) m87654b(R.id.aq9)).setImageResource(R.drawable.dkc);
            }
            C39427e eVar3 = this.f100816u;
            if (eVar3 != null) {
                C39427e eVar4 = this.f100816u;
                if (eVar4 != null) {
                    i = eVar4.getItemCount();
                } else {
                    i = 0;
                }
                eVar3.notifyItemRangeChanged(0, i, Boolean.valueOf(this.f100808a));
            }
        } else if (C52711k.m112239a((Object) view, (Object) (LinearLayout) m87654b(R.id.c6s))) {
            StringBuilder sb = new StringBuilder("https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/protocol/poi_pic.html?ts=");
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("use_webview_title", true);
            C39460p.m87761a((Context) this, sb2, bundle);
        } else if (C52711k.m112239a((Object) view, (Object) (DmtTextView) m87654b(R.id.cur))) {
            Context context = this;
            if (!C39425c.m87671a(context)) {
                C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
            } else if (this.f100811d != null) {
                m87655d();
            }
        }
    }
}
