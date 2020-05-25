package com.bytedance.android.livesdk.widget.p424b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p279af.C4560ab;
import com.bytedance.android.livesdk.p407r.C8122a;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.android.livesdk.widget.p424b.C8511d.C8512a;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.b.e */
public final class C8513e extends C1322a<C8515b> {

    /* renamed from: d */
    public static final float f23355d = 3.0f;

    /* renamed from: e */
    public static final float f23356e = 0.53f;

    /* renamed from: f */
    public static final float f23357f = 0.47f;

    /* renamed from: g */
    public static final float f23358g = 0.4f;

    /* renamed from: h */
    public static final float f23359h = 0.65f;

    /* renamed from: i */
    public static int f23360i;

    /* renamed from: j */
    public static final C8514a f23361j = new C8514a(null);

    /* renamed from: a */
    LayoutInflater f23362a;

    /* renamed from: b */
    List<? extends C8511d> f23363b;

    /* renamed from: c */
    public Room f23364c;

    /* renamed from: com.bytedance.android.livesdk.widget.b.e$a */
    public static final class C8514a {
        private C8514a() {
        }

        public /* synthetic */ C8514a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.e$b */
    public static abstract class C8515b extends C1352v {
        /* renamed from: a */
        public abstract void mo14952a(C8511d dVar, int i);

        public C8515b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.e$c */
    interface C8516c {
        /* renamed from: a */
        Room mo14953a();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.e$d */
    static final class C8517d extends C8515b {

        /* renamed from: c */
        public static float f23365c;

        /* renamed from: d */
        static Paint f23366d = new Paint();

        /* renamed from: e */
        static Paint f23367e = new Paint();

        /* renamed from: f */
        public static final C8518a f23368f = new C8518a(null);

        /* renamed from: a */
        public TextView f23369a;

        /* renamed from: b */
        public C8516c f23370b;

        /* renamed from: g */
        private Spannable f23371g;

        /* renamed from: com.bytedance.android.livesdk.widget.b.e$d$a */
        public static final class C8518a {
            private C8518a() {
            }

            public /* synthetic */ C8518a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.widget.b.e$d$b */
        static final class C8519b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C8517d f23372a;

            C8519b(C8517d dVar) {
                this.f23372a = dVar;
            }

