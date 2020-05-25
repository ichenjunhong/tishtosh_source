package com.p683ss.android.ugc.aweme.notification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38032a;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notification.util.C38442i;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.widget.BadgeView;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.c */
public final class C38154c implements C38162d {

    /* renamed from: a */
    C38155a f97166a;

    /* renamed from: b */
    C38150b f97167b = new C38150b();

    /* renamed from: com.ss.android.ugc.aweme.notification.c$a */
    static class C38155a extends C1322a<C38158a> {

        /* renamed from: a */
        public final List<C38032a> f97168a;

        /* renamed from: b */
        private final Context f97169b;

        /* renamed from: c */
        private final C38150b f97170c;

        /* renamed from: com.ss.android.ugc.aweme.notification.c$a$a */
        static class C38158a extends C1352v {

            /* renamed from: a */
            public TextView f97177a;

            /* renamed from: b */
            public ImageView f97178b;

            /* renamed from: c */
            public ConstraintLayout f97179c;

            /* renamed from: d */
            public final BadgeView f97180d;

            /* renamed from: e */
            private TextView f97181e;

            C38158a(View view) {
                super(view);
                this.f97178b = (ImageView) view.findViewById(R.id.dy);
                this.f97177a = (TextView) view.findViewById(R.id.dz);
                this.f97181e = (TextView) view.findViewById(R.id.di2);
                this.f97179c = (ConstraintLayout) view.findViewById(R.id.bjp);
                this.f97180d = new BadgeView(view.getContext());
                this.f97180d.setTargetView(this.f97181e);
                this.f97180d.mo78361a(35, view.getContext().getResources().getColor(R.color.b09));
                this.f97180d.setBadgeGravity(17);
                if (this.f97178b != null) {
                    C38446k.m85767b(this.f97178b);
                }
            }
        }

        /* renamed from: a */
        private static String m85277a(int i) {
            switch (i) {
                case 0:
                    return "fans";
                case 1:
                    return "like";
                case 2:
                    return "at";
                case 3:
                    return "comment";
                default:
                    switch (i) {
                        case 12:
                            return "commentandat";
                        case 13:
                            return "story";
                        default:
                            return null;
                    }
            }
        }

        public final int getItemCount() {
            return this.f97168a.size();
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C38158a(LayoutInflater.from(this.f97169b).inflate(R.layout.b26, viewGroup, false));
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            Drawable drawable;
            final C38158a aVar = (C38158a) vVar;
            final C38032a aVar2 = (C38032a) this.f97168a.get(i);
            ImageView imageView = aVar.f97178b;
            int i2 = aVar2.f96796c;
            switch (i2) {
                case 0:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.ckz);
                    break;
                case 1:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.cl1);
                    break;
                case 2:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.cl4);
                    break;
                case 3:
                    drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.cky);
                    break;
                default:
                    switch (i2) {
                        case 12:
                            drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.cl0);
                            break;
                        case 13:
                            drawable = C11010c.m22280a().getResources().getDrawable(R.drawable.cl5);
                            break;
                        default:
                            drawable = null;
                            break;
                    }
            }
            imageView.setImageDrawable(drawable);
            aVar.f97177a.setText(aVar2.f96797d);
            aVar.f97180d.setBadgeCount(aVar2.f96794a);
            aVar.f97178b.setContentDescription(aVar2.f96797d);
            aVar.f97178b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C38155a.this.mo78141a(view, aVar2, aVar.getAdapterPosition());
                }
            });
            aVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C38155a.this.mo78141a(view, aVar2, aVar.getAdapterPosition());
                }
            });
            aVar.itemView.setContentDescription(aVar2.f96797d);
            aVar.f97179c.setBackground(this.f97169b.getResources().getDrawable(R.drawable.cjt));
            LayoutParams layoutParams = (LayoutParams) aVar.f97178b.getLayoutParams();
            layoutParams.topMargin = (int) C9432q.m18687b(aVar.f97178b.getContext(), 22.0f);
            aVar.f97178b.setLayoutParams(layoutParams);
            C38442i.m85757a(m85277a(aVar2.f96796c), "show", aVar2.f96794a);
        }

        C38155a(Context context, List<C38032a> list, C38150b bVar) {
            this.f97169b = context;
            this.f97168a = list;
            this.f97170c = bVar;
        }

        /* renamed from: a */
        public final void mo78141a(View view, C38032a aVar, int i) {
            if (!C32800a.m75679a(view)) {
                NotificationDetailActivity.m85162a(this.f97169b, aVar.f96796c, aVar.f96794a);
                C38442i.m85757a(m85277a(aVar.f96796c), "click", aVar.f96794a);
                if (TextUtils.equals(m85277a(aVar.f96796c), "like")) {
                    LegacyServiceImpl.createILegacyServicebyMonsterPlugin().getUgAllService().mo49233a(aVar.f96794a);
                }
                if (this.f97170c != null) {
                    C38150b bVar = this.f97170c;
                    if (bVar.f97157a != null) {
                        bVar.f97157a.mo78139a(i);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$b */
    static class C38159b extends GridLayoutManager {

        /* renamed from: K */
        public boolean f97182K = true;

        /* renamed from: e */
        public final boolean mo4742e() {
            if (!this.f97182K || !super.mo4742e()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo4745f() {
            if (!this.f97182K || !super.mo4745f()) {
                return false;
            }
            return true;
        }

        C38159b(Context context, int i) {
            super(context, 4);
        }
    }

    /* renamed from: a */
    public final void mo78138a() {
        if (this.f97166a != null) {
            this.f97166a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo78139a(int i) {
        if (this.f97166a != null && i < this.f97166a.getItemCount() && i >= 0) {
            ((C38032a) this.f97166a.f97168a.get(i)).f96794a = 0;
            this.f97166a.notifyItemChanged(i);
        }
    }

    C38154c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38032a(0, 0, context.getString(R.string.b57)));
        if (MTNotificationTabMergeExperiment.m85062b()) {
            arrayList.add(new C38032a(1, 1, context.getString(R.string.ck5)));
            arrayList.add(new C38032a(2, 2, context.getString(R.string.ck1)));
            arrayList.add(new C38032a(3, 3, context.getString(R.string.ck2)));
        }
        this.f97166a = new C38155a(context, arrayList, this.f97167b);
    }

    /* renamed from: a */
    public final void mo78140a(RecyclerView recyclerView, Context context) {
        C38159b bVar = new C38159b(context, 4);
        bVar.f97182K = false;
        recyclerView.setLayoutManager(bVar);
        this.f97167b.f97157a = this;
        recyclerView.setAdapter(this.f97166a);
    }
}
