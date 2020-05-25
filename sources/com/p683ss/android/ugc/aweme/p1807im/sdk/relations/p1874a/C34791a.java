package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34847d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a */
public abstract class C34791a extends C1322a<C34795b> {

    /* renamed from: a */
    protected int f89632a;

    /* renamed from: b */
    public boolean f89633b = false;

    /* renamed from: c */
    protected List<IMContact> f89634c = new ArrayList();

    /* renamed from: d */
    public boolean f89635d;

    /* renamed from: e */
    protected String f89636e;

    /* renamed from: f */
    public LinkedHashSet<IMContact> f89637f = new LinkedHashSet<>();

    /* renamed from: g */
    protected View f89638g;

    /* renamed from: h */
    protected RecyclerView f89639h;

    /* renamed from: i */
    public LinearLayoutManager f89640i;

    /* renamed from: j */
    public Runnable f89641j;

    /* renamed from: k */
    public C34794a f89642k;

    /* renamed from: l */
    protected C1340m f89643l;

    /* renamed from: m */
    private AnimatorListener f89644m = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            C34791a.this.notifyDataSetChanged();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$a */
    public interface C34794a {
        /* renamed from: a */
        void mo72924a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a$b */
    public class C34795b extends C33298c<IMContact> {

        /* renamed from: b */
        protected ImageView f89647b;

        /* renamed from: c */
        protected int f89648c = Math.round(C9432q.m18687b(C11010c.m22280a(), 16.0f));

        /* renamed from: d */
        protected int f89649d;

        /* renamed from: f */
        private AvatarImageView f89651f;

        /* renamed from: g */
        private TextView f89652g;

        /* renamed from: h */
        private TextView f89653h;

        /* renamed from: i */
        private TextView f89654i;

        /* renamed from: j */
        private ImageView f89655j;

        /* renamed from: k */
        private ImageView f89656k;

        /* renamed from: l */
        private View f89657l;

        /* renamed from: c */
        public final void mo70629c() {
        }

        /* renamed from: a */
        public final void mo70625a() {
            super.mo70625a();
            this.itemView.setBackground(C10678c.m21505e(this.itemView.getContext()));
        }

