package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a */
public final class C39416a extends C1322a<C39417a> {

    /* renamed from: f */
    public static final C39418b f100822f = new C39418b(null);

    /* renamed from: a */
    final List<String> f100823a;

    /* renamed from: b */
    List<Integer> f100824b;

    /* renamed from: c */
    public List<Integer> f100825c;

    /* renamed from: d */
    public final Context f100826d;

    /* renamed from: e */
    public final C39419c f100827e;

    /* renamed from: g */
    private int f100828g;

    /* renamed from: h */
    private final double f100829h = 1.0d;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$a */
    public static final class C39417a extends C1352v {

        /* renamed from: a */
        public String f100830a;

        /* renamed from: b */
        public final RemoteImageView f100831b;

        /* renamed from: c */
        public final FrameLayout f100832c;

        /* renamed from: d */
        public final View f100833d;

        /* renamed from: e */
        private final TextView f100834e;

        /* renamed from: a */
        public final void mo80393a() {
            this.f100834e.setText("");
            this.f100834e.setBackgroundResource(R.drawable.de2);
        }

        /* renamed from: a */
        public final void mo80394a(int i) {
            this.f100834e.setText(String.valueOf(i + 1));
            this.f100834e.setBackgroundResource(R.drawable.de3);
        }

        public C39417a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.bky);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.media_view)");
            this.f100831b = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ari);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.image_select_indicator)");
            this.f100834e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ah5);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.…l_image_select_indicator)");
            this.f100832c = (FrameLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.cme);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.shadow_view)");
            this.f100833d = findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$b */
    public static final class C39418b {
        private C39418b() {
        }

        public /* synthetic */ C39418b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$c */
    public interface C39419c {
        /* renamed from: a */
        void mo80383a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$d */
    static final class C39420d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39416a f100835a;

        /* renamed from: b */
        final /* synthetic */ String f100836b;

        C39420d(C39416a aVar, String str) {
            this.f100835a = aVar;
            this.f100836b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f100835a.f100826d;
            if (context != null) {
                float a = (((float) C9432q.m18670a(this.f100835a.f100826d)) * 1.0f) / ((float) C9432q.m18688b(this.f100835a.f100826d));
                String[] strArr = {this.f100836b};
                SmartRoute buildRoute = SmartRouter.buildRoute((Context) (Activity) context, "aweme://user/header/preview");
                String str = "extra_zoom_info";
                if (view == null) {
                    C52711k.m112234a();
                }
                buildRoute.withParam(str, (Parcelable) ZoomAnimationUtils.m103150a(view)).withParam("uri", strArr).withParam("wh_ratio", a).withParam("enable_download_img", false).open();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$e */
    static final class C39421e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39416a f100837a;

        /* renamed from: b */
        final /* synthetic */ C39417a f100838b;

        C39421e(C39416a aVar, C39417a aVar2) {
            this.f100837a = aVar;
            this.f100838b = aVar2;
        }

        public final void onClick(View view) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            ClickInstrumentation.onClick(view);
            C39416a aVar = this.f100837a;
            C39417a aVar2 = this.f100838b;
            int adapterPosition = this.f100838b.getAdapterPosition();
            List<Integer> list = aVar.f100825c;
            Integer num8 = null;
            if (list != null) {
                num = Integer.valueOf(list.indexOf(Integer.valueOf(adapterPosition)));
            } else {
                num = null;
            }
            if (num == null) {
                C52711k.m112234a();
            }
            int intValue = num.intValue();
            if (intValue >= 0) {
                List<Integer> list2 = aVar.f100824b;
                if (list2 != null) {
                    list2.set(adapterPosition, Integer.valueOf(-1));
                }
                aVar2.mo80393a();
                aVar2.f100833d.animate().alpha(0.0f).setDuration(300).withEndAction(new C39422f(aVar, aVar2, adapterPosition)).start();
                aVar2.f100831b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                List<Integer> list3 = aVar.f100825c;
                if (list3 != null) {
                    list3.remove(Integer.valueOf(adapterPosition));
                }
                List<Integer> list4 = aVar.f100825c;
                if (list4 != null) {
                    num5 = Integer.valueOf(list4.size());
                } else {
                    num5 = null;
                }
                if (num5 == null) {
                    C52711k.m112234a();
                }
                int intValue2 = num5.intValue();
                while (intValue < intValue2) {
                    List<Integer> list5 = aVar.f100824b;
                    if (list5 != null) {
                        List<Integer> list6 = aVar.f100825c;
                        if (list6 != null) {
                            num7 = (Integer) list6.get(intValue);
                        } else {
                            num7 = null;
                        }
                        if (num7 == null) {
                            C52711k.m112234a();
                        }
                        list5.set(num7.intValue(), Integer.valueOf(intValue));
                    }
                    if (intValue2 != 4) {
                        List<Integer> list7 = aVar.f100825c;
                        if (list7 != null) {
                            num6 = (Integer) list7.get(intValue);
                        } else {
                            num6 = null;
                        }
                        if (num6 == null) {
                            C52711k.m112234a();
                        }
                        aVar.notifyItemChanged(num6.intValue(), Boolean.valueOf(false));
                    }
                    intValue++;
                }
                if (intValue2 == 4) {
                    aVar.notifyDataSetChanged();
                }
            } else {
                List<Integer> list8 = aVar.f100825c;
                if (list8 != null) {
                    num2 = Integer.valueOf(list8.size());
                } else {
                    num2 = null;
                }
                if (num2 == null) {
                    C52711k.m112234a();
                }
                if (num2.intValue() >= 5) {
                    Context context = aVar.f100826d;
                    String string = aVar.f100826d.getString(R.string.a31);
                    C52711k.m112236a((Object) string, "context.getString(R.stri…se_upload_photos_at_most)");
                    String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{Integer.valueOf(5)}, 1));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    C10691a.m21545b(context, a).mo19066a();
                } else {
                    List<Integer> list9 = aVar.f100825c;
                    if (list9 != null) {
                        list9.add(Integer.valueOf(adapterPosition));
                    }
                    List<Integer> list10 = aVar.f100825c;
                    if (list10 != null) {
                        num3 = Integer.valueOf(list10.size());
                    } else {
                        num3 = null;
                    }
                    if (num3 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.mo80394a(num3.intValue() - 1);
                    List<Integer> list11 = aVar.f100825c;
                    if (list11 != null) {
                        num4 = Integer.valueOf(list11.size());
                    } else {
                        num4 = null;
                    }
                    if (num4 == null) {
                        C52711k.m112234a();
                    }
                    int intValue3 = num4.intValue();
                    List<Integer> list12 = aVar.f100824b;
                    if (list12 != null) {
                        list12.set(adapterPosition, Integer.valueOf(intValue3 - 1));
                    }
                    aVar2.f100831b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new C39423g(aVar, intValue3, adapterPosition)).start();
                    aVar2.f100833d.setAlpha(0.0f);
                    aVar2.f100833d.setVisibility(0);
                    aVar2.f100833d.animate().alpha(1.0f).setDuration(300).start();
                }
            }
            C39419c cVar = this.f100837a.f100827e;
            if (cVar != null) {
                List<Integer> list13 = this.f100837a.f100825c;
                if (list13 != null) {
                    num8 = Integer.valueOf(list13.size());
                }
                if (num8 == null) {
                    C52711k.m112234a();
                }
                cVar.mo80383a(num8.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$f */
    static final class C39422f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39416a f100839a;

        /* renamed from: b */
        final /* synthetic */ C39417a f100840b;

        /* renamed from: c */
        final /* synthetic */ int f100841c;

        C39422f(C39416a aVar, C39417a aVar2, int i) {
            this.f100839a = aVar;
            this.f100840b = aVar2;
            this.f100841c = i;
        }

        public final void run() {
            this.f100840b.f100833d.setVisibility(4);
            this.f100840b.f100833d.setAlpha(1.0f);
            this.f100839a.notifyItemChanged(this.f100841c, Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.a$g */
    static final class C39423g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39416a f100842a;

        /* renamed from: b */
        final /* synthetic */ int f100843b;

        /* renamed from: c */
        final /* synthetic */ int f100844c;

        C39423g(C39416a aVar, int i, int i2) {
            this.f100842a = aVar;
            this.f100843b = i;
            this.f100844c = i2;
        }

        public final void run() {
            if (this.f100843b == 5) {
                this.f100842a.notifyDataSetChanged();
            } else {
                this.f100842a.notifyItemChanged(this.f100844c, Boolean.valueOf(false));
            }
        }
    }

    public final int getItemCount() {
        return this.f100823a.size();
    }

    /* renamed from: a */
    private final void m87664a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f100828g) {
            int i = layoutParams.height;
            double d = (double) this.f100828g;
            double d2 = this.f100829h;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f100828g;
                double d3 = (double) this.f100828g;
                double d4 = this.f100829h;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C39417a aVar, int i) {
        C52711k.m112240b(aVar, "holder");
        m87666a(aVar, i, true);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bmz, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C39417a(inflate);
    }

    /* renamed from: a */
    private final void m87663a(int i, C39417a aVar) {
        float f;
        Integer num;
        float f2 = 1.0f;
        if (i >= 0) {
            aVar.mo80394a(i);
            aVar.f100833d.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            aVar.mo80393a();
            aVar.f100833d.setVisibility(4);
            List<Integer> list = this.f100825c;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num == null) {
                C52711k.m112234a();
            }
            if (num.intValue() >= 5) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (aVar.f100831b.getAlpha() != f) {
            aVar.f100831b.setAlpha(f);
        }
        if (aVar.f100831b.getScaleX() != f2) {
            aVar.f100831b.setScaleX(f2);
            aVar.f100831b.setScaleY(f2);
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i, List list) {
        C39417a aVar = (C39417a) vVar;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(aVar, i);
            return;
        }
        Object obj = list.get(0);
        if (obj != null) {
            m87666a(aVar, i, ((Boolean) obj).booleanValue());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
    }

    /* renamed from: a */
    private final void m87666a(C39417a aVar, int i, boolean z) {
        Integer num;
        m87664a(aVar.f100831b);
        m87664a(aVar.f100833d);
        List<Integer> list = this.f100824b;
        if (list != null) {
            num = (Integer) list.get(i);
        } else {
            num = null;
        }
        if (num == null) {
            C52711k.m112234a();
        }
        m87663a(num.intValue(), aVar);
        StringBuilder sb = new StringBuilder("file://");
        sb.append((String) this.f100823a.get(i));
        String sb2 = sb.toString();
        if (!TextUtils.equals(aVar.f100830a, sb2) && z) {
            aVar.f100830a = sb2;
            C23515d.m57686b(aVar.f100831b, aVar.f100830a, this.f100828g, this.f100828g);
        }
        aVar.itemView.setOnClickListener(new C39420d(this, sb2));
        aVar.f100832c.setOnClickListener(new C39421e(this, aVar));
    }

    public C39416a(Context context, int i, double d, float f, int i2, C39419c cVar) {
        C52711k.m112240b(context, "context");
        this.f100826d = context;
        this.f100827e = cVar;
        this.f100823a = new ArrayList();
        this.f100826d.getResources().getDimensionPixelOffset(R.dimen.ja);
        this.f100828g = ((C9432q.m18670a(this.f100826d) - (((int) C9432q.m18687b(this.f100826d, 1.5f)) * 3)) + 0) / 4;
    }
}