            public final void run() {
                if (this.f23372a.f23369a != null) {
                    C8513e.f23360i = this.f23372a.f23369a.getHeight();
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.widget.b.e$d$c */
        public static final class C8520c implements C8797c {

            /* renamed from: a */
            final /* synthetic */ C8517d f23373a;

            /* renamed from: b */
            final /* synthetic */ SparseArray f23374b;

            /* renamed from: c */
            final /* synthetic */ int f23375c;

            /* renamed from: d */
            final /* synthetic */ List f23376d;

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
                if (r4 == null) goto L_0x002b;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo9146a(com.bytedance.android.livesdkapi.host.C8794c.C8795a r4) {
                /*
                    r3 = this;
                    android.util.SparseArray r0 = r3.f23374b
                    int r1 = r3.f23375c
                    r2 = 0
                    r0.put(r1, r2)
                    com.bytedance.android.livesdk.widget.b.e$d r0 = r3.f23373a
                    android.util.SparseArray r1 = r3.f23374b
                    java.util.List r2 = r3.f23376d
                    r0.mo14954a(r1, r2)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    java.util.Map r0 = (java.util.Map) r0
                    java.lang.String r1 = "event_name"
                    java.lang.String r2 = "message badges load error"
                    r0.put(r1, r2)
                    java.lang.String r1 = "error_msg"
                    java.lang.Throwable r4 = r4.f24035a
                    if (r4 == 0) goto L_0x002b
                    java.lang.String r4 = r4.getMessage()
                    if (r4 != 0) goto L_0x002d
                L_0x002b:
                    java.lang.String r4 = ""
                L_0x002d:
                    r0.put(r1, r4)
                    com.bytedance.android.livesdk.o.d r4 = com.bytedance.android.livesdk.p399o.C8064d.m16005b()
                    java.lang.String r1 = "ttlive_msg"
                    r4.mo9199b(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.p424b.C8513e.C8517d.C8520c.mo9146a(com.bytedance.android.livesdkapi.host.c$a):void");
            }

            /* renamed from: a */
            public final void mo9145a(Bitmap bitmap) {
                if (bitmap == null) {
                    this.f23374b.put(this.f23375c, null);
                    this.f23373a.mo14954a(this.f23374b, this.f23376d);
                    return;
                }
                TextImageModel textImageModel = (TextImageModel) this.f23376d.get(this.f23375c);
                Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                float width = ((float) bitmap.getWidth()) * C8517d.f23365c;
                float height = ((float) bitmap.getHeight()) * C8517d.f23365c;
                if (!TextUtils.isEmpty(textImageModel.f23707a) && textImageModel.f23709c == 1) {
                    String str = textImageModel.f23707a;
                    C52711k.m112236a((Object) str, "textImageModel.content");
                    C52711k.m112236a((Object) copy, "bmpCopy");
                    float width2 = (float) bitmap.getWidth();
                    float height2 = (float) bitmap.getHeight();
                    C8517d.f23366d.setTextSize(C8513e.f23356e * height2);
                    C8517d.f23367e.setColor(-1);
                    float measureText = C8517d.f23366d.measureText(str);
                    float f = width2 - height2;
                    if (measureText > f) {
                        measureText = f;
                    }
                    Canvas canvas = new Canvas(copy);
                    FontMetrics fontMetrics = C8517d.f23366d.getFontMetrics();
                    canvas.drawText(str, height2 + ((f - measureText) / 2.0f), ((height2 - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), C8517d.f23366d);
                } else if (!TextUtils.isEmpty(textImageModel.f23707a) && textImageModel.f23709c == 3) {
                    C8122a.m16194a(this.f23373a.f23369a.getContext(), -1, copy, textImageModel.f23707a);
                }
                if (textImageModel.f23709c == 4) {
                    String str2 = textImageModel.f23707a;
                    C52711k.m112236a((Object) str2, "textImageModel.content");
                    int i = textImageModel.f23708b;
                    C52711k.m112236a((Object) copy, "bmpCopy");
                    float width3 = (float) bitmap.getWidth();
                    float height3 = (float) bitmap.getHeight();
                    C8517d.f23367e.setTextSize(C8513e.f23357f * height3);
                    C8517d.f23367e.setColor(i);
                    float measureText2 = C8517d.f23367e.measureText(str2);
                    float f2 = width3 - height3;
                    if (measureText2 > f2) {
                        measureText2 = f2;
                    }
                    Canvas canvas2 = new Canvas(copy);
                    FontMetrics fontMetrics2 = C8517d.f23367e.getFontMetrics();
                    canvas2.drawText(str2, height3 + ((f2 - measureText2) * C8513e.f23358g), ((height3 - (fontMetrics2.descent - fontMetrics2.ascent)) * C8513e.f23359h) + Math.abs(fontMetrics2.ascent), C8517d.f23367e);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f23373a.f23369a.getResources(), copy);
                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                this.f23374b.put(this.f23375c, new C8534c(bitmapDrawable));
                this.f23373a.mo14954a(this.f23374b, this.f23376d);
            }

            C8520c(C8517d dVar, SparseArray sparseArray, int i, List list) {
                this.f23373a = dVar;
                this.f23374b = sparseArray;
                this.f23375c = i;
                this.f23376d = list;
            }
        }

        /* renamed from: a */
        private final void m16784a(List<? extends TextImageModel> list) {
            if (!list.isEmpty()) {
                SparseArray sparseArray = new SparseArray();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((TextImageModel) list.get(i)).f23709c == 2) {
                        Bitmap a = C4560ab.m10952a(this.f23369a.getContext(), ((TextImageModel) list.get(i)).f23710d);
                        if (a != null && !a.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f23369a.getResources(), a);
                            bitmapDrawable.setBounds(0, 0, a.getWidth(), a.getHeight());
                            sparseArray.put(i, new C8534c(bitmapDrawable));
                            mo14954a(sparseArray, list);
                        }
                    } else {
                        TTLiveSDKContext.getHostService().mo10319l().mo15490a((ImageModel) list.get(i), (C8797c) new C8520c(this, sparseArray, i, list));
                    }
                }
            }
        }

        public C8517d(View view, C8516c cVar) {
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(cVar, "mRoomGetter");
            super(view);
            this.f23370b = cVar;
            View findViewById = view.findViewById(R.id.text);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.text)");
            this.f23369a = (TextView) findViewById;
            if (f23365c <= 0.0f) {
                Resources resources = view.getResources();
                C52711k.m112236a((Object) resources, "itemView.resources");
                f23365c = resources.getDisplayMetrics().density / C8513e.f23355d;
            }
            f23366d.setColor(-1);
            f23366d.setStyle(Style.FILL_AND_STROKE);
            f23366d.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            f23367e.setStyle(Style.FILL_AND_STROKE);
            f23367e.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        }

