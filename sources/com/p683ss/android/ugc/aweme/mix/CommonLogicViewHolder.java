package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31214w;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.CommonLogicViewHolder */
public abstract class CommonLogicViewHolder extends JediSimpleViewHolder<Aweme> {

    /* renamed from: f */
    public final DmtTextView f94468f = ((DmtTextView) mo76295a((int) R.id.bmg));

    /* renamed from: g */
    public final int f94469g;

    /* renamed from: j */
    public final int f94470j;

    /* renamed from: k */
    public final View f94471k;

    /* renamed from: l */
    public final C24579d f94472l;

    /* renamed from: m */
    private final RemoteImageView f94473m = ((RemoteImageView) mo76295a((int) R.id.a27));

    /* renamed from: n */
    private final DmtTextView f94474n = ((DmtTextView) mo76295a((int) R.id.bmi));

    /* renamed from: o */
    private final DmtTextView f94475o = ((DmtTextView) mo76295a((int) R.id.bmk));

    /* renamed from: com.ss.android.ugc.aweme.mix.CommonLogicViewHolder$a */
    static final class C36986a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonLogicViewHolder f94476a;

        /* renamed from: b */
        final /* synthetic */ Aweme f94477b;

        C36986a(CommonLogicViewHolder commonLogicViewHolder, Aweme aweme) {
            this.f94476a = commonLogicViewHolder;
            this.f94477b = aweme;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(this.f94476a.f94471k)) {
                this.f94476a.f94472l.mo50347a(this.f94476a.f94471k, this.f94477b, null);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo76296a(DmtTextView dmtTextView);

    /* renamed from: a */
    public abstract void mo76297a(Aweme aweme);

    /* renamed from: b */
    public abstract void mo76298b(DmtTextView dmtTextView);

    /* renamed from: p */
    public void mo76300p() {
        mo76296a(this.f94468f);
    }

    /* renamed from: a */
    public final <T extends View> T mo76295a(int i) {
        T findViewById = this.f94471k.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new C52857u("null cannot be cast to non-null type T");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22662a(Aweme aweme) {
        long j;
        C52711k.m112240b(aweme, "item");
        this.f94471k.setOnClickListener(new C36986a(this, aweme));
        RemoteImageView remoteImageView = this.f94473m;
        Video video = aweme.getVideo();
        C52711k.m112236a((Object) video, "item.video");
        C23515d.m57669a(remoteImageView, video.getCover());
        DmtTextView dmtTextView = this.f94474n;
        Video video2 = aweme.getVideo();
        C52711k.m112236a((Object) video2, "item.video");
        long duration = (long) video2.getDuration();
        int i = 0;
        String a = C2240a.m6772a("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)))}, 2));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        dmtTextView.setText(a);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        this.f94475o.setText(C33095b.m76068a(j));
        DmtTextView dmtTextView2 = this.f94468f;
        C52711k.m112240b(dmtTextView2, "descView");
        C52711k.m112240b(aweme, "item");
        dmtTextView2.setText(aweme.getDesc());
        C31214w.m72897a(this.f94471k.getContext(), aweme, dmtTextView2);
        MixStruct mixInfo = aweme.getMixInfo();
        if (mixInfo != null) {
            MixStatusStruct mixStatusStruct = mixInfo.status;
            if (mixStatusStruct != null) {
                i = mixStatusStruct.getViewedInMix();
            }
        }
        if (i != 0) {
            mo76298b(this.f94468f);
        } else {
            mo76296a(this.f94468f);
        }
    }

    public CommonLogicViewHolder(View view, C24579d dVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(dVar, "onItemClickListener");
        super(view);
        this.f94471k = view;
        this.f94472l = dVar;
        Context context = this.f94471k.getContext();
        C52711k.m112236a((Object) context, "view.context");
        this.f94469g = context.getResources().getColor(R.color.asw);
        Context context2 = this.f94471k.getContext();
        C52711k.m112236a((Object) context2, "view.context");
        this.f94470j = context2.getResources().getColor(R.color.at1);
    }
}
