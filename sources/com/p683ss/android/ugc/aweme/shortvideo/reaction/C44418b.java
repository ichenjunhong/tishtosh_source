package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService.UICallback;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44413c;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44414d;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44415e;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.b */
public final class C44418b {

    /* renamed from: a */
    public Activity f112366a;

    /* renamed from: b */
    public Aweme f112367b;

    /* renamed from: c */
    public Aweme f112368c;

    /* renamed from: d */
    public Aweme f112369d;

    /* renamed from: e */
    public boolean f112370e;

    /* renamed from: f */
    public String f112371f;

    /* renamed from: g */
    public List<String> f112372g;

    /* renamed from: h */
    String f112373h = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().cacheDir();

    /* renamed from: i */
    public String f112374i;

    /* renamed from: j */
    String f112375j;

    /* renamed from: k */
    String f112376k;

    /* renamed from: l */
    public int f112377l;

    /* renamed from: m */
    public C45547d f112378m;

    /* renamed from: n */
    public AlertDialog f112379n;

    /* renamed from: o */
    public long f112380o;

    /* renamed from: p */
    UICallback f112381p = new UICallback() {
        public final void postFail() {
        }

        public final void postSuccess() {
        }

        public final void preSuccess() {
            C44418b.this.mo90298d();
        }

        public final void preFail(int i) {
            C44418b.this.mo90297c();
        }
    };