        /* renamed from: a */
        public final void mo14954a(SparseArray<ImageSpan> sparseArray, List<? extends TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                spannableStringBuilder.append(this.f23371g);
                this.f23369a.setText(spannableStringBuilder);
            }
        }

        /* renamed from: a */
        public final void mo14952a(C8511d dVar, int i) {
            Spannable spannable;
            FansClubData fansClubData;
            if (dVar != null) {
                spannable = dVar.mo14947b();
            } else {
                spannable = null;
            }
            this.f23371g = spannable;
            this.f23369a.setText(this.f23371g);
            this.f23369a.setBackgroundResource(R.drawable.bla);
            this.f23369a.setTextColor(C3922z.m9909b((int) R.color.b3y));
            if (dVar != null && dVar.mo14946a() == C8512a.m16780a()) {
                ArrayList arrayList = new ArrayList();
                Room a = this.f23370b.mo14953a();
                if (a != null) {
                    User owner = a.getOwner();
                    if (owner != null) {
                        FansClubMember fansClub = owner.getFansClub();
                        if (fansClub != null) {
                            if (FansClubData.isValid(fansClub.getData())) {
                                fansClubData = fansClub.getData();
                            } else {
                                fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(1));
                            }
                            if (FansClubData.isValid(fansClubData) && fansClubData != null) {
                                ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(2));
                                if (imageModel != null) {
                                    TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                                    textImageModel.f23707a = fansClubData.clubName;
                                    arrayList.add(textImageModel);
                                }
                            }
                        }
                    }
                }
                m16784a(arrayList);
            }
            this.f23369a.post(new C8519b(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.e$e */
    public static final class C8521e implements C8516c {

        /* renamed from: a */
        final /* synthetic */ C8513e f23377a;

        /* renamed from: a */
        public final Room mo14953a() {
            return this.f23377a.f23364c;
        }

        C8521e(C8513e eVar) {
            this.f23377a = eVar;
        }
    }

    public final int getItemCount() {
        List<? extends C8511d> list = this.f23363b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo14951a(Room room) {
        C52711k.m112240b(room, "room");
        this.f23364c = room;
    }

    public final int getItemViewType(int i) {
        List<? extends C8511d> list = this.f23363b;
        if (list != null) {
            C8511d dVar = (C8511d) list.get(i);
            if (dVar != null) {
                return dVar.mo14946a();
            }
        }
        return 0;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C8511d dVar;
        C8515b bVar = (C8515b) vVar;
        C52711k.m112240b(bVar, "holder");
        List<? extends C8511d> list = this.f23363b;
        if (list != null) {
            dVar = (C8511d) list.get(i);
        } else {
            dVar = null;
        }
        bVar.mo14952a(dVar, i);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        LayoutInflater layoutInflater = this.f23362a;
        if (layoutInflater == null) {
            C52711k.m112234a();
        }
        View inflate = layoutInflater.inflate(R.layout.alf, viewGroup, false);
        C52711k.m112236a((Object) inflate, "mLayoutInflater!!.inflat…essage_v2, parent, false)");
        return new C8517d(inflate, new C8521e(this));
    }
}
