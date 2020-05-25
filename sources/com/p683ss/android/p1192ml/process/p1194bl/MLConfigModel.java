package com.p683ss.android.p1192ml.process.p1194bl;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.MLConfigModel */
public class MLConfigModel {
    public static final String MODEL_TYPE_JPMML = "pmml";
    public static final String MODEL_TYPE_TF = "tf";
    @C17952c(mo34828a = "output")
    public AfOPModel afOPModel;
    @C17952c(mo34828a = "enable_gpu")
    public boolean enableGPU;
    @C17952c(mo34828a = "enable_nn_api")
    public boolean enableNNApi;
    @C17952c(mo34828a = "feature_list")
    public List<String> inputFeatureList;
    @C17952c(mo34828a = "input_type")
    public String inputType;
    @C17952c(mo34828a = "model_type")
    public String modelType;
    @C17952c(mo34828a = "num_threads")
    public int numThreads;
    @C17952c(mo34828a = "intput")
    public List<PreOPModel> preOPModelList;
}
