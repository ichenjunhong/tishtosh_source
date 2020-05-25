package com.p683ss.android.ugc.aweme.anchor;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25632i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseActivity */
public class AnchorBaseActivity extends AmeSSActivity implements C22678i {

    /* renamed from: a */
    private ImmersionBar f60717a;

    /* renamed from: b */
    private C22640c f60718b;

    /* renamed from: c */
    private C22655d f60719c;

    /* renamed from: d */
    private C22670f f60720d;

    /* renamed from: e */
    private String f60721e;

    /* renamed from: f */
    private String f60722f;

    /* renamed from: g */
    private HashMap f60723g;

    /* renamed from: a */
    private View m55770a(int i) {
        if (this.f60723g == null) {
            this.f60723g = new HashMap();
        }
        View view = (View) this.f60723g.get(Integer.valueOf(R.id.csm));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.csm);
        this.f60723g.put(Integer.valueOf(R.id.csm), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public final void mo46970e() {
        finish();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final String mo46964a() {
        String str = this.f60721e;
        if (str == null) {
            C52711k.m112237a("shootWay");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo46967b() {
        String str = this.f60722f;
        if (str == null) {
            C52711k.m112237a("creationId");
        }
        return str;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.f3, R.anim.f4);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f60717a;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        if (C47718bf.m103292e(this)) {
            C47718bf.m103291d(this);
        }
    }

    public void onBackPressed() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.mo2237e() == 0) {
            super.onBackPressed();
            return;
        }
        C22640c cVar = this.f60718b;
        if (cVar != null && cVar.isVisible()) {
            C22640c cVar2 = this.f60718b;
            if (cVar2 != null && cVar2.f60812d) {
                C22640c cVar3 = this.f60718b;
                if (cVar3 != null) {
                    cVar3.mo47007a(false);
                    return;
                }
                return;
            }
        }
        getSupportFragmentManager().mo2235c();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", true);
        super.onResume();
        this.f60717a = ImmersionBar.with((Activity) this).statusBarDarkFont(true);
        ImmersionBar immersionBar = this.f60717a;
        if (immersionBar != null) {
            immersionBar.init();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", false);
    }

    /* renamed from: c */
    public final void mo46968c() {
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        if (this.f60719c == null) {
            this.f60719c = new C22655d();
        }
        C22655d dVar = this.f60719c;
        if (dVar != null) {
            if (!dVar.isAdded()) {
                a.mo2175a((int) R.id.e9u, (Fragment) dVar);
            }
            C22670f fVar = this.f60720d;
            if (fVar != null) {
                a.mo2196c(dVar);
                a.mo2193b(fVar);
                a.mo2179a((String) null);
                a.mo2195c();
            }
        }
    }

    /* renamed from: d */
    public final void mo46969d() {
        Object obj;
        boolean z;
        C22670f fVar = this.f60720d;
        if (fVar != null) {
            C22599b bVar = fVar.f60849d;
            if (bVar != null) {
                C22674g gVar = (C22674g) bVar.f70700f;
                Iterator it = gVar.f60859b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Integer num = ((C22598a) obj).f60747a;
                    if (num != null && num.intValue() == 2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C22598a aVar = (C22598a) obj;
                if (aVar != null) {
                    ArrayList<AnchorCell> arrayList = aVar.f60751e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                C52847n a = gVar.mo47050a();
                gVar.f60858a.subList(((Number) a.getFirst()).intValue(), ((Number) a.getSecond()).intValue()).clear();
                ((C22677h) bVar.f70701g).mo47044b(((C22674g) bVar.f70700f).mo47051b());
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void finishCommandFromMiniApp(C25632i iVar) {
        C52711k.m112240b(iVar, "event");
        if (iVar.f67851a) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo46966a(ArrayList<AnchorCell> arrayList) {
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        if (this.f60718b == null) {
            this.f60718b = new C22640c();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("recently_add", arrayList);
            C22640c cVar = this.f60718b;
            if (cVar != null) {
                cVar.setArguments(bundle);
            }
        }
        C22640c cVar2 = this.f60718b;
        if (cVar2 != null) {
            if (!cVar2.isAdded()) {
                a.mo2175a((int) R.id.e9u, (Fragment) cVar2);
            }
            C22670f fVar = this.f60720d;
            if (fVar != null) {
                a.mo2196c(cVar2);
                a.mo2193b(fVar);
                a.mo2179a((String) null);
                a.mo2195c();
            }
        }
    }

    /* renamed from: a */
    public final void mo46965a(AnchorCell anchorCell) {
        List list;
        Object obj;
        boolean z;
        C52711k.m112240b(anchorCell, "cell");
        C22670f fVar = this.f60720d;
        if (fVar != null) {
            C52711k.m112240b(anchorCell, "cell");
            C22599b bVar = fVar.f60849d;
            if (bVar != null) {
                C22674g gVar = (C22674g) bVar.f70700f;
                C52711k.m112240b(anchorCell, "item");
                gVar.f60858a.indexOf(anchorCell);
                Iterator it = gVar.f60859b.iterator();
                while (true) {
                    list = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Integer num = ((C22598a) obj).f60747a;
                    if (num != null && num.intValue() == 2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C22598a aVar = (C22598a) obj;
                if (aVar != null) {
                    ArrayList<AnchorCell> arrayList = aVar.f60751e;
                    if (arrayList != null) {
                        Collection collection = arrayList;
                        if (collection != null) {
                            C52731z.m112266b(collection).remove(anchorCell);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                        }
                    }
                }
                C52847n a = gVar.mo47050a();
                gVar.f60858a.subList(((Number) a.getFirst()).intValue() + 1, ((Number) a.getSecond()).intValue()).clear();
                List<Object> list2 = gVar.f60858a;
                int intValue = ((Number) a.getFirst()).intValue() + 1;
                if (aVar != null) {
                    ArrayList<AnchorCell> arrayList2 = aVar.f60751e;
                    if (arrayList2 != null) {
                        list = C52575l.m112129b((Iterable<? extends T>) arrayList2, 3);
                    }
                }
                if (list == null) {
                    list = C52575l.m112097a();
                }
                list2.addAll(intValue, list);
                ((C22677h) bVar.f70701g).mo47044b(((C22674g) bVar.f70700f).mo47051b());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.awz);
        Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
        if (!(serializableExtra instanceof C25600a)) {
            serializableExtra = null;
        }
        C25600a aVar = (C25600a) serializableExtra;
        if (aVar == null) {
            aVar = C25600a.NO_TYPE;
        }
        C52711k.m112240b(aVar, "<set-?>");
        C22583a.f60724b = aVar;
        String stringExtra = getIntent().getStringExtra("shoot_way");
        C52711k.m112236a((Object) stringExtra, "intent.getStringExtra(GameAnchorUtils.SHOOT_WAY)");
        this.f60721e = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("creation_id");
        C52711k.m112236a((Object) stringExtra2, "intent.getStringExtra(GameAnchorUtils.CREATION_ID)");
        this.f60722f = stringExtra2;
        View a = m55770a((int) R.id.csm);
        C52711k.m112236a((Object) a, "status_bar");
        LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = C20141b.m49701c(this);
        View a2 = m55770a((int) R.id.csm);
        C52711k.m112236a((Object) a2, "status_bar");
        a2.setLayoutParams(layoutParams);
        C47718bf.m103290c(this);
        C0679r a3 = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a3, "supportFragmentManager.beginTransaction()");
        if (this.f60720d == null) {
            this.f60720d = new C22670f();
        }
        C22670f fVar = this.f60720d;
        if (fVar != null) {
            a3.mo2175a((int) R.id.e9u, (Fragment) fVar);
            a3.mo2195c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", false);
    }
}
