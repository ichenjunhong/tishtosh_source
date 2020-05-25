package com.p683ss.android.ugc.aweme.tools.draft;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p963c.C13948g;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45554a;
import com.p683ss.android.ugc.aweme.shortvideo.p2261w.C45556c;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45633h;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.tools.draft.DraftItemView.C46952a;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46979c;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder */
public class AwemeDraftViewHolder extends C26838e<C29059c> implements C0183j, C9382a {

    /* renamed from: a */
    ExpandableMentionTextView f118608a;

    /* renamed from: b */
    ViewGroup f118609b;

    /* renamed from: c */
    public SimpleDraweeView f118610c;

    /* renamed from: d */
    AppCompatCheckBox f118611d;

    /* renamed from: e */
    public boolean f118612e;

    /* renamed from: f */
    public boolean f118613f;

    /* renamed from: g */
    C46951a f118614g;

    /* renamed from: h */
    long f118615h;

    /* renamed from: i */
    Map<ImageView, C13715a<C14042c>> f118616i;

    /* renamed from: j */
    private TextView f118617j;

    /* renamed from: o */
    private TextView f118618o;

    /* renamed from: p */
    private ImageView f118619p;

    /* renamed from: q */
    private View f118620q;

    /* renamed from: r */
    private ImageView f118621r;

    /* renamed from: s */
    private DraftItemView f118622s;

    /* renamed from: t */
    private Space f118623t;

    /* renamed from: u */
    private Space f118624u;

    /* renamed from: v */
    private RelativeLayout f118625v;

    /* renamed from: w */
    private Context f118626w;

    /* renamed from: x */
    private C45546c f118627x;

    /* renamed from: y */
    private C48554c f118628y = new C48554c();

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$a */
    public interface C46951a {
        /* renamed from: a */
        void mo94251a(int i, C29059c cVar);

        /* renamed from: a */
        void mo94252a(View view, C29059c cVar);
    }

    /* renamed from: c */
    public final void mo50308c() {
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C48554c cVar = this.f118628y;
        if (cVar.f122009a != null) {
            cVar.f122009a.f122022a = null;
        }
    }

