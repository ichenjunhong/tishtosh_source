package com.p683ss.android.ugc.aweme.sticker.types.p2320a;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.ViewStubCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.types.p2320a.C46434d.C46435a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.c */
public final class C46429c implements C46428b {

    /* renamed from: a */
    public final RecyclerView f117124a;

    /* renamed from: b */
    public final AppCompatActivity f117125b;

    /* renamed from: c */
    public final C46354l f117126c;

    /* renamed from: d */
    public final ViewGroup f117127d;

    /* renamed from: e */
    public final LiveData<List<ComposerNode>> f117128e;

    /* renamed from: f */
    public final C52682m<AVDmtImageTextView, ComposerNode, C52860x> f117129f;

    /* renamed from: g */
    private ComposerNode f117130g;

    /* renamed from: h */
    private final FilterBeautySeekBar f117131h;

    /* renamed from: i */
    private final C46431a f117132i = new C46431a();

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.c$a */
    public final class C46431a extends C1322a<C46432b> {

        /* renamed from: a */
        public ComposerNode f117134a;

        /* renamed from: b */
        List<? extends ComposerNode> f117135b;

        public final int getItemCount() {
            ComposerNode composerNode = this.f117134a;
            if (composerNode != null) {
                List a = mo93169a(composerNode);
                if (a != null) {
                    return a.size();
                }
            }
            return 0;
        }

        public C46431a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final List<ComposerNode> mo93169a(ComposerNode composerNode) {
            if (composerNode.children == null) {
                return C52575l.m112092a(composerNode);
            }
            List arrayList = new ArrayList();
            List<ComposerNode> list = composerNode.children;
            C52711k.m112236a((Object) list, "this.children");
            for (ComposerNode composerNode2 : list) {
                C52711k.m112236a((Object) composerNode2, "it");
                arrayList.addAll(mo93169a(composerNode2));
            }
            return C52575l.m112138e((Iterable<? extends T>) arrayList);
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            C46429c cVar = C46429c.this;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhq, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…rent, false\n            )");
            return new C46432b(cVar, inflate);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            ComposerNode composerNode;
            boolean z;
            C46432b bVar = (C46432b) vVar;
            C52711k.m112240b(bVar, "holder");
            List<? extends ComposerNode> list = this.f117135b;
            String str = null;
            if (list != null) {
                composerNode = (ComposerNode) list.get(i);
            } else {
                composerNode = null;
            }
            if (composerNode == null) {
                C52711k.m112234a();
            }
            C52682m<AVDmtImageTextView, ComposerNode, C52860x> mVar = C46429c.this.f117129f;
            C52711k.m112240b(composerNode, "node");
            C52711k.m112240b(mVar, "onClick");
            bVar.f117137a.setText(composerNode.UI_name);
            boolean z2 = true;
            bVar.f117137a.setShowDownloadIcon(true);
            AVDmtImageTextView aVDmtImageTextView = bVar.f117137a;
            Effect effect = composerNode.effect;
            C52711k.m112236a((Object) effect, "node.effect");
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl != null) {
                List urlList = iconUrl.getUrlList();
                if (urlList != null) {
                    str = (String) urlList.get(0);
                }
            }
            aVDmtImageTextView.mo93969a(str);
            Effect effect2 = composerNode.effect;
            C52711k.m112236a((Object) effect2, "node.effect");
            CharSequence id = effect2.getId();
            if (id == null || id.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !bVar.f117138b.f117126c.mo92973a().mo92532d().mo92511a(composerNode.effect)) {
                z2 = false;
            }
            if (z2) {
                bVar.f117137a.mo93963a();
            } else {
                bVar.f117137a.mo93972b();
            }
            bVar.f117137a.setOnClickListener(new C46433a(bVar, mVar, composerNode));
            AVDmtImageTextView aVDmtImageTextView2 = bVar.f117137a;
            Object value = bVar.f117138b.f117128e.getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            aVDmtImageTextView2.mo93970a(((List) value).contains(composerNode));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.c$b */
    public final class C46432b extends C1352v {

