package com.FireBrigade;

import com.FireBrigade.Alarming.VFDUnit;
import com.FireBrigade.Firefighters.Firefighter;
import com.FireBrigade.Messaging.Message;

public class Main {


    public static void main(String[] args) {
        VFDUnit osp1 = new VFDUnit("kr","TEST","ALARM");
        osp1.add(new Firefighter("Jan", "Kowalski", "111"));
        osp1.add(new Firefighter("Miłosz", "Nowak", "222"));

        VFDUnit osp2 = new VFDUnit("kr2","TEST", "ALARM");
        osp2.add(new Firefighter("Krzysztof", "Jarzyna", "333"));
        osp2.add(new Firefighter("Marcin", "Bolek", "444"));

        VFDUnit osp3 = new VFDUnit("kr3","TEST", "ALARM");
        osp3.add(new Firefighter("Mateusz", "Borek", "555"));
        osp3.add(new Firefighter("Tomasz", "Smokowski", "666"));

        Message.notifyVFDUnit(osp1, "ALARM");
        Message.notifyVFDUnit(osp2, "TEST");
        Message.notifyVFDUnit(osp3, "ERROR");
    }
}