    /* renamed from: q */
    public Runnable f112382q = new Runnable() {
        public final void run() {
            if (C44418b.this.f112378m != null) {
                C45547d dVar = C44418b.this.f112378m;
                int i = 100;
                if (C44418b.this.f112377l < 100) {
                    i = C44418b.this.f112377l;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: r */
    private C44409a f112383r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.b$a */
    class C44423a implements OnClickListener {
        private C44423a() {
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (view.getId() == R.id.c9d) {
                C44418b.this.f112368c = C44418b.this.f112369d;
                C44418b.this.f112370e = true;
            } else if (view.getId() == R.id.c9e) {
                C44418b.this.f112368c = C44418b.this.f112367b;
            }
            C44418b.this.f112379n.dismiss();
            String str2 = "click_react";
            C23089d a = C23089d.m56640a().mo47829a("group_id", C44418b.this.f112368c.getAid()).mo47829a("origin_group_id", C44418b.this.f112369d.getAid()).mo47829a("enter_from", C44418b.this.f112371f);
            String str3 = "react_mode";
            if (view.getId() == R.id.c9d) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            C44418b.this.mo90295a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.b$b */
    class C44424b implements OnClickListener {
        private C44424b() {
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            C44418b.this.f112379n.dismiss();
            if (view.getId() != R.id.c9d || !C44418b.this.f112369d.getStatus().isDelete()) {
                C10691a.m21542b((Context) C44418b.this.f112366a, (int) R.string.fk8).mo19066a();
            } else {
                C10691a.m21542b(C44418b.this.f112366a.getApplicationContext(), (int) R.string.d3v).mo19066a();
            }
            String str3 = "click_react";
            C23089d a = C23089d.m56640a().mo47829a("group_id", C44418b.this.f112367b.getAid()).mo47829a("origin_group_id", C44418b.this.f112369d.getAid()).mo47829a("enter_from", C44418b.this.f112371f);
            String str4 = "react_mode";
            if (view.getId() == R.id.c9d) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
            String str5 = "react_fail";
            C23089d a2 = C23089d.m56640a().mo47829a("group_id", C44418b.this.f112367b.getAid()).mo47829a("origin_group_id", C44418b.this.f112369d.getAid());
            String str6 = "react_mode";
            if (view.getId() == R.id.c9d) {
                str2 = "from_react_origin";
            } else {
                str2 = "from_react_react";
            }
            C26890h.m65011a(str5, a2.mo47829a(str6, str2).f61491a);
        }
    }

    /* renamed from: c */
    public final void mo90297c() {
        C0013i.m18a((Callable<TResult>) new C44430h<TResult>(this), C0013i.f25b);
    }

    /* renamed from: d */
    public final void mo90298d() {
        if (this.f112378m != null) {
            try {
                this.f112378m.dismiss();
            } catch (Exception unused) {
            }
        }
        this.f112378m = null;
    }

    /* renamed from: a */
    public final void mo90295a() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getShortVideoPluginService().mo80676a(this.f112366a, true, new C39598a() {
            public final void onSuccess() {
                C44418b bVar = C44418b.this;
                VideoUrlModel playAddrH264 = bVar.f112368c.getVideo().getPlayAddrH264();
                if (playAddrH264 != null && !C9376b.m18558a((Collection<T>) playAddrH264.getUrlList())) {
                    bVar.f112372g = C44414d.m97221a(playAddrH264.getUrlList(), bVar.f112368c);
                    String a = C9395d.m18571a(playAddrH264.getBitRatedRatioUri());
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar.f112373h);
                    sb.append(a);
                    sb.append(".mp4");
                    bVar.f112374i = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(bVar.f112373h);
                    sb2.append("temp_");
                    sb2.append(a);
                    sb2.append(".mp4");
                    bVar.f112375j = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(bVar.f112373h);
                    sb3.append("temp_");
                    sb3.append(a);
                    sb3.append(".wav");
                    bVar.f112376k = sb3.toString();
                    if (C48016e.m103944b(bVar.f112374i)) {
                        bVar.mo90296b();
                        return;
                    }
                    C48016e.m103935a(bVar.f112373h, false);
                    if (bVar.f112378m == null) {
                        bVar.f112378m = C45547d.m99208b(bVar.f112366a, bVar.f112366a.getResources().getString(R.string.au9));
                    }
                    bVar.f112378m.setIndeterminate(false);
                    bVar.f112378m.setProgress(0);
                    String str = bVar.f112373h;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a);
                    sb4.append(".mp4");
                    C44415e.m97222a(bVar.f112368c.getAid(), bVar.f112372g, str, sb4.toString(), new C44413c(bVar.f112372g, bVar.f112371f) {
                        /* renamed from: a */
                        public final void mo89476a(String str, String str2) {
                            super.mo89476a(str, str2);
                            if (new File(str2).length() == 0) {
                                C44418b.this.mo90297c();
                                StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                                sb.append(C44418b.this.f112372g);
                                C32458a.m75148a((Throwable) new Exception(sb.toString()));
                                return;
                            }
                            C44418b.this.f112374i = str2;
                            C44418b.this.mo90296b();
                        }

                        /* renamed from: a */
                        public final void mo89475a(Exception exc, String str, Integer num) {
                            super.mo89475a(exc, str, num);
                            C44418b.this.mo90297c();
                        }

                        /* renamed from: a */
                        public final void mo89474a(int i, long j, long j2) {
                            super.mo89474a(i, j, j2);
                            if (C44418b.this.f112366a != null) {
                                C44418b.this.f112377l = i;
                                C18842a.m45934b(C44418b.this.f112382q);
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo90296b() {
        C18842a.m45934b(new C44427e(this));
        C18842a.m45932a(new C44428f(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Void mo90299e() throws Exception {
        if (this.f112366a != null) {
            if (!C44431i.m97235a(C11010c.m22280a())) {
                mo90298d();
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg2).mo19066a();
            } else {
                mo90298d();
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.at3).mo19066a();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo90294a(C0013i iVar) throws Exception {
        mo90298d();
        if (!iVar.mo33d()) {
            this.f112383r = (C44409a) iVar.mo34e();
            if (this.f112383r.getOrigin() != null) {
                this.f112369d = this.f112383r.getOrigin();
                Builder builder = new Builder(this.f112366a);
                View inflate = this.f112366a.getLayoutInflater().inflate(R.layout.avg, null);
                builder.setView(inflate);
                TextView textView = (TextView) inflate.findViewById(R.id.c9d);
                TextView textView2 = (TextView) inflate.findViewById(R.id.c9e);
                C44423a aVar = new C44423a();
                C44424b bVar = new C44424b();
                if (this.f112383r.getReactionPermission(this.f112367b, this.f112369d) != 0) {
                    C26890h.m65011a("react_choice_show", C23089d.m56640a().mo47829a("group_id", this.f112367b.getAid()).mo47829a("origin_group_id", this.f112369d.getAid()).mo47829a("enter_from", this.f112371f).f61491a);
                }
                switch (this.f112383r.getReactionPermission(this.f112367b, this.f112369d)) {
                    case 0:
                        C26890h.m65011a("react_fail", C23089d.m56640a().mo47829a("group_id", this.f112367b.getAid()).mo47829a("origin_group_id", this.f112369d.getAid()).mo47829a("react_mode", "from_react").f61491a);
                        C10691a.m21548c((Context) this.f112366a, (int) R.string.fk8).mo19066a();
                        mo90298d();
                        break;
                    case 1:
                        textView.setOnClickListener(aVar);
                        textView2.setOnClickListener(bVar);
                        this.f112379n = builder.create();
                        this.f112379n.show();
                        break;
                    case 2:
                        textView.setOnClickListener(bVar);
                        textView2.setOnClickListener(aVar);
                        this.f112379n = builder.create();
                        this.f112379n.show();
                        break;
                    case 3:
                        textView.setOnClickListener(aVar);
                        textView2.setOnClickListener(aVar);
                        this.f112379n = builder.create();
                        this.f112379n.show();
                        break;
                }
            } else {
                this.f112369d = this.f112367b;
                this.f112368c = this.f112367b;
                this.f112370e = true;
                if (this.f112383r.getReactable() || C20854a.m53167g().isMe(this.f112368c.getAuthor().getUid())) {
                    C26890h.m65011a("click_react", C23089d.m56640a().mo47829a("group_id", this.f112368c.getAid()).mo47829a("origin_group_id", this.f112369d.getAid()).mo47829a("enter_from", this.f112371f).mo47829a("react_mode", "from_origin").f61491a);
                    mo90295a();
                } else {
                    C26890h.m65011a("react_fail", C23089d.m56640a().mo47829a("group_id", this.f112368c.getAid()).mo47829a("origin_group_id", this.f112369d.getAid()).mo47829a("react_mode", "from_origin").f61491a);
                    C10691a.m21548c((Context) this.f112366a, (int) R.string.fk8).mo19066a();
                    mo90298d();
                }
            }
        } else {
            mo90297c();
        }
        return null;
    }
}
