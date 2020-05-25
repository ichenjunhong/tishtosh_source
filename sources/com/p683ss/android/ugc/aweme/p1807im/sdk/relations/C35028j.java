package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33265b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33440v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IImplService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C35003i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a.C34794a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.C35109a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35205as;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35276n;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35463m;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.j */
public class C35028j extends C33265b<C35023g> implements OnTouchListener {

    /* renamed from: d */
    private C34794a f90125d;

    /* renamed from: e */
    private String f90126e;

    /* renamed from: g */
    protected SharePackage f90127g;

    /* renamed from: h */
    public BaseContent f90128h;

    /* renamed from: i */
    protected boolean f90129i;

    /* renamed from: j */
    protected EditText f90130j;

    /* renamed from: k */
    protected ImageView f90131k;

    /* renamed from: l */
    protected DmtStatusView f90132l;

    /* renamed from: m */
    protected C34791a f90133m;

    /* renamed from: n */
    protected RecyclerView f90134n;

    /* renamed from: o */
    protected ImTextTitleBar f90135o;

    /* renamed from: p */
    protected TextWatcher f90136p;

    /* renamed from: q */
    protected OnClickListener f90137q;

    /* renamed from: r */
    public String f90138r;

    /* renamed from: s */
    public C23371a<Boolean> f90139s;

    /* renamed from: t */
    View f90140t;

    /* renamed from: u */
    View f90141u;

    /* renamed from: a */
    public void mo72967a(List<IMContact> list) {
        if (mo70612d() != null && !mo70612d().isFinishing()) {
            this.f90129i = false;
            this.f90133m.mo72912a(list);
            mo72970f();
        }
    }

    /* renamed from: a */
    public void mo72968a(List<IMContact> list, CharSequence charSequence) {
        if (mo70612d() != null && !mo70612d().isFinishing()) {
            this.f90129i = true;
            this.f90133m.mo72913a(list, charSequence);
            mo72970f();
        }
    }

    /* renamed from: a */
    public final boolean mo73144a(IMContact iMContact) {
        IMUser a = C34010e.m77749a(iMContact);
        if (a == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (!TextUtils.equals(a.getUid(), C35265e.m79730b()) && a.getFollowStatus() != 2) {
            int i = this.f90127g.f106900i.getInt("aweme_type");
            if (TextUtils.equals(this.f90127g.f106895d, "pic")) {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.blm);
                return false;
            } else if (TextUtils.equals(this.f90127g.f106895d, "gif") && (i == 501 || i == 502)) {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.bh0);
                return false;
            } else if (TextUtils.equals(this.f90127g.f106895d, "story_video")) {
                C9432q.m18672a(C11010c.m22280a(), (int) R.string.bln);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo73141a(String str, final IMContact iMContact, final String str2) {
        final BaseContent baseContent;
        if (this.f90128h == null) {
            baseContent = C35106c.m79334b(this.f90127g);
        } else if (this.f90128h instanceof TextContent) {
            baseContent = TextContent.obtain((TextContent) this.f90128h);
        } else {
            baseContent = this.f90128h;
        }
        if (!TextUtils.isEmpty(str) && baseContent != null) {
            C35205as a = C35205as.m79585a();
            StringBuilder sb = new StringBuilder();
            sb.append(baseContent.hashCode());
            a.mo73325a(sb.toString(), "process_id", str);
        }
        C33440v.m76638a();
        String a2 = C33440v.m76639a(baseContent);
        if (!TextUtils.isEmpty(a2)) {
            C33440v.m76638a().mo70847a(a2, baseContent, (C33445y) new C33445y() {
                /* renamed from: a */
                public final void mo70782a() {
                }

                /* renamed from: a */
                public final void mo70783a(double d) {
                }

                /* renamed from: a */
                public final void mo70785a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo70784a(String str) {
                    C35028j.this.mo73137a(iMContact, str2, baseContent);
                }

                /* renamed from: a */
                public final void mo70787a(String str, UrlModel urlModel) {
                    if (baseContent instanceof SharePoiContent) {
                        ((SharePoiContent) baseContent).setMapUrl(urlModel);
                    } else if (baseContent instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) baseContent).setUrl(urlModel);
                    } else if (baseContent instanceof StoryPictureContent) {
                        ((StoryPictureContent) baseContent).setUrl((C33376a) urlModel);
                    }
                    C35028j.this.mo73137a(iMContact, str2, baseContent);
                }
            });
        } else {
            mo73137a(iMContact, str2, baseContent);
        }
    }

