package com.bytedance.jirafast.p752ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatAutoCompleteTextView;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.models.C12051a;
import com.bytedance.jirafast.models.C12053c;
import com.bytedance.jirafast.models.C12056f;
import com.bytedance.jirafast.models.C12057g;
import com.bytedance.jirafast.models.JIRADevice;
import com.bytedance.jirafast.p748a.C11992a;
import com.bytedance.jirafast.p748a.C11994b;
import com.bytedance.jirafast.p751d.C12015a;
import com.bytedance.jirafast.p751d.C12016b;
import com.bytedance.jirafast.p751d.C12019c;
import com.bytedance.jirafast.p751d.C12025f;
import com.bytedance.jirafast.p751d.C12040j;
import com.bytedance.jirafast.p751d.C12049p;
import com.bytedance.jirafast.p752ui.C12100f.C12102a;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.C45331a;
import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.C45337c;
import com.zhihu.matisse.engine.impl.PicassoEngine;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jirafast.ui.a */
public final class C12066a extends Fragment implements C12102a {

    /* renamed from: A */
    public int f31914A = -1;

    /* renamed from: B */
    public int f31915B = -1;

    /* renamed from: C */
    public int f31916C = -1;

    /* renamed from: D */
    private List<String> f31917D;

    /* renamed from: E */
    private String f31918E;

    /* renamed from: F */
    private String f31919F;

    /* renamed from: G */
    private String f31920G;

    /* renamed from: H */
    private String f31921H;

    /* renamed from: I */
    private String f31922I;

    /* renamed from: J */
    private String f31923J;

    /* renamed from: K */
    private TextView f31924K;

    /* renamed from: L */
    private TextView f31925L;

    /* renamed from: M */
    private TextView f31926M;

    /* renamed from: N */
    private ImageButton f31927N;

    /* renamed from: O */
    private ImageButton f31928O;

    /* renamed from: P */
    private TextView f31929P;

    /* renamed from: Q */
    private RecyclerView f31930Q;

    /* renamed from: a */
    public List<String> f31931a;

    /* renamed from: b */
    public int f31932b = 3;

    /* renamed from: c */
    public TextView f31933c;

    /* renamed from: d */
    public ProgressDialog f31934d;

    /* renamed from: e */
    public AppCompatAutoCompleteTextView f31935e;

    /* renamed from: f */
    public AppCompatAutoCompleteTextView f31936f;

    /* renamed from: g */
    public TextView f31937g;

    /* renamed from: h */
    public TextView f31938h;

    /* renamed from: i */
    public TextView f31939i;

    /* renamed from: j */
    public EditText f31940j;

    /* renamed from: k */
    public EditText f31941k;

    /* renamed from: l */
    public EditText f31942l;

    /* renamed from: m */
    public C11992a f31943m;

    /* renamed from: n */
    List<C12051a> f31944n;

    /* renamed from: o */
    C11994b f31945o;

    /* renamed from: p */
    C11994b f31946p;

    /* renamed from: q */
    boolean[] f31947q;

    /* renamed from: r */
    List<String> f31948r = new ArrayList();

    /* renamed from: s */
    String[] f31949s;

    /* renamed from: t */
    List<String> f31950t;

    /* renamed from: u */
    String[] f31951u;

    /* renamed from: v */
    String f31952v;

    /* renamed from: w */
    String[] f31953w;

    /* renamed from: x */
    public List<String> f31954x;

    /* renamed from: y */
    public boolean f31955y;

    /* renamed from: z */
    AlertDialog f31956z;

