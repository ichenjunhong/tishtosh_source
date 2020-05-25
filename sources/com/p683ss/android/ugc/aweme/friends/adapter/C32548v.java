package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.widget.C23748b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26847b;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.friends.C32567c;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32720aj;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32728al;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32730an;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32773t;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.v */
public class C32548v extends C26840g<User> {

    /* renamed from: k */
    private static final String f84743k = "com.ss.android.ugc.aweme.friends.adapter.v";

    /* renamed from: A */
    private final boolean f84744A;

    /* renamed from: B */
    private HashMap<String, Boolean> f84745B = new HashMap<>();

    /* renamed from: C */
    private boolean f84746C = false;

    /* renamed from: a */
    public View f84747a;

    /* renamed from: b */
    public View f84748b;

    /* renamed from: c */
    public int f84749c = 0;

    /* renamed from: d */
    public int f84750d = -1;

    /* renamed from: e */
    public boolean f84751e;

    /* renamed from: f */
    public C32506c f84752f;

    /* renamed from: g */
    public C23452y<User> f84753g;

    /* renamed from: h */
    public String f84754h = "find_friends";

    /* renamed from: i */
    public String f84755i;

    /* renamed from: j */
    public String f84756j;

    /* renamed from: l */
    private Set<Integer> f84757l = new HashSet();

    /* renamed from: m */
    private Context f84758m;

    /* renamed from: y */
    private List<User> f84759y = Collections.emptyList();

    /* renamed from: z */
    private int f84760z = 0;

