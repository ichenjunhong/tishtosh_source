package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiViewModel;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29482j;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder */
public final class SearchGifViewHolder extends JediBaseViewHolder<SearchGifViewHolder, GifEmoji> implements C29482j {

    /* renamed from: l */
    public static final C25099b f66492l = new C25099b(null);

    /* renamed from: g */
    final RemoteImageView f66493g;

    /* renamed from: j */
    public boolean f66494j;

    /* renamed from: k */
    public final C25134u f66495k;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$a */
    static final class C25098a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f66496a;

        C25098a(SearchGifViewHolder searchGifViewHolder) {
            this.f66496a = searchGifViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f66496a.f66494j) {
                C25134u uVar = this.f66496a.f66495k;
                C52711k.m112236a((Object) view, "it");
                uVar.mo51213a(view, this.f66496a.mo51177p(), this.f66496a.getAdapterPosition());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$b */
    public static final class C25099b {
        private C25099b() {
        }

        public /* synthetic */ C25099b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$c */
    static final class C25100c extends C52712l implements C52671b<GifEmojiState, GifEmojiState> {

        /* renamed from: a */
        final /* synthetic */ SearchGifViewHolder f66497a;

        C25100c(SearchGifViewHolder searchGifViewHolder) {
            this.f66497a = searchGifViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiState gifEmojiState = (GifEmojiState) obj;
            C52711k.m112240b(gifEmojiState, "$receiver");
            return gifEmojiState.copy((GifEmoji) this.f66497a.mo22689o());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder$d */
    static final class C25101d extends C52712l implements C52682m<SearchGifViewHolder, GifEmojiState, C52860x> {

        /* renamed from: a */
        public static final C25101d f66498a = new C25101d();

        C25101d() {
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x007a, code lost:
            if (r2 == null) goto L_0x007c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder r8 = (com.p683ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder) r8
                com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiState r9 = (com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiState) r9
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
                com.ss.android.ugc.aweme.comment.model.GifEmoji r9 = r9.getGifEmoji()
                r0 = 0
                r8.f66494j = r0
                com.ss.android.ugc.aweme.base.model.UrlModel r9 = r9.getThumbnail()
                if (r9 == 0) goto L_0x0090
                java.lang.String r1 = "$this$thumbnailDisplaySize"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r1)
                android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r2 = 1114636288(0x42700000, float:60.0)
                float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r2)
                int r1 = (int) r1
                int r2 = r9.getWidth()
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0062
                int r2 = r9.getHeight()
                if (r2 != 0) goto L_0x003a
                goto L_0x0062
            L_0x003a:
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r5 = 1121320960(0x42d60000, float:107.0)
                float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r5)
                int r2 = (int) r2
                int[] r3 = new int[r3]
                int r5 = r9.getWidth()
                float r5 = (float) r5
                int r6 = r9.getHeight()
                float r6 = (float) r6
                float r5 = r5 / r6
                float r6 = (float) r1
                float r5 = r5 * r6
                int r5 = p2628d.p2643g.C52733a.m112277a(r5)
                int r2 = java.lang.Math.min(r5, r2)
                r3[r0] = r2
                r3[r4] = r1
                goto L_0x0068
            L_0x0062:
                int[] r3 = new int[r3]
                r3[r0] = r1
                r3[r4] = r1
            L_0x0068:
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r8.f66493g
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r8.f66493g
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                if (r2 == 0) goto L_0x007c
                r5 = r3[r0]
                r2.width = r5
                r5 = r3[r4]
                r2.height = r5
                if (r2 != 0) goto L_0x0085
            L_0x007c:
                android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
                r0 = r3[r0]
                r3 = r3[r4]
                r2.<init>(r0, r3)
            L_0x0085:
                r1.setLayoutParams(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f66493g
                r1 = r8
                com.ss.android.ugc.aweme.emoji.utils.j r1 = (com.p683ss.android.ugc.aweme.emoji.utils.C29482j) r1
                com.p683ss.android.ugc.aweme.emoji.utils.C29478h.m69560a(r0, r9, r1)
            L_0x0090:
                com.ss.android.ugc.aweme.comment.adapter.u r9 = r8.f66495k
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f66493g
                android.view.View r0 = (android.view.View) r0
                com.ss.android.ugc.aweme.emoji.f.a r1 = r8.mo51177p()
                int r8 = r8.getAdapterPosition()
                r9.mo51214b(r0, r1, r8)
                d.x r8 = p2628d.C52860x.f131107a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.adapter.SearchGifViewHolder.C25101d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public final void as_() {
        this.f66494j = true;
    }

    public final void at_() {
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        C52671b cVar = new C25100c(this);
        Class<GifEmojiViewModel> cls = GifEmojiViewModel.class;
        C11944b b = mo22666b();
        if (b != null) {
            C11972h a = C11973a.m24361a(mo22542a(), b.mo22685b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo22706a(sb.toString(), cls);
            C11926m a2 = jediViewModel.f31279c.mo22643a(GifEmojiViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo22526a(cVar);
            mo22546a((GifEmojiViewModel) jediViewModel, C11896i.m24255a(), C25101d.f66498a);
            return;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: p */
    public final C29366a mo51177p() {
        int i;
        C29366a aVar = new C29366a();
        UrlModel origin = ((GifEmoji) mo22689o()).getOrigin();
        if (origin == null) {
            origin = new UrlModel();
        }
        aVar.setAnimateUrl(origin);
        UrlModel thumbnail = ((GifEmoji) mo22689o()).getThumbnail();
        if (thumbnail == null) {
            thumbnail = new UrlModel();
        }
        aVar.setStaticUrl(thumbnail);
        aVar.setId(((GifEmoji) mo22689o()).getImageId());
        UrlModel origin2 = ((GifEmoji) mo22689o()).getOrigin();
        int i2 = 0;
        if (origin2 != null) {
            i = origin2.getWidth();
        } else {
            i = 0;
        }
        aVar.setWidth(i);
        UrlModel origin3 = ((GifEmoji) mo22689o()).getOrigin();
        if (origin3 != null) {
            i2 = origin3.getHeight();
        }
        aVar.setHeight(i2);
        aVar.setStickerType(((GifEmoji) mo22689o()).getStickerType());
        aVar.setAnimateType("gif");
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        aVar.setDisplayName(view.getContext().getString(R.string.ax2));
        aVar.setLogPb(((GifEmoji) mo22689o()).getLogPb());
        return aVar;
    }

    public SearchGifViewHolder(ViewGroup viewGroup, C25134u uVar) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(uVar, "gifEmojiActionListener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b1m, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…gif_emoji, parent, false)");
        super(inflate);
        this.f66495k = uVar;
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.ar5);
        remoteImageView.setDrawingCacheEnabled(true);
        remoteImageView.setOnClickListener(new C25098a(this));
        C52711k.m112236a((Object) remoteImageView, "itemView.image.apply {\n …        }\n        }\n    }");
        this.f66493g = remoteImageView;
    }
}