    /* renamed from: com.bytedance.jirafast.ui.a$a */
    static class C12091a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private final WeakReference<C12066a> f31989a;

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            if (this.f31989a.get() != null) {
                ((C12066a) this.f31989a.get()).f31934d.setTitle(R.string.gns);
                ((C12066a) this.f31989a.get()).f31934d.setMessage("发送中...");
                ((C12066a) this.f31989a.get()).f31934d.show();
            }
        }

        public C12091a(C12066a aVar) {
            this.f31989a = new WeakReference<>(aVar);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f31989a.get() != null) {
                ((C12066a) this.f31989a.get()).f31934d.dismiss();
                Toast makeText = Toast.makeText(C11991a.m24390a(), str, 1);
                if (VERSION.SDK_INT == 25) {
                    C47905fy.m103630a(makeText);
                }
                makeText.show();
                C12015a.m24416a().mo22757a(C12015a.f31777r, true);
                if (str.contains("问题创建成功")) {
                    FragmentActivity activity = ((C12066a) this.f31989a.get()).getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            String str = "";
            if (this.f31989a.get() != null) {
                C12066a aVar = (C12066a) this.f31989a.get();
                C12015a.m24416a().mo22756a(C12015a.f31763d, aVar.f31937g.getText().toString());
                C12015a.m24416a().mo22756a(C12015a.f31764e, aVar.f31938h.getText().toString());
                C12015a.m24416a().mo22756a(C12015a.f31761b, aVar.f31939i.getText().toString());
                if (!aVar.f31955y) {
                    C12015a.m24416a().mo22756a(C12015a.f31765f, aVar.f31935e.getText().toString());
                    C12015a.m24416a().mo22756a(C12015a.f31766g, aVar.f31936f.getText().toString());
                }
                C12053c cVar = new C12053c(aVar.f31941k.getText().toString(), aVar.f31935e.getText().toString(), aVar.f31936f.getText().toString(), String.valueOf(aVar.f31932b), aVar.f31940j.getText().toString(), aVar.f31937g.getText().toString(), aVar.f31938h.getText().toString(), aVar.f31952v, aVar.f31942l.getText().toString(), aVar.f31948r);
                if (aVar.f31943m.getItemCount() > 0) {
                    cVar.f31870m = aVar.f31943m.f31722a;
                }
                if (aVar.f31931a != null) {
                    if (cVar.f31870m != null) {
                        cVar.f31870m.addAll(aVar.f31931a);
                    } else {
                        cVar.f31870m = aVar.f31931a;
                    }
                }
                str = C12016b.m24423a().mo22759a(cVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            return sb.toString();
        }
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public final void mo22845a() {
        C45337c a = C45331a.m98816a((Fragment) this).mo91622a(C45333b.ofImage()).mo91630a(true);
        a.f114621a.f114674k = false;
        C45337c b = a.mo91632b(true).mo91631b(9);
        b.f114621a.f114677n = getResources().getDimensionPixelSize(R.dimen.zv);
        b.mo91627a(0.85f).imageEngine(new PicassoEngine()).mo91634d(23);
    }

    /* renamed from: a */
    public final void mo22847a(final boolean z) {
        int i;
        int i2 = 0;
        if (this.f31953w == null || this.f31953w.length == 0) {
            C12092b.m24525a(Toast.makeText(getContext(), "版本数据正在加载", 0));
            return;
        }
        if (z && this.f31915B == -1) {
            String charSequence = this.f31938h.getText().toString();
            int i3 = 0;
            while (true) {
                if (i3 >= this.f31953w.length) {
                    break;
                } else if (this.f31953w[i3].equals(charSequence)) {
                    this.f31915B = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!z && this.f31916C == -1) {
            String charSequence2 = this.f31937g.getText().toString();
            while (true) {
                if (i2 >= this.f31953w.length) {
                    break;
                } else if (this.f31953w[i2].equals(charSequence2)) {
                    this.f31916C = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        Builder builder = new Builder(getContext(), 3);
        builder.setTitle("选择版本");
        String[] strArr = this.f31953w;
        if (z) {
            i = this.f31915B;
        } else {
            i = this.f31916C;
        }
        builder.setSingleChoiceItems(strArr, i, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    C12066a.this.f31915B = i;
                    C12066a.this.f31938h.setText(C12066a.this.f31953w[i]);
                    return;
                }
                C12066a.this.f31916C = i;
                C12066a.this.f31937g.setText(C12066a.this.f31953w[i]);
            }
        });
        builder.setPositiveButton("确定", new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.f31956z = builder.create();
        this.f31956z.show();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f31954x = arguments.getStringArrayList("Components");
        this.f31917D = arguments.getStringArrayList("imgfilepath");
        this.f31931a = arguments.getStringArrayList("txtfilepath");
        this.f31920G = arguments.getString("des");
        if (TextUtils.isEmpty(this.f31920G)) {
            this.f31920G = C12015a.m24416a().mo22755a(C12015a.f31773n);
        }
        this.f31921H = arguments.getString("title");
        if (TextUtils.isEmpty(this.f31921H)) {
            this.f31921H = C12015a.m24416a().mo22755a(C12015a.f31772m);
        }
        this.f31918E = arguments.getString("momorydes");
        this.f31919F = arguments.getString("sddes");
        this.f31922I = arguments.getString("Assignee");
        if (TextUtils.isEmpty(this.f31922I)) {
            this.f31922I = C12015a.m24416a().mo22755a(C12015a.f31765f);
        }
        this.f31923J = arguments.getString("Reporter");
        if (TextUtils.isEmpty(this.f31923J)) {
            this.f31923J = C12015a.m24416a().mo22755a(C12015a.f31766g);
        }
        this.f31955y = arguments.getBoolean("isFromLeakCanary");
    }

    /* renamed from: a */
    public final void mo22846a(String str, int i) {
        this.f31924K.setText(str);
        this.f31932b = i;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 24) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                C12092b.m24525a(Toast.makeText(getContext(), "未能获取权限", 0));
            } else {
                mo22845a();
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 23) {
            List b = C45331a.m98819b(intent);
            if (!b.isEmpty()) {
                this.f31930Q.setVisibility(0);
                this.f31943m.mo22726a(b);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.bj9, viewGroup, false);
        this.f31945o = new C11994b(getContext(), R.layout.bjc);
        this.f31935e = (AppCompatAutoCompleteTextView) inflate.findViewById(R.id.egf);
        this.f31935e.setText(this.f31922I);
        this.f31935e.setAdapter(this.f31945o);
        this.f31946p = new C11994b(getContext(), R.layout.bjc);
        this.f31936f = (AppCompatAutoCompleteTextView) inflate.findViewById(R.id.ehf);
        this.f31936f.setText(this.f31923J);
        this.f31936f.setAdapter(this.f31946p);
        this.f31933c = (TextView) inflate.findViewById(R.id.egu);
        this.f31937g = (TextView) inflate.findViewById(R.id.egc);
        this.f31938h = (TextView) inflate.findViewById(R.id.egv);
        StringBuilder sb = new StringBuilder();
        sb.append(C12015a.m24416a().mo22755a(C12015a.f31778s));
        sb.append(" ");
        sb.append(C12015a.m24416a().mo22755a(C12015a.f31779t));
        String trim = sb.toString().trim();
        TextView textView = this.f31937g;
        if (this.f31955y) {
            str = trim;
        } else {
            C12015a a = C12015a.m24416a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.mo22755a(C12015a.f31763d));
            String trim2 = sb2.toString().trim();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a.mo22755a(C12015a.f31778s));
            sb3.append(" ");
            sb3.append(a.mo22755a(C12015a.f31779t));
            str = sb3.toString().trim();
            if (!TextUtils.isEmpty(trim2) && str.compareToIgnoreCase(trim2) <= 0) {
                str = trim2;
            }
        }
        textView.setText(str);
        TextView textView2 = this.f31938h;
        if (!this.f31955y) {
            C12015a a2 = C12015a.m24416a();
            String a3 = a2.mo22755a(C12015a.f31764e);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a2.mo22755a(C12015a.f31778s));
            sb4.append(" ");
            sb4.append(a2.mo22755a(C12015a.f31779t));
            trim = sb4.toString();
            if (!TextUtils.isEmpty(a3) && trim.compareToIgnoreCase(a3) <= 0) {
                trim = a3;
            }
        }
        textView2.setText(trim);
        this.f31939i = (TextView) inflate.findViewById(R.id.egl);
        this.f31940j = (EditText) inflate.findViewById(R.id.egz);
        this.f31941k = (EditText) inflate.findViewById(R.id.ehj);
        this.f31942l = (EditText) inflate.findViewById(R.id.egr);
        if (this.f31920G == null) {
            this.f31920G = "";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f31920G);
        sb5.append("\n");
        this.f31920G = sb5.toString();
        JIRADevice a4 = C12019c.m24430a(C11991a.m24390a());
        String str2 = this.f31920G;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(System.getProperty("line.separator"));
        sb6.append("------ App Info ------");
        sb6.append(System.getProperty("line.separator"));
        sb6.append(a4.toString());
        sb6.append("\n\n网络状态：");
        sb6.append(C12040j.m24494a(getContext()));
        sb6.append("\n\n");
        sb6.append(this.f31918E);
        sb6.append("\n");
        sb6.append(this.f31919F);
        this.f31920G = str2.concat(sb6.toString());
        this.f31942l.setText(this.f31920G);
        this.f31930Q = (RecyclerView) inflate.findViewById(R.id.egj);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo4731b(0);
        this.f31930Q.setLayoutManager(linearLayoutManager);
        this.f31943m = new C11992a();
        this.f31930Q.setAdapter(this.f31943m);
        this.f31925L = (TextView) inflate.findViewById(R.id.egm);
        this.f31924K = (TextView) inflate.findViewById(R.id.eha);
        this.f31924K.setText(getString(R.string.go4));
        this.f31926M = (TextView) inflate.findViewById(R.id.egp);
        this.f31934d = new ProgressDialog(getContext());
        this.f31928O = (ImageButton) inflate.findViewById(R.id.egy);
        this.f31927N = (ImageButton) inflate.findViewById(R.id.ego);
        this.f31929P = (TextView) inflate.findViewById(R.id.eh1);
        this.f31941k.setText(this.f31921H);
        if (this.f31917D != null && this.f31917D.size() > 0) {
            this.f31930Q.setVisibility(0);
            this.f31943m.mo22726a(this.f31917D);
        }
        ((TextView) inflate.findViewById(R.id.ehc)).setText(Html.fromHtml(getString(R.string.go8)));
        ((TextView) inflate.findViewById(R.id.egx)).setText(Html.fromHtml(getString(R.string.gnw)));
        ((TextView) inflate.findViewById(R.id.ege)).setText(Html.fromHtml(getString(R.string.gni)));
        ((TextView) inflate.findViewById(R.id.ehi)).setText(Html.fromHtml(getString(R.string.gob)));
        this.f31939i.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12066a aVar = C12066a.this;
                if (aVar.f31949s == null || aVar.f31949s.length == 0) {
                    C12092b.m24525a(Toast.makeText(aVar.getContext(), "模块数据正在加载", 0));
                    return;
                }
                Builder builder = new Builder(aVar.getContext(), 3);
                builder.setTitle("选择模块");
                builder.setMultiChoiceItems(aVar.f31949s, aVar.f31947q, new OnMultiChoiceClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                        C12066a.this.f31947q[i] = z;
                        if (z) {
                            C12066a.this.f31948r.add(C12066a.this.f31949s[i]);
                            if (!C12066a.this.f31950t.contains(C12066a.this.f31949s[i])) {
                                C12066a.this.f31950t.add(C12066a.this.f31949s[i]);
                            }
                            if (C12066a.this.f31950t.size() > 15) {
                                C12066a.this.f31950t.remove(0);
                            }
                            C12049p.m24508a(new Runnable() {
                                public final void run() {
                                    C12015a.m24416a();
                                    String str = C12015a.f31761b;
                                    List<String> list = C12066a.this.f31950t;
                                    StringBuilder sb = new StringBuilder("jiracaceh_str_");
                                    sb.append(str);
                                    C12025f.m24442b(sb.toString(), list);
                                }
                            });
                        } else {
                            C12066a.this.f31948r.remove(C12066a.this.f31949s[i]);
                        }
                        String str = "";
                        for (int i2 = 0; i2 < C12066a.this.f31948r.size(); i2++) {
                            if (i2 == C12066a.this.f31948r.size() - 1) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append((String) C12066a.this.f31948r.get(i2));
                                str = sb.toString();
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append((String) C12066a.this.f31948r.get(i2));
                                sb2.append(",");
                                str = sb2.toString();
                            }
                        }
                        C12066a.this.f31939i.setText(str);
                    }
                });
                builder.setPositiveButton("确定", new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                aVar.f31956z = builder.create();
                aVar.f31956z.show();
            }
        });
        this.f31926M.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                new C12091a(C12066a.this).execute(new Void[0]);
            }
        });
        this.f31935e.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C12066a.this.f31945o.f31726b != null) {
                    final List<C12056f> list = C12066a.this.f31945o.f31726b;
                    if (!list.contains(C12066a.this.f31945o.getItem(i))) {
                        list.add(0, C12066a.this.f31945o.getItem(i));
                        if (list.size() > 20) {
                            list.remove(list.size() - 1);
                        }
                        C12049p.m24508a(new Runnable() {
                            public final void run() {
                                C12015a.m24416a();
                                C12015a.m24417a(C12015a.f31765f, list);
                            }
                        });
                    }
                }
            }
        });
        this.f31933c.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12066a aVar = C12066a.this;
                if (aVar.f31944n == null || aVar.f31944n.size() == 0) {
                    C12092b.m24525a(Toast.makeText(aVar.getContext(), "Epic Link数据正在加载", 0));
                    return;
                }
                Builder builder = new Builder(aVar.getContext(), 3);
                builder.setTitle("选择Epic Link");
                builder.setSingleChoiceItems(aVar.f31951u, aVar.f31914A, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C12066a.this.f31914A = i;
                        C12066a.this.f31952v = ((C12051a) C12066a.this.f31944n.get(i)).getKey();
                        C12066a.this.f31933c.setText(((C12051a) C12066a.this.f31944n.get(i)).getName());
                    }
                });
                builder.setPositiveButton("确定", new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                aVar.f31956z = builder.create();
                aVar.f31956z.show();
            }
        });
        this.f31936f.setOnItemClickListener(new OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C12066a.this.f31946p.f31726b != null) {
                    final List<C12056f> list = C12066a.this.f31946p.f31726b;
                    if (!list.contains(C12066a.this.f31946p.getItem(i))) {
                        list.add(0, C12066a.this.f31946p.getItem(i));
                        if (list.size() > 20) {
                            list.remove(list.size() - 1);
                        }
                        C12049p.m24508a(new Runnable() {
                            public final void run() {
                                C12015a.m24416a();
                                C12015a.m24417a(C12015a.f31766g, list);
                            }
                        });
                    }
                }
            }
        });
        this.f31925L.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12066a.this.getActivity().onBackPressed();
            }
        });
        this.f31928O.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
            }
        });
        this.f31937g.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12066a.this.mo22847a(false);
            }
        });
        this.f31938h.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12066a.this.mo22847a(true);
            }
        });
        this.f31924K.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C12100f fVar = new C12100f(C12066a.this.getActivity());
                fVar.f32034f = C12066a.this;
                fVar.show();
            }
        });
        this.f31927N.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (C0726c.m2090a((Context) C12066a.this.getActivity(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    C0636b.m1718a(C12066a.this.getActivity(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 24);
                    return;
                }
                C12066a.this.mo22845a();
            }
        });
        C12049p.m24508a(new Runnable() {
            public final void run() {
                C12015a.m24416a();
                final List b = C12015a.m24418b(C12015a.f31765f);
                C12015a.m24416a();
                final List b2 = C12015a.m24418b(C12015a.f31766g);
                final List c = C12016b.m24423a().mo22763c();
                final List b3 = C12016b.m24423a().mo22762b();
                C12016b a = C12016b.m24423a();
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(a.mo22761b("Android--"));
                arrayList.addAll(a.mo22761b("server--"));
                C120841 r1 = new Runnable() {
                    public final void run() {
                        C12066a.this.f31945o.f31726b = b;
                        C12066a.this.f31946p.f31726b = b2;
                        if (C12066a.this.f31954x != null && C12066a.this.f31954x.size() > 0) {
                            C12066a.this.f31950t = C12066a.this.f31954x;
                        } else if (C12066a.this.f31947q == null) {
                            C12066a aVar = C12066a.this;
                            C12015a.m24416a();
                            String str = C12015a.f31761b;
                            StringBuilder sb = new StringBuilder("jiracaceh_str_");
                            sb.append(str);
                            aVar.f31950t = C12025f.m24439a(sb.toString());
                        }
                        if (b3 == null || b3.size() <= 0) {
                            C12066a.this.f31949s = null;
                            C12066a.this.f31947q = null;
                        } else {
                            C12066a.this.f31947q = new boolean[b3.size()];
                            C12066a.this.f31949s = new String[b3.size()];
                            for (String str2 : C12066a.this.f31950t) {
                                int indexOf = b3.indexOf(str2);
                                if (C12066a.this.f31954x == null || C12066a.this.f31954x.size() <= 0) {
                                    if (indexOf > 0) {
                                        b3.remove(indexOf);
                                        b3.add(0, str2);
                                    }
                                } else if (indexOf >= 0) {
                                    C12066a.this.f31947q[indexOf] = true;
                                    C12066a.this.f31948r.add(str2);
                                }
                            }
                            for (int i = 0; i < b3.size(); i++) {
                                C12066a.this.f31949s[i] = (String) b3.get(i);
                            }
                            if (C12066a.this.f31948r.size() > 0) {
                                C12049p.m24509b(new Runnable() {
                                    public final void run() {
                                        String str = "";
                                        for (int i = 0; i < C12066a.this.f31948r.size(); i++) {
                                            if (i == C12066a.this.f31948r.size() - 1) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str);
                                                sb.append((String) C12066a.this.f31948r.get(i));
                                                str = sb.toString();
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str);
                                                sb2.append((String) C12066a.this.f31948r.get(i));
                                                sb2.append(",");
                                                str = sb2.toString();
                                            }
                                        }
                                        C12066a.this.f31939i.setText(str);
                                    }
                                });
                            }
                        }
                        if (arrayList == null || arrayList.size() <= 0) {
                            C12066a.this.f31951u = null;
                            C12066a.this.f31944n = null;
                        } else {
                            C12066a.this.f31944n = arrayList;
                            C12066a.this.f31951u = new String[arrayList.size()];
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                C12066a.this.f31951u[i2] = ((C12051a) arrayList.get(i2)).getName();
                            }
                        }
                        if (c == null || c.size() <= 0) {
                            C12066a.this.f31953w = null;
                            return;
                        }
                        C12066a.this.f31953w = new String[c.size()];
                        for (int i3 = 0; i3 < c.size(); i3++) {
                            C12066a.this.f31953w[i3] = ((C12057g) c.get(i3)).getName();
                        }
                    }
                };
                C12049p.m24509b(r1);
            }
        });
        this.f31942l.post(new Runnable() {
            public final void run() {
                C12066a.this.f31942l.setFocusable(true);
                C12066a.this.f31942l.setFocusableInTouchMode(true);
                C12066a.this.f31942l.requestFocus();
            }
        });
        if (this.f31955y) {
            this.f31941k.setEnabled(false);
        }
        return inflate;
    }
}