        /* renamed from: a */
        public final AVDmtImageTextView f117137a;

        /* renamed from: b */
        final /* synthetic */ C46429c f117138b;

        /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.c$b$a */
        static final class C46433a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C46432b f117139a;

            /* renamed from: b */
            final /* synthetic */ C52682m f117140b;

            /* renamed from: c */
            final /* synthetic */ ComposerNode f117141c;

            C46433a(C46432b bVar, C52682m mVar, ComposerNode composerNode) {
                this.f117139a = bVar;
                this.f117140b = mVar;
                this.f117141c = composerNode;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f117140b.invoke(this.f117139a.f117137a, this.f117141c);
            }
        }

        public C46432b(C46429c cVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f117138b = cVar;
            super(view);
            View d = C1056u.m3051d(view, R.id.ct2);
            C52711k.m112236a((Object) d, "ViewCompat.requireViewBy…w, R.id.sticker_img_view)");
            this.f117137a = (AVDmtImageTextView) d;
        }
    }

    /* renamed from: a */
    public final void mo93166a() {
        this.f117124a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo93167b() {
        this.f117131h.setVisibility(8);
        this.f117124a.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo93168c() {
        C1322a adapter = this.f117124a.getAdapter();
        if (adapter == null) {
            C52711k.m112234a();
        }
        adapter.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo93164a(ComposerNode composerNode) {
        List<? extends ComposerNode> list;
        this.f117130g = composerNode;
        C46431a aVar = this.f117132i;
        aVar.f117134a = composerNode;
        if (composerNode != null) {
            list = aVar.mo93169a(composerNode);
        } else {
            list = null;
        }
        aVar.f117135b = list;
        this.f117132i.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo93165a(ComposerNode composerNode, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(composerNode, "node");
        C52711k.m112240b(bVar, "onProgressChanged");
        this.f117131h.setVisibility(0);
        this.f117131h.setOnSeekBarChangeListener(new C46435a(bVar));
    }

    public C46429c(AppCompatActivity appCompatActivity, C46354l lVar, ViewGroup viewGroup, LiveData<List<ComposerNode>> liveData, C52682m<? super AVDmtImageTextView, ? super ComposerNode, C52860x> mVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(viewGroup, "rootView");
        C52711k.m112240b(liveData, "selectedComposerNodesLiveData");
        C52711k.m112240b(mVar, "onClick");
        this.f117125b = appCompatActivity;
        this.f117126c = lVar;
        this.f117127d = viewGroup;
        this.f117128e = liveData;
        this.f117129f = mVar;
        View d = C1056u.m3051d(this.f117127d, R.id.ctt);
        if (d != null) {
            View a = ((ViewStubCompat) d).mo5425a();
            View d2 = C1056u.m3051d(a, R.id.b9g);
            C52711k.m112236a((Object) d2, "ViewCompat.requireViewBy…d.layout_rv_face_matting)");
            this.f117124a = (RecyclerView) d2;
            this.f117124a.setAdapter(this.f117132i);
            this.f117124a.setLayoutManager(new LinearLayoutManager(this.f117125b, 0, false));
            View d3 = C1056u.m3051d(a, R.id.yk);
            C52711k.m112236a((Object) d3, "ViewCompat.requireViewBy…poser_intensity_seek_bar)");
            this.f117131h = (FilterBeautySeekBar) d3;
            this.f117128e.observe(this.f117125b, new C0199s<List<? extends ComposerNode>>(this) {

                /* renamed from: a */
                final /* synthetic */ C46429c f117133a;

                {
                    this.f117133a = r1;
                }

                public final /* synthetic */ void onChanged(Object obj) {
                    List list = (List) obj;
                    C1322a adapter = this.f117133a.f117124a.getAdapter();
                    if (adapter == null) {
                        C52711k.m112234a();
                    }
                    adapter.notifyDataSetChanged();
                }
            });
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.ViewStubCompat");
    }
}
