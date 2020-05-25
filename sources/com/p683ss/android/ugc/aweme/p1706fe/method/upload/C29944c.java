package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import android.content.Context;
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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c */
public final class C29944c extends C1322a<C1352v> {

    /* renamed from: j */
    public static final C29945a f78145j = new C29945a(null);

    /* renamed from: a */
    final ArrayList<MediaModel> f78146a = new ArrayList<>();

    /* renamed from: b */
    List<Integer> f78147b;

    /* renamed from: c */
    public List<Integer> f78148c;

    /* renamed from: d */
    public List<String> f78149d;

    /* renamed from: e */
    public boolean f78150e;

    /* renamed from: f */
    public C52682m<? super View, ? super String, C52860x> f78151f;

    /* renamed from: g */
    public C52671b<? super List<String>, C52860x> f78152g;

    /* renamed from: h */
    final Context f78153h;

    /* renamed from: i */
    public final int f78154i;

    /* renamed from: k */
    private final int f78155k;

    /* renamed from: l */
    private final Boolean f78156l;

    /* renamed from: m */
    private final double f78157m = 1.0d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$a */
    public static final class C29945a {
        private C29945a() {
        }

        public /* synthetic */ C29945a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$b */
    public static final class C29946b extends C1352v {

        /* renamed from: a */
        public RemoteImageView f78158a;

        /* renamed from: b */
        public TextView f78159b;

        /* renamed from: c */
        public FrameLayout f78160c;

        /* renamed from: d */
        public View f78161d;

        /* renamed from: e */
        public String f78162e;

        /* renamed from: a */
        public final void mo60130a() {
            TextView textView = this.f78159b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f78159b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.de2);
            }
        }

