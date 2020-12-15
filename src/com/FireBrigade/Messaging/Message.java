package com.FireBrigade.Messaging;

import com.FireBrigade.Alarming.ResponseCode;
import com.FireBrigade.Alarming.VFDUnit;

public class Message {

    public static void notifyVFDUnit(VFDUnit name, String notify)
    {
        ResponseCode result = ResponseCode.ERROR;

        result = name.notify(notify);

        if(result != ResponseCode.ERROR)
            System.out.println("OK");
        else
            System.out.println("Not OK");
    }

}