    /* renamed from: a */
    public final void mo73142a(String str, final String str2) {
        final BaseContent b = this.f90128h != null ? this.f90128h : C35106c.m79334b(this.f90127g);
        if (b instanceof StoryPictureContent) {
            ((StoryPictureContent) b).setMassMsg(1);
        } else if (b instanceof StoryVideoContent) {
            ((StoryVideoContent) b).setMassMsg(1);
        }
        if (!TextUtils.isEmpty(str) && b != null) {
            C35205as a = C35205as.m79585a();
            StringBuilder sb = new StringBuilder();
            sb.append(b.hashCode());
            a.mo73325a(sb.toString(), "process_id", str);
        }
        C33440v.m76638a();
        String a2 = C33440v.m76639a(b);
        if (!TextUtils.isEmpty(a2)) {
            C33440v.m76638a().mo70847a(a2, b, (C33445y) new C33445y() {
                /* renamed from: a */
                public final void mo70782a() {
                }

                /* renamed from: a */
                public final void mo70783a(double d) {
                }

                /* renamed from: a */
                public final void mo70785a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo70784a(String str) {
                    C35028j.this.mo73140a(str2, b);
                }

                /* renamed from: a */
                public final void mo70787a(String str, UrlModel urlModel) {
                    if (b instanceof SharePoiContent) {
                        ((SharePoiContent) b).setMapUrl(urlModel);
                    } else if (b instanceof OnlyPictureContent) {
                        ((OnlyPictureContent) b).setUrl(urlModel);
                    } else if (b instanceof StoryPictureContent) {
                        ((StoryPictureContent) b).setUrl((C33376a) urlModel);
                    }
                    C35028j.this.mo73140a(str2, b);
                }
            });
        } else {
            mo73140a(str2, b);
        }
    }

    /* renamed from: m */
    public final void mo73153m() {
        this.f90131k.performClick();
    }

