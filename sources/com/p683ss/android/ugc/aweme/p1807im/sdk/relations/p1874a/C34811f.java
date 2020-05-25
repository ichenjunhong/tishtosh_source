package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a.C34795b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34801c.C34803b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f */
public final class C34811f extends C34801c {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.f$a */
    public class C34812a extends C34795b {

        /* renamed from: f */
        public AvatarImageView f89690f;

        /* renamed from: g */
        public RemoteImageView f89691g;

        /* renamed from: i */
        private TextView f89693i;

        /* renamed from: j */
        private TextView f89694j;

        /* renamed from: k */
        private TextView f89695k;

        /* renamed from: l */
        private TextView f89696l;

        /* renamed from: m */
        private TextView f89697m;

        /* renamed from: n */
        private ImageView f89698n;

        /* renamed from: o */
        private ImageView f89699o;

        /* renamed from: p */
        private ImageView f89700p;

        /* renamed from: q */
        private View f89701q;

        /* renamed from: r */
        private LinearLayout f89702r;

        /* renamed from: b */
        public final void mo70628b() {
            this.f89701q = this.itemView.findViewById(R.id.bas);
            this.f89702r = (LinearLayout) this.itemView.findViewById(R.id.d1b);
            this.f89695k = (TextView) this.itemView.findViewById(R.id.d1l);
            this.f89699o = (ImageView) this.itemView.findViewById(R.id.atf);
            this.f89697m = (TextView) this.itemView.findViewById(R.id.ath);
            this.f89690f = (AvatarImageView) this.itemView.findViewById(R.id.i0);
            this.f89698n = (ImageView) this.itemView.findViewById(R.id.doe);
            this.f89693i = (TextView) this.itemView.findViewById(R.id.bpu);
            this.f89694j = (TextView) this.itemView.findViewById(R.id.cxk);
            this.f89696l = (TextView) this.itemView.findViewById(R.id.a51);
            this.f89691g = (RemoteImageView) this.itemView.findViewById(R.id.so);
            this.f89700p = (ImageView) this.itemView.findViewById(R.id.ai7);
        }

        public C34812a(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo70627a(IMContact iMContact, int i) {
            if (iMContact.getType() != -1) {
                if (C34811f.this.f89642k != null) {
                    this.itemView.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C34811f.this.f89642k.mo72924a(C34812a.this.itemView, C34812a.this.getAdapterPosition());
                        }
                    });
                    this.f89690f.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C34811f.this.f89642k.mo72924a(C34812a.this.f89690f, C34812a.this.getAdapterPosition());
                        }
                    });
                    this.f89691g.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C34811f.this.f89642k.mo72924a(C34812a.this.f89691g, C34812a.this.getAdapterPosition());
                        }
                    });
                }
                this.f89699o.setVisibility(8);
                if (iMContact.getType() == 6 || iMContact.getType() == 5) {
                    if (iMContact.getType() != 5 || !TextUtils.isEmpty(C34811f.this.f89636e)) {
                        this.f89702r.setVisibility(8);
                        this.f89701q.setVisibility(8);
                    } else {
                        this.f89702r.setVisibility(0);
                        this.f89695k.setText(R.string.bla);
                        this.f89699o.setVisibility(0);
                        this.f89701q.setVisibility(8);
                    }
                    this.f89697m.setVisibility(8);
                } else if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                    if (iMContact.getType() != 3 || !TextUtils.isEmpty(C34811f.this.f89636e)) {
                        this.f89702r.setVisibility(8);
                        this.f89701q.setVisibility(8);
                    } else {
                        this.f89702r.setVisibility(0);
                        this.f89695k.setText(R.string.bl_);
                        this.f89699o.setVisibility(8);
                        this.f89701q.setVisibility(0);
                    }
                    if (C34811f.this.f89632a != 1) {
                        C34803b c = C34811f.this.mo72934c(i);
                        if (c != null) {
                            if (!TextUtils.isEmpty(c.f89671d)) {
                                this.f89697m.setText(c.f89671d);
                                this.f89697m.setVisibility(0);
                            } else {
                                this.f89697m.setVisibility(8);
                            }
                        }
                    } else {
                        this.f89697m.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.f89695k.setText("");
                    this.f89699o.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    C23515d.m57668a((RemoteImageView) this.f89690f, 2131953301);
                } else {
                    C23515d.m57669a((RemoteImageView) this.f89690f, displayAvatar);
                }
                this.f89691g.setVisibility(8);
                IMUser a = C34010e.m77749a(iMContact);
                if (a != null) {
                    C47916gh.m103675a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f89693i);
                } else {
                    C47916gh.m103675a(this.itemView.getContext(), "", "", this.f89693i);
                }
                if (a != null) {
                    C34811f.this.mo72910a(this.f89693i, a, C34811f.this.f89636e);
                    C34811f.this.mo72917b(this.f89696l, a, C34811f.this.f89636e);
                    if (a.getFollowStatus() == 2) {
                        this.f89700p.setVisibility(0);
                    } else {
                        this.f89700p.setVisibility(8);
                    }
                    int a2 = C34169a.m77980a().mo72157a(a.getUid());
                    if (a2 > 1) {
                        this.f89694j.setText(C11010c.m22280a().getString(R.string.bp5, new Object[]{C34169a.m77981a(a2)}));
                        this.f89694j.setVisibility(0);
                    } else if (a2 == 1) {
                        this.f89694j.setText(C11010c.m22280a().getString(R.string.bp6));
                        this.f89694j.setVisibility(0);
                    } else {
                        this.f89694j.setVisibility(8);
                    }
                    C35178a.m79422a((ImageView) this.f89690f, a);
                    C35190af.m79442a();
                    C35190af.m79509f(a.getUid(), "contact");
                } else {
                    this.f89694j.setVisibility(8);
                    this.f89696l.setVisibility(8);
                    this.f89700p.setVisibility(8);
                    if (TextUtils.isEmpty(C34811f.this.f89636e)) {
                        this.f89693i.setText(iMContact.getDisplayName());
                    } else {
                        C34811f.m78827a(this.f89693i, iMContact.getDisplayName(), C34811f.this.f89636e, 0);
                    }
                }
                C47916gh.m103675a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f89693i);
                this.f89691g.setTag(83886080, iMContact);
                this.itemView.setTag(83886080, iMContact);
                this.f89690f.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.f89691g.setTag(50331648, Integer.valueOf(100663296));
                this.f89690f.setTag(50331648, Integer.valueOf(50331649));
            }
        }
    }

    /* renamed from: a */
    public final C34795b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1 && this.f89638g != null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.bf4;
        } else {
            i2 = R.layout.bf6;
        }
        return new C34812a(from.inflate(i2, viewGroup, false));
    }
}
