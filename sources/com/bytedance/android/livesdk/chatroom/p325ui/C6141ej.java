package com.bytedance.android.livesdk.chatroom.p325ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.p309e.C5081a;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b.C5086b;
import com.bytedance.android.livesdk.chatroom.p309e.C5089e;
import com.bytedance.android.livesdk.chatroom.p309e.C5089e.C50901;
import com.bytedance.android.livesdk.chatroom.p309e.C5097k;
import com.bytedance.android.livesdk.chatroom.p309e.C5099l;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p310f.C5235t;
import com.bytedance.android.livesdk.message.model.C8003o;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4560ab;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p407r.C8122a;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.android.livesdk.widget.NoMoreSpaceTextView;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.common.util.C18922i;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ej */
public final class C6141ej extends C1322a<C6144b> {

    /* renamed from: a */
    public LayoutInflater f16472a;

    /* renamed from: b */
    public List<C5084b> f16473b;

    /* renamed from: c */
    public Room f16474c;

    /* renamed from: d */
    private boolean f16475d = true;

    /* renamed from: e */
    private OnClickListener f16476e = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() instanceof C5081a) {
                ((C5081a) view.getTag()).mo10976a(view.getContext(), C6141ej.this.f16474c);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ej$a */
    static class C6143a extends C6144b {

        /* renamed from: a */
        private ImageView f16478a;

        /* renamed from: b */
        private ImageView f16479b;

        /* renamed from: c */
        private TextView f16480c;

        /* renamed from: d */
        private View f16481d;

        /* renamed from: e */
        private OnClickListener f16482e;

        C6143a(View view, OnClickListener onClickListener) {
            super(view);
            this.f16478a = (ImageView) view.findViewById(R.id.aqa);
            this.f16479b = (ImageView) view.findViewById(R.id.cci);
            this.f16480c = (TextView) view.findViewById(R.id.ze);
            this.f16481d = view.findViewById(R.id.bu6);
            this.f16482e = onClickListener;
        }

        /* renamed from: a */
        public final void mo12170a(C5084b<?> bVar, int i) {
            if (bVar instanceof C5081a) {
                C5081a aVar = (C5081a) bVar;
                if (aVar.mo10975a() != null) {
                    C5213c.m11816a(this.f16478a, aVar.mo10975a(), this.f16478a.getWidth(), this.f16478a.getHeight());
                } else if (aVar.mo10977b() > 0) {
                    this.f16478a.setImageResource(aVar.mo10977b());
                } else {
                    this.f16478a.setBackgroundResource(R.drawable.bxv);
                }
                if (aVar.mo10978c() != null) {
                    this.f16479b.setBackground(null);
                    C5213c.m11814a(this.f16479b, aVar.mo10978c());
                }
                if (!aVar.mo10979d()) {
                    this.f16479b.setVisibility(8);
                }
                if (!TextUtils.isEmpty(aVar.mo10989n())) {
                    this.f16480c.setText(aVar.mo10989n());
                } else {
                    this.f16480c.setText("");
                }
                if (aVar.mo10983h() != null) {
                    C5235t.m11853a(aVar.mo10983h(), this.itemView, C4206c.m10426a(C3922z.m9915e()), null);
                } else if (!TextUtils.isEmpty(aVar.mo10982g())) {
                    try {
                        ((GradientDrawable) this.f16481d.getBackground()).setColor(Color.parseColor(aVar.mo10982g()));
                    } catch (Exception unused) {
                    }
                }
                if (aVar.mo10979d()) {
                    this.itemView.setTag(aVar);
                    this.itemView.setOnClickListener(this.f16482e);
                    return;
                }
                this.itemView.setOnClickListener(null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ej$b */
    public static abstract class C6144b extends C1352v {
        /* renamed from: a */
        public abstract void mo12170a(C5084b<?> bVar, int i);

        C6144b(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ej$c */
    interface C6145c {
        /* renamed from: a */
        Room mo12171a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ej$d */
    static class C6146d extends C6144b {

        /* renamed from: d */
        public static float f16483d;

        /* renamed from: g */
        private static Paint f16484g;

        /* renamed from: h */
        private static Paint f16485h;

        /* renamed from: a */
        TextView f16486a;

        /* renamed from: b */
        View f16487b;

        /* renamed from: c */
        C6145c f16488c;

        /* renamed from: e */
        Spannable f16489e;

        /* renamed from: f */
        private final OnLongClickListener f16490f;

        /* renamed from: i */
        private Spannable f16491i;

        /* renamed from: a */
        public final void mo12170a(C5084b<?> bVar, int i) {
            this.f16486a.setMovementMethod(C6113do.m13282a());
            this.f16486a.setOnLongClickListener(this.f16490f);
            this.f16486a.setTag(R.id.d5d, bVar);
            this.f16489e = bVar.mo10989n();
            this.f16491i = null;
            if (C8607a.f23572a && C4206c.m10426a(C3922z.m9915e()) && VERSION.SDK_INT >= 17) {
                this.f16486a.setTextDirection(2);
            }
            if (this.f16489e != null) {
                this.f16486a.setText(this.f16489e);
                boolean z = false;
                if (this.f16486a instanceof NoMoreSpaceTextView) {
                    ((NoMoreSpaceTextView) this.f16486a).setAlwaysInvalidate(false);
                }
                if (bVar instanceof C5089e) {
                    C5089e eVar = (C5089e) bVar;
                    if (((C8003o) eVar.f13643a).f21880d != null && !C9376b.m18558a((Collection<T>) ((C8003o) eVar.f13643a).f21880d.getUrls()) && !TextUtils.isEmpty((CharSequence) ((C8003o) eVar.f13643a).f21880d.getUrls().get(0))) {
                        z = true;
                    }
                    if (z) {
                        TextView textView = this.f16486a;
                        Room a = this.f16488c.mo12171a();
                        C6152em emVar = new C6152em(this);
                        WeakReference weakReference = new WeakReference(textView);
                        float f = textView.getResources().getDisplayMetrics().density / 3.0f;
                        C8794c l = TTLiveSDKContext.getHostService().mo10319l();
                        ImageModel imageModel = ((C8003o) eVar.f13643a).f21880d;
                        C50901 r1 = new C8797c(weakReference, f, a, emVar) {

                            /* renamed from: a */
                            final /* synthetic */ WeakReference f13651a;

                            /* renamed from: b */
                            final /* synthetic */ float f13652b;

                            /* renamed from: c */
                            final /* synthetic */ Room f13653c;

                            /* renamed from: d */
                            final /* synthetic */ C5086b f13654d;

                            /* renamed from: a */
                            public final void mo9146a(C8795a aVar) {
                            }

                            /* renamed from: a */
                            public final void mo9145a(Bitmap bitmap) {
                                int i;
                                if (this.f13651a.get() != null && bitmap != null) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                    float width = ((float) bitmap.getWidth()) * this.f13652b;
                                    float height = ((float) bitmap.getHeight()) * this.f13652b;
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(((TextView) this.f13651a.get()).getResources(), copy);
                                    bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                                    C8534c cVar = new C8534c(bitmapDrawable);
                                    spannableStringBuilder.append("0");
                                    if (spannableStringBuilder.length() > 0) {
                                        i = spannableStringBuilder.length() - 1;
                                    } else {
                                        i = spannableStringBuilder.length();
                                    }
                                    spannableStringBuilder.setSpan(cVar, i, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append(" ");
                                    spannableStringBuilder.setSpan(new ClickableSpan() {
                                        public final void onClick(View view) {
                                            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                                                TTLiveSDKContext.getHostService().mo10315h().mo14516a(((TextView) C50901.this.f13651a.get()).getContext(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.e6t)).mo14539a(0).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                                                return;
                                            }
                                            if (((C8003o) C5089e.this.f13643a).f21881e == 1 && !TextUtils.isEmpty(((C8003o) C5089e.this.f13643a).f21882f)) {
                                                C18922i iVar = new C18922i(((C8003o) C5089e.this.f13643a).f21882f);
                                                if (!(C50901.this.f13653c == null || C50901.this.f13653c.getOwner() == null)) {
                                                    iVar.mo38777a("anchor_id", C50901.this.f13653c.getOwner().getId());
                                                    iVar.mo38777a("room_id", C50901.this.f13653c.getId());
                                                }
                                                iVar.mo38777a("user_id", TTLiveSDKContext.getHostService().mo10315h().mo14529b());
                                                C5161ag agVar = new C5161ag(iVar.mo38774a(), "", 17, 0, 0, 8);
                                                agVar.f13838h = true;
                                                C4495a.m10823a().mo10301a((Object) agVar);
                                            }
                                        }
                                    }, i, spannableStringBuilder.length(), 33);
                                    if (this.f13654d != null) {
                                        this.f13654d.mo10993a(spannableStringBuilder);
                                    }
                                }
                            }

                            {
                                this.f13651a = r2;
                                this.f13652b = r3;
                                this.f13653c = r4;
                                this.f13654d = r5;
                            }
                        };
                        l.mo15490a(imageModel, (C8797c) r1);
                    }
                }
                if (bVar instanceof C5099l) {
                    ((C5099l) bVar).mo10996a(new C6153en(this));
                } else if (bVar instanceof C5097k) {
                    ((C5097k) bVar).mo10995a(new C6154eo(this));
                }
                m13303a(this.f16486a, this.f16489e, bVar);
            }
        }

        /* renamed from: a */
        public final void mo12173a(SparseArray<ImageSpan> sparseArray, List<ImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < sparseArray.size(); i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                this.f16491i = spannableStringBuilder.append(this.f16489e);
                this.f16486a.setText(this.f16491i);
            }
        }

        /* renamed from: a */
        private void m13306a(final List<TextImageModel> list) {
            if (!list.isEmpty()) {
                final SparseArray sparseArray = new SparseArray();
                for (final int i = 0; i < list.size(); i++) {
                    if (((TextImageModel) list.get(i)).f23709c == 2) {
                        Bitmap a = C4560ab.m10952a(this.f16486a.getContext(), ((TextImageModel) list.get(i)).f23710d);
                        if (a != null && !a.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f16486a.getResources(), a);
                            bitmapDrawable.setBounds(0, 0, a.getWidth(), a.getHeight());
                            sparseArray.put(i, new C8534c(bitmapDrawable));
                            mo12174b(sparseArray, list);
                        }
                    } else {
                        TTLiveSDKContext.getHostService().mo10319l().mo15490a((ImageModel) list.get(i), (C8797c) new C8797c() {
                            /* renamed from: a */
                            public final void mo9146a(C8795a aVar) {
                                String str;
                                sparseArray.put(i, null);
                                C6146d.this.mo12174b(sparseArray, list);
                                HashMap hashMap = new HashMap();
                                hashMap.put("event_name", "message badges load error");
                                String str2 = "error_msg";
                                if (aVar.f24035a != null) {
                                    str = aVar.f24035a.getMessage();
                                } else {
                                    str = "";
                                }
                                hashMap.put(str2, str);
                                C8064d.m16005b().mo9199b("ttlive_msg", (Map<String, ?>) hashMap);
                            }

                            /* renamed from: a */
                            public final void mo9145a(Bitmap bitmap) {
                                if (bitmap == null || bitmap.isRecycled()) {
                                    sparseArray.put(i, null);
                                    C6146d.this.mo12174b(sparseArray, list);
                                    return;
                                }
                                TextImageModel textImageModel = (TextImageModel) list.get(i);
                                Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                float width = ((float) bitmap.getWidth()) * C6146d.f16483d;
                                float height = ((float) bitmap.getHeight()) * C6146d.f16483d;
                                if (!TextUtils.isEmpty(textImageModel.f23707a) && textImageModel.f23709c == 1) {
                                    C6146d.m13305a(textImageModel.f23707a, -1, bitmap, copy);
                                } else if (!TextUtils.isEmpty(textImageModel.f23707a) && textImageModel.f23709c == 3) {
                                    C8122a.m16194a(C6146d.this.f16486a.getContext(), -1, copy, textImageModel.f23707a);
                                }
                                if (textImageModel.f23709c == 4) {
                                    C6146d.m13307b(textImageModel.f23707a, textImageModel.f23708b, bitmap, copy);
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(C6146d.this.f16486a.getResources(), copy);
                                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                                sparseArray.put(i, new C8534c(bitmapDrawable));
                                C6146d.this.mo12174b(sparseArray, list);
                            }
                        });
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:0x014b, code lost:
            if (11 != r5) goto L_0x014e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m13304a(com.bytedance.android.livesdk.chatroom.p309e.C5084b<?> r10) {
            /*
                r9 = this;
                if (r10 != 0) goto L_0x0003
                return
            L_0x0003:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                if (r1 == 0) goto L_0x0026
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                java.lang.String r1 = r1.getSpecialId()
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0026
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r1 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                int r2 = com.bytedance.android.livesdk.p279af.C4560ab.c69
                r1.<init>(r2)
                r0.add(r1)
            L_0x0026:
                java.util.List r1 = r10.mo10988k()
                boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
                if (r1 != 0) goto L_0x0051
                java.util.List r1 = r10.mo10988k()
                java.util.Iterator r1 = r1.iterator()
            L_0x0038:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0051
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r3 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                r3.<init>(r2)
                r0.add(r3)
                goto L_0x0038
            L_0x0051:
                java.util.List r1 = r10.mo10987j()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0078
                java.util.List r1 = r10.mo10987j()
                java.util.Iterator r1 = r1.iterator()
                r4 = 0
            L_0x0062:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0079
                java.lang.Object r4 = r1.next()
                com.bytedance.android.live.base.model.ImageModel r4 = (com.bytedance.android.live.base.model.ImageModel) r4
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r5 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                r5.<init>(r4, r3)
                r0.add(r5)
                r4 = 1
                goto L_0x0062
            L_0x0078:
                r4 = 0
            L_0x0079:
                if (r4 != 0) goto L_0x00bb
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                if (r1 == 0) goto L_0x00bb
                com.bytedance.android.live.base.model.user.FraternityInfo r1 = r1.getFraternityInfo()
                if (r1 == 0) goto L_0x00bb
                boolean r4 = r1.isValid()
                if (r4 == 0) goto L_0x00bb
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r4 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                com.bytedance.android.live.base.model.ImageModel r5 = r1.getBackground()
                r6 = 4
                r4.<init>(r5, r6)
                java.lang.String r5 = r1.getName()
                r4.f23707a = r5
                java.lang.String r1 = r1.getFontColor()     // Catch:{ Exception -> 0x00a8 }
                int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x00a8 }
                r4.f23708b = r1     // Catch:{ Exception -> 0x00a8 }
                goto L_0x00b8
            L_0x00a8:
                r1 = move-exception
                r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r4.f23708b = r5
                com.bytedance.android.livesdk.p399o.C8064d.m16005b()
                r5 = 5
                java.lang.StackTraceElement[] r1 = r1.getStackTrace()
                com.bytedance.android.livesdk.p399o.C8064d.m9718a(r5, r1)
            L_0x00b8:
                r0.add(r4)
            L_0x00bb:
                com.bytedance.android.live.base.model.ImageModel r1 = r10.mo10986i()
                if (r1 == 0) goto L_0x00f9
                com.bytedance.android.live.base.model.ImageModel r1 = r10.mo10986i()
                java.util.List r1 = r1.getUrls()
                if (r1 == 0) goto L_0x00f9
                com.bytedance.android.live.base.model.ImageModel r1 = r10.mo10986i()
                java.util.List r1 = r1.getUrls()
                int r1 = r1.size()
                if (r1 <= 0) goto L_0x00f9
                com.bytedance.android.live.base.model.ImageModel r1 = r10.mo10986i()
                java.util.List r1 = r1.getUrls()
                java.lang.Object r1 = r1.get(r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x00f9
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r1 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                com.bytedance.android.live.base.model.ImageModel r4 = r10.mo10986i()
                r1.<init>(r4, r3)
                r0.add(r1)
            L_0x00f9:
                T r1 = r10.f13643a
                r4 = 2
                if (r1 == 0) goto L_0x014f
                com.bytedance.android.livesdk.chatroom.ui.ej$c r5 = r9.f16488c
                com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r5.mo12171a()
                if (r5 == 0) goto L_0x0113
                com.bytedance.android.livesdk.chatroom.ui.ej$c r5 = r9.f16488c
                com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r5.mo12171a()
                int r5 = r5.getOrientation()
                if (r5 != r4) goto L_0x0113
                goto L_0x014f
            L_0x0113:
                boolean r5 = r1 instanceof com.bytedance.android.livesdk.message.model.C7835bj
                if (r5 == 0) goto L_0x014e
                com.bytedance.android.livesdk.message.model.bj r1 = (com.bytedance.android.livesdk.message.model.C7835bj) r1
                long r5 = r1.mo14147a()
                r7 = 5
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 6
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 3
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 10
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 9
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 4
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 7
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x014f
                r7 = 11
                int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r1 != 0) goto L_0x014e
                goto L_0x014f
            L_0x014e:
                r3 = 1
            L_0x014f:
                if (r3 == 0) goto L_0x01d6
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                if (r1 == 0) goto L_0x01d6
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                com.bytedance.android.live.base.model.FansClubMember r1 = r1.getFansClub()
                if (r1 == 0) goto L_0x01d6
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                com.bytedance.android.live.base.model.FansClubMember r1 = r1.getFansClub()
                com.bytedance.android.live.base.model.user.FansClubData r1 = r1.getData()
                boolean r1 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r1)
                if (r1 == 0) goto L_0x0180
                com.bytedance.android.live.base.model.user.User r10 = r10.mo10980e()
                com.bytedance.android.live.base.model.FansClubMember r10 = r10.getFansClub()
                com.bytedance.android.live.base.model.user.FansClubData r10 = r10.getData()
                goto L_0x01a6
            L_0x0180:
                com.bytedance.android.live.base.model.user.User r1 = r10.mo10980e()
                com.bytedance.android.live.base.model.FansClubMember r1 = r1.getFansClub()
                java.util.Map r1 = r1.getPreferData()
                if (r1 == 0) goto L_0x01a5
                com.bytedance.android.live.base.model.user.User r10 = r10.mo10980e()
                com.bytedance.android.live.base.model.FansClubMember r10 = r10.getFansClub()
                java.util.Map r10 = r10.getPreferData()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                java.lang.Object r10 = r10.get(r1)
                com.bytedance.android.live.base.model.user.FansClubData r10 = (com.bytedance.android.live.base.model.user.FansClubData) r10
                goto L_0x01a6
            L_0x01a5:
                r10 = 0
            L_0x01a6:
                boolean r1 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r10)
                if (r1 == 0) goto L_0x01d6
                int r1 = r10.userFansClubStatus
                if (r1 != r2) goto L_0x01d6
                com.bytedance.android.live.base.model.user.FansClubData$UserBadge r1 = r10.badge
                if (r1 == 0) goto L_0x01d6
                com.bytedance.android.live.base.model.user.FansClubData$UserBadge r1 = r10.badge
                java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r1 = r1.icons
                if (r1 == 0) goto L_0x01d6
                com.bytedance.android.live.base.model.user.FansClubData$UserBadge r1 = r10.badge
                java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r1 = r1.icons
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                java.lang.Object r1 = r1.get(r3)
                com.bytedance.android.live.base.model.ImageModel r1 = (com.bytedance.android.live.base.model.ImageModel) r1
                if (r1 == 0) goto L_0x01d6
                com.bytedance.android.livesdkapi.depend.model.TextImageModel r3 = new com.bytedance.android.livesdkapi.depend.model.TextImageModel
                r3.<init>(r1, r2)
                java.lang.String r10 = r10.clubName
                r3.f23707a = r10
                r0.add(r3)
            L_0x01d6:
                r9.m13306a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6141ej.C6146d.m13304a(com.bytedance.android.livesdk.chatroom.e.b):void");
        }

        C6146d(View view, C6145c cVar) {
            super(view);
            this.f16486a = (TextView) view.findViewById(R.id.text);
            this.f16487b = view.findViewById(R.id.b6q);
            this.f16488c = cVar;
            if (f16483d <= 0.0f) {
                f16483d = view.getResources().getDisplayMetrics().density / 3.0f;
            }
            this.f16486a.setMovementMethod(C6113do.m13282a());
            this.f16486a.setHighlightColor(0);
            this.f16490f = new C6151el(this);
            if (f16484g == null) {
                Paint paint = new Paint();
                f16484g = paint;
                paint.setColor(-1);
                f16484g.setStyle(Style.FILL_AND_STROKE);
                f16484g.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            }
            if (f16485h == null) {
                Paint paint2 = new Paint();
                f16485h = paint2;
                paint2.setStyle(Style.FILL_AND_STROKE);
                f16485h.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            }
        }

        /* renamed from: b */
        public final void mo12174b(SparseArray<ImageSpan> sparseArray, List<TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < sparseArray.size(); i++) {
                    ImageSpan imageSpan = (ImageSpan) sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append("0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                this.f16491i = spannableStringBuilder.append(this.f16489e);
                this.f16486a.setText(this.f16491i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12172a(Bitmap bitmap, C5084b bVar) {
            if (bitmap != null && bVar != null) {
                int lastIndexOf = this.f16489e.toString().lastIndexOf(" . ");
                if (lastIndexOf != -1) {
                    C5115z.m11761a(this.f16489e, bitmap, lastIndexOf + 1, lastIndexOf + 2, bVar);
                }
                if (this.f16491i != null) {
                    int lastIndexOf2 = this.f16491i.toString().lastIndexOf(" . ");
                    if (lastIndexOf2 != -1) {
                        C5115z.m11761a(this.f16491i, bitmap, lastIndexOf2 + 1, lastIndexOf2 + 2, bVar);
                    }
                    this.f16486a.setText(this.f16491i);
                    return;
                }
                this.f16486a.setText(this.f16489e);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:77:0x017b A[Catch:{ Exception -> 0x0176 }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01b6 A[Catch:{ Exception -> 0x0176 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m13303a(final android.widget.TextView r13, android.text.Spannable r14, com.bytedance.android.livesdk.chatroom.p309e.C5084b<?> r15) {
            /*
                r12 = this;
                r14 = 2131955771(0x7f13103b, float:1.9548079E38)
                r13.setBackgroundResource(r14)
                r15.mo10980e()
                boolean r0 = r15 instanceof com.bytedance.android.livesdk.chatroom.p309e.C5088d
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0029
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.m r3 = (com.bytedance.android.livesdk.message.model.C8001m) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21872e
                if (r3 == 0) goto L_0x0029
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.m r3 = (com.bytedance.android.livesdk.message.model.C8001m) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21872e
                java.util.List r3 = r3.getUrls()
                boolean r3 = com.bytedance.common.utility.C9414h.m18630a(r3)
                if (r3 != 0) goto L_0x0029
            L_0x0027:
                r3 = 1
                goto L_0x0064
            L_0x0029:
                boolean r3 = r15 instanceof com.bytedance.android.livesdk.chatroom.p309e.C5104p
                if (r3 == 0) goto L_0x0046
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.bj r3 = (com.bytedance.android.livesdk.message.model.C7835bj) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21646n
                if (r3 == 0) goto L_0x0046
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.bj r3 = (com.bytedance.android.livesdk.message.model.C7835bj) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21646n
                java.util.List r3 = r3.getUrls()
                boolean r3 = com.bytedance.common.utility.C9414h.m18630a(r3)
                if (r3 != 0) goto L_0x0046
                goto L_0x0027
            L_0x0046:
                boolean r3 = r15 instanceof com.bytedance.android.livesdk.chatroom.p309e.C5111w
                if (r3 == 0) goto L_0x0063
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.cj r3 = (com.bytedance.android.livesdk.message.model.C7869cj) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21792g
                if (r3 == 0) goto L_0x0063
                T r3 = r15.f13643a
                com.bytedance.android.livesdk.message.model.cj r3 = (com.bytedance.android.livesdk.message.model.C7869cj) r3
                com.bytedance.android.live.base.model.ImageModel r3 = r3.f21792g
                java.util.List r3 = r3.getUrls()
                boolean r3 = com.bytedance.common.utility.C9414h.m18630a(r3)
                if (r3 != 0) goto L_0x0063
                goto L_0x0027
            L_0x0063:
                r3 = 0
            L_0x0064:
                r4 = 0
                if (r3 == 0) goto L_0x00a0
                if (r0 == 0) goto L_0x0070
                T r14 = r15.f13643a
                com.bytedance.android.livesdk.message.model.m r14 = (com.bytedance.android.livesdk.message.model.C8001m) r14
                com.bytedance.android.live.base.model.ImageModel r14 = r14.f21872e
                goto L_0x0087
            L_0x0070:
                boolean r14 = r15 instanceof com.bytedance.android.livesdk.chatroom.p309e.C5111w
                if (r14 == 0) goto L_0x007b
                T r14 = r15.f13643a
                com.bytedance.android.livesdk.message.model.cj r14 = (com.bytedance.android.livesdk.message.model.C7869cj) r14
                com.bytedance.android.live.base.model.ImageModel r14 = r14.f21792g
                goto L_0x0087
            L_0x007b:
                boolean r14 = r15 instanceof com.bytedance.android.livesdk.chatroom.p309e.C5104p
                if (r14 == 0) goto L_0x0086
                T r14 = r15.f13643a
                com.bytedance.android.livesdk.message.model.bj r14 = (com.bytedance.android.livesdk.message.model.C7835bj) r14
                com.bytedance.android.live.base.model.ImageModel r14 = r14.f21646n
                goto L_0x0087
            L_0x0086:
                r14 = r4
            L_0x0087:
                if (r14 == 0) goto L_0x00c0
                T r0 = r15.f13643a
                long r5 = r0.getMessageId()
                android.content.Context r0 = com.bytedance.android.live.core.p230g.C3922z.m9915e()
                boolean r0 = com.bytedance.android.live.uikit.p257c.C4206c.m10426a(r0)
                com.bytedance.android.livesdk.chatroom.ui.ej$d$1 r3 = new com.bytedance.android.livesdk.chatroom.ui.ej$d$1
                r3.<init>(r13, r5)
                com.bytedance.android.livesdk.chatroom.p310f.C5235t.m11853a(r14, r13, r0, r3)
                goto L_0x00c0
            L_0x00a0:
                java.lang.String r0 = r15.mo10982g()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x00c0
                r13.setBackgroundResource(r14)
                android.graphics.drawable.Drawable r14 = r13.getBackground()     // Catch:{ Exception -> 0x00bf }
                android.graphics.drawable.GradientDrawable r14 = (android.graphics.drawable.GradientDrawable) r14     // Catch:{ Exception -> 0x00bf }
                java.lang.String r0 = r15.mo10982g()     // Catch:{ Exception -> 0x00bf }
                int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x00bf }
                r14.setColor(r0)     // Catch:{ Exception -> 0x00bf }
                goto L_0x00c0
            L_0x00bf:
            L_0x00c0:
                r14 = 2132023591(0x7f141927, float:1.9685634E38)
                java.lang.Object r0 = r13.getTag(r14)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x00e7
                java.util.Iterator r0 = r0.iterator()
            L_0x00cf:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00e7
                java.lang.Object r3 = r0.next()
                com.facebook.d.c r3 = (com.facebook.p929d.C13745c) r3
                if (r3 == 0) goto L_0x00cf
                boolean r5 = r3.mo25668a()
                if (r5 != 0) goto L_0x00cf
                r3.mo25677g()
                goto L_0x00cf
            L_0x00e7:
                r13.setTag(r14, r4)
                com.bytedance.android.live.core.setting.p<java.lang.Boolean> r13 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_COMMENT_MESSAGE_BADGE_V2_ENABLE
                java.lang.Object r13 = r13.mo9431a()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x01fd
                if (r15 == 0) goto L_0x0200
                com.bytedance.android.live.base.model.user.User r13 = r15.mo10980e()
                if (r13 != 0) goto L_0x0102
                goto L_0x0200
            L_0x0102:
                com.bytedance.android.live.base.model.user.User r13 = r15.mo10980e()
                java.util.List r13 = r13.getBadgeImageList()
                if (r13 == 0) goto L_0x0200
                boolean r14 = r13.isEmpty()
                if (r14 == 0) goto L_0x0114
                goto L_0x0200
            L_0x0114:
                android.util.SparseArray r14 = new android.util.SparseArray
                r14.<init>()
                r15 = 0
            L_0x011a:
                int r0 = r13.size()
                if (r15 >= r0) goto L_0x01fc
                java.lang.Object r0 = r13.get(r15)
                com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
                if (r0 == 0) goto L_0x01f8
                boolean r3 = r0.isAnimated()
                if (r3 == 0) goto L_0x01e2
                if (r0 == 0) goto L_0x0178
                java.util.List r3 = r0.getUrls()     // Catch:{ Exception -> 0x0176 }
                if (r3 == 0) goto L_0x0178
                java.util.List r3 = r0.getUrls()     // Catch:{ Exception -> 0x0176 }
                int r3 = r3.size()     // Catch:{ Exception -> 0x0176 }
                if (r3 != 0) goto L_0x0141
                goto L_0x0178
            L_0x0141:
                com.facebook.imagepipeline.o.b[] r0 = com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11827b(r0)     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.a.a.e r3 = com.facebook.drawee.p930a.p931a.C13771c.m27870a()     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.c.b r0 = r3.mo25755a((REQUEST[]) r0)     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.a.a.e r0 = (com.facebook.drawee.p930a.p931a.C13773e) r0     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.c.b r0 = r0.mo25762c(r2)     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.a.a.e r0 = (com.facebook.drawee.p930a.p931a.C13773e) r0     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.c.a r0 = r0.mo25763d()     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.f.b r3 = new com.facebook.drawee.f.b     // Catch:{ Exception -> 0x0176 }
                android.content.res.Resources r5 = com.bytedance.android.live.core.p230g.C3922z.m9901a()     // Catch:{ Exception -> 0x0176 }
                r3.<init>(r5)     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.f.a r3 = r3.mo25912a()     // Catch:{ Exception -> 0x0176 }
                android.content.Context r5 = com.bytedance.android.live.core.p230g.C3922z.m9915e()     // Catch:{ Exception -> 0x0176 }
                com.facebook.drawee.view.b r3 = com.facebook.drawee.view.C13848b.m28154a(r3, r5)     // Catch:{ Exception -> 0x0176 }
                r3.mo25979a(r0)     // Catch:{ Exception -> 0x0176 }
                android.graphics.drawable.Drawable r0 = r3.mo25985e()     // Catch:{ Exception -> 0x0176 }
                goto L_0x0179
            L_0x0176:
                r0 = move-exception
                goto L_0x01bd
            L_0x0178:
                r0 = r4
            L_0x0179:
                if (r0 == 0) goto L_0x01b6
                android.widget.TextView r3 = r12.f16486a     // Catch:{ Exception -> 0x0176 }
                boolean r3 = r3 instanceof com.bytedance.android.livesdk.widget.NoMoreSpaceTextView     // Catch:{ Exception -> 0x0176 }
                if (r3 == 0) goto L_0x0188
                android.widget.TextView r3 = r12.f16486a     // Catch:{ Exception -> 0x0176 }
                com.bytedance.android.livesdk.widget.NoMoreSpaceTextView r3 = (com.bytedance.android.livesdk.widget.NoMoreSpaceTextView) r3     // Catch:{ Exception -> 0x0176 }
                r3.setAlwaysInvalidate(r2)     // Catch:{ Exception -> 0x0176 }
            L_0x0188:
                r3 = 1065353216(0x3f800000, float:1.0)
                int r5 = r0.getIntrinsicWidth()     // Catch:{ Exception -> 0x0176 }
                float r5 = (float) r5     // Catch:{ Exception -> 0x0176 }
                float r5 = r5 * r3
                int r3 = r0.getIntrinsicHeight()     // Catch:{ Exception -> 0x0176 }
                float r3 = (float) r3     // Catch:{ Exception -> 0x0176 }
                float r5 = r5 / r3
                android.widget.TextView r3 = r12.f16486a     // Catch:{ Exception -> 0x0176 }
                int r3 = r3.getLineHeight()     // Catch:{ Exception -> 0x0176 }
                float r3 = (float) r3     // Catch:{ Exception -> 0x0176 }
                float r3 = r3 * r5
                int r3 = (int) r3     // Catch:{ Exception -> 0x0176 }
                android.widget.TextView r5 = r12.f16486a     // Catch:{ Exception -> 0x0176 }
                int r5 = r5.getLineHeight()     // Catch:{ Exception -> 0x0176 }
                r0.setBounds(r1, r1, r3, r5)     // Catch:{ Exception -> 0x0176 }
                com.bytedance.android.livesdk.widget.c r3 = new com.bytedance.android.livesdk.widget.c     // Catch:{ Exception -> 0x0176 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0176 }
                r14.put(r15, r3)     // Catch:{ Exception -> 0x0176 }
                r12.mo12173a(r14, r13)     // Catch:{ Exception -> 0x0176 }
                goto L_0x01f8
            L_0x01b6:
                r14.put(r15, r4)     // Catch:{ Exception -> 0x0176 }
                r12.mo12173a(r14, r13)     // Catch:{ Exception -> 0x0176 }
                goto L_0x01f8
            L_0x01bd:
                r14.put(r15, r4)
                r12.mo12173a(r14, r13)
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r5 = "event_name"
                java.lang.String r6 = "message gif badge load error"
                r3.put(r5, r6)
                java.lang.String r5 = "error_msg"
                java.lang.String r0 = r0.getMessage()
                r3.put(r5, r0)
                com.bytedance.android.livesdk.o.d r0 = com.bytedance.android.livesdk.p399o.C8064d.m16005b()
                java.lang.String r5 = "ttlive_msg"
                r0.mo9199b(r5, r3)
                goto L_0x01f8
            L_0x01e2:
                com.bytedance.android.livesdk.ab.e r3 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
                com.bytedance.android.livesdkapi.host.c r3 = r3.mo10319l()
                com.bytedance.android.livesdk.chatroom.ui.ej$d$2 r11 = new com.bytedance.android.livesdk.chatroom.ui.ej$d$2
                r5 = r11
                r6 = r12
                r7 = r14
                r8 = r15
                r9 = r13
                r10 = r0
                r5.<init>(r7, r8, r9, r10)
                r3.mo15490a(r0, r11)
            L_0x01f8:
                int r15 = r15 + 1
                goto L_0x011a
            L_0x01fc:
                return
            L_0x01fd:
                r12.m13304a(r15)
            L_0x0200:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6141ej.C6146d.m13303a(android.widget.TextView, android.text.Spannable, com.bytedance.android.livesdk.chatroom.e.b):void");
        }

        /* renamed from: a */
        public static void m13305a(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f16484g.setTextSize(0.53f * height);
            f16484g.setColor(i);
            float measureText = f16484g.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f16484g.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) / 2.0f), ((height - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), f16484g);
        }

        /* renamed from: b */
        public static void m13307b(String str, int i, Bitmap bitmap, Bitmap bitmap2) {
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            f16485h.setTextSize(0.47f * height);
            f16485h.setColor(i);
            float measureText = f16485h.measureText(str);
            float f = width - height;
            if (measureText > f) {
                measureText = f;
            }
            Canvas canvas = new Canvas(bitmap2);
            FontMetrics fontMetrics = f16485h.getFontMetrics();
            canvas.drawText(str, height + ((f - measureText) * 0.4f), ((height - (fontMetrics.descent - fontMetrics.ascent)) * 0.65f) + Math.abs(fontMetrics.ascent), f16485h);
        }
    }

    public final int getItemCount() {
        if (this.f16473b == null) {
            return 0;
        }
        return this.f16473b.size();
    }

    public final int getItemViewType(int i) {
        return ((C5084b) this.f16473b.get(i)).f13644b;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C6146d(this.f16472a.inflate(R.layout.alf, viewGroup, false), new C6150ek(this));
            case 1:
                return new C6143a(this.f16472a.inflate(R.layout.aom, viewGroup, false), this.f16476e);
            default:
                throw new IllegalArgumentException("unknown message view type");
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C5084b bVar = (C5084b) this.f16473b.get(i);
        ((C6144b) vVar).mo12170a(bVar, i);
        if (this.f16475d) {
            this.f16475d = false;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "ON_FIRST_MSG_SHOW");
            hashMap.put("msg_id", Long.valueOf(bVar.f13643a.getMessageId()));
            hashMap.put("method", bVar.f13643a.getMessageType().getWsMethod());
            C8064d.m16005b().mo9199b("ttlive_msg", (Map<String, ?>) hashMap);
        }
    }
}
