package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.anchor.C22583a.C22584a;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22592a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.C22600a;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53035c;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a */
public abstract class C22601a<T, VH extends C1352v> extends C53035c<T, VH> {

    /* renamed from: c */
    public static final C22604b f60753c = new C22604b(null);

    /* renamed from: a */
    public C22600a<T> f60754a;

    /* renamed from: b */
    public final C22678i f60755b;

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a$a */
    public class C22602a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C22601a f60756a;

        public C22602a(C22601a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60756a = aVar;
            super(view);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C22602a f60757a;

                {
                    this.f60757a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (this.f60757a.getAdapterPosition() >= 0) {
                        C53037e eVar = this.f60757a.f60756a.f131516e;
                        C52711k.m112236a((Object) eVar, "adapter");
                        Object obj = eVar.f131517a.get(this.f60757a.getAdapterPosition());
                        C22600a<T> aVar = this.f60757a.f60756a.f60754a;
                        if (aVar != null) {
                            C52711k.m112236a((Object) view, "it");
                            aVar.mo46995a(view, obj);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a$b */
    public static final class C22604b {
        private C22604b() {
        }

        public /* synthetic */ C22604b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a$c */
    public class C22605c extends C1352v {

        /* renamed from: a */
        public final ViewSwitcher f60758a;

        /* renamed from: b */
        public final ImageView f60759b;

        /* renamed from: c */
        final /* synthetic */ C22601a f60760c;

        /* renamed from: d */
        private final String f60761d;

        /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a$c$a */
        static final class C22606a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22605c f60762a;

            /* renamed from: b */
            final /* synthetic */ AnchorCell f60763b;

            C22606a(C22605c cVar, AnchorCell anchorCell) {
                this.f60762a = cVar;
                this.f60763b = anchorCell;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                int type = C22584a.m55780a().getTYPE();
                String str = this.f60763b.f60738a;
                if (str == null) {
                    str = "";
                }
                AnchorApi.m55788a(type, str, false).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C22592a, Object>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22606a f60764a;

                    {
                        this.f60764a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        C52711k.m112236a((Object) iVar, "task");
                        if (((C22592a) iVar.mo34e()).status_code == 0) {
                            C53037e eVar = this.f60764a.f60762a.f60760c.f131516e;
                            C52711k.m112236a((Object) eVar, "adapter");
                            eVar.f131517a.remove(this.f60764a.f60762a.getAdapterPosition());
                            this.f60764a.f60762a.f60760c.f131516e.notifyItemRemoved(this.f60764a.f60762a.getAdapterPosition());
                            C53037e eVar2 = this.f60764a.f60762a.f60760c.f131516e;
                            int adapterPosition = this.f60764a.f60762a.getAdapterPosition();
                            C53037e eVar3 = this.f60764a.f60762a.f60760c.f131516e;
                            C52711k.m112236a((Object) eVar3, "adapter");
                            eVar2.notifyItemRangeChanged(adapterPosition, eVar3.f131517a.size());
                            C22678i iVar2 = this.f60764a.f60762a.f60760c.f60755b;
                            if (iVar2 != null) {
                                iVar2.mo46965a(this.f60764a.f60763b);
                            }
                        }
                        return C52860x.f131107a;
                    }
                }, C0013i.f25b);
            }
        }

        /* renamed from: a */
        public void mo46997a(AnchorCell anchorCell) {
            C52711k.m112240b(anchorCell, "cell");
            boolean a = C52711k.m112239a((Object) (ImageView) this.f60758a.findViewWithTag("img_anchor_delete"), (Object) this.f60759b);
            if (!anchorCell.f60744g) {
                ViewSwitcher viewSwitcher = this.f60758a;
                C52711k.m112236a((Object) viewSwitcher, "switcher");
                if (viewSwitcher.getChildCount() == 1 && a) {
                    ViewSwitcher viewSwitcher2 = this.f60758a;
                    C52711k.m112236a((Object) viewSwitcher2, "switcher");
                    viewSwitcher2.setVisibility(8);
                    return;
                }
            }
            ViewSwitcher viewSwitcher3 = this.f60758a;
            C52711k.m112236a((Object) viewSwitcher3, "switcher");
            viewSwitcher3.setVisibility(0);
            ViewSwitcher viewSwitcher4 = this.f60758a;
            C52711k.m112236a((Object) viewSwitcher4, "switcher");
            viewSwitcher4.setDisplayedChild(anchorCell.f60744g ? 1 : 0);
            ImageView imageView = this.f60759b;
            if (imageView != null) {
                imageView.setOnClickListener(new C22606a(this, anchorCell));
            }
        }

        public C22605c(C22601a aVar, View view, String str) {
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(str, "fragmentType");
            this.f60760c = aVar;
            super(view);
            this.f60761d = str;
            this.f60758a = (ViewSwitcher) view.findViewById(R.id.ez4);
            this.f60759b = new ImageView(view.getContext());
            if (this.f60758a != null && C52711k.m112239a((Object) this.f60761d, (Object) "recently_Add")) {
                Context context = view.getContext();
                ImageView imageView = this.f60759b;
                if (imageView != null) {
                    imageView.setTag("img_anchor_delete");
                }
                ImageView imageView2 = this.f60759b;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(context.getDrawable(R.drawable.d0f));
                }
                int b = (int) C9432q.m18687b(context, 24.0f);
                this.f60758a.addView(this.f60759b, new LayoutParams(b, b, 8388613));
            }
        }
    }

    public C22601a(C22678i iVar) {
        this.f60755b = iVar;
    }
}