        /* renamed from: e */
        public final Animator mo72926e() {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f89649d, this.f89648c});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C34795b.this.f89647b != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) C34795b.this.f89647b.getLayoutParams();
                        marginLayoutParams.setMargins(((Integer) valueAnimator.getAnimatedValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        C34795b.this.f89647b.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        /* renamed from: f */
        public final Animator mo72927f() {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f89648c, this.f89649d});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C34795b.this.f89647b != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) C34795b.this.f89647b.getLayoutParams();
                        marginLayoutParams.setMargins(((Integer) valueAnimator.getAnimatedValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        C34795b.this.f89647b.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        /* renamed from: b */
        public void mo70628b() {
            super.mo70628b();
            this.f89657l = this.itemView.findViewById(R.id.bas);
            this.f89651f = (AvatarImageView) this.itemView.findViewById(R.id.i0);
            this.f89647b = (ImageView) this.itemView.findViewById(R.id.sy);
            this.f89652g = (TextView) this.itemView.findViewById(R.id.bpu);
            this.f89653h = (TextView) this.itemView.findViewById(R.id.a51);
            this.f89655j = (ImageView) this.itemView.findViewById(R.id.ai7);
            this.f89654i = (TextView) this.itemView.findViewById(R.id.d1l);
            this.f89656k = (ImageView) this.itemView.findViewById(R.id.doe);
        }

        public C34795b(View view) {
            int i;
            super(view);
            view.setTag(this);
            if (C35279p.m79763a()) {
                i = -32;
            } else {
                i = -18;
            }
            this.f89649d = ((int) C9432q.m18687b(C11010c.m22280a(), (float) i)) - 1;
        }

        /* renamed from: a */
        public void mo70627a(IMContact iMContact, int i) {
            int i2;
            super.mo70626a(iMContact);
            if (iMContact.getType() != -1) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f89647b.getLayoutParams();
                if (C34791a.this.f89635d) {
                    if (C34791a.this.f89637f.contains(iMContact)) {
                        this.f89647b.setSelected(true);
                    } else {
                        this.f89647b.setSelected(false);
                    }
                    if (VERSION.SDK_INT > 16) {
                        if (marginLayoutParams.getMarginStart() != this.f89648c) {
                            marginLayoutParams.setMargins(this.f89648c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            marginLayoutParams.setMarginStart(this.f89648c);
                            this.f89647b.setLayoutParams(marginLayoutParams);
                        }
                    } else if (marginLayoutParams.leftMargin != this.f89648c) {
                        marginLayoutParams.setMargins(this.f89648c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        this.f89647b.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    this.f89647b.setSelected(false);
                    if (VERSION.SDK_INT > 16) {
                        if (marginLayoutParams.getMarginStart() != this.f89649d) {
                            marginLayoutParams.setMargins(this.f89649d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            marginLayoutParams.setMarginStart(this.f89649d);
                            this.f89647b.setLayoutParams(marginLayoutParams);
                        }
                    } else if (marginLayoutParams.leftMargin != this.f89649d) {
                        marginLayoutParams.setMargins(this.f89649d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        this.f89647b.setLayoutParams(marginLayoutParams);
                    }
                }
                if (iMContact.getType() == 2) {
                    this.f89654i.setText(R.string.bme);
                    this.f89654i.setVisibility(0);
                    this.f89657l.setVisibility(8);
                } else if (iMContact.getType() == 3) {
                    View view = this.f89657l;
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    this.f89654i.setText(R.string.bl5);
                    this.f89654i.setVisibility(0);
                } else {
                    this.f89654i.setVisibility(8);
                    this.f89657l.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    C23515d.m57668a((RemoteImageView) this.f89651f, 2131953301);
                } else {
                    C23515d.m57669a((RemoteImageView) this.f89651f, displayAvatar);
                }
                IMUser a = C34010e.m77749a(iMContact);
                if (a != null) {
                    C47916gh.m103675a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f89652g);
                } else {
                    C47916gh.m103675a(this.itemView.getContext(), "", "", this.f89652g);
                }
                if (a != null) {
                    C34791a.this.mo72910a(this.f89652g, a, C34791a.this.f89636e);
                    if (!TextUtils.isEmpty(C34791a.this.mo72908a(iMContact)) && !TextUtils.isEmpty(C34791a.this.f89636e)) {
                        C34791a.this.mo72917b(this.f89653h, a, C34791a.this.f89636e);
                    } else if (TextUtils.isEmpty(C34791a.this.mo72908a(iMContact))) {
                        this.f89653h.setVisibility(8);
                    } else {
                        this.f89653h.setVisibility(0);
                        this.f89653h.setText(C34791a.this.mo72908a(iMContact));
                    }
                    if (C35265e.m79728a(a) || a.getFollowStatus() != 2) {
                        this.f89655j.setVisibility(8);
                    } else {
                        this.f89655j.setVisibility(0);
                    }
                    C35190af.m79442a();
                    C35190af.m79509f(a.getUid(), "contact");
                } else {
                    this.f89653h.setVisibility(8);
                    this.f89655j.setVisibility(8);
                    if (TextUtils.isEmpty(C34791a.this.f89636e)) {
                        this.f89652g.setText(iMContact.getDisplayName());
                    } else {
                        C34791a.m78827a(this.f89652g, iMContact.getDisplayName(), C34791a.this.f89636e, 0);
                    }
                }
                if (C34791a.this.f89642k != null) {
                    this.itemView.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C34791a.this.f89642k.mo72924a(C34795b.this.itemView, C34795b.this.getAdapterPosition());
                        }
                    });
                }
                this.f89651f.setTag(50331648, Integer.valueOf(50331649));
                this.f89651f.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.itemView.setTag(83886080, iMContact);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo72908a(IMContact iMContact);

    /* renamed from: b */
    public final int mo72916b() {
        return this.f89637f.size();
    }

    /* renamed from: c */
    public final int mo72919c() {
        if (this.f89638g != null) {
            return 1;
        }
        return 0;
    }

    public int getItemCount() {
        if (this.f89634c == null || this.f89634c.isEmpty()) {
            return 0;
        }
        return this.f89634c.size();
    }

    /* renamed from: d */
    private void m78828d() {
        AnimatorSet animatorSet = new AnimatorSet();
        Builder builder = null;
        for (int i = 0; i < this.f89640i.mo5062s(); i++) {
            View g = this.f89640i.mo5050g(i);
            if (g != null) {
                C34795b bVar = (C34795b) g.getTag();
                if (builder == null) {
                    builder = animatorSet.play(bVar.mo72926e());
                } else {
                    builder.with(bVar.mo72926e());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f89644m);
        animatorSet.start();
    }

    /* renamed from: e */
    private void m78829e() {
        AnimatorSet animatorSet = new AnimatorSet();
        Builder builder = null;
        for (int i = 0; i < this.f89640i.mo5062s(); i++) {
            View g = this.f89640i.mo5050g(i);
            if (g != null) {
                C34795b bVar = (C34795b) g.getTag();
                if (builder == null) {
                    builder = animatorSet.play(bVar.mo72927f());
                } else {
                    builder.with(bVar.mo72927f());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f89644m);
        animatorSet.start();
    }

    /* renamed from: a */
    public final IMContact[] mo72915a() {
        return (IMContact[]) this.f89637f.toArray(new IMContact[0]);
    }

    /* renamed from: a */
    public void mo72909a(int i) {
        notifyItemChanged(i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f89639h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo72918b(int i) {
        if (i < mo72919c()) {
            return true;
        }
        return false;
    }

    public int getItemViewType(int i) {
        if (((IMContact) this.f89634c.get(i)).getType() == -1) {
            return -1;
        }
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f89639h = recyclerView;
        this.f89640i = (LinearLayoutManager) this.f89639h.getLayoutManager();
        if (this.f89643l == null) {
            this.f89643l = new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    int m = C34791a.this.f89640i.mo4752m();
                    if (C34791a.this.f89632a == 0 && m == C34791a.this.getItemCount() - 1 && C34791a.this.f89641j != null) {
                        C18842a.m45934b(C34791a.this.f89641j);
                    }
                }
            };
        }
        this.f89639h.mo4801a(this.f89643l);
    }

    /* renamed from: a */
    public final void mo72912a(List<IMContact> list) {
        this.f89636e = null;
        this.f89634c.clear();
        this.f89632a = 0;
        this.f89634c.addAll(list);
        if (this.f89634c.isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            this.f89634c.add(iMUser);
        } else if (this.f89634c.size() != 1 || ((IMContact) this.f89634c.get(0)).getType() != -1) {
            if (((IMContact) this.f89634c.get(0)).getType() == -1) {
                this.f89634c.remove(0);
            }
        } else {
            return;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo72914a(boolean z) {
        if (this.f89635d != z) {
            this.f89635d = z;
            if (!this.f89635d) {
                this.f89637f.clear();
            }
            if (this.f89635d) {
                m78828d();
                return;
            }
            m78829e();
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C34795b bVar, int i) {
        bVar.mo70627a((IMContact) this.f89634c.get(i), i);
    }

    /* renamed from: a */
    public C34795b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.bf_;
        } else {
            i2 = R.layout.bf6;
        }
        return new C34795b(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo72913a(List<IMContact> list, CharSequence charSequence) {
        this.f89632a = 1;
        this.f89636e = charSequence.toString();
        this.f89634c.clear();
        this.f89634c.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72910a(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayName());
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                textView.setText(iMUser.getDisplayId());
            }
        } else {
            if (C35279p.m79763a()) {
                String nickName = iMUser.getNickName();
                if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                    nickName = iMUser.getDisplayId();
                }
                if (!TextUtils.isEmpty(nickName) && !nickName.contains(str)) {
                    str = str.toLowerCase();
                    int indexOf = nickName.toLowerCase().indexOf(str);
                    if (indexOf != -1) {
                        str = nickName.substring(indexOf, Math.min(str.length() + indexOf, nickName.length()));
                    }
                }
            } else if (iMUser.getSearchType() == 5) {
                str = C34839a.m78903a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
            } else if (iMUser.getSearchType() == 3) {
                str = C34839a.m78903a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            }
            String displayName = iMUser.getDisplayName();
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                displayName = iMUser.getDisplayId();
            }
            m78827a(textView, displayName, str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0151  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72917b(android.widget.TextView r8, com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser r9, java.lang.String r10) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.String r10 = r9.getDisplayId()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0017
            r8.setVisibility(r1)
            goto L_0x002f
        L_0x0017:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "@"
            r10.<init>(r0)
            java.lang.String r0 = r9.getDisplayId()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r8.setText(r10)
            r8.setVisibility(r2)
        L_0x002f:
            com.ss.android.ugc.aweme.services.IMainService r10 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r10 = (com.p683ss.android.ugc.aweme.services.IMainService) r10
            java.lang.String r0 = "Message"
            boolean r10 = r10.shouldChangeToHandle(r0)
            if (r10 == 0) goto L_0x0170
            java.lang.String r10 = r9.getDisplayName()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x004b
            r8.setVisibility(r1)
            return
        L_0x004b:
            java.lang.String r9 = r9.getDisplayName()
            r8.setText(r9)
            r8.setVisibility(r2)
            return
        L_0x0056:
            int r0 = r9.getSearchType()
            r3 = 5
            if (r0 != r3) goto L_0x0073
            java.lang.String r0 = r9.getSignature()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = r9.getSignature()
            r8.setText(r0)
            r8.setVisibility(r2)
            goto L_0x0143
        L_0x0073:
            int r0 = r9.getSearchType()
            r3 = 3
            r4 = 1
            if (r0 != r3) goto L_0x00ca
            java.lang.String r0 = r9.getRemarkName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r9.getSignature()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = r9.getSignature()
            r8.setText(r0)
            r8.setVisibility(r2)
            goto L_0x0143
        L_0x009b:
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2132545458(0x7f1c0fb2, float:2.0744106E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r9.getNickName()
            r4[r2] = r6
            java.lang.String r0 = r0.getString(r5, r4)
            java.lang.String r4 = r9.getNickName()
            java.lang.String r5 = r9.getNickNamePinyin()
            java.lang.String r6 = r9.getNickNameInitial()
            java.lang.String r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78903a(r4, r5, r6, r10)
            m78827a(r8, r0, r10, r3)
            r8.setVisibility(r2)
            goto L_0x0143
        L_0x00ca:
            int r0 = r9.getSearchType()
            if (r0 != r4) goto L_0x010a
            java.lang.String r0 = r9.getDisplayId()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78908c(r0)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78906b(r0)
            java.lang.String r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78903a(r0, r3, r4, r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132545170(0x7f1c0e92, float:2.0743522E38)
            java.lang.String r4 = r4.getString(r5)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 4
            m78827a(r8, r0, r10, r3)
            r8.setVisibility(r2)
            goto L_0x0143
        L_0x010a:
            int r0 = r9.getSearchType()
            r3 = 2
            if (r0 != r3) goto L_0x0140
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2132545263(0x7f1c0eef, float:2.074371E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r9.getContactName()
            r4[r2] = r5
            java.lang.String r0 = r0.getString(r3, r4)
            java.lang.String r3 = r9.getContactName()
            java.lang.String r4 = r9.getContactNamePinyin()
            java.lang.String r5 = r9.getContactNameInitial()
            java.lang.String r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78903a(r3, r4, r5, r10)
            r3 = 6
            m78827a(r8, r0, r10, r3)
            r8.setVisibility(r2)
            goto L_0x0143
        L_0x0140:
            r8.setVisibility(r1)
        L_0x0143:
            com.ss.android.ugc.aweme.services.IMainService r0 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.p683ss.android.ugc.aweme.services.IMainService) r0
            java.lang.String r3 = "Message"
            boolean r0 = r0.shouldChangeToHandle(r3)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r9.getDisplayName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015f
            r8.setVisibility(r1)
            return
        L_0x015f:
            java.lang.String r0 = r9.getDisplayName()
            r8.setText(r0)
            r8.setVisibility(r2)
            java.lang.String r9 = r9.getDisplayName()
            m78827a(r8, r9, r10, r2)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a.mo72917b(android.widget.TextView, com.ss.android.ugc.aweme.im.service.model.IMUser, java.lang.String):void");
    }

    /* renamed from: a */
    protected static void m78827a(TextView textView, String str, String str2, int i) {
        textView.setText(C34847d.m78925a(C0726c.m2098c(textView.getContext(), R.color.rd), str, str2, i));
    }
}