    /* renamed from: g */
    private int m75312g() {
        if (this.f84759y.isEmpty()) {
            return 0;
        }
        return Math.min(this.f84759y.size(), 3) + 1;
    }

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        if (this.f84747a != null) {
            i = 1;
        } else {
            i = 0;
        }
        int c = super.mo48636c() + Math.min(this.f84759y.size(), 3);
        if (c > 0) {
            int i2 = i + 1;
            if (this.f84760z > 0) {
                i2++;
            }
            if (!this.f84759y.isEmpty()) {
                i++;
            }
        }
        return c + i;
    }

    /* renamed from: c */
    private int m75310c(int i) {
        if (this.f84760z <= 0 || i <= this.f84760z + 2) {
            return i - 2;
        }
        return i - 3;
    }

    /* renamed from: b */
    private boolean m75309b(int i) {
        int i2;
        if (this.f70670n == null) {
            i2 = 0;
        } else {
            i2 = this.f70670n.size();
        }
        if (i < 0 || i >= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static List<User> m75311e(List<User> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        list.clear();
        list.addAll(arrayList);
        return list;
    }

    /* renamed from: c */
    public final void mo51189c(List<User> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (this.f70670n == null) {
                this.f70670n = new ArrayList();
            }
            this.f70670n.addAll(list);
            this.f70670n = m75311e(this.f70670n);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        if (this.f84760z > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !this.f84759y.isEmpty();
        int min = Math.min(this.f84759y.size(), 3);
        if (this.f84747a == null) {
            if (i == 0) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.f84750d = i;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (i == min + 1) {
                    if (z) {
                        return 3;
                    }
                    return 4;
                }
            } else if (z && i == this.f84760z + 1) {
                return 4;
            }
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.f84750d = i;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (z) {
                    int i2 = min + 2;
                    if (i == i2) {
                        return 3;
                    }
                    if (i == i2 + 1 + this.f84760z) {
                        return 4;
                    }
                } else if (i == min + 2) {
                    return 4;
                }
            } else if (z && i == this.f84760z + 2) {
                return 4;
            }
        }
        if (this.f84748b != null && i == getItemCount() - 1) {
            return 1;
        }
        int c = m75310c(i);
        if (!m75309b(c) || !(this.f70670n.get(c) instanceof RecommendContact)) {
            return 2;
        }
        return 6;
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C32728al) {
            User a = ((C32728al) vVar).mo66319a();
            if (this.f84759y != null && this.f84759y.contains(a) && this.f84759y.indexOf(a) < 3) {
                str = "recent_fans";
            } else if (a == null) {
                str = "";
            } else if (a.isNewRecommend()) {
                str = "new";
            } else {
                str = "past";
            }
            int indexOf = this.f70670n.indexOf(a);
            if (!this.f84757l.contains(Integer.valueOf(indexOf))) {
                this.f84757l.add(Integer.valueOf(indexOf));
                C37940g a2 = C37940g.m84832a();
                if (a == null) {
                    str2 = "";
                } else {
                    str2 = a.getUid();
                }
                a2.mo77415a(3, str2);
                JSONObject jSONObject = new JSONObject();
                String str6 = "rec_uid";
                if (a == null) {
                    str3 = "";
                } else {
                    try {
                        str3 = a.getUid();
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str6, str3);
                jSONObject.put("enter_from", this.f84754h);
                jSONObject.put("event_type", "impression");
                jSONObject.put("previous_page", this.f84755i);
                jSONObject.put("impr_order", indexOf);
                String str7 = "req_id";
                if (a != null) {
                    str4 = a.getRequestId();
                } else {
                    str4 = "";
                }
                jSONObject.put(str7, str4);
                jSONObject.put("is_direct", 1);
                jSONObject.put("page_status", "nonempty");
                jSONObject.put("trigger_reason", "friend_rec_message");
                String str8 = "rec_reason";
                if (a == null) {
                    str5 = "";
                } else {
                    str5 = a.getRecommendReason();
                }
                jSONObject.put(str8, str5);
                jSONObject.put("card_type", str);
                jSONObject.put("rec_user_type", C29650b.f77509a.getRecUserType(a));
                if ("others_homepage".equals(this.f84754h)) {
                    jSONObject.put("profile_uid", this.f84756j);
                }
                C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                C26890h.m65012a("follow_card", jSONObject);
            }
            return;
        }
        if ((vVar instanceof C32773t) && !this.f84746C) {
            ((C32773t) vVar).mo66303a();
            this.f84746C = true;
        }
    }

    /* renamed from: a */
    public final void mo65849a(User user) {
        int i;
        int i2;
        if (C32567c.m75343a((Collection<User>) this.f70670n, user)) {
            int g = m75312g();
            if (this.f84760z <= 0) {
                i = 0;
            } else {
                i = this.f84760z + 1;
            }
            int a = C32567c.m75341a(this.f70670n, user);
            if (a < this.f84760z) {
                i2 = g + 1 + 1 + a;
            } else {
                i2 = ((((g + 1) + i) + 1) + a) - Math.max(0, this.f84760z);
            }
            if (this.f84760z > 0) {
                if (i2 < m75312g() + 1 + this.f84760z + 1) {
                    this.f84760z--;
                    if (this.f84760z == 0) {
                        notifyItemRemoved(m75312g() + 1);
                    }
                }
            }
            C32567c.m75344b(this.f70670n, user);
            notifyItemRemoved(i2);
        }
        if (C32567c.m75343a((Collection<User>) this.f84759y, user)) {
            int a2 = C32567c.m75341a(this.f84759y, user);
            C32567c.m75344b(this.f84759y, user);
            if (a2 < 3) {
                notifyItemRemoved(a2 + 2);
                if (this.f84759y.size() >= 3) {
                    notifyItemInserted(4);
                }
            }
        }
    }

    public C32548v(Context context, boolean z) {
        this.f84758m = context;
        mo54792d(R.string.an1);
        this.f84744A = false;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C23748b(this.f84747a);
            case 1:
                return mo49730a_(viewGroup);
            case 2:
                Context context = viewGroup.getContext();
                HashMap<String, Boolean> hashMap = this.f84745B;
                boolean z = this.f84744A;
                C52711k.m112240b(context, "context");
                C52711k.m112240b(hashMap, "followClickMap");
                C32720aj ajVar = new C32720aj(context, hashMap, z);
                ajVar.setEnterFrom(this.f84754h);
                ajVar.setListener(this.f84753g);
                ajVar.setRecommendUserType(this.f84749c);
                ajVar.setRecommendAwemeClickListener(this.f84752f);
                return new C32728al(ajVar);
            case 3:
            case 4:
            case 5:
                return new C32730an(LayoutInflater.from(this.f84758m).inflate(R.layout.up, viewGroup, false));
            case 6:
                IRecommendContactItemView createRecommendContactItemView = C32616c.f84865a.createRecommendContactItemView(viewGroup.getContext());
                createRecommendContactItemView.setEnterFrom(this.f84754h);
                createRecommendContactItemView.setDislikeListener(new C52682m<RecommendContact, Integer, C52860x>() {
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        C32548v.this.f84753g.mo48614a(102, (RecommendContact) obj, ((Integer) obj2).intValue(), null, "");
                        return null;
                    }
                });
                return C32616c.f84865a.createRecommendContactViewHolder(createRecommendContactItemView);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        boolean z = false;
        switch (getItemViewType(i)) {
            case 0:
                return;
            case 1:
                if (vVar instanceof C26847b) {
                    ((C26847b) vVar).mo54794a();
                    return;
                }
                break;
            case 2:
                if (vVar instanceof C32728al) {
                    if (!this.f84759y.isEmpty()) {
                        int min = Math.min(this.f84759y.size(), 3) + 1;
                        if (2 <= i && i < min + 2) {
                            int i3 = i - 2;
                            ((C32728al) vVar).mo66320a((User) this.f84759y.get(i3), i3, false, this.f84749c);
                            break;
                        } else {
                            int c = m75310c(i - min);
                            if (m75309b(c)) {
                                if (this.f84760z > 0) {
                                    int i4 = min + 2;
                                    if (i < this.f84760z + i4 && i >= i4) {
                                        z = true;
                                    }
                                }
                                ((C32728al) vVar).mo66320a((User) this.f70670n.get(c), c, z, this.f84749c);
                                return;
                            }
                            return;
                        }
                    } else {
                        int c2 = m75310c(i);
                        if (m75309b(c2)) {
                            if ((this.f84760z <= 0 || i <= this.f84760z + 2) && this.f84760z > 0) {
                                z = true;
                            }
                            ((C32728al) vVar).mo66320a((User) this.f70670n.get(c2), c2, z, this.f84749c);
                            return;
                        }
                        return;
                    }
                }
                break;
            case 3:
                if (vVar instanceof C32730an) {
                    C32730an anVar = (C32730an) vVar;
                    anVar.mo66322a(true, this.f84749c, this.f84760z, false, "");
                    if (this.f84751e) {
                        anVar.mo66321a();
                    }
                    return;
                }
                break;
            case 4:
                if (vVar instanceof C32730an) {
                    ((C32730an) vVar).mo66322a(false, this.f84749c, this.f84760z, false, "");
                    return;
                }
                break;
            case 5:
                if (vVar instanceof C32730an) {
                    C32730an anVar2 = (C32730an) vVar;
                    anVar2.mo66322a(true, this.f84749c, this.f84760z, true, "");
                    if (this.f84751e) {
                        anVar2.mo66321a();
                    }
                    return;
                }
                break;
            case 6:
                if (vVar instanceof C32773t) {
                    if (this.f84760z > 0) {
                        z = true;
                    }
                    boolean z2 = !this.f84759y.isEmpty();
                    int min2 = Math.min(this.f84759y.size(), 3);
                    if (z2) {
                        i2 = (i - min2) - 1;
                    } else {
                        i2 = i;
                    }
                    if (z) {
                        i2 = (i2 - this.f84760z) - 1;
                    }
                    if (this.f84747a != null) {
                        i2--;
                    }
                    int i5 = i2 - 1;
                    if (m75309b(i5)) {
                        ((C32773t) vVar).mo66304a((RecommendContact) this.f70670n.get(i5), i);
                        break;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
