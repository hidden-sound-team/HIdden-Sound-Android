package com.hiddensound.model;

/**
 * Created by amarques on 2/15/2017.
 */

public interface ModelInterface {

    void setTokenTime (long tokenTime);
    void setIMEI(String imei);
    void setQRMemo(String  qrMemo);
    void setAppName(String user);
    void setToken(String token);
    void setType(String type);
    HiddenModel create();
    HiddenModel create(HiddenModel hiddenModel);
    HiddenModel updateToken(HiddenModel hiddenModel);

    interface onModelCall{
        void setIMEI();
    }
}
