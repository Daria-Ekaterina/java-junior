package com.acme.edu;

import com.acme.edu.param.BaseParam;

public class Controller {
     Controller(BaseParam param, Object message){
        param.setCheckType(message);
    }
}
