package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a */
public abstract class C29317a<T> extends C26840g<T> {

    /* renamed from: a */
    public final int f76717a = 7;

    /* renamed from: b */
    public final int f76718b = 4;

    /* renamed from: c */
    public final int f76719c = 3;

    /* renamed from: d */
    public final Context f76720d;

    /* renamed from: e */
    public C29361p f76721e;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$a */
    public final class C29318a extends C1352v {

        /* renamed from: a */
        public final RemoteImageView f76722a;

        /* renamed from: b */
        public final TextView f76723b;

        /* renamed from: c */
        final /* synthetic */ C29317a f76724c;

        public C29318a(C29317a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f76724c = aVar;
            super(view);
            this.f76722a = (RemoteImageView) view.findViewById(R.id.a_s);
            this.f76723b = (TextView) view.findViewById(R.id.d1l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$b */
    static final class C29319b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29317a f76725a;

        /* renamed from: b */
        final /* synthetic */ int f76726b;

        C29319b(C29317a aVar, int i) {
            this.f76725a = aVar;
            this.f76726b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Object obj = this.f76725a.mo50673a().get(this.f76726b);
            if (obj != null) {
                C29285a aVar = (C29285a) obj;
                if (aVar.f76665a == R.drawable.xz) {
                    this.f76725a.mo59263g().mo59293b();
                } else if (aVar.f76665a == R.drawable.y7) {
                    this.f76725a.mo59263g().mo59294c();
                } else if (aVar.f76665a == R.drawable.y2) {
                    this.f76725a.mo59263g().mo59290a();
                } else if (aVar.mo59210a()) {
                    View findViewById = view.findViewById(R.id.a_s);
                    C29361p g = this.f76725a.mo59263g();
                    C52711k.m112236a((Object) findViewById, "image");
                    g.mo59291a(findViewById, aVar, 1);
                } else {
                    if (!TextUtils.isEmpty(aVar.f76667c)) {
                        C29361p g2 = this.f76725a.mo59263g();
                        String str = aVar.f76667c;
                        C52711k.m112236a((Object) str, "emoji.text");
                        g2.mo59292a(str);
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.base.BaseEmoji");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo59260a(RecyclerView recyclerView);

    /* renamed from: a */
    public abstract void mo59261a(C29318a aVar, int i);

    /* renamed from: j */
    public abstract int mo59264j();

    /* renamed from: g */
    public final C29361p mo59263g() {
        C29361p pVar = this.f76721e;
        if (pVar == null) {
            C52711k.m112237a("inputViewBridge");
        }
        return pVar;
    }

    public int getItemCount() {
        if (this.f70699x) {
            return mo48636c() + 1;
        }
        return mo48636c();
    }

    /* renamed from: a */
    public final void mo59262a(C29361p pVar) {
        C52711k.m112240b(pVar, "<set-?>");
        this.f76721e = pVar;
    }

    public C29317a(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        this.f76720d = (Context) kVar;
        this.f70699x = false;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f76720d).inflate(mo59264j(), viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C29318a(this, inflate);
    }

    /* renamed from: a */
    public static void m69123a(RemoteImageView remoteImageView, C29285a aVar) {
        C52711k.m112240b(remoteImageView, "mEmojiIv");
        C52711k.m112240b(aVar, "emoji");
        C29366a aVar2 = aVar.f76668d;
        C52711k.m112236a((Object) aVar2, "detailEmoji");
        if (C29298a.m69090d(aVar2)) {
            C29478h.m69558a(remoteImageView, aVar2.getStaticUrl());
        } else {
            C23515d.m57669a(remoteImageView, aVar2.getStaticUrl());
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        mo59261a((C29318a) vVar, i);
        if (vVar != null) {
            View view = vVar.itemView;
            if (view != null) {
                view.setOnClickListener(new C29319b(this, i));
            }
        }
    }

    /* renamed from: a */
    public static void m69122a(RemoteImageView remoteImageView, Context context, int i) {
        C52711k.m112240b(remoteImageView, "mEmojiIv");
        C52711k.m112240b(context, "context");
        StringBuilder sb = new StringBuilder("res://");
        sb.append(context.getPackageName());
        sb.append("/");
        sb.append(i);
        C23515d.m57677a(remoteImageView, sb.toString());
    }

    /* renamed from: a */
    public static void m69124a(RemoteImageView remoteImageView, String str, boolean z) {
        C52711k.m112240b(remoteImageView, "mEmojiIv");
        C52711k.m112240b(str, "localPath");
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        String sb2 = sb.toString();
        if (z) {
            C29478h.m69562a(remoteImageView, sb2);
        } else {
            C23515d.m57677a(remoteImageView, sb2);
        }
    }

    /* renamed from: a */
    public final int mo59259a(int i, int i2, int i3) {
        double a = (double) C9432q.m18670a(this.f76720d);
        double d = (double) i2;
        Double.isNaN(d);
        double d2 = d * 2.0d;
        Double.isNaN(a);
        double d3 = (a - d2) * 1.0d;
        double d4 = (double) i3;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        double d6 = (double) i;
        Double.isNaN(d6);
        return (int) (d5 - d6);
    }
}