    private void dismiss(C45547d dVar) {
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void handleMsg(Message message) {
        this.f118626w.startActivity((Intent) message.obj);
        if (this.f118627x != null && this.f118627x.isShowing()) {
            this.f118627x.dismiss();
            this.f118627x = null;
        }
    }

    /* renamed from: a */
    public final void mo54774a(final C29059c cVar, int i) {
        if (cVar != null && cVar.f76144b != null) {
            this.f70665k = cVar;
            if (this.f118612e) {
                this.f118622s.mo94255a();
                this.f118621r.animate().alpha(0.0f).setDuration(200).start();
            } else {
                this.f118622s.mo94256b();
                this.f118621r.animate().alpha(1.0f).setDuration(200).start();
                ((C29059c) this.f70665k).f76165w = false;
            }
            if (this.f118613f) {
                this.f118617j.setText(C46979c.m102029a(cVar));
            }
            this.f118611d.setOnCheckedChangeListener(null);
            this.f118611d.setChecked(((C29059c) this.f70665k).f76165w);
            this.f118611d.setOnCheckedChangeListener(new C46999i(this));
            this.f118610c.setTag(cVar.mo58774ak());
            this.f118610c.setImageResource(R.drawable.adg);
            C29061d.m68496a((C29059c) this.f70665k, (OnVideoCoverCallback) new OnVideoCoverCallback() {
                public final void onGetVideoCoverFailed(int i) {
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (!bitmap.isRecycled() && AwemeDraftViewHolder.this.f118610c != null && AwemeDraftViewHolder.this.f118610c.getTag().equals(cVar.mo58774ak())) {
                        SimpleDraweeView simpleDraweeView = AwemeDraftViewHolder.this.f118610c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            simpleDraweeView.setImageBitmap(bitmap);
                        }
                        C13715a a = C13715a.m27746a(new C14043d(bitmap, (C13718c<Bitmap>) C13948g.m28419a(), C14046g.f36711a, 0));
                        String ak = ((C29059c) AwemeDraftViewHolder.this.f70665k).mo58774ak();
                        StringBuilder sb = new StringBuilder("file://");
                        sb.append(ak);
                        C13771c.m27874b().mo26209c().mo26160a(C13978j.m28504a().mo26145a(C14229b.fromUri(sb.toString()), null), a);
                        AwemeDraftViewHolder awemeDraftViewHolder = AwemeDraftViewHolder.this;
                        C13715a aVar = (C13715a) awemeDraftViewHolder.f118616i.put(AwemeDraftViewHolder.this.f118610c, a.clone());
                        if (aVar != null) {
                            C13715a.m27752c(aVar);
                        }
                    }
                }
            });
            if (!C39629l.m88232a().mo58593x().mo74280a()) {
                this.f118608a.setSpanColor(this.f118626w.getResources().getColor(R.color.a0y));
            } else {
                this.f118608a.setSpanColor(this.f118626w.getResources().getColor(R.color.a17));
            }
            String str = cVar.f76144b.f76028a;
            if (C9431p.m18664a(str)) {
                this.f118608a.setText(this.f118626w.getText(R.string.au1));
                this.f118608a.setTextColor(this.f118626w.getResources().getColor(R.color.a1a));
            } else {
                this.f118608a.setText(str);
                if (cVar.f76144b.f76029b != null) {
                    this.f118608a.mo95551a((List<TextExtraStruct>) C45633h.m99372a(cVar.f76144b.f76029b), (C48160d) new C45549f(true));
                    for (AVTextExtraStruct aVTextExtraStruct : cVar.f76144b.f76029b) {
                        if (aVTextExtraStruct.getType() == 0) {
                            if (aVTextExtraStruct.getSubType() == 1) {
                                this.f118608a.mo95550a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), new C45554a(this.f118608a.getContext(), this.f118608a));
                            }
                            if (aVTextExtraStruct.getSubType() == 2) {
                                C45556c cVar2 = new C45556c(this.f118608a.getContext(), this.f118608a);
                                cVar2.f115117b = BitmapFactory.decodeResource(this.f118608a.getContext().getResources(), R.drawable.dy5);
                                this.f118608a.mo95550a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar2);
                            }
                        }
                    }
                }
                this.f118608a.setTextColor(this.f118626w.getResources().getColor(R.color.a17));
            }
            List<AVChallenge> list = cVar.f76144b.f76030c;
            StringBuilder sb = new StringBuilder();
            if (list != null && list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AVChallenge aVChallenge = (AVChallenge) it.next();
                    if (aVChallenge.getChallengeName() == null) {
                        sb = new StringBuilder();
                        break;
                    } else {
                        sb.append(aVChallenge.getChallengeName());
                        sb.append(" ");
                    }
                }
            }
            String sb2 = sb.toString();
            if (C9431p.m18664a(sb2)) {
                this.f118618o.setText(R.string.atw);
                this.f118619p.setImageResource(R.drawable.a3o);
                this.f118618o.setTextColor(this.f118626w.getResources().getColor(R.color.a1t));
            } else {
                this.f118618o.setText(sb2);
                this.f118618o.setTextColor(this.f118626w.getResources().getColor(R.color.a1o));
                this.f118619p.setImageResource(R.drawable.a3n);
            }
            this.f118618o.setVisibility(8);
            this.f118619p.setVisibility(8);
            LayoutParams layoutParams = this.f118624u.getLayoutParams();
            LayoutParams layoutParams2 = this.f118625v.getLayoutParams();
            int b = (int) C9432q.m18687b(this.f118626w, 16.0f);
            int b2 = (int) C9432q.m18687b(this.f118626w, 96.0f);
            if (!cVar.f76166x) {
                this.f118620q.setVisibility(4);
                layoutParams.height = 0;
                layoutParams2.height = b2 - b;
            } else {
                this.f118620q.setVisibility(0);
                layoutParams.height = b;
                layoutParams2.height = b2;
            }
            this.f118624u.setLayoutParams(layoutParams);
            this.f118625v.setLayoutParams(layoutParams2);
        }
    }

    AwemeDraftViewHolder(View view, Map<ImageView, C13715a<C14042c>> map, C46951a aVar) {
        super(view);
        this.f118608a = (ExpandableMentionTextView) C1056u.m3051d(view, R.id.ie);
        this.f118609b = (ViewGroup) C1056u.m3051d(view, R.id.ekf);
        this.f118617j = (TextView) C1056u.m3051d(view, R.id.f26);
        this.f118618o = (TextView) C1056u.m3051d(view, R.id.ib);
        this.f118619p = (ImageView) C1056u.m3051d(view, R.id.s0);
        this.f118610c = (SimpleDraweeView) C1056u.m3051d(view, R.id.a22);
        this.f118620q = C1056u.m3051d(view, R.id.d8l);
        this.f118621r = (ImageView) C1056u.m3051d(view, R.id.a8l);
        this.f118611d = (AppCompatCheckBox) C1056u.m3051d(view, R.id.sx);
        this.f118622s = (DraftItemView) C1056u.m3051d(view, R.id.bez);
        this.f118622s.setOnScrollListener(new C46952a() {
            /* renamed from: a */
            public final void mo94250a(int i, boolean z) {
                int i2;
                int i3;
                AwemeDraftViewHolder awemeDraftViewHolder = AwemeDraftViewHolder.this;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) awemeDraftViewHolder.f118609b.getLayoutParams();
                int i4 = 1;
                if (C47918gj.m103682a(awemeDraftViewHolder.f118608a.getContext())) {
                    int i5 = marginLayoutParams.leftMargin;
                    if (z) {
                        i4 = -1;
                    }
                    i3 = i5 + (i * i4);
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    i3 = marginLayoutParams.leftMargin;
                    int i6 = marginLayoutParams.rightMargin;
                    if (!z) {
                        i4 = -1;
                    }
                    i2 = (i * i4) + i6;
                }
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i2;
                awemeDraftViewHolder.f118609b.setLayoutParams(marginLayoutParams);
            }
        });
        this.f118623t = (Space) C1056u.m3051d(view, R.id.a8k);
        this.f118624u = (Space) C1056u.m3051d(view, R.id.a8j);
        this.f118625v = (RelativeLayout) C1056u.m3051d(view, R.id.a8h);
        this.f118625v.setOnClickListener(new C46997g(this));
        this.f118625v.setOnLongClickListener(new C46998h(this));
        this.f118614g = aVar;
        this.f118626w = view.getContext();
        ((FragmentActivity) this.f118626w).getLifecycle().mo324a(this);
        this.f118616i = map;
    }
}
