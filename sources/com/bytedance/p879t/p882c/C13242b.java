package com.bytedance.p879t.p882c;

import com.bytedance.p879t.p880a.C13230a;
import com.bytedance.p879t.p880a.C13231b;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52753d;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.t.c.b */
public final class C13242b {

    /* renamed from: com.bytedance.t.c.b$a */
    static final class C13243a extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        public static final C13243a f34495a = new C13243a();

        C13243a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112236a((Object) str, "it");
            if (str != null) {
                return C52830p.m112447b(str).toString();
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.bytedance.t.c.b$b */
    static final class C13244b extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C13244b f34496a = new C13244b();

        C13244b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            String str = (String) obj;
            C52711k.m112236a((Object) str, "it");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.t.c.b$c */
    static final class C13245c extends C52712l implements C52671b<Node, String> {

        /* renamed from: a */
        final /* synthetic */ XPath f34497a;

        C13245c(XPath xPath) {
            this.f34497a = xPath;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Node node = (Node) obj;
            C52711k.m112240b(node, "it");
            return this.f34497a.evaluate("./text()", node);
        }
    }

    /* renamed from: com.bytedance.t.c.b$d */
    static final class C13246d extends C52712l implements C52671b<String, C52785g<? extends Node>> {

        /* renamed from: a */
        final /* synthetic */ XPath f34498a;

        /* renamed from: b */
        final /* synthetic */ Object f34499b;

        C13246d(XPath xPath, Object obj) {
            this.f34498a = xPath;
            this.f34499b = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "expr");
            Object evaluate = this.f34498a.evaluate(str, this.f34499b, XPathConstants.NODESET);
            if (!(evaluate instanceof NodeList)) {
                evaluate = null;
            }
            final NodeList nodeList = (NodeList) evaluate;
            if (nodeList == null) {
                return C52786h.m112334a();
            }
            return C52786h.m112348d(C52575l.m112148k(C52753d.m112320b(0, nodeList.getLength())), new C52671b<Integer, Node>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    return nodeList.item(((Number) obj).intValue());
                }
            });
        }
    }

    /* renamed from: b */
    public static final Document m26637b(String str) throws C13231b {
        Closeable byteArrayInputStream;
        C52711k.m112240b(str, "$this$contentToDoc");
        try {
            byte[] bytes = str.getBytes(C52808d.f131043a);
            C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
            C52647c.m112189a(byteArrayInputStream, null);
            return parse;
        } catch (Throwable th) {
            throw new C13231b(th);
        }
    }

    /* renamed from: a */
    public static final Document m26635a(String str) throws C13230a, C13231b {
        C52711k.m112240b(str, "$this$uriToDoc");
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
        } catch (SAXException e) {
            throw new C13231b((Throwable) e);
        } catch (Throwable th) {
            throw new C13230a(str, th);
        }
    }

    /* renamed from: a */
    public static final C52785g<Node> m26632a(XPath xPath, Object obj, C52785g<String> gVar) {
        C52711k.m112240b(xPath, "$this$nodeList");
        C52711k.m112240b(obj, "item");
        C52711k.m112240b(gVar, "exprList");
        return C52786h.m112346c(gVar, new C13246d(xPath, obj));
    }

    /* renamed from: b */
    public static final String m26636b(XPath xPath, Object obj, C52785g<String> gVar) {
        C52711k.m112240b(xPath, "$this$firstString");
        C52711k.m112240b(obj, "item");
        C52711k.m112240b(gVar, "expr");
        return (String) C52786h.m112349d(m26630a(m26632a(xPath, obj, gVar), xPath, true, true));
    }

    /* renamed from: a */
    public static final C52785g<Node> m26633a(XPath xPath, Object obj, String... strArr) {
        C52711k.m112240b(xPath, "$this$nodeList");
        C52711k.m112240b(obj, "item");
        C52711k.m112240b(strArr, "exprList");
        return m26632a(xPath, obj, C52568f.m112089j(strArr));
    }

    /* renamed from: a */
    public static final String m26634a(XPath xPath, Object obj, String str) {
        C52711k.m112240b(xPath, "$this$firstString");
        C52711k.m112240b(obj, "item");
        C52711k.m112240b(str, "expr");
        return (String) C52786h.m112349d(m26630a(m26633a(xPath, obj, str), xPath, true, true));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C52785g<String> m26630a(C52785g<? extends Node> gVar, XPath xPath, boolean z, boolean z2) {
        C52711k.m112240b(gVar, "$this$mapText");
        C52711k.m112240b(xPath, "xpath");
        C52785g<String> d = C52786h.m112348d(gVar, new C13245c(xPath));
        if (z) {
            d = C52786h.m112348d(d, C13243a.f34495a);
        }
        if (z2) {
            return C52786h.m112340a((C52785g) d, (C52671b) C13244b.f34496a);
        }
        return d;
    }
}
