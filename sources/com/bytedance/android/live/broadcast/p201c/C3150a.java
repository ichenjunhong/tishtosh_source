package com.bytedance.android.live.broadcast.p201c;

import android.app.Dialog;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C3991a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4004ae;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.c.a */
public class C3150a extends C0649f {

    /* renamed from: a */
    public OnDismissListener f9174a;

    /* renamed from: b */
    public C3153b f9175b;

    /* renamed from: c */
    public Game f9176c;

    /* renamed from: d */
    public C3154c f9177d;

    /* renamed from: e */
    private CircularProgressView f9178e;

    /* renamed from: f */
    private RecyclerView f9179f;

    /* renamed from: com.bytedance.android.live.broadcast.c.a$a */
    static class C3152a extends C1352v {

        /* renamed from: a */
        public final View f9182a;

        /* renamed from: b */
        public ImageView f9183b;

        /* renamed from: c */
        public TextView f9184c;

        private C3152a(View view) {
            super(view);
            this.f9183b = (ImageView) view.findViewById(R.id.aqx);
            this.f9184c = (TextView) view.findViewById(R.id.bpv);
            this.f9182a = view.findViewById(R.id.li);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c.a$b */
    public static class C3153b extends C1322a<C3152a> {

        /* renamed from: a */
        final List<Game> f9185a;

        /* renamed from: b */
        public C3154c f9186b;

        /* renamed from: c */
        Game f9187c;

        private C3153b() {
            this.f9185a = new ArrayList();
        }

        public final int getItemCount() {
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                return this.f9185a.size() + 1;
            }
            return this.f9185a.size();
        }

        public final long getItemId(int i) {
            return ((Game) this.f9185a.get(i)).gameId;
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                i2 = R.layout.alv;
            } else {
                i2 = R.layout.alu;
            }
            return new C3152a(from.inflate(i2, viewGroup, false));
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C3152a aVar = (C3152a) vVar;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1 && i == 0) {
                aVar.f9183b.setImageResource(R.drawable.bzp);
                aVar.f9184c.setText(R.string.f1w);
                if (this.f9187c == null) {
                    aVar.f9182a.setVisibility(0);
                    aVar.f9184c.setTextColor(C3922z.m9909b((int) R.color.al4));
                } else {
                    aVar.f9182a.setVisibility(4);
                    aVar.f9184c.setTextColor(C3922z.m9909b((int) R.color.alt));
                }
                aVar.itemView.setOnClickListener(new C3158e(this));
                return;
            }
            Game game = (Game) this.f9185a.get(i - ((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue());
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                C5213c.m11818a(aVar.f9183b, game.icon, aVar.f9183b.getWidth(), aVar.f9183b.getHeight(), 0);
            } else {
                C5213c.m11826b(aVar.f9183b, game.icon, aVar.f9183b.getWidth(), aVar.f9183b.getHeight(), 0);
            }
            aVar.f9184c.setText(game.name);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                if (this.f9187c == null || game.gameId != this.f9187c.gameId) {
                    aVar.f9182a.setVisibility(4);
                    aVar.f9184c.setTextColor(C3922z.m9909b((int) R.color.alt));
                } else {
                    aVar.f9182a.setVisibility(0);
                    aVar.f9184c.setTextColor(C3922z.m9909b((int) R.color.al4));
                }
            }
            aVar.itemView.setOnClickListener(new C3159f(this, game));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c.a$c */
    public interface C3154c {
        /* renamed from: a */
        void mo8492a(Game game);
    }

    public void onDestroyView() {
        mo8491a();
        super.onDestroyView();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8491a() {
        if (this.f9178e.getVisibility() == 0) {
            this.f9178e.mo26997c();
            this.f9178e.setVisibility(8);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f9174a != null) {
            this.f9174a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            i = R.style.yl;
        } else {
            i = R.style.zk;
        }
        setStyle(1, i);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f9178e = (CircularProgressView) view.findViewById(R.id.c6f);
        this.f9179f = (RecyclerView) view.findViewById(R.id.caf);
        this.f9179f.setLayoutManager(new GridLayoutManager(getContext(), 4, 1, false));
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 0) {
            this.f9179f.mo4798a((C1331h) new C1331h() {

                /* renamed from: a */
                final int f9180a = C3150a.this.getResources().getDimensionPixelSize(R.dimen.rr);

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                    if (RecyclerView.m4275f(view) < 4) {
                        rect.set(0, this.f9180a, 0, this.f9180a);
                    } else {
                        rect.set(0, 0, 0, this.f9180a);
                    }
                }
            });
        }
        this.f9175b = new C3153b();
        this.f9175b.f9186b = this.f9177d;
        C3153b bVar = this.f9175b;
        bVar.f9187c = this.f9176c;
        bVar.notifyDataSetChanged();
        this.f9179f.setAdapter(this.f9175b);
        if (this.f9178e.getVisibility() != 0) {
            this.f9178e.setVisibility(0);
        }
        this.f9178e.mo26995a();
        ((C4002ac) C3395f.m9156f().mo8742c().mo9020c().getLiveGameList(((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6543e((C1710e<? super C1690c>) new C3155b<Object>(this)).mo6525a((C2203w<T, ? extends R>) C4021e.m10141a((C4004ae) C3991a.m10107a((C0184k) this, C0177a.ON_DESTROY)))).mo9406a(new C3156c(this), new C3157d(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo9431a()).intValue() == 1) {
            i = R.layout.ajd;
        } else {
            i = R.layout.ajc;
        }
        return (ViewGroup) from.inflate(i, null);
    }
}