    /* renamed from: g */
    public final void mo73147g() {
        if (this.f90133m != null) {
            this.f90133m.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public final void mo73152l() {
        C26894c.m65021a(mo70612d(), this.f90130j);
    }

    /* renamed from: k */
    public final void mo73151k() {
        if (this.f90133m == null || !this.f90133m.f89635d) {
            mo70612d().finish();
        } else {
            mo73150j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo72969e() {
        boolean z;
        IImplService b = C34004b.m77718b();
        if (this.f90127g != null) {
            z = true;
        } else {
            z = false;
        }
        this.f90133m = b.getRelationListAdapter(z);
        this.f90133m.f89641j = new Runnable() {
            public final void run() {
                ((C35023g) C35028j.this.f86289c).f90104b.mo72992g();
            }
        };
        this.f90133m.f89642k = this.f90125d;
        this.f90133m.f89633b = C35276n.m79758a(this.f90127g);
        this.f90134n.setAdapter(this.f90133m);
    }

    /* renamed from: a */
    public void mo70609a() {
        super.mo70609a();
        this.f90135o = (ImTextTitleBar) this.f86288b.findViewById(R.id.d10);
        this.f90132l = (DmtStatusView) this.f86288b.findViewById(R.id.csv);
        this.f90130j = (EditText) this.f86288b.findViewById(R.id.cj5);
        this.f90130j.setTag("relation_search_tag");
        if (C35279p.m79763a()) {
            this.f90130j.setHint(R.string.bb7);
        }
        this.f90131k = (ImageView) this.f86288b.findViewById(R.id.nh);
        this.f90134n = (RecyclerView) this.f86288b.findViewById(R.id.ca2);
        this.f90134n.setLayoutManager(new LinearLayoutManager(mo70611c()));
        this.f90134n.mo4801a((C1340m) new C32461a(this.f86287a) {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C26894c.m65021a(C35028j.this.mo70612d(), C35028j.this.f90130j);
            }
        });
    }

    /* renamed from: b */
    public final void mo70610b() {
        super.mo70610b();
        if (this.f90137q == null) {
            this.f90137q = new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (view.equals(C35028j.this.f90131k)) {
                        C35028j.this.f90130j.setText("");
                        C35028j.this.f90130j.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) C11010c.m22280a().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(C35028j.this.f90130j.getWindowToken(), 0);
                        }
                    }
                }
            };
        }
        if (this.f90136p == null) {
            this.f90136p = new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        C35023g gVar = (C35023g) C35028j.this.f86289c;
                        if (!TextUtils.isEmpty(obj)) {
                            gVar.f90104b.mo73113a(obj.toString());
                        }
                        return;
                    }
                    C35003i iVar = ((C35023g) C35028j.this.f86289c).f90104b;
                    if (iVar != null) {
                        C35028j.this.mo72967a(iVar.mo72989d());
                    }
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (TextUtils.isEmpty(charSequence) || C35028j.this.f90131k.getVisibility() != 8) {
                        if (TextUtils.isEmpty(charSequence) && C35028j.this.f90131k.getVisibility() == 0) {
                            C35028j.this.f90131k.setVisibility(8);
                        }
                        return;
                    }
                    C35028j.this.f90131k.setVisibility(0);
                }
            };
        }
        if (this.f90125d == null) {
            this.f90125d = new C34794a() {
                /* renamed from: a */
                public final void mo72924a(View view, int i) {
                    final IMContact iMContact = (IMContact) view.getTag(83886080);
                    Integer num = (Integer) view.getTag(50331648);
                    if (num != null && iMContact != null) {
                        if (num.intValue() == 50331648 || num.intValue() == 50331649) {
                            boolean z = true;
                            if (C35028j.this.f90133m.f89635d) {
                                int i2 = C34004b.m77717a().mo71949f().getIMSetting().f91145c;
                                if (C35028j.this.f90133m.mo72916b() >= i2 && !C35028j.this.f90133m.f89637f.contains(iMContact)) {
                                    C10691a.m21553c(C35028j.this.mo70611c(), C35028j.this.mo70611c().getString(R.string.box, new Object[]{Integer.valueOf(i2)}), 0, 2).mo19066a();
                                } else if (C35028j.this.mo73144a(iMContact)) {
                                    C34791a aVar = C35028j.this.f90133m;
                                    if (aVar.f89637f.contains(iMContact)) {
                                        aVar.f89637f.remove(iMContact);
                                        z = false;
                                    } else {
                                        aVar.f89637f.add(iMContact);
                                    }
                                    C35028j.this.f90133m.mo72909a(i);
                                    if (z) {
                                        C35028j.this.mo73145b(iMContact);
                                    }
                                    C35028j.this.mo73148h();
                                }
                            } else if (C35028j.this.f90127g == null) {
                                C35463m under16Proxy = C34004b.m77717a().mo71949f().getUnder16Proxy();
                                if (under16Proxy != null) {
                                    if (under16Proxy.mo70448b() && under16Proxy.mo70449c()) {
                                        under16Proxy.mo70454h();
                                        return;
                                    } else if (under16Proxy.mo70450d()) {
                                        return;
                                    }
                                }
                                C34008d.m77745a(C35028j.this.mo70611c(), iMContact, (C52670a<C52860x>) new C52670a<C52860x>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public C52860x invoke() {
                                        IMUser a = C34010e.m77749a(iMContact);
                                        if (a != null) {
                                            C35028j.this.mo73138a(a);
                                            String uid = a.getUid();
                                            if (TextUtils.equals(uid, C35265e.m79730b())) {
                                                C35190af.m79442a();
                                                C35190af.m79461a("", "to_myself");
                                            } else {
                                                String a2 = C11190e.m22687a(Long.valueOf(uid).longValue());
                                                C35190af.m79442a();
                                                C35190af.m79468a(a2, uid, "private", "click_contact", "contact_list", ChatRoomActivity.m76444a());
                                            }
                                            ChatRoomActivity.m76450a(C35028j.this.mo70611c(), a, 4);
                                        }
                                        return null;
                                    }
                                });
                            } else if (C35028j.this.mo73144a(iMContact)) {
                                C35028j.this.mo73145b(iMContact);
                                C35106c.m79326a(C35028j.this.mo70611c(), C35028j.this.f90127g, new IMContact[]{iMContact}, C35028j.this.f90138r, (C35109a) new C35109a() {
                                    public final void onShare(final String str) {
                                        final String uuid = UUID.randomUUID().toString();
                                        new C33220b(C35028j.this.mo70611c(), new C33242d() {
                                            public final void sendMsg() {
                                                C35028j.this.mo73141a(uuid, iMContact, str);
                                                if (C35028j.this.f90139s != null) {
                                                    C35028j.this.f90139s.run(Boolean.valueOf(true));
                                                }
                                            }
                                        }).sendMsg();
                                        C35028j.this.mo73146c(iMContact);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(iMContact);
                                        C35190af.m79456a(C35028j.this.f90127g, "1", "", (List<IMContact>) arrayList);
                                        C35116j.m79348a(uuid, C35028j.this.f90127g, arrayList);
                                    }
                                }, (C35109a) new C35109a() {
                                    public final void onShare(String str) {
                                        if (C35028j.this.f90139s != null) {
                                            C35028j.this.f90139s.run(Boolean.valueOf(false));
                                        }
                                    }
                                });
                            }
                        } else {
                            if (num.intValue() == 100663296) {
                                C35463m under16Proxy2 = C34004b.m77717a().mo71949f().getUnder16Proxy();
                                if (under16Proxy2 != null) {
                                    if (under16Proxy2.mo70448b() && under16Proxy2.mo70449c()) {
                                        under16Proxy2.mo70454h();
                                        return;
                                    } else if (under16Proxy2.mo70450d()) {
                                        return;
                                    }
                                }
                                C34008d.m77745a(C35028j.this.mo70611c(), iMContact, (C52670a<C52860x>) new C52670a<C52860x>() {
                                    public final /* synthetic */ Object invoke() {
                                        final IMUser a = C34010e.m77749a(iMContact);
                                        if (a != null) {
                                            C35243bl.m79700a(C35028j.this.mo70612d(), a, 4, (Runnable) new Runnable() {
                                                public final void run() {
                                                    String a = C11190e.m22687a(Long.valueOf(a.getUid()).longValue());
                                                    ChatRoomActivity.m76450a(C35028j.this.f86287a, a, 4);
                                                    C35190af.m79442a();
                                                    C35190af.m79468a(a, a.getUid(), "private", "click_contact_card", "contact_list", ChatRoomActivity.m76444a());
                                                }
                                            });
                                        }
                                        return null;
                                    }
                                });
                            }
                        }
                    }
                }
            };
        }
        this.f90135o.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: b */
            public final void mo70670b() {
            }

            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                C26894c.m65021a(C35028j.this.mo70612d(), C35028j.this.f90130j);
                C35028j.this.mo70612d().finish();
            }
        });
        this.f90131k.setOnClickListener(this.f90137q);
        this.f90130j.addTextChangedListener(this.f90136p);
        this.f90130j.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66) {
                    return false;
                }
                C26894c.m65021a(C35028j.this.mo70612d(), C35028j.this.f90130j);
                return true;
            }
        });
        this.f90130j.setOnTouchListener(this);
        mo72969e();
    }

    /* renamed from: i */
    public final void mo73149i() {
        this.f90135o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f90135o.setLeftText((int) R.string.wf);
        this.f90135o.setRightText((int) R.string.bhc);
        this.f90135o.setTitle((int) R.string.bn2);
        this.f90135o.setRightTextColor(mo70612d().getResources().getColor(R.color.a3e));
        this.f90135o.getRightView().setEnabled(false);
        this.f90133m.mo72914a(true);
        this.f90135o.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                C35028j.this.mo73150j();
            }

            /* renamed from: b */
            public final void mo70670b() {
                if (C35028j.this.f90133m.mo72916b() > 0) {
                    C35106c.m79326a(C35028j.this.mo70611c(), C35028j.this.f90127g, C35028j.this.f90133m.mo72915a(), C35028j.this.f90138r, (C35109a) new C35109a() {
                        public final void onShare(final String str) {
                            final String uuid = UUID.randomUUID().toString();
                            new C33220b(C35028j.this.mo70611c(), new C33242d() {
                                public final void sendMsg() {
                                    C35028j.this.mo73142a(uuid, str);
                                    if (C35028j.this.f90139s != null) {
                                        C35028j.this.f90139s.run(Boolean.valueOf(true));
                                    }
                                }
                            }).sendMsg();
                            IMContact[] a = C35028j.this.f90133m.mo72915a();
                            SharePackage sharePackage = C35028j.this.f90127g;
                            BaseContent baseContent = C35028j.this.f90128h;
                            int length = a.length;
                            C35190af.m79442a();
                            C35190af.m79453a(sharePackage, baseContent, length);
                            SharePackage sharePackage2 = C35028j.this.f90127g;
                            StringBuilder sb = new StringBuilder();
                            sb.append(a.length);
                            C35190af.m79456a(sharePackage2, sb.toString(), "", Arrays.asList(a));
                            C35116j.m79348a(uuid, C35028j.this.f90127g, Arrays.asList(a));
                        }
                    }, (C35109a) new C35109a() {
                        public final void onShare(String str) {
                            if (C35028j.this.f90139s != null) {
                                C35028j.this.f90139s.run(Boolean.valueOf(false));
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: j */
    public final void mo73150j() {
        this.f90135o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f90135o.setLeftText((int) R.string.bfo);
        this.f90135o.setTitle((int) R.string.bn4);
        this.f90135o.setRightText((int) R.string.bn1);
        this.f90135o.setRightTextColor(mo70612d().getResources().getColor(R.color.a1l));
        this.f90135o.getRightView().setEnabled(true);
        this.f90133m.mo72914a(false);
        this.f90135o.setOnTitlebarClickListener(new C35356a() {
            /* renamed from: c */
            public final void mo70671c() {
            }

            /* renamed from: a */
            public final void mo70669a() {
                C26894c.m65021a(C35028j.this.mo70612d(), C35028j.this.f90130j);
                C35028j.this.mo70612d().finish();
            }

            /* renamed from: b */
            public final void mo70670b() {
                C35190af.m79442a();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from", "contact_list");
                hashMap.put("enter_method", "click_multi_choose_button");
                C26890h.m65011a("enter_multi_choose_contact", (Map<String, String>) hashMap);
                C35028j.this.mo73149i();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo72970f() {
        this.f90132l.mo19209d();
        if (this.f90133m.getItemCount() == 0) {
            if (this.f90129i) {
                if (this.f90140t == null) {
                    if (C35279p.m79763a()) {
                        MtEmptyView a = MtEmptyView.m21697a(this.f86287a);
                        a.setStatus(new C10723a(this.f86287a).mo19280b((int) R.string.bmw).mo19282c(R.string.bmv).mo19277a((int) R.drawable.ar0).f28711a);
                        this.f90140t = a;
                    } else {
                        DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f86287a);
                        dmtDefaultView.setStatus(new C10723a(this.f86287a).mo19280b((int) R.string.bmw).mo19282c(R.string.bmv).mo19277a((int) R.drawable.b0t).f28711a);
                        this.f90140t = dmtDefaultView;
                    }
                }
                this.f90132l.setBuilder(new C10719a(mo70612d()).mo19231b(this.f90140t));
            } else {
                if (this.f90141u == null) {
                    if (C35279p.m79763a()) {
                        MtEmptyView a2 = MtEmptyView.m21697a(this.f86287a);
                        a2.setStatus(new C10723a(this.f86287a).mo19280b((int) R.string.bmg).mo19282c(R.string.bmf).mo19277a((int) R.drawable.aqy).f28711a);
                        this.f90141u = a2;
                    } else {
                        DmtDefaultView dmtDefaultView2 = new DmtDefaultView(this.f86287a);
                        dmtDefaultView2.setStatus(new C10723a(this.f86287a).mo19280b((int) R.string.bmg).mo19282c(R.string.bmf).mo19277a((int) R.drawable.b0u).f28711a);
                        this.f90141u = dmtDefaultView2;
                    }
                }
                this.f90132l.setBuilder(new C10719a(mo70612d()).mo19231b(this.f90141u));
            }
            this.f90132l.mo19213g();
            this.f90132l.setVisibility(0);
            return;
        }
        this.f90132l.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo73148h() {
        if (this.f90133m.mo72916b() > 0) {
            ImTextTitleBar imTextTitleBar = this.f90135o;
            StringBuilder sb = new StringBuilder();
            sb.append(mo70611c().getString(R.string.bg2));
            sb.append("(");
            sb.append(this.f90133m.mo72916b());
            sb.append(")");
            imTextTitleBar.setRightText(sb.toString());
            this.f90135o.getRightView().setEnabled(true);
            this.f90135o.getRightTexView().getPaint().setFakeBoldText(true);
            this.f90135o.setRightTextColor(mo70612d().getResources().getColor(R.color.a3c));
            return;
        }
        this.f90135o.setRightText((int) R.string.bg2);
        this.f90135o.getRightView().setEnabled(false);
        this.f90135o.getRightTexView().getPaint().setFakeBoldText(false);
        this.f90135o.setRightTextColor(mo70612d().getResources().getColor(R.color.a3e));
    }

    /* renamed from: a */
    public final void mo73143a(LinkedHashSet<IMContact> linkedHashSet) {
        if (linkedHashSet != null) {
            this.f90133m.f89637f = linkedHashSet;
            mo73149i();
            mo73148h();
            this.f90133m.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final void mo73146c(IMContact iMContact) {
        if (C35279p.m79763a() && this.f90127g.f106895d.equals("aweme")) {
            String string = this.f90127g.f106900i.getString("author_id");
            String string2 = this.f90127g.f106900i.getString("enter_from");
            HashMap hashMap = new HashMap();
            hashMap.put("platform", "chat");
            hashMap.put("group_id", this.f90126e);
            String str = "author_id";
            if (string == null) {
                string = "";
            }
            hashMap.put(str, string);
            String str2 = "enter_from";
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put(str2, string2);
            if (iMContact instanceof IMUser) {
                hashMap.put("to_user_id", ((IMUser) iMContact).getUid());
            }
            C26890h.m65011a("share_video_success", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: b */
    public final void mo73145b(IMContact iMContact) {
        String str;
        if (this.f90128h == null) {
            str = "chat_list";
        } else {
            str = "chat_forward";
        }
        C35190af.m79442a().mo73321a(this.f90127g, iMContact, false, false, str);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            m79188b(C11190e.m22687a(Long.valueOf(uid).longValue()), uid);
            return;
        }
        if (iMContact instanceof IMConversation) {
            m79188b(((IMConversation) iMContact).getConversationId(), "");
        }
    }

    /* renamed from: a */
    public final void mo73138a(IMUser iMUser) {
        String str;
        C35190af.m79442a();
        String uid = iMUser.getUid();
        if (this.f90129i) {
            str = "search_result";
        } else if (iMUser.getType() == 1) {
            str = "recent";
        } else {
            str = "follow";
        }
        String obj = this.f90130j.getText().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", str);
            jSONObject.put("search_keyword", obj);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("chat").setLabelName("message").setValue(uid).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public final void mo73139a(SharePackage sharePackage) {
        this.f90127g = sharePackage;
        if (this.f90127g != null) {
            this.f90138r = this.f90127g.f106900i.getString("multi_share_msg");
            this.f90126e = this.f90127g.f106900i.getString("aid");
            this.f90127g.f106900i.remove("multi_share_msg");
            this.f90127g.f106900i.remove("aid");
        }
        if (this.f90126e == null) {
            this.f90126e = "";
        }
        if (this.f90135o != null) {
            if (this.f90127g != null) {
                mo72969e();
            }
            if (this.f90127g == null) {
                if (C35279p.m79763a()) {
                    this.f90135o.setTitle((int) R.string.bn3);
                } else {
                    this.f90135o.setTitle((int) R.string.bg4);
                }
                this.f90135o.getRightView().setVisibility(8);
                this.f90135o.setLeftText((int) R.string.bfo);
                return;
            }
            this.f90135o.setTitle((int) R.string.bn4);
            this.f90135o.getRightView().setVisibility(0);
            mo73150j();
        }
    }

    /* renamed from: b */
    private void m79188b(String str, String str2) {
        if (this.f90128h != null) {
            String a = C35197am.m79555a(this.f90128h.generateSharePackage().f106895d);
            if (!TextUtils.isEmpty(a)) {
                C35190af.m79442a();
                C35190af.m79465a(a, str, str2, this.f90128h);
            }
        }
    }

    /* renamed from: a */
    private void m79187a(IMContact iMContact, boolean z) {
        if (TextUtils.equals(this.f90127g.f106895d, "game")) {
            C10691a.m21533a(mo70611c(), (int) R.string.bna).mo19066a();
            return;
        }
        C53755c a = C53755c.m114319a();
        C35471h hVar = new C35471h(iMContact, z, this.f90127g.f106895d, this.f90127g.f106900i.getString("enter_from"), this.f90126e);
        a.mo112960d(hVar);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        if (view.equals(this.f90130j) && motionEvent.getAction() == 1) {
            if (this.f90128h != null) {
                str = "forward";
            } else if (this.f90127g != null) {
                str = "share";
            } else {
                str = "contact";
            }
            C35190af.m79442a();
            C35190af.m79527j(str);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73140a(String str, BaseContent baseContent) {
        C35190af.m79442a();
        C35190af.m79443a(this.f90133m.mo72916b());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        IMContact[] a = this.f90133m.mo72915a();
        C35237bj.m79649a().mo73348b(C34008d.m77744a(a), (List<BaseContent>) arrayList);
        boolean z = false;
        IMContact iMContact = a[0];
        if (a.length > 1) {
            z = true;
        }
        m79187a(iMContact, z);
        mo70612d().finish();
    }

    public C35028j(Context context, View view, boolean z) {
        super(context, view);
        if (z) {
            this.f90135o.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo73137a(IMContact iMContact, String str, BaseContent baseContent) {
        C35190af.m79442a();
        C35190af.m79443a(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C35237bj.m79649a().mo73349c(C34008d.m77743a(iMContact), arrayList);
        m79187a(iMContact, false);
        mo70612d().finish();
    }
}
