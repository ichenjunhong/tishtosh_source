package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13783a;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b.C44010a;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c */
public abstract class C44286c extends C1322a<C1352v> {

    /* renamed from: b */
    public final ArrayList<MyMediaModel> f112101b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C44010a> f112102c = new ArrayList<>();

    /* renamed from: d */
    int f112103d = -1;

    /* renamed from: e */
    public C44291e f112104e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$a */
    public class C44287a extends C1352v {

        /* renamed from: a */
        private final ImageView f112105a;

        /* renamed from: b */
        public final SimpleDraweeView f112106b = ((SimpleDraweeView) this.itemView.findViewById(R.id.dp2));

        /* renamed from: c */
        public TextView f112107c;

        /* renamed from: d */
        public final View f112108d;

        /* renamed from: e */
        public final View f112109e;

        /* renamed from: f */
        final RelativeLayout f112110f;

        /* renamed from: g */
        final /* synthetic */ C44286c f112111g;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$a$a */
        static final class C44288a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44287a f112112a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f112113b;

            C44288a(C44287a aVar, MyMediaModel myMediaModel) {
                this.f112112a = aVar;
                this.f112113b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C44291e eVar = this.f112112a.f112111g.f112104e;
                if (eVar != null) {
                    eVar.mo89956a(this.f112113b);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.c$a$b */
        static final class C44289b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44287a f112114a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f112115b;

            C44289b(C44287a aVar, MyMediaModel myMediaModel) {
                this.f112114a = aVar;
                this.f112115b = myMediaModel;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C44286c.m96993c(this.f112115b)) {
                    C44291e eVar = this.f112114a.f112111g.f112104e;
                    if (eVar != null) {
                        eVar.mo89957a(this.f112115b, view);
                    }
                }
            }
        }

        public C44287a(C44286c cVar, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f112111g = cVar;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a16, viewGroup, false));
            View findViewById = this.itemView.findViewById(R.id.a90);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.duration_text)");
            this.f112107c = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.a47);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.delete_layout)");
            this.f112108d = findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.eun);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.select_border_view)");
            this.f112109e = findViewById3;
            this.f112110f = (RelativeLayout) this.itemView.findViewById(R.id.cfl);
            View findViewById4 = this.itemView.findViewById(R.id.a46);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.delete_img)");
            this.f112105a = (ImageView) findViewById4;
            float a = C20141b.m49696a(viewGroup.getContext(), 2.0f);
            Drawable a2 = C42430at.m93198a(0, 1275068416, 0, new float[]{0.0f, 0.0f, a, a, 0.0f, 0.0f, a, a});
            RelativeLayout relativeLayout = this.f112110f;
            if (relativeLayout == null) {
                C52711k.m112234a();
            }
            if (C47918gj.m103682a(relativeLayout.getContext())) {
                a2 = C42430at.m93198a(0, 1275068416, 0, new float[]{a, a, 0.0f, 0.0f, a, a, 0.0f, 0.0f});
            }
            this.f112105a.setBackground(a2);
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            int i = (int) a;
            this.f112109e.setBackground(C42430at.m93196a(context.getResources().getColor(R.color.a36), 0, i, i));
        }

        /* renamed from: a */
        public final void mo90182a(MyMediaModel myMediaModel, C44287a aVar, int i) {
            C52711k.m112240b(aVar, "holder");
            if (myMediaModel != null) {
                C44286c.m96991a(aVar, myMediaModel.f95389h);
                if (myMediaModel.mo76676c()) {
                    this.f112107c.setText(C44286c.m96992b(C52733a.m112277a((((float) myMediaModel.f95386e) * 1.0f) / 1000.0f)));
                    this.f112107c.setVisibility(0);
                } else {
                    this.f112107c.setVisibility(8);
                }
            }
            this.f112108d.setOnClickListener(new C44288a(this, myMediaModel));
            RelativeLayout relativeLayout = this.f112110f;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new C44289b(this, myMediaModel));
            }
        }
    }

    /* renamed from: a */
    public abstract int mo89839a();

    /* renamed from: a */
    public abstract void mo89840a(int i);

    /* renamed from: a */
    public abstract void mo89843a(ArrayList<C44010a> arrayList);

    public int getItemCount() {
        return this.f112101b.size();
    }

    /* renamed from: c */
    public static boolean m96993c(MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return true;
        }
        if (!TextUtils.isEmpty(myMediaModel.f95383b) || !TextUtils.isEmpty(myMediaModel.f95389h)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo89844b(MyMediaModel myMediaModel) {
        C52711k.m112240b(myMediaModel, "mediaModel");
        notifyItemInserted(getItemCount());
        this.f112101b.add(myMediaModel);
    }

    /* renamed from: b */
    public static String m96992b(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            Locale locale = Locale.CHINA;
            C52711k.m112236a((Object) locale, "Locale.CHINA");
            String a = C2240a.m6773a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
            C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
            return a;
        }
        Locale locale2 = Locale.CHINA;
        C52711k.m112236a((Object) locale2, "Locale.CHINA");
        String a2 = C2240a.m6773a(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        C52711k.m112236a((Object) a2, "java.lang.String.format(locale, format, *args)");
        return a2;
    }

    /* renamed from: a */
    public void mo89842a(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f112101b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = this.f112101b.get(i);
                C52711k.m112236a(obj, "mediaModelList[i]");
                if (C52711k.m112239a((Object) ((MyMediaModel) obj).f95383b, (Object) myMediaModel.f95383b)) {
                    notifyItemRemoved(i);
                    break;
                }
                i++;
            }
            this.f112101b.remove(myMediaModel);
        }
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        return new C44287a(this, viewGroup);
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "viewHolder");
        C44287a aVar = (C44287a) vVar;
        aVar.mo90182a((MyMediaModel) this.f112101b.get(i), aVar, i);
    }

    /* renamed from: a */
    public void mo89841a(C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(vVar, "sourceHolder");
        C52711k.m112240b(vVar2, "targetHolder");
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f112101b.size() && adapterPosition2 < this.f112101b.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            Object remove = this.f112101b.remove(adapterPosition);
            C52711k.m112236a(remove, "mediaModelList.removeAt(from)");
            this.f112101b.add(adapterPosition2, (MyMediaModel) remove);
        }
    }

    /* renamed from: a */
    public static void m96991a(C44287a aVar, String str) {
        C13842a aVar2;
        C52711k.m112240b(aVar, "holder");
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        C14229b a = C14232c.m29169a(Uri.parse(sb.toString())).mo26453a(new C13952d(C23728o.m58241a(56.0d), C23728o.m58241a(56.0d))).mo26449a();
        C13773e a2 = C13771c.m27870a();
        SimpleDraweeView simpleDraweeView = aVar.f112106b;
        if (simpleDraweeView != null) {
            aVar2 = simpleDraweeView.getController();
        } else {
            aVar2 = null;
        }
        C13783a c = ((C13773e) ((C13773e) a2.mo25759b(aVar2)).mo25757b(a)).mo25763d();
        SimpleDraweeView simpleDraweeView2 = aVar.f112106b;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setController(c);
        }
        Drawable a3 = C42430at.m93196a(0, 135665699, 0, (int) C20141b.m49696a(aVar.f112108d.getContext(), 2.0f));
        SimpleDraweeView simpleDraweeView3 = aVar.f112106b;
        if (simpleDraweeView3 != null) {
            C13833a aVar3 = (C13833a) simpleDraweeView3.getHierarchy();
            if (aVar3 != null) {
                aVar3.mo25904b(a3);
            }
        }
    }
}
