package org.apache.http.params;

public interface HttpParams {
    Object getParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z);

    HttpParams setIntParameter(String str, int i);

    HttpParams setParameter(String str, Object obj);
}
