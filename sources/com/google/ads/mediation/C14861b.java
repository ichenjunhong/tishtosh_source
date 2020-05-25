package com.google.ads.mediation;

import com.google.ads.mediation.C14871e;

/* renamed from: com.google.ads.mediation.b */
public interface C14861b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends C14871e> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