        public C29946b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }

        /* renamed from: a */
        public final void mo60131a(int i) {
            TextView textView = this.f78159b;
            if (textView != null) {
                textView.setText(String.valueOf(i + 1));
            }
            TextView textView2 = this.f78159b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.de3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$c */
    static final class C29947c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f78163a;

        /* renamed from: b */
        final /* synthetic */ C29944c f78164b;

        /* renamed from: c */
        final /* synthetic */ int f78165c;

        C29947c(View view, C29944c cVar, int i) {
            this.f78163a = view;
            this.f78164b = cVar;
            this.f78165c = i;
        }

        public final void run() {
            this.f78163a.setVisibility(4);
            this.f78163a.setAlpha(1.0f);
            this.f78164b.notifyItemChanged(this.f78165c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$d */
    static final class C29948d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C29944c f78166a;

        /* renamed from: b */
        final /* synthetic */ int f78167b;

        /* renamed from: c */
        final /* synthetic */ int f78168c;

        C29948d(C29944c cVar, int i, int i2) {
            this.f78166a = cVar;
            this.f78167b = i;
            this.f78168c = i2;
        }

        public final void run() {
            if (this.f78167b == this.f78166a.f78154i) {
                this.f78166a.notifyDataSetChanged();
            } else {
                this.f78166a.notifyItemChanged(this.f78168c);
            }
            C52671b<? super List<String>, C52860x> bVar = this.f78166a.f78152g;
            if (bVar != null) {
                bVar.invoke(this.f78166a.f78149d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$e */
    static final class C29949e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29944c f78169a;

        /* renamed from: b */
        final /* synthetic */ int f78170b;

        /* renamed from: c */
        final /* synthetic */ String f78171c;

        C29949e(C29944c cVar, int i, String str) {
            this.f78169a = cVar;
            this.f78170b = i;
            this.f78171c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r3)
                com.ss.android.ugc.aweme.fe.method.upload.c r0 = r2.f78169a
                boolean r0 = r0.f78150e
                if (r0 == 0) goto L_0x000a
                return
            L_0x000a:
                int r0 = r2.f78170b
                if (r0 >= 0) goto L_0x0023
                com.ss.android.ugc.aweme.fe.method.upload.c r0 = r2.f78169a
                java.util.List<java.lang.Integer> r0 = r0.f78148c
                if (r0 != 0) goto L_0x0017
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0017:
                int r0 = r0.size()
                com.ss.android.ugc.aweme.fe.method.upload.c r1 = r2.f78169a
                int r1 = r1.f78154i
                if (r0 < r1) goto L_0x0023
                r0 = 1
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                if (r0 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.fe.method.upload.c r0 = r2.f78169a
                d.f.a.m<? super android.view.View, ? super java.lang.String, d.x> r0 = r0.f78151f
                if (r0 == 0) goto L_0x0037
                java.lang.String r1 = "v"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)
                java.lang.String r1 = r2.f78171c
                r0.invoke(r3, r1)
                return
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29944c.C29949e.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.c$f */
    static final class C29950f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29944c f78172a;

        /* renamed from: b */
        final /* synthetic */ C29946b f78173b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f78174c;

        C29950f(C29944c cVar, C29946b bVar, MediaModel mediaModel) {
            this.f78172a = cVar;
            this.f78173b = bVar;
            this.f78174c = mediaModel;
        }

        public final void onClick(View view) {
            int i;
            boolean z;
            ClickInstrumentation.onClick(view);
            if (!this.f78172a.f78150e) {
                C29944c cVar = this.f78172a;
                C29946b bVar = this.f78173b;
                int adapterPosition = this.f78173b.getAdapterPosition();
                MediaModel mediaModel = this.f78174c;
                if (!(adapterPosition < 0 || cVar.f78148c == null || cVar.f78147b == null)) {
                    List<Integer> list = cVar.f78147b;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    if (adapterPosition < i) {
                        List<Integer> list2 = cVar.f78148c;
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        int indexOf = list2.indexOf(Integer.valueOf(adapterPosition));
                        if (indexOf >= 0) {
                            List<Integer> list3 = cVar.f78147b;
                            if (list3 == null) {
                                C52711k.m112234a();
                            }
                            list3.set(adapterPosition, Integer.valueOf(-1));
                            bVar.mo60130a();
                            View view2 = bVar.f78161d;
                            if (view2 != null) {
                                view2.animate().alpha(0.0f).setDuration(300).withEndAction(new C29947c(view2, cVar, adapterPosition)).start();
                            }
                            RemoteImageView remoteImageView = bVar.f78158a;
                            if (remoteImageView != null) {
                                remoteImageView.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                            }
                            List<String> list4 = cVar.f78149d;
                            if (list4 != null) {
                                list4.remove(indexOf);
                            }
                            List<Integer> list5 = cVar.f78148c;
                            if (list5 != null) {
                                list5.remove(Integer.valueOf(adapterPosition));
                            }
                            List<Integer> list6 = cVar.f78148c;
                            if (list6 == null) {
                                C52711k.m112234a();
                            }
                            int size = list6.size();
                            while (indexOf < size) {
                                List<Integer> list7 = cVar.f78148c;
                                if (list7 == null) {
                                    C52711k.m112234a();
                                }
                                int intValue = ((Number) list7.get(indexOf)).intValue();
                                if (intValue >= 0) {
                                    List<Integer> list8 = cVar.f78147b;
                                    if (list8 == null) {
                                        C52711k.m112234a();
                                    }
                                    if (intValue < list8.size()) {
                                        List<Integer> list9 = cVar.f78147b;
                                        if (list9 == null) {
                                            C52711k.m112234a();
                                        }
                                        list9.set(intValue, Integer.valueOf(indexOf));
                                    }
                                }
                                if (size != cVar.f78154i - 1) {
                                    cVar.notifyItemChanged(intValue);
                                }
                                indexOf++;
                            }
                            if (size == cVar.f78154i - 1) {
                                cVar.notifyDataSetChanged();
                            }
                            C52671b<? super List<String>, C52860x> bVar2 = cVar.f78152g;
                            if (bVar2 != null) {
                                bVar2.invoke(cVar.f78149d);
                            }
                        } else {
                            List<Integer> list10 = cVar.f78148c;
                            if (list10 == null) {
                                C52711k.m112234a();
                            }
                            if (list10.size() >= cVar.f78154i) {
                                C10691a.m21545b(cVar.f78153h, cVar.f78153h.getString(R.string.a31, new Object[]{Integer.valueOf(cVar.f78154i)})).mo19066a();
                                return;
                            }
                            if (((float) mediaModel.f95390i) > ((float) mediaModel.f95391j) * 2.2f || ((float) mediaModel.f95391j) > ((float) mediaModel.f95390i) * 2.2f) {
                                C10691a.m21548c((Context) C32463a.m75161a(), (int) R.string.dhr).mo19066a();
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                if (cVar.f78149d == null) {
                                    cVar.f78149d = new ArrayList();
                                }
                                List<String> list11 = cVar.f78149d;
                                if (list11 != null) {
                                    String str = mediaModel.f95383b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    list11.add(str);
                                }
                                List<Integer> list12 = cVar.f78148c;
                                if (list12 != null) {
                                    list12.add(Integer.valueOf(adapterPosition));
                                }
                                List<Integer> list13 = cVar.f78148c;
                                if (list13 == null) {
                                    C52711k.m112234a();
                                }
                                bVar.mo60131a(list13.size() - 1);
                                List<Integer> list14 = cVar.f78148c;
                                if (list14 == null) {
                                    C52711k.m112234a();
                                }
                                int size2 = list14.size();
                                List<Integer> list15 = cVar.f78147b;
                                if (list15 == null) {
                                    C52711k.m112234a();
                                }
                                list15.set(adapterPosition, Integer.valueOf(size2 - 1));
                                RemoteImageView remoteImageView2 = bVar.f78158a;
                                if (remoteImageView2 != null) {
                                    remoteImageView2.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new C29948d(cVar, size2, adapterPosition)).start();
                                }
                                View view3 = bVar.f78161d;
                                if (view3 != null) {
                                    view3.setAlpha(0.0f);
                                    view3.setVisibility(0);
                                    view3.animate().alpha(1.0f).setDuration(300).start();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemCount() {
        return this.f78146a.size();
    }

    /* renamed from: a */
    private final void m70084a(View view) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams == null || layoutParams.width == this.f78155k)) {
                int i = layoutParams.height;
                double d = (double) this.f78155k;
                double d2 = this.f78157m;
                Double.isNaN(d);
                if (i != ((int) (d * d2))) {
                    layoutParams.width = this.f78155k;
                    double d3 = (double) this.f78155k;
                    double d4 = this.f78157m;
                    Double.isNaN(d3);
                    layoutParams.height = (int) (d3 * d4);
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f78153h).inflate(R.layout.b84, viewGroup, false);
        C52711k.m112236a((Object) inflate, "convertView");
        C29946b bVar = new C29946b(inflate);
        bVar.f78158a = (RemoteImageView) inflate.findViewById(R.id.bky);
        bVar.f78159b = (TextView) inflate.findViewById(R.id.ari);
        bVar.f78160c = (FrameLayout) inflate.findViewById(R.id.ah5);
        bVar.f78161d = inflate.findViewById(R.id.cme);
        return bVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        float f;
        C52711k.m112240b(vVar, "holder");
        C29946b bVar = (C29946b) vVar;
        m70084a(bVar.f78158a);
        m70084a(bVar.f78161d);
        Object obj = this.f78146a.get(i);
        C52711k.m112236a(obj, "mMediaTotal[position]");
        MediaModel mediaModel = (MediaModel) obj;
        List<Integer> list = this.f78147b;
        if (list == null) {
            C52711k.m112234a();
        }
        int intValue = ((Number) list.get(i)).intValue();
        int i2 = 0;
        float f2 = 1.0f;
        if (intValue >= 0) {
            bVar.mo60131a(intValue);
            View view = bVar.f78161d;
            if (view != null) {
                view.setVisibility(0);
            }
            f = 1.0f;
            f2 = 1.1f;
        } else {
            bVar.mo60130a();
            View view2 = bVar.f78161d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            List<Integer> list2 = this.f78148c;
            if (list2 != null) {
                i2 = list2.size();
            }
            if (i2 >= this.f78154i) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        RemoteImageView remoteImageView = bVar.f78158a;
        if (remoteImageView != null) {
            if (remoteImageView.getAlpha() != f) {
                remoteImageView.setAlpha(f);
            }
            if (remoteImageView.getScaleX() != f2) {
                remoteImageView.setScaleX(f2);
                remoteImageView.setScaleY(f2);
            }
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(mediaModel.f95383b);
        String sb2 = sb.toString();
        if (!TextUtils.equals(bVar.f78162e, sb2)) {
            bVar.f78162e = sb2;
            C23515d.m57686b(bVar.f78158a, bVar.f78162e, this.f78155k, this.f78155k);
        }
        bVar.itemView.setOnClickListener(new C29949e(this, intValue, sb2));
        FrameLayout frameLayout = bVar.f78160c;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new C29950f(this, bVar, mediaModel));
        }
    }

    public C29944c(Context context, int i, int i2, Boolean bool, double d, float f, int i3) {
        C52711k.m112240b(context, "mContext");
        this.f78153h = context;
        this.f78154i = i2;
        this.f78156l = bool;
        this.f78153h.getResources().getDimensionPixelOffset(R.dimen.ja);
        this.f78155k = ((C9432q.m18670a(this.f78153h) - ((i - 1) * ((int) C9432q.m18687b(this.f78153h, 1.5f)))) + 0) / i;
    }
}
